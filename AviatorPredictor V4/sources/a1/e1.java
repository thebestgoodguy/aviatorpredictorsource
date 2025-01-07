package a1;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* loaded from: classes.dex */
public final class e1 implements com.google.firebase.auth.g {
    public static final Parcelable.Creator<e1> CREATOR = new f1();

    /* renamed from: e, reason: collision with root package name */
    private final String f34e;

    /* renamed from: f, reason: collision with root package name */
    private final String f35f;

    /* renamed from: g, reason: collision with root package name */
    private final Map f36g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f37h;

    public e1(String str, String str2, boolean z4) {
        w.r.e(str);
        w.r.e(str2);
        this.f34e = str;
        this.f35f = str2;
        this.f36g = c0.c(str2);
        this.f37h = z4;
    }

    public e1(boolean z4) {
        this.f37h = z4;
        this.f35f = null;
        this.f34e = null;
        this.f36g = null;
    }

    @Override // com.google.firebase.auth.g
    public final boolean H() {
        return this.f37h;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.google.firebase.auth.g
    public final String h() {
        return this.f34e;
    }

    @Override // com.google.firebase.auth.g
    public final Map<String, Object> s() {
        return this.f36g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.m(parcel, 1, this.f34e, false);
        x.c.m(parcel, 2, this.f35f, false);
        x.c.c(parcel, 3, this.f37h);
        x.c.b(parcel, a5);
    }

    @Override // com.google.firebase.auth.g
    public final String y() {
        Map map;
        String str;
        if ("github.com".equals(this.f34e)) {
            map = this.f36g;
            str = "login";
        } else {
            if (!"twitter.com".equals(this.f34e)) {
                return null;
            }
            map = this.f36g;
            str = "screen_name";
        }
        return (String) map.get(str);
    }
}
