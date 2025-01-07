package com.my.aviator.predictor.v8;

import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* loaded from: classes62.dex */
class ed implements Callback {
    final /* synthetic */ ea a;
    private final /* synthetic */ dy b;
    private final /* synthetic */ dz c;
    private final /* synthetic */ String d;

    ed(ea eaVar, dy dyVar, dz dzVar, String str) {
        this.a = eaVar;
        this.b = dyVar;
        this.c = dzVar;
        this.d = str;
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        this.b.c().runOnUiThread(new ee(this, this.c, this.d, iOException));
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        this.b.c().runOnUiThread(new ef(this, response, this.c, this.d, response.body().string().trim()));
    }
}
