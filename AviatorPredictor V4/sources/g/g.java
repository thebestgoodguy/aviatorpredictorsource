package g;

import android.app.Notification;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import androidx.core.graphics.drawable.IconCompat;
import g.e;
import java.lang.reflect.Field;
import java.util.List;

/* loaded from: classes.dex */
class g {

    /* renamed from: b, reason: collision with root package name */
    private static Field f3852b;

    /* renamed from: c, reason: collision with root package name */
    private static boolean f3853c;

    /* renamed from: a, reason: collision with root package name */
    private static final Object f3851a = new Object();

    /* renamed from: d, reason: collision with root package name */
    private static final Object f3854d = new Object();

    public static SparseArray<Bundle> a(List<Bundle> list) {
        int size = list.size();
        SparseArray<Bundle> sparseArray = null;
        for (int r22 = 0; r22 < size; r22++) {
            Bundle bundle = list.get(r22);
            if (bundle != null) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                sparseArray.put(r22, bundle);
            }
        }
        return sparseArray;
    }

    static Bundle b(e.a aVar) {
        Bundle bundle = new Bundle();
        IconCompat e5 = aVar.e();
        bundle.putInt("icon", e5 != null ? e5.c() : 0);
        bundle.putCharSequence("title", aVar.i());
        bundle.putParcelable("actionIntent", aVar.a());
        Bundle bundle2 = aVar.d() != null ? new Bundle(aVar.d()) : new Bundle();
        bundle2.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        bundle.putBundle("extras", bundle2);
        bundle.putParcelableArray("remoteInputs", e(aVar.f()));
        bundle.putBoolean("showsUserInterface", aVar.h());
        bundle.putInt("semanticAction", aVar.g());
        return bundle;
    }

    public static Bundle c(Notification notification) {
        String str;
        String str2;
        synchronized (f3851a) {
            if (f3853c) {
                return null;
            }
            try {
                if (f3852b == null) {
                    Field declaredField = Notification.class.getDeclaredField("extras");
                    if (!Bundle.class.isAssignableFrom(declaredField.getType())) {
                        Log.e("NotificationCompat", "Notification.extras field is not of type Bundle");
                        f3853c = true;
                        return null;
                    }
                    declaredField.setAccessible(true);
                    f3852b = declaredField;
                }
                Bundle bundle = (Bundle) f3852b.get(notification);
                if (bundle == null) {
                    bundle = new Bundle();
                    f3852b.set(notification, bundle);
                }
                return bundle;
            } catch (IllegalAccessException e5) {
                e = e5;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f3853c = true;
                return null;
            } catch (NoSuchFieldException e6) {
                e = e6;
                str = "NotificationCompat";
                str2 = "Unable to access notification extras";
                Log.e(str, str2, e);
                f3853c = true;
                return null;
            }
        }
    }

    private static Bundle d(i iVar) {
        new Bundle();
        throw null;
    }

    private static Bundle[] e(i[] iVarArr) {
        if (iVarArr == null) {
            return null;
        }
        Bundle[] bundleArr = new Bundle[iVarArr.length];
        for (int r12 = 0; r12 < iVarArr.length; r12++) {
            bundleArr[r12] = d(iVarArr[r12]);
        }
        return bundleArr;
    }

    public static Bundle f(Notification.Builder builder, e.a aVar) {
        IconCompat e5 = aVar.e();
        builder.addAction(e5 != null ? e5.c() : 0, aVar.i(), aVar.a());
        Bundle bundle = new Bundle(aVar.d());
        if (aVar.f() != null) {
            bundle.putParcelableArray("android.support.remoteInputs", e(aVar.f()));
        }
        if (aVar.c() != null) {
            bundle.putParcelableArray("android.support.dataRemoteInputs", e(aVar.c()));
        }
        bundle.putBoolean("android.support.allowGeneratedReplies", aVar.b());
        return bundle;
    }
}
