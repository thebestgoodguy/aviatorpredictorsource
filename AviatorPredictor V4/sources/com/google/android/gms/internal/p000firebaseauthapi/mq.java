package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class mq {
    public static int a(int r5, int r6, String str) {
        String b5;
        if (r5 >= 0 && r5 < r6) {
            return r5;
        }
        if (r5 < 0) {
            b5 = d2.b("%s (%s) must not be negative", "index", Integer.valueOf(r5));
        } else {
            if (r6 < 0) {
                throw new IllegalArgumentException("negative size: " + r6);
            }
            b5 = d2.b("%s (%s) must be less than size (%s)", "index", Integer.valueOf(r5), Integer.valueOf(r6));
        }
        throw new IndexOutOfBoundsException(b5);
    }

    public static int b(int r12, int r22, String str) {
        if (r12 < 0 || r12 > r22) {
            throw new IndexOutOfBoundsException(d(r12, r22, "index"));
        }
        return r12;
    }

    public static void c(int r22, int r32, int r4) {
        if (r22 < 0 || r32 < r22 || r32 > r4) {
            throw new IndexOutOfBoundsException((r22 < 0 || r22 > r4) ? d(r22, r4, "start index") : (r32 < 0 || r32 > r4) ? d(r32, r4, "end index") : d2.b("end index (%s) must not be less than start index (%s)", Integer.valueOf(r32), Integer.valueOf(r22)));
        }
    }

    private static String d(int r4, int r5, String str) {
        if (r4 < 0) {
            return d2.b("%s (%s) must not be negative", str, Integer.valueOf(r4));
        }
        if (r5 >= 0) {
            return d2.b("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(r4), Integer.valueOf(r5));
        }
        throw new IllegalArgumentException("negative size: " + r5);
    }
}
