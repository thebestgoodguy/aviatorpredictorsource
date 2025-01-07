package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.c;
import s.d;
import w.r;

@KeepName
/* loaded from: classes.dex */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: e, reason: collision with root package name */
    protected int f1200e = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int r4, boolean z4) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", r4);
        intent.putExtra("notify_manager", z4);
        return intent;
    }

    private final void b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            d.m().n(this, ((Integer) r.i(num)).intValue(), 2, this);
            this.f1200e = 1;
            return;
        }
        try {
            startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
            this.f1200e = 1;
        } catch (ActivityNotFoundException e5) {
            if (extras.getBoolean("notify_manager", true)) {
                c.x(this).G(new s.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
            } else {
                String obj = pendingIntent.toString();
                StringBuilder sb = new StringBuilder(obj.length() + 36);
                sb.append("Activity not found while launching ");
                sb.append(obj);
                sb.append(".");
                String sb2 = sb.toString();
                if (Build.FINGERPRINT.contains("generic")) {
                    sb2 = sb2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                }
                Log.e("GoogleApiActivity", sb2, e5);
            }
            this.f1200e = 1;
            finish();
        } catch (IntentSender.SendIntentException e6) {
            Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e6);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int r4, int r5, Intent intent) {
        super.onActivityResult(r4, r5, intent);
        if (r4 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f1200e = 0;
            setResult(r5, intent);
            if (booleanExtra) {
                c x4 = c.x(this);
                if (r5 == -1) {
                    x4.a();
                } else if (r5 == 0) {
                    x4.G(new s.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (r4 == 2) {
            this.f1200e = 0;
            setResult(r5, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f1200e = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f1200e = bundle.getInt("resolution");
        }
        if (this.f1200e != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f1200e);
        super.onSaveInstanceState(bundle);
    }
}
