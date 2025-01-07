package s;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import g.e;
import w.d0;
import w.g0;

/* loaded from: classes.dex */
public class d extends e {

    /* renamed from: c, reason: collision with root package name */
    private String f7488c;

    /* renamed from: e, reason: collision with root package name */
    private static final Object f7486e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private static final d f7487f = new d();

    /* renamed from: d, reason: collision with root package name */
    public static final int f7485d = e.f7489a;

    public static d m() {
        return f7487f;
    }

    @Override // s.e
    public Intent a(Context context, int r22, String str) {
        return super.a(context, r22, str);
    }

    @Override // s.e
    public PendingIntent b(Context context, int r22, int r32) {
        return super.b(context, r22, r32);
    }

    @Override // s.e
    public final String d(int r12) {
        return super.d(r12);
    }

    @Override // s.e
    public int f(Context context) {
        return super.f(context);
    }

    @Override // s.e
    public int g(Context context, int r22) {
        return super.g(context, r22);
    }

    @Override // s.e
    public final boolean i(int r12) {
        return super.i(r12);
    }

    public Dialog k(Activity activity, int r32, int r4, DialogInterface.OnCancelListener onCancelListener) {
        return p(activity, r32, g0.b(activity, a(activity, r32, "d"), r4), onCancelListener);
    }

    public PendingIntent l(Context context, a aVar) {
        return aVar.m0() ? aVar.l0() : b(context, aVar.j0(), 0);
    }

    public boolean n(Activity activity, int r22, int r32, DialogInterface.OnCancelListener onCancelListener) {
        Dialog k4 = k(activity, r22, r32, onCancelListener);
        if (k4 == null) {
            return false;
        }
        s(activity, k4, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void o(Context context, int r4) {
        t(context, r4, null, c(context, r4, 0, "n"));
    }

    final Dialog p(Context context, int r7, g0 g0Var, DialogInterface.OnCancelListener onCancelListener) {
        if (r7 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        AlertDialog.Builder builder = "Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId)) ? new AlertDialog.Builder(context, 5) : null;
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(d0.d(context, r7));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String c5 = d0.c(context, r7);
        if (c5 != null) {
            builder.setPositiveButton(c5, g0Var);
        }
        String g5 = d0.g(context, r7);
        if (g5 != null) {
            builder.setTitle(g5);
        }
        Log.w("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(r7)), new IllegalArgumentException());
        return builder.create();
    }

    public final Dialog q(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(d0.d(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        s(activity, create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    public final u.r r(Context context, u.q qVar) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        u.r rVar = new u.r(qVar);
        context.registerReceiver(rVar, intentFilter);
        rVar.a(context);
        if (h(context, "com.google.android.gms")) {
            return rVar;
        }
        qVar.a();
        rVar.b();
        return null;
    }

    final void s(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.d) {
                l.u1(dialog, onCancelListener).t1(((androidx.fragment.app.d) activity).q(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void t(Context context, int r10, String str, PendingIntent pendingIntent) {
        int r102;
        String str2;
        Log.w("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(r10), null), new IllegalArgumentException());
        if (r10 == 18) {
            u(context);
            return;
        }
        if (pendingIntent == null) {
            if (r10 == 6) {
                Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String f5 = d0.f(context, r10);
        String e5 = d0.e(context, r10);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) w.r.i(context.getSystemService("notification"));
        e.d n4 = new e.d(context).k(true).e(true).i(f5).n(new e.b().h(e5));
        if (b0.g.b(context)) {
            w.r.k(b0.j.d());
            n4.m(context.getApplicationInfo().icon).l(2);
            if (b0.g.c(context)) {
                n4.a(r.a.f7366a, resources.getString(r.b.f7381o), pendingIntent);
            } else {
                n4.g(pendingIntent);
            }
        } else {
            n4.m(R.drawable.stat_sys_warning).o(resources.getString(r.b.f7374h)).p(System.currentTimeMillis()).g(pendingIntent).h(e5);
        }
        if (b0.j.g()) {
            w.r.k(b0.j.g());
            synchronized (f7486e) {
                str2 = this.f7488c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String b5 = d0.b(context);
                if (notificationChannel == null) {
                    notificationChannel = new NotificationChannel("com.google.android.gms.availability", b5, 4);
                } else if (!b5.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(b5);
                }
                notificationManager.createNotificationChannel(notificationChannel);
            }
            n4.f(str2);
        }
        Notification b6 = n4.b();
        if (r10 == 1 || r10 == 2 || r10 == 3) {
            i.f7495b.set(false);
            r102 = 10436;
        } else {
            r102 = 39789;
        }
        notificationManager.notify(r102, b6);
    }

    final void u(Context context) {
        new n(this, context).sendEmptyMessageDelayed(1, 120000L);
    }

    public final boolean v(Activity activity, u.e eVar, int r4, int r5, DialogInterface.OnCancelListener onCancelListener) {
        Dialog p4 = p(activity, r4, g0.c(eVar, a(activity, r4, "d"), 2), onCancelListener);
        if (p4 == null) {
            return false;
        }
        s(activity, p4, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public final boolean w(Context context, a aVar, int r8) {
        PendingIntent l4;
        if (c0.a.a(context) || (l4 = l(context, aVar)) == null) {
            return false;
        }
        t(context, aVar.j0(), null, g0.e.a(context, 0, GoogleApiActivity.a(context, l4, r8, true), g0.e.f3866a | 134217728));
        return true;
    }
}
