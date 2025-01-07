package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.util.Log;
import com.google.firebase.auth.FirebaseAuth;
import java.net.URLConnection;
import java.util.concurrent.ExecutionException;
import o0.k;
import q1.j;
import w.r;
import x0.e;

/* loaded from: classes.dex */
public final class rm {

    /* renamed from: a, reason: collision with root package name */
    private final Context f2096a;

    /* renamed from: b, reason: collision with root package name */
    private mn f2097b;

    /* renamed from: c, reason: collision with root package name */
    private final String f2098c;

    /* renamed from: d, reason: collision with root package name */
    private final e f2099d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f2100e = false;

    /* renamed from: f, reason: collision with root package name */
    private String f2101f;

    public rm(Context context, e eVar, String str) {
        this.f2096a = (Context) r.i(context);
        this.f2099d = (e) r.i(eVar);
        this.f2098c = String.format("Android/%s/%s", "Fallback", str);
    }

    public final void a(URLConnection uRLConnection) {
        String valueOf;
        String str;
        String str2;
        if (this.f2100e) {
            valueOf = String.valueOf(this.f2098c);
            str = "/FirebaseUI-Android";
        } else {
            valueOf = String.valueOf(this.f2098c);
            str = "/FirebaseCore-Android";
        }
        String concat = valueOf.concat(str);
        if (this.f2097b == null) {
            Context context = this.f2096a;
            this.f2097b = new mn(context, context.getPackageName());
        }
        uRLConnection.setRequestProperty("X-Android-Package", this.f2097b.b());
        uRLConnection.setRequestProperty("X-Android-Cert", this.f2097b.a());
        uRLConnection.setRequestProperty("Accept-Language", sm.a());
        uRLConnection.setRequestProperty("X-Client-Version", concat);
        uRLConnection.setRequestProperty("X-Firebase-Locale", this.f2101f);
        uRLConnection.setRequestProperty("X-Firebase-GMPID", this.f2099d.r().c());
        j jVar = (j) FirebaseAuth.getInstance(this.f2099d).p0().get();
        if (jVar != null) {
            try {
                str2 = (String) k.a(jVar.a());
            } catch (InterruptedException | ExecutionException e5) {
                Log.w("LocalRequestInterceptor", "Unable to get heartbeats: ".concat(String.valueOf(e5.getMessage())));
            }
            uRLConnection.setRequestProperty("X-Firebase-Client", str2);
            this.f2101f = null;
        }
        str2 = null;
        uRLConnection.setRequestProperty("X-Firebase-Client", str2);
        this.f2101f = null;
    }

    public final void b(String str) {
        this.f2101f = str;
    }
}
