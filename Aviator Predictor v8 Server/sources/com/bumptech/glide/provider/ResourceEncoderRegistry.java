package com.bumptech.glide.provider;

import androidx.annotation.NonNull;
import com.bumptech.glide.load.ResourceEncoder;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes54.dex */
public class ResourceEncoderRegistry {
    private final List<Entry<?>> encoders = new ArrayList();

    public synchronized <Z> void append(@NonNull Class<Z> resourceClass, @NonNull ResourceEncoder<Z> encoder) {
        this.encoders.add(new Entry<>(resourceClass, encoder));
    }

    public synchronized <Z> void prepend(@NonNull Class<Z> resourceClass, @NonNull ResourceEncoder<Z> encoder) {
        this.encoders.add(0, new Entry<>(resourceClass, encoder));
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r3 = (com.bumptech.glide.load.ResourceEncoder<Z>) r0.encoder;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized <Z> com.bumptech.glide.load.ResourceEncoder<Z> get(@androidx.annotation.NonNull java.lang.Class<Z> r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r1 = 0
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r3 = r4.encoders     // Catch: java.lang.Throwable -> L21
            int r2 = r3.size()     // Catch: java.lang.Throwable -> L21
        L8:
            if (r1 >= r2) goto L1f
            java.util.List<com.bumptech.glide.provider.ResourceEncoderRegistry$Entry<?>> r3 = r4.encoders     // Catch: java.lang.Throwable -> L21
            java.lang.Object r0 = r3.get(r1)     // Catch: java.lang.Throwable -> L21
            com.bumptech.glide.provider.ResourceEncoderRegistry$Entry r0 = (com.bumptech.glide.provider.ResourceEncoderRegistry.Entry) r0     // Catch: java.lang.Throwable -> L21
            boolean r3 = r0.handles(r5)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L1c
            com.bumptech.glide.load.ResourceEncoder<T> r3 = r0.encoder     // Catch: java.lang.Throwable -> L21
        L1a:
            monitor-exit(r4)
            return r3
        L1c:
            int r1 = r1 + 1
            goto L8
        L1f:
            r3 = 0
            goto L1a
        L21:
            r3 = move-exception
            monitor-exit(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.provider.ResourceEncoderRegistry.get(java.lang.Class):com.bumptech.glide.load.ResourceEncoder");
    }

    private static final class Entry<T> {
        final ResourceEncoder<T> encoder;
        private final Class<T> resourceClass;

        Entry(@NonNull Class<T> resourceClass, @NonNull ResourceEncoder<T> encoder) {
            this.resourceClass = resourceClass;
            this.encoder = encoder;
        }

        boolean handles(@NonNull Class<?> resourceClass) {
            return this.resourceClass.isAssignableFrom(resourceClass);
        }
    }
}
