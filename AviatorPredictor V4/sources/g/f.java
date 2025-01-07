package g;

import android.app.Notification;
import android.app.RemoteInput;
import android.content.Context;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import g.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
class f implements d {

    /* renamed from: a, reason: collision with root package name */
    private final Context f3842a;

    /* renamed from: b, reason: collision with root package name */
    private final Notification.Builder f3843b;

    /* renamed from: c, reason: collision with root package name */
    private final e.d f3844c;

    /* renamed from: d, reason: collision with root package name */
    private RemoteViews f3845d;

    /* renamed from: e, reason: collision with root package name */
    private RemoteViews f3846e;

    /* renamed from: f, reason: collision with root package name */
    private final List<Bundle> f3847f = new ArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final Bundle f3848g = new Bundle();

    /* renamed from: h, reason: collision with root package name */
    private int f3849h;

    /* renamed from: i, reason: collision with root package name */
    private RemoteViews f3850i;

    f(e.d dVar) {
        Icon icon;
        List<String> e5;
        Bundle bundle;
        String str;
        this.f3844c = dVar;
        this.f3842a = dVar.f3812a;
        int r02 = Build.VERSION.SDK_INT;
        Context context = dVar.f3812a;
        this.f3843b = r02 >= 26 ? new Notification.Builder(context, dVar.K) : new Notification.Builder(context);
        Notification notification = dVar.R;
        this.f3843b.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, dVar.f3820i).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(dVar.f3816e).setContentText(dVar.f3817f).setContentInfo(dVar.f3822k).setContentIntent(dVar.f3818g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(dVar.f3819h, (notification.flags & 128) != 0).setLargeIcon(dVar.f3821j).setNumber(dVar.f3823l).setProgress(dVar.f3831t, dVar.f3832u, dVar.f3833v);
        if (r02 < 21) {
            this.f3843b.setSound(notification.sound, notification.audioStreamType);
        }
        if (r02 >= 16) {
            this.f3843b.setSubText(dVar.f3828q).setUsesChronometer(dVar.f3826o).setPriority(dVar.f3824m);
            Iterator<e.a> it = dVar.f3813b.iterator();
            while (it.hasNext()) {
                b(it.next());
            }
            Bundle bundle2 = dVar.D;
            if (bundle2 != null) {
                this.f3848g.putAll(bundle2);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (dVar.f3837z) {
                    this.f3848g.putBoolean("android.support.localOnly", true);
                }
                String str2 = dVar.f3834w;
                if (str2 != null) {
                    this.f3848g.putString("android.support.groupKey", str2);
                    if (dVar.f3835x) {
                        bundle = this.f3848g;
                        str = "android.support.isGroupSummary";
                    } else {
                        bundle = this.f3848g;
                        str = "android.support.useSideChannel";
                    }
                    bundle.putBoolean(str, true);
                }
                String str3 = dVar.f3836y;
                if (str3 != null) {
                    this.f3848g.putString("android.support.sortKey", str3);
                }
            }
            this.f3845d = dVar.H;
            this.f3846e = dVar.I;
        }
        int r03 = Build.VERSION.SDK_INT;
        if (r03 >= 17) {
            this.f3843b.setShowWhen(dVar.f3825n);
        }
        if (r03 >= 19 && r03 < 21 && (e5 = e(f(dVar.f3814c), dVar.U)) != null && !e5.isEmpty()) {
            this.f3848g.putStringArray("android.people", (String[]) e5.toArray(new String[e5.size()]));
        }
        if (r03 >= 20) {
            this.f3843b.setLocalOnly(dVar.f3837z).setGroup(dVar.f3834w).setGroupSummary(dVar.f3835x).setSortKey(dVar.f3836y);
            this.f3849h = dVar.O;
        }
        if (r03 >= 21) {
            this.f3843b.setCategory(dVar.C).setColor(dVar.E).setVisibility(dVar.F).setPublicVersion(dVar.G).setSound(notification.sound, notification.audioAttributes);
            List e6 = r03 < 28 ? e(f(dVar.f3814c), dVar.U) : dVar.U;
            if (e6 != null && !e6.isEmpty()) {
                Iterator it2 = e6.iterator();
                while (it2.hasNext()) {
                    this.f3843b.addPerson((String) it2.next());
                }
            }
            this.f3850i = dVar.J;
            if (dVar.f3815d.size() > 0) {
                Bundle bundle3 = dVar.c().getBundle("android.car.EXTENSIONS");
                bundle3 = bundle3 == null ? new Bundle() : bundle3;
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                for (int r10 = 0; r10 < dVar.f3815d.size(); r10++) {
                    bundle5.putBundle(Integer.toString(r10), g.b(dVar.f3815d.get(r10)));
                }
                bundle3.putBundle("invisible_actions", bundle5);
                bundle4.putBundle("invisible_actions", bundle5);
                dVar.c().putBundle("android.car.EXTENSIONS", bundle3);
                this.f3848g.putBundle("android.car.EXTENSIONS", bundle4);
            }
        }
        int r04 = Build.VERSION.SDK_INT;
        if (r04 >= 23 && (icon = dVar.T) != null) {
            this.f3843b.setSmallIcon(icon);
        }
        if (r04 >= 24) {
            this.f3843b.setExtras(dVar.D).setRemoteInputHistory(dVar.f3830s);
            RemoteViews remoteViews = dVar.H;
            if (remoteViews != null) {
                this.f3843b.setCustomContentView(remoteViews);
            }
            RemoteViews remoteViews2 = dVar.I;
            if (remoteViews2 != null) {
                this.f3843b.setCustomBigContentView(remoteViews2);
            }
            RemoteViews remoteViews3 = dVar.J;
            if (remoteViews3 != null) {
                this.f3843b.setCustomHeadsUpContentView(remoteViews3);
            }
        }
        if (r04 >= 26) {
            this.f3843b.setBadgeIconType(dVar.L).setSettingsText(dVar.f3829r).setShortcutId(dVar.M).setTimeoutAfter(dVar.N).setGroupAlertBehavior(dVar.O);
            if (dVar.B) {
                this.f3843b.setColorized(dVar.A);
            }
            if (!TextUtils.isEmpty(dVar.K)) {
                this.f3843b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (r04 >= 28) {
            Iterator<h> it3 = dVar.f3814c.iterator();
            while (it3.hasNext()) {
                this.f3843b.addPerson(it3.next().h());
            }
        }
        int r05 = Build.VERSION.SDK_INT;
        if (r05 >= 29) {
            this.f3843b.setAllowSystemGeneratedContextualActions(dVar.P);
            this.f3843b.setBubbleMetadata(e.c.a(dVar.Q));
        }
        if (dVar.S) {
            if (this.f3844c.f3835x) {
                this.f3849h = 2;
            } else {
                this.f3849h = 1;
            }
            this.f3843b.setVibrate(null);
            this.f3843b.setSound(null);
            int r14 = notification.defaults & (-2);
            notification.defaults = r14;
            int r142 = r14 & (-3);
            notification.defaults = r142;
            this.f3843b.setDefaults(r142);
            if (r05 >= 26) {
                if (TextUtils.isEmpty(this.f3844c.f3834w)) {
                    this.f3843b.setGroup("silent");
                }
                this.f3843b.setGroupAlertBehavior(this.f3849h);
            }
        }
    }

    private void b(e.a aVar) {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 < 20) {
            if (r02 >= 16) {
                this.f3847f.add(g.f(this.f3843b, aVar));
                return;
            }
            return;
        }
        IconCompat e5 = aVar.e();
        Notification.Action.Builder builder = r02 >= 23 ? new Notification.Action.Builder(e5 != null ? e5.n() : null, aVar.i(), aVar.a()) : new Notification.Action.Builder(e5 != null ? e5.c() : 0, aVar.i(), aVar.a());
        if (aVar.f() != null) {
            for (RemoteInput remoteInput : i.b(aVar.f())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        int r22 = Build.VERSION.SDK_INT;
        if (r22 >= 24) {
            builder.setAllowGeneratedReplies(aVar.b());
        }
        bundle.putInt("android.support.action.semanticAction", aVar.g());
        if (r22 >= 28) {
            builder.setSemanticAction(aVar.g());
        }
        if (r22 >= 29) {
            builder.setContextual(aVar.j());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", aVar.h());
        builder.addExtras(bundle);
        this.f3843b.addAction(builder.build());
    }

    private static List<String> e(List<String> list, List<String> list2) {
        if (list == null) {
            return list2;
        }
        if (list2 == null) {
            return list;
        }
        e.b bVar = new e.b(list.size() + list2.size());
        bVar.addAll(list);
        bVar.addAll(list2);
        return new ArrayList(bVar);
    }

    private static List<String> f(List<h> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<h> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().g());
        }
        return arrayList;
    }

    private void g(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        int r02 = notification.defaults & (-2);
        notification.defaults = r02;
        notification.defaults = r02 & (-3);
    }

    @Override // g.d
    public Notification.Builder a() {
        return this.f3843b;
    }

    public Notification c() {
        Bundle a5;
        RemoteViews f5;
        RemoteViews d5;
        e.AbstractC0042e abstractC0042e = this.f3844c.f3827p;
        if (abstractC0042e != null) {
            abstractC0042e.b(this);
        }
        RemoteViews e5 = abstractC0042e != null ? abstractC0042e.e(this) : null;
        Notification d6 = d();
        if (e5 != null || (e5 = this.f3844c.H) != null) {
            d6.contentView = e5;
        }
        int r12 = Build.VERSION.SDK_INT;
        if (r12 >= 16 && abstractC0042e != null && (d5 = abstractC0042e.d(this)) != null) {
            d6.bigContentView = d5;
        }
        if (r12 >= 21 && abstractC0042e != null && (f5 = this.f3844c.f3827p.f(this)) != null) {
            d6.headsUpContentView = f5;
        }
        if (r12 >= 16 && abstractC0042e != null && (a5 = e.a(d6)) != null) {
            abstractC0042e.a(a5);
        }
        return d6;
    }

    protected Notification d() {
        int r02 = Build.VERSION.SDK_INT;
        if (r02 >= 26) {
            return this.f3843b.build();
        }
        if (r02 >= 24) {
            Notification build = this.f3843b.build();
            if (this.f3849h != 0) {
                if (build.getGroup() != null && (build.flags & 512) != 0 && this.f3849h == 2) {
                    g(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.f3849h == 1) {
                    g(build);
                }
            }
            return build;
        }
        if (r02 >= 21) {
            this.f3843b.setExtras(this.f3848g);
            Notification build2 = this.f3843b.build();
            RemoteViews remoteViews = this.f3845d;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.f3846e;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.f3850i;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.f3849h != 0) {
                if (build2.getGroup() != null && (build2.flags & 512) != 0 && this.f3849h == 2) {
                    g(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.f3849h == 1) {
                    g(build2);
                }
            }
            return build2;
        }
        if (r02 >= 20) {
            this.f3843b.setExtras(this.f3848g);
            Notification build3 = this.f3843b.build();
            RemoteViews remoteViews4 = this.f3845d;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.f3846e;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.f3849h != 0) {
                if (build3.getGroup() != null && (build3.flags & 512) != 0 && this.f3849h == 2) {
                    g(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.f3849h == 1) {
                    g(build3);
                }
            }
            return build3;
        }
        if (r02 >= 19) {
            SparseArray<Bundle> a5 = g.a(this.f3847f);
            if (a5 != null) {
                this.f3848g.putSparseParcelableArray("android.support.actionExtras", a5);
            }
            this.f3843b.setExtras(this.f3848g);
            Notification build4 = this.f3843b.build();
            RemoteViews remoteViews6 = this.f3845d;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.f3846e;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        }
        if (r02 < 16) {
            return this.f3843b.getNotification();
        }
        Notification build5 = this.f3843b.build();
        Bundle a6 = e.a(build5);
        Bundle bundle = new Bundle(this.f3848g);
        for (String str : this.f3848g.keySet()) {
            if (a6.containsKey(str)) {
                bundle.remove(str);
            }
        }
        a6.putAll(bundle);
        SparseArray<Bundle> a7 = g.a(this.f3847f);
        if (a7 != null) {
            e.a(build5).putSparseParcelableArray("android.support.actionExtras", a7);
        }
        RemoteViews remoteViews8 = this.f3845d;
        if (remoteViews8 != null) {
            build5.contentView = remoteViews8;
        }
        RemoteViews remoteViews9 = this.f3846e;
        if (remoteViews9 != null) {
            build5.bigContentView = remoteViews9;
        }
        return build5;
    }
}
