// Generated by view binder compiler. Do not edit!
package com.uprisingscallscreen.theme.flashscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uprisingscallscreen.theme.flashscreen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityExitBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final LinearLayout adsView;

  @NonNull
  public final TextView cancelBtn;

  @NonNull
  public final TextView yesBtn;

  private ActivityExitBinding(@NonNull RelativeLayout rootView, @NonNull LinearLayout adsView,
      @NonNull TextView cancelBtn, @NonNull TextView yesBtn) {
    this.rootView = rootView;
    this.adsView = adsView;
    this.cancelBtn = cancelBtn;
    this.yesBtn = yesBtn;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityExitBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityExitBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_exit, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityExitBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.adsView;
      LinearLayout adsView = ViewBindings.findChildViewById(rootView, id);
      if (adsView == null) {
        break missingId;
      }

      id = R.id.cancel_btn;
      TextView cancelBtn = ViewBindings.findChildViewById(rootView, id);
      if (cancelBtn == null) {
        break missingId;
      }

      id = R.id.yes_btn;
      TextView yesBtn = ViewBindings.findChildViewById(rootView, id);
      if (yesBtn == null) {
        break missingId;
      }

      return new ActivityExitBinding((RelativeLayout) rootView, adsView, cancelBtn, yesBtn);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
