.class final Lcom/google/android/gms/internal/firebase-auth-api/v6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/r2;


# static fields
.field private static final e:[B


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/mc;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/t6;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/f7;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/s6;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [B

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->e:[B

    return-void
.end method

.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/mc;Lcom/google/android/gms/internal/firebase-auth-api/f7;Lcom/google/android/gms/internal/firebase-auth-api/s6;Lcom/google/android/gms/internal/firebase-auth-api/t6;I[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->a:Lcom/google/android/gms/internal/firebase-auth-api/mc;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->c:Lcom/google/android/gms/internal/firebase-auth-api/f7;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->d:Lcom/google/android/gms/internal/firebase-auth-api/s6;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->b:Lcom/google/android/gms/internal/firebase-auth-api/t6;

    return-void
.end method

.method static b(Lcom/google/android/gms/internal/firebase-auth-api/mc;)Lcom/google/android/gms/internal/firebase-auth-api/v6;
    .locals 8

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->I()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->D()Lcom/google/android/gms/internal/firebase-auth-api/pc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->J()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->F()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->D()Lcom/google/android/gms/internal/firebase-auth-api/pc;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->A()Lcom/google/android/gms/internal/firebase-auth-api/jc;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->c(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/f7;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->b(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/s6;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->a(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/t6;

    move-result-object v5

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jc;->E()I

    move-result v0

    add-int/lit8 v1, v0, -0x2

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/v6;

    const/16 v6, 0x20

    const/4 v7, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/v6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/mc;Lcom/google/android/gms/internal/firebase-auth-api/f7;Lcom/google/android/gms/internal/firebase-auth-api/s6;Lcom/google/android/gms/internal/firebase-auth-api/t6;I[B)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/cc;->a(I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Unable to determine KEM-encoding length for "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.private_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey.public_key is missing params field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePrivateKey is missing public_key field."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 8

    array-length p2, p1

    const/16 v0, 0x20

    if-lt p2, v0, :cond_0

    const/4 v1, 0x0

    new-array v7, v1, [B

    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v2

    invoke-static {p1, v0, p2}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    iget-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->a:Lcom/google/android/gms/internal/firebase-auth-api/mc;

    iget-object v4, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->c:Lcom/google/android/gms/internal/firebase-auth-api/f7;

    iget-object v5, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->d:Lcom/google/android/gms/internal/firebase-auth-api/s6;

    iget-object v6, p0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->b:Lcom/google/android/gms/internal/firebase-auth-api/t6;

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/mc;->E()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object p2

    invoke-virtual {v4, v2, p2}, Lcom/google/android/gms/internal/firebase-auth-api/f7;->a([B[B)[B

    move-result-object v3

    invoke-static/range {v2 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/u6;->b([B[BLcom/google/android/gms/internal/firebase-auth-api/f7;Lcom/google/android/gms/internal/firebase-auth-api/s6;Lcom/google/android/gms/internal/firebase-auth-api/t6;[B)Lcom/google/android/gms/internal/firebase-auth-api/u6;

    move-result-object p2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/v6;->e:[B

    invoke-virtual {p2, p1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/u6;->a([B[B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "Ciphertext is too short."

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
