package com.my.aviator.predictor.v8;

import android.graphics.drawable.GradientDrawable;

/* renamed from: com.my.aviator.predictor.v8.do, reason: invalid class name */
/* loaded from: classes62.dex */
class Cdo extends GradientDrawable {
    final /* synthetic */ MainActivity a;

    Cdo(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    public GradientDrawable a(int r1, int r2, int r3, int r4) {
        setCornerRadius(r1);
        setStroke(r2, r3);
        setColor(r4);
        return this;
    }
}
