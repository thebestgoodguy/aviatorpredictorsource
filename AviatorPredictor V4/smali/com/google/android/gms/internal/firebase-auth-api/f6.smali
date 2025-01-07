.class public final Lcom/google/android/gms/internal/firebase-auth-api/f6;
.super Lcom/google/android/gms/internal/firebase-auth-api/s7;
.source ""


# static fields
.field private static final e:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/f6;->e:[B

    return-void
.end method

.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/d6;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/r2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/d6;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/db;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s7;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method static bridge synthetic l()[B
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/f6;->e:[B

    return-object v0
.end method

.method static bridge synthetic m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;
    .locals 4

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->z()Lcom/google/android/gms/internal/firebase-auth-api/wa;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->z()Lcom/google/android/gms/internal/firebase-auth-api/jb;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    const/4 v2, 0x5

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    invoke-static {p4}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p4

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/jb;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/jb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p4

    check-cast p4, Lcom/google/android/gms/internal/firebase-auth-api/kb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object v0

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->b()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->c()[B

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {p3}, Lcom/google/android/gms/internal/firebase-auth-api/c3;->d()I

    move-result p3

    add-int/lit8 p3, p3, -0x1

    if-eqz p3, :cond_1

    const/4 v3, 0x1

    if-eq p3, v3, :cond_2

    const/4 v1, 0x2

    if-eq p3, v1, :cond_0

    const/4 v1, 0x6

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x3

    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ua;->z()Lcom/google/android/gms/internal/firebase-auth-api/ta;

    move-result-object v0

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ta;->p(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/ta;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p3

    check-cast p3, Lcom/google/android/gms/internal/firebase-auth-api/ua;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->A()Lcom/google/android/gms/internal/firebase-auth-api/za;

    move-result-object v0

    invoke-virtual {v0, p4}, Lcom/google/android/gms/internal/firebase-auth-api/za;->q(Lcom/google/android/gms/internal/firebase-auth-api/kb;)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {v0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/za;->p(Lcom/google/android/gms/internal/firebase-auth-api/ua;)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {v0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/za;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/za;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/ab;

    invoke-virtual {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/wa;->p(Lcom/google/android/gms/internal/firebase-auth-api/ab;)Lcom/google/android/gms/internal/firebase-auth-api/wa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-direct {p0, p1, p5}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e6;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/e6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/f6;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/db;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/db;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/db;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/db;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/db;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/db;->D()Lcom/google/android/gms/internal/firebase-auth-api/hb;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->A()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->a(Lcom/google/android/gms/internal/firebase-auth-api/ab;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid ECIES private key"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x4

    return v0
.end method

.method public final synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/db;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/db;->D()Lcom/google/android/gms/internal/firebase-auth-api/hb;

    move-result-object p1

    return-object p1
.end method
