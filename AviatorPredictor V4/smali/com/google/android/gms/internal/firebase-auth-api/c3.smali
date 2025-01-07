.class public final Lcom/google/android/gms/internal/firebase-auth-api/c3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/xc;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/xc;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-void
.end method

.method public static e(Ljava/lang/String;[BI)Lcom/google/android/gms/internal/firebase-auth-api/c3;
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/c3;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->z()Lcom/google/android/gms/internal/firebase-auth-api/wc;

    move-result-object v1

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->p(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->A([B)Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object p0

    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->q(Lcom/google/android/gms/internal/firebase-auth-api/hr;)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    add-int/lit8 p2, p2, -0x1

    if-eqz p2, :cond_2

    const/4 p0, 0x1

    if-eq p2, p0, :cond_1

    const/4 p0, 0x2

    if-eq p2, p0, :cond_0

    const/4 p0, 0x6

    goto :goto_0

    :cond_0
    const/4 p0, 0x5

    goto :goto_0

    :cond_1
    const/4 p0, 0x4

    goto :goto_0

    :cond_2
    const/4 p0, 0x3

    :goto_0
    invoke-virtual {v1, p0}, Lcom/google/android/gms/internal/firebase-auth-api/wc;->r(I)Lcom/google/android/gms/internal/firebase-auth-api/wc;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/firebase-auth-api/hs;->f()Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-direct {v0, p0}, Lcom/google/android/gms/internal/firebase-auth-api/c3;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/xc;)V

    return-object v0
.end method


# virtual methods
.method final a()Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    return-object v0
.end method

.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->D()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final c()[B
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->C()Lcom/google/android/gms/internal/firebase-auth-api/hr;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hr;->G()[B

    move-result-object v0

    return-object v0
.end method

.method public final d()I
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/c3;->a:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->G()I

    move-result v0

    add-int/lit8 v0, v0, -0x2

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    return v1

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Unknown output prefix type"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return v1
.end method
