package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.io.CharConversionException;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class m7 {

    /* renamed from: a, reason: collision with root package name */
    private final SharedPreferences f1922a;

    /* renamed from: b, reason: collision with root package name */
    private final String f1923b = "GenericIdpKeyset";

    public m7(Context context, String str, String str2) {
        Context applicationContext = context.getApplicationContext();
        this.f1922a = str2 == null ? PreferenceManager.getDefaultSharedPreferences(applicationContext) : applicationContext.getSharedPreferences(str2, 0);
    }

    private final byte[] c() {
        try {
            String string = this.f1922a.getString(this.f1923b, null);
            if (string == null) {
                throw new FileNotFoundException(String.format("can't read keyset; the pref value %s does not exist", this.f1923b));
            }
            if (string.length() % 2 != 0) {
                throw new IllegalArgumentException("Expected a string of even length");
            }
            int length = string.length() / 2;
            byte[] bArr = new byte[length];
            for (int r5 = 0; r5 < length; r5++) {
                int r6 = r5 + r5;
                int digit = Character.digit(string.charAt(r6), 16);
                int digit2 = Character.digit(string.charAt(r6 + 1), 16);
                if (digit == -1 || digit2 == -1) {
                    throw new IllegalArgumentException("input is not hexadecimal");
                }
                bArr[r5] = (byte) ((digit * 16) + digit2);
            }
            return bArr;
        } catch (ClassCastException | IllegalArgumentException unused) {
            throw new CharConversionException(String.format("can't read keyset; the pref value %s is not a valid hex string", this.f1923b));
        }
    }

    public final pb a() {
        return pb.B(c(), yr.a());
    }

    public final fd b() {
        return fd.E(c(), yr.a());
    }
}
