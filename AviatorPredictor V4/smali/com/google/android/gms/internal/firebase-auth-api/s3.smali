.class public final Lcom/google/android/gms/internal/firebase-auth-api/s3;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/util/concurrent/ConcurrentMap;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/m3;

.field private final c:Ljava/lang/Class;

.field private final d:Lcom/google/android/gms/internal/firebase-auth-api/h8;


# direct methods
.method synthetic constructor <init>(Ljava/util/concurrent/ConcurrentMap;Lcom/google/android/gms/internal/firebase-auth-api/m3;Lcom/google/android/gms/internal/firebase-auth-api/h8;Ljava/lang/Class;Lcom/google/android/gms/internal/firebase-auth-api/r3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->a:Ljava/util/concurrent/ConcurrentMap;

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->b:Lcom/google/android/gms/internal/firebase-auth-api/m3;

    iput-object p4, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->c:Ljava/lang/Class;

    iput-object p3, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->d:Lcom/google/android/gms/internal/firebase-auth-api/h8;

    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/Class;
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->c:Ljava/lang/Class;

    return-object v0
.end method

.method public final b([B)Ljava/util/List;
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/s3;->a:Ljava/util/concurrent/ConcurrentMap;

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/o3;

    const/4 v2, 0x0

    invoke-direct {v1, p1, v2}, Lcom/google/android/gms/internal/firebase-auth-api/o3;-><init>([BLcom/google/android/gms/internal/firebase-auth-api/n3;)V

    invoke-interface {v0, v1}, Ljava/util/concurrent/ConcurrentMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
