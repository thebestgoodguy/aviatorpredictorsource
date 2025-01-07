package defpackage;

import com.android.tools.r8.annotations.SynthesizedClassV2;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.function.Predicate;

@FunctionalInterface
/* loaded from: classes61.dex */
public interface aj<T> extends Predicate<T> {

    /* compiled from: D8$$SyntheticClass */
    @SynthesizedClassV2(kind = 7, versionHash = "79350b666c61fb98f585652cf8eb3be7850d2ab8c16c1e890d0171be2ca2d761")
    /* renamed from: aj$-CC, reason: invalid class name */
    public final /* synthetic */ class CC<T> {
    }

    @CanIgnoreReturnValue
    boolean a(T t);

    @Override // java.util.function.Predicate
    boolean test(T t);
}
