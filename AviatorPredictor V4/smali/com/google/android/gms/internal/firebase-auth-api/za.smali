.class public final Lcom/google/android/gms/internal/firebase-auth-api/za;
.super Lcom/google/android/gms/internal/firebase-auth-api/hs;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->B()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ya;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->B()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method


# virtual methods
.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/ua;)Lcom/google/android/gms/internal/firebase-auth-api/za;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ab;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->F(Lcom/google/android/gms/internal/firebase-auth-api/ab;Lcom/google/android/gms/internal/firebase-auth-api/ua;)V

    return-object p0
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/kb;)Lcom/google/android/gms/internal/firebase-auth-api/za;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ab;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->E(Lcom/google/android/gms/internal/firebase-auth-api/ab;Lcom/google/android/gms/internal/firebase-auth-api/kb;)V

    return-object p0
.end method

.method public final r(I)Lcom/google/android/gms/internal/firebase-auth-api/za;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ab;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->H(Lcom/google/android/gms/internal/firebase-auth-api/ab;I)V

    return-object p0
.end method
