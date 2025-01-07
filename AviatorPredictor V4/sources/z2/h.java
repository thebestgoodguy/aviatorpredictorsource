package z2;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes.dex */
public final class h {

    public interface a {
        boolean a(View view);
    }

    public static boolean c(View view) {
        return i(view, new a() { // from class: z2.g
            @Override // z2.h.a
            public final boolean a(View view2) {
                boolean hasFocus;
                hasFocus = view2.hasFocus();
                return hasFocus;
            }
        });
    }

    public static int d(int r22) {
        return Build.VERSION.SDK_INT >= 17 ? View.generateViewId() : r22;
    }

    public static Activity e(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            return e(((ContextWrapper) context).getBaseContext());
        }
        return null;
    }

    public static boolean f(View view, final Class<? extends View>[] clsArr) {
        return i(view, new a() { // from class: z2.f
            @Override // z2.h.a
            public final boolean a(View view2) {
                boolean h5;
                h5 = h.h(clsArr, view2);
                return h5;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean h(Class[] clsArr, View view) {
        for (Class cls : clsArr) {
            if (cls.isInstance(view)) {
                return true;
            }
        }
        return false;
    }

    public static boolean i(View view, a aVar) {
        if (view == null) {
            return false;
        }
        if (aVar.a(view)) {
            return true;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int r12 = 0; r12 < viewGroup.getChildCount(); r12++) {
                if (i(viewGroup.getChildAt(r12), aVar)) {
                    return true;
                }
            }
        }
        return false;
    }
}
