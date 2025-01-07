.class final Lcom/google/android/gms/internal/firebase-auth-api/v3;
.super Lcom/google/android/gms/internal/firebase-auth-api/w2;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/u3;


# instance fields
.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/s7;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/q7;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/s7;Lcom/google/android/gms/internal/firebase-auth-api/q7;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/w2;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/q7;Ljava/lang/Class;)V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->c:Lcom/google/android/gms/internal/firebase-auth-api/s7;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->d:Lcom/google/android/gms/internal/firebase-auth-api/q7;

    return-void
.end method


# virtual methods
.method public final c(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/sc;
    .locals 2

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->c:Lcom/google/android/gms/internal/firebase-auth-api/s7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->c:Lcom/google/android/gms/internal/firebase-auth-api/s7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->c:Lcom/google/android/gms/internal/firebase-auth-api/s7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/s7;->k(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->d:Lcom/google/android/gms/internal/firebase-auth-api/q7;

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/sc;->z()Lcom/google/android/gms/internal/firebase-auth-api/rc;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->d:Lcom/google/android/gms/internal/firebase-auth-api/q7;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/rc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/rc;

    invoke-interface {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e0;->g()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/rc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/rc;

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v3;->d:Lcom/google/android/gms/internal/firebase-auth-api/q7;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->f()I

    move-result p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/rc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/rc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/sc;
    :try_end_0
    .catch Lcom/google/android/gms/internal/firebase-auth-api/h; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    new-instance v0, Ljava/security/GeneralSecurityException;

    const-string v1, "expected serialized proto of type "

    invoke-direct {v0, v1, p1}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
.end method
