package com.google.android.gms.internal.p000firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ap implements om {

    /* renamed from: f, reason: collision with root package name */
    private static final String f1398f = "ap";

    /* renamed from: e, reason: collision with root package name */
    private List f1399e;

    public final ap a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f1399e = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("authorizedDomains");
            if (optJSONArray != null) {
                for (int r12 = 0; r12 < optJSONArray.length(); r12++) {
                    this.f1399e.add(optJSONArray.getString(r12));
                }
            }
            return this;
        } catch (JSONException e5) {
            throw pq.a(e5, f1398f, str);
        }
    }

    public final List b() {
        return this.f1399e;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.om
    public final /* bridge */ /* synthetic */ om d(String str) {
        a(str);
        return this;
    }
}
