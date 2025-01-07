package com.my.aviator.predictor.v8;

import android.graphics.drawable.GradientDrawable;

/* loaded from: classes62.dex */
class dn extends GradientDrawable {
    final /* synthetic */ MainActivity a;

    dn(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public GradientDrawable a(int r1, int r2, int r3, int r4) {
        setCornerRadius(r1);
        setStroke(r2, r3);
        setColor(r4);
        return this;
    }
}
