package w;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public final class p {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List<String> f8039a;

        /* renamed from: b, reason: collision with root package name */
        private final Object f8040b;

        /* synthetic */ a(Object obj, x0 x0Var) {
            r.i(obj);
            this.f8040b = obj;
            this.f8039a = new ArrayList();
        }

        public a a(String str, Object obj) {
            List<String> list = this.f8039a;
            r.i(str);
            String valueOf = String.valueOf(obj);
            StringBuilder sb = new StringBuilder(str.length() + 1 + valueOf.length());
            sb.append(str);
            sb.append("=");
            sb.append(valueOf);
            list.add(sb.toString());
            return this;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(100);
            sb.append(this.f8040b.getClass().getSimpleName());
            sb.append('{');
            int size = this.f8039a.size();
            for (int r22 = 0; r22 < size; r22++) {
                sb.append(this.f8039a.get(r22));
                if (r22 < size - 1) {
                    sb.append(", ");
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public static int b(Object... objArr) {
        return Arrays.hashCode(objArr);
    }

    public static a c(Object obj) {
        return new a(obj, null);
    }
}
