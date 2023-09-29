package com.uprisingscallscreen.theme.flashscreen.db;

import java.lang.System;

@androidx.room.Database(entities = {com.uprisingscallscreen.theme.flashscreen.models.ThemesModel.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00052\u00020\u0001:\u0001\u0005B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0006"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon;", "Landroidx/room/RoomDatabase;", "()V", "themesDao", "Lcom/uprisingscallscreen/theme/flashscreen/db/ThemesDao;", "Companion", "app_debug"})
public abstract class LocalDatabaseNeon extends androidx.room.RoomDatabase {
    @org.jetbrains.annotations.NotNull
    public static final com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon.Companion Companion = null;
    @kotlin.jvm.Volatile
    private static volatile com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon INSTANCE;
    private static final java.lang.String DATABASE_NAME = "myKeyboardDatabase.db";
    
    public LocalDatabaseNeon() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public abstract com.uprisingscallscreen.theme.flashscreen.db.ThemesDao themesDao();
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0002J\u000e\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon$Companion;", "", "()V", "DATABASE_NAME", "", "INSTANCE", "Lcom/uprisingscallscreen/theme/flashscreen/db/LocalDatabaseNeon;", "buildDatabase", "appContext", "Landroid/content/Context;", "getInstance", "context", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon getInstance(@org.jetbrains.annotations.NotNull
        android.content.Context context) {
            return null;
        }
        
        private final com.uprisingscallscreen.theme.flashscreen.db.LocalDatabaseNeon buildDatabase(android.content.Context appContext) {
            return null;
        }
    }
}