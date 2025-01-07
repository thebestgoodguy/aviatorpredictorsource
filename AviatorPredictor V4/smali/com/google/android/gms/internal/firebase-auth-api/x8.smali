.class public final Lcom/google/android/gms/internal/firebase-auth-api/x8;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;


# instance fields
.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/e9;

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/xb;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x8;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    return-void
.end method

.method static synthetic A()Lcom/google/android/gms/internal/firebase-auth-api/x8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    return-object v0
.end method

.method public static B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/x8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->v(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    return-object p0
.end method

.method static synthetic E(Lcom/google/android/gms/internal/firebase-auth-api/x8;Lcom/google/android/gms/internal/firebase-auth-api/e9;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zze:Lcom/google/android/gms/internal/firebase-auth-api/e9;

    return-void
.end method

.method static synthetic F(Lcom/google/android/gms/internal/firebase-auth-api/x8;Lcom/google/android/gms/internal/firebase-auth-api/xb;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    return-void
.end method

.method public static z()Lcom/google/android/gms/internal/firebase-auth-api/w8;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/w8;

    return-object v0
.end method


# virtual methods
.method public final C()Lcom/google/android/gms/internal/firebase-auth-api/e9;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zze:Lcom/google/android/gms/internal/firebase-auth-api/e9;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/e9;->C()Lcom/google/android/gms/internal/firebase-auth-api/e9;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public final D()Lcom/google/android/gms/internal/firebase-auth-api/xb;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/xb;->C()Lcom/google/android/gms/internal/firebase-auth-api/xb;

    move-result-object v0

    :cond_0
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/w8;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/w8;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/v8;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/x8;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/x8;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "zze"

    aput-object v0, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/x8;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/x8;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
