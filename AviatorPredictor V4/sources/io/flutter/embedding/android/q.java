package io.flutter.embedding.android;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import io.flutter.plugin.editing.b;
import java.util.HashSet;

/* loaded from: classes.dex */
public class q implements b.a {

    /* renamed from: a, reason: collision with root package name */
    protected final d[] f4455a;

    /* renamed from: b, reason: collision with root package name */
    private final HashSet<KeyEvent> f4456b = new HashSet<>();

    /* renamed from: c, reason: collision with root package name */
    private final e f4457c;

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private int f4458a = 0;

        Character a(int r4) {
            char c5 = (char) r4;
            if ((Integer.MIN_VALUE & r4) != 0) {
                int r42 = r4 & Integer.MAX_VALUE;
                int r12 = this.f4458a;
                if (r12 != 0) {
                    r42 = KeyCharacterMap.getDeadChar(r12, r42);
                }
                this.f4458a = r42;
            } else {
                int r13 = this.f4458a;
                if (r13 != 0) {
                    int deadChar = KeyCharacterMap.getDeadChar(r13, r4);
                    if (deadChar > 0) {
                        c5 = (char) deadChar;
                    }
                    this.f4458a = 0;
                }
            }
            return Character.valueOf(c5);
        }
    }

    private class c {

        /* renamed from: a, reason: collision with root package name */
        final KeyEvent f4459a;

        /* renamed from: b, reason: collision with root package name */
        int f4460b;

        /* renamed from: c, reason: collision with root package name */
        boolean f4461c = false;

        private class a implements d.a {

            /* renamed from: a, reason: collision with root package name */
            boolean f4463a;

            private a() {
                this.f4463a = false;
            }

            @Override // io.flutter.embedding.android.q.d.a
            public void a(boolean z4) {
                if (this.f4463a) {
                    throw new IllegalStateException("The onKeyEventHandledCallback should be called exactly once.");
                }
                this.f4463a = true;
                c cVar = c.this;
                int r22 = cVar.f4460b - 1;
                cVar.f4460b = r22;
                boolean z5 = z4 | cVar.f4461c;
                cVar.f4461c = z5;
                if (r22 != 0 || z5) {
                    return;
                }
                q.this.d(cVar.f4459a);
            }
        }

        c(KeyEvent keyEvent) {
            this.f4460b = q.this.f4455a.length;
            this.f4459a = keyEvent;
        }

        public d.a a() {
            return new a();
        }
    }

    public interface d {

        public interface a {
            void a(boolean z4);
        }

        void a(KeyEvent keyEvent, a aVar);
    }

    public interface e {
        void a(KeyEvent keyEvent);

        boolean b(KeyEvent keyEvent);

        r2.b getBinaryMessenger();
    }

    public q(e eVar) {
        this.f4457c = eVar;
        this.f4455a = new d[]{new p(eVar.getBinaryMessenger()), new m(new q2.d(eVar.getBinaryMessenger()))};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(KeyEvent keyEvent) {
        e eVar = this.f4457c;
        if (eVar == null || eVar.b(keyEvent)) {
            return;
        }
        this.f4456b.add(keyEvent);
        this.f4457c.a(keyEvent);
        if (this.f4456b.remove(keyEvent)) {
            e2.b.f("KeyboardManager", "A redispatched key event was consumed before reaching KeyboardManager");
        }
    }

    @Override // io.flutter.plugin.editing.b.a
    public boolean a(KeyEvent keyEvent) {
        if (this.f4456b.remove(keyEvent)) {
            return false;
        }
        if (this.f4455a.length <= 0) {
            d(keyEvent);
            return true;
        }
        c cVar = new c(keyEvent);
        for (d dVar : this.f4455a) {
            dVar.a(keyEvent, cVar.a());
        }
        return true;
    }

    public void c() {
        int size = this.f4456b.size();
        if (size > 0) {
            e2.b.f("KeyboardManager", "A KeyboardManager was destroyed with " + String.valueOf(size) + " unhandled redispatch event(s).");
        }
    }
}
