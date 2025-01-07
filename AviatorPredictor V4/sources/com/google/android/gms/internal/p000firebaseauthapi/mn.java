package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.pm.PackageManager;
import android.util.Log;
import b0.a;
import b0.h;
import w.r;

/* loaded from: classes.dex */
public final class mn {

    /* renamed from: a, reason: collision with root package name */
    private final String f1935a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1936b;

    public mn(Context context, String str) {
        r.i(context);
        String e5 = r.e(str);
        this.f1935a = e5;
        try {
            byte[] a5 = a.a(context, e5);
            if (a5 != null) {
                this.f1936b = h.b(a5, false);
            } else {
                Log.e("FBA-PackageInfo", "single cert required: ".concat(String.valueOf(str)));
                this.f1936b = null;
            }
        } catch (PackageManager.NameNotFoundException unused) {
            Log.e("FBA-PackageInfo", "no pkg: ".concat(String.valueOf(str)));
            this.f1936b = null;
        }
    }

    public final String a() {
        return this.f1936b;
    }

    public final String b() {
        return this.f1935a;
    }
}
