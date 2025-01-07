package io.flutter.plugins.firebase.core;

import io.flutter.plugins.firebase.core.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import r2.a;

/* loaded from: classes.dex */
public final /* synthetic */ class t {

    class a implements l.h<l.g> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4789a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4790b;

        a(Map map, a.e eVar) {
            this.f4789a = map;
            this.f4790b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4789a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4790b.a(this.f4789a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(l.g gVar) {
            this.f4789a.put("result", gVar);
            this.f4790b.a(this.f4789a);
        }
    }

    class b implements l.h<List<l.g>> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4791a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4792b;

        b(Map map, a.e eVar) {
            this.f4791a = map;
            this.f4792b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4791a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4792b.a(this.f4791a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(List<l.g> list) {
            this.f4791a.put("result", list);
            this.f4792b.a(this.f4791a);
        }
    }

    class c implements l.h<l.f> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Map f4793a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ a.e f4794b;

        c(Map map, a.e eVar) {
            this.f4793a = map;
            this.f4794b = eVar;
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        public void b(Throwable th) {
            Map b5;
            Map map = this.f4793a;
            b5 = l.b(th);
            map.put("error", b5);
            this.f4794b.a(this.f4793a);
        }

        @Override // io.flutter.plugins.firebase.core.l.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(l.f fVar) {
            this.f4793a.put("result", fVar);
            this.f4794b.a(this.f4793a);
        }
    }

    public static r2.h<Object> d() {
        return l.e.f4740d;
    }

    public static /* synthetic */ void e(l.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            ArrayList arrayList = (ArrayList) obj;
            String str = (String) arrayList.get(0);
            if (str == null) {
                throw new NullPointerException("appNameArg unexpectedly null.");
            }
            l.f fVar = (l.f) arrayList.get(1);
            if (fVar == null) {
                throw new NullPointerException("initializeAppRequestArg unexpectedly null.");
            }
            dVar.b(str, fVar, new a(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void f(l.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            dVar.e(new b(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static /* synthetic */ void g(l.d dVar, Object obj, a.e eVar) {
        Map b5;
        HashMap hashMap = new HashMap();
        try {
            dVar.f(new c(hashMap, eVar));
        } catch (Error | RuntimeException e5) {
            b5 = l.b(e5);
            hashMap.put("error", b5);
            eVar.a(hashMap);
        }
    }

    public static void h(r2.b bVar, final l.d dVar) {
        r2.a aVar = new r2.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeApp", d());
        if (dVar != null) {
            aVar.e(new a.d() { // from class: io.flutter.plugins.firebase.core.s
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    t.e(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar.e(null);
        }
        r2.a aVar2 = new r2.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.initializeCore", d());
        if (dVar != null) {
            aVar2.e(new a.d() { // from class: io.flutter.plugins.firebase.core.q
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    t.f(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar2.e(null);
        }
        r2.a aVar3 = new r2.a(bVar, "dev.flutter.pigeon.FirebaseCoreHostApi.optionsFromResource", d());
        if (dVar != null) {
            aVar3.e(new a.d() { // from class: io.flutter.plugins.firebase.core.r
                @Override // r2.a.d
                public final void a(Object obj, a.e eVar) {
                    t.g(l.d.this, obj, eVar);
                }
            });
        } else {
            aVar3.e(null);
        }
    }
}
