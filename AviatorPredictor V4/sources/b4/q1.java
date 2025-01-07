package b4;

import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public final class q1 extends CancellationException implements e0<q1> {

    /* renamed from: e, reason: collision with root package name */
    public final p1 f1045e;

    public q1(String str, Throwable th, p1 p1Var) {
        super(str);
        this.f1045e = p1Var;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // b4.e0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q1 a() {
        if (!q0.c()) {
            return null;
        }
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        return new q1(message, this, this.f1045e);
    }

    public boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof q1) {
                q1 q1Var = (q1) obj;
                if (!kotlin.jvm.internal.i.a(q1Var.getMessage(), getMessage()) || !kotlin.jvm.internal.i.a(q1Var.f1045e, this.f1045e) || !kotlin.jvm.internal.i.a(q1Var.getCause(), getCause())) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        if (q0.c()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    public int hashCode() {
        String message = getMessage();
        kotlin.jvm.internal.i.b(message);
        int hashCode = ((message.hashCode() * 31) + this.f1045e.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "; job=" + this.f1045e;
    }
}
