package com.google.firebase.auth;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.internal.p000firebaseauthapi.bo;
import com.google.android.gms.internal.p000firebaseauthapi.pm;
import com.google.firebase.auth.internal.GenericIdpActivity;

/* loaded from: classes.dex */
public class m0 extends n {

    /* renamed from: a, reason: collision with root package name */
    private final Bundle f2519a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final FirebaseAuth f2520a;

        /* renamed from: b, reason: collision with root package name */
        final Bundle f2521b;

        /* renamed from: c, reason: collision with root package name */
        private final Bundle f2522c;

        /* synthetic */ a(String str, FirebaseAuth firebaseAuth, b1 b1Var) {
            Bundle bundle = new Bundle();
            this.f2521b = bundle;
            Bundle bundle2 = new Bundle();
            this.f2522c = bundle2;
            this.f2520a = firebaseAuth;
            bundle.putString("com.google.firebase.auth.KEY_API_KEY", firebaseAuth.l().r().b());
            bundle.putString("com.google.firebase.auth.KEY_PROVIDER_ID", str);
            bundle.putBundle("com.google.firebase.auth.KEY_PROVIDER_CUSTOM_PARAMS", bundle2);
            bundle.putString("com.google.firebase.auth.internal.CLIENT_VERSION", pm.a().b());
            bundle.putString("com.google.firebase.auth.KEY_TENANT_ID", firebaseAuth.p());
            bundle.putString("com.google.firebase.auth.KEY_FIREBASE_APP_NAME", firebaseAuth.l().q());
        }

        public m0 a() {
            return new m0(this.f2521b, null);
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private final String f2523a;

        /* renamed from: b, reason: collision with root package name */
        private String f2524b;

        /* renamed from: c, reason: collision with root package name */
        private String f2525c;

        /* renamed from: d, reason: collision with root package name */
        private String f2526d;

        /* synthetic */ b(String str, c1 c1Var) {
            this.f2523a = str;
        }

        public h a() {
            String str = this.f2523a;
            String str2 = this.f2524b;
            String str3 = this.f2525c;
            String str4 = this.f2526d;
            Parcelable.Creator<n1> creator = n1.CREATOR;
            w.r.f(str, "Must specify a non-empty providerId");
            if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3)) {
                throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
            }
            return new n1(str, str2, str3, null, null, null, str4);
        }

        public b b(String str) {
            this.f2525c = str;
            return this;
        }

        public b c(String str) {
            this.f2524b = str;
            return this;
        }

        public b d(String str, String str2) {
            this.f2524b = str;
            this.f2526d = str2;
            return this;
        }
    }

    /* synthetic */ m0(Bundle bundle, d1 d1Var) {
        this.f2519a = bundle;
    }

    public static a b(String str) {
        return c(str, FirebaseAuth.getInstance());
    }

    public static a c(String str, FirebaseAuth firebaseAuth) {
        w.r.e(str);
        w.r.i(firebaseAuth);
        if (!"facebook.com".equals(str) || bo.g(firebaseAuth.l())) {
            return new a(str, firebaseAuth, null);
        }
        throw new IllegalArgumentException("Sign in with Facebook is not supported via this method; the Facebook TOS dictate that you must use the Facebook Android SDK for Facebook login.");
    }

    public static b d(String str) {
        return new b(w.r.e(str), null);
    }

    @Override // com.google.firebase.auth.n
    public final void a(Activity activity) {
        Intent intent = new Intent("com.google.firebase.auth.internal.NONGMSCORE_SIGN_IN");
        intent.setClass(activity, GenericIdpActivity.class);
        intent.setPackage(activity.getPackageName());
        intent.putExtras(this.f2519a);
        activity.startActivity(intent);
    }
}
