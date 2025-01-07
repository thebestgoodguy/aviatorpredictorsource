package androidx.fragment.app;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.j;
import androidx.fragment.app.n;
import java.io.PrintWriter;
import java.util.ArrayList;
import x1.x;

/* loaded from: classes.dex */
final class a extends n implements j.k {

    /* renamed from: s, reason: collision with root package name */
    final j f266s;

    /* renamed from: t, reason: collision with root package name */
    boolean f267t;

    /* renamed from: u, reason: collision with root package name */
    int f268u = -1;

    public a(j jVar) {
        this.f266s = jVar;
    }

    private static boolean r(n.a aVar) {
        Fragment fragment = aVar.f412b;
        return (fragment == null || !fragment.f231o || fragment.K == null || fragment.D || fragment.C || !fragment.R()) ? false : true;
    }

    @Override // androidx.fragment.app.j.k
    public boolean a(ArrayList<a> arrayList, ArrayList<Boolean> arrayList2) {
        if (j.L) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f400h) {
            return true;
        }
        this.f266s.k(this);
        return true;
    }

    @Override // androidx.fragment.app.n
    public int d() {
        return i(false);
    }

    @Override // androidx.fragment.app.n
    public int e() {
        return i(true);
    }

    @Override // androidx.fragment.app.n
    void f(int r12, Fragment fragment, String str, int r4) {
        super.f(r12, fragment, str, r4);
        fragment.f238v = this.f266s;
    }

    @Override // androidx.fragment.app.n
    public n g(Fragment fragment) {
        j jVar = fragment.f238v;
        if (jVar == null || jVar == this.f266s) {
            return super.g(fragment);
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + fragment.toString() + " is already attached to a FragmentManager.");
    }

    void h(int r7) {
        if (this.f400h) {
            if (j.L) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + r7);
            }
            int size = this.f393a.size();
            for (int r22 = 0; r22 < size; r22++) {
                n.a aVar = this.f393a.get(r22);
                Fragment fragment = aVar.f412b;
                if (fragment != null) {
                    fragment.f237u += r7;
                    if (j.L) {
                        Log.v("FragmentManager", "Bump nesting of " + aVar.f412b + " to " + aVar.f412b.f237u);
                    }
                }
            }
        }
    }

    int i(boolean z4) {
        if (this.f267t) {
            throw new IllegalStateException("commit already called");
        }
        if (j.L) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new j.c("FragmentManager"));
            j("  ", printWriter);
            printWriter.close();
        }
        this.f267t = true;
        this.f268u = this.f400h ? this.f266s.n(this) : -1;
        this.f266s.i0(this, z4);
        return this.f268u;
    }

    public void j(String str, PrintWriter printWriter) {
        k(str, printWriter, true);
    }

    public void k(String str, PrintWriter printWriter, boolean z4) {
        String str2;
        if (z4) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f402j);
            printWriter.print(" mIndex=");
            printWriter.print(this.f268u);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f267t);
            if (this.f398f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f398f));
                printWriter.print(" mTransitionStyle=#");
                printWriter.println(Integer.toHexString(this.f399g));
            }
            if (this.f394b != 0 || this.f395c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f394b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f395c));
            }
            if (this.f396d != 0 || this.f397e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f396d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f397e));
            }
            if (this.f403k != 0 || this.f404l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f403k));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.f404l);
            }
            if (this.f405m != 0 || this.f406n != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f405m));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f406n);
            }
        }
        if (this.f393a.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = this.f393a.size();
        for (int r12 = 0; r12 < size; r12++) {
            n.a aVar = this.f393a.get(r12);
            switch (aVar.f411a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + aVar.f411a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(r12);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(aVar.f412b);
            if (z4) {
                if (aVar.f413c != 0 || aVar.f414d != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f413c));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f414d));
                }
                if (aVar.f415e != 0 || aVar.f416f != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(aVar.f415e));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(aVar.f416f));
                }
            }
        }
    }

    void l() {
        int size = this.f393a.size();
        for (int r22 = 0; r22 < size; r22++) {
            n.a aVar = this.f393a.get(r22);
            Fragment fragment = aVar.f412b;
            if (fragment != null) {
                fragment.k1(this.f398f, this.f399g);
            }
            switch (aVar.f411a) {
                case 1:
                    fragment.j1(aVar.f413c);
                    this.f266s.l(fragment, false);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f411a);
                case 3:
                    fragment.j1(aVar.f414d);
                    this.f266s.Y0(fragment);
                    break;
                case 4:
                    fragment.j1(aVar.f414d);
                    this.f266s.C0(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f413c);
                    this.f266s.l1(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f414d);
                    this.f266s.x(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f413c);
                    this.f266s.q(fragment);
                    break;
                case 8:
                    this.f266s.k1(fragment);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    this.f266s.k1(null);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    this.f266s.j1(fragment, aVar.f418h);
                    break;
            }
            if (!this.f409q && aVar.f411a != 1 && fragment != null) {
                this.f266s.O0(fragment);
            }
        }
        if (this.f409q) {
            return;
        }
        j jVar = this.f266s;
        jVar.P0(jVar.f328t, true);
    }

    void m(boolean z4) {
        for (int size = this.f393a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f393a.get(size);
            Fragment fragment = aVar.f412b;
            if (fragment != null) {
                fragment.k1(j.d1(this.f398f), this.f399g);
            }
            switch (aVar.f411a) {
                case 1:
                    fragment.j1(aVar.f416f);
                    this.f266s.Y0(fragment);
                    break;
                case 2:
                default:
                    throw new IllegalArgumentException("Unknown cmd: " + aVar.f411a);
                case 3:
                    fragment.j1(aVar.f415e);
                    this.f266s.l(fragment, false);
                    break;
                case 4:
                    fragment.j1(aVar.f415e);
                    this.f266s.l1(fragment);
                    break;
                case 5:
                    fragment.j1(aVar.f416f);
                    this.f266s.C0(fragment);
                    break;
                case 6:
                    fragment.j1(aVar.f415e);
                    this.f266s.q(fragment);
                    break;
                case 7:
                    fragment.j1(aVar.f416f);
                    this.f266s.x(fragment);
                    break;
                case 8:
                    this.f266s.k1(null);
                    break;
                case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                    this.f266s.k1(fragment);
                    break;
                case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                    this.f266s.j1(fragment, aVar.f417g);
                    break;
            }
            if (!this.f409q && aVar.f411a != 3 && fragment != null) {
                this.f266s.O0(fragment);
            }
        }
        if (this.f409q || !z4) {
            return;
        }
        j jVar = this.f266s;
        jVar.P0(jVar.f328t, true);
    }

    Fragment n(ArrayList<Fragment> arrayList, Fragment fragment) {
        Fragment fragment2 = fragment;
        int r4 = 0;
        while (r4 < this.f393a.size()) {
            n.a aVar = this.f393a.get(r4);
            int r6 = aVar.f411a;
            if (r6 != 1) {
                if (r6 == 2) {
                    Fragment fragment3 = aVar.f412b;
                    int r9 = fragment3.A;
                    boolean z4 = false;
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        Fragment fragment4 = arrayList.get(size);
                        if (fragment4.A == r9) {
                            if (fragment4 == fragment3) {
                                z4 = true;
                            } else {
                                if (fragment4 == fragment2) {
                                    this.f393a.add(r4, new n.a(9, fragment4));
                                    r4++;
                                    fragment2 = null;
                                }
                                n.a aVar2 = new n.a(3, fragment4);
                                aVar2.f413c = aVar.f413c;
                                aVar2.f415e = aVar.f415e;
                                aVar2.f414d = aVar.f414d;
                                aVar2.f416f = aVar.f416f;
                                this.f393a.add(r4, aVar2);
                                arrayList.remove(fragment4);
                                r4++;
                            }
                        }
                    }
                    if (z4) {
                        this.f393a.remove(r4);
                        r4--;
                    } else {
                        aVar.f411a = 1;
                        arrayList.add(fragment3);
                    }
                } else if (r6 == 3 || r6 == 6) {
                    arrayList.remove(aVar.f412b);
                    Fragment fragment5 = aVar.f412b;
                    if (fragment5 == fragment2) {
                        this.f393a.add(r4, new n.a(9, fragment5));
                        r4++;
                        fragment2 = null;
                    }
                } else if (r6 != 7) {
                    if (r6 == 8) {
                        this.f393a.add(r4, new n.a(9, fragment2));
                        r4++;
                        fragment2 = aVar.f412b;
                    }
                }
                r4++;
            }
            arrayList.add(aVar.f412b);
            r4++;
        }
        return fragment2;
    }

    public String o() {
        return this.f402j;
    }

    boolean p(int r5) {
        int size = this.f393a.size();
        for (int r22 = 0; r22 < size; r22++) {
            Fragment fragment = this.f393a.get(r22).f412b;
            int r32 = fragment != null ? fragment.A : 0;
            if (r32 != 0 && r32 == r5) {
                return true;
            }
        }
        return false;
    }

    boolean q(ArrayList<a> arrayList, int r11, int r12) {
        if (r12 == r11) {
            return false;
        }
        int size = this.f393a.size();
        int r22 = -1;
        for (int r32 = 0; r32 < size; r32++) {
            Fragment fragment = this.f393a.get(r32).f412b;
            int r4 = fragment != null ? fragment.A : 0;
            if (r4 != 0 && r4 != r22) {
                for (int r23 = r11; r23 < r12; r23++) {
                    a aVar = arrayList.get(r23);
                    int size2 = aVar.f393a.size();
                    for (int r7 = 0; r7 < size2; r7++) {
                        Fragment fragment2 = aVar.f393a.get(r7).f412b;
                        if ((fragment2 != null ? fragment2.A : 0) == r4) {
                            return true;
                        }
                    }
                }
                r22 = r4;
            }
        }
        return false;
    }

    boolean s() {
        for (int r12 = 0; r12 < this.f393a.size(); r12++) {
            if (r(this.f393a.get(r12))) {
                return true;
            }
        }
        return false;
    }

    public void t() {
        if (this.f410r != null) {
            for (int r02 = 0; r02 < this.f410r.size(); r02++) {
                this.f410r.get(r02).run();
            }
            this.f410r = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f268u >= 0) {
            sb.append(" #");
            sb.append(this.f268u);
        }
        if (this.f402j != null) {
            sb.append(" ");
            sb.append(this.f402j);
        }
        sb.append("}");
        return sb.toString();
    }

    void u(Fragment.f fVar) {
        for (int r02 = 0; r02 < this.f393a.size(); r02++) {
            n.a aVar = this.f393a.get(r02);
            if (r(aVar)) {
                aVar.f412b.l1(fVar);
            }
        }
    }

    Fragment v(ArrayList<Fragment> arrayList, Fragment fragment) {
        for (int size = this.f393a.size() - 1; size >= 0; size--) {
            n.a aVar = this.f393a.get(size);
            int r32 = aVar.f411a;
            if (r32 != 1) {
                if (r32 != 3) {
                    switch (r32) {
                        case 8:
                            fragment = null;
                            break;
                        case x.ARRAY_VALUE_FIELD_NUMBER /* 9 */:
                            fragment = aVar.f412b;
                            break;
                        case x.TIMESTAMP_VALUE_FIELD_NUMBER /* 10 */:
                            aVar.f418h = aVar.f417g;
                            break;
                    }
                }
                arrayList.add(aVar.f412b);
            }
            arrayList.remove(aVar.f412b);
        }
        return fragment;
    }
}
