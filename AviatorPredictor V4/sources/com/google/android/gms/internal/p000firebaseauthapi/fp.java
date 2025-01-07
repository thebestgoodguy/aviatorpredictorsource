package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class fp extends a {
    public static final Parcelable.Creator<fp> CREATOR = new gp();

    /* renamed from: e, reason: collision with root package name */
    private final String f1661e;

    /* renamed from: f, reason: collision with root package name */
    private final String f1662f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1663g;

    /* renamed from: h, reason: collision with root package name */
    private final long f1664h;

    /* renamed from: i, reason: collision with root package name */
    private String f1665i;

    public fp(String str, String str2, String str3, long j4) {
        this.f1661e = str;
        this.f1662f = r.e(str2);
        this.f1663g = str3;
        this.f1664h = j4;
    }

    public static fp k0(JSONObject jSONObject) {
        JSONObject optJSONObject;
        String optString = jSONObject.optString("phoneInfo", null);
        String optString2 = jSONObject.optString("mfaEnrollmentId", null);
        String optString3 = jSONObject.optString("displayName", null);
        long j4 = 0;
        if (jSONObject.has("enrolledAt") && (optJSONObject = jSONObject.optJSONObject("enrolledAt")) != null && optJSONObject.has("seconds")) {
            j4 = optJSONObject.optLong("seconds", 0L);
        }
        fp fpVar = new fp(optString, optString2, optString3, j4);
        fpVar.f1665i = jSONObject.optString("unobfuscatedPhoneInfo");
        return fpVar;
    }

    public static List o0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < jSONArray.length(); r12++) {
            arrayList.add(k0(jSONArray.getJSONObject(r12)));
        }
        return arrayList;
    }

    public final long j0() {
        return this.f1664h;
    }

    public final String l0() {
        return this.f1663g;
    }

    public final String m0() {
        return this.f1662f;
    }

    public final String n0() {
        return this.f1661e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 1, this.f1661e, false);
        c.m(parcel, 2, this.f1662f, false);
        c.m(parcel, 3, this.f1663g, false);
        c.j(parcel, 4, this.f1664h);
        c.b(parcel, a5);
    }
}
