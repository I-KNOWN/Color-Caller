package com.themecolor.callerphone.wallpaper

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.os.Bundle
import android.view.Gravity
import android.view.Menu
import android.view.WindowManager
import androidx.fragment.app.Fragment
import com.adsmodule.api.adsModule.AdUtils
import com.adsmodule.api.adsModule.utils.Constants
import com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds.activity
import com.themecolor.callerphone.wallpaper.callertheme.FavouriteActivity
import com.themecolor.callerphone.wallpaper.callertheme.dialer.DialerActivity
import com.themecolor.callerphone.wallpaper.databinding.ActivityMainBinding
import com.themecolor.callerphone.wallpaper.fragments.HomeFragment
import com.themecolor.callerphone.wallpaper.fragments.IconFragment
import com.themecolor.callerphone.wallpaper.fragments.SettingsMainFragment
import com.themecolor.callerphone.wallpaper.fragments.SpecificCallerFragment
import com.themecolor.callerphone.wallpaper.fragments.ThemeOptionsFragment


class MainActivity : BaseActivity() {
    companion object {
        private const val SELECTED_ITEM_ID = "SELECTED_ITEM_ID"
        val DEFAULT_DIALER_REQUEST_ID = 83
        val TAG = "MADARA"
    }

    private val mainActivityBinding: ActivityMainBinding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(mainActivityBinding.root)

        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = Color.TRANSPARENT
        val background: Drawable = resources.getDrawable(R.drawable.status_gradient)
        window.setBackgroundDrawable(background)
        mainActivityBinding.menuBtn.setOnClickListener {
            mainActivityBinding.drawer.openDrawer(Gravity.LEFT)
        }


        if(intent.getStringExtra("category") != null){
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, SpecificCallerFragment(intent.getStringExtra("category")))
                .commit()
        }
        if(intent.getStringExtra("prev")!=null){
            loadFragmentWithIcon(HomeFragment(), R.drawable.home_clear)
        }

        if(intent.getStringExtra("state") != null){
            if(intent.getStringExtra("state").equals("All"))
                loadFragmentWithIcon(HomeFragment(), R.drawable.home_clear)
            if(intent.getStringExtra("state").equals("callericon"))
                loadFragmentWithIcon(IconFragment(), R.drawable.home_clear)
            if(intent.getStringExtra("state").equals("keyboard"))
                loadFragmentWithIcon(ThemeOptionsFragment(), R.drawable.home_clear)
        }




        mainActivityBinding.shareLl.setOnClickListener{

            mainActivityBinding.drawer.closeDrawer(Gravity.LEFT)
            Uitls.shareApp(this@MainActivity)
        }

        mainActivityBinding.rateLl.setOnClickListener{
            Uitls.showRateApp(this@MainActivity)
        }



    mainActivityBinding.callerScreenLl.setOnClickListener {

        mainActivityBinding.drawer.closeDrawer(Gravity.LEFT)
                loadFragmentWithIcon(HomeFragment(), R.drawable.home_clear)


            }

            mainActivityBinding.keyboardLl.setOnClickListener {
                mainActivityBinding.drawer.closeDrawer(Gravity.LEFT)
                loadFragmentWithIcon(ThemeOptionsFragment(), R.drawable.keyboard_clear)


            }

            mainActivityBinding.iconLl.setOnClickListener {
                mainActivityBinding.drawer.closeDrawer(Gravity.LEFT)
                loadFragmentWithIcon(IconFragment(), R.drawable.icons_clear)


            }


        mainActivityBinding.settingLl.setOnClickListener {
            mainActivityBinding.drawer.closeDrawer(Gravity.LEFT)
            loadFragmentWithIcon(SettingsMainFragment(), R.drawable.setting_clear)

        }
        /*

with(mainActivityBinding) {
            bottomNavigationView.itemIconTintList = null
            bottomNavigationView.setOnItemSelectedListener { menuItem ->
                when (menuItem.itemId) {
                    R.id.themesNav ->

                        loadFragment(HomeFragment())


                    R.id.keyboardNav ->
                        loadFragment(ThemeOptionsFragment())


                    R.id.iconsNav ->
                        loadFragment(IconFragment())


                    R.id.settingsNav ->
                        loadFragment(SettingsMainFragment())

                }
                true
            }
        }

        mainActivityBinding.bottomNavigationView.selectedItemId =
            savedInstanceState?.getInt(SELECTED_ITEM_ID) ?: R.id.themesNav*/

        mainActivityBinding.dialerBtn.setOnClickListener {
            startActivity(Intent(this@MainActivity, DialerActivity::class.java))

        }

        mainActivityBinding.favouriteBtn.setOnClickListener {
            AdUtils.showInterstitialAd(
                Constants.adsResponseModel.interstitial_ads.adx, activity
            ) { isLoaded: Boolean ->
                run {
                    startActivity(Intent(this@MainActivity, FavouriteActivity::class.java))
                }
            }

        }


/*        mainActivityBinding.bottomNavigationView.setOnItemReselectedListener {
            if (it.itemId != mainActivityBinding.bottomNavigationView.selectedItemId) {
                mainActivityBinding.bottomNavigationView.selectedItemId = it.itemId
            }
        }*/
    }

    private fun loadFragmentWithIcon(fragment: Fragment, iconResourceId: Int) {
        val bundle = Bundle()
        bundle.putInt("iconResourceId", iconResourceId)
        fragment.arguments = bundle

        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()

        // Update the selected item in the bottom navigation view
        when (fragment) {
            is HomeFragment -> mainActivityBinding.bottomNavigationView.selectedItemId =
                R.id.themesNav
            is ThemeOptionsFragment -> mainActivityBinding.bottomNavigationView.selectedItemId =
                R.id.keyboardNav
            is IconFragment -> mainActivityBinding.bottomNavigationView.selectedItemId =
                R.id.iconsNav
            is SettingsMainFragment -> mainActivityBinding.bottomNavigationView.selectedItemId =
                R.id.settingsNav
        }
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return true
    }

    override fun onBackPressed() {
        AdUtils.showBackPressAds(
            activity, Constants.adsResponseModel.app_open_ads.adx
        ) { state_load: Boolean -> finish() }

//        startActivity(Intent(this@MainActivity, ExitActivity::class.java))
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putInt(SELECTED_ITEM_ID, mainActivityBinding.bottomNavigationView.selectedItemId)
    }



    override fun onResume() {
        super.onResume()
    }




}



