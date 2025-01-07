package androidx.loader.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.g;
import androidx.lifecycle.l;
import androidx.lifecycle.m;
import androidx.lifecycle.p;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import e.f;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* loaded from: classes.dex */
class b extends androidx.loader.app.a {

    /* renamed from: c, reason: collision with root package name */
    static boolean f542c = false;

    /* renamed from: a, reason: collision with root package name */
    private final g f543a;

    /* renamed from: b, reason: collision with root package name */
    private final C0006b f544b;

    public static class a<D> extends l<D> {

        /* renamed from: k, reason: collision with root package name */
        private final int f545k;

        /* renamed from: l, reason: collision with root package name */
        private final Bundle f546l;

        /* renamed from: m, reason: collision with root package name */
        private final l.a<D> f547m;

        /* renamed from: n, reason: collision with root package name */
        private g f548n;

        @Override // androidx.lifecycle.LiveData
        protected void d() {
            if (b.f542c) {
                Log.v("LoaderManager", "  Starting: " + this);
            }
            throw null;
        }

        @Override // androidx.lifecycle.LiveData
        protected void e() {
            if (b.f542c) {
                Log.v("LoaderManager", "  Stopping: " + this);
            }
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void f(m<? super D> mVar) {
            super.f(mVar);
            this.f548n = null;
        }

        @Override // androidx.lifecycle.l, androidx.lifecycle.LiveData
        public void g(D d5) {
            super.g(d5);
        }

        l.a<D> h(boolean z4) {
            if (b.f542c) {
                Log.v("LoaderManager", "  Destroying: " + this);
            }
            throw null;
        }

        public void i(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f545k);
            printWriter.print(" mArgs=");
            printWriter.println(this.f546l);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f547m);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("  ");
            throw null;
        }

        void j() {
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f545k);
            sb.append(" : ");
            j.b.a(this.f547m, sb);
            sb.append("}}");
            return sb.toString();
        }
    }

    /* renamed from: androidx.loader.app.b$b, reason: collision with other inner class name */
    static class C0006b extends p {

        /* renamed from: e, reason: collision with root package name */
        private static final q.a f549e = new a();

        /* renamed from: c, reason: collision with root package name */
        private f<a> f550c = new f<>();

        /* renamed from: d, reason: collision with root package name */
        private boolean f551d = false;

        /* renamed from: androidx.loader.app.b$b$a */
        static class a implements q.a {
            a() {
            }

            @Override // androidx.lifecycle.q.a
            public <T extends p> T a(Class<T> cls) {
                return new C0006b();
            }
        }

        C0006b() {
        }

        static C0006b e(r rVar) {
            return (C0006b) new q(rVar, f549e).a(C0006b.class);
        }

        @Override // androidx.lifecycle.p
        protected void c() {
            super.c();
            int k4 = this.f550c.k();
            for (int r12 = 0; r12 < k4; r12++) {
                this.f550c.l(r12).h(true);
            }
            this.f550c.a();
        }

        public void d(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f550c.k() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int r12 = 0; r12 < this.f550c.k(); r12++) {
                    a l4 = this.f550c.l(r12);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f550c.g(r12));
                    printWriter.print(": ");
                    printWriter.println(l4.toString());
                    l4.i(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        void f() {
            int k4 = this.f550c.k();
            for (int r12 = 0; r12 < k4; r12++) {
                this.f550c.l(r12).j();
            }
        }
    }

    b(g gVar, r rVar) {
        this.f543a = gVar;
        this.f544b = C0006b.e(rVar);
    }

    @Override // androidx.loader.app.a
    @Deprecated
    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f544b.d(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.a
    public void c() {
        this.f544b.f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        j.b.a(this.f543a, sb);
        sb.append("}}");
        return sb.toString();
    }
}
