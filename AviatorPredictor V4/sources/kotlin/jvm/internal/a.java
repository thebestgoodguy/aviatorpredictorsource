package kotlin.jvm.internal;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a implements y3.b, Serializable {
    public static final Object NO_RECEIVER = C0064a.f6382e;
    private final boolean isTopLevel;
    private final String name;
    private final Class owner;
    protected final Object receiver;
    private transient y3.b reflected;
    private final String signature;

    /* renamed from: kotlin.jvm.internal.a$a, reason: collision with other inner class name */
    private static class C0064a implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final C0064a f6382e = new C0064a();

        private C0064a() {
        }
    }

    public a() {
        this(NO_RECEIVER);
    }

    protected a(Object obj) {
        this(obj, null, null, null, false);
    }

    protected a(Object obj, Class cls, String str, String str2, boolean z4) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z4;
    }

    @Override // y3.b
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // y3.b
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    public y3.b compute() {
        y3.b bVar = this.reflected;
        if (bVar != null) {
            return bVar;
        }
        y3.b computeReflected = computeReflected();
        this.reflected = computeReflected;
        return computeReflected;
    }

    protected abstract y3.b computeReflected();

    @Override // y3.a
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    public Object getBoundReceiver() {
        return this.receiver;
    }

    public String getName() {
        return this.name;
    }

    public y3.d getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? l.c(cls) : l.b(cls);
    }

    @Override // y3.b
    public List<Object> getParameters() {
        return getReflected().getParameters();
    }

    protected y3.b getReflected() {
        y3.b compute = compute();
        if (compute != this) {
            return compute;
        }
        throw new t3.b();
    }

    @Override // y3.b
    public y3.f getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // y3.b
    public List<Object> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // y3.b
    public y3.g getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // y3.b
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // y3.b
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // y3.b
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // y3.b
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }
}
