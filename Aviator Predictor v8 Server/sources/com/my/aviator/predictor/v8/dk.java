package com.my.aviator.predictor.v8;

import android.app.AlertDialog;
import java.util.HashMap;

/* loaded from: classes62.dex */
class dk implements dz {
    final /* synthetic */ MainActivity a;

    dk(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // com.my.aviator.predictor.v8.dz
    public void a(String str, String str2) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2;
        AlertDialog.Builder builder3;
        AlertDialog.Builder builder4;
        AlertDialog.Builder builder5;
        AlertDialog.Builder builder6;
        AlertDialog.Builder builder7;
        builder = this.a.x;
        builder.setIcon(R.drawable.ic_signal_wifi_statusbar_connected_no_internet_1_black);
        builder2 = this.a.x;
        builder2.setTitle("system notice");
        builder3 = this.a.x;
        builder3.setMessage("No internet connection");
        builder4 = this.a.x;
        builder4.setPositiveButton("Retry", new dl(this));
        builder5 = this.a.x;
        builder5.setNegativeButton("Exit", new dm(this));
        builder6 = this.a.x;
        builder6.setCancelable(false);
        builder7 = this.a.x;
        builder7.create().show();
    }

    @Override // com.my.aviator.predictor.v8.dz
    public void a(String str, String str2, HashMap<String, Object> hashMap) {
    }
}
