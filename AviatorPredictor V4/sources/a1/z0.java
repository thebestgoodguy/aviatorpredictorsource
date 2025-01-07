package a1;

import android.content.Context;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.internal.p000firebaseauthapi.g3;
import com.google.android.gms.internal.p000firebaseauthapi.h7;
import com.google.android.gms.internal.p000firebaseauthapi.i6;
import com.google.android.gms.internal.p000firebaseauthapi.im;
import com.google.android.gms.internal.p000firebaseauthapi.j7;
import com.google.android.gms.internal.p000firebaseauthapi.n2;
import com.google.android.gms.internal.p000firebaseauthapi.n6;
import com.google.android.gms.internal.p000firebaseauthapi.r2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: c, reason: collision with root package name */
    private static z0 f145c;

    /* renamed from: a, reason: collision with root package name */
    private final String f146a;

    /* renamed from: b, reason: collision with root package name */
    private final j7 f147b;

    private z0(Context context, String str, boolean z4) {
        j7 j7Var;
        this.f146a = str;
        try {
            i6.a();
            h7 h7Var = new h7();
            h7Var.f(context, "GenericIdpKeyset", String.format("com.google.firebase.auth.api.crypto.%s", str));
            h7Var.d(n6.f1954b);
            h7Var.e(String.format("android-keystore://firebear_master_key_id.%s", str));
            j7Var = h7Var.g();
        } catch (IOException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered during crypto setup:\n".concat(String.valueOf(e5.getMessage())));
            j7Var = null;
        }
        this.f147b = j7Var;
    }

    public static z0 a(Context context, String str) {
        z0 z0Var = f145c;
        if (z0Var == null || !im.a(z0Var.f146a, str)) {
            f145c = new z0(context, str, true);
        }
        return f145c;
    }

    public final String b(String str) {
        String str2;
        j7 j7Var = this.f147b;
        if (j7Var == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to decrypt payload");
            return null;
        }
        try {
            synchronized (j7Var) {
                str2 = new String(((r2) this.f147b.a().e(r2.class)).a(Base64.decode(str, 8), null), "UTF-8");
            }
            return str2;
        } catch (UnsupportedEncodingException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered while decrypting bytes:\n".concat(String.valueOf(e5.getMessage())));
            return null;
        }
    }

    public final String c() {
        if (this.f147b == null) {
            Log.e("FirebearCryptoHelper", "KeysetManager failed to initialize - unable to get Public key");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        g3 c5 = n2.c(byteArrayOutputStream);
        try {
            synchronized (this.f147b) {
                this.f147b.a().b().g(c5);
            }
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 8);
        } catch (IOException | GeneralSecurityException e5) {
            Log.e("FirebearCryptoHelper", "Exception encountered when attempting to get Public Key:\n".concat(String.valueOf(e5.getMessage())));
            return null;
        }
    }
}
