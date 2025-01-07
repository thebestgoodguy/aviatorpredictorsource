package com.google.android.gms.dynamite;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import dalvik.system.DelegateLastClassLoader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import w.p;
import w.r;

/* loaded from: classes.dex */
public final class DynamiteModule {

    /* renamed from: h, reason: collision with root package name */
    private static Boolean f1354h = null;

    /* renamed from: i, reason: collision with root package name */
    private static String f1355i = null;

    /* renamed from: j, reason: collision with root package name */
    private static boolean f1356j = false;

    /* renamed from: k, reason: collision with root package name */
    private static int f1357k = -1;

    /* renamed from: p, reason: collision with root package name */
    private static m f1362p;

    /* renamed from: q, reason: collision with root package name */
    private static n f1363q;

    /* renamed from: a, reason: collision with root package name */
    private final Context f1364a;

    /* renamed from: l, reason: collision with root package name */
    private static final ThreadLocal<k> f1358l = new ThreadLocal<>();

    /* renamed from: m, reason: collision with root package name */
    private static final ThreadLocal<Long> f1359m = new com.google.android.gms.dynamite.b();

    /* renamed from: n, reason: collision with root package name */
    private static final b.a f1360n = new c();

    /* renamed from: b, reason: collision with root package name */
    public static final b f1348b = new d();

    /* renamed from: c, reason: collision with root package name */
    public static final b f1349c = new e();

    /* renamed from: d, reason: collision with root package name */
    public static final b f1350d = new f();

    /* renamed from: e, reason: collision with root package name */
    public static final b f1351e = new g();

    /* renamed from: f, reason: collision with root package name */
    public static final b f1352f = new h();

    /* renamed from: g, reason: collision with root package name */
    public static final b f1353g = new i();

    /* renamed from: o, reason: collision with root package name */
    public static final b f1361o = new j();

    @DynamiteApi
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    public static class a extends Exception {
        /* synthetic */ a(String str, e0.d dVar) {
            super(str);
        }

        /* synthetic */ a(String str, Throwable th, e0.d dVar) {
            super(str, th);
        }
    }

    public interface b {

        public interface a {
            int a(Context context, String str);

            int b(Context context, String str, boolean z4);
        }

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$b$b, reason: collision with other inner class name */
        public static class C0022b {

            /* renamed from: a, reason: collision with root package name */
            public int f1365a = 0;

            /* renamed from: b, reason: collision with root package name */
            public int f1366b = 0;

            /* renamed from: c, reason: collision with root package name */
            public int f1367c = 0;
        }

        C0022b a(Context context, String str, a aVar);
    }

    private DynamiteModule(Context context) {
        r.i(context);
        this.f1364a = context;
    }

    public static int a(Context context, String str) {
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 61);
            sb.append("com.google.android.gms.dynamite.descriptors.");
            sb.append(str);
            sb.append(".");
            sb.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (p.a(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb2 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb2.append("Module descriptor id '");
            sb2.append(valueOf);
            sb2.append("' didn't match expected id '");
            sb2.append(str);
            sb2.append("'");
            Log.e("DynamiteModule", sb2.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 45);
            sb3.append("Local module descriptor class for ");
            sb3.append(str);
            sb3.append(" not found.");
            Log.w("DynamiteModule", sb3.toString());
            return 0;
        } catch (Exception e5) {
            String valueOf2 = String.valueOf(e5.getMessage());
            Log.e("DynamiteModule", valueOf2.length() != 0 ? "Failed to load module descriptor class: ".concat(valueOf2) : new String("Failed to load module descriptor class: "));
            return 0;
        }
    }

    public static DynamiteModule c(Context context, b bVar, String str) {
        Boolean bool;
        d0.a y4;
        DynamiteModule dynamiteModule;
        n nVar;
        Boolean valueOf;
        d0.a h5;
        ThreadLocal<k> threadLocal = f1358l;
        k kVar = threadLocal.get();
        k kVar2 = new k(null);
        threadLocal.set(kVar2);
        ThreadLocal<Long> threadLocal2 = f1359m;
        long longValue = threadLocal2.get().longValue();
        try {
            threadLocal2.set(Long.valueOf(SystemClock.elapsedRealtime()));
            b.C0022b a5 = bVar.a(context, str, f1360n);
            int r15 = a5.f1365a;
            int r7 = a5.f1366b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str).length());
            sb.append("Considering local module ");
            sb.append(str);
            sb.append(":");
            sb.append(r15);
            sb.append(" and remote module ");
            sb.append(str);
            sb.append(":");
            sb.append(r7);
            Log.i("DynamiteModule", sb.toString());
            int r72 = a5.f1367c;
            if (r72 != 0) {
                if (r72 == -1) {
                    if (a5.f1365a != 0) {
                        r72 = -1;
                    }
                }
                if (r72 != 1 || a5.f1366b != 0) {
                    if (r72 == -1) {
                        DynamiteModule f5 = f(context, str);
                        if (longValue == 0) {
                            threadLocal2.remove();
                        } else {
                            threadLocal2.set(Long.valueOf(longValue));
                        }
                        Cursor cursor = kVar2.f1368a;
                        if (cursor != null) {
                            cursor.close();
                        }
                        threadLocal.set(kVar);
                        return f5;
                    }
                    if (r72 != 1) {
                        StringBuilder sb2 = new StringBuilder(47);
                        sb2.append("VersionPolicy returned invalid code:");
                        sb2.append(r72);
                        throw new a(sb2.toString(), null);
                    }
                    try {
                        int r14 = a5.f1366b;
                        try {
                            synchronized (DynamiteModule.class) {
                                bool = f1354h;
                            }
                            if (bool == null) {
                                throw new a("Failed to determine which loading route to use.", null);
                            }
                            if (bool.booleanValue()) {
                                StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb3.append("Selected remote version of ");
                                sb3.append(str);
                                sb3.append(", version >= ");
                                sb3.append(r14);
                                Log.i("DynamiteModule", sb3.toString());
                                synchronized (DynamiteModule.class) {
                                    nVar = f1363q;
                                }
                                if (nVar == null) {
                                    throw new a("DynamiteLoaderV2 was not cached.", null);
                                }
                                k kVar3 = threadLocal.get();
                                if (kVar3 == null || kVar3.f1368a == null) {
                                    throw new a("No result cursor", null);
                                }
                                Context applicationContext = context.getApplicationContext();
                                Cursor cursor2 = kVar3.f1368a;
                                d0.b.w(null);
                                synchronized (DynamiteModule.class) {
                                    valueOf = Boolean.valueOf(f1357k >= 2);
                                }
                                if (valueOf.booleanValue()) {
                                    Log.v("DynamiteModule", "Dynamite loader version >= 2, using loadModule2NoCrashUtils");
                                    h5 = nVar.w(d0.b.w(applicationContext), str, r14, d0.b.w(cursor2));
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to loadModule2");
                                    h5 = nVar.h(d0.b.w(applicationContext), str, r14, d0.b.w(cursor2));
                                }
                                Context context2 = (Context) d0.b.h(h5);
                                if (context2 == null) {
                                    throw new a("Failed to get module context", null);
                                }
                                dynamiteModule = new DynamiteModule(context2);
                            } else {
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 51);
                                sb4.append("Selected remote version of ");
                                sb4.append(str);
                                sb4.append(", version >= ");
                                sb4.append(r14);
                                Log.i("DynamiteModule", sb4.toString());
                                m i4 = i(context);
                                if (i4 == null) {
                                    throw new a("Failed to create IDynamiteLoader.", null);
                                }
                                int h6 = i4.h();
                                if (h6 >= 3) {
                                    k kVar4 = threadLocal.get();
                                    if (kVar4 == null) {
                                        throw new a("No cached result cursor holder", null);
                                    }
                                    y4 = i4.z(d0.b.w(context), str, r14, d0.b.w(kVar4.f1368a));
                                } else if (h6 == 2) {
                                    Log.w("DynamiteModule", "IDynamite loader version = 2");
                                    y4 = i4.A(d0.b.w(context), str, r14);
                                } else {
                                    Log.w("DynamiteModule", "Dynamite loader version < 2, falling back to createModuleContext");
                                    y4 = i4.y(d0.b.w(context), str, r14);
                                }
                                if (d0.b.h(y4) == null) {
                                    throw new a("Failed to load remote module.", null);
                                }
                                dynamiteModule = new DynamiteModule((Context) d0.b.h(y4));
                            }
                            if (longValue == 0) {
                                threadLocal2.remove();
                            } else {
                                threadLocal2.set(Long.valueOf(longValue));
                            }
                            Cursor cursor3 = kVar2.f1368a;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            threadLocal.set(kVar);
                            return dynamiteModule;
                        } catch (RemoteException e5) {
                            throw new a("Failed to load remote module.", e5, null);
                        } catch (a e6) {
                            throw e6;
                        } catch (Throwable th) {
                            b0.e.a(context, th);
                            throw new a("Failed to load remote module.", th, null);
                        }
                    } catch (a e7) {
                        String valueOf2 = String.valueOf(e7.getMessage());
                        Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to load remote module: ".concat(valueOf2) : new String("Failed to load remote module: "));
                        int r22 = a5.f1365a;
                        if (r22 == 0 || bVar.a(context, str, new l(r22, 0)).f1367c != -1) {
                            throw new a("Remote load failed. No local fallback found.", e7, null);
                        }
                        DynamiteModule f6 = f(context, str);
                        ThreadLocal<Long> threadLocal3 = f1359m;
                        if (longValue == 0) {
                            threadLocal3.remove();
                        } else {
                            threadLocal3.set(Long.valueOf(longValue));
                        }
                        Cursor cursor4 = kVar2.f1368a;
                        if (cursor4 != null) {
                            cursor4.close();
                        }
                        f1358l.set(kVar);
                        return f6;
                    }
                }
            }
            int r12 = a5.f1365a;
            int r23 = a5.f1366b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 92);
            sb5.append("No acceptable module ");
            sb5.append(str);
            sb5.append(" found. Local version is ");
            sb5.append(r12);
            sb5.append(" and remote version is ");
            sb5.append(r23);
            sb5.append(".");
            throw new a(sb5.toString(), null);
        } catch (Throwable th2) {
            ThreadLocal<Long> threadLocal4 = f1359m;
            if (longValue == 0) {
                threadLocal4.remove();
            } else {
                threadLocal4.set(Long.valueOf(longValue));
            }
            Cursor cursor5 = kVar2.f1368a;
            if (cursor5 != null) {
                cursor5.close();
            }
            f1358l.set(kVar);
            throw th2;
        }
    }

    public static int d(Context context, String str, boolean z4) {
        Field declaredField;
        Throwable th;
        RemoteException e5;
        Cursor cursor;
        try {
            synchronized (DynamiteModule.class) {
                Boolean bool = f1354h;
                if (bool == null) {
                    try {
                        declaredField = context.getApplicationContext().getClassLoader().loadClass(DynamiteLoaderClassLoader.class.getName()).getDeclaredField("sClassLoader");
                    } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException e6) {
                        String obj = e6.toString();
                        StringBuilder sb = new StringBuilder(obj.length() + 30);
                        sb.append("Failed to load module via V2: ");
                        sb.append(obj);
                        Log.w("DynamiteModule", sb.toString());
                        bool = Boolean.FALSE;
                    }
                    synchronized (declaredField.getDeclaringClass()) {
                        ClassLoader classLoader = (ClassLoader) declaredField.get(null);
                        if (classLoader == null) {
                            if (!f1356j) {
                                Boolean bool2 = Boolean.TRUE;
                                if (!bool2.equals(null)) {
                                    try {
                                        int e7 = e(context, str, z4);
                                        String str2 = f1355i;
                                        if (str2 != null && !str2.isEmpty()) {
                                            ClassLoader a5 = e0.b.a();
                                            if (a5 == null) {
                                                if (Build.VERSION.SDK_INT >= 29) {
                                                    String str3 = f1355i;
                                                    r.i(str3);
                                                    a5 = new DelegateLastClassLoader(str3, ClassLoader.getSystemClassLoader());
                                                } else {
                                                    String str4 = f1355i;
                                                    r.i(str4);
                                                    a5 = new com.google.android.gms.dynamite.a(str4, ClassLoader.getSystemClassLoader());
                                                }
                                            }
                                            g(a5);
                                            declaredField.set(null, a5);
                                            f1354h = bool2;
                                            return e7;
                                        }
                                        return e7;
                                    } catch (a unused) {
                                        declaredField.set(null, ClassLoader.getSystemClassLoader());
                                    }
                                }
                            }
                            declaredField.set(null, ClassLoader.getSystemClassLoader());
                        } else if (classLoader != ClassLoader.getSystemClassLoader()) {
                            try {
                                g(classLoader);
                            } catch (a unused2) {
                            }
                            bool = Boolean.TRUE;
                            f1354h = bool;
                        }
                        bool = Boolean.FALSE;
                        f1354h = bool;
                    }
                }
                boolean booleanValue = bool.booleanValue();
                int r12 = 0;
                if (booleanValue) {
                    try {
                        return e(context, str, z4);
                    } catch (a e8) {
                        String valueOf = String.valueOf(e8.getMessage());
                        Log.w("DynamiteModule", valueOf.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf) : new String("Failed to retrieve remote module version: "));
                        return 0;
                    }
                }
                m i4 = i(context);
                if (i4 != null) {
                    try {
                        try {
                            int h5 = i4.h();
                            if (h5 >= 3) {
                                k kVar = f1358l.get();
                                if (kVar == null || (cursor = kVar.f1368a) == null) {
                                    Cursor cursor2 = (Cursor) d0.b.h(i4.B(d0.b.w(context), str, z4, f1359m.get().longValue()));
                                    if (cursor2 != null) {
                                        try {
                                            if (cursor2.moveToFirst()) {
                                                int r11 = cursor2.getInt(0);
                                                r2 = (r11 <= 0 || !h(cursor2)) ? cursor2 : null;
                                                if (r2 != null) {
                                                    r2.close();
                                                }
                                                r12 = r11;
                                            }
                                        } catch (RemoteException e9) {
                                            e5 = e9;
                                            r2 = cursor2;
                                            String valueOf2 = String.valueOf(e5.getMessage());
                                            Log.w("DynamiteModule", valueOf2.length() != 0 ? "Failed to retrieve remote module version: ".concat(valueOf2) : new String("Failed to retrieve remote module version: "));
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            return r12;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r2 = cursor2;
                                            if (r2 != null) {
                                                r2.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    Log.w("DynamiteModule", "Failed to retrieve remote module version.");
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                } else {
                                    r12 = cursor.getInt(0);
                                }
                            } else if (h5 == 2) {
                                Log.w("DynamiteModule", "IDynamite loader version = 2, no high precision latency measurement.");
                                r12 = i4.x(d0.b.w(context), str, z4);
                            } else {
                                Log.w("DynamiteModule", "IDynamite loader version < 2, falling back to getModuleVersion2");
                                r12 = i4.w(d0.b.w(context), str, z4);
                            }
                        } catch (RemoteException e10) {
                            e5 = e10;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
                return r12;
            }
        } catch (Throwable th4) {
            b0.e.a(context, th4);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c6  */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int e(android.content.Context r10, java.lang.String r11, boolean r12) {
        /*
            r0 = 0
            java.lang.ThreadLocal<java.lang.Long> r1 = com.google.android.gms.dynamite.DynamiteModule.f1359m     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.Long r1 = (java.lang.Long) r1     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.content.ContentResolver r3 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r10 = "api_force_staging"
            java.lang.String r4 = "api"
            r9 = 1
            if (r9 == r12) goto L19
            r10 = r4
        L19:
            android.net.Uri$Builder r12 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r12.<init>()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "content"
            android.net.Uri$Builder r12 = r12.scheme(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r4 = "com.google.android.gms.chimera"
            android.net.Uri$Builder r12 = r12.authority(r4)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r12.path(r10)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendPath(r11)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            java.lang.String r11 = "requestStartTime"
            java.lang.String r12 = java.lang.String.valueOf(r1)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri$Builder r10 = r10.appendQueryParameter(r11, r12)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            android.net.Uri r4 = r10.build()     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laf java.lang.Exception -> Lb2
            if (r10 == 0) goto La0
            boolean r11 = r10.moveToFirst()     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r11 == 0) goto La0
            r11 = 0
            int r12 = r10.getInt(r11)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r12 <= 0) goto L8e
            java.lang.Class<com.google.android.gms.dynamite.DynamiteModule> r1 = com.google.android.gms.dynamite.DynamiteModule.class
            monitor-enter(r1)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            r2 = 2
            java.lang.String r2 = r10.getString(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f1355i = r2     // Catch: java.lang.Throwable -> L8b
            java.lang.String r2 = "loaderVersion"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L6f
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            com.google.android.gms.dynamite.DynamiteModule.f1357k = r2     // Catch: java.lang.Throwable -> L8b
        L6f:
            java.lang.String r2 = "disableStandaloneDynamiteLoader"
            int r2 = r10.getColumnIndex(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 < 0) goto L82
            int r2 = r10.getInt(r2)     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L7e
            goto L7f
        L7e:
            r9 = 0
        L7f:
            com.google.android.gms.dynamite.DynamiteModule.f1356j = r9     // Catch: java.lang.Throwable -> L8b
            r11 = r9
        L82:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            boolean r1 = h(r10)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            if (r1 == 0) goto L8e
            r10 = r0
            goto L8e
        L8b:
            r11 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8b
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L8e:
            if (r11 != 0) goto L96
            if (r10 == 0) goto L95
            r10.close()
        L95:
            return r12
        L96:
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "forcing fallback to container DynamiteLoader impl"
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        L9e:
            r11 = move-exception
            goto Lb5
        La0:
            java.lang.String r11 = "DynamiteModule"
            java.lang.String r12 = "Failed to retrieve remote module version."
            android.util.Log.w(r11, r12)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            com.google.android.gms.dynamite.DynamiteModule$a r11 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            java.lang.String r12 = "Failed to connect to dynamite module ContentResolver."
            r11.<init>(r12, r0)     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
            throw r11     // Catch: java.lang.Exception -> L9e java.lang.Throwable -> Lc2
        Laf:
            r10 = move-exception
            r11 = r10
            goto Lc4
        Lb2:
            r10 = move-exception
            r11 = r10
            r10 = r0
        Lb5:
            boolean r12 = r11 instanceof com.google.android.gms.dynamite.DynamiteModule.a     // Catch: java.lang.Throwable -> Lc2
            if (r12 == 0) goto Lba
            throw r11     // Catch: java.lang.Throwable -> Lc2
        Lba:
            com.google.android.gms.dynamite.DynamiteModule$a r12 = new com.google.android.gms.dynamite.DynamiteModule$a     // Catch: java.lang.Throwable -> Lc2
            java.lang.String r1 = "V2 version check failed"
            r12.<init>(r1, r11, r0)     // Catch: java.lang.Throwable -> Lc2
            throw r12     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            r11 = move-exception
            r0 = r10
        Lc4:
            if (r0 == 0) goto Lc9
            r0.close()
        Lc9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamite.DynamiteModule.e(android.content.Context, java.lang.String, boolean):int");
    }

    private static DynamiteModule f(Context context, String str) {
        String valueOf = String.valueOf(str);
        Log.i("DynamiteModule", valueOf.length() != 0 ? "Selected local version of ".concat(valueOf) : new String("Selected local version of "));
        return new DynamiteModule(context.getApplicationContext());
    }

    private static void g(ClassLoader classLoader) {
        n nVar;
        e0.d dVar = null;
        try {
            IBinder iBinder = (IBinder) classLoader.loadClass("com.google.android.gms.dynamiteloader.DynamiteLoaderV2").getConstructor(new Class[0]).newInstance(new Object[0]);
            if (iBinder == null) {
                nVar = null;
            } else {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoaderV2");
                nVar = queryLocalInterface instanceof n ? (n) queryLocalInterface : new n(iBinder);
            }
            f1363q = nVar;
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e5) {
            throw new a("Failed to instantiate dynamite loader", e5, dVar);
        }
    }

    private static boolean h(Cursor cursor) {
        k kVar = f1358l.get();
        if (kVar == null || kVar.f1368a != null) {
            return false;
        }
        kVar.f1368a = cursor;
        return true;
    }

    private static m i(Context context) {
        m mVar;
        synchronized (DynamiteModule.class) {
            m mVar2 = f1362p;
            if (mVar2 != null) {
                return mVar2;
            }
            try {
                IBinder iBinder = (IBinder) context.createPackageContext("com.google.android.gms", 3).getClassLoader().loadClass("com.google.android.gms.chimera.container.DynamiteLoaderImpl").newInstance();
                if (iBinder == null) {
                    mVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamite.IDynamiteLoader");
                    mVar = queryLocalInterface instanceof m ? (m) queryLocalInterface : new m(iBinder);
                }
                if (mVar != null) {
                    f1362p = mVar;
                    return mVar;
                }
            } catch (Exception e5) {
                String valueOf = String.valueOf(e5.getMessage());
                Log.e("DynamiteModule", valueOf.length() != 0 ? "Failed to load IDynamiteLoader from GmsCore: ".concat(valueOf) : new String("Failed to load IDynamiteLoader from GmsCore: "));
            }
            return null;
        }
    }

    public Context b() {
        return this.f1364a;
    }
}
