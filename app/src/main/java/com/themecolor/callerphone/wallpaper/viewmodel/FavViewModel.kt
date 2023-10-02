package com.themecolor.callerphone.wallpaper.viewmodel

import androidx.lifecycle.ViewModel
import com.themecolor.callerphone.wallpaper.db.ThemeRepo
import com.themecolor.callerphone.wallpaper.models.ThemesModel

class FavViewModel(var themesRepo: ThemeRepo) : ViewModel() {


    fun adThemeToFav(item: ThemesModel, favStatus: (Boolean) -> Unit) {

        themesRepo.addToFav(item, favStatus = { status ->
            favStatus.invoke(status)

        })


    }




}