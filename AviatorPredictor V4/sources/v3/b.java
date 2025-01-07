package v3;

import java.util.Random;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class b extends v3.a {

    /* renamed from: g, reason: collision with root package name */
    private final a f7903g = new a();

    public static final class a extends ThreadLocal<Random> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Random initialValue() {
            return new Random();
        }
    }

    @Override // v3.a
    public Random c() {
        Random random = this.f7903g.get();
        i.c(random, "implStorage.get()");
        return random;
    }
}
