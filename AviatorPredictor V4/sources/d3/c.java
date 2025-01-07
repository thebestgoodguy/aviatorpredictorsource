package d3;

import b3.i0;
import b3.u0;
import io.grpc.internal.l2;
import io.grpc.internal.q0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class c {

    /* renamed from: a, reason: collision with root package name */
    public static final f3.d f3236a;

    /* renamed from: b, reason: collision with root package name */
    public static final f3.d f3237b;

    /* renamed from: c, reason: collision with root package name */
    public static final f3.d f3238c;

    /* renamed from: d, reason: collision with root package name */
    public static final f3.d f3239d;

    /* renamed from: e, reason: collision with root package name */
    public static final f3.d f3240e;

    /* renamed from: f, reason: collision with root package name */
    public static final f3.d f3241f;

    static {
        h4.f fVar = f3.d.f3716g;
        f3236a = new f3.d(fVar, "https");
        f3237b = new f3.d(fVar, "http");
        h4.f fVar2 = f3.d.f3714e;
        f3238c = new f3.d(fVar2, "POST");
        f3239d = new f3.d(fVar2, "GET");
        f3240e = new f3.d(q0.f5571i.d(), "application/grpc");
        f3241f = new f3.d("te", "trailers");
    }

    public static List<f3.d> a(u0 u0Var, String str, String str2, String str3, boolean z4, boolean z5) {
        q0.l.o(u0Var, "headers");
        q0.l.o(str, "defaultPath");
        q0.l.o(str2, "authority");
        u0Var.e(q0.f5571i);
        u0Var.e(q0.f5572j);
        u0.g<String> gVar = q0.f5573k;
        u0Var.e(gVar);
        ArrayList arrayList = new ArrayList(i0.a(u0Var) + 7);
        arrayList.add(z5 ? f3237b : f3236a);
        arrayList.add(z4 ? f3239d : f3238c);
        arrayList.add(new f3.d(f3.d.f3717h, str2));
        arrayList.add(new f3.d(f3.d.f3715f, str));
        arrayList.add(new f3.d(gVar.d(), str3));
        arrayList.add(f3240e);
        arrayList.add(f3241f);
        byte[][] d5 = l2.d(u0Var);
        for (int r4 = 0; r4 < d5.length; r4 += 2) {
            h4.f p4 = h4.f.p(d5[r4]);
            if (b(p4.x())) {
                arrayList.add(new f3.d(p4, h4.f.p(d5[r4 + 1])));
            }
        }
        return arrayList;
    }

    private static boolean b(String str) {
        return (str.startsWith(":") || q0.f5571i.d().equalsIgnoreCase(str) || q0.f5573k.d().equalsIgnoreCase(str)) ? false : true;
    }
}
