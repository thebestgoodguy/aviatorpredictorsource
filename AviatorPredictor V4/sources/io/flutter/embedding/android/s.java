package io.flutter.embedding.android;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class s {

    /* renamed from: c, reason: collision with root package name */
    private static s f4476c;

    /* renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f4477a = new LongSparseArray<>();

    /* renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f4478b = new PriorityQueue<>();

    public static class a {

        /* renamed from: b, reason: collision with root package name */
        private static final AtomicLong f4479b = new AtomicLong(0);

        /* renamed from: a, reason: collision with root package name */
        private final long f4480a;

        private a(long j4) {
            this.f4480a = j4;
        }

        public static a b() {
            return c(f4479b.incrementAndGet());
        }

        public static a c(long j4) {
            return new a(j4);
        }

        public long d() {
            return this.f4480a;
        }
    }

    private s() {
    }

    public static s a() {
        if (f4476c == null) {
            f4476c = new s();
        }
        return f4476c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f4478b.isEmpty() && this.f4478b.peek().longValue() < aVar.f4480a) {
            this.f4477a.remove(this.f4478b.poll().longValue());
        }
        if (!this.f4478b.isEmpty() && this.f4478b.peek().longValue() == aVar.f4480a) {
            this.f4478b.poll();
        }
        MotionEvent motionEvent = this.f4477a.get(aVar.f4480a);
        this.f4477a.remove(aVar.f4480a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a b5 = a.b();
        this.f4477a.put(b5.f4480a, MotionEvent.obtain(motionEvent));
        this.f4478b.add(Long.valueOf(b5.f4480a));
        return b5;
    }
}
