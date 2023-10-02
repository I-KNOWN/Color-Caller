package com.themecolor.callerphone.wallpaper.koin
import org.koin.core.module.Module


fun getApplicationModules(): List<Module> = listOf(ListModules, viewModelModule)