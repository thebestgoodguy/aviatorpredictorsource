package w;

import android.app.Activity;
import android.content.Intent;

/* loaded from: classes.dex */
final class e0 extends g0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f7966a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f7967b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f7968c;

    e0(Intent intent, Activity activity, int r32) {
        this.f7966a = intent;
        this.f7967b = activity;
        this.f7968c = r32;
    }

    @Override // w.g0
    public final void a() {
        Intent intent = this.f7966a;
        if (intent != null) {
            this.f7967b.startActivityForResult(intent, this.f7968c);
        }
    }
}
