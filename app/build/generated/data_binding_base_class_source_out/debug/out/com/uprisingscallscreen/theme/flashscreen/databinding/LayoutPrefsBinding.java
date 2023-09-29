// Generated by view binder compiler. Do not edit!
package com.uprisingscallscreen.theme.flashscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.switchmaterial.SwitchMaterial;
import com.uprisingscallscreen.theme.flashscreen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class LayoutPrefsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppCompatImageView icon;

  @NonNull
  public final SwitchMaterial switchWidget;

  @NonNull
  public final TextView title;

  private LayoutPrefsBinding(@NonNull ConstraintLayout rootView, @NonNull AppCompatImageView icon,
      @NonNull SwitchMaterial switchWidget, @NonNull TextView title) {
    this.rootView = rootView;
    this.icon = icon;
    this.switchWidget = switchWidget;
    this.title = title;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static LayoutPrefsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static LayoutPrefsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.layout_prefs, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static LayoutPrefsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = android.R.id.icon;
      AppCompatImageView icon = ViewBindings.findChildViewById(rootView, id);
      if (icon == null) {
        break missingId;
      }

      id = R.id.switchWidget;
      SwitchMaterial switchWidget = ViewBindings.findChildViewById(rootView, id);
      if (switchWidget == null) {
        break missingId;
      }

      id = android.R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new LayoutPrefsBinding((ConstraintLayout) rootView, icon, switchWidget, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}