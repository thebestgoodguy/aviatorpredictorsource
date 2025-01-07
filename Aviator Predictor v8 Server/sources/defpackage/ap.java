package defpackage;

import com.android.tools.r8.annotations.SynthesizedClassV2;
import defpackage.ap;
import java.util.Collection;
import java.util.Set;
import java.util.Spliterator;
import java.util.function.Consumer;

/* loaded from: classes61.dex */
public interface ap<E> extends Collection<E> {

    /* compiled from: D8$$SyntheticClass */
    @SynthesizedClassV2(kind = 7, versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761")
    /* renamed from: ap$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<E> {
        public static void $default$forEach(ap _this, final Consumer consumer) {
            ai.a(consumer);
            _this.a().forEach(new Consumer() { // from class: ap$$ExternalSyntheticLambda0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    ap.CC.a(consumer, (aq) obj);
                }
            });
        }

        public static /* synthetic */ void a(Consumer consumer, aq aqVar) {
            Object a = aqVar.a();
            int b = aqVar.b();
            for (int r1 = 0; r1 < b; r1++) {
                consumer.accept(a);
            }
        }
    }

    Set<aq<E>> a();

    @Override // java.lang.Iterable
    void forEach(Consumer<? super E> consumer);

    @Override // java.util.Collection
    int size();

    @Override // java.util.Collection, java.lang.Iterable
    Spliterator<E> spliterator();
}
