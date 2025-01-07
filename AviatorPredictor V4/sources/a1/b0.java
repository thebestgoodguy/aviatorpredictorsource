package a1;

import com.google.android.gms.internal.p000firebaseauthapi.zf;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    private static final z.a f17a = new z.a("GetTokenResultFactory", new String[0]);

    public static com.google.firebase.auth.b0 a(String str) {
        Map hashMap;
        try {
            hashMap = c0.b(str);
        } catch (zf e5) {
            f17a.b("Error parsing token claims", e5, new Object[0]);
            hashMap = new HashMap();
        }
        return new com.google.firebase.auth.b0(str, hashMap);
    }
}
