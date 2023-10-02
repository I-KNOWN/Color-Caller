package com.themecolor.callerphone.wallpaper.koin


import com.themecolor.callerphone.wallpaper.db.ThemeRepo
import org.koin.dsl.module

val ListModules = module {


    single {
        ThemeRepo(get())
    }

    single {
    }


}

