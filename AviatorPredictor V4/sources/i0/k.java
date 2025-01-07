package i0;

import android.text.TextUtils;
import i0.j;

/* loaded from: classes.dex */
final class k extends j.b {

    /* renamed from: t, reason: collision with root package name */
    private final /* synthetic */ byte[] f4028t;

    /* renamed from: u, reason: collision with root package name */
    private final /* synthetic */ String f4029u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    k(t.f fVar, byte[] bArr, String str) {
        super(fVar);
        this.f4028t = bArr;
        this.f4029u = str;
    }

    @Override // com.google.android.gms.common.api.internal.b
    protected final /* synthetic */ void l(m mVar) {
        m mVar2 = mVar;
        f fVar = this.f4027s;
        byte[] bArr = this.f4028t;
        String str = this.f4029u;
        if (TextUtils.isEmpty(str)) {
            str = mVar2.j0("com.google.android.safetynet.ATTEST_API_KEY");
        }
        ((h) mVar2.C()).s(fVar, bArr, str);
    }
}
