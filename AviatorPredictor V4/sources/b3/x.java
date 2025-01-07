package b3;

import b3.a;
import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final a.c<String> f971d = a.c.a("io.grpc.EquivalentAddressGroup.authorityOverride");

    /* renamed from: a, reason: collision with root package name */
    private final List<SocketAddress> f972a;

    /* renamed from: b, reason: collision with root package name */
    private final a f973b;

    /* renamed from: c, reason: collision with root package name */
    private final int f974c;

    public x(SocketAddress socketAddress) {
        this(socketAddress, a.f683b);
    }

    public x(SocketAddress socketAddress, a aVar) {
        this((List<SocketAddress>) Collections.singletonList(socketAddress), aVar);
    }

    public x(List<SocketAddress> list) {
        this(list, a.f683b);
    }

    public x(List<SocketAddress> list, a aVar) {
        q0.l.e(!list.isEmpty(), "addrs is empty");
        List<SocketAddress> unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        this.f972a = unmodifiableList;
        this.f973b = (a) q0.l.o(aVar, "attrs");
        this.f974c = unmodifiableList.hashCode();
    }

    public List<SocketAddress> a() {
        return this.f972a;
    }

    public a b() {
        return this.f973b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (this.f972a.size() != xVar.f972a.size()) {
            return false;
        }
        for (int r02 = 0; r02 < this.f972a.size(); r02++) {
            if (!this.f972a.get(r02).equals(xVar.f972a.get(r02))) {
                return false;
            }
        }
        return this.f973b.equals(xVar.f973b);
    }

    public int hashCode() {
        return this.f974c;
    }

    public String toString() {
        return "[" + this.f972a + "/" + this.f973b + "]";
    }
}
