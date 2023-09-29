package com.uprisingscallscreen.theme.flashscreen.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0004J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\u001a\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u0004H\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u001c"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/fragments/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "FRAGMENT_TAG", "", "getFRAGMENT_TAG", "()Ljava/lang/String;", "keyboardPrefs", "Lkeyboard/neon/newboard/ime/core/Preferences;", "getKeyboardPrefs", "()Lkeyboard/neon/newboard/ime/core/Preferences;", "themesViewModel", "Lcom/uprisingscallscreen/theme/flashscreen/viewmodel/ThemesViewModel;", "getThemesViewModel", "()Lcom/uprisingscallscreen/theme/flashscreen/viewmodel/ThemesViewModel;", "themesViewModel$delegate", "Lkotlin/Lazy;", "isInternetConnected", "", "loadChildFragment", "", "fragment", "frameId", "", "showEnableKbBottomSheet", "context", "Landroid/content/Context;", "titleText", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String FRAGMENT_TAG = "FRAGMENT_TAG";
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy themesViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final keyboard.neon.newboard.ime.core.Preferences keyboardPrefs = null;
    
    public BaseFragment() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFRAGMENT_TAG() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final com.uprisingscallscreen.theme.flashscreen.viewmodel.ThemesViewModel getThemesViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    protected final keyboard.neon.newboard.ime.core.Preferences getKeyboardPrefs() {
        return null;
    }
    
    protected final void loadChildFragment(@org.jetbrains.annotations.NotNull
    androidx.fragment.app.Fragment fragment, int frameId) {
    }
    
    protected final void showEnableKbBottomSheet(@org.jetbrains.annotations.NotNull
    android.content.Context context, @org.jetbrains.annotations.NotNull
    java.lang.String titleText) {
    }
    
    protected final boolean isInternetConnected() {
        return false;
    }
}