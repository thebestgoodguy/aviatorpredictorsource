.class final Lcom/google/android/gms/internal/firebase-auth-api/g6;
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
    .locals 10

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->A()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->D()Lcom/google/android/gms/internal/firebase-auth-api/kb;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->E()I

    move-result v2

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->c(I)I

    move-result v2

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->F()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v3

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object v3

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->G()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object p1

    invoke-static {v2, v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/af;->e(I[B[B)Ljava/security/interfaces/ECPublicKey;

    move-result-object v5

    new-instance v9, Lcom/google/android/gms/internal/firebase-auth-api/p6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->z()Lcom/google/android/gms/internal/firebase-auth-api/ua;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ua;->C()Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object p1

    invoke-direct {v9, p1}, Lcom/google/android/gms/internal/firebase-auth-api/p6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xc;)V

    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/xe;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v2

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object v6

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->F()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->b(I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->G()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->d(I)I

    move-result v8

    move-object v4, p1

    invoke-direct/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/xe;-><init>(Ljava/security/interfaces/ECPublicKey;[BLjava/lang/String;ILcom/google/android/gms/internal/firebase-auth-api/ve;)V

    return-object p1
.end method
