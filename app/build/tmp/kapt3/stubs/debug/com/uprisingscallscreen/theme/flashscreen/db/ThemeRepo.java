package com.uprisingscallscreen.theme.flashscreen.db;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010J\"\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010J\u0012\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00180\u0017J\u001a\u0010\u0019\u001a\u00020\f2\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u001b"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;", "", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "themeDb", "Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon;", "getThemeDb", "()Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon;", "setThemeDb", "(Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon;)V", "addToFav", "", "item", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "favStatus", "Lkotlin/Function1;", "", "checkIfThemeExist", "themeId", "", "existStatus", "getFavThemesFromDb", "Lkotlinx/coroutines/flow/Flow;", "", "removeAllFavThemes", "removeStatus", "app_debug"})
public final class ThemeRepo {
    @org.jetbrains.annotations.NotNull
    private com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon themeDb;
    
    public ThemeRepo(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon getThemeDb() {
        return null;
    }
    
    public final void setThemeDb(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon p0) {
    }
    
    public final void addToFav(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel item, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> favStatus) {
    }
    
    public final void removeAllFavThemes(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> removeStatus) {
    }
    
    public final void checkIfThemeExist(int themeId, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> existStatus) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> getFavThemesFromDb() {
        return null;
    }
}