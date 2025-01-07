.class final Lcom/google/android/gms/internal/firebase-auth-api/f4;
.super Lcom/google/android/gms/internal/firebase-auth-api/r7;
.source ""


# direct methods
.method constructor <init>(Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/r7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Ljava/lang/Object;
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/bf;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/k4;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->D()Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object v2

    const-class v3, Lcom/google/android/gms/internal/firebase-auth-api/of;

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->i(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/android/gms/internal/firebase-auth-api/of;

    new-instance v2, Lcom/google/android/gms/internal/firebase-auth-api/z7;

    invoke-direct {v2}, Lcom/google/android/gms/internal/firebase-auth-api/z7;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->E()Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object v3

    const-class v4, Lcom/google/android/gms/internal/firebase-auth-api/j3;

    invoke-virtual {v2, v3, v4}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->i(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/j3;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->E()Lcom/google/android/gms/internal/firebase-auth-api/ub;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ub;->E()Lcom/google/android/gms/internal/firebase-auth-api/ac;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->z()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/bf;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/of;Lcom/google/android/gms/internal/firebase-auth-api/j3;I)V

    return-object v0
.end method
