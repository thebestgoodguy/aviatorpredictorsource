package com.my.aviator.predictor.v8;

import android.view.View;

/* loaded from: classes62.dex */
class a implements View.OnClickListener {
    final /* synthetic */ AviatorActivity a;

    a(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        this.a.onBackPressed();
    }
}
