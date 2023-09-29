package com.uprisingscallscreen.theme.flashscreen.models;

import java.lang.System;

@androidx.room.Entity(tableName = "themes", indices = {@androidx.room.Index(unique = true, value = {"themeJsonName"})})
@androidx.annotation.Keep
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b+\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0007\b\u0016\u00a2\u0006\u0002\u0010\u0002B[\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u0010J\t\u0010,\u001a\u00020\u0004H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\u0004H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u00103\u001a\u00020\rH\u00c6\u0003J\t\u00104\u001a\u00020\rH\u00c6\u0003Jp\u00105\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rH\u00c6\u0001\u00a2\u0006\u0002\u00106J\u0013\u00107\u001a\u00020\r2\b\u00108\u001a\u0004\u0018\u000109H\u00d6\u0003J\t\u0010:\u001a\u00020\u0004H\u00d6\u0001J\t\u0010;\u001a\u00020\tH\u00d6\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001e\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\f\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\n\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R\u001a\u0010\u0007\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b\'\u0010\u0018R\u001e\u0010\u000e\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0019\"\u0004\b)\u0010\u001bR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#\u00a8\u0006<"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "Ljava/io/Serializable;", "()V", "id", "", "date", "", "themeId", "themeJsonName", "", "themeDrawableName", "keysBgName", "isNeon", "", "themeIsSelected", "isNativeAd", "(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZ)V", "getDate", "()J", "setDate", "(J)V", "getId", "()I", "setId", "(I)V", "()Z", "setNativeAd", "(Z)V", "()Ljava/lang/Boolean;", "setNeon", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "getKeysBgName", "()Ljava/lang/String;", "setKeysBgName", "(Ljava/lang/String;)V", "getThemeDrawableName", "setThemeDrawableName", "getThemeId", "setThemeId", "getThemeIsSelected", "setThemeIsSelected", "getThemeJsonName", "setThemeJsonName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(IJILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZZ)Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "equals", "other", "", "hashCode", "toString", "app_debug"})
public final class ThemesModel implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private int id;
    private long date;
    private int themeId;
    @org.jetbrains.annotations.Nullable
    private java.lang.String themeJsonName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String themeDrawableName;
    @org.jetbrains.annotations.Nullable
    private java.lang.String keysBgName;
    @org.jetbrains.annotations.Nullable
    private java.lang.Boolean isNeon;
    @androidx.room.Ignore
    private boolean themeIsSelected;
    @androidx.room.Ignore
    private boolean isNativeAd;
    
    @org.jetbrains.annotations.NotNull
    public final com.uprisingscallscreen.theme.flashscreen.models.ThemesModel copy(@org.jetbrains.annotations.NotNull
    int id, long date, int themeId, @org.jetbrains.annotations.Nullable
    java.lang.String themeJsonName, @org.jetbrains.annotations.Nullable
    java.lang.String themeDrawableName, @org.jetbrains.annotations.Nullable
    java.lang.String keysBgName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isNeon, boolean themeIsSelected, boolean isNativeAd) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public ThemesModel(@org.jetbrains.annotations.NotNull
    int id, long date, int themeId, @org.jetbrains.annotations.Nullable
    java.lang.String themeJsonName, @org.jetbrains.annotations.Nullable
    java.lang.String themeDrawableName, @org.jetbrains.annotations.Nullable
    java.lang.String keysBgName, @org.jetbrains.annotations.Nullable
    java.lang.Boolean isNeon, boolean themeIsSelected, boolean isNativeAd) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    public final void setId(int p0) {
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getThemeId() {
        return 0;
    }
    
    public final void setThemeId(int p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThemeJsonName() {
        return null;
    }
    
    public final void setThemeJsonName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getThemeDrawableName() {
        return null;
    }
    
    public final void setThemeDrawableName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getKeysBgName() {
        return null;
    }
    
    public final void setKeysBgName(@org.jetbrains.annotations.Nullable
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean isNeon() {
        return null;
    }
    
    public final void setNeon(@org.jetbrains.annotations.Nullable
    java.lang.Boolean p0) {
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getThemeIsSelected() {
        return false;
    }
    
    public final void setThemeIsSelected(boolean p0) {
    }
    
    public final boolean component9() {
        return false;
    }
    
    public final boolean isNativeAd() {
        return false;
    }
    
    public final void setNativeAd(boolean p0) {
    }
    
    public ThemesModel() {
        super();
    }
}