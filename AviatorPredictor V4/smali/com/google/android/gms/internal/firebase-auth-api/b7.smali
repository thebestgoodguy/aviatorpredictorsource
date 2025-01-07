.class public final Lcom/google/android/gms/internal/firebase-auth-api/b7;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Lcom/google/android/gms/internal/firebase-auth-api/y3;

.field private static volatile b:Lcom/google/android/gms/internal/firebase-auth-api/y3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/a6;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/a6;-><init>(Lcom/google/android/gms/internal/firebase-auth-api/z4;)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b7;->a:Lcom/google/android/gms/internal/firebase-auth-api/y3;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b7;->b:Lcom/google/android/gms/internal/firebase-auth-api/y3;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/firebase-auth-api/y3;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/b7;->b:Lcom/google/android/gms/internal/firebase-auth-api/y3;

    return-object v0
.end method
