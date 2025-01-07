package com.google.protobuf;

import com.google.protobuf.d0;

/* loaded from: classes.dex */
public enum e1 implements d0.c {
    NULL_VALUE(0),
    UNRECOGNIZED(-1);


    /* renamed from: h, reason: collision with root package name */
    private static final d0.d<e1> f2858h = new d0.d<e1>() { // from class: com.google.protobuf.e1.a
        @Override // com.google.protobuf.d0.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 a(int r12) {
            return e1.d(r12);
        }
    };

    /* renamed from: e, reason: collision with root package name */
    private final int f2860e;

    e1(int r32) {
        this.f2860e = r32;
    }

    public static e1 d(int r02) {
        if (r02 != 0) {
            return null;
        }
        return NULL_VALUE;
    }

    @Override // com.google.protobuf.d0.c
    public final int e() {
        if (this != UNRECOGNIZED) {
            return this.f2860e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
