.class public final Lcom/google/android/gms/internal/firebase-auth-api/ia;
.super Lcom/google/android/gms/internal/firebase-auth-api/hs;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->B()Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/ha;)V
    .locals 0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->B()Lcom/google/android/gms/internal/firebase-auth-api/ja;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method


# virtual methods
.method public final p(I)Lcom/google/android/gms/internal/firebase-auth-api/ia;
    .locals 1

    iget-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->o()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->g:Z

    :cond_0
    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f:Lcom/google/android/gms/internal/firebase-auth-api/ks;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ja;

    const/16 v0, 0x40

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ja;->D(Lcom/google/android/gms/internal/firebase-auth-api/ja;I)V

    return-object p0
.end method
