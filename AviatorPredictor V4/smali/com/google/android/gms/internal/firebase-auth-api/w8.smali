.class public final Lcom/google/android/gms/internal/firebase-auth-api/w8;
.super Lcom/google/android/gms/internal/firebase-auth-api/hs;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->A()Lcom/google/android/gms/internal/firebase-auth-api/x8;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/v8;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->A()Lcom/google/android/gms/internal/firebase-auth-api/x8;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method


# virtual methods
.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/w8;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->E(Lcom/google/android/gms/internal/firebase-auth-api/x8;Lcom/google/android/gms/internal/firebase-auth-api/e9;)V

    return-object p0
.end method

.method public final q(Lcom/google/android/gms/internal/firebase-auth-api/xb;)Lcom/google/android/gms/internal/firebase-auth-api/w8;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->F(Lcom/google/android/gms/internal/firebase-auth-api/x8;Lcom/google/android/gms/internal/firebase-auth-api/xb;)V

    return-object p0
.end method
