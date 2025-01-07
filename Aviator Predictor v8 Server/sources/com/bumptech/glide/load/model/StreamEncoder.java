package com.bumptech.glide.load.model;

import android.util.Log;
import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* loaded from: classes54.dex */
public class StreamEncoder implements Encoder<InputStream> {
    private static final String TAG = "StreamEncoder";
    private final ArrayPool byteArrayPool;

    public StreamEncoder(ArrayPool byteArrayPool) {
        this.byteArrayPool = byteArrayPool;
    }

    @Override // com.bumptech.glide.load.Encoder
    public boolean encode(@NonNull InputStream data, @NonNull File file, @NonNull Options options) {
        byte[] buffer = (byte[]) this.byteArrayPool.get(65536, byte[].class);
        boolean success = false;
        OutputStream os = null;
        try {
            try {
                OutputStream os2 = new FileOutputStream(file);
                while (true) {
                    try {
                        int read = data.read(buffer);
                        if (read == -1) {
                            break;
                        }
                        os2.write(buffer, 0, read);
                    } catch (IOException e) {
                        e = e;
                        os = os2;
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Failed to encode data onto the OutputStream", e);
                        }
                        if (os != null) {
                            try {
                                os.close();
                            } catch (IOException e2) {
                            }
                        }
                        this.byteArrayPool.put(buffer);
                        return success;
                    } catch (Throwable th) {
                        th = th;
                        os = os2;
                        if (os != null) {
                            try {
                                os.close();
                            } catch (IOException e3) {
                            }
                        }
                        this.byteArrayPool.put(buffer);
                        throw th;
                    }
                }
                os2.close();
                success = true;
                if (os2 != null) {
                    try {
                        os2.close();
                    } catch (IOException e4) {
                    }
                }
                this.byteArrayPool.put(buffer);
            } catch (IOException e5) {
                e = e5;
            }
            return success;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
