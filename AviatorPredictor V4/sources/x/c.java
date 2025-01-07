package x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: classes.dex */
public class c {
    public static int a(Parcel parcel) {
        return r(parcel, 20293);
    }

    public static void b(Parcel parcel, int r12) {
        s(parcel, r12);
    }

    public static void c(Parcel parcel, int r22, boolean z4) {
        t(parcel, r22, 4);
        parcel.writeInt(z4 ? 1 : 0);
    }

    public static void d(Parcel parcel, int r12, Boolean bool, boolean z4) {
        if (bool != null) {
            t(parcel, r12, 4);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else if (z4) {
            t(parcel, r12, 0);
        }
    }

    public static void e(Parcel parcel, int r12, Bundle bundle, boolean z4) {
        if (bundle == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeBundle(bundle);
            s(parcel, r4);
        }
    }

    public static void f(Parcel parcel, int r12, byte[] bArr, boolean z4) {
        if (bArr == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeByteArray(bArr);
            s(parcel, r4);
        }
    }

    public static void g(Parcel parcel, int r12, IBinder iBinder, boolean z4) {
        if (iBinder == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeStrongBinder(iBinder);
            s(parcel, r4);
        }
    }

    public static void h(Parcel parcel, int r22, int r32) {
        t(parcel, r22, 4);
        parcel.writeInt(r32);
    }

    public static void i(Parcel parcel, int r12, int[] r22, boolean z4) {
        if (r22 == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeIntArray(r22);
            s(parcel, r4);
        }
    }

    public static void j(Parcel parcel, int r22, long j4) {
        t(parcel, r22, 8);
        parcel.writeLong(j4);
    }

    public static void k(Parcel parcel, int r12, Long l4, boolean z4) {
        if (l4 != null) {
            t(parcel, r12, 8);
            parcel.writeLong(l4.longValue());
        } else if (z4) {
            t(parcel, r12, 0);
        }
    }

    public static void l(Parcel parcel, int r12, Parcelable parcelable, int r32, boolean z4) {
        if (parcelable == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcelable.writeToParcel(parcel, r32);
            s(parcel, r4);
        }
    }

    public static void m(Parcel parcel, int r12, String str, boolean z4) {
        if (str == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeString(str);
            s(parcel, r4);
        }
    }

    public static void n(Parcel parcel, int r12, String[] strArr, boolean z4) {
        if (strArr == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeStringArray(strArr);
            s(parcel, r4);
        }
    }

    public static void o(Parcel parcel, int r12, List<String> list, boolean z4) {
        if (list == null) {
            if (z4) {
                t(parcel, r12, 0);
            }
        } else {
            int r4 = r(parcel, r12);
            parcel.writeStringList(list);
            s(parcel, r4);
        }
    }

    public static <T extends Parcelable> void p(Parcel parcel, int r4, T[] tArr, int r6, boolean z4) {
        if (tArr == null) {
            if (z4) {
                t(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = r(parcel, r4);
        parcel.writeInt(tArr.length);
        for (T t4 : tArr) {
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t4, r6);
            }
        }
        s(parcel, r5);
    }

    public static <T extends Parcelable> void q(Parcel parcel, int r4, List<T> list, boolean z4) {
        if (list == null) {
            if (z4) {
                t(parcel, r4, 0);
                return;
            }
            return;
        }
        int r5 = r(parcel, r4);
        int size = list.size();
        parcel.writeInt(size);
        for (int r12 = 0; r12 < size; r12++) {
            T t4 = list.get(r12);
            if (t4 == null) {
                parcel.writeInt(0);
            } else {
                u(parcel, t4, 0);
            }
        }
        s(parcel, r5);
    }

    private static int r(Parcel parcel, int r22) {
        parcel.writeInt(r22 | (-65536));
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    private static void s(Parcel parcel, int r32) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(r32 - 4);
        parcel.writeInt(dataPosition - r32);
        parcel.setDataPosition(dataPosition);
    }

    private static void t(Parcel parcel, int r12, int r22) {
        parcel.writeInt(r12 | (r22 << 16));
    }

    private static <T extends Parcelable> void u(Parcel parcel, T t4, int r4) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        t4.writeToParcel(parcel, r4);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
