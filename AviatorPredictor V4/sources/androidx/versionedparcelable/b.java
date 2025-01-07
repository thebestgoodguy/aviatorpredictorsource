package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
class b extends a {

    /* renamed from: d, reason: collision with root package name */
    private final SparseIntArray f564d;

    /* renamed from: e, reason: collision with root package name */
    private final Parcel f565e;

    /* renamed from: f, reason: collision with root package name */
    private final int f566f;

    /* renamed from: g, reason: collision with root package name */
    private final int f567g;

    /* renamed from: h, reason: collision with root package name */
    private final String f568h;

    /* renamed from: i, reason: collision with root package name */
    private int f569i;

    /* renamed from: j, reason: collision with root package name */
    private int f570j;

    /* renamed from: k, reason: collision with root package name */
    private int f571k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e.a(), new e.a(), new e.a());
    }

    private b(Parcel parcel, int r22, int r32, String str, e.a<String, Method> aVar, e.a<String, Method> aVar2, e.a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f564d = new SparseIntArray();
        this.f569i = -1;
        this.f570j = 0;
        this.f571k = -1;
        this.f565e = parcel;
        this.f566f = r22;
        this.f567g = r32;
        this.f570j = r22;
        this.f568h = str;
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f565e.writeInt(-1);
        } else {
            this.f565e.writeInt(bArr.length);
            this.f565e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f565e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int r22) {
        this.f565e.writeInt(r22);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f565e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f565e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int r02 = this.f569i;
        if (r02 >= 0) {
            int r03 = this.f564d.get(r02);
            int dataPosition = this.f565e.dataPosition();
            this.f565e.setDataPosition(r03);
            this.f565e.writeInt(dataPosition - r03);
            this.f565e.setDataPosition(dataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f565e;
        int dataPosition = parcel.dataPosition();
        int r02 = this.f570j;
        if (r02 == this.f566f) {
            r02 = this.f567g;
        }
        return new b(parcel, dataPosition, r02, this.f568h + "  ", this.f561a, this.f562b, this.f563c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f565e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int readInt = this.f565e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f565e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f565e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int r5) {
        while (this.f570j < this.f567g) {
            int r02 = this.f571k;
            if (r02 == r5) {
                return true;
            }
            if (String.valueOf(r02).compareTo(String.valueOf(r5)) > 0) {
                return false;
            }
            this.f565e.setDataPosition(this.f570j);
            int readInt = this.f565e.readInt();
            this.f571k = this.f565e.readInt();
            this.f570j += readInt;
        }
        return this.f571k == r5;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f565e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public <T extends Parcelable> T q() {
        return (T) this.f565e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f565e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int r32) {
        a();
        this.f569i = r32;
        this.f564d.put(r32, this.f565e.dataPosition());
        E(0);
        E(r32);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z4) {
        this.f565e.writeInt(z4 ? 1 : 0);
    }
}
