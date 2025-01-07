package a1;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.cm;
import com.google.firebase.auth.FirebaseAuth;
import java.lang.ref.WeakReference;

/* loaded from: classes.dex */
final class y extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference f136a;

    /* renamed from: b, reason: collision with root package name */
    private final o0.i f137b;

    /* renamed from: c, reason: collision with root package name */
    private final FirebaseAuth f138c;

    /* renamed from: d, reason: collision with root package name */
    private final com.google.firebase.auth.z f139d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ a0 f140e;

    y(a0 a0Var, Activity activity, o0.i iVar, FirebaseAuth firebaseAuth, com.google.firebase.auth.z zVar) {
        this.f140e = a0Var;
        this.f136a = new WeakReference(activity);
        this.f137b = iVar;
        this.f138c = firebaseAuth;
        this.f139d = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (((Activity) this.f136a.get()) == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            this.f137b.b(cm.a(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            a0.e(context);
            return;
        }
        if (!intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            if (p0.d(intent)) {
                this.f137b.b(cm.a(p0.a(intent)));
                a0.e(context);
                return;
            } else {
                if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
                    this.f137b.b(cm.a(l.a("WEB_CONTEXT_CANCELED")));
                    a0.e(context);
                    return;
                }
                return;
            }
        }
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
        if ("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(stringExtra)) {
            this.f138c.y(a0.i(intent)).g(new t(r0, r1, context)).e(new s(this.f140e, this.f137b, context));
            return;
        }
        if ("com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(stringExtra)) {
            this.f139d.q0(a0.i(intent)).g(new v(r0, r1, context)).e(new u(this.f140e, this.f137b, context));
        } else if ("com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(stringExtra)) {
            this.f139d.r0(a0.i(intent)).g(new x(r0, r1, context)).e(new w(this.f140e, this.f137b, context));
        } else {
            this.f137b.b(cm.a(l.a("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
        }
    }
}
