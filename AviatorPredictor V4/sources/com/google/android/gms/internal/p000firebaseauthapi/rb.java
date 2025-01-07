package com.google.android.gms.internal.p000firebaseauthapi;

/* loaded from: classes.dex */
public final class rb {

    /* renamed from: a, reason: collision with root package name */
    private static final c f2083a = new qb();

    public static int a(int r12) {
        if (r12 != 1) {
            return r12 - 2;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static int b(int r32) {
        if (r32 == 0) {
            return 2;
        }
        if (r32 == 1) {
            return 3;
        }
        if (r32 == 2) {
            return 4;
        }
        if (r32 == 3) {
            return 5;
        }
        if (r32 != 4) {
            return r32 != 5 ? 0 : 7;
        }
        return 6;
    }
}
