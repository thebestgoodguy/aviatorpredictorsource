package com.google.firebase.auth.internal;

import a1.l;
import a1.p0;
import a1.q0;
import a1.x0;
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
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.p000firebaseauthapi.b7;
import com.google.android.gms.internal.p000firebaseauthapi.bo;
import com.google.android.gms.internal.p000firebaseauthapi.cq;
import com.google.android.gms.internal.p000firebaseauthapi.em;
import com.google.android.gms.internal.p000firebaseauthapi.fm;
import com.google.android.gms.internal.p000firebaseauthapi.gm;
import d.b;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Executor;
import m.a;
import org.json.JSONException;
import org.json.JSONObject;
import x0.e;

@KeepName
/* loaded from: classes.dex */
public class GenericIdpActivity extends d implements gm {

    /* renamed from: w, reason: collision with root package name */
    private static long f2504w;

    /* renamed from: x, reason: collision with root package name */
    private static final q0 f2505x = q0.b();

    /* renamed from: u, reason: collision with root package name */
    private final Executor f2506u = b7.a().a(1);

    /* renamed from: v, reason: collision with root package name */
    private boolean f2507v = false;

    private final void A(Status status) {
        f2504w = 0L;
        this.f2507v = false;
        Intent intent = new Intent();
        p0.c(intent, status);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.b(this).d(intent)) {
            f2505x.c(this);
        } else {
            f2505x.e(getApplicationContext(), status);
        }
        finish();
    }

    private final void z() {
        f2504w = 0L;
        this.f2507v = false;
        Intent intent = new Intent();
        intent.putExtra("com.google.firebase.auth.internal.EXTRA_CANCELED", true);
        intent.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.b(this).d(intent)) {
            f2505x.c(this);
        } else {
            f2505x.e(this, l.a("WEB_CONTEXT_CANCELED"));
        }
        finish();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final Context a() {
        return getApplicationContext();
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final Uri.Builder c(Intent intent, String str, String str2) {
        return y(new Uri.Builder().scheme("https").appendPath("__").appendPath("auth").appendPath("handler"), intent, str, str2);
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
            Log.e("GenericIdpActivity", "Error generating URL connection");
            return null;
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final void h(String str, Status status) {
        if (status == null) {
            z();
        } else {
            A(status);
        }
    }

    @Override // com.google.android.gms.internal.p000firebaseauthapi.gm
    public final void k(Uri uri, String str) {
        if (getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW"), 0) == null) {
            Log.e("GenericIdpActivity", "Device cannot resolve intent for: android.intent.action.VIEW");
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
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(action) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(action) && !"android.intent.action.VIEW".equals(action)) {
            Log.e("GenericIdpActivity", "Could not do operation - unknown action: ".concat(String.valueOf(action)));
            z();
            return;
        }
        long a5 = f.b().a();
        if (a5 - f2504w < 30000) {
            Log.e("GenericIdpActivity", "Could not start operation - already in progress");
            return;
        }
        f2504w = a5;
        if (bundle != null) {
            this.f2507v = bundle.getBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN");
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
            if (this.f2507v) {
                z();
                return;
            }
            String packageName = getPackageName();
            try {
                String lowerCase = h.a(b0.a.a(this, packageName)).toLowerCase(Locale.US);
                e p4 = e.p(getIntent().getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME"));
                if (bo.g(p4)) {
                    k(y(Uri.parse(bo.a(p4.r().b())).buildUpon(), getIntent(), packageName, lowerCase).build(), packageName);
                } else {
                    new em(packageName, lowerCase, getIntent(), p4, this).executeOnExecutor(this.f2506u, new Void[0]);
                }
            } catch (PackageManager.NameNotFoundException e5) {
                Log.e("GenericIdpActivity", "Could not get package signature: " + packageName + " " + e5.toString());
                h(packageName, null);
            }
            this.f2507v = true;
            return;
        }
        Intent intent = getIntent();
        if (intent.hasExtra("firebaseError")) {
            A(p0.b(intent.getStringExtra("firebaseError")));
            return;
        }
        if (!intent.hasExtra("link") || !intent.hasExtra("eventId")) {
            z();
            return;
        }
        String stringExtra = intent.getStringExtra("link");
        String stringExtra2 = intent.getStringExtra("eventId");
        String packageName2 = getPackageName();
        boolean booleanExtra = intent.getBooleanExtra("encryptionEnabled", true);
        x0 a5 = y0.b().a(this, packageName2, stringExtra2);
        if (a5 == null) {
            z();
        }
        if (booleanExtra) {
            stringExtra = z0.a(getApplicationContext(), e.p(a5.a()).s()).b(stringExtra);
        }
        cq cqVar = new cq(a5, stringExtra);
        String e6 = a5.e();
        String b5 = a5.b();
        cqVar.n0(e6);
        if (!"com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN".equals(b5) && !"com.google.firebase.auth.internal.NONGMSCORE_LINK".equals(b5) && !"com.google.firebase.auth.internal.NONGMSCORE_REAUTHENTICATE".equals(b5)) {
            Log.e("GenericIdpActivity", "unsupported operation: ".concat(b5));
            z();
            return;
        }
        f2504w = 0L;
        this.f2507v = false;
        Intent intent2 = new Intent();
        x.e.e(cqVar, intent2, "com.google.firebase.auth.internal.VERIFY_ASSERTION_REQUEST");
        intent2.putExtra("com.google.firebase.auth.internal.OPERATION", b5);
        intent2.setAction("com.google.firebase.auth.ACTION_RECEIVE_FIREBASE_AUTH_INTENT");
        if (a.b(this).d(intent2)) {
            f2505x.c(this);
        } else {
            SharedPreferences.Editor edit = getApplicationContext().getSharedPreferences("com.google.firebase.auth.internal.ProcessDeathHelper", 0).edit();
            edit.putString("verifyAssertionRequest", x.e.f(cqVar));
            edit.putString("operation", b5);
            edit.putString("tenantId", e6);
            edit.putLong("timestamp", f.b().a());
            edit.commit();
        }
        finish();
    }

    @Override // androidx.fragment.app.d, androidx.activity.ComponentActivity, g.c, android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("com.google.firebase.auth.internal.KEY_STARTED_SIGN_IN", this.f2507v);
    }

    public final Uri.Builder y(Uri.Builder builder, Intent intent, String str, String str2) {
        String jSONObject;
        String stringExtra = intent.getStringExtra("com.google.firebase.auth.KEY_API_KEY");
        String stringExtra2 = intent.getStringExtra("com.google.firebase.auth.KEY_PROVIDER_ID");
        String stringExtra3 = intent.getStringExtra("com.google.firebase.auth.KEY_TENANT_ID");
        String stringExtra4 = intent.getStringExtra("com.google.firebase.auth.KEY_FIREBASE_APP_NAME");
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("com.google.firebase.auth.KEY_PROVIDER_SCOPES");
        String join = (stringArrayListExtra == null || stringArrayListExtra.isEmpty()) ? null : TextUtils.join(",", stringArrayListExtra);
        Bundle bundleExtra = intent.getBundleExtra("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS");
        if (bundleExtra == null) {
            jSONObject = null;
        } else {
            JSONObject jSONObject2 = new JSONObject();
            try {
                for (String str3 : bundleExtra.keySet()) {
                    String string = bundleExtra.getString(str3);
                    if (!TextUtils.isEmpty(string)) {
                        jSONObject2.put(str3, string);
                    }
                }
            } catch (JSONException unused) {
                Log.e("GenericIdpActivity", "Unexpected JSON exception when serializing developer specified custom params");
            }
            jSONObject = jSONObject2.toString();
        }
        String str4 = UUID.randomUUID().toString();
        String a5 = fm.a(this, UUID.randomUUID().toString());
        String action = intent.getAction();
        String stringExtra5 = intent.getStringExtra("com.google.firebase.auth.internal.CLIENT_VERSION");
        String str5 = jSONObject;
        String str6 = join;
        y0.b().d(getApplicationContext(), str, str4, a5, action, stringExtra2, stringExtra3, stringExtra4);
        String c5 = z0.a(getApplicationContext(), e.p(stringExtra4).s()).c();
        if (TextUtils.isEmpty(c5)) {
            Log.e("GenericIdpActivity", "Could not generate an encryption key for Generic IDP - cancelling flow.");
            A(l.a("Failed to generate/retrieve public encryption key for Generic IDP flow."));
            return null;
        }
        if (a5 == null) {
            return null;
        }
        builder.appendQueryParameter("eid", "p").appendQueryParameter("v", "X".concat(String.valueOf(stringExtra5))).appendQueryParameter("authType", "signInWithRedirect").appendQueryParameter("apiKey", stringExtra).appendQueryParameter("providerId", stringExtra2).appendQueryParameter("sessionId", a5).appendQueryParameter("eventId", str4).appendQueryParameter("apn", str).appendQueryParameter("sha1Cert", str2).appendQueryParameter("publicKey", c5);
        if (!TextUtils.isEmpty(str6)) {
            builder.appendQueryParameter("scopes", str6);
        }
        if (!TextUtils.isEmpty(str5)) {
            builder.appendQueryParameter("customParameters", str5);
        }
        if (!TextUtils.isEmpty(stringExtra3)) {
            builder.appendQueryParameter("tid", stringExtra3);
        }
        return builder;
    }
}
