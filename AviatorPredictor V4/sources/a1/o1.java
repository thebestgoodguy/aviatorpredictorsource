package a1;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class o1 implements com.google.firebase.auth.a0 {
    public static final Parcelable.Creator<o1> CREATOR = new d();

    /* renamed from: e, reason: collision with root package name */
    private final long f99e;

    /* renamed from: f, reason: collision with root package name */
    private final long f100f;

    public o1(long j4, long j5) {
        this.f99e = j4;
        this.f100f = j5;
    }

    @Override // com.google.firebase.auth.a0
    public final long S() {
        return this.f99e;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.f99e);
            jSONObject.put("creationTimestamp", this.f100f);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    @Override // com.google.firebase.auth.a0
    public final long c0() {
        return this.f100f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int r5) {
        int a5 = x.c.a(parcel);
        x.c.j(parcel, 1, this.f99e);
        x.c.j(parcel, 2, this.f100f);
        x.c.b(parcel, a5);
    }
}
