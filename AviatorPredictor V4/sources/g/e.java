package g;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class e {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        final Bundle f3800a;

        /* renamed from: b, reason: collision with root package name */
        private IconCompat f3801b;

        /* renamed from: c, reason: collision with root package name */
        private final i[] f3802c;

        /* renamed from: d, reason: collision with root package name */
        private final i[] f3803d;

        /* renamed from: e, reason: collision with root package name */
        private boolean f3804e;

        /* renamed from: f, reason: collision with root package name */
        boolean f3805f;

        /* renamed from: g, reason: collision with root package name */
        private final int f3806g;

        /* renamed from: h, reason: collision with root package name */
        private final boolean f3807h;

        /* renamed from: i, reason: collision with root package name */
        @Deprecated
        public int f3808i;

        /* renamed from: j, reason: collision with root package name */
        public CharSequence f3809j;

        /* renamed from: k, reason: collision with root package name */
        public PendingIntent f3810k;

        public a(int r32, CharSequence charSequence, PendingIntent pendingIntent) {
            this(r32 != 0 ? IconCompat.b(null, "", r32) : null, charSequence, pendingIntent);
        }

        public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false);
        }

        a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, i[] iVarArr, i[] iVarArr2, boolean z4, int r10, boolean z5, boolean z6) {
            this.f3805f = true;
            this.f3801b = iconCompat;
            if (iconCompat != null && iconCompat.g() == 2) {
                this.f3808i = iconCompat.c();
            }
            this.f3809j = d.d(charSequence);
            this.f3810k = pendingIntent;
            this.f3800a = bundle == null ? new Bundle() : bundle;
            this.f3802c = iVarArr;
            this.f3803d = iVarArr2;
            this.f3804e = z4;
            this.f3806g = r10;
            this.f3805f = z5;
            this.f3807h = z6;
        }

        public PendingIntent a() {
            return this.f3810k;
        }

        public boolean b() {
            return this.f3804e;
        }

        public i[] c() {
            return this.f3803d;
        }

        public Bundle d() {
            return this.f3800a;
        }

        public IconCompat e() {
            int r02;
            if (this.f3801b == null && (r02 = this.f3808i) != 0) {
                this.f3801b = IconCompat.b(null, "", r02);
            }
            return this.f3801b;
        }

        public i[] f() {
            return this.f3802c;
        }

        public int g() {
            return this.f3806g;
        }

        public boolean h() {
            return this.f3805f;
        }

        public CharSequence i() {
            return this.f3809j;
        }

        public boolean j() {
            return this.f3807h;
        }
    }

    public static class b extends AbstractC0042e {

        /* renamed from: e, reason: collision with root package name */
        private CharSequence f3811e;

        @Override // g.e.AbstractC0042e
        public void a(Bundle bundle) {
            super.a(bundle);
            if (Build.VERSION.SDK_INT < 21) {
                bundle.putCharSequence("android.bigText", this.f3811e);
            }
        }

        @Override // g.e.AbstractC0042e
        public void b(g.d dVar) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(dVar.a()).setBigContentTitle(this.f3839b).bigText(this.f3811e);
                if (this.f3841d) {
                    bigText.setSummaryText(this.f3840c);
                }
            }
        }

        @Override // g.e.AbstractC0042e
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public b h(CharSequence charSequence) {
            this.f3811e = d.d(charSequence);
            return this;
        }
    }

    public static final class c {
        public static Notification.BubbleMetadata a(c cVar) {
            return null;
        }
    }

    public static class d {
        boolean A;
        boolean B;
        String C;
        Bundle D;
        int E;
        int F;
        Notification G;
        RemoteViews H;
        RemoteViews I;
        RemoteViews J;
        String K;
        int L;
        String M;
        long N;
        int O;
        boolean P;
        c Q;
        Notification R;
        boolean S;
        Icon T;

        @Deprecated
        public ArrayList<String> U;

        /* renamed from: a, reason: collision with root package name */
        public Context f3812a;

        /* renamed from: b, reason: collision with root package name */
        public ArrayList<a> f3813b;

        /* renamed from: c, reason: collision with root package name */
        public ArrayList<h> f3814c;

        /* renamed from: d, reason: collision with root package name */
        ArrayList<a> f3815d;

        /* renamed from: e, reason: collision with root package name */
        CharSequence f3816e;

        /* renamed from: f, reason: collision with root package name */
        CharSequence f3817f;

        /* renamed from: g, reason: collision with root package name */
        PendingIntent f3818g;

        /* renamed from: h, reason: collision with root package name */
        PendingIntent f3819h;

        /* renamed from: i, reason: collision with root package name */
        RemoteViews f3820i;

        /* renamed from: j, reason: collision with root package name */
        Bitmap f3821j;

        /* renamed from: k, reason: collision with root package name */
        CharSequence f3822k;

        /* renamed from: l, reason: collision with root package name */
        int f3823l;

        /* renamed from: m, reason: collision with root package name */
        int f3824m;

        /* renamed from: n, reason: collision with root package name */
        boolean f3825n;

        /* renamed from: o, reason: collision with root package name */
        boolean f3826o;

        /* renamed from: p, reason: collision with root package name */
        AbstractC0042e f3827p;

        /* renamed from: q, reason: collision with root package name */
        CharSequence f3828q;

        /* renamed from: r, reason: collision with root package name */
        CharSequence f3829r;

        /* renamed from: s, reason: collision with root package name */
        CharSequence[] f3830s;

        /* renamed from: t, reason: collision with root package name */
        int f3831t;

        /* renamed from: u, reason: collision with root package name */
        int f3832u;

        /* renamed from: v, reason: collision with root package name */
        boolean f3833v;

        /* renamed from: w, reason: collision with root package name */
        String f3834w;

        /* renamed from: x, reason: collision with root package name */
        boolean f3835x;

        /* renamed from: y, reason: collision with root package name */
        String f3836y;

        /* renamed from: z, reason: collision with root package name */
        boolean f3837z;

        @Deprecated
        public d(Context context) {
            this(context, null);
        }

        public d(Context context, String str) {
            this.f3813b = new ArrayList<>();
            this.f3814c = new ArrayList<>();
            this.f3815d = new ArrayList<>();
            this.f3825n = true;
            this.f3837z = false;
            this.E = 0;
            this.F = 0;
            this.L = 0;
            this.O = 0;
            Notification notification = new Notification();
            this.R = notification;
            this.f3812a = context;
            this.K = str;
            notification.when = System.currentTimeMillis();
            this.R.audioStreamType = -1;
            this.f3824m = 0;
            this.U = new ArrayList<>();
            this.P = true;
        }

        protected static CharSequence d(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void j(int r22, boolean z4) {
            Notification notification;
            int r23;
            if (z4) {
                notification = this.R;
                r23 = r22 | notification.flags;
            } else {
                notification = this.R;
                r23 = (~r22) & notification.flags;
            }
            notification.flags = r23;
        }

        public d a(int r32, CharSequence charSequence, PendingIntent pendingIntent) {
            this.f3813b.add(new a(r32, charSequence, pendingIntent));
            return this;
        }

        public Notification b() {
            return new f(this).c();
        }

        public Bundle c() {
            if (this.D == null) {
                this.D = new Bundle();
            }
            return this.D;
        }

        public d e(boolean z4) {
            j(16, z4);
            return this;
        }

        public d f(String str) {
            this.K = str;
            return this;
        }

        public d g(PendingIntent pendingIntent) {
            this.f3818g = pendingIntent;
            return this;
        }

        public d h(CharSequence charSequence) {
            this.f3817f = d(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.f3816e = d(charSequence);
            return this;
        }

        public d k(boolean z4) {
            this.f3837z = z4;
            return this;
        }

        public d l(int r12) {
            this.f3824m = r12;
            return this;
        }

        public d m(int r22) {
            this.R.icon = r22;
            return this;
        }

        public d n(AbstractC0042e abstractC0042e) {
            if (this.f3827p != abstractC0042e) {
                this.f3827p = abstractC0042e;
                if (abstractC0042e != null) {
                    abstractC0042e.g(this);
                }
            }
            return this;
        }

        public d o(CharSequence charSequence) {
            this.R.tickerText = d(charSequence);
            return this;
        }

        public d p(long j4) {
            this.R.when = j4;
            return this;
        }
    }

    /* renamed from: g.e$e, reason: collision with other inner class name */
    public static abstract class AbstractC0042e {

        /* renamed from: a, reason: collision with root package name */
        protected d f3838a;

        /* renamed from: b, reason: collision with root package name */
        CharSequence f3839b;

        /* renamed from: c, reason: collision with root package name */
        CharSequence f3840c;

        /* renamed from: d, reason: collision with root package name */
        boolean f3841d = false;

        public void a(Bundle bundle) {
            if (this.f3841d) {
                bundle.putCharSequence("android.summaryText", this.f3840c);
            }
            CharSequence charSequence = this.f3839b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String c5 = c();
            if (c5 != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", c5);
            }
        }

        public abstract void b(g.d dVar);

        protected abstract String c();

        public RemoteViews d(g.d dVar) {
            return null;
        }

        public RemoteViews e(g.d dVar) {
            return null;
        }

        public RemoteViews f(g.d dVar) {
            return null;
        }

        public void g(d dVar) {
            if (this.f3838a != dVar) {
                this.f3838a = dVar;
                if (dVar != null) {
                    dVar.n(this);
                }
            }
        }
    }

    public static Bundle a(Notification notification) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 19) {
            return notification.extras;
        }
        if (r02 >= 16) {
            return g.c(notification);
        }
        return null;
    }
}
