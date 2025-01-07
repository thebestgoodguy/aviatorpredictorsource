package com.my.aviator.predictor.v8;

import android.animation.ObjectAnimator;
import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.material.appbar.AppBarLayout;
import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;
import org.apache.http.client.methods.HttpGet;

/* loaded from: classes62.dex */
public class MainActivity extends AppCompatActivity {
    private TimerTask B;
    private AlertDialog.Builder D;
    private Toolbar b;
    private AppBarLayout c;
    private CoordinatorLayout d;
    private LinearLayout k;
    private LinearLayout l;
    private LinearLayout m;
    private LinearLayout n;
    private Button o;
    private LinearLayout p;
    private LinearLayout q;
    private ImageView r;
    private ImageView s;
    private TextView t;
    private dy v;
    private dz w;
    private AlertDialog.Builder x;
    private AlertDialog.Builder y;
    private TimerTask z;
    private Timer a = new Timer();
    private String e = "";
    private String f = "";
    private boolean g = false;
    private String h = "";
    private String i = "";
    private ArrayList<String> j = new ArrayList<>();
    private Intent u = new Intent();
    private Intent A = new Intent();
    private Intent C = new Intent();

    private void a() {
        this.v.a(HttpGet.METHOD_NAME, "https://www.google.com", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, this.w);
        _Klik(this.n);
        a(this.n, 10.0d, "GREY");
        _Klik(this.o);
        a(this.o, 10.0d, "GREY");
        this.n.setBackground(new dn(this).a(33, 2, -2818048, -12434878));
        this.o.setBackground(new Cdo(this).a(33, 2, -2818048, -12434878));
        this.g = false;
        this.h = "000011112024";
        this.n.setVisibility(8);
    }

    private void a(Bundle bundle) {
        this.c = (AppBarLayout) findViewById(R.id._app_bar);
        this.d = (CoordinatorLayout) findViewById(R.id._coordinator);
        Toolbar toolbar = (Toolbar) findViewById(R.id._toolbar);
        this.b = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        this.b.setNavigationOnClickListener(new de(this));
        this.k = (LinearLayout) findViewById(R.id.linear1);
        this.l = (LinearLayout) findViewById(R.id.linear5);
        this.m = (LinearLayout) findViewById(R.id.linear4);
        this.n = (LinearLayout) findViewById(R.id.linear3);
        this.o = (Button) findViewById(R.id.button1);
        this.p = (LinearLayout) findViewById(R.id.linear2);
        this.q = (LinearLayout) findViewById(R.id.linear6);
        this.r = (ImageView) findViewById(R.id.imageview2);
        this.s = (ImageView) findViewById(R.id.imageview3);
        this.t = (TextView) findViewById(R.id.textview2);
        this.v = new dy(this);
        this.x = new AlertDialog.Builder(this);
        this.y = new AlertDialog.Builder(this);
        this.D = new AlertDialog.Builder(this);
        this.n.setOnClickListener(new df(this));
        this.o.setOnClickListener(new dg(this));
        this.w = new dk(this);
    }

    public void _Klik(View view) {
        view.setOnTouchListener(new dr(this, view));
    }

    public void a(View view, double d, String str) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(Color.parseColor(str));
        gradientDrawable.setCornerRadius((int) d);
        view.setBackground(gradientDrawable);
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

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        this.y.setIcon(R.drawable.aaaaaaa);
        this.y.setTitle("AVIATOR | PREDICTOR V8 Exit?");
        this.y.setMessage("Are you sure AVIATOR | PREDICTOR V8 exit app?");
        this.y.setPositiveButton("Yes", new dp(this));
        this.y.setNegativeButton("No", new dq(this));
        this.y.create().show();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.main);
        a(bundle);
        a();
    }
}
