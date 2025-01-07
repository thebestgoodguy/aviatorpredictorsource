package i1;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public class h<T> implements com.google.firebase.firestore.j<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f4093a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.firestore.j<T> f4094b;

    /* renamed from: c, reason: collision with root package name */
    private volatile boolean f4095c = false;

    public h(Executor executor, com.google.firebase.firestore.j<T> jVar) {
        this.f4093a = executor;
        this.f4094b = jVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(Object obj, com.google.firebase.firestore.u uVar) {
        if (this.f4095c) {
            return;
        }
        this.f4094b.a(obj, uVar);
    }

    @Override // com.google.firebase.firestore.j
    public void a(final T t4, final com.google.firebase.firestore.u uVar) {
        this.f4093a.execute(new Runnable() { // from class: i1.g
            @Override // java.lang.Runnable
            public final void run() {
                h.this.c(t4, uVar);
            }
        });
    }

    public void d() {
        this.f4095c = true;
    }
}
