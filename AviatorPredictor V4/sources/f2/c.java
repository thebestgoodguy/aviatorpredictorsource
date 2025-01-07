package f2;

import io.flutter.embedding.engine.FlutterJNI;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import r2.b;

/* loaded from: classes.dex */
class c implements r2.b, f2.d {

    /* renamed from: a, reason: collision with root package name */
    private final FlutterJNI f3671a;

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, d> f3672b;

    /* renamed from: c, reason: collision with root package name */
    private Map<String, List<a>> f3673c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f3674d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f3675e;

    /* renamed from: f, reason: collision with root package name */
    private final Map<Integer, b.InterfaceC0084b> f3676f;

    /* renamed from: g, reason: collision with root package name */
    private int f3677g;

    /* renamed from: h, reason: collision with root package name */
    private final b f3678h;

    /* renamed from: i, reason: collision with root package name */
    private WeakHashMap<b.c, b> f3679i;

    /* renamed from: j, reason: collision with root package name */
    private f f3680j;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        public final ByteBuffer f3681a;

        /* renamed from: b, reason: collision with root package name */
        int f3682b;

        /* renamed from: c, reason: collision with root package name */
        long f3683c;

        a(ByteBuffer byteBuffer, int r22, long j4) {
            this.f3681a = byteBuffer;
            this.f3682b = r22;
            this.f3683c = j4;
        }
    }

    interface b {
        void a(Runnable runnable);
    }

    /* renamed from: f2.c$c, reason: collision with other inner class name */
    private static class C0039c implements f {

        /* renamed from: a, reason: collision with root package name */
        ExecutorService f3684a = e2.a.e().b();

        C0039c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class d {

        /* renamed from: a, reason: collision with root package name */
        public final b.a f3685a;

        /* renamed from: b, reason: collision with root package name */
        public final b f3686b;

        d(b.a aVar, b bVar) {
            this.f3685a = aVar;
            this.f3686b = bVar;
        }
    }

    static class e implements b.InterfaceC0084b {

        /* renamed from: a, reason: collision with root package name */
        private final FlutterJNI f3687a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3688b;

        /* renamed from: c, reason: collision with root package name */
        private final AtomicBoolean f3689c = new AtomicBoolean(false);

        e(FlutterJNI flutterJNI, int r4) {
            this.f3687a = flutterJNI;
            this.f3688b = r4;
        }

        @Override // r2.b.InterfaceC0084b
        public void a(ByteBuffer byteBuffer) {
            if (this.f3689c.getAndSet(true)) {
                throw new IllegalStateException("Reply already submitted");
            }
            if (byteBuffer == null) {
                this.f3687a.invokePlatformMessageEmptyResponseCallback(this.f3688b);
            } else {
                this.f3687a.invokePlatformMessageResponseCallback(this.f3688b, byteBuffer, byteBuffer.position());
            }
        }
    }

    interface f {
    }

    c(FlutterJNI flutterJNI) {
        this(flutterJNI, new C0039c());
    }

    c(FlutterJNI flutterJNI, f fVar) {
        this.f3672b = new HashMap();
        this.f3673c = new HashMap();
        this.f3674d = new Object();
        this.f3675e = new AtomicBoolean(false);
        this.f3676f = new HashMap();
        this.f3677g = 1;
        this.f3678h = new f2.e();
        this.f3679i = new WeakHashMap<>();
        this.f3671a = flutterJNI;
        this.f3680j = fVar;
    }

    private void h(final String str, final d dVar, final ByteBuffer byteBuffer, final int r14, final long j4) {
        b bVar = dVar != null ? dVar.f3686b : null;
        Runnable runnable = new Runnable() { // from class: f2.b
            @Override // java.lang.Runnable
            public final void run() {
                c.this.k(str, dVar, byteBuffer, r14, j4);
            }
        };
        if (bVar == null) {
            bVar = this.f3678h;
        }
        bVar.a(runnable);
    }

    private static void i(Error error) {
        Thread currentThread = Thread.currentThread();
        if (currentThread.getUncaughtExceptionHandler() == null) {
            throw error;
        }
        currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, error);
    }

    private void j(d dVar, ByteBuffer byteBuffer, int r6) {
        if (dVar != null) {
            try {
                e2.b.e("DartMessenger", "Deferring to registered handler to process message.");
                dVar.f3685a.a(byteBuffer, new e(this.f3671a, r6));
                return;
            } catch (Error e5) {
                i(e5);
                return;
            } catch (Exception e6) {
                e2.b.c("DartMessenger", "Uncaught exception in binary message listener", e6);
            }
        } else {
            e2.b.e("DartMessenger", "No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.f3671a.invokePlatformMessageEmptyResponseCallback(r6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void k(String str, d dVar, ByteBuffer byteBuffer, int r6, long j4) {
        z2.e.a("DartMessenger#handleMessageFromDart on " + str);
        try {
            j(dVar, byteBuffer, r6);
            if (byteBuffer != null && byteBuffer.isDirect()) {
                byteBuffer.limit(0);
            }
        } finally {
            this.f3671a.cleanupMessageData(j4);
            z2.e.b();
        }
    }

    @Override // r2.b
    public void a(String str, b.a aVar, b.c cVar) {
        if (aVar == null) {
            e2.b.e("DartMessenger", "Removing handler for channel '" + str + "'");
            synchronized (this.f3674d) {
                this.f3672b.remove(str);
            }
            return;
        }
        b bVar = null;
        if (cVar != null && (bVar = this.f3679i.get(cVar)) == null) {
            throw new IllegalArgumentException("Unrecognized TaskQueue, use BinaryMessenger to create your TaskQueue (ex makeBackgroundTaskQueue).");
        }
        e2.b.e("DartMessenger", "Setting handler for channel '" + str + "'");
        synchronized (this.f3674d) {
            this.f3672b.put(str, new d(aVar, bVar));
            List<a> remove = this.f3673c.remove(str);
            if (remove == null) {
                return;
            }
            for (a aVar2 : remove) {
                h(str, this.f3672b.get(str), aVar2.f3681a, aVar2.f3682b, aVar2.f3683c);
            }
        }
    }

    @Override // r2.b
    public void b(String str, b.a aVar) {
        a(str, aVar, null);
    }

    @Override // r2.b
    public void c(String str, ByteBuffer byteBuffer) {
        e2.b.e("DartMessenger", "Sending message over channel '" + str + "'");
        e(str, byteBuffer, null);
    }

    @Override // f2.d
    public void d(int r32, ByteBuffer byteBuffer) {
        e2.b.e("DartMessenger", "Received message reply from Dart.");
        b.InterfaceC0084b remove = this.f3676f.remove(Integer.valueOf(r32));
        if (remove != null) {
            try {
                e2.b.e("DartMessenger", "Invoking registered callback for reply from Dart.");
                remove.a(byteBuffer);
                if (byteBuffer == null || !byteBuffer.isDirect()) {
                    return;
                }
                byteBuffer.limit(0);
            } catch (Error e5) {
                i(e5);
            } catch (Exception e6) {
                e2.b.c("DartMessenger", "Uncaught exception in binary message reply handler", e6);
            }
        }
    }

    @Override // r2.b
    public void e(String str, ByteBuffer byteBuffer, b.InterfaceC0084b interfaceC0084b) {
        z2.e.a("DartMessenger#send on " + str);
        try {
            e2.b.e("DartMessenger", "Sending message with callback over channel '" + str + "'");
            int r02 = this.f3677g;
            this.f3677g = r02 + 1;
            if (interfaceC0084b != null) {
                this.f3676f.put(Integer.valueOf(r02), interfaceC0084b);
            }
            if (byteBuffer == null) {
                this.f3671a.dispatchEmptyPlatformMessage(str, r02);
            } else {
                this.f3671a.dispatchPlatformMessage(str, byteBuffer, byteBuffer.position(), r02);
            }
        } finally {
            z2.e.b();
        }
    }

    @Override // f2.d
    public void f(String str, ByteBuffer byteBuffer, int r12, long j4) {
        d dVar;
        boolean z4;
        e2.b.e("DartMessenger", "Received message from Dart over channel '" + str + "'");
        synchronized (this.f3674d) {
            dVar = this.f3672b.get(str);
            z4 = this.f3675e.get() && dVar == null;
            if (z4) {
                if (!this.f3673c.containsKey(str)) {
                    this.f3673c.put(str, new LinkedList());
                }
                this.f3673c.get(str).add(new a(byteBuffer, r12, j4));
            }
        }
        if (z4) {
            return;
        }
        h(str, dVar, byteBuffer, r12, j4);
    }
}
