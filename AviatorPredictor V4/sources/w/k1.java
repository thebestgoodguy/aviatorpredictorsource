package w;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
final class k1 implements ServiceConnection, o1 {

    /* renamed from: a, reason: collision with root package name */
    private final Map<ServiceConnection, ServiceConnection> f8007a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private int f8008b = 2;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8009c;

    /* renamed from: d, reason: collision with root package name */
    private IBinder f8010d;

    /* renamed from: e, reason: collision with root package name */
    private final j1 f8011e;

    /* renamed from: f, reason: collision with root package name */
    private ComponentName f8012f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n1 f8013g;

    public k1(n1 n1Var, j1 j1Var) {
        this.f8013g = n1Var;
        this.f8011e = j1Var;
    }

    public final int a() {
        return this.f8008b;
    }

    public final ComponentName b() {
        return this.f8012f;
    }

    public final IBinder c() {
        return this.f8010d;
    }

    public final void d(ServiceConnection serviceConnection, ServiceConnection serviceConnection2, String str) {
        this.f8007a.put(serviceConnection, serviceConnection2);
    }

    public final void e(String str, Executor executor) {
        a0.a aVar;
        Context context;
        Context context2;
        a0.a aVar2;
        Context context3;
        Handler handler;
        Handler handler2;
        long j4;
        this.f8008b = 3;
        n1 n1Var = this.f8013g;
        aVar = n1Var.f8027j;
        context = n1Var.f8024g;
        j1 j1Var = this.f8011e;
        context2 = n1Var.f8024g;
        boolean c5 = aVar.c(context, str, j1Var.c(context2), this, this.f8011e.a(), executor);
        this.f8009c = c5;
        if (c5) {
            handler = this.f8013g.f8025h;
            Message obtainMessage = handler.obtainMessage(1, this.f8011e);
            handler2 = this.f8013g.f8025h;
            j4 = this.f8013g.f8029l;
            handler2.sendMessageDelayed(obtainMessage, j4);
            return;
        }
        this.f8008b = 2;
        try {
            n1 n1Var2 = this.f8013g;
            aVar2 = n1Var2.f8027j;
            context3 = n1Var2.f8024g;
            aVar2.b(context3, this);
        } catch (IllegalArgumentException unused) {
        }
    }

    public final void f(ServiceConnection serviceConnection, String str) {
        this.f8007a.remove(serviceConnection);
    }

    public final void g(String str) {
        Handler handler;
        a0.a aVar;
        Context context;
        handler = this.f8013g.f8025h;
        handler.removeMessages(1, this.f8011e);
        n1 n1Var = this.f8013g;
        aVar = n1Var.f8027j;
        context = n1Var.f8024g;
        aVar.b(context, this);
        this.f8009c = false;
        this.f8008b = 2;
    }

    public final boolean h(ServiceConnection serviceConnection) {
        return this.f8007a.containsKey(serviceConnection);
    }

    public final boolean i() {
        return this.f8007a.isEmpty();
    }

    public final boolean j() {
        return this.f8009c;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8013g.f8023f;
        synchronized (hashMap) {
            handler = this.f8013g.f8025h;
            handler.removeMessages(1, this.f8011e);
            this.f8010d = iBinder;
            this.f8012f = componentName;
            Iterator<ServiceConnection> it = this.f8007a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceConnected(componentName, iBinder);
            }
            this.f8008b = 1;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HashMap hashMap;
        Handler handler;
        hashMap = this.f8013g.f8023f;
        synchronized (hashMap) {
            handler = this.f8013g.f8025h;
            handler.removeMessages(1, this.f8011e);
            this.f8010d = null;
            this.f8012f = componentName;
            Iterator<ServiceConnection> it = this.f8007a.values().iterator();
            while (it.hasNext()) {
                it.next().onServiceDisconnected(componentName);
            }
            this.f8008b = 2;
        }
    }
}
