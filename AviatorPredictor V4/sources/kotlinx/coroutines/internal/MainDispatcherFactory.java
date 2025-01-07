package kotlinx.coroutines.internal;

import b4.z1;
import java.util.List;

/* loaded from: classes.dex */
public interface MainDispatcherFactory {
    z1 createDispatcher(List<? extends MainDispatcherFactory> list);

    int getLoadPriority();

    String hintOnError();
}
