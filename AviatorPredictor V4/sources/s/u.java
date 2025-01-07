package s;

import android.os.RemoteException;
import android.util.Log;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import w.s1;
import w.t1;

/* loaded from: classes.dex */
abstract class u extends s1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f7506a;

    protected u(byte[] bArr) {
        w.r.a(bArr.length == 25);
        this.f7506a = Arrays.hashCode(bArr);
    }

    protected static byte[] f(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e5) {
            throw new AssertionError(e5);
        }
    }

    @Override // w.t1
    public final int c() {
        return this.f7506a;
    }

    @Override // w.t1
    public final d0.a e() {
        return d0.b.w(h());
    }

    public final boolean equals(Object obj) {
        d0.a e5;
        if (obj != null && (obj instanceof t1)) {
            try {
                t1 t1Var = (t1) obj;
                if (t1Var.c() == this.f7506a && (e5 = t1Var.e()) != null) {
                    return Arrays.equals(h(), (byte[]) d0.b.h(e5));
                }
                return false;
            } catch (RemoteException e6) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
            }
        }
        return false;
    }

    abstract byte[] h();

    public final int hashCode() {
        return this.f7506a;
    }
}
