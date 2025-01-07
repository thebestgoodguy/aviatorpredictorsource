package defpackage;

import java.util.Spliterator;
import java.util.function.Function;

/* loaded from: classes61.dex */
final class al {
    static <InElementT, OutElementT> Spliterator<OutElementT> a(Spliterator<InElementT> spliterator, Function<? super InElementT, Spliterator<OutElementT>> function, int r11, long j) {
        ai.a((r11 & 16384) == 0, "flatMap does not support SUBSIZED characteristic");
        ai.a((r11 & 4) == 0, "flatMap does not support SORTED characteristic");
        ai.a(spliterator);
        ai.a(function);
        return new ao(null, spliterator, function, r11, j);
    }
}
