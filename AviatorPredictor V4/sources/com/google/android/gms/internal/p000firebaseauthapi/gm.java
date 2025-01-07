package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import java.net.HttpURLConnection;
import java.net.URL;
import z.a;

/* loaded from: classes.dex */
public interface gm {

    /* renamed from: b, reason: collision with root package name */
    public static final a f1684b = new a("FirebaseAuth", "GetAuthDomainTaskResponseHandler");

    Context a();

    Uri.Builder c(Intent intent, String str, String str2);

    String d(String str);

    HttpURLConnection f(URL url);

    void h(String str, Status status);

    void k(Uri uri, String str);
}
