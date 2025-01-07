package s;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

/* loaded from: classes.dex */
public class b extends DialogFragment {

    /* renamed from: e, reason: collision with root package name */
    private Dialog f7479e;

    /* renamed from: f, reason: collision with root package name */
    private DialogInterface.OnCancelListener f7480f;

    /* renamed from: g, reason: collision with root package name */
    private Dialog f7481g;

    public static b a(Dialog dialog, DialogInterface.OnCancelListener onCancelListener) {
        b bVar = new b();
        Dialog dialog2 = (Dialog) w.r.j(dialog, "Cannot display null dialog");
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        bVar.f7479e = dialog2;
        if (onCancelListener != null) {
            bVar.f7480f = onCancelListener;
        }
        return bVar;
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.f7480f;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f7479e;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.f7481g == null) {
            this.f7481g = new AlertDialog.Builder((Context) w.r.i(getActivity())).create();
        }
        return this.f7481g;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        super.show(fragmentManager, str);
    }
}
