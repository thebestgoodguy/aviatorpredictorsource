package kotlinx.coroutines.internal;

/* loaded from: classes.dex */
final /* synthetic */ class a0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f6400a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f6400a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
