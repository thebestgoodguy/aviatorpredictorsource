package com.my.aviator.predictor.v8;

import android.content.DialogInterface;
import androidx.exifinterface.media.ExifInterface;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes62.dex */
class dl implements DialogInterface.OnClickListener {
    final /* synthetic */ dk a;

    dl(dk dkVar) {
        this.a = dkVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int r5) {
        MainActivity mainActivity;
        dy dyVar;
        MainActivity mainActivity2;
        dz dzVar;
        mainActivity = this.a.a;
        dyVar = mainActivity.v;
        mainActivity2 = this.a.a;
        dzVar = mainActivity2.w;
        dyVar.a(HttpGet.METHOD_NAME, "https://www.google.com", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, dzVar);
    }
}
