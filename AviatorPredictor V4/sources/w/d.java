package w;

import android.accounts.Account;
import android.view.View;
import com.google.android.gms.common.api.Scope;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Account f7941a;

    /* renamed from: b, reason: collision with root package name */
    private final Set<Scope> f7942b;

    /* renamed from: c, reason: collision with root package name */
    private final Set<Scope> f7943c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<t.a<?>, c0> f7944d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7945e;

    /* renamed from: f, reason: collision with root package name */
    private final View f7946f;

    /* renamed from: g, reason: collision with root package name */
    private final String f7947g;

    /* renamed from: h, reason: collision with root package name */
    private final String f7948h;

    /* renamed from: i, reason: collision with root package name */
    private final m0.a f7949i;

    /* renamed from: j, reason: collision with root package name */
    private Integer f7950j;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private Account f7951a;

        /* renamed from: b, reason: collision with root package name */
        private e.b<Scope> f7952b;

        /* renamed from: c, reason: collision with root package name */
        private String f7953c;

        /* renamed from: d, reason: collision with root package name */
        private String f7954d;

        /* renamed from: e, reason: collision with root package name */
        private m0.a f7955e = m0.a.f6613j;

        public d a() {
            return new d(this.f7951a, this.f7952b, null, 0, null, this.f7953c, this.f7954d, this.f7955e, false);
        }

        public a b(String str) {
            this.f7953c = str;
            return this;
        }

        public final a c(Collection<Scope> collection) {
            if (this.f7952b == null) {
                this.f7952b = new e.b<>();
            }
            this.f7952b.addAll(collection);
            return this;
        }

        public final a d(Account account) {
            this.f7951a = account;
            return this;
        }

        public final a e(String str) {
            this.f7954d = str;
            return this;
        }
    }

    public d(Account account, Set<Scope> set, Map<t.a<?>, c0> map, int r4, View view, String str, String str2, m0.a aVar, boolean z4) {
        this.f7941a = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.f7942b = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.f7944d = map;
        this.f7946f = view;
        this.f7945e = r4;
        this.f7947g = str;
        this.f7948h = str2;
        this.f7949i = aVar == null ? m0.a.f6613j : aVar;
        HashSet hashSet = new HashSet(emptySet);
        Iterator<c0> it = map.values().iterator();
        while (it.hasNext()) {
            hashSet.addAll(it.next().f7938a);
        }
        this.f7943c = Collections.unmodifiableSet(hashSet);
    }

    public Account a() {
        return this.f7941a;
    }

    public Account b() {
        Account account = this.f7941a;
        return account != null ? account : new Account("<<default account>>", "com.google");
    }

    public Set<Scope> c() {
        return this.f7943c;
    }

    public String d() {
        return this.f7947g;
    }

    public Set<Scope> e() {
        return this.f7942b;
    }

    public final m0.a f() {
        return this.f7949i;
    }

    public final Integer g() {
        return this.f7950j;
    }

    public final String h() {
        return this.f7948h;
    }

    public final void i(Integer num) {
        this.f7950j = num;
    }
}
