package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes54.dex */
public class EncoderRegistry {
    private final List<Entry<?>> encoders = new ArrayList();

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        r1 = (com.bumptech.glide.load.Encoder<T>) r0.encoder;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <T> com.bumptech.glide.load.Encoder<T> getEncoder(@androidx.annotation.NonNull java.lang.Class<T> r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            java.util.List<com.bumptech.glide.provider.EncoderRegistry$Entry<?>> r1 = r3.encoders     // Catch: java.lang.Throwable -> L1f
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1f
        L7:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L1d
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L1f
            com.bumptech.glide.provider.EncoderRegistry$Entry r0 = (com.bumptech.glide.provider.EncoderRegistry.Entry) r0     // Catch: java.lang.Throwable -> L1f
            boolean r2 = r0.handles(r4)     // Catch: java.lang.Throwable -> L1f
            if (r2 == 0) goto L7
            com.bumptech.glide.load.Encoder<T> r1 = r0.encoder     // Catch: java.lang.Throwable -> L1f
        L1b:
            monitor-exit(r3)
            return r1
        L1d:
            r1 = 0
            goto L1b
        L1f:
            r1 = move-exception
            monitor-exit(r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.provider.EncoderRegistry.getEncoder(java.lang.Class):com.bumptech.glide.load.Encoder");
    }

    public synchronized <T> void append(@NonNull Class<T> dataClass, @NonNull Encoder<T> encoder) {
        this.encoders.add(new Entry<>(dataClass, encoder));
    }

    public synchronized <T> void prepend(@NonNull Class<T> dataClass, @NonNull Encoder<T> encoder) {
        this.encoders.add(0, new Entry<>(dataClass, encoder));
    }

    private static final class Entry<T> {
        private final Class<T> dataClass;
        final Encoder<T> encoder;

        Entry(@NonNull Class<T> dataClass, @NonNull Encoder<T> encoder) {
            this.dataClass = dataClass;
            this.encoder = encoder;
        }

        boolean handles(@NonNull Class<?> dataClass) {
            return this.dataClass.isAssignableFrom(dataClass);
        }
    }
}
