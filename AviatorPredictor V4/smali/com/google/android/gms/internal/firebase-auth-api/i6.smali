.class public final Lcom/google/android/gms/internal/firebase-auth-api/i6;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final b:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h6;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/f6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/f6;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->A()Lcom/google/android/gms/internal/firebase-auth-api/ce;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/i6;->a:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->A()Lcom/google/android/gms/internal/firebase-auth-api/ce;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/i6;->b:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->A()Lcom/google/android/gms/internal/firebase-auth-api/ce;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/i6;->c:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/i6;->a()V
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/ExceptionInInitializerError;

    invoke-direct {v1, v0}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static a()V
    .locals 3

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/k6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/k6;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->o(Lcom/google/android/gms/internal/firebase-auth-api/t3;)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/m6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/m6;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->o(Lcom/google/android/gms/internal/firebase-auth-api/t3;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/a4;->a()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/v5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/f6;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/f6;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/h6;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/h6;-><init>()V

    const/4 v2, 0x1

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->m(Lcom/google/android/gms/internal/firebase-auth-api/s7;Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/a7;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/a7;-><init>()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/d7;

    invoke-direct {v1}, Lcom/google/android/gms/internal/firebase-auth-api/d7;-><init>()V

    invoke-static {v0, v1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->m(Lcom/google/android/gms/internal/firebase-auth-api/s7;Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    return-void
.end method
