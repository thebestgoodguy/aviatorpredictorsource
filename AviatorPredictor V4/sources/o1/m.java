package o1;

import android.content.Context;
import android.os.Build;
import b3.f1;
import com.google.firebase.firestore.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLHandshakeException;
import o1.u;
import o1.u0;
import o1.v0;
import x1.c;
import x1.e;

/* loaded from: classes.dex */
public class m {

    /* renamed from: e, reason: collision with root package name */
    static final Set<String> f6842e = new HashSet(Arrays.asList("date", "x-google-backends", "x-google-netmon-label", "x-google-service", "x-google-gfe-request-trace"));

    /* renamed from: a, reason: collision with root package name */
    private final i1.m f6843a;

    /* renamed from: b, reason: collision with root package name */
    private final j0 f6844b;

    /* renamed from: c, reason: collision with root package name */
    private final p1.g f6845c;

    /* renamed from: d, reason: collision with root package name */
    private final u f6846d;

    class a extends u.e<x1.d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f6847a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f6848b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ o0.i f6849c;

        a(List list, List list2, o0.i iVar) {
            this.f6847a = list;
            this.f6848b = list2;
            this.f6849c = iVar;
        }

        @Override // o1.u.e
        public void a(f1 f1Var) {
            if (f1Var.o()) {
                this.f6849c.e(Collections.emptyList());
                return;
            }
            com.google.firebase.firestore.u r4 = p1.g0.r(f1Var);
            if (r4.a() == u.a.UNAUTHENTICATED) {
                m.this.f6846d.h();
            }
            this.f6849c.d(r4);
        }

        @Override // o1.u.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(x1.d dVar) {
            this.f6847a.add(dVar);
            if (this.f6847a.size() == this.f6848b.size()) {
                HashMap hashMap = new HashMap();
                Iterator it = this.f6847a.iterator();
                while (it.hasNext()) {
                    l1.s m4 = m.this.f6844b.m((x1.d) it.next());
                    hashMap.put(m4.getKey(), m4);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it2 = this.f6848b.iterator();
                while (it2.hasNext()) {
                    arrayList.add((l1.s) hashMap.get((l1.l) it2.next()));
                }
                this.f6849c.e(arrayList);
            }
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6851a;

        static {
            int[] r02 = new int[u.a.values().length];
            f6851a = r02;
            try {
                r02[u.a.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6851a[u.a.CANCELLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6851a[u.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6851a[u.a.DEADLINE_EXCEEDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6851a[u.a.RESOURCE_EXHAUSTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6851a[u.a.INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f6851a[u.a.UNAVAILABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f6851a[u.a.UNAUTHENTICATED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f6851a[u.a.INVALID_ARGUMENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f6851a[u.a.NOT_FOUND.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f6851a[u.a.ALREADY_EXISTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f6851a[u.a.PERMISSION_DENIED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f6851a[u.a.FAILED_PRECONDITION.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f6851a[u.a.ABORTED.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f6851a[u.a.OUT_OF_RANGE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f6851a[u.a.UNIMPLEMENTED.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f6851a[u.a.DATA_LOSS.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public m(i1.m mVar, p1.g gVar, g1.a<g1.j> aVar, g1.a<String> aVar2, Context context, e0 e0Var) {
        this.f6843a = mVar;
        this.f6845c = gVar;
        this.f6844b = new j0(mVar.a());
        this.f6846d = g(mVar, gVar, aVar, aVar2, context, e0Var);
    }

    public static boolean h(f1 f1Var) {
        f1.b m4 = f1Var.m();
        Throwable l4 = f1Var.l();
        return Build.VERSION.SDK_INT < 21 && m4.equals(f1.b.UNAVAILABLE) && ((l4 instanceof SSLHandshakeException) && l4.getMessage().contains("no ciphers available"));
    }

    public static boolean i(f1 f1Var) {
        return j(u.a.g(f1Var.m().h()));
    }

    public static boolean j(u.a aVar) {
        switch (b.f6851a[aVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Treated status OK as error");
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return false;
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                return true;
            default:
                throw new IllegalArgumentException("Unknown gRPC status code: " + aVar);
        }
    }

    public static boolean k(f1 f1Var) {
        return i(f1Var) && !f1Var.m().equals(f1.b.ABORTED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ List l(o0.h hVar) {
        if (!hVar.p()) {
            if ((hVar.l() instanceof com.google.firebase.firestore.u) && ((com.google.firebase.firestore.u) hVar.l()).a() == u.a.UNAUTHENTICATED) {
                this.f6846d.h();
            }
            throw hVar.l();
        }
        x1.f fVar = (x1.f) hVar.m();
        l1.w y4 = this.f6844b.y(fVar.U());
        int X = fVar.X();
        ArrayList arrayList = new ArrayList(X);
        for (int r32 = 0; r32 < X; r32++) {
            arrayList.add(this.f6844b.p(fVar.W(r32), y4));
        }
        return arrayList;
    }

    public o0.h<List<m1.i>> d(List<m1.f> list) {
        e.b Z = x1.e.Z();
        Z.D(this.f6844b.a());
        Iterator<m1.f> it = list.iterator();
        while (it.hasNext()) {
            Z.B(this.f6844b.O(it.next()));
        }
        return this.f6846d.n(x1.o.b(), Z.t()).h(this.f6845c.o(), new o0.a() { // from class: o1.l
            @Override // o0.a
            public final Object a(o0.h hVar) {
                List l4;
                l4 = m.this.l(hVar);
                return l4;
            }
        });
    }

    u0 e(u0.a aVar) {
        return new u0(this.f6846d, this.f6845c, this.f6844b, aVar);
    }

    v0 f(v0.a aVar) {
        return new v0(this.f6846d, this.f6845c, this.f6844b, aVar);
    }

    u g(i1.m mVar, p1.g gVar, g1.a<g1.j> aVar, g1.a<String> aVar2, Context context, e0 e0Var) {
        return new u(gVar, context, aVar, aVar2, mVar, e0Var);
    }

    public o0.h<List<l1.s>> m(List<l1.l> list) {
        c.b Z = x1.c.Z();
        Z.D(this.f6844b.a());
        Iterator<l1.l> it = list.iterator();
        while (it.hasNext()) {
            Z.B(this.f6844b.L(it.next()));
        }
        ArrayList arrayList = new ArrayList();
        o0.i iVar = new o0.i();
        this.f6846d.o(x1.o.a(), Z.t(), new a(arrayList, list, iVar));
        return iVar.a();
    }

    void n() {
        this.f6846d.q();
    }
}
