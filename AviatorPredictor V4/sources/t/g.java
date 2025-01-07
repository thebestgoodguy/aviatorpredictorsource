package t;

import com.google.android.gms.common.api.Status;
import java.util.concurrent.TimeUnit;
import t.k;

/* loaded from: classes.dex */
public abstract class g<R extends k> {

    public interface a {
        void a(Status status);
    }

    public abstract void a(a aVar);

    public abstract R b(long j4, TimeUnit timeUnit);
}
