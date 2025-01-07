package defpackage;

import java.util.Collections;
import java.util.Spliterator;
import java.util.function.Function;

/* loaded from: classes61.dex */
public final class ar {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <E> Spliterator<E> a(ap<E> apVar) {
        Spliterator<aq<E>> spliterator = apVar.a().spliterator();
        return al.a(spliterator, new Function() { // from class: ar$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                Spliterator a;
                a = ar.a((aq) obj);
                return a;
            }
        }, (spliterator.characteristics() & 1296) | 64, apVar.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Spliterator a(aq aqVar) {
        return Collections.nCopies(aqVar.b(), aqVar.a()).spliterator();
    }
}
