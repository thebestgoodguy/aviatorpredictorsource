package w;

import android.content.Context;
import android.util.SparseIntArray;
import t.a;

/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a, reason: collision with root package name */
    private final SparseIntArray f7999a = new SparseIntArray();

    /* renamed from: b, reason: collision with root package name */
    private s.e f8000b;

    public j0(s.e eVar) {
        r.i(eVar);
        this.f8000b = eVar;
    }

    public final int a(Context context, int r32) {
        return this.f7999a.get(r32, -1);
    }

    public final int b(Context context, a.f fVar) {
        r.i(context);
        r.i(fVar);
        int r12 = 0;
        if (!fVar.o()) {
            return 0;
        }
        int p4 = fVar.p();
        int a5 = a(context, p4);
        if (a5 == -1) {
            int r02 = 0;
            while (true) {
                if (r02 >= this.f7999a.size()) {
                    r12 = -1;
                    break;
                }
                int keyAt = this.f7999a.keyAt(r02);
                if (keyAt > p4 && this.f7999a.get(keyAt) == 0) {
                    break;
                }
                r02++;
            }
            a5 = r12 == -1 ? this.f8000b.g(context, p4) : r12;
            this.f7999a.put(p4, a5);
        }
        return a5;
    }

    public final void c() {
        this.f7999a.clear();
    }
}
