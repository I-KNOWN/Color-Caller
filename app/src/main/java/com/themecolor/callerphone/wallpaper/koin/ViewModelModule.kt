package com.themecolor.callerphone.wallpaper.koin

import com.themecolor.callerphone.wallpaper.viewmodel.FavViewModel
import com.themecolor.callerphone.wallpaper.viewmodel.ThemesViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {

    viewModel {
        ThemesViewModel(get())
    }

    viewModel {
        FavViewModel(get())
    }


}
