package x0;

import w.r;

/* loaded from: classes.dex */
public class k extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str) {
        super(str);
        r.f(str, "Detail message must not be empty");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, Throwable th) {
        super(str, th);
        r.f(str, "Detail message must not be empty");
    }
}
