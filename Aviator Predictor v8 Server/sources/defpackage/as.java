package defpackage;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Future;

@DoNotMock("Use the methods in Futures (like immediateFuture) or SettableFuture")
/* loaded from: classes61.dex */
public interface as<V> extends Future<V> {
}
