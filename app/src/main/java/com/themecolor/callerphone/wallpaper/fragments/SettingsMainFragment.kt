package com.themecolor.callerphone.wallpaper.fragments

import android.Manifest
import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.content.pm.PackageManager
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
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
    private lateinit var sharePref: SharedPreferences
    private var isFlash: Boolean = false;
    private var REQUEST_CAMERA_PERMISSION = 111;
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

        sharePref = requireActivity().getSharedPreferences("Flash", Context.MODE_PRIVATE)
        isFlash = sharePref.getBoolean("isFlash", false)
        binding.simpleSwitch.isChecked = isFlash

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

            simpleSwitch.setOnClickListener {


                toggleFlashlight();


//                simpleSwitch.isChecked = !simpleSwitch.isChecked
            }
            privacySettings.setOnClickListener {

                startActivity(Intent(myActivity, PrivacyActivity::class.java))
            }
        }


        return binding.root
    }

    private fun toggleFlashlight() {
        val editor:SharedPreferences.Editor =  sharePref.edit()

        if(binding.simpleSwitch.isChecked){
            editor.putBoolean("isFlash",true)
            editor.apply()
            editor.commit()
        }else{
            editor.putBoolean("isFlash",false)
            editor.apply()
            editor.commit()
        }
    }


    override fun onRequestPermissionsResult(
        requestCode: Int,
        permissions: Array<out String>,
        grantResults: IntArray
    ) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == REQUEST_CAMERA_PERMISSION) {
            if (grantResults.size > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                toggleFlashlight();
            } else {
                Toast.makeText(requireContext(), "Permission Must Be Granted", Toast.LENGTH_LONG).show()
            }
        }
    }



    override fun onResume() {
        super.onResume()
        if (checkIfImeIsSelected(myActivity))
            binding.appCompatImageView.setImageResource(R.drawable.ic_settings_enabled_keyboard)
        else
            binding.appCompatImageView.setImageResource(R.drawable.ic_setting_enabledisable)
    }
}