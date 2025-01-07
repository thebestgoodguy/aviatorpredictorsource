.class public final Lcom/google/android/gms/internal/firebase-auth-api/hb;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/ab;

.field private zzg:Lcom/google/android/gms/internal/firebase-auth-api/hr;

.field private zzh:Lcom/google/android/gms/internal/firebase-auth-api/hr;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/hb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hr;->f:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzh:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/firebase-auth-api/gb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/gb;

    return-object v0
.end method

.method static synthetic C()Lcom/google/android/gms/internal/firebase-auth-api/hb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    return-object v0
.end method

.method public static D()Lcom/google/android/gms/internal/firebase-auth-api/hb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    return-object v0
.end method

.method public static E(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/hb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->v(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    return-object p0
.end method

.method static synthetic H(Lcom/google/android/gms/internal/firebase-auth-api/hb;I)V
    .locals 0

    const/4 p1, 0x0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zze:I

    return-void
.end method

.method static synthetic I(Lcom/google/android/gms/internal/firebase-auth-api/hb;Lcom/google/android/gms/internal/firebase-auth-api/ab;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/ab;

    return-void
.end method

.method static synthetic J(Lcom/google/android/gms/internal/firebase-auth-api/hb;Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method static synthetic K(Lcom/google/android/gms/internal/firebase-auth-api/hb;Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzh:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method


# virtual methods
.method public final A()Lcom/google/android/gms/internal/firebase-auth-api/ab;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/ab;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ab;->C()Lcom/google/android/gms/internal/firebase-auth-api/ab;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final F()Lcom/google/android/gms/internal/firebase-auth-api/hr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzg:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-object v0
.end method

.method public final G()Lcom/google/android/gms/internal/firebase-auth-api/hr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzh:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-object v0
.end method

.method protected final r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x4

    const/4 v0, 0x3

    const/4 v1, 0x2

    if-eq p1, v1, :cond_3

    if-eq p1, v0, :cond_2

    const/4 p2, 0x0

    if-eq p1, p3, :cond_1

    const/4 p3, 0x5

    if-eq p1, p3, :cond_0

    return-object p2

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/gb;

    invoke-direct {p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/gb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/eb;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/hb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/hb;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v2, "zze"

    aput-object v2, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-string p2, "zzg"

    aput-object p2, p1, v1

    const-string p2, "zzh"

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/hb;

    const-string p3, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final z()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/hb;->zze:I

    return v0
.end method
