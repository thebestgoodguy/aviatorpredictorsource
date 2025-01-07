.class public final Lcom/google/android/gms/internal/firebase-auth-api/ld;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;


# instance fields
.field private zze:I

.field private zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/ld;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ld;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/ld;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->x()Lcom/google/android/gms/internal/firebase-auth-api/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    return-void
.end method

.method static synthetic B()Lcom/google/android/gms/internal/firebase-auth-api/ld;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    return-object v0
.end method

.method static synthetic C(Lcom/google/android/gms/internal/firebase-auth-api/ld;I)V
    .locals 0

    iput p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zze:I

    return-void
.end method

.method static synthetic D(Lcom/google/android/gms/internal/firebase-auth-api/ld;Lcom/google/android/gms/internal/firebase-auth-api/kd;)V
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e;->c()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->y(Lcom/google/android/gms/internal/firebase-auth-api/e;)Lcom/google/android/gms/internal/firebase-auth-api/e;

    move-result-object v0

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    :cond_0
    iget-object p0, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static z()Lcom/google/android/gms/internal/firebase-auth-api/id;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->s()Lcom/google/android/gms/internal/firebase-auth-api/hs;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/internal/firebase-auth-api/id;

    return-object v0
.end method


# virtual methods
.method public final A(I)Lcom/google/android/gms/internal/firebase-auth-api/kd;
    .locals 1

    iget-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzf:Lcom/google/android/gms/internal/firebase-auth-api/e;

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/kd;

    return-object p1
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
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/id;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/id;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/gd;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/ld;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/ld;-><init>()V

    return-object p1

    :cond_3
    new-array p1, p3, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v1, "zze"

    aput-object v1, p1, p3

    const-string p3, "zzf"

    aput-object p3, p1, p2

    const-class p2, Lcom/google/android/gms/internal/firebase-auth-api/kd;

    aput-object p2, p1, v0

    sget-object p2, Lcom/google/android/gms/internal/firebase-auth-api/ld;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/ld;

    const-string p3, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b"

    invoke-static {p2, p3, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
