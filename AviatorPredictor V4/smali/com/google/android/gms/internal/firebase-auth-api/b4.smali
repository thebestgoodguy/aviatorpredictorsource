.class public final Lcom/google/android/gms/internal/firebase-auth-api/b4;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# static fields
.field public static final a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final e:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final f:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final g:Lcom/google/android/gms/internal/firebase-auth-api/xc;

.field public static final h:Lcom/google/android/gms/internal/firebase-auth-api/xc;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x10

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->b(I)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v1

    sput-object v1, Lcom/google/android/gms/internal/firebase-auth-api/b4;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    const/16 v1, 0x20

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->b(I)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/b4;->b:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {v0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->a(II)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/b4;->c:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->a(II)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v2

    sput-object v2, Lcom/google/android/gms/internal/firebase-auth-api/b4;->d:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    const/4 v2, 0x5

    invoke-static {v0, v0, v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v3

    sput-object v3, Lcom/google/android/gms/internal/firebase-auth-api/b4;->e:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {v1, v0, v1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/b4;->c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b4;->f:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/w4;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/w4;-><init>()V

    const-string v1, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key"

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b4;->g:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object v0

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/h5;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/h5;-><init>()V

    const-string v2, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key"

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b4;->h:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-void
.end method

.method public static a(II)Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/n9;->A()Lcom/google/android/gms/internal/firebase-auth-api/m9;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/m9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/m9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/q9;->A()Lcom/google/android/gms/internal/firebase-auth-api/p9;

    move-result-object p0

    const/16 v0, 0x10

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/p9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/p9;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/q9;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/m9;->q(Lcom/google/android/gms/internal/firebase-auth-api/q9;)Lcom/google/android/gms/internal/firebase-auth-api/m9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/n9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/rq;->g()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/n4;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/n4;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    const/4 p0, 0x3

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-object p0
.end method

.method public static b(I)Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/w9;->A()Lcom/google/android/gms/internal/firebase-auth-api/v9;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/v9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/v9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/w9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object v0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/rq;->g()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/q4;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/q4;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    const/4 p0, 0x3

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-object p0
.end method

.method public static c(IIIII)Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->A()Lcom/google/android/gms/internal/firebase-auth-api/c9;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/h9;->A()Lcom/google/android/gms/internal/firebase-auth-api/g9;

    move-result-object p2

    const/16 p4, 0x10

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/g9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/g9;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/h9;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/c9;->q(Lcom/google/android/gms/internal/firebase-auth-api/h9;)Lcom/google/android/gms/internal/firebase-auth-api/c9;

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/c9;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/c9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/e9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->A()Lcom/google/android/gms/internal/firebase-auth-api/wb;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->A()Lcom/google/android/gms/internal/firebase-auth-api/zb;

    move-result-object p2

    const/4 p4, 0x5

    invoke-virtual {p2, p4}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/ac;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->q(Lcom/google/android/gms/internal/firebase-auth-api/ac;)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    const/16 p2, 0x20

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->z()Lcom/google/android/gms/internal/firebase-auth-api/w8;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/w8;->p(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/w8;

    invoke-virtual {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/w8;->q(Lcom/google/android/gms/internal/firebase-auth-api/xb;)Lcom/google/android/gms/internal/firebase-auth-api/w8;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object p1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/rq;->g()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/h4;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/h4;-><init>()V

    const-string p0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    const/4 p0, 0x3

    invoke-virtual {p1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-object p0
.end method
