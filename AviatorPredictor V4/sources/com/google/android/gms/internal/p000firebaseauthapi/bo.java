package com.google.android.gms.internal.p000firebaseauthapi;

import e.a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x0.e;

/* loaded from: classes.dex */
public final class bo {

    /* renamed from: a, reason: collision with root package name */
    private static final Map f1435a = new a();

    /* renamed from: b, reason: collision with root package name */
    private static final Map f1436b = new a();

    public static String a(String str) {
        zn znVar;
        Map map = f1435a;
        synchronized (map) {
            znVar = (zn) map.get(str);
        }
        if (znVar != null) {
            return h(znVar.b(), znVar.a(), znVar.b().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String b(String str) {
        zn znVar;
        Map map = f1435a;
        synchronized (map) {
            znVar = (zn) map.get(str);
        }
        return (znVar != null ? "".concat(h(znVar.b(), znVar.a(), znVar.b().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String c(String str) {
        zn znVar;
        Map map = f1435a;
        synchronized (map) {
            znVar = (zn) map.get(str);
        }
        return (znVar != null ? "".concat(h(znVar.b(), znVar.a(), znVar.b().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    public static String d(String str) {
        zn znVar;
        Map map = f1435a;
        synchronized (map) {
            znVar = (zn) map.get(str);
        }
        return (znVar != null ? "".concat(h(znVar.b(), znVar.a(), znVar.b().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    public static void e(String str, ao aoVar) {
        Map map = f1436b;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(aoVar));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(aoVar));
                map.put(str, arrayList);
            }
        }
    }

    public static void f(e eVar, String str, int r4) {
        String b5 = eVar.r().b();
        Map map = f1435a;
        synchronized (map) {
            map.put(b5, new zn(str, r4));
        }
        Map map2 = f1436b;
        synchronized (map2) {
            if (map2.containsKey(b5)) {
                Iterator it = ((List) map2.get(b5)).iterator();
                boolean z4 = false;
                while (it.hasNext()) {
                    ao aoVar = (ao) ((WeakReference) it.next()).get();
                    if (aoVar != null) {
                        aoVar.j();
                        z4 = true;
                    }
                }
                if (!z4) {
                    f1435a.remove(b5);
                }
            }
        }
    }

    public static boolean g(e eVar) {
        return f1435a.containsKey(eVar.r().b());
    }

    private static String h(String str, int r32, boolean z4) {
        StringBuilder sb;
        String str2;
        if (z4) {
            sb = new StringBuilder();
            sb.append("http://[");
            sb.append(str);
            str2 = "]:";
        } else {
            sb = new StringBuilder();
            sb.append("http://");
            sb.append(str);
            str2 = ":";
        }
        sb.append(str2);
        sb.append(r32);
        sb.append("/");
        return sb.toString();
    }
}
