.class public final Lcom/google/android/gms/internal/firebase-auth-api/ec;
.super Lcom/google/android/gms/internal/firebase-auth-api/hs;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->A()Lcom/google/android/gms/internal/firebase-auth-api/fc;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/dc;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->A()Lcom/google/android/gms/internal/firebase-auth-api/fc;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method


# virtual methods
.method public final p(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/ec;
    .locals 1

    iget-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/fc;

    invoke-static {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->D(Lcom/google/android/gms/internal/firebase-auth-api/fc;Lcom/google/android/gms/internal/firebase-auth-api/jc;)V

    return-object p0
.end method
