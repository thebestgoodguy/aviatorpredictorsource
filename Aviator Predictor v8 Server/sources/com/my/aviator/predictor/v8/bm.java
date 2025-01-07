package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class bm implements View.OnClickListener {
    final /* synthetic */ AviatorActivity a;

    bm(AviatorActivity aviatorActivity) {
        this.a = aviatorActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.r;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.r;
        intent2.setData(Uri.parse("https://1wodfv.top/v3/landing-page/casino"));
        AviatorActivity aviatorActivity = this.a;
        intent3 = aviatorActivity.r;
        aviatorActivity.startActivity(intent3);
    }
}
