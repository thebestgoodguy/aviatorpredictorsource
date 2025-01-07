package r2;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import x1.x;

/* loaded from: classes.dex */
public class p implements h<Object> {

    /* renamed from: a, reason: collision with root package name */
    public static final p f7467a = new p();

    /* renamed from: b, reason: collision with root package name */
    private static final boolean f7468b;

    /* renamed from: c, reason: collision with root package name */
    private static final Charset f7469c;

    static final class a extends ByteArrayOutputStream {
        a() {
        }

        byte[] a() {
            return ((ByteArrayOutputStream) this).buf;
        }
    }

    static {
        f7468b = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        f7469c = Charset.forName("UTF8");
    }

    protected static final void c(ByteBuffer byteBuffer, int r32) {
        int position = byteBuffer.position() % r32;
        if (position != 0) {
            byteBuffer.position((byteBuffer.position() + r32) - position);
        }
    }

    protected static final byte[] d(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[e(byteBuffer)];
        byteBuffer.get(bArr);
        return bArr;
    }

    protected static final int e(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        int r02 = byteBuffer.get() & 255;
        return r02 < 254 ? r02 : r02 == 254 ? byteBuffer.getChar() : byteBuffer.getInt();
    }

    protected static final void h(ByteArrayOutputStream byteArrayOutputStream, int r5) {
        int size = byteArrayOutputStream.size() % r5;
        if (size != 0) {
            for (int r22 = 0; r22 < r5 - size; r22++) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected static final void i(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr) {
        o(byteArrayOutputStream, bArr.length);
        byteArrayOutputStream.write(bArr, 0, bArr.length);
    }

    protected static final void j(ByteArrayOutputStream byteArrayOutputStream, int r22) {
        if (f7468b) {
            byteArrayOutputStream.write(r22);
            r22 >>>= 8;
        } else {
            byteArrayOutputStream.write(r22 >>> 8);
        }
        byteArrayOutputStream.write(r22);
    }

    protected static final void k(ByteArrayOutputStream byteArrayOutputStream, double d5) {
        n(byteArrayOutputStream, Double.doubleToLongBits(d5));
    }

    protected static final void l(ByteArrayOutputStream byteArrayOutputStream, float f5) {
        m(byteArrayOutputStream, Float.floatToIntBits(f5));
    }

    protected static final void m(ByteArrayOutputStream byteArrayOutputStream, int r22) {
        if (f7468b) {
            byteArrayOutputStream.write(r22);
            byteArrayOutputStream.write(r22 >>> 8);
            byteArrayOutputStream.write(r22 >>> 16);
            r22 >>>= 24;
        } else {
            byteArrayOutputStream.write(r22 >>> 24);
            byteArrayOutputStream.write(r22 >>> 16);
            byteArrayOutputStream.write(r22 >>> 8);
        }
        byteArrayOutputStream.write(r22);
    }

    protected static final void n(ByteArrayOutputStream byteArrayOutputStream, long j4) {
        if (f7468b) {
            byteArrayOutputStream.write((byte) j4);
            byteArrayOutputStream.write((byte) (j4 >>> 8));
            byteArrayOutputStream.write((byte) (j4 >>> 16));
            byteArrayOutputStream.write((byte) (j4 >>> 24));
            byteArrayOutputStream.write((byte) (j4 >>> 32));
            byteArrayOutputStream.write((byte) (j4 >>> 40));
            byteArrayOutputStream.write((byte) (j4 >>> 48));
            j4 >>>= 56;
        } else {
            byteArrayOutputStream.write((byte) (j4 >>> 56));
            byteArrayOutputStream.write((byte) (j4 >>> 48));
            byteArrayOutputStream.write((byte) (j4 >>> 40));
            byteArrayOutputStream.write((byte) (j4 >>> 32));
            byteArrayOutputStream.write((byte) (j4 >>> 24));
            byteArrayOutputStream.write((byte) (j4 >>> 16));
            byteArrayOutputStream.write((byte) (j4 >>> 8));
        }
        byteArrayOutputStream.write((byte) j4);
    }

    protected static final void o(ByteArrayOutputStream byteArrayOutputStream, int r32) {
        if (r32 < 254) {
            byteArrayOutputStream.write(r32);
        } else if (r32 <= 65535) {
            byteArrayOutputStream.write(254);
            j(byteArrayOutputStream, r32);
        } else {
            byteArrayOutputStream.write(255);
            m(byteArrayOutputStream, r32);
        }
    }

    @Override // r2.h
    public Object a(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object f5 = f(byteBuffer);
        if (byteBuffer.hasRemaining()) {
            throw new IllegalArgumentException("Message corrupted");
        }
        return f5;
    }

    @Override // r2.h
    public ByteBuffer b(Object obj) {
        if (obj == null) {
            return null;
        }
        a aVar = new a();
        p(aVar, obj);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(aVar.size());
        allocateDirect.put(aVar.a(), 0, aVar.size());
        return allocateDirect;
    }

    protected final Object f(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return g(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.util.HashMap, java.util.Map] */
    protected Object g(byte b5, ByteBuffer byteBuffer) {
        int e5;
        int e6;
        long[] jArr;
        Object arrayList;
        int[] r02;
        int r03 = 0;
        switch (b5) {
            case 0:
                return null;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                return Integer.valueOf(byteBuffer.getInt());
            case 4:
                return Long.valueOf(byteBuffer.getLong());
            case 5:
                return new BigInteger(new String(d(byteBuffer), f7469c), 16);
            case 6:
                c(byteBuffer, 8);
                return Double.valueOf(byteBuffer.getDouble());
            case 7:
                return new String(d(byteBuffer), f7469c);
            case 8:
                return d(byteBuffer);
            case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                e5 = e(byteBuffer);
                int[] r04 = new int[e5];
                c(byteBuffer, 4);
                byteBuffer.asIntBuffer().get(r04);
                r02 = r04;
                byteBuffer.position(byteBuffer.position() + (e5 * 4));
                return r02;
            case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                e6 = e(byteBuffer);
                long[] jArr2 = new long[e6];
                c(byteBuffer, 8);
                byteBuffer.asLongBuffer().get(jArr2);
                jArr = jArr2;
                byteBuffer.position(byteBuffer.position() + (e6 * 8));
                return jArr;
            case 11:
                e6 = e(byteBuffer);
                double[] dArr = new double[e6];
                c(byteBuffer, 8);
                byteBuffer.asDoubleBuffer().get(dArr);
                jArr = dArr;
                byteBuffer.position(byteBuffer.position() + (e6 * 8));
                return jArr;
            case 12:
                int e7 = e(byteBuffer);
                arrayList = new ArrayList(e7);
                while (r03 < e7) {
                    arrayList.add(f(byteBuffer));
                    r03++;
                }
                return arrayList;
            case 13:
                int e8 = e(byteBuffer);
                arrayList = new HashMap();
                while (r03 < e8) {
                    arrayList.put(f(byteBuffer), f(byteBuffer));
                    r03++;
                }
                return arrayList;
            case 14:
                e5 = e(byteBuffer);
                float[] fArr = new float[e5];
                c(byteBuffer, 4);
                byteBuffer.asFloatBuffer().get(fArr);
                r02 = fArr;
                byteBuffer.position(byteBuffer.position() + (e5 * 4));
                return r02;
            default:
                throw new IllegalArgumentException("Message corrupted");
        }
    }

    protected void p(ByteArrayOutputStream byteArrayOutputStream, Object obj) {
        int r02 = 0;
        if (obj == null || obj.equals(null)) {
            byteArrayOutputStream.write(0);
            return;
        }
        if (obj instanceof Boolean) {
            byteArrayOutputStream.write(((Boolean) obj).booleanValue() ? 1 : 2);
            return;
        }
        if (obj instanceof Number) {
            if ((obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) {
                byteArrayOutputStream.write(3);
                m(byteArrayOutputStream, ((Number) obj).intValue());
                return;
            }
            if (obj instanceof Long) {
                byteArrayOutputStream.write(4);
                n(byteArrayOutputStream, ((Long) obj).longValue());
                return;
            }
            if ((obj instanceof Float) || (obj instanceof Double)) {
                byteArrayOutputStream.write(6);
                h(byteArrayOutputStream, 8);
                k(byteArrayOutputStream, ((Number) obj).doubleValue());
                return;
            } else {
                if (!(obj instanceof BigInteger)) {
                    throw new IllegalArgumentException("Unsupported Number type: " + obj.getClass());
                }
                byteArrayOutputStream.write(5);
                i(byteArrayOutputStream, ((BigInteger) obj).toString(16).getBytes(f7469c));
                return;
            }
        }
        if (obj instanceof CharSequence) {
            byteArrayOutputStream.write(7);
            i(byteArrayOutputStream, obj.toString().getBytes(f7469c));
            return;
        }
        if (obj instanceof byte[]) {
            byteArrayOutputStream.write(8);
            i(byteArrayOutputStream, (byte[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            byteArrayOutputStream.write(9);
            int[] r6 = (int[]) obj;
            o(byteArrayOutputStream, r6.length);
            h(byteArrayOutputStream, 4);
            int length = r6.length;
            while (r02 < length) {
                m(byteArrayOutputStream, r6[r02]);
                r02++;
            }
            return;
        }
        if (obj instanceof long[]) {
            byteArrayOutputStream.write(10);
            long[] jArr = (long[]) obj;
            o(byteArrayOutputStream, jArr.length);
            h(byteArrayOutputStream, 8);
            int length2 = jArr.length;
            while (r02 < length2) {
                n(byteArrayOutputStream, jArr[r02]);
                r02++;
            }
            return;
        }
        if (obj instanceof double[]) {
            byteArrayOutputStream.write(11);
            double[] dArr = (double[]) obj;
            o(byteArrayOutputStream, dArr.length);
            h(byteArrayOutputStream, 8);
            int length3 = dArr.length;
            while (r02 < length3) {
                k(byteArrayOutputStream, dArr[r02]);
                r02++;
            }
            return;
        }
        if (obj instanceof List) {
            byteArrayOutputStream.write(12);
            List list = (List) obj;
            o(byteArrayOutputStream, list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                p(byteArrayOutputStream, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            byteArrayOutputStream.write(13);
            Map map = (Map) obj;
            o(byteArrayOutputStream, map.size());
            for (Map.Entry entry : map.entrySet()) {
                p(byteArrayOutputStream, entry.getKey());
                p(byteArrayOutputStream, entry.getValue());
            }
            return;
        }
        if (!(obj instanceof float[])) {
            throw new IllegalArgumentException("Unsupported value: '" + obj + "' of type '" + obj.getClass() + "'");
        }
        byteArrayOutputStream.write(14);
        float[] fArr = (float[]) obj;
        o(byteArrayOutputStream, fArr.length);
        h(byteArrayOutputStream, 4);
        int length4 = fArr.length;
        while (r02 < length4) {
            l(byteArrayOutputStream, fArr[r02]);
            r02++;
        }
    }
}
