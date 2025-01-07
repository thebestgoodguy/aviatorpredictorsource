.class public final Lcom/google/android/gms/internal/firebase-auth-api/a7;
.super Lcom/google/android/gms/internal/firebase-auth-api/s7;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/y6;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/r2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/y6;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/mc;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/pc;

    invoke-direct {p0, v1, v2, v0}, Lcom/google/android/gms/internal/firebase-auth-api/s7;-><init>(Ljava/lang/Class;Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method static bridge synthetic l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/jc;->z()Lcom/google/android/gms/internal/firebase-auth-api/ic;

    move-result-object p0

    const/4 p1, 0x3

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ic;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/ic;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ic;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/ic;

    invoke-virtual {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/ic;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/ic;

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->z()Lcom/google/android/gms/internal/firebase-auth-api/ec;

    move-result-object p2

    invoke-virtual {p2, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ec;->p(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/ec;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/fc;

    invoke-direct {p1, p0, p3}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/z6;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/fc;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/z6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/a7;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/mc;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.HpkePrivateKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->F()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->I()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->D()Lcom/google/android/gms/internal/firebase-auth-api/pc;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->A()Lcom/google/android/gms/internal/firebase-auth-api/jc;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e7;->a(Lcom/google/android/gms/internal/firebase-auth-api/jc;)V

    return-void

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Missing public key."

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "Private key is empty."

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

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->D()Lcom/google/android/gms/internal/firebase-auth-api/pc;

    move-result-object p1

    return-object p1
.end method
