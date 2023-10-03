package com.themecolor.callerphone.wallpaper

import android.app.Application
import com.adsmodule.api.adsModule.preferencesManager.AppPreferences
import com.adsmodule.api.adsModule.retrofit.APICallHandler
import com.adsmodule.api.adsModule.retrofit.AdsDataRequestModel
import com.adsmodule.api.adsModule.utils.ConnectionDetector
import com.adsmodule.api.adsModule.utils.Constants
import com.adsmodule.api.adsModule.utils.Global
import com.themecolor.callerphone.wallpaper.SingletonClasses.AppOpenAds
import com.themecolor.callerphone.wallpaper.SingletonClasses.MyApplication
import com.themecolor.callerphone.wallpaper.koin.getApplicationModules
import keyboard.neon.newboard.KeyboardInitClass
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level



class App : Application() {


    companion object {
        var preferences_mine: AppPreferences? = null
        var app: App? = null
        var cd: ConnectionDetector? = null
        fun getpreferences_mine(): AppPreferences? {
            if (preferences_mine == null) preferences_mine = AppPreferences(app)
            return preferences_mine
        }

        fun getConnectionStatus(): ConnectionDetector? {
            if (cd == null) {
                cd = ConnectionDetector(app)
            }
            return cd
        }
    }




    private var instance: App? = null
    @Synchronized
    fun getInstance(): App? {
        return instance
    }

    override fun onCreate() {
        super.onCreate()
        app = this
        AppOpenAds(app)
        val preferences = AppPreferences(app)
        if (preferences.isFirstRun) {
            APICallHandler.callAppCountApi(
                Constants.MAIN_BASE_URL,
                AdsDataRequestModel(
                    app?.packageName,
                    Global.getDeviceId(app)
                )
            ) { preferences.isFirstRun = false }
        }

/*
        FirebaseApp.initializeApp(this)
        FirebaseMessaging.getInstance().isAutoInitEnabled = true*/




        KeyboardInitClass(this).onCreate()


        startKoin {
            androidContext(this@App)
            androidLogger(Level.ERROR)
            modules(
                getApplicationModules()
            )
        }

    }



}