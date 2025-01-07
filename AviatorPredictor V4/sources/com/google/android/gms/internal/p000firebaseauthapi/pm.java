package com.google.android.gms.internal.p000firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import java.util.List;
import w.n;

/* loaded from: classes.dex */
public final class pm {

    /* renamed from: a, reason: collision with root package name */
    private final int f2032a;

    /* JADX WARN: Multi-variable type inference failed */
    public pm(String str) {
        int r4 = -1;
        try {
            List d5 = c2.c("[.-]").d(str);
            if (d5.size() == 1) {
                r4 = Integer.parseInt(str);
                str = str;
            } else {
                str = str;
                if (d5.size() >= 3) {
                    int parseInt = (Integer.parseInt((String) d5.get(0)) * 1000000) + (Integer.parseInt((String) d5.get(1)) * 1000);
                    int parseInt2 = Integer.parseInt((String) d5.get(2));
                    r4 = parseInt + parseInt2;
                    str = parseInt2;
                }
            }
        } catch (IllegalArgumentException e5) {
            if (Log.isLoggable("LibraryVersionContainer", 3)) {
                Log.d("LibraryVersionContainer", String.format("Version code parsing failed for: %s with exception %s.", str, e5));
            }
        }
        this.f2032a = r4;
    }

    public static pm a() {
        String b5 = n.a().b("firebase-auth");
        if (TextUtils.isEmpty(b5) || b5.equals("UNKNOWN")) {
            b5 = "-1";
        }
        return new pm(b5);
    }

    public final String b() {
        return String.format("X%s", Integer.toString(this.f2032a));
    }
}
