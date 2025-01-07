package com.my.aviator.predictor.v8;

import android.content.Context;
import android.content.Intent;

/* loaded from: classes62.dex */
public class eh {
    private static Thread a = new ei();
    private static volatile boolean b = false;

    public static void a() {
        if (b) {
            throw new IllegalStateException("Logger already running");
        }
        a.start();
    }

    public static void a(String str) {
        Context a2 = SketchApplication.a();
        Intent intent = new Intent();
        intent.setAction("com.sketchware.remod.ACTION_NEW_DEBUG_LOG");
        intent.putExtra("log", str);
        intent.putExtra("packageName", a2.getPackageName());
        a2.sendBroadcast(intent);
    }
}
