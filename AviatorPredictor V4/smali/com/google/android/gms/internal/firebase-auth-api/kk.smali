.class final Lcom/google/android/gms/internal/firebase-auth-api/kk;
.super Lcom/google/android/gms/internal/firebase-auth-api/cn;
.source ""


# instance fields
.field private final w:Lcom/google/android/gms/internal/firebase-auth-api/ag;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x7

    invoke-direct {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;-><init>(I)V

    const-string v0, "code cannot be null or empty"

    invoke-static {p1, v0}, Lw/r;->f(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ag;

    invoke-direct {v0, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/ag;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/kk;->w:Lcom/google/android/gms/internal/firebase-auth-api/ag;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 1

    const-string v0, "applyActionCode"

    return-object v0
.end method

.method public final b(Lo0/i;Lcom/google/android/gms/internal/firebase-auth-api/bm;)V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bn;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bn;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/cn;Lo0/i;)V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->v:Lcom/google/android/gms/internal/firebase-auth-api/bn;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/kk;->w:Lcom/google/android/gms/internal/firebase-auth-api/ag;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/cn;->b:Lcom/google/android/gms/internal/firebase-auth-api/zm;

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/bm;->h(Lcom/google/android/gms/internal/firebase-auth-api/ag;Lcom/google/android/gms/internal/firebase-auth-api/zl;)V

    return-void
.end method

.method public final c()V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/cn;->m(Ljava/lang/Object;)V

    return-void
.end method
