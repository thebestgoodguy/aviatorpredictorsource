package c4;

import android.os.Handler;
import android.os.Looper;
import b4.t1;
import b4.x0;
import java.util.concurrent.CancellationException;
import k3.s;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.i;
import n3.g;

/* loaded from: classes.dex */
public final class a extends b {
    private volatile a _immediate;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f1180f;

    /* renamed from: g, reason: collision with root package name */
    private final String f1181g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f1182h;

    /* renamed from: i, reason: collision with root package name */
    private final a f1183i;

    public a(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ a(Handler handler, String str, int r32, e eVar) {
        this(handler, (r32 & 2) != 0 ? null : str);
    }

    private a(Handler handler, String str, boolean z4) {
        super(null);
        this.f1180f = handler;
        this.f1181g = str;
        this.f1182h = z4;
        this._immediate = z4 ? this : null;
        a aVar = this._immediate;
        if (aVar == null) {
            aVar = new a(handler, str, true);
            this._immediate = aVar;
            s sVar = s.f6374a;
        }
        this.f1183i = aVar;
    }

    private final void R(g gVar, Runnable runnable) {
        t1.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        x0.b().F(gVar, runnable);
    }

    @Override // b4.g0
    public void F(g gVar, Runnable runnable) {
        if (this.f1180f.post(runnable)) {
            return;
        }
        R(gVar, runnable);
    }

    @Override // b4.g0
    public boolean H(g gVar) {
        return (this.f1182h && i.a(Looper.myLooper(), this.f1180f.getLooper())) ? false : true;
    }

    @Override // b4.z1
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public a K() {
        return this.f1183i;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f1180f == this.f1180f;
    }

    public int hashCode() {
        return System.identityHashCode(this.f1180f);
    }

    @Override // b4.z1, b4.g0
    public String toString() {
        String M = M();
        if (M != null) {
            return M;
        }
        String str = this.f1181g;
        if (str == null) {
            str = this.f1180f.toString();
        }
        return this.f1182h ? i.i(str, ".immediate") : str;
    }
}
