.class public final Lcom/google/android/gms/internal/firebase-auth-api/bf;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/m2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/of;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/j3;

.field private final c:I


# direct methods
.method public constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/of;Lcom/google/android/gms/internal/firebase-auth-api/j3;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->a:Lcom/google/android/gms/internal/firebase-auth-api/of;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->b:Lcom/google/android/gms/internal/firebase-auth-api/j3;

    iput p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->c:I

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 6

    array-length v0, p1

    iget v1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->c:I

    if-lt v0, v1, :cond_0

    sub-int v1, v0, v1

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object v1

    iget v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->c:I

    sub-int v3, v0, v3

    invoke-static {p1, v3, v0}, Ljava/util/Arrays;->copyOfRange([BII)[B

    move-result-object p1

    const/16 v0, 0x8

    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-virtual {v3, v4, v5}, Ljava/nio/ByteBuffer;->putLong(J)Ljava/nio/ByteBuffer;

    move-result-object v3

    invoke-virtual {v3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v3

    invoke-static {v3, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iget-object v3, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->b:Lcom/google/android/gms/internal/firebase-auth-api/j3;

    const/4 v4, 0x3

    new-array v4, v4, [[B

    aput-object p2, v4, v2

    const/4 p2, 0x1

    aput-object v1, v4, p2

    const/4 p2, 0x2

    aput-object v0, v4, p2

    invoke-static {v4}, Lcom/google/android/gms/internal/firebase-auth-api/se;->c([[B)[B

    move-result-object p2

    invoke-interface {v3, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/j3;->a([B[B)V

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/bf;->a:Lcom/google/android/gms/internal/firebase-auth-api/of;

    invoke-interface {p1, v1}, Lcom/google/android/gms/internal/firebase-auth-api/of;->a([B)[B

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/security/GeneralSecurityException;

    const-string p2, "ciphertext too short"

    invoke-direct {p1, p2}, Ljava/security/GeneralSecurityException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final b([B[B)[B
    .locals 0

    const/4 p1, 0x0

    throw p1
.end method
