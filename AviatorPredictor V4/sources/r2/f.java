package r2;

import java.nio.ByteBuffer;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class f implements k {

    /* renamed from: a, reason: collision with root package name */
    public static final f f7454a = new f();

    private f() {
    }

    @Override // r2.k
    public ByteBuffer a(Object obj) {
        return e.f7453a.b(new JSONArray().put(g.a(obj)));
    }

    @Override // r2.k
    public i b(ByteBuffer byteBuffer) {
        try {
            Object a5 = e.f7453a.a(byteBuffer);
            if (a5 instanceof JSONObject) {
                JSONObject jSONObject = (JSONObject) a5;
                Object obj = jSONObject.get("method");
                Object g5 = g(jSONObject.opt("args"));
                if (obj instanceof String) {
                    return new i((String) obj, g5);
                }
            }
            throw new IllegalArgumentException("Invalid method call: " + a5);
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // r2.k
    public Object c(ByteBuffer byteBuffer) {
        try {
            Object a5 = e.f7453a.a(byteBuffer);
            if (a5 instanceof JSONArray) {
                JSONArray jSONArray = (JSONArray) a5;
                if (jSONArray.length() == 1) {
                    return g(jSONArray.opt(0));
                }
                if (jSONArray.length() == 3) {
                    Object obj = jSONArray.get(0);
                    Object g5 = g(jSONArray.opt(1));
                    Object g6 = g(jSONArray.opt(2));
                    if ((obj instanceof String) && (g5 == null || (g5 instanceof String))) {
                        throw new d((String) obj, (String) g5, g6);
                    }
                }
            }
            throw new IllegalArgumentException("Invalid envelope: " + a5);
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // r2.k
    public ByteBuffer d(String str, String str2, Object obj, String str3) {
        return e.f7453a.b(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)).put(g.a(str3)));
    }

    @Override // r2.k
    public ByteBuffer e(i iVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("method", iVar.f7455a);
            jSONObject.put("args", g.a(iVar.f7456b));
            return e.f7453a.b(jSONObject);
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // r2.k
    public ByteBuffer f(String str, String str2, Object obj) {
        return e.f7453a.b(new JSONArray().put(str).put(g.a(str2)).put(g.a(obj)));
    }

    Object g(Object obj) {
        if (obj == JSONObject.NULL) {
            return null;
        }
        return obj;
    }
}
