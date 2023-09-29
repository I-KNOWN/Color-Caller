// Generated by view binder compiler. Do not edit!
package com.uprisingscallscreen.theme.flashscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uprisingscallscreen.theme.flashscreen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemTabBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final TextView txtTabTitle;

  private ItemTabBinding(@NonNull LinearLayout rootView, @NonNull TextView txtTabTitle) {
    this.rootView = rootView;
    this.txtTabTitle = txtTabTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemTabBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemTabBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup parent,
      boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_tab, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemTabBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.txt_tab_title;
      TextView txtTabTitle = ViewBindings.findChildViewById(rootView, id);
      if (txtTabTitle == null) {
        break missingId;
      }

      return new ItemTabBinding((LinearLayout) rootView, txtTabTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}