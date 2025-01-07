package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.view.View;

/* loaded from: classes62.dex */
class cx implements View.OnClickListener {
    final /* synthetic */ IbooActivity a;

    cx(IbooActivity ibooActivity) {
        this.a = ibooActivity;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Intent intent;
        Intent intent2;
        intent = this.a.j;
        intent.setClass(this.a.getApplicationContext(), Ibooo2Activity.class);
        IbooActivity ibooActivity = this.a;
        intent2 = ibooActivity.j;
        ibooActivity.startActivity(intent2);
        this.a.finish();
    }
}
