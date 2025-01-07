.class public final Lcom/google/android/gms/internal/firebase-auth-api/j7;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final d:Ljava/lang/String; = "j7"

.field public static final synthetic e:I


# instance fields
.field private final a:Lcom/google/android/gms/internal/firebase-auth-api/g3;

.field private final b:Lcom/google/android/gms/internal/firebase-auth-api/m2;

.field private final c:Lcom/google/android/gms/internal/firebase-auth-api/f3;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/internal/firebase-auth-api/h7;Lcom/google/android/gms/internal/firebase-auth-api/i7;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->c(Lcom/google/android/gms/internal/firebase-auth-api/h7;)Lcom/google/android/gms/internal/firebase-auth-api/g3;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/j7;->a:Lcom/google/android/gms/internal/firebase-auth-api/g3;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->a(Lcom/google/android/gms/internal/firebase-auth-api/h7;)Lcom/google/android/gms/internal/firebase-auth-api/m2;

    move-result-object p2

    iput-object p2, p0, Lcom/google/android/gms/internal/firebase-auth-api/j7;->b:Lcom/google/android/gms/internal/firebase-auth-api/m2;

    invoke-static {p1}, Lcom/google/android/gms/internal/firebase-auth-api/h7;->b(Lcom/google/android/gms/internal/firebase-auth-api/h7;)Lcom/google/android/gms/internal/firebase-auth-api/f3;

    move-result-object p1

    iput-object p1, p0, Lcom/google/android/gms/internal/firebase-auth-api/j7;->c:Lcom/google/android/gms/internal/firebase-auth-api/f3;

    return-void
.end method

.method static bridge synthetic b()Ljava/lang/String;
    .locals 1

    sget-object v0, Lcom/google/android/gms/internal/firebase-auth-api/j7;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final declared-synchronized a()Lcom/google/android/gms/internal/firebase-auth-api/e3;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/android/gms/internal/firebase-auth-api/j7;->c:Lcom/google/android/gms/internal/firebase-auth-api/f3;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/firebase-auth-api/f3;->b()Lcom/google/android/gms/internal/firebase-auth-api/e3;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
