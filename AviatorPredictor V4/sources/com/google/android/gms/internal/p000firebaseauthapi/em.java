package com.google.android.gms.internal.p000firebaseauthapi;

import a1.l;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import w.r;
import x0.e;
import z.a;

/* loaded from: classes.dex */
public final class em extends AsyncTask {

    /* renamed from: g, reason: collision with root package name */
    private static final a f1565g = new a("FirebaseAuth", "GetAuthDomainTask");

    /* renamed from: a, reason: collision with root package name */
    private final String f1566a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1567b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference f1568c;

    /* renamed from: d, reason: collision with root package name */
    private final Uri.Builder f1569d;

    /* renamed from: e, reason: collision with root package name */
    private final String f1570e;

    /* renamed from: f, reason: collision with root package name */
    private final e f1571f;

    public em(String str, String str2, Intent intent, e eVar, gm gmVar) {
        this.f1566a = r.e(str);
        this.f1571f = (e) r.i(eVar);
        r.e(str2);
        r.i(intent);
        String e5 = r.e(intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY"));
        Uri.Builder buildUpon = Uri.parse(gmVar.d(e5)).buildUpon();
        buildUpon.appendPath("getProjectConfig").appendQueryParameter("key", e5).appendQueryParameter("androidPackageName", str).appendQueryParameter("sha1Cert", (String) r.i(str2));
        this.f1567b = buildUpon.build().toString();
        this.f1568c = new WeakReference(gmVar);
        this.f1569d = gmVar.c(intent, str, str2);
        this.f1570e = intent.getStringExtra("com.google.firebase.auth.KEY_CUSTOM_AUTH_DOMAIN");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final void onPostExecute(dm dmVar) {
        String str;
        Uri.Builder builder;
        gm gmVar = (gm) this.f1568c.get();
        String str2 = null;
        if (dmVar != null) {
            str2 = dmVar.c();
            str = dmVar.d();
        } else {
            str = null;
        }
        if (gmVar == null) {
            f1565g.c("An error has occurred: the handler reference has returned null.", new Object[0]);
        } else if (TextUtils.isEmpty(str2) || (builder = this.f1569d) == null) {
            gmVar.h(this.f1566a, l.a(str));
        } else {
            builder.authority(str2);
            gmVar.k(this.f1569d.build(), this.f1566a);
        }
    }

    private static byte[] b(InputStream inputStream, int r4) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byte[] bArr = new byte[128];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    return byteArrayOutputStream.toByteArray();
                }
                byteArrayOutputStream.write(bArr, 0, read);
            }
        } finally {
            byteArrayOutputStream.close();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009d, code lost:
    
        r1 = 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v8, types: [int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ java.lang.Object doInBackground(java.lang.Object[] r7) {
        /*
            Method dump skipped, instructions count: 319
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p000firebaseauthapi.em.doInBackground(java.lang.Object[]):java.lang.Object");
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ void onCancelled(Object obj) {
        onPostExecute(null);
    }
}
