.class final Lcom/google/android/gms/internal/firebase-auth-api/p6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/ve;


# instance fields
.field private final a:Ljava/lang/String;

.field private final b:I

.field private c:Lcom/google/android/gms/internal/firebase-auth-api/t9;

.field private d:Lcom/google/android/gms/internal/firebase-auth-api/u8;

.field private e:I

.field private f:Lcom/google/android/gms/internal/firebase-auth-api/ga;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xc;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->D()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/a4;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    :try_start_0
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/w9;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/w9;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->d(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/t9;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->c:Lcom/google/android/gms/internal/firebase-auth-api/t9;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w9;->z()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "invalid KeyFormat protobuf, expected AesGcmKeyFormat"

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/a4;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat"

    if-eqz v1, :cond_1

    :try_start_1
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/x8;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->d(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->d:Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->C()Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->z()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->e:I

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->D()Lcom/google/android/gms/internal/firebase-auth-api/xb;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->z()I

    move-result p1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->e:I

    add-int/2addr v0, p1

    iput v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I
    :try_end_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_1 .. :try_end_1} :catch_1

    return-void

    :catch_1
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    :try_start_2
    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v0

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->d(Lcom/google/android/gms/internal/firebase-auth-api/xc;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ga;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->f:Lcom/google/android/gms/internal/firebase-auth-api/ga;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->z()I

    move-result p1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I
    :try_end_2
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_2 .. :try_end_2} :catch_2

    return-void

    :catch_2
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-direct {v0, v2, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "unsupported AEAD DEM key type: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final a()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I

    return v0
.end method

.method public final b([B)Lcom/google/android/gms/internal/firebase-auth-api/g7;
    .locals 4

    const-class v0, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    array-length v1, p1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I

    if-ne v1, v2, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    sget-object v2, Lcom/google/android/gms/internal/firebase-auth-api/a4;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/t9;->A()Lcom/google/android/gms/internal/firebase-auth-api/s9;

    move-result-object v1

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->c:Lcom/google/android/gms/internal/firebase-auth-api/t9;

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I

    invoke-static {p1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->B([BII)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s9;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/s9;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/t9;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g7;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->i(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g7;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/m2;)V

    return-object v1

    :cond_0
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    sget-object v3, Lcom/google/android/gms/internal/firebase-auth-api/a4;->a:Ljava/lang/String;

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->e:I

    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->e:I

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I

    invoke-static {p1, v2, v3}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/a9;->A()Lcom/google/android/gms/internal/firebase-auth-api/z8;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->d:Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->D()Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v1

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/z8;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/z8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/a9;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->A()Lcom/google/android/gms/internal/firebase-auth-api/tb;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->d:Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->E()Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/tb;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/tb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ub;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->A()Lcom/google/android/gms/internal/firebase-auth-api/t8;

    move-result-object v2

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->d:Lcom/google/android/gms/internal/firebase-auth-api/u8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->z()I

    move-result v3

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->p(Lcom/google/android/gms/internal/firebase-auth-api/a9;)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->q(Lcom/google/android/gms/internal/firebase-auth-api/ub;)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/g7;

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    invoke-static {v2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->i(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-direct {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g7;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/m2;)V

    return-object v1

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/z5;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ga;->A()Lcom/google/android/gms/internal/firebase-auth-api/fa;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->f:Lcom/google/android/gms/internal/firebase-auth-api/ga;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->b:I

    invoke-static {p1, v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->B([BII)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fa;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/fa;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ga;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/g7;

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/p6;->a:Ljava/lang/String;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/q2;

    invoke-static {v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->i(Ljava/lang/String;Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/q2;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/g7;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/q2;)V

    return-object v0

    :cond_2
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown DEM key type"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Symmetric key has incorrect length"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
