package com.uprisingscallscreen.theme.flashscreen.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/adapter/AllThemesAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "onThemeClicked", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "getItemId", "", "position", "", "getItemViewType", "onBindViewHolder", "holder", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemViewHolder", "app_debug"})
public final class AllThemesAdapter extends androidx.recyclerview.widget.ListAdapter<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel, androidx.recyclerview.widget.RecyclerView.ViewHolder> {
    private final kotlin.jvm.functions.Function1<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel, kotlin.Unit> onThemeClicked = null;
    
    public AllThemesAdapter(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super com.uprisingscallscreen.theme.flashscreen.models.ThemesModel, kotlin.Unit> onThemeClicked) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemViewType(int position) {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    androidx.recyclerview.widget.RecyclerView.ViewHolder holder, int position) {
    }
    
    @java.lang.Override
    public long getItemId(int position) {
        return 0L;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0002\u0010\bJ\u000e\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0011H\u0002R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/adapter/AllThemesAdapter$ItemViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "themeItemBinding", "Lcom/uprisingscallscreen/theme/flashscreen/databinding/AllthemesItemLayoutBinding;", "onThemeClicked", "Lkotlin/Function1;", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "", "(Lcom/uprisingscallscreen/theme/flashscreen/adapter/AllThemesAdapter;Lcom/uprisingscallscreen/theme/flashscreen/databinding/AllthemesItemLayoutBinding;Lkotlin/jvm/functions/Function1;)V", "currentTheme", "bind", "item", "bindThemeState", "isThemeSelected", "", "setUpImages", "drawableName", "", "setUpNeonKeysImages", "drawableNameKeys", "app_debug"})
    public final class ItemViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final com.uprisingscallscreen.theme.flashscreen.databinding.AllthemesItemLayoutBinding themeItemBinding = null;
        private final kotlin.jvm.functions.Function1<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel, kotlin.Unit> onThemeClicked = null;
        private com.uprisingscallscreen.theme.flashscreen.models.ThemesModel currentTheme;
        
        public ItemViewHolder(@org.jetbrains.annotations.NotNull
        com.uprisingscallscreen.theme.flashscreen.databinding.AllthemesItemLayoutBinding themeItemBinding, @org.jetbrains.annotations.NotNull
        kotlin.jvm.functions.Function1<? super com.uprisingscallscreen.theme.flashscreen.models.ThemesModel, kotlin.Unit> onThemeClicked) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.uprisingscallscreen.theme.flashscreen.models.ThemesModel item) {
        }
        
        private final void setUpImages(java.lang.String drawableName) {
        }
        
        private final void setUpNeonKeysImages(java.lang.String drawableNameKeys) {
        }
        
        private final void bindThemeState(boolean isThemeSelected) {
        }
    }
}