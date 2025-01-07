package com.google.android.gms.internal.p000firebaseauthapi;

import android.os.Build;

/* loaded from: classes.dex */
final class a {
    static boolean a() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
