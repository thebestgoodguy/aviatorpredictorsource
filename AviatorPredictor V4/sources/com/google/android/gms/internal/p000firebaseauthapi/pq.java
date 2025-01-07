package com.google.android.gms.internal.p000firebaseauthapi;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;

/* loaded from: classes.dex */
public final class pq {
    public static jk a(Exception exc, String str, String str2) {
        Log.e(str, "Failed to parse " + str + " for string [" + str2 + "] with exception: " + exc.getMessage());
        return new jk("Failed to parse " + str + " for string [" + str2 + "]", exc);
    }

    public static List b(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() != 0) {
            for (int r12 = 0; r12 < jSONArray.length(); r12++) {
                arrayList.add(jSONArray.getString(r12));
            }
        }
        return arrayList;
    }
}
