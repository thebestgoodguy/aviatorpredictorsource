package io.grpc.internal;

import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f5927a = Logger.getLogger(z0.class.getName());

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5928a;

        static {
            int[] r02 = new int[z1.b.values().length];
            f5928a = r02;
            try {
                r02[z1.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5928a[z1.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5928a[z1.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5928a[z1.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5928a[z1.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5928a[z1.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private z0() {
    }

    public static Object a(String str) {
        z1.a aVar = new z1.a(new StringReader(str));
        try {
            return e(aVar);
        } finally {
            try {
                aVar.close();
            } catch (IOException e5) {
                f5927a.log(Level.WARNING, "Failed to close", (Throwable) e5);
            }
        }
    }

    private static List<?> b(z1.a aVar) {
        aVar.a();
        ArrayList arrayList = new ArrayList();
        while (aVar.s()) {
            arrayList.add(e(aVar));
        }
        q0.l.u(aVar.X() == z1.b.END_ARRAY, "Bad token: " + aVar.r());
        aVar.k();
        return Collections.unmodifiableList(arrayList);
    }

    private static Void c(z1.a aVar) {
        aVar.K();
        return null;
    }

    private static Map<String, ?> d(z1.a aVar) {
        aVar.d();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (aVar.s()) {
            linkedHashMap.put(aVar.F(), e(aVar));
        }
        q0.l.u(aVar.X() == z1.b.END_OBJECT, "Bad token: " + aVar.r());
        aVar.l();
        return Collections.unmodifiableMap(linkedHashMap);
    }

    private static Object e(z1.a aVar) {
        q0.l.u(aVar.s(), "unexpected end of JSON");
        switch (a.f5928a[aVar.X().ordinal()]) {
            case 1:
                return b(aVar);
            case 2:
                return d(aVar);
            case 3:
                return aVar.R();
            case 4:
                return Double.valueOf(aVar.C());
            case 5:
                return Boolean.valueOf(aVar.y());
            case 6:
                return c(aVar);
            default:
                throw new IllegalStateException("Bad token: " + aVar.r());
        }
    }
}
