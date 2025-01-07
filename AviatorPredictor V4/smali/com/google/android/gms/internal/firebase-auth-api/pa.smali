.class public final Lcom/google/android/gms/internal/firebase-auth-api/pa;
.super Lcom/google/android/gms/internal/firebase-auth-api/ks;
.source ""

# interfaces
.implements Lcom/google/android/gms/internal/firebase-auth-api/f0;


# static fields
.field private static final zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/pa;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/pa;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/pa;

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->n(Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/ks;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/android/gms/internal/firebase-auth-api/ks;-><init>()V

    return-void
.end method

.method public static A()Lcom/google/android/gms/internal/firebase-auth-api/pa;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    return-object v0
.end method

.method public static B(Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/pa;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    invoke-static {v0, p0, p1}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->v(Lcom/google/android/gms/internal/firebase-auth-api/ks;Lcom/google/android/gms/internal/firebase-auth-api/hr;Lcom/google/android/gms/internal/firebase-auth-api/yr;)Lcom/google/android/gms/internal/firebase-auth-api/ks;

    move-result-object p0

    check-cast p0, Lcom/google/android/gms/internal/firebase-auth-api/pa;

    return-object p0
.end method

.method static synthetic z()Lcom/google/android/gms/internal/firebase-auth-api/pa;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    return-object v0
.end method


# virtual methods
.method protected final r(ILjava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    add-int/lit8 p1, p1, -0x1

    if-eqz p1, :cond_4

    const/4 p2, 0x2

    const/4 p3, 0x0

    if-eq p1, p2, :cond_3

    const/4 p2, 0x3

    if-eq p1, p2, :cond_2

    const/4 p2, 0x4

    if-eq p1, p2, :cond_1

    const/4 p2, 0x5

    if-eq p1, p2, :cond_0

    return-object p3

    :cond_0
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    return-object p1

    :cond_1
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/oa;

    invoke-direct {p1, p3}, Lcom/google/android/gms/internal/firebase-auth-api/oa;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/na;)V

    return-object p1

    :cond_2
    new-instance p1, Lcom/google/android/gms/internal/firebase-auth-api/pa;

    invoke-direct {p1}, Lcom/google/android/gms/internal/firebase-auth-api/pa;-><init>()V

    return-object p1

    :cond_3
    sget-object p1, Lcom/google/android/gms/internal/firebase-auth-api/pa;->zzb:Lcom/google/android/gms/internal/firebase-auth-api/pa;

    const-string p2, "\u0000\u0000"

    invoke-static {p1, p2, p3}, Lcom/google/android/gms/internal/firebase-auth-api/ks;->f(Lcom/google/android/gms/internal/firebase-auth-api/e0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x1

    invoke-static {p1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1
.end method
