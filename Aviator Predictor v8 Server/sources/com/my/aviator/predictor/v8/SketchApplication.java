package com.my.aviator.predictor.v8;

import android.app.Application;
import android.content.Context;
import java.lang.Thread;

/* loaded from: classes62.dex */
public class SketchApplication extends Application {
    private static Context a;
    private Thread.UncaughtExceptionHandler b;

    public static Context a() {
        return a;
    }

    @Override // android.app.Application
    public void onCreate() {
        a = getApplicationContext();
        this.b = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new eg(this));
        eh.a();
        super.onCreate();
    }
}
