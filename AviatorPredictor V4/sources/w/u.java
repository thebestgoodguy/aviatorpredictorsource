package w;

import android.content.Context;
import android.content.res.Resources;

/* loaded from: classes.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f8068a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8069b;

    public u(Context context) {
        r.i(context);
        Resources resources = context.getResources();
        this.f8068a = resources;
        this.f8069b = resources.getResourcePackageName(s.k.f7499a);
    }

    public String a(String str) {
        int identifier = this.f8068a.getIdentifier(str, "string", this.f8069b);
        if (identifier == 0) {
            return null;
        }
        return this.f8068a.getString(identifier);
    }
}
