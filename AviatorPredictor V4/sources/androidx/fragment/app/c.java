package androidx.fragment.app;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;

/* loaded from: classes.dex */
public class c extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* renamed from: c0, reason: collision with root package name */
    private Handler f284c0;

    /* renamed from: d0, reason: collision with root package name */
    private Runnable f285d0 = new a();

    /* renamed from: e0, reason: collision with root package name */
    int f286e0 = 0;

    /* renamed from: f0, reason: collision with root package name */
    int f287f0 = 0;

    /* renamed from: g0, reason: collision with root package name */
    boolean f288g0 = true;

    /* renamed from: h0, reason: collision with root package name */
    boolean f289h0 = true;

    /* renamed from: i0, reason: collision with root package name */
    int f290i0 = -1;

    /* renamed from: j0, reason: collision with root package name */
    Dialog f291j0;

    /* renamed from: k0, reason: collision with root package name */
    boolean f292k0;

    /* renamed from: l0, reason: collision with root package name */
    boolean f293l0;

    /* renamed from: m0, reason: collision with root package name */
    boolean f294m0;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c cVar = c.this;
            Dialog dialog = cVar.f291j0;
            if (dialog != null) {
                cVar.onDismiss(dialog);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void V(Bundle bundle) {
        Bundle bundle2;
        super.V(bundle);
        if (this.f289h0) {
            View L = L();
            if (L != null) {
                if (L.getParent() != null) {
                    throw new IllegalStateException("DialogFragment can not be attached to a container view");
                }
                this.f291j0.setContentView(L);
            }
            d l4 = l();
            if (l4 != null) {
                this.f291j0.setOwnerActivity(l4);
            }
            this.f291j0.setCancelable(this.f288g0);
            this.f291j0.setOnCancelListener(this);
            this.f291j0.setOnDismissListener(this);
            if (bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
                return;
            }
            this.f291j0.onRestoreInstanceState(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void Y(Context context) {
        super.Y(context);
        if (this.f294m0) {
            return;
        }
        this.f293l0 = false;
    }

    @Override // androidx.fragment.app.Fragment
    public void b0(Bundle bundle) {
        super.b0(bundle);
        this.f284c0 = new Handler();
        this.f289h0 = this.A == 0;
        if (bundle != null) {
            this.f286e0 = bundle.getInt("android:style", 0);
            this.f287f0 = bundle.getInt("android:theme", 0);
            this.f288g0 = bundle.getBoolean("android:cancelable", true);
            this.f289h0 = bundle.getBoolean("android:showsDialog", this.f289h0);
            this.f290i0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void i0() {
        super.i0();
        Dialog dialog = this.f291j0;
        if (dialog != null) {
            this.f292k0 = true;
            dialog.setOnDismissListener(null);
            this.f291j0.dismiss();
            if (!this.f293l0) {
                onDismiss(this.f291j0);
            }
            this.f291j0 = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void j0() {
        super.j0();
        if (this.f294m0 || this.f293l0) {
            return;
        }
        this.f293l0 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater k0(Bundle bundle) {
        Context f5;
        if (!this.f289h0) {
            return super.k0(bundle);
        }
        Dialog q12 = q1(bundle);
        this.f291j0 = q12;
        if (q12 != null) {
            s1(q12, this.f286e0);
            f5 = this.f291j0.getContext();
        } else {
            f5 = this.f239w.f();
        }
        return (LayoutInflater) f5.getSystemService("layout_inflater");
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (this.f292k0) {
            return;
        }
        p1(true, true);
    }

    void p1(boolean z4, boolean z5) {
        if (this.f293l0) {
            return;
        }
        this.f293l0 = true;
        this.f294m0 = false;
        Dialog dialog = this.f291j0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f291j0.dismiss();
            if (!z5) {
                if (Looper.myLooper() == this.f284c0.getLooper()) {
                    onDismiss(this.f291j0);
                } else {
                    this.f284c0.post(this.f285d0);
                }
            }
        }
        this.f292k0 = true;
        if (this.f290i0 >= 0) {
            b1().g(this.f290i0, 1);
            this.f290i0 = -1;
            return;
        }
        n a5 = b1().a();
        a5.g(this);
        if (z4) {
            a5.e();
        } else {
            a5.d();
        }
    }

    public Dialog q1(Bundle bundle) {
        throw null;
    }

    public void r1(boolean z4) {
        this.f289h0 = z4;
    }

    public void s1(Dialog dialog, int r4) {
        if (r4 != 1 && r4 != 2) {
            if (r4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    public void t1(i iVar, String str) {
        this.f293l0 = false;
        this.f294m0 = true;
        n a5 = iVar.a();
        a5.b(this, str);
        a5.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void x0(Bundle bundle) {
        Bundle onSaveInstanceState;
        super.x0(bundle);
        Dialog dialog = this.f291j0;
        if (dialog != null && (onSaveInstanceState = dialog.onSaveInstanceState()) != null) {
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int r02 = this.f286e0;
        if (r02 != 0) {
            bundle.putInt("android:style", r02);
        }
        int r03 = this.f287f0;
        if (r03 != 0) {
            bundle.putInt("android:theme", r03);
        }
        boolean z4 = this.f288g0;
        if (!z4) {
            bundle.putBoolean("android:cancelable", z4);
        }
        boolean z5 = this.f289h0;
        if (!z5) {
            bundle.putBoolean("android:showsDialog", z5);
        }
        int r04 = this.f290i0;
        if (r04 != -1) {
            bundle.putInt("android:backStackId", r04);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void y0() {
        super.y0();
        Dialog dialog = this.f291j0;
        if (dialog != null) {
            this.f292k0 = false;
            dialog.show();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void z0() {
        super.z0();
        Dialog dialog = this.f291j0;
        if (dialog != null) {
            dialog.hide();
        }
    }
}
