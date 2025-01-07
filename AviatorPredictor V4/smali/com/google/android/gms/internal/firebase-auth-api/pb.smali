.class public final Lcom/google/android/gms/internal/firebase-auth-api/pb;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;


# instance fields
.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/hr;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/ld;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/hr;->f:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/firebase-auth-api/pb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    return-object v0
.end method

.method public static B([BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/pb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->w(Lcom/google/android/gms/internal/firebase-auth-api/ks;[BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/pb;

    return-object p0
.end method

.method static synthetic D(Lcom/google/android/gms/internal/firebase-auth-api/pb;Lcom/google/android/gms/internal/firebase-auth-api/hr;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-void
.end method

.method static synthetic E(Lcom/google/android/gms/internal/firebase-auth-api/pb;Lcom/google/android/gms/internal/firebase-auth-api/ld;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    return-void
.end method

.method public static z()Lcom/google/android/gms/internal/firebase-auth-api/ob;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/ob;

    return-object v0
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/firebase-auth-api/hr;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/hr;

    return-object v0
.end method

.method protected final r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    add-int/lit8 p1, p1, -0x1

    const/4 p2, 0x1

    if-eqz p1, :cond_4

    const/4 p3, 0x2

    if-eq p1, p3, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    const/4 p3, 0x0

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/ob;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ob;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/nb;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/pb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pb;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/pb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pb;

    const-string p3, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
