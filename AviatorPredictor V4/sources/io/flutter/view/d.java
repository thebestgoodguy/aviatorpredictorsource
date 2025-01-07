package io.flutter.view;

import android.graphics.SurfaceTexture;

/* loaded from: classes.dex */
public interface d {

    public interface a {
        void a();
    }

    public interface b {
        void onTrimMemory(int r12);
    }

    public interface c {
        long a();

        void b(b bVar);

        void c(a aVar);

        SurfaceTexture d();
    }

    c a();
}
