package t;

import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public class b extends Exception {

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    protected final Status f7546e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public b(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.k0()
            java.lang.String r1 = r5.l0()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r5.l0()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.f7546e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: t.b.<init>(com.google.android.gms.common.api.Status):void");
    }

    public Status a() {
        return this.f7546e;
    }
}
