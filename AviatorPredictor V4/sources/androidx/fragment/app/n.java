package androidx.fragment.app;

import androidx.lifecycle.d;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class n {

    /* renamed from: b, reason: collision with root package name */
    int f394b;

    /* renamed from: c, reason: collision with root package name */
    int f395c;

    /* renamed from: d, reason: collision with root package name */
    int f396d;

    /* renamed from: e, reason: collision with root package name */
    int f397e;

    /* renamed from: f, reason: collision with root package name */
    int f398f;

    /* renamed from: g, reason: collision with root package name */
    int f399g;

    /* renamed from: h, reason: collision with root package name */
    boolean f400h;

    /* renamed from: j, reason: collision with root package name */
    String f402j;

    /* renamed from: k, reason: collision with root package name */
    int f403k;

    /* renamed from: l, reason: collision with root package name */
    CharSequence f404l;

    /* renamed from: m, reason: collision with root package name */
    int f405m;

    /* renamed from: n, reason: collision with root package name */
    CharSequence f406n;

    /* renamed from: o, reason: collision with root package name */
    ArrayList<String> f407o;

    /* renamed from: p, reason: collision with root package name */
    ArrayList<String> f408p;

    /* renamed from: r, reason: collision with root package name */
    ArrayList<Runnable> f410r;

    /* renamed from: a, reason: collision with root package name */
    ArrayList<a> f393a = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    boolean f401i = true;

    /* renamed from: q, reason: collision with root package name */
    boolean f409q = false;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        int f411a;

        /* renamed from: b, reason: collision with root package name */
        Fragment f412b;

        /* renamed from: c, reason: collision with root package name */
        int f413c;

        /* renamed from: d, reason: collision with root package name */
        int f414d;

        /* renamed from: e, reason: collision with root package name */
        int f415e;

        /* renamed from: f, reason: collision with root package name */
        int f416f;

        /* renamed from: g, reason: collision with root package name */
        d.b f417g;

        /* renamed from: h, reason: collision with root package name */
        d.b f418h;

        a() {
        }

        a(int r12, Fragment fragment) {
            this.f411a = r12;
            this.f412b = fragment;
            d.b bVar = d.b.RESUMED;
            this.f417g = bVar;
            this.f418h = bVar;
        }
    }

    public n b(Fragment fragment, String str) {
        f(0, fragment, str, 1);
        return this;
    }

    void c(a aVar) {
        this.f393a.add(aVar);
        aVar.f413c = this.f394b;
        aVar.f414d = this.f395c;
        aVar.f415e = this.f396d;
        aVar.f416f = this.f397e;
    }

    public abstract int d();

    public abstract int e();

    void f(int r4, Fragment fragment, String str, int r7) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.B;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.B + " now " + str);
            }
            fragment.B = str;
        }
        if (r4 != 0) {
            if (r4 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int r6 = fragment.f242z;
            if (r6 != 0 && r6 != r4) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f242z + " now " + r4);
            }
            fragment.f242z = r4;
            fragment.A = r4;
        }
        c(new a(r7, fragment));
    }

    public n g(Fragment fragment) {
        c(new a(3, fragment));
        return this;
    }
}
