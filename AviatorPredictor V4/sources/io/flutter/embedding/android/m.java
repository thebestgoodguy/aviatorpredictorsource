package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.q;
import q2.d;

/* loaded from: classes.dex */
public class m implements q.d {

    /* renamed from: a, reason: collision with root package name */
    private final q2.d f4436a;

    /* renamed from: b, reason: collision with root package name */
    private final q.b f4437b = new q.b();

    public m(q2.d dVar) {
        this.f4436a = dVar;
    }

    @Override // io.flutter.embedding.android.q.d
    public void a(KeyEvent keyEvent, final q.d.a aVar) {
        int action = keyEvent.getAction();
        if (action == 0 || action == 1) {
            this.f4436a.e(new d.b(keyEvent, this.f4437b.a(keyEvent.getUnicodeChar())), action != 0, new d.a() { // from class: io.flutter.embedding.android.l
                @Override // q2.d.a
                public final void a(boolean z4) {
                    q.d.a.this.a(z4);
                }
            });
        } else {
            aVar.a(false);
        }
    }
}
