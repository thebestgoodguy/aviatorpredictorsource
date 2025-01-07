package a1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.cm;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class z extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f142a;

    /* renamed from: b, reason: collision with root package name */
    private final o0.i f143b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ a0 f144c;

    z(a0 a0Var, Activity activity, o0.i iVar) {
        this.f144c = a0Var;
        this.f142a = new WeakReference(activity);
        this.f143b = iVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f142a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f143b.b(cm.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            a0.e(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (p0.d(intent)) {
                this.f143b.b(cm.a(p0.a(intent)));
                a0.e(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f143b.b(cm.a(l.a("WEB_CONTEXT_CANCELED")));
                    a0.e(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
            this.f143b.c(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
            a0.e(context);
            return;
        }
        this.f143b.b(cm.a(l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
    }
}
