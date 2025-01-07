package w;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import w.c;

/* loaded from: classes.dex */
public final class d1 extends t0 {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f7958g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f7959h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(c cVar, int r22, IBinder iBinder, Bundle bundle) {
        super(cVar, r22, bundle);
        this.f7959h = cVar;
        this.f7958g = iBinder;
    }

    @Override // w.t0
    protected final void f(s.a aVar) {
        if (this.f7959h.f7932v != null) {
            this.f7959h.f7932v.a(aVar);
        }
        this.f7959h.K(aVar);
    }

    @Override // w.t0
    protected final boolean g() {
        String str;
        String interfaceDescriptor;
        c.a aVar;
        c.a aVar2;
        try {
            IBinder iBinder = this.f7958g;
            r.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
        } catch (RemoteException unused) {
            str = "service probably died";
        }
        if (!this.f7959h.D().equals(interfaceDescriptor)) {
            String D = this.f7959h.D();
            StringBuilder sb = new StringBuilder(String.valueOf(D).length() + 34 + String.valueOf(interfaceDescriptor).length());
            sb.append("service descriptor mismatch: ");
            sb.append(D);
            sb.append(" vs. ");
            sb.append(interfaceDescriptor);
            str = sb.toString();
            Log.w("GmsClient", str);
            return false;
        }
        IInterface r4 = this.f7959h.r(this.f7958g);
        if (r4 == null || !(c.e0(this.f7959h, 2, 4, r4) || c.e0(this.f7959h, 3, 4, r4))) {
            return false;
        }
        this.f7959h.f7936z = null;
        Bundle w4 = this.f7959h.w();
        c cVar = this.f7959h;
        aVar = cVar.f7931u;
        if (aVar == null) {
            return true;
        }
        aVar2 = cVar.f7931u;
        aVar2.h(w4);
        return true;
    }
}
