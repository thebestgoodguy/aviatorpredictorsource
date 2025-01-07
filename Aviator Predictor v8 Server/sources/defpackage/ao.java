package defpackage;

import java.util.Spliterator;
import java.util.function.Function;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
final class ao<InElementT, OutElementT> extends am<InElementT, OutElementT, Spliterator<OutElementT>> {
    ao(@CheckForNull Spliterator<OutElementT> spliterator, Spliterator<InElementT> spliterator2, Function<? super InElementT, Spliterator<OutElementT>> function, int r12, long j) {
        super(spliterator, spliterator2, function, new an() { // from class: ao$$ExternalSyntheticLambda0
            @Override // defpackage.an
            public final Spliterator newFlatMapSpliterator(Spliterator spliterator3, Spliterator spliterator4, Function function2, int r122, long j2) {
                return new ao(spliterator3, spliterator4, function2, r122, j2);
            }
        }, r12, j);
    }
}
