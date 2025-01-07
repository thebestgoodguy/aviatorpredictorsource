package q2;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import r2.j;
import x1.x;

/* loaded from: classes.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    public final r2.j f7320a;

    /* renamed from: b, reason: collision with root package name */
    private f f7321b;

    /* renamed from: c, reason: collision with root package name */
    final j.c f7322c;

    class a implements j.c {
        a() {
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            String message;
            Bundle bundle;
            if (p.this.f7321b == null) {
            }
            String str = iVar.f7455a;
            Object obj = iVar.f7456b;
            e2.b.e("TextInputChannel", "Received '" + str + "' message.");
            str.hashCode();
            char c5 = 65535;
            switch (str.hashCode()) {
                case -1779068172:
                    if (str.equals("TextInput.setPlatformViewClient")) {
                        c5 = 0;
                        break;
                    }
                    break;
                case -1015421462:
                    if (str.equals("TextInput.setEditingState")) {
                        c5 = 1;
                        break;
                    }
                    break;
                case -37561188:
                    if (str.equals("TextInput.setClient")) {
                        c5 = 2;
                        break;
                    }
                    break;
                case 270476819:
                    if (str.equals("TextInput.hide")) {
                        c5 = 3;
                        break;
                    }
                    break;
                case 270803918:
                    if (str.equals("TextInput.show")) {
                        c5 = 4;
                        break;
                    }
                    break;
                case 649192816:
                    if (str.equals("TextInput.sendAppPrivateCommand")) {
                        c5 = 5;
                        break;
                    }
                    break;
                case 1204752139:
                    if (str.equals("TextInput.setEditableSizeAndTransform")) {
                        c5 = 6;
                        break;
                    }
                    break;
                case 1727570905:
                    if (str.equals("TextInput.finishAutofillContext")) {
                        c5 = 7;
                        break;
                    }
                    break;
                case 1904427655:
                    if (str.equals("TextInput.clearClient")) {
                        c5 = '\b';
                        break;
                    }
                    break;
                case 2113369584:
                    if (str.equals("TextInput.requestAutofill")) {
                        c5 = '\t';
                        break;
                    }
                    break;
            }
            try {
                switch (c5) {
                    case 0:
                        JSONObject jSONObject = (JSONObject) obj;
                        p.this.f7321b.d(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                        dVar.a(null);
                        break;
                    case 1:
                        p.this.f7321b.g(e.a((JSONObject) obj));
                        dVar.a(null);
                        break;
                    case 2:
                        try {
                            JSONArray jSONArray = (JSONArray) obj;
                            p.this.f7321b.h(jSONArray.getInt(0), b.a(jSONArray.getJSONObject(1)));
                            dVar.a(null);
                            break;
                        } catch (NoSuchFieldException | JSONException e5) {
                            message = e5.getMessage();
                            dVar.b("error", message, null);
                            return;
                        }
                    case 3:
                        p.this.f7321b.j();
                        dVar.a(null);
                        break;
                    case 4:
                        p.this.f7321b.c();
                        dVar.a(null);
                        break;
                    case 5:
                        JSONObject jSONObject2 = (JSONObject) obj;
                        String string = jSONObject2.getString("action");
                        String string2 = jSONObject2.getString("data");
                        if (string2 == null || string2.isEmpty()) {
                            bundle = null;
                        } else {
                            bundle = new Bundle();
                            bundle.putString("data", string2);
                        }
                        p.this.f7321b.a(string, bundle);
                        dVar.a(null);
                        break;
                    case 6:
                        JSONObject jSONObject3 = (JSONObject) obj;
                        double d5 = jSONObject3.getDouble("width");
                        double d6 = jSONObject3.getDouble("height");
                        JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                        double[] dArr = new double[16];
                        for (int r8 = 0; r8 < 16; r8++) {
                            dArr[r8] = jSONArray2.getDouble(r8);
                        }
                        p.this.f7321b.e(d5, d6, dArr);
                        dVar.a(null);
                        break;
                    case 7:
                        p.this.f7321b.i(((Boolean) obj).booleanValue());
                        dVar.a(null);
                        break;
                    case '\b':
                        p.this.f7321b.b();
                        dVar.a(null);
                        break;
                    case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                        p.this.f7321b.f();
                        dVar.a(null);
                        break;
                    default:
                        dVar.c();
                        break;
                }
            } catch (JSONException e6) {
                message = e6.getMessage();
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f7324a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7325b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7326c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f7327d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f7328e;

        /* renamed from: f, reason: collision with root package name */
        public final d f7329f;

        /* renamed from: g, reason: collision with root package name */
        public final c f7330g;

        /* renamed from: h, reason: collision with root package name */
        public final Integer f7331h;

        /* renamed from: i, reason: collision with root package name */
        public final String f7332i;

        /* renamed from: j, reason: collision with root package name */
        public final a f7333j;

        /* renamed from: k, reason: collision with root package name */
        public final b[] f7334k;

        public static class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f7335a;

            /* renamed from: b, reason: collision with root package name */
            public final String[] f7336b;

            /* renamed from: c, reason: collision with root package name */
            public final e f7337c;

            /* renamed from: d, reason: collision with root package name */
            public final String f7338d;

            public a(String str, String[] strArr, String str2, e eVar) {
                this.f7335a = str;
                this.f7336b = strArr;
                this.f7338d = str2;
                this.f7337c = eVar;
            }

            public static a a(JSONObject jSONObject) {
                String string = jSONObject.getString("uniqueIdentifier");
                JSONArray jSONArray = jSONObject.getJSONArray("hints");
                String string2 = jSONObject.isNull("hintText") ? null : jSONObject.getString("hintText");
                JSONObject jSONObject2 = jSONObject.getJSONObject("editingValue");
                String[] strArr = new String[jSONArray.length()];
                for (int r4 = 0; r4 < jSONArray.length(); r4++) {
                    strArr[r4] = b(jSONArray.getString(r4));
                }
                return new a(string, strArr, string2, e.a(jSONObject2));
            }

            /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x00a3, code lost:
            
                if (r16.equals("familyName") == false) goto L7;
             */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            private static java.lang.String b(java.lang.String r16) {
                /*
                    Method dump skipped, instructions count: 802
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: q2.p.b.a.b(java.lang.String):java.lang.String");
            }
        }

        public b(boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, d dVar, c cVar, Integer num, String str, a aVar, b[] bVarArr) {
            this.f7324a = z4;
            this.f7325b = z5;
            this.f7326c = z6;
            this.f7327d = z7;
            this.f7328e = z8;
            this.f7329f = dVar;
            this.f7330g = cVar;
            this.f7331h = num;
            this.f7332i = str;
            this.f7333j = aVar;
            this.f7334k = bVarArr;
        }

        public static b a(JSONObject jSONObject) {
            b[] bVarArr;
            String string = jSONObject.getString("inputAction");
            if (string == null) {
                throw new JSONException("Configuration JSON missing 'inputAction' property.");
            }
            if (jSONObject.isNull("fields")) {
                bVarArr = null;
            } else {
                JSONArray jSONArray = jSONObject.getJSONArray("fields");
                int length = jSONArray.length();
                b[] bVarArr2 = new b[length];
                for (int r6 = 0; r6 < length; r6++) {
                    bVarArr2[r6] = a(jSONArray.getJSONObject(r6));
                }
                bVarArr = bVarArr2;
            }
            return new b(jSONObject.optBoolean("obscureText"), jSONObject.optBoolean("autocorrect", true), jSONObject.optBoolean("enableSuggestions"), jSONObject.optBoolean("enableIMEPersonalizedLearning"), jSONObject.optBoolean("enableDeltaModel"), d.d(jSONObject.getString("textCapitalization")), c.a(jSONObject.getJSONObject("inputType")), b(string), jSONObject.isNull("actionLabel") ? null : jSONObject.getString("actionLabel"), jSONObject.isNull("autofill") ? null : a.a(jSONObject.getJSONObject("autofill")), bVarArr);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x0072, code lost:
        
            if (r12.equals("TextInputAction.done") == false) goto L4;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private static java.lang.Integer b(java.lang.String r12) {
            /*
                r12.hashCode()
                int r0 = r12.hashCode()
                r1 = 7
                r2 = 6
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
                r9 = 0
                java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                r11 = -1
                switch(r0) {
                    case -810971940: goto L75;
                    case -737377923: goto L6c;
                    case -737089298: goto L61;
                    case -737080013: goto L56;
                    case -736940669: goto L4b;
                    case 469250275: goto L40;
                    case 1241689507: goto L35;
                    case 1539450297: goto L2a;
                    case 2110497650: goto L1e;
                    default: goto L1b;
                }
            L1b:
                r7 = -1
                goto L7f
            L1e:
                java.lang.String r0 = "TextInputAction.previous"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L27
                goto L1b
            L27:
                r7 = 8
                goto L7f
            L2a:
                java.lang.String r0 = "TextInputAction.newline"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L33
                goto L1b
            L33:
                r7 = 7
                goto L7f
            L35:
                java.lang.String r0 = "TextInputAction.go"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L3e
                goto L1b
            L3e:
                r7 = 6
                goto L7f
            L40:
                java.lang.String r0 = "TextInputAction.search"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L49
                goto L1b
            L49:
                r7 = 5
                goto L7f
            L4b:
                java.lang.String r0 = "TextInputAction.send"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L54
                goto L1b
            L54:
                r7 = 4
                goto L7f
            L56:
                java.lang.String r0 = "TextInputAction.none"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L5f
                goto L1b
            L5f:
                r7 = 3
                goto L7f
            L61:
                java.lang.String r0 = "TextInputAction.next"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L6a
                goto L1b
            L6a:
                r7 = 2
                goto L7f
            L6c:
                java.lang.String r0 = "TextInputAction.done"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7f
                goto L1b
            L75:
                java.lang.String r0 = "TextInputAction.unspecified"
                boolean r12 = r12.equals(r0)
                if (r12 != 0) goto L7e
                goto L1b
            L7e:
                r7 = 0
            L7f:
                switch(r7) {
                    case 0: goto La3;
                    case 1: goto L9e;
                    case 2: goto L99;
                    case 3: goto L98;
                    case 4: goto L93;
                    case 5: goto L8e;
                    case 6: goto L89;
                    case 7: goto L88;
                    case 8: goto L83;
                    default: goto L82;
                }
            L82:
                return r10
            L83:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r1)
                return r12
            L88:
                return r8
            L89:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
                return r12
            L8e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r5)
                return r12
            L93:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r4)
                return r12
            L98:
                return r8
            L99:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r3)
                return r12
            L9e:
                java.lang.Integer r12 = java.lang.Integer.valueOf(r2)
                return r12
            La3:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.p.b.b(java.lang.String):java.lang.Integer");
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        public final g f7339a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f7340b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f7341c;

        public c(g gVar, boolean z4, boolean z5) {
            this.f7339a = gVar;
            this.f7340b = z4;
            this.f7341c = z5;
        }

        public static c a(JSONObject jSONObject) {
            return new c(g.d(jSONObject.getString("name")), jSONObject.optBoolean("signed", false), jSONObject.optBoolean("decimal", false));
        }
    }

    public enum d {
        CHARACTERS("TextCapitalization.characters"),
        WORDS("TextCapitalization.words"),
        SENTENCES("TextCapitalization.sentences"),
        NONE("TextCapitalization.none");


        /* renamed from: e, reason: collision with root package name */
        private final String f7347e;

        d(String str) {
            this.f7347e = str;
        }

        static d d(String str) {
            for (d dVar : values()) {
                if (dVar.f7347e.equals(str)) {
                    return dVar;
                }
            }
            throw new NoSuchFieldException("No such TextCapitalization: " + str);
        }
    }

    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final String f7348a;

        /* renamed from: b, reason: collision with root package name */
        public final int f7349b;

        /* renamed from: c, reason: collision with root package name */
        public final int f7350c;

        /* renamed from: d, reason: collision with root package name */
        public final int f7351d;

        /* renamed from: e, reason: collision with root package name */
        public final int f7352e;

        public e(String str, int r5, int r6, int r7, int r8) {
            if (!(r5 == -1 && r6 == -1) && (r5 < 0 || r6 < 0)) {
                throw new IndexOutOfBoundsException("invalid selection: (" + String.valueOf(r5) + ", " + String.valueOf(r6) + ")");
            }
            if (!(r7 == -1 && r8 == -1) && (r7 < 0 || r7 > r8)) {
                throw new IndexOutOfBoundsException("invalid composing range: (" + String.valueOf(r7) + ", " + String.valueOf(r8) + ")");
            }
            if (r8 > str.length()) {
                throw new IndexOutOfBoundsException("invalid composing start: " + String.valueOf(r7));
            }
            if (r5 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection start: " + String.valueOf(r5));
            }
            if (r6 > str.length()) {
                throw new IndexOutOfBoundsException("invalid selection end: " + String.valueOf(r6));
            }
            this.f7348a = str;
            this.f7349b = r5;
            this.f7350c = r6;
            this.f7351d = r7;
            this.f7352e = r8;
        }

        public static e a(JSONObject jSONObject) {
            return new e(jSONObject.getString("text"), jSONObject.getInt("selectionBase"), jSONObject.getInt("selectionExtent"), jSONObject.getInt("composingBase"), jSONObject.getInt("composingExtent"));
        }

        public boolean b() {
            int r02 = this.f7351d;
            return r02 >= 0 && this.f7352e > r02;
        }

        public boolean c() {
            return this.f7349b >= 0;
        }
    }

    public interface f {
        void a(String str, Bundle bundle);

        void b();

        void c();

        void d(int r12, boolean z4);

        void e(double d5, double d6, double[] dArr);

        void f();

        void g(e eVar);

        void h(int r12, b bVar);

        void i(boolean z4);

        void j();
    }

    public enum g {
        TEXT("TextInputType.text"),
        DATETIME("TextInputType.datetime"),
        NAME("TextInputType.name"),
        POSTAL_ADDRESS("TextInputType.address"),
        NUMBER("TextInputType.number"),
        PHONE("TextInputType.phone"),
        MULTILINE("TextInputType.multiline"),
        EMAIL_ADDRESS("TextInputType.emailAddress"),
        URL("TextInputType.url"),
        VISIBLE_PASSWORD("TextInputType.visiblePassword"),
        NONE("TextInputType.none");


        /* renamed from: e, reason: collision with root package name */
        private final String f7365e;

        g(String str) {
            this.f7365e = str;
        }

        static g d(String str) {
            for (g gVar : values()) {
                if (gVar.f7365e.equals(str)) {
                    return gVar;
                }
            }
            throw new NoSuchFieldException("No such TextInputType: " + str);
        }
    }

    public p(f2.a aVar) {
        a aVar2 = new a();
        this.f7322c = aVar2;
        r2.j jVar = new r2.j(aVar, "flutter/textinput", r2.f.f7454a);
        this.f7320a = jVar;
        jVar.e(aVar2);
    }

    private static HashMap<Object, Object> b(ArrayList<io.flutter.plugin.editing.e> arrayList) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        JSONArray jSONArray = new JSONArray();
        Iterator<io.flutter.plugin.editing.e> it = arrayList.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().b());
        }
        hashMap.put("deltas", jSONArray);
        return hashMap;
    }

    private static HashMap<Object, Object> c(String str, int r32, int r4, int r5, int r6) {
        HashMap<Object, Object> hashMap = new HashMap<>();
        hashMap.put("text", str);
        hashMap.put("selectionBase", Integer.valueOf(r32));
        hashMap.put("selectionExtent", Integer.valueOf(r4));
        hashMap.put("composingBase", Integer.valueOf(r5));
        hashMap.put("composingExtent", Integer.valueOf(r6));
        return hashMap;
    }

    public void d(int r4) {
        e2.b.e("TextInputChannel", "Sending 'done' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.done"));
    }

    public void e(int r4) {
        e2.b.e("TextInputChannel", "Sending 'go' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.go"));
    }

    public void f(int r4) {
        e2.b.e("TextInputChannel", "Sending 'newline' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.newline"));
    }

    public void g(int r4) {
        e2.b.e("TextInputChannel", "Sending 'next' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.next"));
    }

    public void h(int r6, String str, Bundle bundle) {
        HashMap hashMap = new HashMap();
        hashMap.put("action", str);
        if (bundle != null) {
            HashMap hashMap2 = new HashMap();
            for (String str2 : bundle.keySet()) {
                Object obj = bundle.get(str2);
                if (obj instanceof byte[]) {
                    hashMap2.put(str2, bundle.getByteArray(str2));
                } else if (obj instanceof Byte) {
                    hashMap2.put(str2, Byte.valueOf(bundle.getByte(str2)));
                } else if (obj instanceof char[]) {
                    hashMap2.put(str2, bundle.getCharArray(str2));
                } else if (obj instanceof Character) {
                    hashMap2.put(str2, Character.valueOf(bundle.getChar(str2)));
                } else if (obj instanceof CharSequence[]) {
                    hashMap2.put(str2, bundle.getCharSequenceArray(str2));
                } else if (obj instanceof CharSequence) {
                    hashMap2.put(str2, bundle.getCharSequence(str2));
                } else if (obj instanceof float[]) {
                    hashMap2.put(str2, bundle.getFloatArray(str2));
                } else if (obj instanceof Float) {
                    hashMap2.put(str2, Float.valueOf(bundle.getFloat(str2)));
                }
            }
            hashMap.put("data", hashMap2);
        }
        this.f7320a.c("TextInputClient.performPrivateCommand", Arrays.asList(Integer.valueOf(r6), hashMap));
    }

    public void i(int r4) {
        e2.b.e("TextInputChannel", "Sending 'previous' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.previous"));
    }

    public void j() {
        this.f7320a.c("TextInputClient.requestExistingInputState", null);
    }

    public void k(int r4) {
        e2.b.e("TextInputChannel", "Sending 'search' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.search"));
    }

    public void l(int r4) {
        e2.b.e("TextInputChannel", "Sending 'send' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.send"));
    }

    public void m(f fVar) {
        this.f7321b = fVar;
    }

    public void n(int r4) {
        e2.b.e("TextInputChannel", "Sending 'unspecified' message.");
        this.f7320a.c("TextInputClient.performAction", Arrays.asList(Integer.valueOf(r4), "TextInputAction.unspecified"));
    }

    public void o(int r32, String str, int r5, int r6, int r7, int r8) {
        e2.b.e("TextInputChannel", "Sending message to update editing state: \nText: " + str + "\nSelection start: " + r5 + "\nSelection end: " + r6 + "\nComposing start: " + r7 + "\nComposing end: " + r8);
        this.f7320a.c("TextInputClient.updateEditingState", Arrays.asList(Integer.valueOf(r32), c(str, r5, r6, r7, r8)));
    }

    public void p(int r4, ArrayList<io.flutter.plugin.editing.e> arrayList) {
        e2.b.e("TextInputChannel", "Sending message to update editing state with deltas: \nNumber of deltas: " + arrayList.size());
        this.f7320a.c("TextInputClient.updateEditingStateWithDeltas", Arrays.asList(Integer.valueOf(r4), b(arrayList)));
    }

    public void q(int r7, HashMap<String, e> hashMap) {
        e2.b.e("TextInputChannel", "Sending message to update editing state for " + String.valueOf(hashMap.size()) + " field(s).");
        HashMap hashMap2 = new HashMap();
        for (Map.Entry<String, e> entry : hashMap.entrySet()) {
            e value = entry.getValue();
            hashMap2.put(entry.getKey(), c(value.f7348a, value.f7349b, value.f7350c, -1, -1));
        }
        this.f7320a.c("TextInputClient.updateEditingStateWithTag", Arrays.asList(Integer.valueOf(r7), hashMap2));
    }
}
