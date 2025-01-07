package io.flutter.embedding.android;

import android.view.KeyEvent;
import io.flutter.embedding.android.n;
import io.flutter.embedding.android.q;
import io.flutter.embedding.android.r;
import java.nio.ByteBuffer;
import java.util.HashMap;
import r2.b;

/* loaded from: classes.dex */
public class p implements q.d {

    /* renamed from: a, reason: collision with root package name */
    private final r2.b f4450a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<Long, Long> f4451b = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    private final HashMap<Long, r.e> f4452c = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final q.b f4453d = new q.b();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f4454a;

        static {
            int[] r02 = new int[n.a.values().length];
            f4454a = r02;
            try {
                r02[n.a.kDown.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4454a[n.a.kUp.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4454a[n.a.kRepeat.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public p(r2.b bVar) {
        this.f4450a = bVar;
        for (r.e eVar : r.a()) {
            this.f4452c.put(Long.valueOf(eVar.f4474c), eVar);
        }
    }

    private static n.a c(KeyEvent keyEvent) {
        boolean z4 = keyEvent.getRepeatCount() > 0;
        int action = keyEvent.getAction();
        if (action == 0) {
            return z4 ? n.a.kRepeat : n.a.kDown;
        }
        if (action == 1) {
            return n.a.kUp;
        }
        throw new AssertionError("Unexpected event type");
    }

    private Long d(KeyEvent keyEvent) {
        Long l4 = r.f4466b.get(Long.valueOf(keyEvent.getKeyCode()));
        return l4 != null ? l4 : Long.valueOf(g(keyEvent.getKeyCode(), 73014444032L));
    }

    private Long e(KeyEvent keyEvent) {
        int scanCode;
        long scanCode2 = keyEvent.getScanCode();
        if (scanCode2 == 0) {
            scanCode = keyEvent.getKeyCode();
        } else {
            Long l4 = r.f4465a.get(Long.valueOf(scanCode2));
            if (l4 != null) {
                return l4;
            }
            scanCode = keyEvent.getScanCode();
        }
        return Long.valueOf(g(scanCode, 73014444032L));
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean f(android.view.KeyEvent r15, io.flutter.embedding.android.q.d.a r16) {
        /*
            Method dump skipped, instructions count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.p.f(android.view.KeyEvent, io.flutter.embedding.android.q$d$a):boolean");
    }

    private static long g(long j4, long j5) {
        return (j4 & 4294967295L) | j5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void h(q.d.a aVar, ByteBuffer byteBuffer) {
        Boolean bool = Boolean.FALSE;
        byteBuffer.rewind();
        if (byteBuffer.capacity() != 0) {
            bool = Boolean.valueOf(byteBuffer.get() != 0);
        }
        aVar.a(bool.booleanValue());
    }

    private void i(n nVar, final q.d.a aVar) {
        this.f4450a.e("flutter/keydata", nVar.a(), aVar == null ? null : new b.InterfaceC0084b() { // from class: io.flutter.embedding.android.o
            @Override // r2.b.InterfaceC0084b
            public final void a(ByteBuffer byteBuffer) {
                p.h(q.d.a.this, byteBuffer);
            }
        });
    }

    private void l(boolean z4, Long l4, Long l5, long j4) {
        n nVar = new n();
        nVar.f4438a = j4;
        nVar.f4439b = z4 ? n.a.kDown : n.a.kUp;
        nVar.f4441d = l4.longValue();
        nVar.f4440c = l5.longValue();
        nVar.f4443f = null;
        nVar.f4442e = true;
        if (l5.longValue() != 0 && l4.longValue() != 0) {
            if (!z4) {
                l4 = null;
            }
            m(l5, l4);
        }
        i(nVar, null);
    }

    @Override // io.flutter.embedding.android.q.d
    public void a(KeyEvent keyEvent, q.d.a aVar) {
        if (f(keyEvent, aVar)) {
            return;
        }
        l(true, 0L, 0L, 0L);
        aVar.a(true);
    }

    void j(r.d dVar, boolean z4, long j4, KeyEvent keyEvent) {
        r.c[] cVarArr = dVar.f4471b;
        boolean[] zArr = new boolean[cVarArr.length];
        Boolean[] boolArr = new Boolean[cVarArr.length];
        int r32 = 0;
        boolean z5 = false;
        while (true) {
            r.c[] cVarArr2 = dVar.f4471b;
            boolean z6 = true;
            if (r32 >= cVarArr2.length) {
                if (z4) {
                    for (int r12 = 0; r12 < dVar.f4471b.length; r12++) {
                        if (boolArr[r12] == null) {
                            if (z5) {
                                boolArr[r12] = Boolean.valueOf(zArr[r12]);
                            } else {
                                boolArr[r12] = Boolean.TRUE;
                                z5 = true;
                            }
                        }
                    }
                    if (!z5) {
                        boolArr[0] = Boolean.TRUE;
                    }
                } else {
                    for (int r122 = 0; r122 < dVar.f4471b.length; r122++) {
                        if (boolArr[r122] == null) {
                            boolArr[r122] = Boolean.FALSE;
                        }
                    }
                }
                for (int r22 = 0; r22 < dVar.f4471b.length; r22++) {
                    if (zArr[r22] != boolArr[r22].booleanValue()) {
                        r.c cVar = dVar.f4471b[r22];
                        l(boolArr[r22].booleanValue(), Long.valueOf(cVar.f4469b), Long.valueOf(cVar.f4468a), keyEvent.getEventTime());
                    }
                }
                return;
            }
            zArr[r32] = this.f4451b.containsKey(Long.valueOf(cVarArr2[r32].f4468a));
            if (dVar.f4471b[r32].f4469b == j4) {
                int r5 = a.f4454a[c(keyEvent).ordinal()];
                if (r5 == 1) {
                    boolArr[r32] = Boolean.FALSE;
                    if (!z4) {
                        throw new AssertionError(String.format("Unexpected metaState 0 for key 0x%x during an ACTION_down event.", Long.valueOf(j4)));
                    }
                } else if (r5 == 2) {
                    boolArr[r32] = Boolean.valueOf(zArr[r32]);
                } else if (r5 != 3) {
                    continue;
                } else {
                    if (!z4) {
                        throw new AssertionError(String.format("Unexpected metaState 0 for key 0x%x during an ACTION_down repeat event.", Long.valueOf(j4)));
                    }
                    boolArr[r32] = Boolean.valueOf(zArr[r32]);
                }
                z5 = true;
            } else {
                if (!z5 && !zArr[r32]) {
                    z6 = false;
                }
                z5 = z6;
            }
            r32++;
        }
    }

    void k(r.e eVar, boolean z4, long j4, KeyEvent keyEvent) {
        if (eVar.f4474c == j4 || eVar.f4475d == z4) {
            return;
        }
        boolean z5 = !this.f4451b.containsKey(Long.valueOf(eVar.f4473b));
        if (z5) {
            eVar.f4475d = !eVar.f4475d;
        }
        l(z5, Long.valueOf(eVar.f4474c), Long.valueOf(eVar.f4473b), keyEvent.getEventTime());
        if (!z5) {
            eVar.f4475d = !eVar.f4475d;
        }
        l(!z5, Long.valueOf(eVar.f4474c), Long.valueOf(eVar.f4473b), keyEvent.getEventTime());
    }

    void m(Long l4, Long l5) {
        if (l5 != null) {
            if (this.f4451b.put(l4, l5) != null) {
                throw new AssertionError("The key was not empty");
            }
        } else if (this.f4451b.remove(l4) == null) {
            throw new AssertionError("The key was empty");
        }
    }
}
