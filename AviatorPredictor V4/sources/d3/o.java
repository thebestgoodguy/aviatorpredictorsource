package d3;

import io.grpc.internal.o2;
import io.grpc.internal.p2;

/* loaded from: classes.dex */
class o implements p2 {
    o() {
    }

    @Override // io.grpc.internal.p2
    public o2 a(int r32) {
        return new n(new h4.c(), Math.min(1048576, Math.max(4096, r32)));
    }
}
