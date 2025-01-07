package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import b0.f;
import b0.l;
import org.json.JSONException;
import org.json.JSONObject;
import w.r;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class bp extends a implements om<bp> {

    /* renamed from: e, reason: collision with root package name */
    private String f1438e;

    /* renamed from: f, reason: collision with root package name */
    private String f1439f;

    /* renamed from: g, reason: collision with root package name */
    private Long f1440g;

    /* renamed from: h, reason: collision with root package name */
    private String f1441h;

    /* renamed from: i, reason: collision with root package name */
    private Long f1442i;

    /* renamed from: j, reason: collision with root package name */
    private static final String f1437j = bp.class.getSimpleName();
    public static final Parcelable.Creator<bp> CREATOR = new cp();

    public bp() {
        this.f1442i = Long.valueOf(System.currentTimeMillis());
    }

    public bp(String str, String str2, Long l4, String str3) {
        this(str, str2, l4, str3, Long.valueOf(System.currentTimeMillis()));
    }

    bp(String str, String str2, Long l4, String str3, Long l5) {
        this.f1438e = str;
        this.f1439f = str2;
        this.f1440g = l4;
        this.f1441h = str3;
        this.f1442i = l5;
    }

    public static bp l0(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            bp bpVar = new bp();
            bpVar.f1438e = jSONObject.optString("refresh_token", null);
            bpVar.f1439f = jSONObject.optString("access_token", null);
            bpVar.f1440g = Long.valueOf(jSONObject.optLong("expires_in"));
            bpVar.f1441h = jSONObject.optString("token_type", null);
            bpVar.f1442i = Long.valueOf(jSONObject.optLong("issued_at"));
            return bpVar;
        } catch (JSONException e5) {
            Log.d(f1437j, "Failed to read GetTokenResponse from JSONObject");
            throw new zf(e5);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1438e = l.a(jSONObject.optString("refresh_token"));
            this.f1439f = l.a(jSONObject.optString("access_token"));
            this.f1440g = Long.valueOf(jSONObject.optLong("expires_in", 0L));
            this.f1441h = l.a(jSONObject.optString("token_type"));
            this.f1442i = Long.valueOf(System.currentTimeMillis());
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1437j, str);
        }
    }

    public final long j0() {
        Long l4 = this.f1440g;
        if (l4 == null) {
            return 0L;
        }
        return l4.longValue();
    }

    public final long k0() {
        return this.f1442i.longValue();
    }

    public final String m0() {
        return this.f1439f;
    }

    public final String n0() {
        return this.f1438e;
    }

    public final String o0() {
        return this.f1441h;
    }

    public final String p0() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.f1438e);
            jSONObject.put("access_token", this.f1439f);
            jSONObject.put("expires_in", this.f1440g);
            jSONObject.put("token_type", this.f1441h);
            jSONObject.put("issued_at", this.f1442i);
            return jSONObject.toString();
        } catch (JSONException e5) {
            Log.d(f1437j, "Failed to convert GetTokenResponse to JSON");
            throw new zf(e5);
        }
    }

    public final void q0(String str) {
        this.f1438e = r.e(str);
    }

    public final boolean r0() {
        return f.b().a() + 300000 < this.f1442i.longValue() + (this.f1440g.longValue() * 1000);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1438e, false);
        c.m(parcel, 3, this.f1439f, false);
        c.k(parcel, 4, Long.valueOf(j0()), false);
        c.m(parcel, 5, this.f1441h, false);
        c.k(parcel, 6, Long.valueOf(this.f1442i.longValue()), false);
        c.b(parcel, a5);
    }
}
