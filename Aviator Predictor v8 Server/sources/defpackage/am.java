package defpackage;

import androidx.core.location.LocationRequestCompat;
import com.google.j2objc.annotations.Weak;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Function;
import javax.annotation.CheckForNull;

/* loaded from: classes61.dex */
abstract class am<InElementT, OutElementT, OutSpliteratorT extends Spliterator<OutElementT>> implements Spliterator<OutElementT> {

    @Weak
    @CheckForNull
    OutSpliteratorT a;
    final Spliterator<InElementT> b;
    final Function<? super InElementT, OutSpliteratorT> c;
    final an<InElementT, OutSpliteratorT> d;
    int e;
    long f;

    am(@CheckForNull OutSpliteratorT outspliteratort, Spliterator<InElementT> spliterator, Function<? super InElementT, OutSpliteratorT> function, an<InElementT, OutSpliteratorT> anVar, int r5, long j) {
        this.a = outspliteratort;
        this.b = spliterator;
        this.c = function;
        this.d = anVar;
        this.e = r5;
        this.f = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Object obj) {
        this.a = this.c.apply(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Consumer consumer, Object obj) {
        OutSpliteratorT apply = this.c.apply(obj);
        if (apply != null) {
            apply.forEachRemaining(consumer);
        }
    }

    @Override // java.util.Spliterator
    public final int characteristics() {
        return this.e;
    }

    @Override // java.util.Spliterator
    public final long estimateSize() {
        OutSpliteratorT outspliteratort = this.a;
        if (outspliteratort != null) {
            this.f = Math.max(this.f, outspliteratort.estimateSize());
        }
        return Math.max(this.f, 0L);
    }

    @Override // java.util.Spliterator
    public final void forEachRemaining(final Consumer<? super OutElementT> consumer) {
        OutSpliteratorT outspliteratort = this.a;
        if (outspliteratort != null) {
            outspliteratort.forEachRemaining(consumer);
            this.a = null;
        }
        this.b.forEachRemaining(new Consumer() { // from class: am$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                am.this.a(consumer, obj);
            }
        });
        this.f = 0L;
    }

    @Override // java.util.Spliterator
    public final boolean tryAdvance(Consumer<? super OutElementT> consumer) {
        do {
            OutSpliteratorT outspliteratort = this.a;
            if (outspliteratort != null && outspliteratort.tryAdvance(consumer)) {
                long j = this.f;
                if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                    return true;
                }
                this.f = j - 1;
                return true;
            }
            this.a = null;
        } while (this.b.tryAdvance(new Consumer() { // from class: am$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                am.this.a(obj);
            }
        }));
        return false;
    }

    @Override // java.util.Spliterator
    @CheckForNull
    public final OutSpliteratorT trySplit() {
        Spliterator<InElementT> trySplit = this.b.trySplit();
        if (trySplit == null) {
            OutSpliteratorT outspliteratort = this.a;
            if (outspliteratort == null) {
                return null;
            }
            this.a = null;
            return outspliteratort;
        }
        int r5 = this.e & (-65);
        long estimateSize = estimateSize();
        if (estimateSize < LocationRequestCompat.PASSIVE_INTERVAL) {
            estimateSize /= 2;
            this.f -= estimateSize;
            this.e = r5;
        }
        OutSpliteratorT newFlatMapSpliterator = this.d.newFlatMapSpliterator(this.a, trySplit, this.c, r5, estimateSize);
        this.a = null;
        return newFlatMapSpliterator;
    }
}
