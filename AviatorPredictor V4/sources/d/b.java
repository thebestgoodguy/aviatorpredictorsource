package d;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.SparseArray;
import d.a;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final Intent f3202a;

    /* renamed from: b, reason: collision with root package name */
    public final Bundle f3203b;

    public static final class a {

        /* renamed from: c, reason: collision with root package name */
        private ArrayList<Bundle> f3206c;

        /* renamed from: d, reason: collision with root package name */
        private Bundle f3207d;

        /* renamed from: e, reason: collision with root package name */
        private ArrayList<Bundle> f3208e;

        /* renamed from: f, reason: collision with root package name */
        private SparseArray<Bundle> f3209f;

        /* renamed from: g, reason: collision with root package name */
        private Bundle f3210g;

        /* renamed from: a, reason: collision with root package name */
        private final Intent f3204a = new Intent("android.intent.action.VIEW");

        /* renamed from: b, reason: collision with root package name */
        private final a.C0026a f3205b = new a.C0026a();

        /* renamed from: h, reason: collision with root package name */
        private int f3211h = 0;

        /* renamed from: i, reason: collision with root package name */
        private boolean f3212i = true;

        private void b(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            g.b.a(bundle, "android.support.customtabs.extra.SESSION", iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", pendingIntent);
            }
            this.f3204a.putExtras(bundle);
        }

        public b a() {
            if (!this.f3204a.hasExtra("android.support.customtabs.extra.SESSION")) {
                b(null, null);
            }
            ArrayList<Bundle> arrayList = this.f3206c;
            if (arrayList != null) {
                this.f3204a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList);
            }
            ArrayList<Bundle> arrayList2 = this.f3208e;
            if (arrayList2 != null) {
                this.f3204a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList2);
            }
            this.f3204a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f3212i);
            this.f3204a.putExtras(this.f3205b.a().a());
            Bundle bundle = this.f3210g;
            if (bundle != null) {
                this.f3204a.putExtras(bundle);
            }
            if (this.f3209f != null) {
                Bundle bundle2 = new Bundle();
                bundle2.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.f3209f);
                this.f3204a.putExtras(bundle2);
            }
            this.f3204a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", this.f3211h);
            return new b(this.f3204a, this.f3207d);
        }
    }

    b(Intent intent, Bundle bundle) {
        this.f3202a = intent;
        this.f3203b = bundle;
    }

    public void a(Context context, Uri uri) {
        this.f3202a.setData(uri);
        androidx.core.content.a.c(context, this.f3202a, this.f3203b);
    }
}
