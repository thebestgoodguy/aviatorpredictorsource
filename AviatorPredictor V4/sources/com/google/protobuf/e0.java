package com.google.protobuf;

import java.io.IOException;

/* loaded from: classes.dex */
public class e0 extends IOException {

    /* renamed from: e, reason: collision with root package name */
    private v0 f2854e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2855f;

    public static class a extends e0 {
        public a(String str) {
            super(str);
        }
    }

    public e0(IOException iOException) {
        super(iOException.getMessage(), iOException);
        this.f2854e = null;
    }

    public e0(String str) {
        super(str);
        this.f2854e = null;
    }

    static e0 b() {
        return new e0("Protocol message end-group tag did not match expected tag.");
    }

    static e0 c() {
        return new e0("Protocol message contained an invalid tag (zero).");
    }

    static e0 d() {
        return new e0("Protocol message had invalid UTF-8.");
    }

    static a e() {
        return new a("Protocol message tag had invalid wire type.");
    }

    static e0 f() {
        return new e0("CodedInputStream encountered a malformed varint.");
    }

    static e0 g() {
        return new e0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static e0 h() {
        return new e0("Failed to parse the message.");
    }

    static e0 i() {
        return new e0("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static e0 l() {
        return new e0("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static e0 m() {
        return new e0("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    boolean a() {
        return this.f2855f;
    }

    void j() {
        this.f2855f = true;
    }

    public e0 k(v0 v0Var) {
        this.f2854e = v0Var;
        return this;
    }
}
