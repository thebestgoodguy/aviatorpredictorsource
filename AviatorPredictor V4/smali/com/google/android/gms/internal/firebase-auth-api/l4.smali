.class final Lcom/google/android/gms/internal/firebase-auth-api/l4;
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
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/k9;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/oe;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/k9;->D()Lcom/google/android/gms/internal/firebase-auth-api/q9;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/q9;->z()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/oe;-><init>([BI)V

    return-object v0
.end method
