package q2;

import java.util.HashMap;
import java.util.Map;
import r2.j;
import r2.q;

/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7298a;

    /* renamed from: b, reason: collision with root package name */
    private byte[] f7299b;

    /* renamed from: c, reason: collision with root package name */
    private r2.j f7300c;

    /* renamed from: d, reason: collision with root package name */
    private j.d f7301d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f7302e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f7303f;

    /* renamed from: g, reason: collision with root package name */
    private final j.c f7304g;

    class a implements j.d {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ byte[] f7305a;

        a(byte[] bArr) {
            this.f7305a = bArr;
        }

        @Override // r2.j.d
        public void a(Object obj) {
            l.this.f7299b = this.f7305a;
        }

        @Override // r2.j.d
        public void b(String str, String str2, Object obj) {
            e2.b.b("RestorationChannel", "Error " + str + " while sending restoration data to framework: " + str2);
        }

        @Override // r2.j.d
        public void c() {
        }
    }

    class b implements j.c {
        b() {
        }

        @Override // r2.j.c
        public void a(r2.i iVar, j.d dVar) {
            Map i4;
            String str = iVar.f7455a;
            Object obj = iVar.f7456b;
            str.hashCode();
            if (str.equals("get")) {
                l.this.f7303f = true;
                if (!l.this.f7302e) {
                    l lVar = l.this;
                    if (lVar.f7298a) {
                        lVar.f7301d = dVar;
                        return;
                    }
                }
                l lVar2 = l.this;
                i4 = lVar2.i(lVar2.f7299b);
            } else if (!str.equals("put")) {
                dVar.c();
                return;
            } else {
                l.this.f7299b = (byte[]) obj;
                i4 = null;
            }
            dVar.a(i4);
        }
    }

    public l(f2.a aVar, boolean z4) {
        this(new r2.j(aVar, "flutter/restoration", q.f7470b), z4);
    }

    l(r2.j jVar, boolean z4) {
        this.f7302e = false;
        this.f7303f = false;
        b bVar = new b();
        this.f7304g = bVar;
        this.f7300c = jVar;
        this.f7298a = z4;
        jVar.e(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, Object> i(byte[] bArr) {
        HashMap hashMap = new HashMap();
        hashMap.put("enabled", Boolean.TRUE);
        hashMap.put("data", bArr);
        return hashMap;
    }

    public void g() {
        this.f7299b = null;
    }

    public byte[] h() {
        return this.f7299b;
    }

    public void j(byte[] bArr) {
        this.f7302e = true;
        j.d dVar = this.f7301d;
        if (dVar != null) {
            dVar.a(i(bArr));
            this.f7301d = null;
        } else if (this.f7303f) {
            this.f7300c.d("push", i(bArr), new a(bArr));
            return;
        }
        this.f7299b = bArr;
    }
}
