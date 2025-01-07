package androidx.fragment.app;

import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: f, reason: collision with root package name */
    static final g f313f = new g();

    /* renamed from: e, reason: collision with root package name */
    private g f314e = null;

    public static abstract class a {
    }

    public interface b {
        void a();
    }

    public abstract n a();

    public abstract void b(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract boolean c();

    public abstract Fragment d(String str);

    public g e() {
        if (this.f314e == null) {
            this.f314e = f313f;
        }
        return this.f314e;
    }

    public abstract List<Fragment> f();

    public abstract void g(int r12, int r22);

    public abstract boolean h();

    public void i(g gVar) {
        this.f314e = gVar;
    }
}
