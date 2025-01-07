package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.Parcel;
import d0.a;

/* loaded from: classes.dex */
public final class m extends h0.a {
    m(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final d0.a A(d0.a aVar, String str, int r4) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        f5.writeInt(r4);
        Parcel a5 = a(4, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }

    public final d0.a B(d0.a aVar, String str, boolean z4, long j4) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        h0.c.b(f5, z4);
        f5.writeLong(j4);
        Parcel a5 = a(7, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }

    public final int h() {
        Parcel a5 = a(6, f());
        int readInt = a5.readInt();
        a5.recycle();
        return readInt;
    }

    public final int w(d0.a aVar, String str, boolean z4) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        h0.c.b(f5, z4);
        Parcel a5 = a(3, f5);
        int readInt = a5.readInt();
        a5.recycle();
        return readInt;
    }

    public final int x(d0.a aVar, String str, boolean z4) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        h0.c.b(f5, z4);
        Parcel a5 = a(5, f5);
        int readInt = a5.readInt();
        a5.recycle();
        return readInt;
    }

    public final d0.a y(d0.a aVar, String str, int r4) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        f5.writeInt(r4);
        Parcel a5 = a(2, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }

    public final d0.a z(d0.a aVar, String str, int r4, d0.a aVar2) {
        Parcel f5 = f();
        h0.c.c(f5, aVar);
        f5.writeString(str);
        f5.writeInt(r4);
        h0.c.c(f5, aVar2);
        Parcel a5 = a(8, f5);
        d0.a f6 = a.AbstractBinderC0027a.f(a5.readStrongBinder());
        a5.recycle();
        return f6;
    }
}
