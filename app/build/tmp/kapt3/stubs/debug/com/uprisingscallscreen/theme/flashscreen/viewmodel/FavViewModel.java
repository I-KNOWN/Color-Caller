package com.uprisingscallscreen.theme.flashscreen.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\t0\rR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004\u00a8\u0006\u000f"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/viewmodel/FavViewModel;", "Landroidx/lifecycle/ViewModel;", "themesRepo", "Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;", "(Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;)V", "getThemesRepo", "()Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;", "setThemesRepo", "adThemeToFav", "", "item", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "favStatus", "Lkotlin/Function1;", "", "app_debug"})
public final class FavViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.uprisingscallscreen.theme.flashscreen.db.ThemeRepo themesRepo;
    
    public FavViewModel(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.db.ThemeRepo themesRepo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.uprisingscallscreen.theme.flashscreen.db.ThemeRepo getThemesRepo() {
        return null;
    }
    
    public final void setThemesRepo(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.db.ThemeRepo p0) {
    }
    
    public final void adThemeToFav(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel item, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> favStatus) {
    }
}