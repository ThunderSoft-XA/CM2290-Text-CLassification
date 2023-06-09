// Generated by view binder compiler. Do not edit!
package org.tensorflow.lite.examples.textclassification.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.core.widget.NestedScrollView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;
import org.tensorflow.lite.examples.textclassification.R;

public final class InfoBottomSheetBinding implements ViewBinding {
  @NonNull
  private final NestedScrollView rootView;

  @NonNull
  public final NestedScrollView bottomSheetLayout;

  @NonNull
  public final TextView inferenceTimeLabel;

  @NonNull
  public final TextView inferenceTimeVal;

  @NonNull
  public final RadioButton mobilebert;

  @NonNull
  public final RadioGroup modelSelector;

  @NonNull
  public final AppCompatSpinner spinnerDelegate;

  @NonNull
  public final RadioButton wordvec;

  private InfoBottomSheetBinding(@NonNull NestedScrollView rootView,
      @NonNull NestedScrollView bottomSheetLayout, @NonNull TextView inferenceTimeLabel,
      @NonNull TextView inferenceTimeVal, @NonNull RadioButton mobilebert,
      @NonNull RadioGroup modelSelector, @NonNull AppCompatSpinner spinnerDelegate,
      @NonNull RadioButton wordvec) {
    this.rootView = rootView;
    this.bottomSheetLayout = bottomSheetLayout;
    this.inferenceTimeLabel = inferenceTimeLabel;
    this.inferenceTimeVal = inferenceTimeVal;
    this.mobilebert = mobilebert;
    this.modelSelector = modelSelector;
    this.spinnerDelegate = spinnerDelegate;
    this.wordvec = wordvec;
  }

  @Override
  @NonNull
  public NestedScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static InfoBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static InfoBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.info_bottom_sheet, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static InfoBottomSheetBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      NestedScrollView bottomSheetLayout = (NestedScrollView) rootView;

      id = R.id.inference_time_label;
      TextView inferenceTimeLabel = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeLabel == null) {
        break missingId;
      }

      id = R.id.inference_time_val;
      TextView inferenceTimeVal = ViewBindings.findChildViewById(rootView, id);
      if (inferenceTimeVal == null) {
        break missingId;
      }

      id = R.id.mobilebert;
      RadioButton mobilebert = ViewBindings.findChildViewById(rootView, id);
      if (mobilebert == null) {
        break missingId;
      }

      id = R.id.model_selector;
      RadioGroup modelSelector = ViewBindings.findChildViewById(rootView, id);
      if (modelSelector == null) {
        break missingId;
      }

      id = R.id.spinner_delegate;
      AppCompatSpinner spinnerDelegate = ViewBindings.findChildViewById(rootView, id);
      if (spinnerDelegate == null) {
        break missingId;
      }

      id = R.id.wordvec;
      RadioButton wordvec = ViewBindings.findChildViewById(rootView, id);
      if (wordvec == null) {
        break missingId;
      }

      return new InfoBottomSheetBinding((NestedScrollView) rootView, bottomSheetLayout,
          inferenceTimeLabel, inferenceTimeVal, mobilebert, modelSelector, spinnerDelegate,
          wordvec);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
