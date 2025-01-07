package com.my.aviator.predictor.v8;

import android.app.Activity;
import java.util.HashMap;

/* loaded from: classes62.dex */
public class dy {
    private Activity c;
    private HashMap<String, Object> a = new HashMap<>();
    private HashMap<String, Object> b = new HashMap<>();
    private int d = 0;

    public dy(Activity activity) {
        this.c = activity;
    }

    public HashMap<String, Object> a() {
        return this.a;
    }

    public void a(String str, String str2, String str3, dz dzVar) {
        ea.a().a(this, str, str2, str3, dzVar);
    }

    public HashMap<String, Object> b() {
        return this.b;
    }

    public Activity c() {
        return this.c;
    }

    public int d() {
        return this.d;
    }
}
