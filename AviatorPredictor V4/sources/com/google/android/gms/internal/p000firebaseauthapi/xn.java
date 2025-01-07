package com.google.android.gms.internal.p000firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Base64;
import c0.c;
import com.google.firebase.auth.n0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import w.r;
import z.a;

/* loaded from: classes.dex */
final class xn {

    /* renamed from: d, reason: collision with root package name */
    private static final a f2343d = new a("FirebaseAuth", "SmsRetrieverHelper");

    /* renamed from: a, reason: collision with root package name */
    private final Context f2344a;

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f2345b;

    /* renamed from: c, reason: collision with root package name */
    private final HashMap f2346c = new HashMap();

    xn(Context context) {
        this.f2344a = (Context) r.i(context);
        b7.a();
        this.f2345b = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    static String b(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    static /* bridge */ /* synthetic */ void e(xn xnVar, String str) {
        wn wnVar = (wn) xnVar.f2346c.get(str);
        if (wnVar == null || d2.d(wnVar.f2293d) || d2.d(wnVar.f2294e) || wnVar.f2291b.isEmpty()) {
            return;
        }
        Iterator it = wnVar.f2291b.iterator();
        while (it.hasNext()) {
            ((am) it.next()).n(n0.o0(wnVar.f2293d, wnVar.f2294e));
        }
        wnVar.f2297h = true;
    }

    private static String m(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str3.getBytes(kg.f1851c));
            String substring = Base64.encodeToString(Arrays.copyOf(messageDigest.digest(), 9), 3).substring(0, 11);
            f2343d.a("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e5) {
            f2343d.c("NoSuchAlgorithm: ".concat(String.valueOf(e5.getMessage())), new Object[0]);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(String str) {
        wn wnVar = (wn) this.f2346c.get(str);
        if (wnVar == null || wnVar.f2297h || d2.d(wnVar.f2293d)) {
            return;
        }
        f2343d.h("Timed out waiting for SMS.", new Object[0]);
        Iterator it = wnVar.f2291b.iterator();
        while (it.hasNext()) {
            ((am) it.next()).a(wnVar.f2293d);
        }
        wnVar.f2298i = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final void h(String str) {
        wn wnVar = (wn) this.f2346c.get(str);
        if (wnVar == null) {
            return;
        }
        if (!wnVar.f2298i) {
            n(str);
        }
        j(str);
    }

    final String c() {
        try {
            String packageName = this.f2344a.getPackageName();
            String m4 = m(packageName, (Build.VERSION.SDK_INT < 28 ? c.a(this.f2344a).c(packageName, 64).signatures : c.a(this.f2344a).c(packageName, 134217728).signingInfo.getApkContentsSigners())[0].toCharsString());
            if (m4 != null) {
                return m4;
            }
            f2343d.c("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            f2343d.c("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    final void i(am amVar, String str) {
        wn wnVar = (wn) this.f2346c.get(str);
        if (wnVar == null) {
            return;
        }
        wnVar.f2291b.add(amVar);
        if (wnVar.f2296g) {
            amVar.b(wnVar.f2293d);
        }
        if (wnVar.f2297h) {
            amVar.n(n0.o0(wnVar.f2293d, wnVar.f2294e));
        }
        if (wnVar.f2298i) {
            amVar.a(wnVar.f2293d);
        }
    }

    final void j(String str) {
        wn wnVar = (wn) this.f2346c.get(str);
        if (wnVar == null) {
            return;
        }
        ScheduledFuture scheduledFuture = wnVar.f2295f;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            wnVar.f2295f.cancel(false);
        }
        wnVar.f2291b.clear();
        this.f2346c.remove(str);
    }

    final void k(final String str, am amVar, long j4, boolean z4) {
        this.f2346c.put(str, new wn(j4, z4));
        i(amVar, str);
        wn wnVar = (wn) this.f2346c.get(str);
        long j5 = wnVar.f2290a;
        if (j5 <= 0) {
            f2343d.h("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        wnVar.f2295f = this.f2345b.schedule(new Runnable() { // from class: com.google.android.gms.internal.firebase-auth-api.sn
            @Override // java.lang.Runnable
            public final void run() {
                xn.this.h(str);
            }
        }, j5, TimeUnit.SECONDS);
        if (!wnVar.f2292c) {
            f2343d.h("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        vn vnVar = new vn(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
        x2.d(this.f2344a.getApplicationContext(), vnVar, intentFilter);
        p.a.a(this.f2344a).o().e(new tn(this));
    }

    final boolean l(String str) {
        return this.f2346c.get(str) != null;
    }
}
