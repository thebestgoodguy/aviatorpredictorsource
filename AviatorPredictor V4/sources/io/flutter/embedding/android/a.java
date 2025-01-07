package io.flutter.embedding.android;

import android.graphics.Matrix;
import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final Matrix f4344e = new Matrix();

    /* renamed from: a, reason: collision with root package name */
    private final p2.a f4345a;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4347c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<Integer, float[]> f4348d = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final s f4346b = s.a();

    public a(p2.a aVar, boolean z4) {
        this.f4345a = aVar;
        this.f4347c = z4;
    }

    private void a(MotionEvent motionEvent, int r23, int r24, int r25, Matrix matrix, ByteBuffer byteBuffer) {
        long j4;
        long j5;
        double d5;
        double d6;
        double d7;
        double d8;
        double d9;
        InputDevice.MotionRange motionRange;
        if (r24 == -1) {
            return;
        }
        long d10 = this.f4347c ? this.f4346b.c(motionEvent).d() : 0L;
        int d11 = d(motionEvent.getToolType(r23));
        float[] fArr = {motionEvent.getX(r23), motionEvent.getY(r23)};
        matrix.mapPoints(fArr);
        if (d11 == 1) {
            j4 = motionEvent.getButtonState() & 31;
            if (j4 == 0 && motionEvent.getSource() == 8194 && r24 == 4) {
                this.f4348d.put(Integer.valueOf(motionEvent.getPointerId(r23)), fArr);
            }
        } else {
            j4 = d11 == 2 ? (motionEvent.getButtonState() >> 4) & 15 : 0L;
        }
        boolean containsKey = this.f4348d.containsKey(Integer.valueOf(motionEvent.getPointerId(r23)));
        int r7 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        long eventTime = motionEvent.getEventTime() * 1000;
        byteBuffer.putLong(d10);
        byteBuffer.putLong(eventTime);
        if (containsKey) {
            byteBuffer.putLong(c(r24));
            j5 = 4;
        } else {
            byteBuffer.putLong(r24);
            j5 = d11;
        }
        byteBuffer.putLong(j5);
        byteBuffer.putLong(r7);
        byteBuffer.putLong(motionEvent.getPointerId(r23));
        byteBuffer.putLong(0L);
        if (containsKey) {
            float[] fArr2 = this.f4348d.get(Integer.valueOf(motionEvent.getPointerId(r23)));
            byteBuffer.putDouble(fArr2[0]);
            byteBuffer.putDouble(fArr2[1]);
        } else {
            byteBuffer.putDouble(fArr[0]);
            byteBuffer.putDouble(fArr[1]);
        }
        byteBuffer.putDouble(0.0d);
        byteBuffer.putDouble(0.0d);
        byteBuffer.putLong(j4);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble(motionEvent.getPressure(r23));
        if (motionEvent.getDevice() == null || (motionRange = motionEvent.getDevice().getMotionRange(2)) == null) {
            d5 = 1.0d;
            d6 = 0.0d;
        } else {
            d6 = motionRange.getMin();
            d5 = motionRange.getMax();
        }
        byteBuffer.putDouble(d6);
        byteBuffer.putDouble(d5);
        if (d11 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(24, r23));
            d7 = 0.0d;
        } else {
            d7 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(motionEvent.getSize(r23));
        byteBuffer.putDouble(motionEvent.getToolMajor(r23));
        byteBuffer.putDouble(motionEvent.getToolMinor(r23));
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(d7);
        byteBuffer.putDouble(motionEvent.getAxisValue(8, r23));
        if (d11 == 2) {
            byteBuffer.putDouble(motionEvent.getAxisValue(25, r23));
        } else {
            byteBuffer.putDouble(d7);
        }
        byteBuffer.putLong(r25);
        if (r7 == 1) {
            byteBuffer.putDouble(-motionEvent.getAxisValue(10));
            d8 = -motionEvent.getAxisValue(9);
        } else {
            d8 = 0.0d;
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d8);
        if (containsKey) {
            float[] fArr3 = this.f4348d.get(Integer.valueOf(motionEvent.getPointerId(r23)));
            byteBuffer.putDouble(fArr[0] - fArr3[0]);
            byteBuffer.putDouble(fArr[1] - fArr3[1]);
            d9 = 0.0d;
        } else {
            d9 = 0.0d;
            byteBuffer.putDouble(0.0d);
            byteBuffer.putDouble(0.0d);
        }
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(d9);
        byteBuffer.putDouble(1.0d);
        byteBuffer.putDouble(d9);
        if (containsKey && c(r24) == 9) {
            this.f4348d.remove(Integer.valueOf(motionEvent.getPointerId(r23)));
        }
    }

    private int b(int r4) {
        if (r4 == 0) {
            return 4;
        }
        if (r4 == 1) {
            return 6;
        }
        if (r4 == 5) {
            return 4;
        }
        if (r4 == 6) {
            return 6;
        }
        if (r4 == 2) {
            return 5;
        }
        if (r4 == 7) {
            return 3;
        }
        if (r4 == 3) {
            return 0;
        }
        if (r4 == 8) {
            return 3;
        }
        throw new AssertionError("Unexpected masked action");
    }

    private int c(int r22) {
        if (r22 == 4) {
            return 7;
        }
        if (r22 == 5) {
            return 8;
        }
        if (r22 == 6 || r22 == 0) {
            return 9;
        }
        throw new AssertionError("Unexpected pointer change");
    }

    private int d(int r32) {
        if (r32 == 1) {
            return 0;
        }
        if (r32 == 2) {
            return 2;
        }
        if (r32 != 3) {
            return r32 != 4 ? 5 : 3;
        }
        return 1;
    }

    public boolean e(MotionEvent motionEvent) {
        boolean z4 = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean z5 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (!z4 || !z5) {
            return false;
        }
        int b5 = b(motionEvent.getActionMasked());
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(motionEvent.getPointerCount() * 35 * 8);
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        a(motionEvent, motionEvent.getActionIndex(), b5, 0, f4344e, allocateDirect);
        if (allocateDirect.position() % 280 != 0) {
            throw new AssertionError("Packet position is not on field boundary.");
        }
        this.f4345a.i(allocateDirect, allocateDirect.position());
        return true;
    }

    public boolean f(MotionEvent motionEvent) {
        return g(motionEvent, f4344e);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean g(android.view.MotionEvent r13, android.graphics.Matrix r14) {
        /*
            r12 = this;
            int r0 = r13.getPointerCount()
            int r1 = r0 * 35
            int r1 = r1 * 8
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r1)
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN
            r1.order(r2)
            int r2 = r13.getActionMasked()
            int r3 = r13.getActionMasked()
            int r9 = r12.b(r3)
            r3 = 0
            r10 = 1
            if (r2 == 0) goto L27
            r4 = 5
            if (r2 != r4) goto L25
            goto L27
        L25:
            r4 = 0
            goto L28
        L27:
            r4 = 1
        L28:
            if (r4 != 0) goto L31
            if (r2 == r10) goto L2f
            r5 = 6
            if (r2 != r5) goto L31
        L2f:
            r2 = 1
            goto L32
        L31:
            r2 = 0
        L32:
            if (r4 == 0) goto L42
        L34:
            int r4 = r13.getActionIndex()
            r6 = 0
            r2 = r12
            r3 = r13
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L6f
        L42:
            r11 = 0
            if (r2 == 0) goto L60
        L45:
            if (r11 >= r0) goto L34
            int r2 = r13.getActionIndex()
            if (r11 == r2) goto L5d
            int r2 = r13.getToolType(r11)
            if (r2 != r10) goto L5d
            r5 = 5
            r6 = 1
            r2 = r12
            r3 = r13
            r4 = r11
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
        L5d:
            int r11 = r11 + 1
            goto L45
        L60:
            if (r11 >= r0) goto L6f
            r6 = 0
            r2 = r12
            r3 = r13
            r4 = r11
            r5 = r9
            r7 = r14
            r8 = r1
            r2.a(r3, r4, r5, r6, r7, r8)
            int r11 = r11 + 1
            goto L60
        L6f:
            int r13 = r1.position()
            int r13 = r13 % 280
            if (r13 != 0) goto L81
            p2.a r13 = r12.f4345a
            int r14 = r1.position()
            r13.i(r1, r14)
            return r10
        L81:
            java.lang.AssertionError r13 = new java.lang.AssertionError
            java.lang.String r14 = "Packet position is not on field boundary"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: io.flutter.embedding.android.a.g(android.view.MotionEvent, android.graphics.Matrix):boolean");
    }
}
