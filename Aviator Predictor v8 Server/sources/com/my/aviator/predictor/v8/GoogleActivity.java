package com.my.aviator.predictor.v8;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
public class GoogleActivity extends AppCompatActivity {
    private LinearLayout e;
    private ImageView f;
    private TextView g;
    private TimerTask i;
    private Timer a = new Timer();
    private String b = "";
    private String c = "";
    private String d = "";
    private Intent h = new Intent();

    private void a() {
        this.d = "android.resource://" + getPackageName() + "/raw/ggg";
        Glide.with(getApplicationContext()).load(Uri.parse(this.d)).into(this.f);
        cq cqVar = new cq(this);
        this.i = cqVar;
        this.a.schedule(cqVar, 2000L);
    }

    private void a(Bundle bundle) {
        this.e = (LinearLayout) findViewById(R.id.linear1);
        this.f = (ImageView) findViewById(R.id.imageview2);
        this.g = (TextView) findViewById(R.id.textview1);
    }

    public void _Klik(View view) {
        view.setOnTouchListener(new cs(this, view));
    }

    public void a(View view, String str, double d, double d2) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        objectAnimator.setTarget(view);
        objectAnimator.setPropertyName(str);
        objectAnimator.setFloatValues((float) d);
        objectAnimator.setDuration((long) d2);
        objectAnimator.start();
        objectAnimator.setInterpolator(new LinearInterpolator());
        objectAnimator.start();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.google);
        a(bundle);
        a();
    }
}
