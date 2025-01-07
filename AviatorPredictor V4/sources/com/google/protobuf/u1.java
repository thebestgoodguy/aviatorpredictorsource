package com.google.protobuf;

import java.util.List;

/* loaded from: classes.dex */
public class u1 extends RuntimeException {

    /* renamed from: e, reason: collision with root package name */
    private final List<String> f3082e;

    public u1(v0 v0Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f3082e = null;
    }

    public e0 a() {
        return new e0(getMessage());
    }
}
