package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class cy implements View.OnClickListener {
    final /* synthetic */ Ibooo2Activity a;

    cy(Ibooo2Activity ibooo2Activity) {
        this.a = ibooo2Activity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.t;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.t;
        intent2.setData(Uri.parse("https://telegra.ph/AVIATOR--PREDICTOR-V5-11-08"));
        Ibooo2Activity ibooo2Activity = this.a;
        intent3 = ibooo2Activity.t;
        ibooo2Activity.startActivity(intent3);
    }
}
