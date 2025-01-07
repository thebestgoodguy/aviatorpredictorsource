.class public final Lcom/google/android/gms/internal/firebase-auth-api/dm;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static a(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/dm;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Lcom/google/android/gms/internal/firebase-auth-api/dm;
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/dm;-><init>()V

    iput-object p0, v0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->b:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final c()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->a:Ljava/lang/String;

    return-object v0
.end method

.method public final d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/dm;->b:Ljava/lang/String;

    return-object v0
.end method
