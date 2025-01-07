package v2;

import android.util.Log;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.c;
import com.google.firebase.firestore.d0;
import com.google.firebase.firestore.k0;
import com.google.firebase.firestore.m0;
import com.google.firebase.firestore.p0;
import com.google.firebase.firestore.v;
import com.google.firebase.firestore.y;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
class b extends r2.p {

    /* renamed from: d, reason: collision with root package name */
    public static final b f7854d = new b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7855a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7856b;

        static {
            int[] r02 = new int[d0.a.values().length];
            f7856b = r02;
            try {
                r02[d0.a.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7856b[d0.a.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7856b[d0.a.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] r32 = new int[c.b.values().length];
            f7855a = r32;
            try {
                r32[c.b.ADDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7855a[c.b.MODIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7855a[c.b.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    b() {
    }

    private FirebaseFirestore q(ByteBuffer byteBuffer) {
        String str = (String) f(byteBuffer);
        v vVar = (v) f(byteBuffer);
        synchronized (t.f7893i) {
            if (t.J(str) != null) {
                return t.J(str);
            }
            FirebaseFirestore u4 = FirebaseFirestore.u(x0.e.p(str));
            u4.K(vVar);
            t.i0(u4, str);
            return u4;
        }
    }

    private k0 r(ByteBuffer byteBuffer) {
        try {
            Map map = (Map) f(byteBuffer);
            Object obj = map.get("firestore");
            Objects.requireNonNull(obj);
            FirebaseFirestore firebaseFirestore = (FirebaseFirestore) obj;
            Object obj2 = map.get("path");
            Objects.requireNonNull(obj2);
            String str = (String) obj2;
            boolean booleanValue = ((Boolean) map.get("isCollectionGroup")).booleanValue();
            Map map2 = (Map) map.get("parameters");
            k0 m4 = booleanValue ? firebaseFirestore.m(str) : firebaseFirestore.l(str);
            if (map2 == null) {
                return m4;
            }
            Object obj3 = map2.get("where");
            Objects.requireNonNull(obj3);
            for (List list : (List) obj3) {
                com.google.firebase.firestore.l lVar = (com.google.firebase.firestore.l) list.get(0);
                String str2 = (String) list.get(1);
                Object obj4 = list.get(2);
                if ("==".equals(str2)) {
                    m4 = m4.L(lVar, obj4);
                } else if ("!=".equals(str2)) {
                    m4 = m4.R(lVar, obj4);
                } else if ("<".equals(str2)) {
                    m4 = m4.P(lVar, obj4);
                } else if ("<=".equals(str2)) {
                    m4 = m4.Q(lVar, obj4);
                } else if (">".equals(str2)) {
                    m4 = m4.M(lVar, obj4);
                } else if (">=".equals(str2)) {
                    m4 = m4.N(lVar, obj4);
                } else if ("array-contains".equals(str2)) {
                    m4 = m4.J(lVar, obj4);
                } else if ("array-contains-any".equals(str2)) {
                    m4 = m4.K(lVar, (List) obj4);
                } else if ("in".equals(str2)) {
                    m4 = m4.O(lVar, (List) obj4);
                } else if ("not-in".equals(str2)) {
                    m4 = m4.S(lVar, (List) obj4);
                } else {
                    Log.w("FLTFirestoreMsgCodec", "An invalid query operator " + str2 + " was received but not handled.");
                }
            }
            Number number = (Number) map2.get("limit");
            if (number != null) {
                m4 = m4.s(number.longValue());
            }
            Number number2 = (Number) map2.get("limitToLast");
            if (number2 != null) {
                m4 = m4.t(number2.longValue());
            }
            List<List> list2 = (List) map2.get("orderBy");
            if (list2 == null) {
                return m4;
            }
            for (List list3 : list2) {
                m4 = m4.u((com.google.firebase.firestore.l) list3.get(0), ((Boolean) list3.get(1)).booleanValue() ? k0.b.DESCENDING : k0.b.ASCENDING);
            }
            List list4 = (List) map2.get("startAt");
            if (list4 != null) {
                Object[] array = list4.toArray();
                Objects.requireNonNull(array);
                m4 = m4.B(array);
            }
            List list5 = (List) map2.get("startAfter");
            if (list5 != null) {
                Object[] array2 = list5.toArray();
                Objects.requireNonNull(array2);
                m4 = m4.A(array2);
            }
            List list6 = (List) map2.get("endAt");
            if (list6 != null) {
                Object[] array3 = list6.toArray();
                Objects.requireNonNull(array3);
                m4 = m4.i(array3);
            }
            List list7 = (List) map2.get("endBefore");
            if (list7 == null) {
                return m4;
            }
            Object[] array4 = list7.toArray();
            Objects.requireNonNull(array4);
            return m4.j(array4);
        } catch (Exception e5) {
            Log.e("FLTFirestoreMsgCodec", "An error occurred while parsing query arguments, this is most likely an error with this SDK.", e5);
            return null;
        }
    }

    private v s(ByteBuffer byteBuffer) {
        Map map = (Map) f(byteBuffer);
        v.b bVar = new v.b();
        if (map.get("persistenceEnabled") != null) {
            Object obj = map.get("persistenceEnabled");
            Objects.requireNonNull(obj);
            bVar.h(((Boolean) obj).booleanValue());
        }
        if (map.get("host") != null) {
            Object obj2 = map.get("host");
            Objects.requireNonNull(obj2);
            bVar.g((String) obj2);
            if (map.get("sslEnabled") != null) {
                Object obj3 = map.get("sslEnabled");
                Objects.requireNonNull(obj3);
                bVar.i(((Boolean) obj3).booleanValue());
            }
        }
        if (map.get("cacheSizeBytes") != null) {
            Long l4 = 104857600L;
            Object obj4 = map.get("cacheSizeBytes");
            if (obj4 instanceof Long) {
                l4 = (Long) obj4;
            } else if (obj4 instanceof Integer) {
                l4 = Long.valueOf(((Integer) obj4).intValue());
            }
            if (l4.longValue() == -1) {
                bVar.f(-1L);
            } else {
                bVar.f(l4.longValue());
            }
        }
        return bVar.e();
    }

    private Object[] t(Object obj) {
        if (obj instanceof List) {
            return ((List) obj).toArray();
        }
        if (obj == null) {
            return new ArrayList().toArray();
        }
        throw new IllegalArgumentException(String.format("java.util.List was expected, unable to convert '%s' to an object array", obj.getClass().getCanonicalName()));
    }

    private void u(ByteArrayOutputStream byteArrayOutputStream, com.google.firebase.firestore.c cVar) {
        HashMap hashMap = new HashMap();
        int r12 = a.f7855a[cVar.e().ordinal()];
        hashMap.put("type", r12 != 1 ? r12 != 2 ? r12 != 3 ? null : "DocumentChangeType.removed" : "DocumentChangeType.modified" : "DocumentChangeType.added");
        hashMap.put("data", cVar.b().d());
        hashMap.put("path", cVar.b().g().m());
        hashMap.put("oldIndex", Integer.valueOf(cVar.d()));
        hashMap.put("newIndex", Integer.valueOf(cVar.c()));
        hashMap.put("metadata", cVar.b().f());
        p(byteArrayOutputStream, hashMap);
    }

    private void v(ByteArrayOutputStream byteArrayOutputStream, com.google.firebase.firestore.i iVar) {
        HashMap hashMap = new HashMap();
        hashMap.put("path", iVar.g().m());
        hashMap.put("data", iVar.a() ? iVar.d() : null);
        hashMap.put("metadata", iVar.f());
        p(byteArrayOutputStream, hashMap);
    }

    private void w(ByteArrayOutputStream byteArrayOutputStream, d0 d0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("bytesLoaded", Long.valueOf(d0Var.c()));
        hashMap.put("documentsLoaded", Integer.valueOf(d0Var.d()));
        hashMap.put("totalBytes", Long.valueOf(d0Var.f()));
        hashMap.put("totalDocuments", Integer.valueOf(d0Var.g()));
        int r5 = a.f7856b[d0Var.e().ordinal()];
        String str = "running";
        if (r5 != 1) {
            if (r5 == 2) {
                str = "success";
            } else if (r5 == 3) {
                str = "error";
            }
        }
        hashMap.put("taskState", str);
        p(byteArrayOutputStream, hashMap);
    }

    private void x(ByteArrayOutputStream byteArrayOutputStream, m0 m0Var) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (com.google.firebase.firestore.i iVar : m0Var.s()) {
            arrayList.add(iVar.g().m());
            arrayList2.add(iVar.d());
            arrayList3.add(iVar.f());
        }
        hashMap.put("paths", arrayList);
        hashMap.put("documents", arrayList2);
        hashMap.put("metadatas", arrayList3);
        hashMap.put("documentChanges", m0Var.q());
        hashMap.put("metadata", m0Var.t());
        p(byteArrayOutputStream, hashMap);
    }

    private void y(ByteArrayOutputStream byteArrayOutputStream, p0 p0Var) {
        HashMap hashMap = new HashMap();
        hashMap.put("hasPendingWrites", Boolean.valueOf(p0Var.a()));
        hashMap.put("isFromCache", Boolean.valueOf(p0Var.b()));
        p(byteArrayOutputStream, hashMap);
    }

    @Override // r2.p
    protected Object g(byte b5, ByteBuffer byteBuffer) {
        switch (b5) {
            case Byte.MIN_VALUE:
                return new Date(byteBuffer.getLong());
            case -127:
                r2.p.c(byteBuffer, 8);
                return new y(byteBuffer.getDouble(), byteBuffer.getDouble());
            case -126:
                return ((FirebaseFirestore) f(byteBuffer)).o((String) f(byteBuffer));
            case -125:
                return com.google.firebase.firestore.a.h(r2.p.d(byteBuffer));
            case -124:
                return com.google.firebase.firestore.m.b(t(f(byteBuffer)));
            case -123:
                return com.google.firebase.firestore.m.a(t(f(byteBuffer)));
            case -122:
                return com.google.firebase.firestore.m.c();
            case -121:
                return com.google.firebase.firestore.m.g();
            case -120:
                return new x0.o(byteBuffer.getLong(), byteBuffer.getInt());
            case -119:
                return com.google.firebase.firestore.m.e(((Number) f(byteBuffer)).doubleValue());
            case -118:
                return com.google.firebase.firestore.m.f(((Number) f(byteBuffer)).intValue());
            case -117:
                return com.google.firebase.firestore.l.a();
            case -116:
                int e5 = r2.p.e(byteBuffer);
                ArrayList arrayList = new ArrayList(e5);
                for (int r22 = 0; r22 < e5; r22++) {
                    arrayList.add(f(byteBuffer));
                }
                return com.google.firebase.firestore.l.d((String[]) arrayList.toArray(new String[0]));
            case -115:
                return Double.valueOf(Double.NaN);
            case -114:
                return Double.valueOf(Double.POSITIVE_INFINITY);
            case -113:
                return Double.valueOf(Double.NEGATIVE_INFINITY);
            case -112:
                return q(byteBuffer);
            case -111:
                return r(byteBuffer);
            case -110:
                return s(byteBuffer);
            default:
                return super.g(b5, byteBuffer);
        }
    }

    @Override // r2.p
    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int r5;
        if (obj instanceof Date) {
            byteArrayOutputStream.write(-128);
            r2.p.n(byteArrayOutputStream, ((Date) obj).getTime());
            return;
        }
        if (obj instanceof x0.o) {
            byteArrayOutputStream.write(-120);
            x0.o oVar = (x0.o) obj;
            r2.p.n(byteArrayOutputStream, oVar.i());
            r2.p.m(byteArrayOutputStream, oVar.g());
            return;
        }
        if (obj instanceof y) {
            byteArrayOutputStream.write(-127);
            r2.p.h(byteArrayOutputStream, 8);
            y yVar = (y) obj;
            r2.p.k(byteArrayOutputStream, yVar.g());
            r2.p.k(byteArrayOutputStream, yVar.h());
            return;
        }
        if (obj instanceof com.google.firebase.firestore.h) {
            byteArrayOutputStream.write(-126);
            com.google.firebase.firestore.h hVar = (com.google.firebase.firestore.h) obj;
            p(byteArrayOutputStream, hVar.k().r().q());
            p(byteArrayOutputStream, hVar.m());
            return;
        }
        if (obj instanceof com.google.firebase.firestore.i) {
            v(byteArrayOutputStream, (com.google.firebase.firestore.i) obj);
            return;
        }
        if (obj instanceof m0) {
            x(byteArrayOutputStream, (m0) obj);
            return;
        }
        if (obj instanceof com.google.firebase.firestore.c) {
            u(byteArrayOutputStream, (com.google.firebase.firestore.c) obj);
            return;
        }
        if (obj instanceof d0) {
            w(byteArrayOutputStream, (d0) obj);
            return;
        }
        if (obj instanceof p0) {
            y(byteArrayOutputStream, (p0) obj);
            return;
        }
        if (obj instanceof com.google.firebase.firestore.a) {
            byteArrayOutputStream.write(-125);
            r2.p.i(byteArrayOutputStream, ((com.google.firebase.firestore.a) obj).k());
            return;
        }
        if (obj instanceof Double) {
            Double d5 = (Double) obj;
            if (Double.isNaN(d5.doubleValue())) {
                r5 = -115;
            } else if (d5.equals(Double.valueOf(Double.NEGATIVE_INFINITY))) {
                r5 = -113;
            } else if (d5.equals(Double.valueOf(Double.POSITIVE_INFINITY))) {
                r5 = -114;
            }
            byteArrayOutputStream.write(r5);
            return;
        }
        super.p(byteArrayOutputStream, obj);
    }
}
