.class final Lcom/google/android/gms/internal/firebase-auth-api/e6;
.super Lcom/google/android/gms/internal/firebase-auth-api/p7;
.source ""


# instance fields
.field final synthetic b:Lcom/google/android/gms/internal/firebase-auth-api/f6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/f6;Ljava/lang/Class;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/e6;->b:Lcom/google/android/gms/internal/firebase-auth-api/f6;

    invoke-direct {p0, p2}, Lcom/google/android/gms/internal/firebase-auth-api/p7;-><init>(Ljava/lang/Class;)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Lcom/google/android/gms/internal/firebase-auth-api/e0;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 4

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->C()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->D()Lcom/google/android/gms/internal/firebase-auth-api/kb;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/kb;->E()I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->c(I)I

    move-result v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/af;->f(I)Ljava/security/spec/ECParameterSpec;

    move-result-object v0

    sget-object v1, Lcom/google/android/gms/internal/firebase-auth-api/cf;->j:Lcom/google/android/gms/internal/firebase-auth-api/cf;

    const-string v2, "EC"

    invoke-virtual {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/cf;->a(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/KeyPairGenerator;

    invoke-virtual {v1, v0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v1

    check-cast v1, Ljava/security/interfaces/ECPublicKey;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    check-cast v0, Ljava/security/interfaces/ECPrivateKey;

    invoke-interface {v1}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/hb;->B()Lcom/google/android/gms/internal/firebase-auth-api/gb;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->q(I)Lcom/google/android/gms/internal/firebase-auth-api/gb;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->C()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->p(Lcom/google/android/gms/internal/firebase-auth-api/ab;)Lcom/google/android/gms/internal/firebase-auth-api/gb;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->r(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/gb;

    invoke-virtual {v1}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/gb;->s(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/gb;

    invoke-virtual {v2}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/db;->A()Lcom/google/android/gms/internal/firebase-auth-api/cb;

    move-result-object v1

    invoke-virtual {v1, v3}, Lcom/google/android/gms/internal/firebase-auth-api/cb;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/cb;

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cb;->q(Lcom/google/android/gms/internal/firebase-auth-api/hb;)Lcom/google/android/gms/internal/firebase-auth-api/cb;

    invoke-interface {v0}, Ljava/security/interfaces/ECPrivateKey;->getS()Ljava/math/BigInteger;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigInteger;->toByteArray()[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/google/android/gms/internal/firebase-auth-api/cb;->p(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/cb;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/db;

    return-object p1
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/xa;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/util/Map;
    .locals 10

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const-string v1, "AES128_GCM"

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "AES128_CTR_HMAC_SHA256"

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v5

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v6

    const/4 v2, 0x4

    const/4 v3, 0x5

    const/4 v4, 0x3

    const/4 v7, 0x1

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v4, 0x4

    const/4 v5, 0x5

    const/4 v6, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v6, 0x4

    const/4 v9, 0x1

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v2

    const-string v3, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d3;->a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/c3;

    move-result-object v7

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->l()[B

    move-result-object v8

    const/4 v9, 0x3

    invoke-static/range {v4 .. v9}, Lcom/google/android/gms/internal/firebase-auth-api/f6;->m(IIILcom/google/android/gms/internal/firebase-auth-api/c3;[BI)Lcom/google/android/gms/internal/firebase-auth-api/o7;

    move-result-object v1

    const-string v2, "ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/xa;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xa;->C()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/o6;->a(Lcom/google/android/gms/internal/firebase-auth-api/ab;)V

    return-void
.end method
