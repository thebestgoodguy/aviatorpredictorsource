package defpackage;

import java.util.Spliterator;
import java.util.function.Function;
import javax.annotation.CheckForNull;

@FunctionalInterface
/* loaded from: classes61.dex */
interface an<InElementT, OutSpliteratorT extends Spliterator<?>> {
    OutSpliteratorT newFlatMapSpliterator(@CheckForNull OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, int r4, long j);
}
