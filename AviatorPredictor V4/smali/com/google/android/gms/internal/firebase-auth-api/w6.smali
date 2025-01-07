.class final Lcom/google/android/gms/internal/firebase-auth-api/w6;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/s2;


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/pc;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/t6;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/f7;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/s6;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/pc;Lcom/google/android/gms/internal/firebase-auth-api/f7;Lcom/google/android/gms/internal/firebase-auth-api/s6;Lcom/google/android/gms/internal/firebase-auth-api/t6;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/w6;->a:Lcom/google/android/gms/internal/firebase-auth-api/pc;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/w6;->c:Lcom/google/android/gms/internal/firebase-auth-api/f7;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/w6;->d:Lcom/google/android/gms/internal/firebase-auth-api/s6;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/w6;->b:Lcom/google/android/gms/internal/firebase-auth-api/t6;

    return-void
.end method

.method static a(Lcom/google/android/gms/internal/firebase-auth-api/pc;)Lcom/google/android/gms/internal/firebase-auth-api/w6;
    .locals 7

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->F()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->F()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/google/android/gms/internal/firebase-auth-api/pc;->A()Lcom/google/android/gms/internal/firebase-auth-api/jc;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->c(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/f7;

    move-result-object v3

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->b(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/s6;

    move-result-object v4

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x6;->a(Lcom/google/android/gms/internal/firebase-auth-api/jc;)Lcom/google/android/gms/internal/firebase-auth-api/t6;

    move-result-object v5

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/w6;

    const/4 v6, 0x0

    move-object v1, v0

    move-object v2, p0

    invoke-direct/range {v1 .. v6}, Lcom/google/android/gms/internal/firebase-auth-api/w6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/pc;Lcom/google/android/gms/internal/firebase-auth-api/f7;Lcom/google/android/gms/internal/firebase-auth-api/s6;Lcom/google/android/gms/internal/firebase-auth-api/t6;[B)V

    return-object v0

    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "HpkePublicKey.public_key is empty."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method
