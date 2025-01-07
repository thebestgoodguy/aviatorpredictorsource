package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.do, reason: invalid class name */
/* loaded from: classes.dex */
public final class Cdo implements om {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1527f = "com.google.android.gms.internal.firebase-auth-api.do";

    /* renamed from: e, reason: collision with root package name */
    private String f1528e;

    public final Cdo a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(new JSONObject(str).getString("error"));
            jSONObject.getInt("code");
            this.f1528e = jSONObject.getString("message");
            return this;
        } catch (NullPointerException | JSONException e5) {
            Log.e(f1527f, "Failed to parse error for string [" + str + "] with exception: " + e5.getMessage());
            throw new jk("Failed to parse error for string [" + str + "]", e5);
        }
    }

    public final String b() {
        return this.f1528e;
    }

    public final boolean c() {
        return !TextUtils.isEmpty(this.f1528e);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        a(str);
        return this;
    }
}
