package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Parcel;
import android.os.Parcelable;
import b0.l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import x.a;
import x.c;

/* loaded from: classes.dex */
public final class jp extends a {
    public static final Parcelable.Creator<jp> CREATOR = new kp();

    /* renamed from: e, reason: collision with root package name */
    private final List f1821e;

    public jp() {
        this.f1821e = new ArrayList();
    }

    jp(List list) {
        this.f1821e = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(list);
    }

    public static jp j0(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() == 0) {
            return new jp(new ArrayList());
        }
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < jSONArray.length(); r12++) {
            JSONObject jSONObject = jSONArray.getJSONObject(r12);
            arrayList.add(jSONObject == null ? new hp() : new hp(l.a(jSONObject.optString("federatedId", null)), l.a(jSONObject.optString("displayName", null)), l.a(jSONObject.optString("photoUrl", null)), l.a(jSONObject.optString("providerId", null)), null, l.a(jSONObject.optString("phoneNumber", null)), l.a(jSONObject.optString("email", null))));
        }
        return new jp(arrayList);
    }

    public static jp k0(jp jpVar) {
        List list = jpVar.f1821e;
        jp jpVar2 = new jp();
        if (list != null) {
            jpVar2.f1821e.addAll(list);
        }
        return jpVar2;
    }

    public final List l0() {
        return this.f1821e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = c.a(parcel);
        c.q(parcel, 2, this.f1821e, false);
        c.b(parcel, a5);
    }
}
