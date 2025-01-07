package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d0.a;

/* loaded from: classes.dex */
public final class n extends h0.a {
    n(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final d0.a h(d0.a aVar, String str, int r4, d0.a aVar2) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        f5.writeInt(r4);
        h0.c.c(f5, aVar2);
        Parcel a5 = a(2, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }

    public final d0.a w(d0.a aVar, String str, int r4, d0.a aVar2) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        f5.writeInt(r4);
        h0.c.c(f5, aVar2);
        Parcel a5 = a(3, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }
}
