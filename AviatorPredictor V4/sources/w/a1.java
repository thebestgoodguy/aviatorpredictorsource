package w;

import android.util.Log;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class a1<TListener> {

    /* renamed from: a, reason: collision with root package name */
    private TListener f7906a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f7907b = false;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ c f7908c;

    public a1(c cVar, TListener tlistener) {
        this.f7908c = cVar;
        this.f7906a = tlistener;
    }

    protected abstract void a(TListener tlistener);

    protected abstract void b();

    public final void c() {
        TListener tlistener;
        synchronized (this) {
            tlistener = this.f7906a;
            if (this.f7907b) {
                String obj = toString();
                StringBuilder sb = new StringBuilder(obj.length() + 47);
                sb.append("Callback proxy ");
                sb.append(obj);
                sb.append(" being reused. This is not safe.");
                Log.w("GmsClient", sb.toString());
            }
        }
        if (tlistener != null) {
            try {
                a(tlistener);
            } catch (RuntimeException e5) {
                throw e5;
            }
        }
        synchronized (this) {
            this.f7907b = true;
        }
        e();
    }

    public final void d() {
        synchronized (this) {
            this.f7906a = null;
        }
    }

    public final void e() {
        ArrayList arrayList;
        ArrayList arrayList2;
        d();
        arrayList = this.f7908c.f7928r;
        synchronized (arrayList) {
            arrayList2 = this.f7908c.f7928r;
            arrayList2.remove(this);
        }
    }
}
