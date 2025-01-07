package h1;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.json.JSONObject;
import p1.v;

/* loaded from: classes.dex */
public class f {

    /* renamed from: g, reason: collision with root package name */
    private static final Charset f3912g = Charset.forName("UTF-8");

    /* renamed from: a, reason: collision with root package name */
    private final g f3913a;

    /* renamed from: b, reason: collision with root package name */
    private final InputStream f3914b;

    /* renamed from: c, reason: collision with root package name */
    private final InputStreamReader f3915c;

    /* renamed from: d, reason: collision with root package name */
    e f3916d;

    /* renamed from: e, reason: collision with root package name */
    private ByteBuffer f3917e;

    /* renamed from: f, reason: collision with root package name */
    long f3918f;

    public f(g gVar, InputStream inputStream) {
        this.f3913a = gVar;
        this.f3914b = inputStream;
        this.f3915c = new InputStreamReader(inputStream);
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        this.f3917e = allocate;
        allocate.flip();
    }

    private IllegalArgumentException a(String str) {
        b();
        throw new IllegalArgumentException("Invalid bundle: " + str);
    }

    private c c(String str) {
        JSONObject jSONObject = new JSONObject(str);
        if (jSONObject.has("metadata")) {
            e b5 = this.f3913a.b(jSONObject.getJSONObject("metadata"));
            v.a("BundleElement", "BundleMetadata element loaded", new Object[0]);
            return b5;
        }
        if (jSONObject.has("namedQuery")) {
            j q4 = this.f3913a.q(jSONObject.getJSONObject("namedQuery"));
            v.a("BundleElement", "Query loaded: " + q4.b(), new Object[0]);
            return q4;
        }
        if (jSONObject.has("documentMetadata")) {
            h c5 = this.f3913a.c(jSONObject.getJSONObject("documentMetadata"));
            v.a("BundleElement", "Document metadata loaded: " + c5.b(), new Object[0]);
            return c5;
        }
        if (!jSONObject.has("document")) {
            throw a("Cannot decode unknown Bundle element: " + str);
        }
        b f5 = this.f3913a.f(jSONObject.getJSONObject("document"));
        v.a("BundleElement", "Document loaded: " + f5.b(), new Object[0]);
        return f5;
    }

    private int g() {
        this.f3917e.mark();
        int r02 = 0;
        while (true) {
            try {
                if (r02 >= this.f3917e.remaining()) {
                    r02 = -1;
                    break;
                }
                if (this.f3917e.get() == 123) {
                    break;
                }
                r02++;
            } finally {
                this.f3917e.reset();
            }
        }
        return r02;
    }

    private boolean h() {
        this.f3917e.compact();
        int read = this.f3914b.read(this.f3917e.array(), this.f3917e.arrayOffset() + this.f3917e.position(), this.f3917e.remaining());
        boolean z4 = read > 0;
        if (z4) {
            ByteBuffer byteBuffer = this.f3917e;
            byteBuffer.position(byteBuffer.position() + read);
        }
        this.f3917e.flip();
        return z4;
    }

    private String i(int r6) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (r6 > 0) {
            if (this.f3917e.remaining() == 0 && !h()) {
                throw a("Reached the end of bundle when more data was expected.");
            }
            int min = Math.min(r6, this.f3917e.remaining());
            byteArrayOutputStream.write(this.f3917e.array(), this.f3917e.arrayOffset() + this.f3917e.position(), min);
            ByteBuffer byteBuffer = this.f3917e;
            byteBuffer.position(byteBuffer.position() + min);
            r6 -= min;
        }
        return byteArrayOutputStream.toString(f3912g.name());
    }

    private String j() {
        int g5;
        do {
            g5 = g();
            if (g5 != -1) {
                break;
            }
        } while (h());
        if (this.f3917e.remaining() == 0) {
            return null;
        }
        if (g5 == -1) {
            throw a("Reached the end of bundle when a length string is expected.");
        }
        byte[] bArr = new byte[g5];
        this.f3917e.get(bArr);
        return f3912g.decode(ByteBuffer.wrap(bArr)).toString();
    }

    private c k() {
        String j4 = j();
        if (j4 == null) {
            return null;
        }
        String i4 = i(Integer.parseInt(j4));
        this.f3918f += j4.getBytes(f3912g).length + r1;
        return c(i4);
    }

    public void b() {
        this.f3914b.close();
    }

    public e d() {
        e eVar = this.f3916d;
        if (eVar != null) {
            return eVar;
        }
        c k4 = k();
        if (!(k4 instanceof e)) {
            throw a("Expected first element in bundle to be a metadata object");
        }
        e eVar2 = (e) k4;
        this.f3916d = eVar2;
        this.f3918f = 0L;
        return eVar2;
    }

    public long e() {
        return this.f3918f;
    }

    public c f() {
        d();
        return k();
    }
}
