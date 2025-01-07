package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.view.View;

/* loaded from: classes62.dex */
class cg implements View.OnClickListener {
    final /* synthetic */ AviatorActivity a;

    cg(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        intent = this.a.t;
        intent.setClass(this.a.getApplicationContext(), QoidalarActivity.class);
        AviatorActivity aviatorActivity = this.a;
        intent2 = aviatorActivity.t;
        aviatorActivity.startActivity(intent2);
    }
}
