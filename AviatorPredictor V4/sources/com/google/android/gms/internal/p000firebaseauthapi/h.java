package com.google.android.gms.internal.p000firebaseauthapi;

import java.io.IOException;

/* loaded from: classes.dex */
public class h extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private e0 f1691e;

    public h(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f1691e = null;
    }

    public h(String str) {
        super(str);
        this.f1691e = null;
    }

    static g a() {
        return new g("Protocol message tag had invalid wire type.");
    }

    static h b() {
        return new h("Protocol message end-group tag did not match expected tag.");
    }

    static h c() {
        return new h("Protocol message contained an invalid tag (zero).");
    }

    static h d() {
        return new h("Protocol message had invalid UTF-8.");
    }

    static h e() {
        return new h("CodedInputStream encountered a malformed varint.");
    }

    static h f() {
        return new h("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static h g() {
        return new h("Failed to parse the message.");
    }

    static h i() {
        return new h("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final h h(e0 e0Var) {
        this.f1691e = e0Var;
        return this;
    }
}
