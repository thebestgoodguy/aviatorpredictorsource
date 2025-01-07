.class public final Lcom/google/android/gms/internal/firebase-auth-api/xb;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;


# instance fields
.field private zze:Lcom/google/android/gms/internal/firebase-auth-api/ac;

.field private zzf:I

.field private zzg:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/xb;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    return-void
.end method

.method public static A()Lcom/google/android/gms/internal/firebase-auth-api/wb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/wb;

    return-object v0
.end method

.method static synthetic B()Lcom/google/android/gms/internal/firebase-auth-api/xb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    return-object v0
.end method

.method public static C()Lcom/google/android/gms/internal/firebase-auth-api/xb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    return-object v0
.end method

.method public static D(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/xb;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->v(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    return-object p0
.end method

.method static synthetic F(Lcom/google/android/gms/internal/firebase-auth-api/xb;Lcom/google/android/gms/internal/firebase-auth-api/ac;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    return-void
.end method

.method static synthetic G(Lcom/google/android/gms/internal/firebase-auth-api/xb;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzf:I

    return-void
.end method


# virtual methods
.method public final E()Lcom/google/android/gms/internal/firebase-auth-api/ac;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zze:Lcom/google/android/gms/internal/firebase-auth-api/ac;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ac;->C()Lcom/google/android/gms/internal/firebase-auth-api/ac;

    move-result-object v0

    :cond_0
    return-object v0
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/wb;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/wb;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/vb;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/xb;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/xb;-><init>()V

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

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/xb;

    const-string p3, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b"

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

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/xb;->zzf:I

    return v0
.end method
