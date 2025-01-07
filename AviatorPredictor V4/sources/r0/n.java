package r0;

import java.util.Map;

/* loaded from: classes.dex */
public final class n {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static abstract class a implements q0.d<Map.Entry<?, ?>, Object> {

        /* renamed from: e, reason: collision with root package name */
        public static final a f7404e = new C0079a("KEY", 0);

        /* renamed from: f, reason: collision with root package name */
        public static final a f7405f = new b("VALUE", 1);

        /* renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ a[] f7406g = g();

        /* renamed from: r0.n$a$a, reason: collision with other inner class name */
        enum C0079a extends a {
            C0079a(String str, int r32) {
                super(str, r32, null);
            }

            @Override // q0.d
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object d(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        }

        enum b extends a {
            b(String str, int r32) {
                super(str, r32, null);
            }

            @Override // q0.d
            /* renamed from: h, reason: merged with bridge method [inline-methods] */
            public Object d(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }

        private a(String str, int r22) {
        }

        /* synthetic */ a(String str, int r22, m mVar) {
            this(str, r22);
        }

        private static /* synthetic */ a[] g() {
            return new a[]{f7404e, f7405f};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f7406g.clone();
        }
    }

    static boolean a(Map<?, ?> map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    static String b(Map<?, ?> map) {
        StringBuilder a5 = d.a(map.size());
        a5.append('{');
        boolean z4 = true;
        for (Map.Entry<?, ?> entry : map.entrySet()) {
            if (!z4) {
                a5.append(", ");
            }
            z4 = false;
            a5.append(entry.getKey());
            a5.append('=');
            a5.append(entry.getValue());
        }
        a5.append('}');
        return a5.toString();
    }

    static <V> q0.d<Map.Entry<?, V>, V> c() {
        return a.f7405f;
    }
}
