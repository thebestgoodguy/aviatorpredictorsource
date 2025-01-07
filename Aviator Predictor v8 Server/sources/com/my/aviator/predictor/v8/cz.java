package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class cz implements View.OnClickListener {
    final /* synthetic */ Ibooo2Activity a;

    cz(Ibooo2Activity ibooo2Activity) {
        this.a = ibooo2Activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.v;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.v;
        intent2.setData(Uri.parse("https://1wodfv.top/v3/landing-page/casino"));
        Ibooo2Activity ibooo2Activity = this.a;
        intent3 = ibooo2Activity.v;
        ibooo2Activity.startActivity(intent3);
    }
}
