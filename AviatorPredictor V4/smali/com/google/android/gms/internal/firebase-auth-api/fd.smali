.class public final Lcom/google/android/gms/internal/firebase-auth-api/fd;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/fd;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->x()Lcom/google/android/gms/internal/firebase-auth-api/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    return-void
.end method

.method public static B()Lcom/google/android/gms/internal/firebase-auth-api/cd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/cd;

    return-object v0
.end method

.method static synthetic D()Lcom/google/android/gms/internal/firebase-auth-api/fd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    return-object v0
.end method

.method public static E([BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/fd;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->w(Lcom/google/android/gms/internal/firebase-auth-api/ks;[BLcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    return-object p0
.end method

.method static synthetic G(Lcom/google/android/gms/internal/firebase-auth-api/fd;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zze:I

    return-void
.end method

.method static synthetic H(Lcom/google/android/gms/internal/firebase-auth-api/fd;Lcom/google/android/gms/internal/firebase-auth-api/ed;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->y(Lcom/google/android/gms/internal/firebase-auth-api/e;)Lcom/google/android/gms/internal/firebase-auth-api/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final A()I
    .locals 1

    iget v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zze:I

    return v0
.end method

.method public final C(I)Lcom/google/android/gms/internal/firebase-auth-api/ed;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    return-object p1
.end method

.method public final F()Ljava/util/List;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/cd;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/cd;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/bd;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/fd;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/fd;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/ed;

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/fd;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

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

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/fd;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method
