package com.my.newproject2;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes2.dex */
public class ChooseActivity extends Activity {
    private TimerTask a;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private TextView textview1;
    private Timer _timer = new Timer();
    private Intent f = new Intent();

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.choose);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.linear2.setOnClickListener(new AnonymousClass1());
    }

    /* renamed from: com.my.newproject2.ChooseActivity$1, reason: invalid class name */
    class AnonymousClass1 implements View.OnClickListener {
        AnonymousClass1() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ProgressDialog progressDialog = new ProgressDialog(ChooseActivity.this);
            progressDialog.setMax(100);
            progressDialog.setTitle("Signal Loading");
            progressDialog.setMessage("Please wait...");
            progressDialog.setIndeterminate(true);
            progressDialog.setCancelable(true);
            progressDialog.show();
            ChooseActivity.this.a = new TimerTask() { // from class: com.my.newproject2.ChooseActivity.1.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public void run() {
                    ChooseActivity.this.runOnUiThread(new Runnable() { // from class: com.my.newproject2.ChooseActivity.1.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ChooseActivity.this.f.setClass(ChooseActivity.this.getApplicationContext(), PasswordActivity.class);
                            ChooseActivity.this.startActivity(ChooseActivity.this.f);
                        }
                    });
                }
            };
            ChooseActivity.this._timer.schedule(ChooseActivity.this.a, 3000L);
        }
    }

    private void initializeLogic() {
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
