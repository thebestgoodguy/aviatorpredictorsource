.class final Lcom/google/android/gms/internal/firebase-auth-api/c5;
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

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ud;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ud;->D()Lcom/google/android/gms/internal/firebase-auth-api/xd;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xd;->D()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/i3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/h3;

    move-result-object v1

    invoke-interface {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/h3;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/m2;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/b5;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ud;->D()Lcom/google/android/gms/internal/firebase-auth-api/xd;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xd;->z()Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object p1

    invoke-direct {v1, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/b5;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xc;Lcom/google/android/gms/internal/firebase-auth-api/m2;)V

    return-object v1
.end method
