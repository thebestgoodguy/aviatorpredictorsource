package a1;

import android.text.TextUtils;
import java.util.Map;

/* loaded from: classes.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    private boolean f54a;

    /* renamed from: b, reason: collision with root package name */
    private String f55b;

    private i0() {
    }

    public static i0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Map b5 = c0.b(str);
        try {
            i0 i0Var = new i0();
            Object obj = b5.get("basicIntegrity");
            boolean z4 = false;
            if (obj != null && ((Boolean) obj).booleanValue()) {
                z4 = true;
            }
            i0Var.f54a = z4;
            String str2 = (String) b5.get("advice");
            if (str2 == null) {
                str2 = "";
            }
            i0Var.f55b = str2;
            return i0Var;
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final String b() {
        return this.f55b;
    }

    public final boolean c() {
        return this.f54a;
    }
}
