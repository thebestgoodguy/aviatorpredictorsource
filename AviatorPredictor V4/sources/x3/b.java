package x3;

import java.util.NoSuchElementException;
import l3.v;

/* loaded from: classes.dex */
public final class b extends v {

    /* renamed from: e, reason: collision with root package name */
    private final int f8300e;

    /* renamed from: f, reason: collision with root package name */
    private final int f8301f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f8302g;

    /* renamed from: h, reason: collision with root package name */
    private int f8303h;

    public b(int r32, int r4, int r5) {
        this.f8300e = r5;
        this.f8301f = r4;
        boolean z4 = true;
        if (r5 <= 0 ? r32 < r4 : r32 > r4) {
            z4 = false;
        }
        this.f8302g = z4;
        this.f8303h = z4 ? r32 : r4;
    }

    @Override // l3.v
    public int c() {
        int r02 = this.f8303h;
        if (r02 != this.f8301f) {
            this.f8303h = this.f8300e + r02;
        } else {
            if (!this.f8302g) {
                throw new NoSuchElementException();
            }
            this.f8302g = false;
        }
        return r02;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f8302g;
    }
}
