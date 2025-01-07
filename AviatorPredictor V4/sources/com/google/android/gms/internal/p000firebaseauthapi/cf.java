package com.google.android.gms.internal.p000firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public final class cf {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f1452b = Logger.getLogger(cf.class.getName());

    /* renamed from: c, reason: collision with root package name */
    private static final List f1453c;

    /* renamed from: d, reason: collision with root package name */
    private static final boolean f1454d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf f1455e;

    /* renamed from: f, reason: collision with root package name */
    public static final cf f1456f;

    /* renamed from: g, reason: collision with root package name */
    public static final cf f1457g;

    /* renamed from: h, reason: collision with root package name */
    public static final cf f1458h;

    /* renamed from: i, reason: collision with root package name */
    public static final cf f1459i;

    /* renamed from: j, reason: collision with root package name */
    public static final cf f1460j;

    /* renamed from: k, reason: collision with root package name */
    public static final cf f1461k;

    /* renamed from: a, reason: collision with root package name */
    private final lf f1462a;

    static {
        if (v5.b()) {
            f1453c = b("GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt");
            f1454d = false;
        } else {
            f1453c = vf.b() ? b("GmsCore_OpenSSL", "AndroidOpenSSL") : new ArrayList();
            f1454d = true;
        }
        f1455e = new cf(new df());
        f1456f = new cf(new hf());
        f1457g = new cf(new kf());
        f1458h = new cf(new Cif());
        f1459i = new cf(new ef());
        f1460j = new cf(new gf());
        f1461k = new cf(new ff());
    }

    public cf(lf lfVar) {
        this.f1462a = lfVar;
    }

    public static List b(String... strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            Provider provider = Security.getProvider(str);
            if (provider != null) {
                arrayList.add(provider);
            } else {
                f1452b.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
            }
        }
        return arrayList;
    }

    public final Object a(String str) {
        Iterator it = f1453c.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.f1462a.a(str, (Provider) it.next());
            } catch (Exception e5) {
                if (exc == null) {
                    exc = e5;
                }
            }
        }
        if (f1454d) {
            return this.f1462a.a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }
}
