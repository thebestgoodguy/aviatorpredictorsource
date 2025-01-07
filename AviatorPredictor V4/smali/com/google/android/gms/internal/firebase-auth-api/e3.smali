.class public final Lcom/google/android/gms/internal/firebase-auth-api/e3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/fd;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    return-void
.end method

.method static final a(Lcom/google/android/gms/internal/firebase-auth-api/fd;)Lcom/google/android/gms/internal/firebase-auth-api/e3;
    .locals 1

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;->i(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e3;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    return-object v0
.end method

.method public static final h(Lcom/google/android/gms/internal/firebase-auth-api/m7;Lcom/google/android/gms/internal/firebase-auth-api/m2;)Lcom/google/android/gms/internal/firebase-auth-api/e3;
    .locals 2

    const/4 v0, 0x0

    new-array v0, v0, [B

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/m7;->a()Lcom/google/android/gms/internal/firebase-auth-api/pb;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/pb;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->q()I

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/e3;

    :try_start_0
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/pb;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object p0

    invoke-interface {p1, p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/m2;->a([B[B)[B

    move-result-object p0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object p1

    invoke-static {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->E([BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/fd;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;->i(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    return-object v1

    :catch_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "invalid keyset, corrupted key material"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string p1, "empty keyset"

    invoke-direct {p0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private static i(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->z()I

    move-result p0

    if-lez p0, :cond_0

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "empty keyset"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final b()Lcom/google/android/gms/internal/firebase-auth-api/e3;
    .locals 7

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    if-eqz v0, :cond_3

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->B()Lcom/google/android/gms/internal/firebase-auth-api/cd;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->F()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->G()I

    move-result v4

    const/4 v5, 0x4

    if-ne v4, v5, :cond_1

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->D()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v3

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/u2;

    move-result-object v5

    instance-of v6, v5, Lcom/google/android/gms/internal/firebase-auth-api/u3;

    if-eqz v6, :cond_0

    check-cast v5, Lcom/google/android/gms/internal/firebase-auth-api/u3;

    invoke-interface {v5, v3}, Lcom/google/android/gms/internal/firebase-auth-api/u3;->c(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v3

    invoke-static {v3}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->f(Lcom/google/android/gms/internal/firebase-auth-api/sc;)Ljava/lang/Object;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->B()Lcom/google/android/gms/internal/firebase-auth-api/dd;

    move-result-object v4

    invoke-virtual {v4, v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->e(Lcom/google/android/gms/internal/firebase-auth-api/ks;)Lcom/google/android/gms/internal/firebase-auth-api/hs;

    invoke-virtual {v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/dd;->p(Lcom/google/android/gms/internal/firebase-auth-api/sc;)Lcom/google/android/gms/internal/firebase-auth-api/dd;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    invoke-virtual {v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->q(Lcom/google/android/gms/internal/firebase-auth-api/ed;)Lcom/google/android/gms/internal/firebase-auth-api/cd;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/security/GeneralSecurityException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "manager for key type "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " is not a PrivateKeyManager"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "The keyset contains a non-private key"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->A()I

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/cd;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/cd;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/e3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/e3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    return-object v1

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "cleartext keyset is not available"

    invoke-direct {v0, v1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method final c()Lcom/google/android/gms/internal/firebase-auth-api/fd;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    return-object v0
.end method

.method public final d()Lcom/google/android/gms/internal/firebase-auth-api/ld;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/z3;->a(Lcom/google/android/gms/internal/firebase-auth-api/fd;)Lcom/google/android/gms/internal/firebase-auth-api/ld;

    move-result-object v0

    return-object v0
.end method

.method public final e(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 7

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->e(Ljava/lang/Class;)Ljava/lang/Class;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/z3;->b(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/l3;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l3;-><init>(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/k3;)V

    iget-object v2, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->F()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->G()I

    move-result v4

    const/4 v5, 0x3

    if-ne v4, v5, :cond_0

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v4

    invoke-static {v4, v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->g(Lcom/google/android/gms/internal/firebase-auth-api/sc;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->z()I

    move-result v5

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->A()I

    move-result v6

    if-ne v5, v6, :cond_1

    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l3;->a(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/ed;)Lcom/google/android/gms/internal/firebase-auth-api/l3;

    goto :goto_0

    :cond_1
    invoke-virtual {v1, v4, v3}, Lcom/google/android/gms/internal/firebase-auth-api/l3;->b(Ljava/lang/Object;Lcom/google/android/gms/internal/firebase-auth-api/ed;)Lcom/google/android/gms/internal/firebase-auth-api/l3;

    goto :goto_0

    :cond_2
    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/l3;->c()Lcom/google/android/gms/internal/firebase-auth-api/s3;

    move-result-object v0

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->k(Lcom/google/android/gms/internal/firebase-auth-api/s3;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_3
    new-instance v0, Ljava/security/GeneralSecurityException;

    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v1, "No wrapper found for "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final f(Lcom/google/android/gms/internal/firebase-auth-api/g3;Lcom/google/android/gms/internal/firebase-auth-api/m2;)V
    .locals 3

    const/4 v0, 0x0

    new-array v0, v0, [B

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/rq;->m()[B

    move-result-object v2

    invoke-interface {p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/m2;->b([B[B)[B

    move-result-object v2

    :try_start_0
    invoke-interface {p2, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/m2;->a([B[B)[B

    move-result-object p2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->E([BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/fd;

    move-result-object p2

    invoke-virtual {p2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->equals(Ljava/lang/Object;)Z

    move-result p2
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pb;->z()Lcom/google/android/gms/internal/firebase-auth-api/ob;

    move-result-object p2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ob;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/ob;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/z3;->a(Lcom/google/android/gms/internal/firebase-auth-api/fd;)Lcom/google/android/gms/internal/firebase-auth-api/ld;

    move-result-object v0

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ob;->q(Lcom/google/android/gms/internal/firebase-auth-api/ld;)Lcom/google/android/gms/internal/firebase-auth-api/ob;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p2

    check-cast p2, Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-interface {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/g3;->a(Lcom/google/android/gms/internal/firebase-auth-api/pb;)V

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "cannot encrypt keyset"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "invalid keyset, corrupted key material"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final g(Lcom/google/android/gms/internal/firebase-auth-api/g3;)V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->F()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->G()I

    move-result v2

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    if-eq v2, v5, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->G()I

    move-result v2

    if-eq v2, v4, :cond_1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->G()I

    move-result v2

    if-ne v2, v3, :cond_0

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    new-array v0, v5, [Ljava/lang/Object;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->G()I

    move-result v2

    if-eq v2, v5, :cond_6

    if-eq v2, v4, :cond_5

    if-eq v2, v3, :cond_4

    const/4 v3, 0x5

    if-eq v2, v3, :cond_3

    const/4 v3, 0x6

    if-eq v2, v3, :cond_2

    const-string v2, "UNRECOGNIZED"

    goto :goto_0

    :cond_2
    const-string v2, "REMOTE"

    goto :goto_0

    :cond_3
    const-string v2, "ASYMMETRIC_PUBLIC"

    goto :goto_0

    :cond_4
    const-string v2, "ASYMMETRIC_PRIVATE"

    goto :goto_0

    :cond_5
    const-string v2, "SYMMETRIC"

    goto :goto_0

    :cond_6
    const-string v2, "UNKNOWN_KEYMATERIAL"

    :goto_0
    const/4 v3, 0x0

    aput-object v2, v0, v3

    const/4 v2, 0x1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/ed;->A()Lcom/google/android/gms/internal/firebase-auth-api/sc;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->D()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v0, v2

    const-string v1, "keyset contains key material of type %s for type url %s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-interface {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/g3;->b(Lcom/google/android/gms/internal/firebase-auth-api/fd;)V

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/e3;->a:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/z3;->a(Lcom/google/android/gms/internal/firebase-auth-api/fd;)Lcom/google/android/gms/internal/firebase-auth-api/ld;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
