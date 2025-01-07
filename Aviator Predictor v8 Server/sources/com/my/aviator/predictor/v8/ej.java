package com.my.aviator.predictor.v8;

import android.content.Context;
import android.widget.Toast;
import java.util.Random;

/* loaded from: classes62.dex */
public class ej {
    public static int a = 1;
    public static int b = 2;
    public static int c = 3;

    public static int a(int r1, int r2) {
        return new Random().nextInt((r2 - r1) + 1) + r1;
    }

    public static void a(Context context, String str) {
        Toast.makeText(context, str, 0).show();
    }
}
