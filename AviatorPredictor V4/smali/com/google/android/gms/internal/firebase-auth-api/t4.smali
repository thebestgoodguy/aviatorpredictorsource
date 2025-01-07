.class public final Lcom/google/android/gms/internal/firebase-auth-api/t4;
.super Lcom/google/android/gms/internal/firebase-auth-api/q7;
.source ""


# direct methods
.method constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lcom/google/android/gms/internal/firebase-auth-api/r7;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/r4;

    const-class v2, Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-direct {v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/r4;-><init>(Ljava/lang/Class;)V

    const/4 v2, 0x0

    aput-object v1, v0, v2

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/z9;

    invoke-direct {p0, v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/q7;-><init>(Ljava/lang/Class;[Lcom/google/android/gms/internal/firebase-auth-api/r7;)V

    return-void
.end method

.method public static k(Z)V
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->m()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lcom/google/android/gms/internal/firebase-auth-api/t4;

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;-><init>()V

    const/4 v0, 0x1

    invoke-static {p0, v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    :cond_0
    return-void
.end method

.method static bridge synthetic l(II)Lcom/google/android/gms/internal/firebase-auth-api/o7;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ca;->A()Lcom/google/android/gms/internal/firebase-auth-api/ba;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/ba;->p(I)Lcom/google/android/gms/internal/firebase-auth-api/ba;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/ca;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/o7;

    invoke-direct {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/o7;-><init>(Ljava/lang/Object;I)V

    return-object v0
.end method

.method private static m()Z
    .locals 1

    :try_start_0
    const-string v0, "AES/GCM-SIV/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljavax/crypto/NoSuchPaddingException; {:try_start_0 .. :try_end_0} :catch_0

    const/4 v0, 0x1

    return v0

    :catch_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public final a()Lcom/google/android/gms/internal/firebase-auth-api/p7;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/s4;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/ca;

    invoke-direct {v0, p0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/s4;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/t4;Ljava/lang/Class;)V

    return-object v0
.end method

.method public final synthetic b(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/e0;
    .locals 1

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a()Lcom/google/android/gms/internal/firebase-auth-api/yr;

    move-result-object v0

    invoke-static {p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/z9;->C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/z9;

    move-result-object p1

    return-object p1
.end method

.method public final c()Ljava/lang/String;
    .locals 1

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmSivKey"

    return-object v0
.end method

.method public final bridge synthetic d(Lcom/google/android/gms/internal/firebase-auth-api/e0;)V
    .locals 2

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/z9;

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/z9;->z()I

    move-result v0

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->c(II)V

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/z9;->D()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->q()I

    move-result p1

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/wf;->b(I)V

    return-void
.end method

.method public final f()I
    .locals 1

    const/4 v0, 0x3

    return v0
.end method
