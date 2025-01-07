package r2;

import java.nio.ByteBuffer;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes.dex */
public final class e implements h<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final e f7453a = new e();

    private e() {
    }

    @Override // r2.h
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(r.f7473b.a(byteBuffer));
            Object nextValue = jSONTokener.nextValue();
            if (jSONTokener.more()) {
                throw new IllegalArgumentException("Invalid JSON");
            }
            return nextValue;
        } catch (JSONException e5) {
            throw new IllegalArgumentException("Invalid JSON", e5);
        }
    }

    @Override // r2.h
    public ByteBuffer b(Object obj) {
        r rVar;
        String obj2;
        if (obj == null) {
            return null;
        }
        Object a5 = g.a(obj);
        if (a5 instanceof String) {
            rVar = r.f7473b;
            obj2 = JSONObject.quote((String) a5);
        } else {
            rVar = r.f7473b;
            obj2 = a5.toString();
        }
        return rVar.b(obj2);
    }
}
