package kotlinx.coroutines;

import n3.g;

/* loaded from: classes.dex */
public interface CoroutineExceptionHandler extends g.b {

    /* renamed from: c, reason: collision with root package name */
    public static final a f6395c = a.f6396e;

    public static final class a implements g.c<CoroutineExceptionHandler> {

        /* renamed from: e, reason: collision with root package name */
        static final /* synthetic */ a f6396e = new a();

        private a() {
        }
    }

    void handleException(g gVar, Throwable th);
}
