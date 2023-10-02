package com.themecolor.callerphone.wallpaper
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.WindowManager
import androidx.core.view.isVisible
import com.themecolor.callerphone.wallpaper.databinding.TestkeyboardLayoutBinding
import com.themecolor.callerphone.wallpaper.models.ThemesModel
import com.themecolor.callerphone.wallpaper.viewmodel.FavViewModel
import keyboard.neon.newboard.util.showToast
import org.koin.androidx.viewmodel.ext.android.viewModel

class TestKeyboardActivity : BaseActivity() {


    private val favViewModel: FavViewModel by viewModel()
    private val testKeyboardBinding: TestkeyboardLayoutBinding by lazy {
        TestkeyboardLayoutBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(testKeyboardBinding.root)
        setSupportActionBar(testKeyboardBinding.toolbar)
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT
        val background: Drawable = resources.getDrawable(R.drawable.status_gradient)
        window.setBackgroundDrawable(background)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setDisplayShowHomeEnabled(true)

        testKeyboardBinding.testKeyboardEt.requestFocus()
        openKeyboard(testKeyboardBinding.testKeyboardEt)


        val themesModel = intent.getSerializableExtra("themeModel") as ThemesModel
        themesModel.id = 0
        themesModel.date = System.currentTimeMillis()


        favViewModel.themesRepo.checkIfThemeExist(themesModel.themeId) {

            testKeyboardBinding.adToFavBtn.isVisible = !it
        }


        with(testKeyboardBinding)
        {
            adToFavBtn.setOnClickListener {
                favViewModel.adThemeToFav(themesModel) {
                    runOnUiThread {
                        when (it) {

                            true -> {
                                showToast("Theme added to favourite")
                                adToFavBtn.text = "Theme is favourite"
                            }
                            else -> showToast("This theme is already exist in favourite")
                        }
                    }

                }


            }
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()

    }

    override fun onResume() {
        super.onResume()
    }


    override fun onDestroy() {
        super.onDestroy()

    }
}