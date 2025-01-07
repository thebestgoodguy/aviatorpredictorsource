package o0;

/* loaded from: classes.dex */
public final class b extends IllegalStateException {
    private b(String str, Throwable th) {
        super(str, th);
    }

    public static IllegalStateException a(h<?> hVar) {
        if (!hVar.o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception l4 = hVar.l();
        String concat = l4 != null ? "failure" : hVar.p() ? "result ".concat(String.valueOf(hVar.m())) : hVar.n() ? "cancellation" : "unknown issue";
        return new b(concat.length() != 0 ? "Complete with: ".concat(concat) : new String("Complete with: "), l4);
    }
}
