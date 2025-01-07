package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class df implements View.OnClickListener {
    final /* synthetic */ MainActivity a;

    df(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.u;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.u;
        intent2.setData(Uri.parse("https://1wodfv.top/v3/landing-page/casino"));
        MainActivity mainActivity = this.a;
        intent3 = mainActivity.u;
        mainActivity.startActivity(intent3);
    }
}
