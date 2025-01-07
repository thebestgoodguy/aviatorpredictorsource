package b0;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class a {
    @Deprecated
    public static byte[] a(Context context, String str) {
        MessageDigest b5;
        PackageInfo c5 = c0.c.a(context).c(str, 64);
        Signature[] signatureArr = c5.signatures;
        if (signatureArr == null || signatureArr.length != 1 || (b5 = b("SHA1")) == null) {
            return null;
        }
        return b5.digest(c5.signatures[0].toByteArray());
    }

    public static MessageDigest b(String str) {
        MessageDigest messageDigest;
        for (int r02 = 0; r02 < 2; r02++) {
            try {
                messageDigest = MessageDigest.getInstance(str);
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }
}
