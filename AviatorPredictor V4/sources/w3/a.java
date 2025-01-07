package w3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class a extends v3.a {
    @Override // v3.a
    public Random c() {
        ThreadLocalRandom current = ThreadLocalRandom.current();
        i.c(current, "current()");
        return current;
    }
}
