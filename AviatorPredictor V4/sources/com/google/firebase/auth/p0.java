package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes.dex */
public class p0 {

    public static class a extends x.a {
        public static final Parcelable.Creator<a> CREATOR = new m1();

        a() {
        }

        public static a j0() {
            return new a();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int r22) {
            x.c.b(parcel, x.c.a(parcel));
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        private static final z.a f2561a = new z.a("PhoneAuthProvider", new String[0]);

        public void a(String str) {
            f2561a.e("Sms auto retrieval timed-out.", new Object[0]);
        }

        public void b(String str, a aVar) {
        }

        public abstract void c(n0 n0Var);

        public abstract void d(x0.k kVar);
    }

    public static n0 a(String str, String str2) {
        return n0.o0(str, str2);
    }

    public static void b(o0 o0Var) {
        w.r.i(o0Var);
        o0Var.b().P(o0Var);
    }
}
