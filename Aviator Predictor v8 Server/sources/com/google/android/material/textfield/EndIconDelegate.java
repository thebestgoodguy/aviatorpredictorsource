package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes37.dex */
abstract class EndIconDelegate {
    Context context;
    final int customEndIcon;
    CheckableImageButton endIconView;
    TextInputLayout textInputLayout;

    abstract void initialize();

    EndIconDelegate(TextInputLayout textInputLayout, int customEndIcon) {
        this.textInputLayout = textInputLayout;
        this.context = textInputLayout.getContext();
        this.endIconView = textInputLayout.getEndIconView();
        this.customEndIcon = customEndIcon;
    }

    boolean shouldTintIconOnError() {
        return false;
    }

    boolean isBoxBackgroundModeSupported(int boxBackgroundMode) {
        return true;
    }

    void onSuffixVisibilityChanged(boolean visible) {
    }
}
