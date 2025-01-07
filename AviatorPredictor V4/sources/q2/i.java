package q2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import r2.j;

/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final r2.j f7214a;

    /* renamed from: b, reason: collision with root package name */
    private h f7215b;

    /* renamed from: c, reason: collision with root package name */
    final j.c f7216c;

    class a implements j.c {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x011f A[Catch: JSONException -> 0x0216, TryCatch #9 {JSONException -> 0x0216, blocks: (B:7:0x002c, B:8:0x0030, B:12:0x00c3, B:14:0x00c8, B:16:0x00e1, B:17:0x00f0, B:19:0x00f5, B:27:0x00f9, B:22:0x0113, B:24:0x011f, B:29:0x00fe, B:30:0x012c, B:31:0x0158, B:32:0x0162, B:48:0x01e2, B:42:0x01fc, B:70:0x014f, B:39:0x0153, B:64:0x0185, B:58:0x01a3, B:38:0x01bf, B:76:0x01dc, B:52:0x01f6, B:46:0x0210, B:77:0x0035, B:80:0x0040, B:83:0x004b, B:86:0x0057, B:89:0x0062, B:92:0x006c, B:95:0x0077, B:98:0x0081, B:101:0x008b, B:104:0x0095, B:107:0x009f, B:110:0x00a9, B:113:0x00b4, B:34:0x01a8), top: B:6:0x002c, inners: #6, #8, #10, #11 }] */
        @Override // r2.j.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(r2.i r6, r2.j.d r7) {
            /*
                Method dump skipped, instructions count: 644
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.i.a.a(r2.i, r2.j$d):void");
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7218a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7219b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f7220c;

        static {
            int[] r02 = new int[k.values().length];
            f7220c = r02;
            try {
                r02[k.LEAN_BACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7220c[k.IMMERSIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7220c[k.IMMERSIVE_STICKY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7220c[k.EDGE_TO_EDGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] r4 = new int[l.values().length];
            f7219b = r4;
            try {
                r4[l.TOP_OVERLAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7219b[l.BOTTOM_OVERLAYS.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            int[] r42 = new int[f.values().length];
            f7218a = r42;
            try {
                r42[f.PORTRAIT_UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7218a[f.PORTRAIT_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7218a[f.LANDSCAPE_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7218a[f.LANDSCAPE_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f7221a;

        /* renamed from: b, reason: collision with root package name */
        public final String f7222b;

        public c(int r12, String str) {
            this.f7221a = r12;
            this.f7222b = str;
        }
    }

    public enum d {
        LIGHT("Brightness.light"),
        DARK("Brightness.dark");


        /* renamed from: e, reason: collision with root package name */
        private String f7226e;

        d(String str) {
            this.f7226e = str;
        }

        static d d(String str) {
            for (d dVar : values()) {
                if (dVar.f7226e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such Brightness: " + str);
        }
    }

    public enum e {
        PLAIN_TEXT("text/plain");


        /* renamed from: e, reason: collision with root package name */
        private String f7229e;

        e(String str) {
            this.f7229e = str;
        }

        static e d(String str) {
            for (e eVar : values()) {
                if (eVar.f7229e.equals(str)) {
                    return eVar;
                }
            }
            throw new NoSuchFieldException("No such ClipboardContentFormat: " + str);
        }
    }

    public enum f {
        PORTRAIT_UP("DeviceOrientation.portraitUp"),
        PORTRAIT_DOWN("DeviceOrientation.portraitDown"),
        LANDSCAPE_LEFT("DeviceOrientation.landscapeLeft"),
        LANDSCAPE_RIGHT("DeviceOrientation.landscapeRight");


        /* renamed from: e, reason: collision with root package name */
        private String f7235e;

        f(String str) {
            this.f7235e = str;
        }

        static f d(String str) {
            for (f fVar : values()) {
                if (fVar.f7235e.equals(str)) {
                    return fVar;
                }
            }
            throw new NoSuchFieldException("No such DeviceOrientation: " + str);
        }
    }

    public enum g {
        STANDARD(null),
        LIGHT_IMPACT("HapticFeedbackType.lightImpact"),
        MEDIUM_IMPACT("HapticFeedbackType.mediumImpact"),
        HEAVY_IMPACT("HapticFeedbackType.heavyImpact"),
        SELECTION_CLICK("HapticFeedbackType.selectionClick");


        /* renamed from: e, reason: collision with root package name */
        private final String f7242e;

        g(String str) {
            this.f7242e = str;
        }

        static g d(String str) {
            for (g gVar : values()) {
                String str2 = gVar.f7242e;
                if ((str2 == null && str == null) || (str2 != null && str2.equals(str))) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such HapticFeedbackType: " + str);
        }
    }

    public interface h {
        void a();

        void b();

        void c(c cVar);

        void d();

        void e(EnumC0078i enumC0078i);

        void f(String str);

        CharSequence g(e eVar);

        void h(j jVar);

        void i(g gVar);

        void j(k kVar);

        void k(int r12);

        void l(List<l> list);

        boolean m();
    }

    /* renamed from: q2.i$i, reason: collision with other inner class name */
    public enum EnumC0078i {
        CLICK("SystemSoundType.click"),
        ALERT("SystemSoundType.alert");


        /* renamed from: e, reason: collision with root package name */
        private final String f7246e;

        EnumC0078i(String str) {
            this.f7246e = str;
        }

        static EnumC0078i d(String str) {
            for (EnumC0078i enumC0078i : values()) {
                if (enumC0078i.f7246e.equals(str)) {
                    return enumC0078i;
                }
            }
            throw new NoSuchFieldException("No such SoundType: " + str);
        }
    }

    public static class j {

        /* renamed from: a, reason: collision with root package name */
        public final Integer f7247a;

        /* renamed from: b, reason: collision with root package name */
        public final d f7248b;

        /* renamed from: c, reason: collision with root package name */
        public final Boolean f7249c;

        /* renamed from: d, reason: collision with root package name */
        public final Integer f7250d;

        /* renamed from: e, reason: collision with root package name */
        public final d f7251e;

        /* renamed from: f, reason: collision with root package name */
        public final Integer f7252f;

        /* renamed from: g, reason: collision with root package name */
        public final Boolean f7253g;

        public j(Integer num, d dVar, Boolean bool, Integer num2, d dVar2, Integer num3, Boolean bool2) {
            this.f7247a = num;
            this.f7248b = dVar;
            this.f7249c = bool;
            this.f7250d = num2;
            this.f7251e = dVar2;
            this.f7252f = num3;
            this.f7253g = bool2;
        }
    }

    public enum k {
        LEAN_BACK("SystemUiMode.leanBack"),
        IMMERSIVE("SystemUiMode.immersive"),
        IMMERSIVE_STICKY("SystemUiMode.immersiveSticky"),
        EDGE_TO_EDGE("SystemUiMode.edgeToEdge");


        /* renamed from: e, reason: collision with root package name */
        private String f7259e;

        k(String str) {
            this.f7259e = str;
        }

        static k d(String str) {
            for (k kVar : values()) {
                if (kVar.f7259e.equals(str)) {
                    return kVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiMode: " + str);
        }
    }

    public enum l {
        TOP_OVERLAYS("SystemUiOverlay.top"),
        BOTTOM_OVERLAYS("SystemUiOverlay.bottom");


        /* renamed from: e, reason: collision with root package name */
        private String f7263e;

        l(String str) {
            this.f7263e = str;
        }

        static l d(String str) {
            for (l lVar : values()) {
                if (lVar.f7263e.equals(str)) {
                    return lVar;
                }
            }
            throw new NoSuchFieldException("No such SystemUiOverlay: " + str);
        }
    }

    public i(f2.a aVar) {
        a aVar2 = new a();
        this.f7216c = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/platform", r2.f.f7454a);
        this.f7214a = jVar;
        jVar.e(aVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c g(JSONObject jSONObject) {
        int r02 = jSONObject.getInt("primaryColor");
        if (r02 != 0) {
            r02 |= -16777216;
        }
        return new c(r02, jSONObject.getString("label"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0053 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int h(org.json.JSONArray r10) {
        /*
            r9 = this;
            r0 = 0
            r1 = 0
            r2 = 0
            r3 = 0
        L4:
            int r4 = r10.length()
            r5 = 4
            r6 = 2
            r7 = 1
            if (r1 >= r4) goto L38
            java.lang.String r4 = r10.getString(r1)
            q2.i$f r4 = q2.i.f.d(r4)
            int[] r8 = q2.i.b.f7218a
            int r4 = r4.ordinal()
            r4 = r8[r4]
            if (r4 == r7) goto L30
            if (r4 == r6) goto L2d
            r6 = 3
            if (r4 == r6) goto L2a
            if (r4 == r5) goto L27
            goto L32
        L27:
            r2 = r2 | 8
            goto L32
        L2a:
            r2 = r2 | 2
            goto L32
        L2d:
            r2 = r2 | 4
            goto L32
        L30:
            r2 = r2 | 1
        L32:
            if (r3 != 0) goto L35
            r3 = r2
        L35:
            int r1 = r1 + 1
            goto L4
        L38:
            if (r2 == 0) goto L57
            r10 = 9
            r1 = 8
            switch(r2) {
                case 2: goto L56;
                case 3: goto L4d;
                case 4: goto L4c;
                case 5: goto L4a;
                case 6: goto L4d;
                case 7: goto L4d;
                case 8: goto L49;
                case 9: goto L4d;
                case 10: goto L46;
                case 11: goto L45;
                case 12: goto L4d;
                case 13: goto L4d;
                case 14: goto L4d;
                case 15: goto L42;
                default: goto L41;
            }
        L41:
            goto L53
        L42:
            r10 = 13
            return r10
        L45:
            return r6
        L46:
            r10 = 11
            return r10
        L49:
            return r1
        L4a:
            r10 = 12
        L4c:
            return r10
        L4d:
            if (r3 == r6) goto L56
            if (r3 == r5) goto L55
            if (r3 == r1) goto L54
        L53:
            return r7
        L54:
            return r1
        L55:
            return r10
        L56:
            return r0
        L57:
            r10 = -1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.i.h(org.json.JSONArray):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public j i(JSONObject jSONObject) {
        return new j(!jSONObject.isNull("statusBarColor") ? Integer.valueOf(jSONObject.getInt("statusBarColor")) : null, !jSONObject.isNull("statusBarIconBrightness") ? d.d(jSONObject.getString("statusBarIconBrightness")) : null, !jSONObject.isNull("systemStatusBarContrastEnforced") ? Boolean.valueOf(jSONObject.getBoolean("systemStatusBarContrastEnforced")) : null, !jSONObject.isNull("systemNavigationBarColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarColor")) : null, !jSONObject.isNull("systemNavigationBarIconBrightness") ? d.d(jSONObject.getString("systemNavigationBarIconBrightness")) : null, !jSONObject.isNull("systemNavigationBarDividerColor") ? Integer.valueOf(jSONObject.getInt("systemNavigationBarDividerColor")) : null, jSONObject.isNull("systemNavigationBarContrastEnforced") ? null : Boolean.valueOf(jSONObject.getBoolean("systemNavigationBarContrastEnforced")));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public k j(String str) {
        int r22 = b.f7220c[k.d(str).ordinal()];
        return r22 != 1 ? r22 != 2 ? r22 != 3 ? r22 != 4 ? k.EDGE_TO_EDGE : k.EDGE_TO_EDGE : k.IMMERSIVE_STICKY : k.IMMERSIVE : k.LEAN_BACK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public List<l> k(JSONArray jSONArray) {
        l lVar;
        ArrayList arrayList = new ArrayList();
        for (int r12 = 0; r12 < jSONArray.length(); r12++) {
            int r22 = b.f7219b[l.d(jSONArray.getString(r12)).ordinal()];
            if (r22 == 1) {
                lVar = l.TOP_OVERLAYS;
            } else if (r22 == 2) {
                lVar = l.BOTTOM_OVERLAYS;
            }
            arrayList.add(lVar);
        }
        return arrayList;
    }

    public void l(h hVar) {
        this.f7215b = hVar;
    }

    public void m(boolean z4) {
        e2.b.e("PlatformChannel", "Sending 'systemUIChange' message.");
        this.f7214a.c("SystemChrome.systemUIChange", Arrays.asList(Boolean.valueOf(z4)));
    }
}
