.class abstract Lcom/google/android/gms/internal/firebase-auth-api/r;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/r;

.field private static final b:Lcom/google/android/gms/internal/firebase-auth-api/r;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/n;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/n;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/m;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/r;->a:Lcom/google/android/gms/internal/firebase-auth-api/r;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/p;

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/p;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/o;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/r;->b:Lcom/google/android/gms/internal/firebase-auth-api/r;

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/q;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static d()Lcom/google/android/gms/internal/firebase-auth-api/r;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/r;->a:Lcom/google/android/gms/internal/firebase-auth-api/r;

    return-object v0
.end method

.method static e()Lcom/google/android/gms/internal/firebase-auth-api/r;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/r;->b:Lcom/google/android/gms/internal/firebase-auth-api/r;

    return-object v0
.end method


# virtual methods
.method abstract a(Ljava/lang/Object;J)Ljava/util/List;
.end method

.method abstract b(Ljava/lang/Object;J)V
.end method

.method abstract c(Ljava/lang/Object;Ljava/lang/Object;J)V
.end method
