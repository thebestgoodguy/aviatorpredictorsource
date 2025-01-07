package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import r2.a;

/* loaded from: classes.dex */
public final /* synthetic */ class p {

    class a implements l.h<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4780a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4781b;

        a(Map map, a.e eVar) {
            this.f4780a = map;
            this.f4781b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4780a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4781b.a(this.f4780a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f4780a.put("result", null);
            this.f4781b.a(this.f4780a);
        }
    }

    class b implements l.h<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4782a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4783b;

        b(Map map, a.e eVar) {
            this.f4782a = map;
            this.f4783b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4782a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4783b.a(this.f4782a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f4782a.put("result", null);
            this.f4783b.a(this.f4782a);
        }
    }

    class c implements l.h<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4784a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4785b;

        c(Map map, a.e eVar) {
            this.f4784a = map;
            this.f4785b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4784a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4785b.a(this.f4784a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r32) {
            this.f4784a.put("result", null);
            this.f4785b.a(this.f4784a);
        }
    }

    public static r2.h<Object> d() {
        return l.c.f4739d;
    }

    public static /* synthetic */ void e(l.b bVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            Boolean bool = (Boolean) arrayList.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            bVar.a(str, bool, new a(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void f(l.b bVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            Boolean bool = (Boolean) arrayList.get(1);
            if (bool == null) {
                throw new NullPointerException("enabledArg unexpectedly null.");
            }
            bVar.g(str, bool, new b(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void g(l.b bVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            String str = (String) ((ArrayList) obj).get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            bVar.h(str, new c(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static void h(r2.b bVar, final l.b bVar2) {
        r2.a aVar = new r2.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticDataCollectionEnabled", d());
        if (bVar2 != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.m
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    p.e(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r2.a aVar2 = new r2.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.setAutomaticResourceManagementEnabled", d());
        if (bVar2 != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.n
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    p.f(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r2.a aVar3 = new r2.a(bVar, "dev.flutter.pigeon.FirebaseAppHostApi.delete", d());
        if (bVar2 != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.o
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    p.g(l.b.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
