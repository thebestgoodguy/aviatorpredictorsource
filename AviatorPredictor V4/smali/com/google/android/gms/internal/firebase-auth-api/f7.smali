.class final Lcom/google/android/gms/internal/firebase-auth-api/f7;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/s6;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/s6;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/f7;->a:Lcom/google/android/gms/internal/firebase-auth-api/s6;

    return-void
.end method


# virtual methods
.method public final a([B[B)[B
    .locals 8

    invoke-static {p2, p1}, Lcom/google/android/gms/internal/firebase-auth-api/xf;->a([B[B)[B

    move-result-object v2

    invoke-static {p2}, Lcom/google/android/gms/internal/firebase-auth-api/xf;->b([B)[B

    move-result-object p2

    const/4 v0, 0x2

    new-array v0, v0, [[B

    const/4 v1, 0x0

    aput-object p1, v0, v1

    const/4 p1, 0x1

    aput-object p2, v0, p1

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/se;->c([[B)[B

    move-result-object v4

    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/e7;->b:[B

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/e7;->d([B)[B

    move-result-object v6

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/f7;->a:Lcom/google/android/gms/internal/firebase-auth-api/s6;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/s6;->a()I

    move-result v7

    const/4 v1, 0x0

    const-string v3, "eae_prk"

    const-string v5, "shared_secret"

    invoke-virtual/range {v0 .. v7}, Lcom/google/android/gms/internal/firebase-auth-api/s6;->b([B[BLjava/lang/String;[BLjava/lang/String;[BI)[B

    move-result-object p1

    return-object p1
.end method
