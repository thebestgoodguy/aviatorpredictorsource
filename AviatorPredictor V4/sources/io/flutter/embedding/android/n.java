package io.flutter.embedding.android;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public class n {

    /* renamed from: a, reason: collision with root package name */
    long f4438a;

    /* renamed from: b, reason: collision with root package name */
    a f4439b;

    /* renamed from: c, reason: collision with root package name */
    long f4440c;

    /* renamed from: d, reason: collision with root package name */
    long f4441d;

    /* renamed from: e, reason: collision with root package name */
    boolean f4442e;

    /* renamed from: f, reason: collision with root package name */
    String f4443f;

    public enum a {
        kDown(0),
        kUp(1),
        kRepeat(2);


        /* renamed from: e, reason: collision with root package name */
        private long f4448e;

        a(long j4) {
            this.f4448e = j4;
        }

        public long d() {
            return this.f4448e;
        }
    }

    ByteBuffer a() {
        try {
            String str = this.f4443f;
            byte[] bytes = str == null ? null : str.getBytes("UTF-8");
            int length = bytes == null ? 0 : bytes.length;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(length + 48);
            allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
            allocateDirect.putLong(length);
            allocateDirect.putLong(this.f4438a);
            allocateDirect.putLong(this.f4439b.d());
            allocateDirect.putLong(this.f4440c);
            allocateDirect.putLong(this.f4441d);
            allocateDirect.putLong(this.f4442e ? 1L : 0L);
            if (bytes != null) {
                allocateDirect.put(bytes);
            }
            return allocateDirect;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError("UTF-8 not supported");
        }
    }
}
