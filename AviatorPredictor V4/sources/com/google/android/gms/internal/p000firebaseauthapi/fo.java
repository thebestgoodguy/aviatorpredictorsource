package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class fo extends a implements om<fo> {

    /* renamed from: e, reason: collision with root package name */
    private String f1655e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1656f;

    /* renamed from: g, reason: collision with root package name */
    private String f1657g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1658h;

    /* renamed from: i, reason: collision with root package name */
    private aq f1659i;

    /* renamed from: j, reason: collision with root package name */
    private List f1660j;

    /* renamed from: k, reason: collision with root package name */
    private static final String f1654k = fo.class.getSimpleName();
    public static final Parcelable.Creator<fo> CREATOR = new go();

    public fo() {
        this.f1659i = new aq(null);
    }

    public fo(String str, boolean z4, String str2, boolean z5, aq aqVar, List list) {
        this.f1655e = str;
        this.f1656f = z4;
        this.f1657g = str2;
        this.f1658h = z5;
        this.f1659i = aqVar == null ? new aq(null) : aq.j0(aqVar);
        this.f1660j = list;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1655e = jSONObject.optString("authUri", null);
            this.f1656f = jSONObject.optBoolean("registered", false);
            this.f1657g = jSONObject.optString("providerId", null);
            this.f1658h = jSONObject.optBoolean("forExistingProvider", false);
            if (jSONObject.has("allProviders")) {
                this.f1659i = new aq(1, pq.b(jSONObject.optJSONArray("allProviders")));
            } else {
                this.f1659i = new aq(null);
            }
            this.f1660j = pq.b(jSONObject.optJSONArray("signinMethods"));
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f1654k, str);
        }
    }

    public final List j0() {
        return this.f1660j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.m(parcel, 2, this.f1655e, false);
        c.c(parcel, 3, this.f1656f);
        c.m(parcel, 4, this.f1657g, false);
        c.c(parcel, 5, this.f1658h);
        c.l(parcel, 6, this.f1659i, r6, false);
        c.o(parcel, 7, this.f1660j, false);
        c.b(parcel, a5);
    }
}
