package x;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class b {

    public static class a extends RuntimeException {
        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public a(java.lang.String r4, android.os.Parcel r5) {
            /*
                r3 = this;
                int r0 = r5.dataPosition()
                int r5 = r5.dataSize()
                java.lang.String r1 = java.lang.String.valueOf(r4)
                int r1 = r1.length()
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r1 = r1 + 41
                r2.<init>(r1)
                r2.append(r4)
                java.lang.String r4 = " Parcel: pos="
                r2.append(r4)
                r2.append(r0)
                java.lang.String r4 = " size="
                r2.append(r4)
                r2.append(r5)
                java.lang.String r4 = r2.toString()
                r3.<init>(r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: x.b.a.<init>(java.lang.String, android.os.Parcel):void");
        }
    }

    public static Bundle a(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + s4);
        return readBundle;
    }

    public static byte[] b(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + s4);
        return createByteArray;
    }

    public static int[] c(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + s4);
        return createIntArray;
    }

    public static <T extends Parcelable> T d(Parcel parcel, int r22, Parcelable.Creator<T> creator) {
        int s4 = s(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        T createFromParcel = creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + s4);
        return createFromParcel;
    }

    public static String e(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + s4);
        return readString;
    }

    public static String[] f(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + s4);
        return createStringArray;
    }

    public static ArrayList<String> g(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + s4);
        return createStringArrayList;
    }

    public static <T> T[] h(Parcel parcel, int r22, Parcelable.Creator<T> creator) {
        int s4 = s(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        T[] tArr = (T[]) parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + s4);
        return tArr;
    }

    public static <T> ArrayList<T> i(Parcel parcel, int r22, Parcelable.Creator<T> creator) {
        int s4 = s(parcel, r22);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        ArrayList<T> createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + s4);
        return createTypedArrayList;
    }

    public static void j(Parcel parcel, int r4) {
        if (parcel.dataPosition() == r4) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Overread allowed size end=");
        sb.append(r4);
        throw new a(sb.toString(), parcel);
    }

    public static int k(int r02) {
        return (char) r02;
    }

    public static boolean l(Parcel parcel, int r22) {
        w(parcel, r22, 4);
        return parcel.readInt() != 0;
    }

    public static Boolean m(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        if (s4 == 0) {
            return null;
        }
        v(parcel, r32, s4, 4);
        return Boolean.valueOf(parcel.readInt() != 0);
    }

    public static int n(Parcel parcel) {
        return parcel.readInt();
    }

    public static IBinder o(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        int dataPosition = parcel.dataPosition();
        if (s4 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + s4);
        return readStrongBinder;
    }

    public static int p(Parcel parcel, int r22) {
        w(parcel, r22, 4);
        return parcel.readInt();
    }

    public static long q(Parcel parcel, int r22) {
        w(parcel, r22, 8);
        return parcel.readLong();
    }

    public static Long r(Parcel parcel, int r32) {
        int s4 = s(parcel, r32);
        if (s4 == 0) {
            return null;
        }
        v(parcel, r32, s4, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int s(Parcel parcel, int r32) {
        return (r32 & (-65536)) != -65536 ? (char) (r32 >> 16) : parcel.readInt();
    }

    public static void t(Parcel parcel, int r22) {
        parcel.setDataPosition(parcel.dataPosition() + s(parcel, r22));
    }

    public static int u(Parcel parcel) {
        int n4 = n(parcel);
        int s4 = s(parcel, n4);
        int dataPosition = parcel.dataPosition();
        if (k(n4) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(n4));
            throw new a(valueOf.length() != 0 ? "Expected object header. Got 0x".concat(valueOf) : new String("Expected object header. Got 0x"), parcel);
        }
        int r12 = s4 + dataPosition;
        if (r12 >= dataPosition && r12 <= parcel.dataSize()) {
            return r12;
        }
        StringBuilder sb = new StringBuilder(54);
        sb.append("Size read is invalid start=");
        sb.append(dataPosition);
        sb.append(" end=");
        sb.append(r12);
        throw new a(sb.toString(), parcel);
    }

    private static void v(Parcel parcel, int r4, int r5, int r6) {
        if (r5 == r6) {
            return;
        }
        String hexString = Integer.toHexString(r5);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(r5);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }

    private static void w(Parcel parcel, int r5, int r6) {
        int s4 = s(parcel, r5);
        if (s4 == r6) {
            return;
        }
        String hexString = Integer.toHexString(s4);
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 46);
        sb.append("Expected size ");
        sb.append(r6);
        sb.append(" got ");
        sb.append(s4);
        sb.append(" (0x");
        sb.append(hexString);
        sb.append(")");
        throw new a(sb.toString(), parcel);
    }
}
