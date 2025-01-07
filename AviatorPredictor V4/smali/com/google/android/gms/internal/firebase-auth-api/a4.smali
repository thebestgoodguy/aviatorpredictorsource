.class public final Lcom/google/android/gms/internal/firebase-auth-api/a4;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Ljava/lang/String;

.field public static final b:Ljava/lang/String;

.field public static final c:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final d:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field

.field public static final e:Lcom/google/android/gms/internal/firebase-auth-api/ce;
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h4;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey"

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;->a:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/q4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/q4;-><init>()V

    const-string v0, "type.googleapis.com/google.crypto.tink.AesGcmKey"

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;->b:Ljava/lang/String;

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/t4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/t4;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/n4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/n4;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/a5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/a5;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e5;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/w4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w4;-><init>()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h5;-><init>()V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/ce;->A()Lcom/google/android/gms/internal/firebase-auth-api/ce;

    move-result-object v0

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;->c:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;->d:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/a4;->e:Lcom/google/android/gms/internal/firebase-auth-api/ce;

    :try_start_0
    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/a4;->a()V
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
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e4;-><init>()V

    invoke-static {v0}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->o(Lcom/google/android/gms/internal/firebase-auth-api/t3;)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/a8;->a()V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h4;-><init>()V

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/q4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/q4;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    invoke-static {}, Lcom/google/android/gms/internal/firebase-auth-api/v5;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/n4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/n4;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    invoke-static {v1}, Lcom/google/android/gms/internal/firebase-auth-api/t4;->k(Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/w4;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/w4;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/a5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/a5;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/e5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/e5;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/h5;

    invoke-direct {v0}, Lcom/google/android/gms/internal/firebase-auth-api/h5;-><init>()V

    invoke-static {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/x3;->n(Lcom/google/android/gms/internal/firebase-auth-api/q7;Z)V

    return-void
.end method
