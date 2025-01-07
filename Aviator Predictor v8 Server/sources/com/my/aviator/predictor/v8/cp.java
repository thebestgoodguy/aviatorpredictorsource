package com.my.aviator.predictor.v8;

import android.content.DialogInterface;

/* loaded from: classes62.dex */
class cp implements DialogInterface.OnClickListener {
    final /* synthetic */ DebugActivity a;

    cp(DebugActivity debugActivity) {
        this.a = debugActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r2) {
        this.a.finish();
    }
}
