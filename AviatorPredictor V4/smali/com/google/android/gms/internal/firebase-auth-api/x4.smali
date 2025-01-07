.class final Lcom/google/android/gms/internal/firebase-auth-api/x4;
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
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/od;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/od;->D()Lcom/google/android/gms/internal/firebase-auth-api/rd;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/rd;->C()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/i3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/h3;

    move-result-object v0

    invoke-interface {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/h3;->d(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/m2;

    move-result-object p1

    return-object p1
.end method
