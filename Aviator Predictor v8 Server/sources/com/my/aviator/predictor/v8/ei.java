package com.my.aviator.predictor.v8;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* loaded from: classes62.dex */
class ei extends Thread {
    ei() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean z;
        boolean z2;
        eh.b = true;
        try {
            Runtime.getRuntime().exec("logcat -c");
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Runtime.getRuntime().exec("logcat").getInputStream()));
                try {
                    String readLine = bufferedReader.readLine();
                    do {
                        eh.a(readLine);
                        z = eh.b;
                        if (!z) {
                            break;
                        } else {
                            readLine = bufferedReader.readLine();
                        }
                    } while (readLine != null);
                    z2 = eh.b;
                    if (z2) {
                        eh.a("Logger got killed. Restarting.");
                        eh.a();
                    } else {
                        eh.a("Logger stopped.");
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    bufferedReader.close();
                    throw th;
                }
            } finally {
            }
        } catch (Exception e) {
            eh.a(e.toString());
        }
    }
}
