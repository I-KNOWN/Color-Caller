// Generated by view binder compiler. Do not edit!
package com.uprisingscallscreen.theme.flashscreen.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.uprisingscallscreen.theme.flashscreen.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySearchBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final SearchView searchBar;

  @NonNull
  public final RecyclerView searchRecycler;

  @NonNull
  public final Toolbar searchToolbar;

  private ActivitySearchBinding(@NonNull RelativeLayout rootView, @NonNull SearchView searchBar,
      @NonNull RecyclerView searchRecycler, @NonNull Toolbar searchToolbar) {
    this.rootView = rootView;
    this.searchBar = searchBar;
    this.searchRecycler = searchRecycler;
    this.searchToolbar = searchToolbar;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_search, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySearchBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.search_bar;
      SearchView searchBar = ViewBindings.findChildViewById(rootView, id);
      if (searchBar == null) {
        break missingId;
      }

      id = R.id.search_recycler;
      RecyclerView searchRecycler = ViewBindings.findChildViewById(rootView, id);
      if (searchRecycler == null) {
        break missingId;
      }

      id = R.id.search_toolbar;
      Toolbar searchToolbar = ViewBindings.findChildViewById(rootView, id);
      if (searchToolbar == null) {
        break missingId;
      }

      return new ActivitySearchBinding((RelativeLayout) rootView, searchBar, searchRecycler,
          searchToolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
