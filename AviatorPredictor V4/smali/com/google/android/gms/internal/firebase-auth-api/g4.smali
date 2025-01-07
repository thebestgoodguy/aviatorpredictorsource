.class final Lcom/google/android/gms/internal/firebase-auth-api/g4;
.super Lcom/google/android/gms/internal/firebase-auth-api/p7;
.source ""


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/h4;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/h4;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/g4;->b:Lcom/google/android/gms/internal/firebase-auth-api/h4;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/p7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/k4;-><init>()V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->C()Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/j4;->g(Lcom/google/android/gms/internal/firebase-auth-api/e9;)Lcom/google/android/gms/internal/firebase-auth-api/a9;

    move-result-object v0

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/z7;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/z7;-><init>()V

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->a()Lcom/google/android/gms/internal/firebase-auth-api/p7;

    move-result-object v1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->D()Lcom/google/android/gms/internal/firebase-auth-api/xb;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/p7;->a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;

    move-result-object p1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/u8;->A()Lcom/google/android/gms/internal/firebase-auth-api/t8;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->p(Lcom/google/android/gms/internal/firebase-auth-api/a9;)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ub;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->q(Lcom/google/android/gms/internal/firebase-auth-api/ub;)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    const/4 p1, 0x0

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/t8;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/t8;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/u8;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/x8;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 9

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/16 v1, 0x10

    const/16 v2, 0x10

    const/16 v3, 0x20

    const/16 v4, 0x10

    const/4 v5, 0x5

    const/4 v6, 0x1

    invoke-static/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/h4;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x10

    const/16 v5, 0x20

    const/16 v6, 0x10

    const/4 v7, 0x5

    const/4 v8, 0x3

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/h4;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v3, 0x20

    const/16 v6, 0x20

    const/4 v8, 0x1

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/h4;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v8, 0x3

    invoke-static/range {v3 .. v8}, Lcom/google/android/gms/internal/firebase-auth-api/h4;->k(IIIIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "AES256_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/k4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/k4;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->a()Lcom/google/android/gms/internal/firebase-auth-api/p7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->C()Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object v1

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/j4;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/j4;->f(Lcom/google/android/gms/internal/firebase-auth-api/e9;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/z7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/z7;-><init>()V

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;->a()Lcom/google/android/gms/internal/firebase-auth-api/p7;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->D()Lcom/google/android/gms/internal/firebase-auth-api/xb;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/p7;->d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;->C()Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->z()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->b(I)V

    return-void
.end method
