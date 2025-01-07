package k0;

import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/* loaded from: classes.dex */
public class b extends x.a {

    /* renamed from: e, reason: collision with root package name */
    private String f5999e;

    /* renamed from: f, reason: collision with root package name */
    private DataHolder f6000f;

    /* renamed from: g, reason: collision with root package name */
    private ParcelFileDescriptor f6001g;

    /* renamed from: h, reason: collision with root package name */
    private long f6002h;

    /* renamed from: i, reason: collision with root package name */
    private byte[] f6003i;

    /* renamed from: j, reason: collision with root package name */
    private byte[] f6004j;

    /* renamed from: k, reason: collision with root package name */
    private File f6005k;

    /* renamed from: l, reason: collision with root package name */
    private static final String f5998l = b.class.getSimpleName();
    public static final Parcelable.Creator<b> CREATOR = new o();

    public b() {
        this(null, null, null, 0L, null);
    }

    public b(String str, DataHolder dataHolder, ParcelFileDescriptor parcelFileDescriptor, long j4, byte[] bArr) {
        this.f5999e = str;
        this.f6000f = dataHolder;
        this.f6001g = parcelFileDescriptor;
        this.f6002h = j4;
        this.f6003i = bArr;
    }

    private final FileOutputStream o0() {
        Throwable th;
        File file;
        File file2 = this.f6005k;
        if (file2 == null) {
            return null;
        }
        try {
            file = File.createTempFile("xlb", ".tmp", file2);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                this.f6001g = ParcelFileDescriptor.open(file, 268435456);
                if (file != null) {
                    file.delete();
                }
                return fileOutputStream;
            } catch (IOException unused) {
                if (file != null) {
                    file.delete();
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                if (file != null) {
                    file.delete();
                }
                throw th;
            }
        } catch (IOException unused2) {
            file = null;
        } catch (Throwable th3) {
            th = th3;
            file = null;
        }
    }

    private static void p0(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException unused) {
        }
    }

    public DataHolder j0() {
        return this.f6000f;
    }

    public ParcelFileDescriptor k0() {
        return this.f6001g;
    }

    public long l0() {
        return this.f6002h;
    }

    public String m0() {
        return this.f5999e;
    }

    public byte[] n0() {
        return this.f6003i;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0035  */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void writeToParcel(android.os.Parcel r4, int r5) {
        /*
            r3 = this;
            android.os.ParcelFileDescriptor r0 = r3.f6001g
            r1 = 1
            if (r0 != 0) goto L31
            byte[] r0 = r3.f6004j
            if (r0 == 0) goto L31
            java.io.FileOutputStream r0 = r3.o0()
            if (r0 == 0) goto L31
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream
            r2.<init>(r0)
            java.io.DataOutputStream r0 = new java.io.DataOutputStream
            r0.<init>(r2)
            byte[] r2 = r3.f6004j     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            int r2 = r2.length     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.writeInt(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            byte[] r2 = r3.f6004j     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            r0.write(r2)     // Catch: java.lang.Throwable -> L29 java.io.IOException -> L2e
            p0(r0)
            r0 = 1
            goto L32
        L29:
            r4 = move-exception
            p0(r0)
            throw r4
        L2e:
            p0(r0)
        L31:
            r0 = 0
        L32:
            if (r0 != 0) goto L35
            goto L36
        L35:
            r5 = r5 | r1
        L36:
            k0.o.a(r3, r4, r5)
            r4 = 0
            r3.f6001g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.b.writeToParcel(android.os.Parcel, int):void");
    }
}
