package kotlinx.coroutines.scheduling;

import b4.g1;
import b4.s0;
import java.util.concurrent.RejectedExecutionException;

/* loaded from: classes.dex */
public class c extends g1 {

    /* renamed from: g, reason: collision with root package name */
    private final int f6496g;

    /* renamed from: h, reason: collision with root package name */
    private final int f6497h;

    /* renamed from: i, reason: collision with root package name */
    private final long f6498i;

    /* renamed from: j, reason: collision with root package name */
    private final String f6499j;

    /* renamed from: k, reason: collision with root package name */
    private a f6500k;

    public c(int r12, int r22, long j4, String str) {
        this.f6496g = r12;
        this.f6497h = r22;
        this.f6498i = j4;
        this.f6499j = str;
        this.f6500k = K();
    }

    public c(int r7, int r8, String str) {
        this(r7, r8, l.f6517e, str);
    }

    public /* synthetic */ c(int r12, int r22, String str, int r4, kotlin.jvm.internal.e eVar) {
        this((r4 & 1) != 0 ? l.f6515c : r12, (r4 & 2) != 0 ? l.f6516d : r22, (r4 & 4) != 0 ? "DefaultDispatcher" : str);
    }

    private final a K() {
        return new a(this.f6496g, this.f6497h, this.f6498i, this.f6499j);
    }

    @Override // b4.g0
    public void F(n3.g gVar, Runnable runnable) {
        try {
            a.k(this.f6500k, runnable, null, false, 6, null);
        } catch (RejectedExecutionException unused) {
            s0.f1047k.F(gVar, runnable);
        }
    }

    public final void M(Runnable runnable, j jVar, boolean z4) {
        try {
            this.f6500k.i(runnable, jVar, z4);
        } catch (RejectedExecutionException unused) {
            s0.f1047k.q0(this.f6500k.e(runnable, jVar));
        }
    }
}
