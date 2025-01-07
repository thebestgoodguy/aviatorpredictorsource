.class public final La1/p;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final h:Lz/a;


# instance fields
.field private final a:Lx0/e;

.field volatile b:J

.field volatile c:J

.field final d:J

.field final e:Landroid/os/HandlerThread;

.field final f:Landroid/os/Handler;

.field final g:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lz/a;

    const-string v1, "FirebaseAuth:"

    filled-new-array {v1}, [Ljava/lang/String;

    move-result-object v1

    const-string v2, "TokenRefresher"

    invoke-direct {v0, v2, v1}, Lz/a;-><init>(Ljava/lang/String;[Ljava/lang/String;)V

    sput-object v0, La1/p;->h:Lz/a;

    return-void
.end method

.method public constructor <init>(Lx0/e;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, La1/p;->h:Lz/a;

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Initializing TokenRefresher"

    invoke-virtual {v0, v2, v1}, Lz/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {p1}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx0/e;

    iput-object p1, p0, La1/p;->a:Lx0/e;

    new-instance v0, Landroid/os/HandlerThread;

    const-string v1, "TokenRefresher"

    const/16 v2, 0xa

    invoke-direct {v0, v1, v2}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;I)V

    iput-object v0, p0, La1/p;->e:Landroid/os/HandlerThread;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->start()V

    new-instance v1, Lcom/google/android/gms/internal/firebase-auth-api/c8;

    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-direct {v1, v0}, Lcom/google/android/gms/internal/firebase-auth-api/c8;-><init>(Landroid/os/Looper;)V

    iput-object v1, p0, La1/p;->f:Landroid/os/Handler;

    new-instance v0, La1/o;

    invoke-virtual {p1}, Lx0/e;->q()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p0, p1}, La1/o;-><init>(La1/p;Ljava/lang/String;)V

    iput-object v0, p0, La1/p;->g:Ljava/lang/Runnable;

    const-wide/32 v0, 0x493e0

    iput-wide v0, p0, La1/p;->d:J

    return-void
.end method

.method static bridge synthetic a()Lz/a;
    .locals 1

    sget-object v0, La1/p;->h:Lz/a;

    return-object v0
.end method


# virtual methods
.method public final b()V
    .locals 2

    iget-object v0, p0, La1/p;->f:Landroid/os/Handler;

    iget-object v1, p0, La1/p;->g:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final c()V
    .locals 7

    sget-object v0, La1/p;->h:Lz/a;

    iget-wide v1, p0, La1/p;->b:J

    iget-wide v3, p0, La1/p;->d:J

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Scheduling refresh for "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sub-long/2addr v1, v3

    invoke-virtual {v5, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lz/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, La1/p;->b()V

    invoke-static {}, Lb0/f;->b()Lb0/d;

    move-result-object v0

    invoke-interface {v0}, Lb0/d;->a()J

    move-result-wide v0

    iget-wide v2, p0, La1/p;->b:J

    sub-long/2addr v2, v0

    iget-wide v0, p0, La1/p;->d:J

    sub-long/2addr v2, v0

    const-wide/16 v0, 0x0

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    const-wide/16 v2, 0x3e8

    div-long/2addr v0, v2

    iput-wide v0, p0, La1/p;->c:J

    iget-object v0, p0, La1/p;->f:Landroid/os/Handler;

    iget-object v1, p0, La1/p;->g:Ljava/lang/Runnable;

    iget-wide v4, p0, La1/p;->c:J

    mul-long v4, v4, v2

    invoke-virtual {v0, v1, v4, v5}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method final d()V
    .locals 7

    iget-wide v0, p0, La1/p;->c:J

    long-to-int v1, v0

    const/16 v0, 0x1e

    if-eq v1, v0, :cond_1

    const/16 v0, 0x3c

    if-eq v1, v0, :cond_1

    const/16 v0, 0x78

    if-eq v1, v0, :cond_1

    const/16 v0, 0xf0

    if-eq v1, v0, :cond_1

    const/16 v0, 0x1e0

    if-eq v1, v0, :cond_1

    const/16 v0, 0x3c0

    if-eq v1, v0, :cond_0

    const-wide/16 v0, 0x1e

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x3c0

    goto :goto_0

    :cond_1
    iget-wide v0, p0, La1/p;->c:J

    add-long/2addr v0, v0

    :goto_0
    iput-wide v0, p0, La1/p;->c:J

    invoke-static {}, Lb0/f;->b()Lb0/d;

    move-result-object v0

    invoke-interface {v0}, Lb0/d;->a()J

    move-result-wide v0

    iget-wide v2, p0, La1/p;->c:J

    const-wide/16 v4, 0x3e8

    mul-long v2, v2, v4

    add-long/2addr v0, v2

    iput-wide v0, p0, La1/p;->b:J

    sget-object v0, La1/p;->h:Lz/a;

    iget-wide v1, p0, La1/p;->b:J

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "Scheduling refresh for "

    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Lz/a;->g(Ljava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, La1/p;->f:Landroid/os/Handler;

    iget-object v1, p0, La1/p;->g:Ljava/lang/Runnable;

    iget-wide v2, p0, La1/p;->c:J

    mul-long v2, v2, v4

    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method
