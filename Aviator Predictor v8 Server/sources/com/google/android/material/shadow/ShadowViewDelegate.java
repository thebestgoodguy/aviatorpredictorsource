package com.google.android.material.shadow;

import android.graphics.drawable.Drawable;

/* loaded from: classes37.dex */
public interface ShadowViewDelegate {
    float getRadius();

    boolean isCompatPaddingEnabled();

    void setBackgroundDrawable(Drawable drawable);

    void setShadowPadding(int r1, int r2, int r3, int r4);
}
