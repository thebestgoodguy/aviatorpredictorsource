package a1;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: d, reason: collision with root package name */
    private static final List f49d = new ArrayList(Arrays.asList("firebaseAppName", "firebaseUserUid", "operation", "tenantId", "verifyAssertionRequest", "statusCode", "statusMessage", "timestamp"));

    /* renamed from: e, reason: collision with root package name */
    private static final h0 f50e = new h0();

    /* renamed from: a, reason: collision with root package name */
    private o0.h f51a;

    /* renamed from: b, reason: collision with root package name */
    private o0.h f52b;

    /* renamed from: c, reason: collision with root package name */
    private long f53c = 0;

    private h0() {
    }

    public static h0 b() {
        return f50e;
    }

    private static final void e(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        Iterator it = f49d.iterator();
        while (it.hasNext()) {
            edit.remove((String) it.next());
        }
        edit.commit();
    }

    public final o0.h a() {
        if (b0.f.b().a() - this.f53c < 3600000) {
            return this.f52b;
        }
        return null;
    }

    public final void c(Context context) {
        w.r.i(context);
        e(context.getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0));
        this.f51a = null;
        this.f53c = 0L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        if (r4.equals("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN") == false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(com.google.firebase.auth.FirebaseAuth r13) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.h0.d(com.google.firebase.auth.FirebaseAuth):void");
    }
}
