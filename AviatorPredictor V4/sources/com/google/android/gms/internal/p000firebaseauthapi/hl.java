package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.Serializable;
import java.util.Objects;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class hl extends ki implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private final Pattern f1729e;

    hl(Pattern pattern) {
        Objects.requireNonNull(pattern);
        this.f1729e = pattern;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.ki
    public final lh a(CharSequence charSequence) {
        return new lk(this.f1729e.matcher(charSequence));
    }

    public final String toString() {
        return this.f1729e.toString();
    }
}
