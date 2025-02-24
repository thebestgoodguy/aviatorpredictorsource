package com.bumptech.glide.module;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

@Deprecated
/* loaded from: classes54.dex */
public final class ManifestParser {
    private static final String GLIDE_MODULE_VALUE = "GlideModule";
    private static final String TAG = "ManifestParser";
    private final Context context;

    public ManifestParser(Context context) {
        this.context = context;
    }

    public List<GlideModule> parse() {
        if (Log.isLoggable(TAG, 3)) {
            Log.d(TAG, "Loading Glide modules");
        }
        List<GlideModule> modules = new ArrayList<>();
        try {
            ApplicationInfo appInfo = this.context.getPackageManager().getApplicationInfo(this.context.getPackageName(), 128);
            if (appInfo.metaData == null) {
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Got null app info metadata");
                }
            } else {
                if (Log.isLoggable(TAG, 2)) {
                    Log.v(TAG, "Got app info metadata: " + appInfo.metaData);
                }
                for (String key : appInfo.metaData.keySet()) {
                    if (GLIDE_MODULE_VALUE.equals(appInfo.metaData.get(key))) {
                        modules.add(parseModule(key));
                        if (Log.isLoggable(TAG, 3)) {
                            Log.d(TAG, "Loaded Glide module: " + key);
                        }
                    }
                }
                if (Log.isLoggable(TAG, 3)) {
                    Log.d(TAG, "Finished loading Glide modules");
                }
            }
            return modules;
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("Unable to find metadata to parse GlideModules", e);
        }
    }

    private static GlideModule parseModule(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            Object module = null;
            try {
                module = clazz.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (IllegalAccessException e) {
                throwInstantiateGlideModuleException(clazz, e);
            } catch (InstantiationException e2) {
                throwInstantiateGlideModuleException(clazz, e2);
            } catch (NoSuchMethodException e3) {
                throwInstantiateGlideModuleException(clazz, e3);
            } catch (InvocationTargetException e4) {
                throwInstantiateGlideModuleException(clazz, e4);
            }
            if (!(module instanceof GlideModule)) {
                throw new RuntimeException("Expected instanceof GlideModule, but found: " + module);
            }
            return (GlideModule) module;
        } catch (ClassNotFoundException e5) {
            throw new IllegalArgumentException("Unable to find GlideModule implementation", e5);
        }
    }

    private static void throwInstantiateGlideModuleException(Class<?> clazz, Exception e) {
        throw new RuntimeException("Unable to instantiate GlideModule implementation for " + clazz, e);
    }
}
