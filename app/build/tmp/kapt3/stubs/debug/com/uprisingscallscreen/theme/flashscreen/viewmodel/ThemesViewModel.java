package com.uprisingscallscreen.theme.flashscreen.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010/\u001a\u00020\u000bJ\u0006\u00100\u001a\u00020\u000bJ\u0016\u00101\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u000204J\u0016\u00105\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\n2\u0006\u00103\u001a\u000204R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R(\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR.\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R4\u0010\u0016\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0018*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR4\u0010\u001d\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0007 \u0018*\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00060\u00060\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001d\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\"0!\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0014\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\'\"\u0004\b(\u0010\u0004R(\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\r\"\u0004\b+\u0010\u000fR(\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\r\"\u0004\b.\u0010\u000f\u00a8\u00066"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/viewmodel/ThemesViewModel;", "Landroidx/lifecycle/ViewModel;", "themesRepo", "Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;", "(Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;)V", "allThemes", "", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "changeFavTheme", "Lkotlin/Function1;", "", "", "getChangeFavTheme", "()Lkotlin/jvm/functions/Function1;", "setChangeFavTheme", "(Lkotlin/jvm/functions/Function1;)V", "handleFavSelection", "Lkotlin/Function2;", "getHandleFavSelection", "()Lkotlin/jvm/functions/Function2;", "setHandleFavSelection", "(Lkotlin/jvm/functions/Function2;)V", "keyBoardNeonThemesListLiveData", "Landroidx/lifecycle/MutableLiveData;", "kotlin.jvm.PlatformType", "getKeyBoardNeonThemesListLiveData", "()Landroidx/lifecycle/MutableLiveData;", "setKeyBoardNeonThemesListLiveData", "(Landroidx/lifecycle/MutableLiveData;)V", "keyBoardThemesListLiveData", "getKeyBoardThemesListLiveData", "setKeyBoardThemesListLiveData", "keyboardFavThemesList", "Landroidx/lifecycle/LiveData;", "", "getKeyboardFavThemesList", "()Landroidx/lifecycle/LiveData;", "neonThemes", "getThemesRepo", "()Lcom/uprisingscallscreen/theme/flashscreen/db/ThemeRepo;", "setThemesRepo", "unSelectNeonTheme", "getUnSelectNeonTheme", "setUnSelectNeonTheme", "unSelectTheme", "getUnSelectTheme", "setUnSelectTheme", "insertAdsNeonTheme", "insertAdsTheme", "toggleNeonThemeStatus", "id", "themeStatus", "", "toggleThemeStatus", "app_debug"})
public final class ThemesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private com.uprisingscallscreen.theme.flashscreen.db.ThemeRepo themesRepo;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> unSelectTheme;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> unSelectNeonTheme;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> changeFavTheme;
    @org.jetbrains.annotations.Nullable
    private kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> handleFavSelection;
    private final java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel> allThemes = null;
    private final java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel> neonThemes = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> keyBoardThemesListLiveData;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> keyBoardNeonThemesListLiveData;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> keyboardFavThemesList = null;
    
    public ThemesViewModel(@org.jetbrains.annotations.NotNull
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
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getUnSelectTheme() {
        return null;
    }
    
    public final void setUnSelectTheme(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getUnSelectNeonTheme() {
        return null;
    }
    
    public final void setUnSelectNeonTheme(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> getChangeFavTheme() {
        return null;
    }
    
    public final void setChangeFavTheme(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final kotlin.jvm.functions.Function2<java.lang.Integer, java.lang.Integer, kotlin.Unit> getHandleFavSelection() {
        return null;
    }
    
    public final void setHandleFavSelection(@org.jetbrains.annotations.Nullable
    kotlin.jvm.functions.Function2<? super java.lang.Integer, ? super java.lang.Integer, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> getKeyBoardThemesListLiveData() {
        return null;
    }
    
    public final void setKeyBoardThemesListLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> getKeyBoardNeonThemesListLiveData() {
        return null;
    }
    
    public final void setKeyBoardNeonThemesListLiveData(@org.jetbrains.annotations.NotNull
    androidx.lifecycle.MutableLiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> getKeyboardFavThemesList() {
        return null;
    }
    
    public final void toggleThemeStatus(int id, boolean themeStatus) {
    }
    
    public final void toggleNeonThemeStatus(int id, boolean themeStatus) {
    }
    
    public final void insertAdsTheme() {
    }
    
    public final void insertAdsNeonTheme() {
    }
}