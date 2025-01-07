package u;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* loaded from: classes.dex */
public final class r extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    Context f7633a;

    /* renamed from: b, reason: collision with root package name */
    private final q f7634b;

    public r(q qVar) {
        this.f7634b = qVar;
    }

    public final void a(Context context) {
        this.f7633a = context;
    }

    public final synchronized void b() {
        Context context = this.f7633a;
        if (context != null) {
            context.unregisterReceiver(this);
        }
        this.f7633a = null;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Uri data = intent.getData();
        if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
            this.f7634b.a();
            b();
        }
    }
}
