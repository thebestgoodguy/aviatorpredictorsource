package a1;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.c2;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
final class c0 {

    /* renamed from: a, reason: collision with root package name */
    private static final z.a f23a = new z.a("JSONParser", new String[0]);

    static List a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < jSONArray.length(); r12++) {
            Object obj = jSONArray.get(r12);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            arrayList.add(obj);
        }
        return arrayList;
    }

    public static Map b(String str) {
        w.r.e(str);
        List d5 = c2.b('.').d(str);
        if (d5.size() < 2) {
            f23a.c("Invalid idToken ".concat(String.valueOf(str)), new Object[0]);
            return new HashMap();
        }
        try {
            Map c5 = c(new String(b0.c.b((String) d5.get(1)), "UTF-8"));
            return c5 == null ? new HashMap() : c5;
        } catch (UnsupportedEncodingException e5) {
            f23a.b("Unable to decode token", e5, new Object[0]);
            return new HashMap();
        }
    }

    public static Map c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject != JSONObject.NULL) {
                return d(jSONObject);
            }
            return null;
        } catch (Exception e5) {
            Log.d("JSONParser", "Failed to parse JSONObject into Map.");
            throw new zf(e5);
        }
    }

    static Map d(JSONObject jSONObject) {
        e.a aVar = new e.a();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONArray) {
                obj = a((JSONArray) obj);
            } else if (obj instanceof JSONObject) {
                obj = d((JSONObject) obj);
            }
            aVar.put(next, obj);
        }
        return aVar;
    }
}
