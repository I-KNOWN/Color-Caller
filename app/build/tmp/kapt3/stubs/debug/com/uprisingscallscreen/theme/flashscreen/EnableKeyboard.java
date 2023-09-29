package com.uprisingscallscreen.theme.flashscreen;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0002$%B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u0017\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0013H\u0014J\b\u0010\u001b\u001a\u00020\u0013H\u0014J\u001e\u0010\u001c\u001a\u00020\u00132\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001e2\b\b\u0002\u0010\u001f\u001a\u00020 H\u0002J\u001c\u0010!\u001a\u00020\u00132\u0012\b\u0002\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0013\u0018\u00010#H\u0003R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006&"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/EnableKeyboard;", "Lcom/uprisingscallscreen/theme/flashscreen/BaseActivity;", "Landroid/view/View$OnClickListener;", "()V", "enableKeyboardBinding", "Lcom/uprisingscallscreen/theme/flashscreen/databinding/EnableKeyboardBinding;", "getEnableKeyboardBinding", "()Lcom/uprisingscallscreen/theme/flashscreen/databinding/EnableKeyboardBinding;", "enableKeyboardBinding$delegate", "Lkotlin/Lazy;", "imeChangedReceiver", "Lkeyboard/neon/newboard/InputMethodChangedReceiver;", "userStep", "", "getUserStep", "()I", "setUserStep", "(I)V", "onBackPressed", "", "onClick", "viewId", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onResume", "startWithClearTop", "targetClass", "Ljava/lang/Class;", "imeiChanged", "", "updateUiState", "onExecute", "Lkotlin/Function0;", "Companion", "SettingsPoolingHandler", "app_debug"})
public final class EnableKeyboard extends com.uprisingscallscreen.theme.flashscreen.BaseActivity implements android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull
    public static final com.uprisingscallscreen.theme.flashscreen.EnableKeyboard.Companion Companion = null;
    private static final int MSG_POLLING_IME_SETTINGS = 0;
    private static final long IME_SETTINGS_POLLING_INTERVAL = 200L;
    private int userStep = 1;
    private final kotlin.Lazy enableKeyboardBinding$delegate = null;
    private final keyboard.neon.newboard.InputMethodChangedReceiver imeChangedReceiver = null;
    
    public EnableKeyboard() {
        super();
    }
    
    public final int getUserStep() {
        return 0;
    }
    
    public final void setUserStep(int p0) {
    }
    
    private final com.uprisingscallscreen.theme.flashscreen.databinding.EnableKeyboardBinding getEnableKeyboardBinding() {
        return null;
    }
    
    @android.annotation.SuppressLint(value = {"SetTextI18n"})
    private final void updateUiState(kotlin.jvm.functions.Function0<kotlin.Unit> onExecute) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startWithClearTop(java.lang.Class<?> targetClass, boolean imeiChanged) {
    }
    
    @java.lang.Override
    protected void onResume() {
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @java.lang.Override
    public void onClick(@org.jetbrains.annotations.Nullable
    android.view.View viewId) {
    }
    
    @java.lang.Override
    public void onBackPressed() {
    }
    
    @android.annotation.SuppressLint(value = {"HandlerLeak"})
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0083\u0004\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0006\u0010\u0007\u001a\u00020\u0004\u00a8\u0006\b"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/EnableKeyboard$SettingsPoolingHandler;", "Landroid/os/Handler;", "(Lcom/uprisingscallscreen/theme/flashscreen/EnableKeyboard;)V", "handleMessage", "", "msg", "Landroid/os/Message;", "startPollingImeSettings", "app_debug"})
    final class SettingsPoolingHandler extends android.os.Handler {
        
        public SettingsPoolingHandler() {
            super();
        }
        
        @java.lang.Override
        public void handleMessage(@org.jetbrains.annotations.NotNull
        android.os.Message msg) {
        }
        
        public final void startPollingImeSettings() {
        }
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/EnableKeyboard$Companion;", "", "()V", "IME_SETTINGS_POLLING_INTERVAL", "", "MSG_POLLING_IME_SETTINGS", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}