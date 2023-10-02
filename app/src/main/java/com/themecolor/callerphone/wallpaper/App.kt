package com.themecolor.callerphone.wallpaper

import android.app.Application

import com.themecolor.callerphone.wallpaper.koin.getApplicationModules

import keyboard.neon.newboard.KeyboardInitClass
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level


@Suppress("unused")
class App : Application() {

    private var instance: App? = null
    @Synchronized
    fun getInstance(): App? {
        return instance
    }

    override fun onCreate() {
        super.onCreate()
        instance = this


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