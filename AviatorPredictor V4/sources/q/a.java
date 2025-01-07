package q;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import w.r;

/* loaded from: classes.dex */
public class a {

    /* renamed from: c, reason: collision with root package name */
    private static final Lock f7127c = new ReentrantLock();

    /* renamed from: d, reason: collision with root package name */
    private static a f7128d;

    /* renamed from: a, reason: collision with root package name */
    private final Lock f7129a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f7130b;

    a(Context context) {
        this.f7130b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static a a(Context context) {
        r.i(context);
        Lock lock = f7127c;
        lock.lock();
        try {
            if (f7128d == null) {
                f7128d = new a(context.getApplicationContext());
            }
            a aVar = f7128d;
            lock.unlock();
            return aVar;
        } catch (Throwable th) {
            f7127c.unlock();
            throw th;
        }
    }

    private static final String d(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }

    public GoogleSignInAccount b() {
        String c5;
        String c6 = c("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(c6) || (c5 = c(d("googleSignInAccount", c6))) == null) {
            return null;
        }
        try {
            return GoogleSignInAccount.r0(c5);
        } catch (JSONException unused) {
            return null;
        }
    }

    protected final String c(String str) {
        this.f7129a.lock();
        try {
            return this.f7130b.getString(str, null);
        } finally {
            this.f7129a.unlock();
        }
    }
}
