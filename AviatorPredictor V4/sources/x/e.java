package x;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import w.r;

/* loaded from: classes.dex */
public final class e {
    public static <T extends d> T a(byte[] bArr, Parcelable.Creator<T> creator) {
        r.i(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T createFromParcel = creator.createFromParcel(obtain);
        obtain.recycle();
        return createFromParcel;
    }

    public static <T extends d> T b(Intent intent, String str, Parcelable.Creator<T> creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return (T) a(byteArrayExtra, creator);
    }

    public static <T extends d> T c(String str, Parcelable.Creator<T> creator) {
        return (T) a(b0.c.a(str), creator);
    }

    public static <T extends d> byte[] d(T t4) {
        Parcel obtain = Parcel.obtain();
        t4.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static <T extends d> void e(T t4, Intent intent, String str) {
        intent.putExtra(str, d(t4));
    }

    public static <T extends d> String f(T t4) {
        return b0.c.d(d(t4));
    }
}
