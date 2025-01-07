.class public final Lcom/google/android/gms/internal/firebase-auth-api/sc;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;


# instance fields
.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/hr;

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/sc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/sc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/sc;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zze:Ljava/lang/String;

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hr;->f:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/firebase-auth-api/sc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    return-object v0
.end method

.method public static B()Lcom/google/android/gms/internal/firebase-auth-api/sc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    return-object v0
.end method

.method static synthetic E(Lcom/google/android/gms/internal/firebase-auth-api/sc;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zze:Ljava/lang/String;

    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/internal/firebase-auth-api/sc;Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/firebase-auth-api/sc;I)V
    .locals 0

    add-int/lit8 p1, p1, -0x2

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzg:I

    return-void
.end method

.method public static z()Lcom/google/android/gms/internal/firebase-auth-api/rc;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/rc;

    return-object v0
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/firebase-auth-api/hr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-object v0
.end method

.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final G()I
    .locals 5

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzg:I

    const/4 v1, 0x4

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v4, :cond_2

    if-eq v0, v3, :cond_4

    if-eq v0, v2, :cond_1

    if-eq v0, v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const/4 v1, 0x6

    goto :goto_0

    :cond_1
    const/4 v1, 0x5

    goto :goto_0

    :cond_2
    const/4 v1, 0x3

    goto :goto_0

    :cond_3
    const/4 v1, 0x2

    :cond_4
    :goto_0
    if-nez v1, :cond_5

    return v4

    :cond_5
    return v1
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/rc;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/rc;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/qc;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/sc;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/sc;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/sc;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/sc;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002\n\u0003\u000c"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
