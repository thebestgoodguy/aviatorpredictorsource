package w;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* loaded from: classes.dex */
final class m1 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ n1 f8018a;

    /* synthetic */ m1(n1 n1Var, l1 l1Var) {
        this.f8018a = n1Var;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashMap hashMap;
        HashMap hashMap2;
        HashMap hashMap3;
        HashMap hashMap4;
        HashMap hashMap5;
        int r02 = message.what;
        if (r02 == 0) {
            hashMap = this.f8018a.f8023f;
            synchronized (hashMap) {
                j1 j1Var = (j1) message.obj;
                hashMap2 = this.f8018a.f8023f;
                k1 k1Var = (k1) hashMap2.get(j1Var);
                if (k1Var != null && k1Var.i()) {
                    if (k1Var.j()) {
                        k1Var.g("GmsClientSupervisor");
                    }
                    hashMap3 = this.f8018a.f8023f;
                    hashMap3.remove(j1Var);
                }
            }
            return true;
        }
        if (r02 != 1) {
            return false;
        }
        hashMap4 = this.f8018a.f8023f;
        synchronized (hashMap4) {
            j1 j1Var2 = (j1) message.obj;
            hashMap5 = this.f8018a.f8023f;
            k1 k1Var2 = (k1) hashMap5.get(j1Var2);
            if (k1Var2 != null && k1Var2.a() == 3) {
                String valueOf = String.valueOf(j1Var2);
                StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                sb.append("Timeout waiting for ServiceConnection callback ");
                sb.append(valueOf);
                Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                ComponentName b5 = k1Var2.b();
                if (b5 == null) {
                    b5 = j1Var2.b();
                }
                if (b5 == null) {
                    String d5 = j1Var2.d();
                    r.i(d5);
                    b5 = new ComponentName(d5, "unknown");
                }
                k1Var2.onServiceDisconnected(b5);
            }
        }
        return true;
    }
}
