package e0;

import android.os.Looper;
import android.util.Log;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ClassLoader f3476a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile Thread f3477b;

    public static synchronized ClassLoader a() {
        ClassLoader classLoader;
        synchronized (b.class) {
            if (f3476a == null) {
                f3476a = b();
            }
            classLoader = f3476a;
        }
        return classLoader;
    }

    private static synchronized ClassLoader b() {
        synchronized (b.class) {
            ClassLoader classLoader = null;
            if (f3477b == null) {
                f3477b = c();
                if (f3477b == null) {
                    return null;
                }
            }
            synchronized (f3477b) {
                try {
                    classLoader = f3477b.getContextClassLoader();
                } catch (SecurityException e5) {
                    String valueOf = String.valueOf(e5.getMessage());
                    Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to get thread context classloader ".concat(valueOf) : new String("Failed to get thread context classloader "));
                }
            }
            return classLoader;
        }
    }

    private static synchronized Thread c() {
        SecurityException e5;
        Thread thread;
        Thread thread2;
        ThreadGroup threadGroup;
        synchronized (b.class) {
            ThreadGroup threadGroup2 = Looper.getMainLooper().getThread().getThreadGroup();
            if (threadGroup2 == null) {
                return null;
            }
            synchronized (Void.class) {
                try {
                    int activeGroupCount = threadGroup2.activeGroupCount();
                    ThreadGroup[] threadGroupArr = new ThreadGroup[activeGroupCount];
                    threadGroup2.enumerate(threadGroupArr);
                    int r6 = 0;
                    int r7 = 0;
                    while (true) {
                        if (r7 >= activeGroupCount) {
                            threadGroup = null;
                            break;
                        }
                        threadGroup = threadGroupArr[r7];
                        if ("dynamiteLoader".equals(threadGroup.getName())) {
                            break;
                        }
                        r7++;
                    }
                    if (threadGroup == null) {
                        threadGroup = new ThreadGroup(threadGroup2, "dynamiteLoader");
                    }
                    int activeCount = threadGroup.activeCount();
                    Thread[] threadArr = new Thread[activeCount];
                    threadGroup.enumerate(threadArr);
                    while (true) {
                        if (r6 >= activeCount) {
                            thread2 = null;
                            break;
                        }
                        thread2 = threadArr[r6];
                        if ("GmsDynamite".equals(thread2.getName())) {
                            break;
                        }
                        r6++;
                    }
                } catch (SecurityException e6) {
                    e5 = e6;
                    thread = null;
                }
                if (thread2 == null) {
                    try {
                        thread = new a(threadGroup, "GmsDynamite");
                        try {
                            thread.setContextClassLoader(null);
                            thread.start();
                        } catch (SecurityException e7) {
                            e5 = e7;
                            String valueOf = String.valueOf(e5.getMessage());
                            Log.w("DynamiteLoaderV2CL", valueOf.length() != 0 ? "Failed to enumerate thread/threadgroup ".concat(valueOf) : new String("Failed to enumerate thread/threadgroup "));
                            thread2 = thread;
                            return thread2;
                        }
                    } catch (SecurityException e8) {
                        e5 = e8;
                        thread = thread2;
                    }
                    thread2 = thread;
                }
            }
            return thread2;
        }
    }
}
