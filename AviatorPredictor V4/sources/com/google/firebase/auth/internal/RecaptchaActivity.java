package com.google.firebase.auth.internal;

import a1.l;
import a1.p0;
import a1.q0;
import a1.y0;
import a1.z0;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d;
import b0.f;
import b0.h;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.b7;
import com.google.android.gms.internal.p000firebaseauthapi.bo;
import com.google.android.gms.internal.p000firebaseauthapi.em;
import com.google.android.gms.internal.p000firebaseauthapi.gm;
import com.google.android.gms.internal.p000firebaseauthapi.sm;
import com.google.firebase.auth.FirebaseAuth;
import d.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import m.a;
import x0.e;

/* loaded from: classes.dex */
public class RecaptchaActivity extends d implements gm {

    /* renamed from: v, reason: collision with root package name */
    private static final String f2508v = "RecaptchaActivity";

    /* renamed from: w, reason: collision with root package name */
    private static final ExecutorService f2509w = b7.a().a(2);

    /* renamed from: x, reason: collision with root package name */
    private static long f2510x = 0;

    /* renamed from: y, reason: collision with root package name */
    private static final q0 f2511y = q0.b();

    /* renamed from: u, reason: collision with root package name */
    private boolean f2512u = false;

    private final void y() {
        f2510x = 0L;
        this.f2512u = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.b(this).d(intent);
        f2511y.c(this);
        finish();
    }

    private final void z(Status status) {
        f2510x = 0L;
        this.f2512u = false;
        Intent intent = new Intent();
        p0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        a.b(this).d(intent);
        f2511y.c(this);
        finish();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final Context a() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final Uri.Builder c(Intent intent, String str, String str2) {
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String str3 = UUID.randomUUID().toString();
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME");
        e p4 = e.p(stringExtra3);
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(p4);
        y0.b().e(getApplicationContext(), str, str3, "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA", stringExtra3);
        String c5 = z0.a(getApplicationContext(), p4.s()).c();
        if (!TextUtils.isEmpty(c5)) {
            return new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("authType", "verifyApp").appendQueryParameter("apn", str).appendQueryParameter("hl", !TextUtils.isEmpty(firebaseAuth.o()) ? firebaseAuth.o() : sm.a()).appendQueryParameter("eventId", str3).appendQueryParameter("v", "X".concat(String.valueOf(stringExtra2))).appendQueryParameter("eid", "p").appendQueryParameter("appName", stringExtra3).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c5);
        }
        Log.e(f2508v, "Could not generate an encryption key for reCAPTCHA - cancelling flow.");
        z(l.a("Failed to generate/retrieve public encryption key for reCAPTCHA flow."));
        return null;
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final String d(String str) {
        return bo.b(str);
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final HttpURLConnection f(URL url) {
        try {
            return (HttpURLConnection) url.openConnection();
        } catch (IOException unused) {
            gm.f1684b.c("Error generating connection", new Object[0]);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final void h(String str, Status status) {
        if (status == null) {
            y();
        } else {
            z(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final void k(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e(f2508v, "Device cannot resolve intent for: android.intent.action.VIEW");
            h(str, null);
            return;
        }
        List<ResolveInfo> queryIntentServices = getPackageManager().queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        if (queryIntentServices != null && !queryIntentServices.isEmpty()) {
            b a5 = new b.a().a();
            a5.f3202a.addFlags(1073741824);
            a5.f3202a.addFlags(268435456);
            a5.a(this, uri);
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        intent.putExtra("com.android.browser.application_id", str);
        intent.addFlags(1073741824);
        intent.addFlags(268435456);
        startActivity(intent);
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, g.c, android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String action = getIntent().getAction();
        if (!"com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e(f2508v, "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            y();
            return;
        }
        long a5 = f.b().a();
        if (a5 - f2510x < 30000) {
            Log.e(f2508v, "Could not start operation - already in progress");
            return;
        }
        f2510x = a5;
        if (bundle != null) {
            this.f2512u = bundle.getBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW");
        }
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // androidx.fragment.app.d, android.app.Activity
    protected final void onResume() {
        super.onResume();
        if (!"android.intent.action.VIEW".equals(getIntent().getAction())) {
            if (this.f2512u) {
                y();
                return;
            }
            Intent intent = getIntent();
            String packageName = getPackageName();
            try {
                new em(packageName, h.a(b0.a.a(this, packageName)).toLowerCase(Locale.US), intent, e.p(intent.getStringExtra("com.google.firebase.auth.internal.FIREBASE_APP_NAME")), this).executeOnExecutor(f2509w, new Void[0]);
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e(f2508v, "Could not get package signature: " + packageName + " " + e5.toString());
                h(packageName, null);
            }
            this.f2512u = true;
            return;
        }
        Intent intent2 = getIntent();
        if (intent2.hasExtra("firebaseError")) {
            z(p0.b(intent2.getStringExtra("firebaseError")));
            return;
        }
        if (!intent2.hasExtra("link") || !intent2.hasExtra("eventId")) {
            y();
            return;
        }
        String stringExtra = intent2.getStringExtra("link");
        String c5 = y0.b().c(getApplicationContext(), getPackageName(), intent2.getStringExtra("eventId"));
        if (TextUtils.isEmpty(c5)) {
            Log.e(f2508v, "Failed to find registration for this event - failing to prevent session injection.");
            z(l.a("Failed to find registration for this reCAPTCHA event"));
        }
        if (intent2.getBooleanExtra("encryptionEnabled", true)) {
            stringExtra = z0.a(getApplicationContext(), e.p(c5).s()).b(stringExtra);
        }
        String queryParameter = Uri.parse(stringExtra).getQueryParameter("recaptchaToken");
        f2510x = 0L;
        this.f2512u = false;
        Intent intent3 = new Intent();
        intent3.putExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN", queryParameter);
        intent3.putExtra("com.google.firebase.auth.internal.OPERATION", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
        intent3.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.b(this).d(intent3)) {
            f2511y.c(this);
        } else {
            SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            edit.putString("recaptchaToken", queryParameter);
            edit.putString("operation", "com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA");
            edit.putLong("timestamp", f.b().a());
            edit.commit();
        }
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, g.c, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_ALREADY_STARTED_RECAPTCHA_FLOW", this.f2512u);
    }
}
