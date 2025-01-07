package com.my.aviator.predictor.v8;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.bumptech.glide.Glide;
import com.google.android.material.appbar.AppBarLayout;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes62.dex */
public class AviatorActivity extends AppCompatActivity {
    private Toolbar b;
    private AppBarLayout c;
    private CoordinatorLayout d;
    private LinearLayout g;
    private LinearLayout h;
    private FrameLayout i;
    private Button j;
    private Button k;
    private TextView l;
    private Button m;
    private ImageView n;
    private TextView o;
    private ProgressBar p;
    private TimerTask q;
    private SharedPreferences s;
    private Timer a = new Timer();
    private double e = 0.0d;
    private String f = "";
    private Intent r = new Intent();
    private Intent t = new Intent();

    private void a(Bundle bundle) {
        this.c = (AppBarLayout) findViewById(R.id._app_bar);
        this.d = (CoordinatorLayout) findViewById(R.id._coordinator);
        Toolbar toolbar = (Toolbar) findViewById(R.id._toolbar);
        this.b = toolbar;
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setHomeButtonEnabled(true);
        this.b.setNavigationOnClickListener(new a(this));
        this.g = (LinearLayout) findViewById(R.id.linear3);
        this.h = (LinearLayout) findViewById(R.id.linear5);
        this.i = (FrameLayout) findViewById(R.id.linear4);
        this.j = (Button) findViewById(R.id.button3);
        this.k = (Button) findViewById(R.id.button2);
        this.l = (TextView) findViewById(R.id.textview2);
        this.m = (Button) findViewById(R.id.button4);
        this.n = (ImageView) findViewById(R.id.imageview1);
        this.o = (TextView) findViewById(R.id.textview1);
        this.p = (ProgressBar) findViewById(R.id.progressbar1);
        this.s = getSharedPreferences("text", 0);
        this.h.setOnClickListener(new w(this));
        this.j.setOnClickListener(new ar(this));
        this.k.setOnClickListener(new bm(this));
        this.m.setOnClickListener(new cg(this));
    }

    private void b() {
        this.p.setVisibility(8);
        this.o.setTypeface(Typeface.createFromAsset(getAssets(), "fonts/nnn.ttf"), 0);
        this.f = "android.resource://" + getPackageName() + "/raw/iii";
        Glide.with(getApplicationContext()).load(Uri.parse(this.f)).into(this.n);
        this.l.setText(this.s.getString("text", ""));
    }

    public void _Klik(View view) {
        view.setOnTouchListener(new cb(this, view));
    }

    public void a() {
        double a = ej.a(0, 41);
        this.e = a;
        this.p.setProgress((int) a);
        this.p.setVisibility(0);
        if (this.e == 0.0d) {
            ch chVar = new ch(this);
            this.q = chVar;
            this.a.schedule(chVar, 4000L);
        }
        if (this.e == 1.0d) {
            cj cjVar = new cj(this);
            this.q = cjVar;
            this.a.schedule(cjVar, 4000L);
        }
        if (this.e == 2.0d) {
            cl clVar = new cl(this);
            this.q = clVar;
            this.a.schedule(clVar, 4000L);
        }
        if (this.e == 3.0d) {
            cn cnVar = new cn(this);
            this.q = cnVar;
            this.a.schedule(cnVar, 4000L);
        }
        if (this.e == 4.0d) {
            b bVar = new b(this);
            this.q = bVar;
            this.a.schedule(bVar, 4000L);
        }
        if (this.e == 5.0d) {
            d dVar = new d(this);
            this.q = dVar;
            this.a.schedule(dVar, 4000L);
        }
        if (this.e == 6.0d) {
            f fVar = new f(this);
            this.q = fVar;
            this.a.schedule(fVar, 4000L);
        }
        if (this.e == 7.0d) {
            h hVar = new h(this);
            this.q = hVar;
            this.a.schedule(hVar, 4000L);
        }
        if (this.e == 8.0d) {
            j jVar = new j(this);
            this.q = jVar;
            this.a.schedule(jVar, 4000L);
        }
        if (this.e == 9.0d) {
            l lVar = new l(this);
            this.q = lVar;
            this.a.schedule(lVar, 4000L);
        }
        if (this.e == 10.0d) {
            n nVar = new n(this);
            this.q = nVar;
            this.a.schedule(nVar, 4000L);
        }
        if (this.e == 11.0d) {
            p pVar = new p(this);
            this.q = pVar;
            this.a.schedule(pVar, 4000L);
        }
        if (this.e == 12.0d) {
            s sVar = new s(this);
            this.q = sVar;
            this.a.schedule(sVar, 4000L);
        }
        if (this.e == 13.0d) {
            u uVar = new u(this);
            this.q = uVar;
            this.a.schedule(uVar, 4000L);
        }
        if (this.e == 14.0d) {
            x xVar = new x(this);
            this.q = xVar;
            this.a.schedule(xVar, 4000L);
        }
        if (this.e == 15.0d) {
            z zVar = new z(this);
            this.q = zVar;
            this.a.schedule(zVar, 4000L);
        }
        if (this.e == 16.0d) {
            ab abVar = new ab(this);
            this.q = abVar;
            this.a.schedule(abVar, 4000L);
        }
        if (this.e == 17.0d) {
            ad adVar = new ad(this);
            this.q = adVar;
            this.a.schedule(adVar, 4000L);
        }
        if (this.e == 18.0d) {
            af afVar = new af(this);
            this.q = afVar;
            this.a.schedule(afVar, 4000L);
        }
        if (this.e == 19.0d) {
            ah ahVar = new ah(this);
            this.q = ahVar;
            this.a.schedule(ahVar, 4000L);
        }
        if (this.e == 20.0d) {
            aj ajVar = new aj(this);
            this.q = ajVar;
            this.a.schedule(ajVar, 4000L);
        }
        if (this.e == 21.0d) {
            al alVar = new al(this);
            this.q = alVar;
            this.a.schedule(alVar, 4000L);
        }
        if (this.e == 22.0d) {
            an anVar = new an(this);
            this.q = anVar;
            this.a.schedule(anVar, 4000L);
        }
        if (this.e == 23.0d) {
            ap apVar = new ap(this);
            this.q = apVar;
            this.a.schedule(apVar, 4000L);
        }
        if (this.e == 24.0d) {
            as asVar = new as(this);
            this.q = asVar;
            this.a.schedule(asVar, 4000L);
        }
        if (this.e == 25.0d) {
            au auVar = new au(this);
            this.q = auVar;
            this.a.schedule(auVar, 4000L);
        }
        if (this.e == 26.0d) {
            aw awVar = new aw(this);
            this.q = awVar;
            this.a.schedule(awVar, 4000L);
        }
        if (this.e == 27.0d) {
            ay ayVar = new ay(this);
            this.q = ayVar;
            this.a.schedule(ayVar, 4000L);
        }
        if (this.e == 28.0d) {
            ba baVar = new ba(this);
            this.q = baVar;
            this.a.schedule(baVar, 4000L);
        }
        if (this.e == 29.0d) {
            bc bcVar = new bc(this);
            this.q = bcVar;
            this.a.schedule(bcVar, 4000L);
        }
        if (this.e == 30.0d) {
            be beVar = new be(this);
            this.q = beVar;
            this.a.schedule(beVar, 4000L);
        }
        if (this.e == 31.0d) {
            bg bgVar = new bg(this);
            this.q = bgVar;
            this.a.schedule(bgVar, 4000L);
        }
        if (this.e == 32.0d) {
            bi biVar = new bi(this);
            this.q = biVar;
            this.a.schedule(biVar, 4000L);
        }
        if (this.e == 33.0d) {
            bk bkVar = new bk(this);
            this.q = bkVar;
            this.a.schedule(bkVar, 4000L);
        }
        if (this.e == 34.0d) {
            bn bnVar = new bn(this);
            this.q = bnVar;
            this.a.schedule(bnVar, 4000L);
        }
        if (this.e == 35.0d) {
            bp bpVar = new bp(this);
            this.q = bpVar;
            this.a.schedule(bpVar, 4000L);
        }
        if (this.e == 36.0d) {
            br brVar = new br(this);
            this.q = brVar;
            this.a.schedule(brVar, 4000L);
        }
        if (this.e == 37.0d) {
            bt btVar = new bt(this);
            this.q = btVar;
            this.a.schedule(btVar, 4000L);
        }
        if (this.e == 38.0d) {
            bv bvVar = new bv(this);
            this.q = bvVar;
            this.a.schedule(bvVar, 4000L);
        }
        if (this.e == 39.0d) {
            bx bxVar = new bx(this);
            this.q = bxVar;
            this.a.schedule(bxVar, 4000L);
        }
        if (this.e == 40.0d) {
            bz bzVar = new bz(this);
            this.q = bzVar;
            this.a.schedule(bzVar, 4000L);
        }
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
        setContentView(R.layout.aviator);
        a(bundle);
        b();
    }
}
