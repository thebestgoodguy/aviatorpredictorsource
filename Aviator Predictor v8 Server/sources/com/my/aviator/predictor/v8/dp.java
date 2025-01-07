package com.my.aviator.predictor.v8;

import android.content.DialogInterface;

/* loaded from: classes62.dex */
class dp implements DialogInterface.OnClickListener {
    final /* synthetic */ MainActivity a;

    dp(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r2) {
        this.a.finish();
    }
}
