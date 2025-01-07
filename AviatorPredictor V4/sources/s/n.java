package s;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.util.Log;

/* loaded from: classes.dex */
final class n extends g0.f {

    /* renamed from: a, reason: collision with root package name */
    private final Context f7504a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f7505b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
        this.f7505b = dVar;
        this.f7504a = context.getApplicationContext();
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int r32 = message.what;
        if (r32 != 1) {
            StringBuilder sb = new StringBuilder(50);
            sb.append("Don't know how to handle this message: ");
            sb.append(r32);
            Log.w("GoogleApiAvailability", sb.toString());
            return;
        }
        int f5 = this.f7505b.f(this.f7504a);
        if (this.f7505b.i(f5)) {
            this.f7505b.o(this.f7504a, f5);
        }
    }
}
