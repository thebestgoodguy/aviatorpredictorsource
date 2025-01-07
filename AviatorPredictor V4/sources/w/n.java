package w;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public class n {

    /* renamed from: b, reason: collision with root package name */
    private static final i f8019b = new i("LibraryVersion", "");

    /* renamed from: c, reason: collision with root package name */
    private static n f8020c = new n();

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, String> f8021a = new ConcurrentHashMap<>();

    protected n() {
    }

    public static n a() {
        return f8020c;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String b(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "Failed to get app version for libraryName: "
            java.lang.String r1 = "LibraryVersion"
            java.lang.String r2 = "Please provide a valid libraryName"
            w.r.f(r10, r2)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r2 = r9.f8021a
            boolean r2 = r2.containsKey(r10)
            if (r2 == 0) goto L1a
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f8021a
            java.lang.Object r10 = r0.get(r10)
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L1a:
            java.util.Properties r2 = new java.util.Properties
            r2.<init>()
            r3 = 1
            r4 = 0
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            r5 = 0
            r3[r5] = r10     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.lang.Class<w.n> r5 = w.n.class
            java.lang.String r6 = "/%s.properties"
            java.lang.String r3 = java.lang.String.format(r6, r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            java.io.InputStream r3 = r5.getResourceAsStream(r3)     // Catch: java.lang.Throwable -> L91 java.io.IOException -> L93
            if (r3 == 0) goto L6a
            r2.load(r3)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = "version"
            java.lang.String r4 = r2.getProperty(r5, r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            w.i r2 = w.n.f8019b     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5 + 12
            java.lang.String r6 = java.lang.String.valueOf(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r6 = r6.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r5 = r5 + r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.append(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = " version is "
            r6.append(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r6.append(r4)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = r6.toString()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r2.d(r1, r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            goto L83
        L6a:
            w.i r2 = w.n.f8019b     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            java.lang.String r5 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            int r6 = r5.length()     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            if (r6 == 0) goto L7b
            java.lang.String r5 = r0.concat(r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            goto L80
        L7b:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L80:
            r2.e(r1, r5)     // Catch: java.lang.Throwable -> L89 java.io.IOException -> L8c
        L83:
            if (r3 == 0) goto Lb5
            b0.i.a(r3)
            goto Lb5
        L89:
            r10 = move-exception
            r4 = r3
            goto Lc6
        L8c:
            r2 = move-exception
            r8 = r4
            r4 = r3
            r3 = r8
            goto L95
        L91:
            r10 = move-exception
            goto Lc6
        L93:
            r2 = move-exception
            r3 = r4
        L95:
            w.i r5 = w.n.f8019b     // Catch: java.lang.Throwable -> L91
            java.lang.String r6 = java.lang.String.valueOf(r10)     // Catch: java.lang.Throwable -> L91
            int r7 = r6.length()     // Catch: java.lang.Throwable -> L91
            if (r7 == 0) goto La6
            java.lang.String r0 = r0.concat(r6)     // Catch: java.lang.Throwable -> L91
            goto Lac
        La6:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> L91
            r6.<init>(r0)     // Catch: java.lang.Throwable -> L91
            r0 = r6
        Lac:
            r5.c(r1, r0, r2)     // Catch: java.lang.Throwable -> L91
            if (r4 == 0) goto Lb4
            b0.i.a(r4)
        Lb4:
            r4 = r3
        Lb5:
            if (r4 != 0) goto Lc0
            w.i r0 = w.n.f8019b
            java.lang.String r2 = ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used"
            r0.b(r1, r2)
            java.lang.String r4 = "UNKNOWN"
        Lc0:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r0 = r9.f8021a
            r0.put(r10, r4)
            return r4
        Lc6:
            if (r4 == 0) goto Lcb
            b0.i.a(r4)
        Lcb:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: w.n.b(java.lang.String):java.lang.String");
    }
}
