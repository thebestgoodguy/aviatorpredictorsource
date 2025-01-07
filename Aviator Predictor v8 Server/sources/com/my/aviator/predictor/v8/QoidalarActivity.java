package com.my.aviator.predictor.v8;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

/* loaded from: classes62.dex */
public class QoidalarActivity extends AppCompatActivity {
    private LinearLayout a;
    private LinearLayout b;
    private LinearLayout c;
    private Button d;
    private Button e;
    private TextView f;
    private TextView g;
    private Intent h = new Intent();
    private Intent i = new Intent();

    private void a() {
    }

    private void a(Bundle bundle) {
        this.a = (LinearLayout) findViewById(R.id.linear1);
        this.b = (LinearLayout) findViewById(R.id.linear3);
        this.c = (LinearLayout) findViewById(R.id.linear4);
        this.d = (Button) findViewById(R.id.button1);
        this.e = (Button) findViewById(R.id.button2);
        this.f = (TextView) findViewById(R.id.textview1);
        this.g = (TextView) findViewById(R.id.textview2);
        this.d.setOnClickListener(new dw(this));
        this.e.setOnClickListener(new dx(this));
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.qoidalar);
        a(bundle);
        a();
    }
}
