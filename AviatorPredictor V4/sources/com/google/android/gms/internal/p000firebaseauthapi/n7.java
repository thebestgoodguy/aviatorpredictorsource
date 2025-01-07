package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.IOException;

/* loaded from: classes.dex */
public final class n7 implements g3 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences.Editor f1957a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1958b = "GenericIdpKeyset";

    public n7(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f1957a = (str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0)).edit();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g3
    public final void a(pb pbVar) {
        if (!this.f1957a.putString(this.f1958b, nf.a(pbVar.m())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.g3
    public final void b(fd fdVar) {
        if (!this.f1957a.putString(this.f1958b, nf.a(fdVar.m())).commit()) {
            throw new IOException("Failed to write to SharedPreferences");
        }
    }
}
