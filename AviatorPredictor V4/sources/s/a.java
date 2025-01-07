package s;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import w.p;

/* loaded from: classes.dex */
public final class a extends x.a {

    /* renamed from: e, reason: collision with root package name */
    final int f7475e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7476f;

    /* renamed from: g, reason: collision with root package name */
    private final PendingIntent f7477g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7478h;

    /* renamed from: i, reason: collision with root package name */
    public static final a f7474i = new a(0);
    public static final Parcelable.Creator<a> CREATOR = new o();

    public a(int r22) {
        this(r22, null, null);
    }

    a(int r12, int r22, PendingIntent pendingIntent, String str) {
        this.f7475e = r12;
        this.f7476f = r22;
        this.f7477g = pendingIntent;
        this.f7478h = str;
    }

    public a(int r22, PendingIntent pendingIntent) {
        this(r22, pendingIntent, null);
    }

    public a(int r22, PendingIntent pendingIntent, String str) {
        this(1, r22, pendingIntent, str);
    }

    static String o0(int r22) {
        if (r22 == 99) {
            return "UNFINISHED";
        }
        if (r22 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (r22) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case x1.x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                return "SERVICE_INVALID";
            case x1.x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (r22) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case x1.x.STRING_VALUE_FIELD_NUMBER /* 17 */:
                        return "SIGN_IN_FAILED";
                    case x1.x.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        StringBuilder sb = new StringBuilder(31);
                        sb.append("UNKNOWN_ERROR_CODE(");
                        sb.append(r22);
                        sb.append(")");
                        return sb.toString();
                }
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7476f == aVar.f7476f && w.p.a(this.f7477g, aVar.f7477g) && w.p.a(this.f7478h, aVar.f7478h);
    }

    public int hashCode() {
        return w.p.b(Integer.valueOf(this.f7476f), this.f7477g, this.f7478h);
    }

    public int j0() {
        return this.f7476f;
    }

    public String k0() {
        return this.f7478h;
    }

    public PendingIntent l0() {
        return this.f7477g;
    }

    public boolean m0() {
        return (this.f7476f == 0 || this.f7477g == null) ? false : true;
    }

    public boolean n0() {
        return this.f7476f == 0;
    }

    public String toString() {
        p.a c5 = w.p.c(this);
        c5.a("statusCode", o0(this.f7476f));
        c5.a("resolution", this.f7477g);
        c5.a("message", this.f7478h);
        return c5.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r6) {
        int a5 = x.c.a(parcel);
        x.c.h(parcel, 1, this.f7475e);
        x.c.h(parcel, 2, j0());
        x.c.l(parcel, 3, l0(), r6, false);
        x.c.m(parcel, 4, k0(), false);
        x.c.b(parcel, a5);
    }
}
