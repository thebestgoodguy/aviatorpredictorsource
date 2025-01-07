package com.bumptech.glide.load.engine;

import android.os.Process;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.load.engine.EngineResource;
import com.bumptech.glide.util.Preconditions;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* loaded from: classes54.dex */
final class ActiveResources {

    @VisibleForTesting
    final Map<Key, ResourceWeakReference> activeEngineResources;

    @Nullable
    private volatile DequeuedResourceCallback cb;
    private final boolean isActiveResourceRetentionAllowed;
    private volatile boolean isShutdown;
    private EngineResource.ResourceListener listener;
    private final Executor monitorClearedResourcesExecutor;
    private final ReferenceQueue<EngineResource<?>> resourceReferenceQueue;

    @VisibleForTesting
    interface DequeuedResourceCallback {
        void onResourceDequeued();
    }

    ActiveResources(boolean isActiveResourceRetentionAllowed) {
        this(isActiveResourceRetentionAllowed, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: com.bumptech.glide.load.engine.ActiveResources.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@NonNull final Runnable r) {
                return new Thread(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        Process.setThreadPriority(10);
                        r.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    @VisibleForTesting
    ActiveResources(boolean isActiveResourceRetentionAllowed, Executor monitorClearedResourcesExecutor) {
        this.activeEngineResources = new HashMap();
        this.resourceReferenceQueue = new ReferenceQueue<>();
        this.isActiveResourceRetentionAllowed = isActiveResourceRetentionAllowed;
        this.monitorClearedResourcesExecutor = monitorClearedResourcesExecutor;
        monitorClearedResourcesExecutor.execute(new Runnable() { // from class: com.bumptech.glide.load.engine.ActiveResources.2
            @Override // java.lang.Runnable
            public void run() {
                ActiveResources.this.cleanReferenceQueue();
            }
        });
    }

    void setListener(EngineResource.ResourceListener listener) {
        synchronized (listener) {
            synchronized (this) {
                this.listener = listener;
            }
        }
    }

    synchronized void activate(Key key, EngineResource<?> resource) {
        ResourceWeakReference toPut = new ResourceWeakReference(key, resource, this.resourceReferenceQueue, this.isActiveResourceRetentionAllowed);
        ResourceWeakReference removed = this.activeEngineResources.put(key, toPut);
        if (removed != null) {
            removed.reset();
        }
    }

    synchronized void deactivate(Key key) {
        ResourceWeakReference removed = this.activeEngineResources.remove(key);
        if (removed != null) {
            removed.reset();
        }
    }

    @Nullable
    synchronized EngineResource<?> get(Key key) {
        EngineResource<?> active;
        ResourceWeakReference activeRef = this.activeEngineResources.get(key);
        if (activeRef == null) {
            active = null;
        } else {
            active = (EngineResource) activeRef.get();
            if (active == null) {
                cleanupActiveReference(activeRef);
            }
        }
        return active;
    }

    void cleanupActiveReference(@NonNull ResourceWeakReference ref) {
        synchronized (this) {
            this.activeEngineResources.remove(ref.key);
            if (ref.isCacheable && ref.resource != null) {
                EngineResource<?> newResource = new EngineResource<>(ref.resource, true, false, ref.key, this.listener);
                this.listener.onResourceReleased(ref.key, newResource);
            }
        }
    }

    void cleanReferenceQueue() {
        while (!this.isShutdown) {
            try {
                ResourceWeakReference ref = (ResourceWeakReference) this.resourceReferenceQueue.remove();
                cleanupActiveReference(ref);
                DequeuedResourceCallback current = this.cb;
                if (current != null) {
                    current.onResourceDequeued();
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @VisibleForTesting
    void setDequeuedResourceCallback(DequeuedResourceCallback cb) {
        this.cb = cb;
    }

    @VisibleForTesting
    void shutdown() {
        this.isShutdown = true;
        if (this.monitorClearedResourcesExecutor instanceof ExecutorService) {
            ExecutorService service = (ExecutorService) this.monitorClearedResourcesExecutor;
            com.bumptech.glide.util.Executors.shutdownAndAwaitTermination(service);
        }
    }

    @VisibleForTesting
    static final class ResourceWeakReference extends WeakReference<EngineResource<?>> {
        final boolean isCacheable;
        final Key key;

        @Nullable
        Resource<?> resource;

        ResourceWeakReference(@NonNull Key key, @NonNull EngineResource<?> referent, @NonNull ReferenceQueue<? super EngineResource<?>> queue, boolean isActiveResourceRetentionAllowed) {
            super(referent, queue);
            Resource<?> resource;
            this.key = (Key) Preconditions.checkNotNull(key);
            if (referent.isMemoryCacheable() && isActiveResourceRetentionAllowed) {
                resource = (Resource) Preconditions.checkNotNull(referent.getResource());
            } else {
                resource = null;
            }
            this.resource = resource;
            this.isCacheable = referent.isMemoryCacheable();
        }

        void reset() {
            this.resource = null;
            clear();
        }
    }
}
