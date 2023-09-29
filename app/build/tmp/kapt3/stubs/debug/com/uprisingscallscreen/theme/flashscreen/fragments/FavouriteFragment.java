package com.uprisingscallscreen.theme.flashscreen.fragments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0016\u0010\u0011\u001a\u00020\u000e2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00100\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\u0018\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J$\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\nH\u0016J\u001a\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020\u001d2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010(\u001a\u00020\u000eH\u0002J\u0010\u0010)\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020$H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006,"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/fragments/FavouriteFragment;", "Lcom/uprisingscallscreen/theme/flashscreen/fragments/BaseFragment;", "()V", "favAdapter", "Lcom/uprisingscallscreen/theme/flashscreen/adapter/FavAdapter;", "favThemeAdCount", "", "favouriteBinding", "Lcom/uprisingscallscreen/theme/flashscreen/databinding/FragmentFavouriteBinding;", "itemToHide", "Landroid/view/MenuItem;", "myActivity", "Lcom/uprisingscallscreen/theme/flashscreen/MainActivity;", "favAdapterClick", "", "theme", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "handleObserver", "list", "", "onAttach", "context", "Landroid/content/Context;", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "onCreateView", "Landroid/view/View;", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onOptionsItemSelected", "", "item", "onViewCreated", "view", "showDeleteAllFavBottomSheet", "showFullScreenAdThemeClick", "toggle", "state", "app_debug"})
public final class FavouriteFragment extends com.uprisingscallscreen.theme.flashscreen.fragments.BaseFragment {
    private int favThemeAdCount = 0;
    private com.uprisingscallscreen.theme.flashscreen.MainActivity myActivity;
    private com.uprisingscallscreen.theme.flashscreen.databinding.FragmentFavouriteBinding favouriteBinding;
    private android.view.MenuItem itemToHide;
    private final com.uprisingscallscreen.theme.flashscreen.adapter.FavAdapter favAdapter = null;
    
    public FavouriteFragment() {
        super();
    }
    
    private final void favAdapterClick(com.uprisingscallscreen.theme.flashscreen.models.ThemesModel theme) {
    }
    
    @java.lang.Override
    public void onAttach(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    @java.lang.Override
    public void onCreateOptionsMenu(@org.jetbrains.annotations.NotNull
    android.view.Menu menu, @org.jetbrains.annotations.NotNull
    android.view.MenuInflater inflater) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void handleObserver(java.util.List<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel> list) {
    }
    
    private final void showDeleteAllFavBottomSheet() {
    }
    
    private final void toggle(boolean state) {
    }
    
    private final void showFullScreenAdThemeClick(com.uprisingscallscreen.theme.flashscreen.models.ThemesModel theme) {
    }
}