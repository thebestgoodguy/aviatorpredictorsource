package g;

import android.app.Person;
import androidx.core.graphics.drawable.IconCompat;

/* loaded from: classes.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    CharSequence f3855a;

    /* renamed from: b, reason: collision with root package name */
    IconCompat f3856b;

    /* renamed from: c, reason: collision with root package name */
    String f3857c;

    /* renamed from: d, reason: collision with root package name */
    String f3858d;

    /* renamed from: e, reason: collision with root package name */
    boolean f3859e;

    /* renamed from: f, reason: collision with root package name */
    boolean f3860f;

    public IconCompat a() {
        return this.f3856b;
    }

    public String b() {
        return this.f3858d;
    }

    public CharSequence c() {
        return this.f3855a;
    }

    public String d() {
        return this.f3857c;
    }

    public boolean e() {
        return this.f3859e;
    }

    public boolean f() {
        return this.f3860f;
    }

    public String g() {
        String str = this.f3857c;
        if (str != null) {
            return str;
        }
        if (this.f3855a == null) {
            return "";
        }
        return "name:" + ((Object) this.f3855a);
    }

    public Person h() {
        return new Person.Builder().setName(c()).setIcon(a() != null ? a().n() : null).setUri(d()).setKey(b()).setBot(e()).setImportant(f()).build();
    }
}
