.class public final Lcom/google/android/gms/internal/firebase-auth-api/z7;
.super Lcom/google/android/gms/internal/firebase-auth-api/q7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/x7;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/j3;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/x7;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/ub;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method static bridge synthetic k(Lcom/google/android/gms/internal/firebase-auth-api/ac;)V
    .locals 0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/z7;->n(Lcom/google/android/gms/internal/firebase-auth-api/ac;)V

    return-void
.end method

.method public static final l(Lcom/google/android/gms/internal/firebase-auth-api/ub;)V
    .locals 2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->F()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->q()I

    move-result v0

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->E()Lcom/google/android/gms/internal/firebase-auth-api/ac;

    move-result-object p0

    invoke-static {p0}, Lcom/google/android/gms/internal/firebase-auth-api/z7;->n(Lcom/google/android/gms/internal/firebase-auth-api/ac;)V

    return-void

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "key too short"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static bridge synthetic m(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->A()Lcom/google/android/gms/internal/firebase-auth-api/wb;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->A()Lcom/google/android/gms/internal/firebase-auth-api/zb;

    move-result-object v2

    invoke-virtual {v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/zb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/zb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ac;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->q(Lcom/google/android/gms/internal/firebase-auth-api/ac;)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wb;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {v0, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static n(Lcom/google/android/gms/internal/firebase-auth-api/ac;)V
    .locals 3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result v0

    const/16 v1, 0xa

    if-lt v0, v1, :cond_a

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->E()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x1

    const-string v2, "tag size too big"

    if-eq v0, v1, :cond_8

    const/4 v1, 0x2

    if-eq v0, v1, :cond_6

    const/4 v1, 0x3

    if-eq v0, v1, :cond_4

    const/4 v1, 0x4

    if-eq v0, v1, :cond_2

    const/4 v1, 0x5

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p0

    const/16 v0, 0x1c

    if-gt p0, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "unknown hash type"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p0

    const/16 v0, 0x40

    if-gt p0, v0, :cond_3

    goto :goto_0

    :cond_3
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_4
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p0

    const/16 v0, 0x20

    if-gt p0, v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p0

    const/16 v0, 0x30

    if-gt p0, v0, :cond_7

    goto :goto_0

    :cond_7
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_8
    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p0

    const/16 v0, 0x14

    if-gt p0, v0, :cond_9

    :goto_0
    return-void

    :cond_9
    new-instance p0, Ljava/security/GeneralSecurityException;

    invoke-direct {p0, v2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_a
    new-instance p0, Ljava/security/GeneralSecurityException;

    const-string v0, "tag size too small"

    invoke-direct {p0, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/y7;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/y7;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/z7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->D(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HmacKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ub;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/z7;->l(Lcom/google/android/gms/internal/firebase-auth-api/ub;)V

    return-void
.end method

.method public final e()I
    .locals 1

    const/4 v0, 0x2

    return v0
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
