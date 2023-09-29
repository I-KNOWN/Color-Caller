package com.uprisingscallscreen.theme.flashscreen.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

import com.uprisingscallscreen.theme.flashscreen.MainActivity
import com.uprisingscallscreen.theme.flashscreen.TestKeyboardActivity
import com.uprisingscallscreen.theme.flashscreen.adapter.AllThemesAdapter
import com.uprisingscallscreen.theme.flashscreen.adapter.WrapStaggeredGridLayoutManager
import com.uprisingscallscreen.theme.flashscreen.apputils.ConstValues
import com.uprisingscallscreen.theme.flashscreen.apputils.ConstValues.fullScreenAdShowCount
import com.uprisingscallscreen.theme.flashscreen.databinding.ThemesLayoutBinding
import com.uprisingscallscreen.theme.flashscreen.keyboardutils.editPrefs
import com.uprisingscallscreen.theme.flashscreen.keyboardutils.getMyPreferences
import com.uprisingscallscreen.theme.flashscreen.models.ThemesModel
import keyboard.neon.newboard.util.checkIfImeIsEnabled
import keyboard.neon.newboard.util.checkIfImeIsSelected
import timber.log.Timber

class ThemesFragment : BaseFragment() {
    private lateinit var myActivity: MainActivity
    private lateinit var themeBinding: ThemesLayoutBinding
    private var themeAdCount = 0

    private val allThemesAdapter = AllThemesAdapter { themes ->
        themesAdapterClick(themes)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity
    }


    private fun themesAdapterClick(
        theme: ThemesModel
    ) {

        if (checkIfImeIsEnabled(myActivity)) {

            if (checkIfImeIsSelected(myActivity)) {


                val setTheme = "assets:ime/theme/${theme.themeJsonName}.json"
                keyboardPrefs.theme.dayThemeRef = setTheme

                val oldFavThemeId =
                    myActivity.getMyPreferences().getInt(ConstValues.prefKeyFavThemeItem, -10)


                Timber.d("simple theme  old fav pref  value : $oldFavThemeId")

                themesViewModel.handleFavSelection?.invoke(oldFavThemeId, theme.themeId)


                themesViewModel.toggleThemeStatus(theme.themeId, true)

                val neonId = myActivity.getMyPreferences().getInt(ConstValues.prefKeyNeonItem, 0)
                themesViewModel.unSelectNeonTheme?.invoke(neonId)

                myActivity.getMyPreferences().editPrefs {
                    putInt(ConstValues.prefKeyThemeItem, theme.themeId)
                    putInt(ConstValues.prefKeyFavThemeItem, theme.themeId)
                    putInt(ConstValues.prefKeyNeonItem, 0)

                }



                if (themeAdCount == fullScreenAdShowCount) {
                    themeAdCount = 0
                    showFullScreenAdThemeClick(theme)
                } else {
                    themeAdCount++
                    startActivity(
                        Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                            "themeModel",
                            theme
                        )
                    )

                }


            } else {
                showEnableKbBottomSheet(
                    myActivity, "Select the Keyboard First and \n" +
                            " Apply Themes."
                )
            }
        } else {
            showEnableKbBottomSheet(
                myActivity, "Enable the Keyboard  and \n" +
                        " Apply Themes. "
            )
        }


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        themeBinding = ThemesLayoutBinding.inflate(inflater, container, false)
        themeBinding.allThemesRv.apply {

            layoutManager = WrapStaggeredGridLayoutManager(2, RecyclerView.VERTICAL)
            adapter = allThemesAdapter
            setHasFixedSize(true)
        }




        themesViewModel.keyBoardThemesListLiveData.observe(viewLifecycleOwner) {


            allThemesAdapter.submitList(it)

            val selectItem = myActivity.getMyPreferences().getInt(ConstValues.prefKeyThemeItem, 1)
            themesViewModel.toggleThemeStatus(selectItem, true)

        }


        themesViewModel.unSelectTheme = {

            themesViewModel.toggleThemeStatus(it, false)
        }

        themesViewModel.changeFavTheme = { themeId ->
            themesViewModel.toggleThemeStatus(themeId, true)
        }


        return themeBinding.root
    }


    private fun showFullScreenAdThemeClick(theme: ThemesModel) {
        if (isInternetConnected()) {

//            fullScreenAd.loadInterstitialThemeAd(loaded = {
//
//                when (it) {
//                    true -> {
//
//                        adLoadingBox?.closeDialog()
//                        fullScreenAd.showThemesInterstitial(myActivity) {

            startActivity(
                Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                    "themeModel",
                    theme
                )
            )

//                        }
//
//                    }
//                    else -> {
//                        adLoadingBox?.closeDialog()
//                        startActivity(
//                            Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
//                                "themeModel",
//                                theme
//                            )
//                        )
//
//
//                    }
//                }
//
//
//            }, showLoader = {
//                adLoadingBox?.showDialog()
//
//            })

        } else {
            startActivity(
                Intent(myActivity, TestKeyboardActivity::class.java).putExtra(
                    "themeModel",
                    theme
                )
            )
        }

    }


}