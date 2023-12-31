// Generated by view binder compiler. Do not edit!
package keyboard.neon.newboard.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import keyboard.neon.newboard.R;

public final class CrashDialogBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button close;

  @NonNull
  public final Button copyToClipboard;

  @NonNull
  public final TextView description;

  @NonNull
  public final Button openBugReportForm;

  @NonNull
  public final TextView reportInstructions;

  @NonNull
  public final TextView stacktrace;

  private CrashDialogBinding(@NonNull LinearLayout rootView, @NonNull Button close,
      @NonNull Button copyToClipboard, @NonNull TextView description,
      @NonNull Button openBugReportForm, @NonNull TextView reportInstructions,
      @NonNull TextView stacktrace) {
    this.rootView = rootView;
    this.close = close;
    this.copyToClipboard = copyToClipboard;
    this.description = description;
    this.openBugReportForm = openBugReportForm;
    this.reportInstructions = reportInstructions;
    this.stacktrace = stacktrace;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static CrashDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static CrashDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.crash_dialog, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static CrashDialogBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.close;
      Button close = ViewBindings.findChildViewById(rootView, id);
      if (close == null) {
        break missingId;
      }

      id = R.id.copy_to_clipboard;
      Button copyToClipboard = ViewBindings.findChildViewById(rootView, id);
      if (copyToClipboard == null) {
        break missingId;
      }

      id = R.id.description;
      TextView description = ViewBindings.findChildViewById(rootView, id);
      if (description == null) {
        break missingId;
      }

      id = R.id.open_bug_report_form;
      Button openBugReportForm = ViewBindings.findChildViewById(rootView, id);
      if (openBugReportForm == null) {
        break missingId;
      }

      id = R.id.report_instructions;
      TextView reportInstructions = ViewBindings.findChildViewById(rootView, id);
      if (reportInstructions == null) {
        break missingId;
      }

      id = R.id.stacktrace;
      TextView stacktrace = ViewBindings.findChildViewById(rootView, id);
      if (stacktrace == null) {
        break missingId;
      }

      return new CrashDialogBinding((LinearLayout) rootView, close, copyToClipboard, description,
          openBugReportForm, reportInstructions, stacktrace);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
