package w;

import android.content.Intent;

/* loaded from: classes.dex */
final class f0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f7984a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u.e f7985b;

    f0(Intent intent, u.e eVar, int r32) {
        this.f7984a = intent;
        this.f7985b = eVar;
    }

    @Override // w.g0
    public final void a() {
        Intent intent = this.f7984a;
        if (intent != null) {
            this.f7985b.startActivityForResult(intent, 2);
        }
    }
}
