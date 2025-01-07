package w;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes.dex */
public final class c1 implements ServiceConnection {

    /* renamed from: a, reason: collision with root package name */
    private final int f7939a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f7940b;

    public c1(c cVar, int r22) {
        this.f7940b = cVar;
        this.f7939a = r22;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Object obj;
        c cVar = this.f7940b;
        if (iBinder == null) {
            c.b0(cVar, 16);
            return;
        }
        obj = cVar.f7924n;
        synchronized (obj) {
            c cVar2 = this.f7940b;
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            cVar2.f7925o = (queryLocalInterface == null || !(queryLocalInterface instanceof m)) ? new v0(iBinder) : (m) queryLocalInterface;
        }
        this.f7940b.c0(0, null, this.f7939a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        Object obj;
        obj = this.f7940b.f7924n;
        synchronized (obj) {
            this.f7940b.f7925o = null;
        }
        Handler handler = this.f7940b.f7922l;
        handler.sendMessage(handler.obtainMessage(6, this.f7939a, 1));
    }
}
