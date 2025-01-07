package r2;

import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final String f7455a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7456b;

    public i(String str, Object obj) {
        this.f7455a = str;
        this.f7456b = obj;
    }

    public <T> T a(String str) {
        Object obj = this.f7456b;
        if (obj == null) {
            return null;
        }
        if (obj instanceof Map) {
            return (T) ((Map) obj).get(str);
        }
        if (obj instanceof JSONObject) {
            return (T) ((JSONObject) obj).opt(str);
        }
        throw new ClassCastException();
    }

    public <T> T b() {
        return (T) this.f7456b;
    }
}
