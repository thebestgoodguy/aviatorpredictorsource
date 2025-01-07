.class public final Lcom/google/android/gms/internal/firebase-auth-api/cd;
.super Lcom/google/android/gms/internal/firebase-auth-api/hs;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->D()Lcom/google/android/gms/internal/firebase-auth-api/fd;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/bd;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->D()Lcom/google/android/gms/internal/firebase-auth-api/fd;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method


# virtual methods
.method public final p()I
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->z()I

    move-result v0

    return v0
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/ed;)Lcom/google/android/gms/internal/firebase-auth-api/cd;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->H(Lcom/google/android/gms/internal/firebase-auth-api/fd;Lcom/google/android/gms/internal/firebase-auth-api/ed;)V

    return-object p0
.end method

.method public final r(I)Lcom/google/android/gms/internal/firebase-auth-api/cd;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->G(Lcom/google/android/gms/internal/firebase-auth-api/fd;I)V

    return-object p0
.end method

.method public final s(I)Lcom/google/android/gms/internal/firebase-auth-api/ed;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->C(I)Lcom/google/android/gms/internal/firebase-auth-api/ed;

    move-result-object p1

    return-object p1
.end method

.method public final u()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;->F()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
