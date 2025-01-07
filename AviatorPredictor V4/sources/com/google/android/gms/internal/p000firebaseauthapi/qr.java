package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: classes.dex */
public final class qr extends IOException {
    qr(String str, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
    }

    qr(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
