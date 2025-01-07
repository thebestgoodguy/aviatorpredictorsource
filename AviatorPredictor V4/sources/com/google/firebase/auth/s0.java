package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class s0 extends i0 {
    public static final Parcelable.Creator<s0> CREATOR = new g1();

    /* renamed from: e, reason: collision with root package name */
    private final String f2566e;

    /* renamed from: f, reason: collision with root package name */
    private final String f2567f;

    /* renamed from: g, reason: collision with root package name */
    private final long f2568g;

    /* renamed from: h, reason: collision with root package name */
    private final String f2569h;

    public s0(String str, String str2, long j4, String str3) {
        this.f2566e = w.r.e(str);
        this.f2567f = str2;
        this.f2568g = j4;
        this.f2569h = w.r.e(str3);
    }

    @Override // com.google.firebase.auth.i0
    public String R() {
        return this.f2567f;
    }

    public String X() {
        return this.f2569h;
    }

    @Override // com.google.firebase.auth.i0
    public String e() {
        return this.f2566e;
    }

    @Override // com.google.firebase.auth.i0
    public long j0() {
        return this.f2568g;
    }

    @Override // com.google.firebase.auth.i0
    public String k0() {
        return "phone";
    }

    @Override // com.google.firebase.auth.i0
    public JSONObject l0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.f2566e);
            jSONObject.putOpt("displayName", this.f2567f);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.f2568g));
            jSONObject.putOpt("phoneNumber", this.f2569h);
            return jSONObject;
        } catch (JSONException e5) {
            Log.d("PhoneMultiFactorInfo", "Failed to jsonify this object");
            throw new zf(e5);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, e(), false);
        x.c.m(parcel, 2, R(), false);
        x.c.j(parcel, 3, j0());
        x.c.m(parcel, 4, X(), false);
        x.c.b(parcel, a5);
    }
}
