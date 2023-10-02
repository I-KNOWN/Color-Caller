package com.themecolor.callerphone.wallpaper.fragments

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.themecolor.callerphone.wallpaper.EnableKeyboard
import com.themecolor.callerphone.wallpaper.MainActivity
import com.themecolor.callerphone.wallpaper.R
import com.themecolor.callerphone.wallpaper.apputils.shareApp
import com.themecolor.callerphone.wallpaper.databinding.FragmentMainSettingsBinding
import com.themecolor.callerphone.wallpaper.ui.PrivacyActivity
import keyboard.neon.newboard.util.checkIfImeIsSelected

class SettingsMainFragment : BaseFragment() {

    private lateinit var myActivity: MainActivity
    private lateinit var binding: FragmentMainSettingsBinding

    override fun onAttach(context: Context) {
        super.onAttach(context)
        myActivity = context as MainActivity
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainSettingsBinding.inflate(inflater, container, false)


        // load pref settings fragment
        loadChildFragment(NeonKeyboardSettingsFragment(), binding.settingsPrefContainer.id)


        with(binding)
        {
            enableDisableKbSetting.setOnClickListener {
                startActivity(Intent(myActivity, EnableKeyboard::class.java))
            }
            shareSettings.setOnClickListener {

                myActivity.shareApp()
            }
         /*   rateUsSettings.setOnClickListener {


                val dialog = RatingDialog()
                dialog.show(myActivity.supportFragmentManager, "ratingDialog")



            }

            feedBackSetting.setOnClickListener {

                myActivity.sendEmail()
            }
*/
            privacySettings.setOnClickListener {

                startActivity(Intent(myActivity, PrivacyActivity::class.java))
            }
        }


        return binding.root
    }



    override fun onResume() {
        super.onResume()
        if (checkIfImeIsSelected(myActivity))
            binding.appCompatImageView.setImageResource(R.drawable.ic_settings_enabled_keyboard)
        else
            binding.appCompatImageView.setImageResource(R.drawable.ic_setting_enabledisable)
    }
}