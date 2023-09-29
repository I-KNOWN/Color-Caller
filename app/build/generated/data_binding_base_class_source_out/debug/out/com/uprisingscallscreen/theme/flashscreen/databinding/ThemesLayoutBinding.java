// Generated by view binder compiler. Do not edit!
package com.uprisingscallscreen.theme.flashscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uprisingscallscreen.theme.flashscreen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ThemesLayoutBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout adsView0;

  @NonNull
  public final RecyclerView allThemesRv;

  private ThemesLayoutBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout adsView0,
      @NonNull RecyclerView allThemesRv) {
    this.rootView = rootView;
    this.adsView0 = adsView0;
    this.allThemesRv = allThemesRv;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ThemesLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ThemesLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.themes_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ThemesLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adsView0;
      LinearLayout adsView0 = ViewBindings.findChildViewById(rootView, id);
      if (adsView0 == null) {
        break missingId;
      }

      id = R.id.allThemesRv;
      RecyclerView allThemesRv = ViewBindings.findChildViewById(rootView, id);
      if (allThemesRv == null) {
        break missingId;
      }

      return new ThemesLayoutBinding((RelativeLayout) rootView, adsView0, allThemesRv);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
