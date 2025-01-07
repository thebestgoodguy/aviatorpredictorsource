.class final Lcom/google/android/gms/internal/firebase-auth-api/z6;
.super Lcom/google/android/gms/internal/firebase-auth-api/p7;
.source ""


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/a7;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/a7;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/z6;->b:Lcom/google/android/gms/internal/firebase-auth-api/a7;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/p7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 5

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fc;

    const/16 v0, 0x20

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/uf;->a(I)[B

    move-result-object v0

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    or-int/lit8 v2, v2, 0x7

    int-to-byte v2, v2

    aput-byte v2, v0, v1

    const/16 v2, 0x1f

    aget-byte v3, v0, v2

    and-int/lit8 v3, v3, 0x3f

    int-to-byte v4, v3

    aput-byte v4, v0, v2

    or-int/lit16 v3, v3, 0x80

    int-to-byte v3, v3

    aput-byte v3, v0, v2

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xf;->b([B)[B

    move-result-object v2

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->B()Lcom/google/android/gms/internal/firebase-auth-api/oc;

    move-result-object v3

    invoke-virtual {v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/oc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/oc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->C()Lcom/google/android/gms/internal/firebase-auth-api/jc;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/oc;->p(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/oc;

    invoke-static {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/oc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/oc;

    invoke-virtual {v3}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/pc;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->A()Lcom/google/android/gms/internal/firebase-auth-api/lc;

    move-result-object v2

    invoke-virtual {v2, v1}, Lcom/google/android/gms/internal/firebase-auth-api/lc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/lc;->q(Lcom/google/android/gms/internal/firebase-auth-api/pc;)Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/lc;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/lc;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/mc;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/fc;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 6

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x3

    const/4 v2, 0x1

    invoke-static {v1, v1, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v3

    const-string v4, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v1, v1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v3

    const-string v4, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x4

    invoke-static {v1, v1, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v4

    const-string v5, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM"

    invoke-interface {v0, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v1, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v3

    const-string v4, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v3, 0x5

    invoke-static {v1, v1, v3, v2}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v4, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305"

    invoke-interface {v0, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1, v1, v3, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a7;->l(IIII)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/fc;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fc;->C()Lcom/google/android/gms/internal/firebase-auth-api/jc;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e7;->a(Lcom/google/android/gms/internal/firebase-auth-api/jc;)V

    return-void
.end method
