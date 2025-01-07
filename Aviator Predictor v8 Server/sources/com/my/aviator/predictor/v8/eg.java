package com.my.aviator.predictor.v8;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Process;
import android.util.Log;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import java.lang.Thread;

/* loaded from: classes62.dex */
class eg implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ SketchApplication a;

    eg(SketchApplication sketchApplication) {
        this.a = sketchApplication;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler;
        Intent intent = new Intent(this.a.getApplicationContext(), (Class<?>) DebugActivity.class);
        intent.setFlags(32768);
        intent.putExtra("error", Log.getStackTraceString(th));
        ((AlarmManager) this.a.getSystemService(NotificationCompat.CATEGORY_ALARM)).set(2, 1000L, PendingIntent.getActivity(this.a.getApplicationContext(), 11111, intent, BasicMeasure.EXACTLY));
        eh.a(Log.getStackTraceString(th));
        Process.killProcess(Process.myPid());
        System.exit(1);
        uncaughtExceptionHandler = this.a.b;
        uncaughtExceptionHandler.uncaughtException(thread, th);
    }
}
