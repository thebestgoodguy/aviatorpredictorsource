.class final Lcom/google/android/gms/internal/firebase-auth-api/u7;
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
    .locals 3

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/l8;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sf;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/pf;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/l8;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object v2

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/pf;-><init>([B)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/l8;->D()Lcom/google/android/gms/internal/firebase-auth-api/r8;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/r8;->z()I

    move-result p1

    invoke-direct {v0, v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/sf;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/i8;I)V

    return-object v0
.end method
