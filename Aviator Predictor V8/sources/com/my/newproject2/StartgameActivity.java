package com.my.newproject2;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Random;

/* loaded from: classes2.dex */
public class StartgameActivity extends Activity {
    private Button button1;
    private EditText edittext1;
    private Intent i = new Intent();
    private ImageView imageview1;
    private ImageView imageview2;
    private LinearLayout linear1;
    private LinearLayout linear2;
    private TextView textview1;

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.startgame);
        initialize(bundle);
        initializeLogic();
    }

    private void initialize(Bundle bundle) {
        this.linear1 = (LinearLayout) findViewById(R.id.linear1);
        this.imageview1 = (ImageView) findViewById(R.id.imageview1);
        this.textview1 = (TextView) findViewById(R.id.textview1);
        this.linear2 = (LinearLayout) findViewById(R.id.linear2);
        this.button1 = (Button) findViewById(R.id.button1);
        this.imageview2 = (ImageView) findViewById(R.id.imageview2);
        this.edittext1 = (EditText) findViewById(R.id.edittext1);
        this.button1.setOnClickListener(new View.OnClickListener() { // from class: com.my.newproject2.StartgameActivity.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (StartgameActivity.this.edittext1.getText().toString().equals("#331Cheat#")) {
                    StartgameActivity.this.i.setClass(StartgameActivity.this.getApplicationContext(), StarActivity.class);
                    StartgameActivity.this.startActivity(StartgameActivity.this.i);
                    StartgameActivity.this.finish();
                }
                if (!StartgameActivity.this.edittext1.getText().toString().equals("#331Cheat#")) {
                    SketchwareUtil.showMessage(StartgameActivity.this.getApplicationContext(), "INCORRECT ID");
                }
            }
        });
    }

    private void initializeLogic() {
        _radius(this.edittext1, 25.0d, 30.0d, "#FFFFFF");
        _radius(this.button1, 20.0d, 70.0d, "#ffffff");
        _radius(this.linear2, 26.0d, 40.0d, "#ff0808");
    }

    public void _radius(View view, double d, double d2, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((float) d);
        view.setElevation((float) d2);
        view.setBackground(gradientDrawable);
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
