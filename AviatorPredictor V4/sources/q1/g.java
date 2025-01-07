package q1;

import android.content.Context;
import android.util.Base64OutputStream;
import b1.q;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import q1.k;

/* loaded from: classes.dex */
public class g implements j, k {

    /* renamed from: f, reason: collision with root package name */
    private static final ThreadFactory f7175f = new ThreadFactory() { // from class: q1.e
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread m4;
            m4 = g.m(runnable);
            return m4;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final r1.b<l> f7176a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f7177b;

    /* renamed from: c, reason: collision with root package name */
    private final r1.b<u1.i> f7178c;

    /* renamed from: d, reason: collision with root package name */
    private final Set<h> f7179d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f7180e;

    private g(final Context context, final String str, Set<h> set, r1.b<u1.i> bVar) {
        this(new r1.b() { // from class: q1.f
            @Override // r1.b
            public final Object get() {
                l k4;
                k4 = g.k(context, str);
                return k4;
            }
        }, set, new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), f7175f), bVar, context);
    }

    g(r1.b<l> bVar, Set<h> set, Executor executor, r1.b<u1.i> bVar2, Context context) {
        this.f7176a = bVar;
        this.f7179d = set;
        this.f7180e = executor;
        this.f7178c = bVar2;
        this.f7177b = context;
    }

    public static b1.d<g> h() {
        return b1.d.d(g.class, j.class, k.class).b(q.j(Context.class)).b(q.j(x0.e.class)).b(q.l(h.class)).b(q.k(u1.i.class)).e(new b1.h() { // from class: q1.b
            @Override // b1.h
            public final Object a(b1.e eVar) {
                g i4;
                i4 = g.i(eVar);
                return i4;
            }
        }).c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ g i(b1.e eVar) {
        return new g((Context) eVar.a(Context.class), ((x0.e) eVar.a(x0.e.class)).s(), eVar.c(h.class), eVar.b(u1.i.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String j() {
        String byteArrayOutputStream;
        synchronized (this) {
            l lVar = this.f7176a.get();
            List<m> c5 = lVar.c();
            lVar.b();
            JSONArray jSONArray = new JSONArray();
            for (int r22 = 0; r22 < c5.size(); r22++) {
                m mVar = c5.get(r22);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("agent", mVar.c());
                jSONObject.put("dates", new JSONArray((Collection) mVar.b()));
                jSONArray.put(jSONObject);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("heartbeats", jSONArray);
            jSONObject2.put("version", "2");
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                try {
                    gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                    gZIPOutputStream.close();
                    base64OutputStream.close();
                    byteArrayOutputStream = byteArrayOutputStream2.toString("UTF-8");
                } finally {
                }
            } finally {
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l k(Context context, String str) {
        return new l(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void l() {
        synchronized (this) {
            this.f7176a.get().k(System.currentTimeMillis(), this.f7178c.get().a());
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread m(Runnable runnable) {
        return new Thread(runnable, "heartbeat-information-executor");
    }

    @Override // q1.j
    public o0.h<String> a() {
        return i.g.a(this.f7177b) ^ true ? o0.k.d("") : o0.k.b(this.f7180e, new Callable() { // from class: q1.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String j4;
                j4 = g.this.j();
                return j4;
            }
        });
    }

    @Override // q1.k
    public synchronized k.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        l lVar = this.f7176a.get();
        if (!lVar.i(currentTimeMillis)) {
            return k.a.NONE;
        }
        lVar.g();
        return k.a.GLOBAL;
    }

    public o0.h<Void> n() {
        if (this.f7179d.size() > 0 && !(!i.g.a(this.f7177b))) {
            return o0.k.b(this.f7180e, new Callable() { // from class: q1.d
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    Void l4;
                    l4 = g.this.l();
                    return l4;
                }
            });
        }
        return o0.k.d(null);
    }
}
