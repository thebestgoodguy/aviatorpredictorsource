package f4;

import b4.p1;
import kotlin.jvm.internal.j;
import kotlinx.coroutines.internal.w;
import n3.g;
import u3.p;

/* loaded from: classes.dex */
public final class e {

    static final class a extends j implements p<Integer, g.b, Integer> {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ c<?> f3794e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(c<?> cVar) {
            super(2);
            this.f3794e = cVar;
        }

        public final Integer a(int r4, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b bVar2 = this.f3794e.f3787f.get(key);
            if (key != p1.f1038a) {
                return Integer.valueOf(bVar != bVar2 ? Integer.MIN_VALUE : r4 + 1);
            }
            p1 p1Var = (p1) bVar2;
            p1 b5 = e.b((p1) bVar, p1Var);
            if (b5 == p1Var) {
                if (p1Var != null) {
                    r4++;
                }
                return Integer.valueOf(r4);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b5 + ", expected child of " + p1Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // u3.p
        public /* bridge */ /* synthetic */ Integer invoke(Integer num, g.b bVar) {
            return a(num.intValue(), bVar);
        }
    }

    public static final void a(c<?> cVar, g gVar) {
        if (((Number) gVar.fold(0, new a(cVar))).intValue() == cVar.f3788g) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + cVar.f3787f + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final p1 b(p1 p1Var, p1 p1Var2) {
        while (p1Var != null) {
            if (p1Var == p1Var2 || !(p1Var instanceof w)) {
                return p1Var;
            }
            p1Var = ((w) p1Var).x0();
        }
        return null;
    }
}
