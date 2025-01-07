.class public final Lcom/google/android/gms/internal/firebase-auth-api/jc;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;


# instance fields
.field private zze:I

.field private zzf:I

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/jc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/jc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/jc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/firebase-auth-api/jc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    return-object v0
.end method

.method public static B()Lcom/google/android/gms/internal/firebase-auth-api/jc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    return-object v0
.end method

.method static synthetic F(Lcom/google/android/gms/internal/firebase-auth-api/jc;I)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zze:I

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/firebase-auth-api/jc;I)V
    .locals 0

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzf:I

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/firebase-auth-api/jc;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzg:I

    return-void
.end method

.method public static z()Lcom/google/android/gms/internal/firebase-auth-api/ic;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ic;

    return-object v0
.end method


# virtual methods
.method public final C()I
    .locals 4

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzg:I

    const/4 v1, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    if-eq v0, v3, :cond_3

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x5

    goto :goto_0

    :cond_1
    const/4 v1, 0x4

    goto :goto_0

    :cond_2
    const/4 v1, 0x2

    :cond_3
    :goto_0
    if-nez v1, :cond_4

    return v3

    :cond_4
    return v1
.end method

.method public final D()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzf:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method public final E()I
    .locals 2

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zze:I

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x3

    goto :goto_0

    :cond_1
    const/4 v0, 0x2

    :goto_0
    if-nez v0, :cond_2

    return v1

    :cond_2
    return v0
.end method

.method protected final r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    if-eq p1, p3, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/ic;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ic;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/hc;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/jc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/jc;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/jc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/jc;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000c\u0002\u000c\u0003\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
