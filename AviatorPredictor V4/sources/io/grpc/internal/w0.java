package io.grpc.internal;

import java.util.ArrayList;

/* loaded from: classes.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList<String> f5701a = new ArrayList<>();

    public w0 a(Object obj) {
        this.f5701a.add(String.valueOf(obj));
        return this;
    }

    public w0 b(String str, Object obj) {
        this.f5701a.add(str + "=" + obj);
        return this;
    }

    public String toString() {
        return this.f5701a.toString();
    }
}
