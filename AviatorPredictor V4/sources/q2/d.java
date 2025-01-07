package q2;

import android.view.KeyEvent;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import q2.d;
import r2.a;

/* loaded from: classes.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final r2.a<Object> f7199a;

    public interface a {
        void a(boolean z4);
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final KeyEvent f7200a;

        /* renamed from: b, reason: collision with root package name */
        public final Character f7201b;

        public b(KeyEvent keyEvent, Character ch) {
            this.f7200a = keyEvent;
            this.f7201b = ch;
        }
    }

    public d(r2.b bVar) {
        this.f7199a = new r2.a<>(bVar, "flutter/keyevent", r2.e.f7453a);
    }

    private static a.e<Object> b(final a aVar) {
        return new a.e() { // from class: q2.c
            @Override // r2.a.e
            public final void a(Object obj) {
                d.d(d.a.this, obj);
            }
        };
    }

    private Map<String, Object> c(b bVar, boolean z4) {
        HashMap hashMap = new HashMap();
        hashMap.put("type", z4 ? "keyup" : "keydown");
        hashMap.put("keymap", "android");
        hashMap.put("flags", Integer.valueOf(bVar.f7200a.getFlags()));
        hashMap.put("plainCodePoint", Integer.valueOf(bVar.f7200a.getUnicodeChar(0)));
        hashMap.put("codePoint", Integer.valueOf(bVar.f7200a.getUnicodeChar()));
        hashMap.put("keyCode", Integer.valueOf(bVar.f7200a.getKeyCode()));
        hashMap.put("scanCode", Integer.valueOf(bVar.f7200a.getScanCode()));
        hashMap.put("metaState", Integer.valueOf(bVar.f7200a.getMetaState()));
        Character ch = bVar.f7201b;
        if (ch != null) {
            hashMap.put("character", ch.toString());
        }
        hashMap.put("source", Integer.valueOf(bVar.f7200a.getSource()));
        hashMap.put("deviceId", Integer.valueOf(bVar.f7200a.getDeviceId()));
        hashMap.put("repeatCount", Integer.valueOf(bVar.f7200a.getRepeatCount()));
        return hashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(a aVar, Object obj) {
        boolean z4 = false;
        if (obj != null) {
            try {
                z4 = ((JSONObject) obj).getBoolean("handled");
            } catch (JSONException e5) {
                e2.b.b("KeyEventChannel", "Unable to unpack JSON message: " + e5);
            }
        }
        aVar.a(z4);
    }

    public void e(b bVar, boolean z4, a aVar) {
        this.f7199a.d(c(bVar, z4), b(aVar));
    }
}
