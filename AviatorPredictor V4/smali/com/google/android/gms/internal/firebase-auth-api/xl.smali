.class final Lcom/google/android/gms/internal/firebase-auth-api/xl;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/android/gms/internal/firebase-auth-api/jh;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/pp;)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jh;

    invoke-direct {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/jh;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/pp;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xl;->w:Lcom/google/android/gms/internal/firebase-auth-api/jh;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "verifyPhoneNumber"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xl;->w:Lcom/google/android/gms/internal/firebase-auth-api/jh;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->y(Lcom/google/android/gms/internal/firebase-auth-api/jh;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 0

    return-void
.end method
