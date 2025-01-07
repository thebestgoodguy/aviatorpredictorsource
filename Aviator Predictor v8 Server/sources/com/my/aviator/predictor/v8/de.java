package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class de implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    de(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.onBackPressed();
    }
}
