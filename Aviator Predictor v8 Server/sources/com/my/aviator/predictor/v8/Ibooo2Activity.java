package com.my.aviator.predictor.v8;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
public class Ibooo2Activity extends AppCompatActivity {
    private ScrollView b;
    private LinearLayout c;
    private LinearLayout d;
    private LinearLayout e;
    private LinearLayout f;
    private LinearLayout g;
    private LinearLayout h;
    private LinearLayout i;
    private LinearLayout j;
    private ProgressBar k;
    private TextView l;
    private TextView m;
    private Button n;
    private Button o;
    private TextView p;
    private TextView q;
    private EditText r;
    private Button s;
    private TimerTask u;
    private AlertDialog x;
    private SharedPreferences y;
    private Timer a = new Timer();
    private Intent t = new Intent();
    private Intent v = new Intent();
    private Intent w = new Intent();

    private void a() {
        this.k.setVisibility(8);
    }

    private void a(Bundle bundle) {
        this.b = (ScrollView) findViewById(R.id.vscroll1);
        this.c = (LinearLayout) findViewById(R.id.linear1);
        this.d = (LinearLayout) findViewById(R.id.linear2);
        this.e = (LinearLayout) findViewById(R.id.linear3);
        this.f = (LinearLayout) findViewById(R.id.linear5);
        this.g = (LinearLayout) findViewById(R.id.linear4);
        this.h = (LinearLayout) findViewById(R.id.linear6);
        this.i = (LinearLayout) findViewById(R.id.linear7);
        this.j = (LinearLayout) findViewById(R.id.linear8);
        this.k = (ProgressBar) findViewById(R.id.progressbar1);
        this.l = (TextView) findViewById(R.id.textview1);
        this.m = (TextView) findViewById(R.id.textview2);
        this.n = (Button) findViewById(R.id.button1);
        this.o = (Button) findViewById(R.id.button2);
        this.p = (TextView) findViewById(R.id.textview3);
        this.q = (TextView) findViewById(R.id.textview4);
        this.r = (EditText) findViewById(R.id.edittext1);
        this.s = (Button) findViewById(R.id.button3);
        this.y = getSharedPreferences("text", 0);
        this.n.setOnClickListener(new cy(this));
        this.o.setOnClickListener(new cz(this));
        this.s.setOnClickListener(new da(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.ibooo2);
        a(bundle);
        a();
    }
}
