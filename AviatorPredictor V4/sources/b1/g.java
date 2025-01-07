package b1;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class g<T> {

    /* renamed from: a, reason: collision with root package name */
    private final T f640a;

    /* renamed from: b, reason: collision with root package name */
    private final c<T> f641b;

    private static class b implements c<Context> {

        /* renamed from: a, reason: collision with root package name */
        private final Class<? extends Service> f642a;

        private b(Class<? extends Service> cls) {
            this.f642a = cls;
        }

        private Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, this.f642a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f642a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // b1.g.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public List<String> a(Context context) {
            Bundle b5 = b(context);
            if (b5 == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : b5.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(b5.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    interface c<T> {
        List<String> a(T t4);
    }

    g(T t4, c<T> cVar) {
        this.f640a = t4;
        this.f641b = cVar;
    }

    public static g<Context> c(Context context, Class<? extends Service> cls) {
        return new g<>(context, new b(cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (i.class.isAssignableFrom(cls)) {
                return (i) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            }
            throw new v(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e5) {
            throw new v(String.format("Could not instantiate %s.", str), e5);
        } catch (InstantiationException e6) {
            throw new v(String.format("Could not instantiate %s.", str), e6);
        } catch (NoSuchMethodException e7) {
            throw new v(String.format("Could not instantiate %s", str), e7);
        } catch (InvocationTargetException e8) {
            throw new v(String.format("Could not instantiate %s", str), e8);
        }
    }

    public List<r1.b<i>> b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f641b.a(this.f640a)) {
            arrayList.add(new r1.b() { // from class: b1.f
                @Override // r1.b
                public final Object get() {
                    i d5;
                    d5 = g.d(str);
                    return d5;
                }
            });
        }
        return arrayList;
    }
}
