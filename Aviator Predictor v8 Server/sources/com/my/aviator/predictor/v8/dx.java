package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class dx implements View.OnClickListener {
    final /* synthetic */ QoidalarActivity a;

    dx(QoidalarActivity qoidalarActivity) {
        this.a = qoidalarActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.i;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.i;
        intent2.setData(Uri.parse("https://t.me/samo_tips"));
        QoidalarActivity qoidalarActivity = this.a;
        intent3 = qoidalarActivity.i;
        qoidalarActivity.startActivity(intent3);
    }
}
