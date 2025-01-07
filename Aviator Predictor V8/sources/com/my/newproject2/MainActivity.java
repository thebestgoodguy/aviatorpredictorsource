package com.my.newproject2;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class MainActivity extends Activity {
    private AlertDialog.Builder j;
    private LinearLayout linear3;
    private TimerTask w;
    private Timer _timer = new Timer();
    private Intent u = new Intent();
    private ObjectAnimator f = new ObjectAnimator();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.j = new AlertDialog.Builder(this);
    }

    private void initializeLogic() {
        getWindow().getDecorView().setSystemUiVisibility(8192);
        getWindow().setStatusBarColor(-1);
        if (Build.VERSION.SDK_INT > 19) {
            Window window = getWindow();
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(-1);
        }
        this.linear3.addView(new PlanetView(this));
        this.w = new TimerTask() { // from class: com.my.newproject2.MainActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                MainActivity.this.runOnUiThread(new Runnable() { // from class: com.my.newproject2.MainActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        MainActivity.this.u.setClass(MainActivity.this.getApplicationContext(), LoadingActivity.class);
                        MainActivity.this.startActivity(MainActivity.this.u);
                    }
                });
            }
        };
        this._timer.schedule(this.w, 30000L);
    }

    public void _extra() {
    }

    public class PlanetView extends View {
        private double angle;
        private Paint myPaint;

        public PlanetView(Context context) {
            super(context);
            this.angle = 0.0d;
            this.myPaint = new Paint();
            this.angle = 0.0d;
        }

        @Override // android.view.View
        protected void onDraw(Canvas canvas) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            this.angle = (this.angle + 0.001d) % 360.0d;
            float round = Math.round(260.0d * Math.sin(Math.toDegrees(this.angle)));
            float round2 = Math.round(110.0d * Math.cos(Math.toDegrees(this.angle)));
            float round3 = Math.round(120.0d * Math.sin(90.0d + Math.toDegrees(this.angle)));
            float round4 = Math.round(290.0d * Math.cos(90.0d + Math.toDegrees(this.angle)));
            float round5 = Math.round(130.0d * Math.sin(180.0d + Math.toDegrees(this.angle)));
            float round6 = Math.round(230.0d * Math.cos(180.0d + Math.toDegrees(this.angle)));
            float round7 = Math.round(120.0d * Math.sin(270.0d + Math.toDegrees(this.angle)));
            float round8 = Math.round(250.0d * Math.cos(270.0d + Math.toDegrees(this.angle)));
            this.myPaint.setStyle(Paint.Style.FILL);
            this.myPaint.setColor(Color.parseColor("#eceff1"));
            canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, (int) (round * 1.5d), this.myPaint);
            this.myPaint.setColor(Color.parseColor("#cfd8dc"));
            canvas.drawCircle(measuredWidth / 2, measuredHeight / 2, ((int) (round * 1.5d)) - 25, this.myPaint);
            this.myPaint.setColor(Color.parseColor("#275080"));
            canvas.drawCircle((measuredWidth / 2) + round, round2 + (measuredHeight / 2), 15.0f, this.myPaint);
            this.myPaint.setColor(Color.parseColor("#DA3287"));
            canvas.drawCircle((measuredWidth / 2) + round3, (measuredHeight / 2) + round4, 20.0f, this.myPaint);
            this.myPaint.setColor(Color.parseColor("#008001"));
            canvas.drawCircle((measuredWidth / 2) + round5, (measuredHeight / 2) + round6, 30.0f, this.myPaint);
            this.myPaint.setColor(Color.parseColor("#8B0000"));
            canvas.drawCircle((measuredWidth / 2) + round7, (measuredHeight / 2) + round8, 10.0f, this.myPaint);
            Drawable drawable = getResources().getDrawable(R.drawable.hhh, null);
            drawable.setBounds((int) (((measuredWidth / 2) - 80) - (round / 11.0f)), (int) (((measuredHeight / 2) - 80) - (round / 11.0f)), (int) ((measuredWidth / 2) + 80 + (round / 11.0f)), (int) ((measuredHeight / 2) + 80 + (round / 11.0f)));
            drawable.draw(canvas);
            invalidate();
        }
    }

    @Deprecated
    public void showMessage(String str) {
        Toast.makeText(getApplicationContext(), str, 0).show();
    }

    @Deprecated
    public int getLocationX(View view) {
        int[] r0 = new int[2];
        view.getLocationInWindow(r0);
        return r0[0];
    }

    @Deprecated
    public int getLocationY(View view) {
        int[] r0 = new int[2];
        view.getLocationInWindow(r0);
        return r0[1];
    }

    @Deprecated
    public int getRandom(int r3, int r4) {
        return new Random().nextInt((r4 - r3) + 1) + r3;
    }

    @Deprecated
    public ArrayList<Double> getCheckedItemPositionsToArray(ListView listView) {
        ArrayList<Double> arrayList = new ArrayList<>();
        SparseBooleanArray checkedItemPositions = listView.getCheckedItemPositions();
        for (int r0 = 0; r0 < checkedItemPositions.size(); r0++) {
            if (checkedItemPositions.valueAt(r0)) {
                arrayList.add(Double.valueOf(checkedItemPositions.keyAt(r0)));
            }
        }
        return arrayList;
    }

    @Deprecated
    public float getDip(int r4) {
        return TypedValue.applyDimension(1, r4, getResources().getDisplayMetrics());
    }

    @Deprecated
    public int getDisplayWidthPixels() {
        return getResources().getDisplayMetrics().widthPixels;
    }

    @Deprecated
    public int getDisplayHeightPixels() {
        return getResources().getDisplayMetrics().heightPixels;
    }
}
