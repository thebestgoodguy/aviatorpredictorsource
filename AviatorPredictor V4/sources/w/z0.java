package w;

import android.app.PendingIntent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import w.c;

/* loaded from: classes.dex */
final class z0 extends h0.e {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f8080a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c cVar, Looper looper) {
        super(looper);
        this.f8080a = cVar;
    }

    private static final void a(Message message) {
        a1 a1Var = (a1) message.obj;
        a1Var.b();
        a1Var.e();
    }

    private static final boolean b(Message message) {
        int r22 = message.what;
        return r22 == 2 || r22 == 1 || r22 == 7;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        c.a aVar;
        c.a aVar2;
        s.a aVar3;
        s.a aVar4;
        boolean z4;
        if (this.f8080a.C.get() != message.arg1) {
            if (b(message)) {
                a(message);
                return;
            }
            return;
        }
        int r02 = message.what;
        if ((r02 == 1 || r02 == 7 || ((r02 == 4 && !this.f8080a.s()) || message.what == 5)) && !this.f8080a.b()) {
            a(message);
            return;
        }
        int r03 = message.what;
        if (r03 == 4) {
            this.f8080a.f7936z = new s.a(message.arg2);
            if (c.f0(this.f8080a)) {
                c cVar = this.f8080a;
                z4 = cVar.A;
                if (!z4) {
                    cVar.g0(3, null);
                    return;
                }
            }
            c cVar2 = this.f8080a;
            aVar4 = cVar2.f7936z;
            s.a aVar5 = aVar4 != null ? cVar2.f7936z : new s.a(8);
            this.f8080a.f7926p.c(aVar5);
            this.f8080a.K(aVar5);
            return;
        }
        if (r03 == 5) {
            c cVar3 = this.f8080a;
            aVar3 = cVar3.f7936z;
            s.a aVar6 = aVar3 != null ? cVar3.f7936z : new s.a(8);
            this.f8080a.f7926p.c(aVar6);
            this.f8080a.K(aVar6);
            return;
        }
        if (r03 == 3) {
            Object obj = message.obj;
            s.a aVar7 = new s.a(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null);
            this.f8080a.f7926p.c(aVar7);
            this.f8080a.K(aVar7);
            return;
        }
        if (r03 == 6) {
            this.f8080a.g0(5, null);
            c cVar4 = this.f8080a;
            aVar = cVar4.f7931u;
            if (aVar != null) {
                aVar2 = cVar4.f7931u;
                aVar2.f(message.arg2);
            }
            this.f8080a.L(message.arg2);
            c.e0(this.f8080a, 5, 1, null);
            return;
        }
        if (r03 == 2 && !this.f8080a.d()) {
            a(message);
            return;
        }
        if (b(message)) {
            ((a1) message.obj).c();
            return;
        }
        int r8 = message.what;
        StringBuilder sb = new StringBuilder(45);
        sb.append("Don't know how to handle message: ");
        sb.append(r8);
        Log.wtf("GmsClient", sb.toString(), new Exception());
    }
}
