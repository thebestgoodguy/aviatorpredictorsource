.class public final Lcom/google/android/gms/internal/firebase-auth-api/xd;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;


# instance fields
.field private zze:Ljava/lang/String;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/xc;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/xd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zze:Ljava/lang/String;

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/firebase-auth-api/xd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    return-object v0
.end method

.method public static B()Lcom/google/android/gms/internal/firebase-auth-api/xd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    return-object v0
.end method

.method public static C(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/xd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->v(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xd;

    return-object p0
.end method


# virtual methods
.method public final D()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zze:Ljava/lang/String;

    return-object v0
.end method

.method public final E()Z
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/wd;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wd;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/vd;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/xd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xd;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xd;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method

.method public final z()Lcom/google/android/gms/internal/firebase-auth-api/xc;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/xc;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xc;->B()Lcom/google/android/gms/internal/firebase-auth-api/xc;

    move-result-object v0

    :cond_0
    return-object v0
.end method
