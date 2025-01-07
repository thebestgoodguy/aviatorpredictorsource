package t;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
import t.a;

@Deprecated
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<f> f7563a = Collections.newSetFromMap(new WeakHashMap());

    @Deprecated
    public interface a extends u.c {
    }

    @Deprecated
    public interface b extends u.h {
    }

    public <A extends a.b, R extends k, T extends com.google.android.gms.common.api.internal.b<R, A>> T a(T t4) {
        throw new UnsupportedOperationException();
    }

    public Looper b() {
        throw new UnsupportedOperationException();
    }
}
