package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.net.Uri;
import android.view.View;

/* loaded from: classes62.dex */
class dw implements View.OnClickListener {
    final /* synthetic */ QoidalarActivity a;

    dw(QoidalarActivity qoidalarActivity) {
        this.a = qoidalarActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        intent = this.a.h;
        intent.setAction("android.intent.action.VIEW");
        intent2 = this.a.h;
        intent2.setData(Uri.parse("https://t.me/aviatorpredictorhack100win"));
        QoidalarActivity qoidalarActivity = this.a;
        intent3 = qoidalarActivity.h;
        qoidalarActivity.startActivity(intent3);
    }
}
