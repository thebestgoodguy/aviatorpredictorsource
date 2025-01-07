package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class LoadingActivity extends Activity {
    private ImageView imageview1;
    private LinearLayout linear2;
    private LinearLayout linear3;
    private LinearLayout linear4;
    private ProgressBar progressbar1;
    private RatingBar ratingbar1;
    private RatingBar ratingbar2;
    private TimerTask t;
    private TextView textview1;
    private TextView textview2;
    private Timer _timer = new Timer();
    private Intent q = new Intent();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.loading);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.ratingbar2 = (RatingBar) findViewById(R.id.ratingbar2);
        this.textview2 = (TextView) findViewById(R.id.textview2);
        this.linear3 = (LinearLayout) findViewById(R.id.linear3);
        this.linear4 = (LinearLayout) findViewById(R.id.linear4);
        this.progressbar1 = (ProgressBar) findViewById(R.id.progressbar1);
        this.ratingbar1 = (RatingBar) findViewById(R.id.ratingbar1);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
    }

    private void initializeLogic() {
        this.t = new TimerTask() { // from class: com.my.newproject2.LoadingActivity.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                LoadingActivity.this.runOnUiThread(new Runnable() { // from class: com.my.newproject2.LoadingActivity.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LoadingActivity.this.q.setClass(LoadingActivity.this.getApplicationContext(), NiceActivity.class);
                        LoadingActivity.this.startActivity(LoadingActivity.this.q);
                    }
                });
            }
        };
        this._timer.schedule(this.t, 3000L);
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
