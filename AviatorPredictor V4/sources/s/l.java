package s;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class l extends androidx.fragment.app.c {

    /* renamed from: n0, reason: collision with root package name */
    private Dialog f7500n0;

    /* renamed from: o0, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7501o0;

    /* renamed from: p0, reason: collision with root package name */
    private Dialog f7502p0;

    public static l u1(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        l lVar = new l();
        Dialog dialog2 = (Dialog) w.r.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        lVar.f7500n0 = dialog2;
        if (onCancelListener != null) {
            lVar.f7501o0 = onCancelListener;
        }
        return lVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7501o0;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    public Dialog q1(Bundle bundle) {
        Dialog dialog = this.f7500n0;
        if (dialog != null) {
            return dialog;
        }
        r1(false);
        if (this.f7502p0 == null) {
            this.f7502p0 = new AlertDialog.Builder((Context) w.r.i(r())).create();
        }
        return this.f7502p0;
    }

    @Override // androidx.fragment.app.c
    public void t1(androidx.fragment.app.i iVar, String str) {
        super.t1(iVar, str);
    }
}
