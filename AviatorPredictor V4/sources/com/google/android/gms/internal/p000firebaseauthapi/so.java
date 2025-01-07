package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b0.l;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class so extends a implements om<so> {

    /* renamed from: e, reason: collision with root package name */
    private wo f2142e;

    /* renamed from: f, reason: collision with root package name */
    private static final String f2141f = so.class.getSimpleName();
    public static final Parcelable.Creator<so> CREATOR = new to();

    public so() {
    }

    so(wo woVar) {
        this.f2142e = woVar == null ? new wo() : wo.j0(woVar);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        wo woVar;
        int r24;
        uo uoVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has("users")) {
                JSONArray optJSONArray = jSONObject.optJSONArray("users");
                Parcelable.Creator<wo> creator = wo.CREATOR;
                if (optJSONArray != null && optJSONArray.length() != 0) {
                    ArrayList arrayList = new ArrayList(optJSONArray.length());
                    boolean z4 = false;
                    int r5 = 0;
                    while (r5 < optJSONArray.length()) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(r5);
                        if (jSONObject2 == null) {
                            uoVar = new uo();
                            r24 = r5;
                        } else {
                            r24 = r5;
                            uoVar = new uo(l.a(jSONObject2.optString("localId", null)), l.a(jSONObject2.optString("email", null)), jSONObject2.optBoolean("emailVerified", z4), l.a(jSONObject2.optString("displayName", null)), l.a(jSONObject2.optString("photoUrl", null)), jp.j0(jSONObject2.optJSONArray("providerUserInfo")), l.a(jSONObject2.optString("rawPassword", null)), l.a(jSONObject2.optString("phoneNumber", null)), jSONObject2.optLong("createdAt", 0L), jSONObject2.optLong("lastLoginAt", 0L), false, null, fp.o0(jSONObject2.optJSONArray("mfaInfo")));
                        }
                        arrayList.add(uoVar);
                        r5 = r24 + 1;
                        z4 = false;
                    }
                    woVar = new wo(arrayList);
                }
                woVar = new wo(new ArrayList());
            } else {
                woVar = new wo();
            }
            this.f2142e = woVar;
            return this;
        } catch (NullPointerException | JSONException e5) {
            throw pq.a(e5, f2141f, str);
        }
    }

    public final List j0() {
        return this.f2142e.k0();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r6) {
        int a5 = c.a(parcel);
        c.l(parcel, 2, this.f2142e, r6, false);
        c.b(parcel, a5);
    }
}
