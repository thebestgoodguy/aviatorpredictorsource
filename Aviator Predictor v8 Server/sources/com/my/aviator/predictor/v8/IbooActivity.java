package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes62.dex */
public class IbooActivity extends AppCompatActivity {
    private ScrollView a;
    private LinearLayout b;
    private LinearLayout c;
    private LinearLayout d;
    private LinearLayout e;
    private Button f;
    private TextView g;
    private TextView h;
    private TextView i;
    private Intent j = new Intent();

    private void a() {
    }

    private void a(Bundle bundle) {
        this.a = (ScrollView) findViewById(R.id.vscroll1);
        this.b = (LinearLayout) findViewById(R.id.linear1);
        this.c = (LinearLayout) findViewById(R.id.linear2);
        this.d = (LinearLayout) findViewById(R.id.linear4);
        this.e = (LinearLayout) findViewById(R.id.linear5);
        this.f = (Button) findViewById(R.id.button1);
        this.g = (TextView) findViewById(R.id.textview1);
        this.h = (TextView) findViewById(R.id.textview2);
        this.i = (TextView) findViewById(R.id.textview3);
        this.f.setOnClickListener(new cx(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.iboo);
        a(bundle);
        a();
    }
}
