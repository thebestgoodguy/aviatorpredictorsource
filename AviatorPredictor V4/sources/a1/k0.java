package a1;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.bp;
import com.google.android.gms.internal.p000firebaseauthapi.zf;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f69a;

    /* renamed from: b, reason: collision with root package name */
    private final String f70b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences f71c;

    /* renamed from: d, reason: collision with root package name */
    private final z.a f72d;

    public k0(Context context, String str) {
        w.r.i(context);
        String e5 = w.r.e(str);
        this.f70b = e5;
        Context applicationContext = context.getApplicationContext();
        this.f69a = applicationContext;
        this.f71c = applicationContext.getSharedPreferences(String.format("com.google.firebase.auth.api.Store.%s", e5), 0);
        this.f72d = new z.a("StorageHelpers", new String[0]);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce A[Catch: zf -> 0x0135, IllegalArgumentException -> 0x0137, ArrayIndexOutOfBoundsException -> 0x0139, JSONException -> 0x013b, TRY_ENTER, TryCatch #3 {JSONException -> 0x013b, blocks: (B:3:0x0008, B:6:0x0025, B:10:0x003b, B:13:0x0079, B:16:0x0080, B:17:0x008c, B:20:0x008d, B:22:0x009c, B:24:0x00a5, B:25:0x00a8, B:27:0x00b1, B:31:0x00ce, B:36:0x00d1, B:38:0x00d7, B:40:0x00dd, B:41:0x00e3, B:43:0x00e9, B:45:0x0100, B:47:0x0108, B:49:0x012b, B:51:0x0122, B:52:0x0129, B:56:0x0131), top: B:2:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final a1.m1 f(org.json.JSONObject r27) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.k0.f(org.json.JSONObject):a1.m1");
    }

    public final com.google.firebase.auth.z a() {
        String string = this.f71c.getString("com.google.firebase.auth.FIREBASE_USER", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(string);
            if (jSONObject.has("type") && "com.google.firebase.auth.internal.DefaultFirebaseUser".equalsIgnoreCase(jSONObject.optString("type"))) {
                return f(jSONObject);
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public final bp b(com.google.firebase.auth.z zVar) {
        w.r.i(zVar);
        String string = this.f71c.getString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.e()), null);
        if (string != null) {
            return bp.l0(string);
        }
        return null;
    }

    public final void c(String str) {
        this.f71c.edit().remove(str).apply();
    }

    public final void d(com.google.firebase.auth.z zVar) {
        String str;
        w.r.i(zVar);
        JSONObject jSONObject = new JSONObject();
        if (m1.class.isAssignableFrom(zVar.getClass())) {
            m1 m1Var = (m1) zVar;
            try {
                jSONObject.put("cachedTokenState", m1Var.H0());
                jSONObject.put("applicationName", m1Var.C0().q());
                jSONObject.put("type", "com.google.firebase.auth.internal.DefaultFirebaseUser");
                if (m1Var.P0() != null) {
                    JSONArray jSONArray = new JSONArray();
                    List P0 = m1Var.P0();
                    int size = P0.size();
                    if (P0.size() > 30) {
                        this.f72d.h("Provider user info list size larger than max size, truncating list to %d. Actual list size: %d", 30, Integer.valueOf(P0.size()));
                        size = 30;
                    }
                    for (int r5 = 0; r5 < size; r5++) {
                        jSONArray.put(((i1) P0.get(r5)).j0());
                    }
                    jSONObject.put("userInfos", jSONArray);
                }
                jSONObject.put("anonymous", m1Var.p0());
                jSONObject.put("version", "2");
                if (m1Var.l0() != null) {
                    jSONObject.put("userMetadata", ((o1) m1Var.l0()).a());
                }
                List<com.google.firebase.auth.i0> b5 = new f(m1Var).b();
                if (!b5.isEmpty()) {
                    JSONArray jSONArray2 = new JSONArray();
                    for (int r32 = 0; r32 < b5.size(); r32++) {
                        jSONArray2.put(b5.get(r32).l0());
                    }
                    jSONObject.put("userMultiFactorInfo", jSONArray2);
                }
                str = jSONObject.toString();
            } catch (Exception e5) {
                this.f72d.i("Failed to turn object into JSON", e5, new Object[0]);
                throw new zf(e5);
            }
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f71c.edit().putString("com.google.firebase.auth.FIREBASE_USER", str).apply();
    }

    public final void e(com.google.firebase.auth.z zVar, bp bpVar) {
        w.r.i(zVar);
        w.r.i(bpVar);
        this.f71c.edit().putString(String.format("com.google.firebase.auth.GET_TOKEN_RESPONSE.%s", zVar.e()), bpVar.p0()).apply();
    }
}
