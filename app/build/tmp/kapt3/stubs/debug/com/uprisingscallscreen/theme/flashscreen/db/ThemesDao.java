package com.uprisingscallscreen.theme.flashscreen.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u001f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0011\u0010\b\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0011\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00110\u0010H\'J\u0019\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0004H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/db/ThemesDao;", "", "checkIfExist", "", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "themeId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearThemes", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteAllFav", "", "deleteSingleTheme", "note", "(Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavThemes", "Lkotlinx/coroutines/flow/Flow;", "", "insertThemeItem", "", "app_debug"})
public abstract interface ThemesDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 5)
    public abstract java.lang.Object insertThemeItem(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Long> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteSingleTheme(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel note, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM themes")
    public abstract java.lang.Object deleteAllFav(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM themes where themeId=:themeId")
    public abstract java.lang.Object checkIfExist(int themeId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> continuation);
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM themes order by date Desc")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel>> getFavThemes();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM themes")
    public abstract java.lang.Object clearThemes(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.lang.Integer> continuation);
}