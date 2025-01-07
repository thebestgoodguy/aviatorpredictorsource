package a3;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Objects;
import kotlin.jvm.internal.i;
import r2.j;

/* loaded from: classes.dex */
public final class d implements j.c {

    /* renamed from: a, reason: collision with root package name */
    private Context f153a;

    /* renamed from: b, reason: collision with root package name */
    private Toast f154b;

    public d(Context context) {
        i.d(context, "context");
        this.f153a = context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(d dVar) {
        i.d(dVar, "this$0");
        Toast toast = dVar.f154b;
        if (toast == null) {
            i.m("mToast");
            toast = null;
        }
        toast.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(d dVar) {
        i.d(dVar, "this$0");
        dVar.e();
    }

    @Override // r2.j.c
    public void a(r2.i iVar, j.d dVar) {
        int r10;
        Drawable drawable;
        String str;
        i.d(iVar, "call");
        i.d(dVar, "result");
        String str2 = iVar.f7455a;
        Toast toast = null;
        if (i.a(str2, "showToast")) {
            String valueOf = String.valueOf(iVar.a("msg"));
            String valueOf2 = String.valueOf(iVar.a("length"));
            String valueOf3 = String.valueOf(iVar.a("gravity"));
            Number number = (Number) iVar.a("bgcolor");
            Number number2 = (Number) iVar.a("textcolor");
            Number number3 = (Number) iVar.a("fontSize");
            int r4 = i.a(valueOf3, "top") ? 48 : i.a(valueOf3, "center") ? 17 : 80;
            boolean a5 = i.a(valueOf2, "long");
            if (number == null || (r10 = Build.VERSION.SDK_INT) > 31) {
                Toast makeText = Toast.makeText(this.f153a, valueOf, a5 ? 1 : 0);
                i.c(makeText, "makeText(context, mMessage, mDuration)");
                this.f154b = makeText;
                if (Build.VERSION.SDK_INT <= 31) {
                    if (makeText == null) {
                        try {
                            i.m("mToast");
                            makeText = null;
                        } catch (Exception unused) {
                        }
                    }
                    View view = makeText.getView();
                    i.b(view);
                    View findViewById = view.findViewById(R.id.message);
                    i.c(findViewById, "mToast.view!!.findViewById(android.R.id.message)");
                    TextView textView = (TextView) findViewById;
                    if (number3 != null) {
                        textView.setTextSize(number3.floatValue());
                    }
                    if (number2 != null) {
                        textView.setTextColor(number2.intValue());
                    }
                }
            } else {
                Object systemService = this.f153a.getSystemService("layout_inflater");
                Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
                View inflate = ((LayoutInflater) systemService).inflate(g.f157a, (ViewGroup) null);
                TextView textView2 = (TextView) inflate.findViewById(f.f156a);
                textView2.setText(valueOf);
                if (r10 >= 21) {
                    drawable = this.f153a.getDrawable(e.f155a);
                    i.b(drawable);
                    str = "{\n                      …)!!\n                    }";
                } else {
                    drawable = this.f153a.getResources().getDrawable(e.f155a);
                    str = "{\n                      …er)\n                    }";
                }
                i.c(drawable, str);
                drawable.setColorFilter(number.intValue(), PorterDuff.Mode.SRC_IN);
                textView2.setBackground(drawable);
                if (number3 != null) {
                    textView2.setTextSize(number3.floatValue());
                }
                if (number2 != null) {
                    textView2.setTextColor(number2.intValue());
                }
                Toast toast2 = new Toast(this.f153a);
                this.f154b = toast2;
                toast2.setDuration(a5 ? 1 : 0);
                Toast toast3 = this.f154b;
                if (toast3 == null) {
                    i.m("mToast");
                    toast3 = null;
                }
                toast3.setView(inflate);
            }
            if (Build.VERSION.SDK_INT <= 31) {
                if (r4 != 17) {
                    Toast toast4 = this.f154b;
                    if (r4 == 48 ? toast4 == null : toast4 == null) {
                        i.m("mToast");
                        toast4 = null;
                    }
                    toast4.setGravity(r4, 0, 100);
                } else {
                    Toast toast5 = this.f154b;
                    if (toast5 == null) {
                        i.m("mToast");
                        toast5 = null;
                    }
                    toast5.setGravity(r4, 0, 0);
                }
            }
            Context context = this.f153a;
            if (context instanceof Activity) {
                ((Activity) context).runOnUiThread(new Runnable() { // from class: a3.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.d(d.this);
                    }
                });
            } else {
                Toast toast6 = this.f154b;
                if (toast6 == null) {
                    i.m("mToast");
                } else {
                    toast = toast6;
                }
                toast.show();
            }
            e();
        } else {
            if (!i.a(str2, "cancel")) {
                dVar.c();
                return;
            }
            Toast toast7 = this.f154b;
            if (toast7 != null) {
                if (toast7 == null) {
                    i.m("mToast");
                } else {
                    toast = toast7;
                }
                toast.cancel();
            }
        }
        dVar.a(Boolean.TRUE);
    }

    public final void e() {
        Toast toast = this.f154b;
        if (toast != null) {
            if (toast == null) {
                i.m("mToast");
            }
            Toast toast2 = this.f154b;
            if (toast2 == null) {
                i.m("mToast");
                toast2 = null;
            }
            View view = toast2.getView();
            boolean z4 = false;
            if (view != null && view.getVisibility() == 0) {
                z4 = true;
            }
            if (z4) {
                new Handler().postDelayed(new Runnable() { // from class: a3.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.f(d.this);
                    }
                }, 1000L);
            } else if (this.f154b == null) {
                i.m("mToast");
            }
        }
    }
}
