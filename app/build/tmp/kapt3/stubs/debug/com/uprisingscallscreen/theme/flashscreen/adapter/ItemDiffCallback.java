package com.uprisingscallscreen.theme.flashscreen.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/uprisingscallscreen/theme/flashscreen/adapter/ItemDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/uprisingscallscreen/theme/flashscreen/models/ThemesModel;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "getChangePayload", "", "app_debug"})
public final class ItemDiffCallback extends androidx.recyclerview.widget.DiffUtil.ItemCallback<com.uprisingscallscreen.theme.flashscreen.models.ThemesModel> {
    
    public ItemDiffCallback() {
        super();
    }
    
    @java.lang.Override
    public boolean areItemsTheSame(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel oldItem, @org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel newItem) {
        return false;
    }
    
    @java.lang.Override
    public boolean areContentsTheSame(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel oldItem, @org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel newItem) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.Object getChangePayload(@org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel oldItem, @org.jetbrains.annotations.NotNull
    com.uprisingscallscreen.theme.flashscreen.models.ThemesModel newItem) {
        return null;
    }
}