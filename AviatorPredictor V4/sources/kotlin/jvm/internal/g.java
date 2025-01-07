package kotlin.jvm.internal;

/* loaded from: classes.dex */
public class g extends a implements f, y3.e {
    private final int arity;
    private final int flags;

    public g(int r8) {
        this(r8, a.NO_RECEIVER, null, null, null, 0);
    }

    public g(int r8, Object obj) {
        this(r8, obj, null, null, null, 0);
    }

    public g(int r9, Object obj, Class cls, String str, String str2, int r14) {
        super(obj, cls, str, str2, (r14 & 1) == 1);
        this.arity = r9;
        this.flags = r14 >> 1;
    }

    @Override // kotlin.jvm.internal.a
    protected y3.b computeReflected() {
        return l.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            return i.a(getOwner(), gVar.getOwner()) && getName().equals(gVar.getName()) && getSignature().equals(gVar.getSignature()) && this.flags == gVar.flags && this.arity == gVar.arity && i.a(getBoundReceiver(), gVar.getBoundReceiver());
        }
        if (obj instanceof y3.e) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.f
    public int getArity() {
        return this.arity;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.a
    public y3.e getReflected() {
        return (y3.e) super.getReflected();
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // y3.e
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // y3.e
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // y3.e
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // y3.e
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.a, y3.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        y3.b compute = compute();
        if (compute != this) {
            return compute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }
}
