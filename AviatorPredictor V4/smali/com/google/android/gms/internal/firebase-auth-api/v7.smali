.class final Lcom/google/android/gms/internal/firebase-auth-api/v7;
.super Lcom/google/android/gms/internal/firebase-auth-api/p7;
.source ""


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/w7;Ljava/lang/Class;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/p7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/o8;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/l8;->A()Lcom/google/android/gms/internal/firebase-auth-api/k8;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/k8;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/k8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->z()I

    move-result v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/uf;->a(I)[B

    move-result-object v1

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/k8;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/k8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->D()Lcom/google/android/gms/internal/firebase-auth-api/r8;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/k8;->q(Lcom/google/android/gms/internal/firebase-auth-api/r8;)Lcom/google/android/gms/internal/firebase-auth-api/k8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/l8;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/o8;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 7

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->A()Lcom/google/android/gms/internal/firebase-auth-api/n8;

    move-result-object v2

    const/16 v3, 0x20

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/r8;->A()Lcom/google/android/gms/internal/firebase-auth-api/q8;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Lcom/google/android/gms/internal/firebase-auth-api/q8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/q8;

    invoke-virtual {v4}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v4

    check-cast v4, Lcom/google/android/gms/internal/firebase-auth-api/r8;

    invoke-virtual {v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->q(Lcom/google/android/gms/internal/firebase-auth-api/r8;)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/o8;

    const/4 v4, 0x1

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->A()Lcom/google/android/gms/internal/firebase-auth-api/n8;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/r8;->A()Lcom/google/android/gms/internal/firebase-auth-api/q8;

    move-result-object v6

    invoke-virtual {v6, v5}, Lcom/google/android/gms/internal/firebase-auth-api/q8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/q8;

    invoke-virtual {v6}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v6

    check-cast v6, Lcom/google/android/gms/internal/firebase-auth-api/r8;

    invoke-virtual {v2, v6}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->q(Lcom/google/android/gms/internal/firebase-auth-api/r8;)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/o8;

    invoke-direct {v1, v2, v4}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->A()Lcom/google/android/gms/internal/firebase-auth-api/n8;

    move-result-object v2

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/r8;->A()Lcom/google/android/gms/internal/firebase-auth-api/q8;

    move-result-object v3

    invoke-virtual {v3, v5}, Lcom/google/android/gms/internal/firebase-auth-api/q8;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/q8;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v3

    check-cast v3, Lcom/google/android/gms/internal/firebase-auth-api/r8;

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/n8;->q(Lcom/google/android/gms/internal/firebase-auth-api/r8;)Lcom/google/android/gms/internal/firebase-auth-api/n8;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object v2

    check-cast v2, Lcom/google/android/gms/internal/firebase-auth-api/o8;

    const/4 v3, 0x3

    invoke-direct {v1, v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    const-string v2, "AES256_CMAC_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/o8;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->D()Lcom/google/android/gms/internal/firebase-auth-api/r8;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->k(Lcom/google/android/gms/internal/firebase-auth-api/r8;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o8;->z()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/w7;->l(I)V

    return-void
.end method
