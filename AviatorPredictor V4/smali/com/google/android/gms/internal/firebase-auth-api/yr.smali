.class public final Lcom/google/android/gms/internal/firebase-auth-api/yr;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static volatile b:Lcom/google/android/gms/internal/firebase-auth-api/yr;

.field static final c:Lcom/google/android/gms/internal/firebase-auth-api/yr;


# instance fields
.field private final a:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/firebase-auth-api/yr;-><init>(Z)V

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->c:Lcom/google/android/gms/internal/firebase-auth-api/yr;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a:Ljava/util/Map;

    return-void
.end method

.method constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a:Ljava/util/Map;

    return-void
.end method

.method public static a()Lcom/google/android/gms/internal/firebase-auth-api/yr;
    .locals 2

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->b:Lcom/google/android/gms/internal/firebase-auth-api/yr;

    if-nez v0, :cond_1

    const-class v1, Lcom/google/android/gms/internal/firebase-auth-api/yr;

    monitor-enter v1

    :try_start_0
    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->b:Lcom/google/android/gms/internal/firebase-auth-api/yr;

    if-nez v0, :cond_0

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->c:Lcom/google/android/gms/internal/firebase-auth-api/yr;

    sput-object v0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->b:Lcom/google/android/gms/internal/firebase-auth-api/yr;

    :cond_0
    monitor-exit v1

    goto :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    :cond_1
    :goto_0
    return-object v0
.end method


# virtual methods
.method public final b(Lcom/google/android/gms/internal/firebase-auth-api/e0;I)Lcom/google/android/gms/internal/firebase-auth-api/js;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/yr;->a:Ljava/util/Map;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/xr;

    invoke-direct {v1, p1, p2}, Lcom/google/android/gms/internal/firebase-auth-api/xr;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/android/gms/internal/firebase-auth-api/js;

    return-object p1
.end method
