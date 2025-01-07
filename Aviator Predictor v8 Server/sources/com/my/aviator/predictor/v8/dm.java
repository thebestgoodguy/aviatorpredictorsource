package com.my.aviator.predictor.v8;

import android.content.DialogInterface;

/* loaded from: classes62.dex */
class dm implements DialogInterface.OnClickListener {
    final /* synthetic */ dk a;

    dm(dk dkVar) {
        this.a = dkVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r2) {
        MainActivity mainActivity;
        mainActivity = this.a.a;
        mainActivity.finish();
    }
}
