package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f200a = (IconCompat) aVar.v(remoteActionCompat.f200a, 1);
        remoteActionCompat.f201b = aVar.l(remoteActionCompat.f201b, 2);
        remoteActionCompat.f202c = aVar.l(remoteActionCompat.f202c, 3);
        remoteActionCompat.f203d = (PendingIntent) aVar.r(remoteActionCompat.f203d, 4);
        remoteActionCompat.f204e = aVar.h(remoteActionCompat.f204e, 5);
        remoteActionCompat.f205f = aVar.h(remoteActionCompat.f205f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f200a, 1);
        aVar.D(remoteActionCompat.f201b, 2);
        aVar.D(remoteActionCompat.f202c, 3);
        aVar.H(remoteActionCompat.f203d, 4);
        aVar.z(remoteActionCompat.f204e, 5);
        aVar.z(remoteActionCompat.f205f, 6);
    }
}
