package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

/* loaded from: classes.dex */
public final class j1 {

    /* renamed from: f, reason: collision with root package name */
    private static final Uri f8001f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a, reason: collision with root package name */
    private final String f8002a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8003b;

    /* renamed from: c, reason: collision with root package name */
    private final ComponentName f8004c;

    /* renamed from: d, reason: collision with root package name */
    private final int f8005d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f8006e;

    public j1(String str, String str2, int r32, boolean z4) {
        r.e(str);
        this.f8002a = str;
        r.e(str2);
        this.f8003b = str2;
        this.f8004c = null;
        this.f8005d = r32;
        this.f8006e = z4;
    }

    public final int a() {
        return this.f8005d;
    }

    public final ComponentName b() {
        return this.f8004c;
    }

    public final Intent c(Context context) {
        Bundle bundle;
        if (this.f8002a == null) {
            return new Intent().setComponent(this.f8004c);
        }
        if (this.f8006e) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("serviceActionBundleKey", this.f8002a);
            try {
                bundle = context.getContentResolver().call(f8001f, "serviceIntentCall", (String) null, bundle2);
            } catch (IllegalArgumentException e5) {
                Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e5.toString()));
                bundle = null;
            }
            r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
            if (r2 == null) {
                String valueOf = String.valueOf(this.f8002a);
                Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
            }
        }
        return r2 != null ? r2 : new Intent(this.f8002a).setPackage(this.f8003b);
    }

    public final String d() {
        return this.f8003b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j1)) {
            return false;
        }
        j1 j1Var = (j1) obj;
        return p.a(this.f8002a, j1Var.f8002a) && p.a(this.f8003b, j1Var.f8003b) && p.a(this.f8004c, j1Var.f8004c) && this.f8005d == j1Var.f8005d && this.f8006e == j1Var.f8006e;
    }

    public final int hashCode() {
        return p.b(this.f8002a, this.f8003b, this.f8004c, Integer.valueOf(this.f8005d), Boolean.valueOf(this.f8006e));
    }

    public final String toString() {
        String str = this.f8002a;
        if (str != null) {
            return str;
        }
        r.i(this.f8004c);
        return this.f8004c.flattenToString();
    }
}
