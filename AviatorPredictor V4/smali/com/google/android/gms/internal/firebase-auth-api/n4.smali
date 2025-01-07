.class public final Lcom/google/android/gms/internal/firebase-auth-api/n4;
.super Lcom/google/android/gms/internal/firebase-auth-api/q7;
.source ""


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/l4;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/l4;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/k9;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method static bridge synthetic k(III)Lcom/google/android/gms/internal/firebase-auth-api/o7;
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

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-direct {p1, p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object p1
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/m4;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/n9;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/m4;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/n4;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/k9;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesEaxKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/k9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->q()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->b(I)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->D()Lcom/google/android/gms/internal/firebase-auth-api/q9;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/q9;->z()I

    move-result v0

    const/16 v1, 0xc

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->D()Lcom/google/android/gms/internal/firebase-auth-api/q9;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/q9;->z()I

    move-result p1

    const/16 v0, 0x10

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string v0, "invalid IV size; acceptable values have 12 or 16 bytes"

    invoke-direct {p1, v0}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
