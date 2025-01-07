.class public Lp1/g$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp1/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field private final a:Lp1/g$d;

.field private final b:J

.field private final c:Ljava/lang/Runnable;

.field private d:Ljava/util/concurrent/ScheduledFuture;

.field final synthetic e:Lp1/g;


# direct methods
.method private constructor <init>(Lp1/g;Lp1/g$d;JLjava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Lp1/g$b;->e:Lp1/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lp1/g$b;->a:Lp1/g$d;

    iput-wide p3, p0, Lp1/g$b;->b:J

    iput-object p5, p0, Lp1/g$b;->c:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lp1/g;Lp1/g$d;JLjava/lang/Runnable;Lp1/g$a;)V
    .locals 0

    invoke-direct/range {p0 .. p5}, Lp1/g$b;-><init>(Lp1/g;Lp1/g$d;JLjava/lang/Runnable;)V

    return-void
.end method

.method public static synthetic a(Lp1/g$b;)V
    .locals 0

    invoke-direct {p0}, Lp1/g$b;->d()V

    return-void
.end method

.method static synthetic b(Lp1/g$b;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lp1/g$b;->f(J)V

    return-void
.end method

.method private d()V
    .locals 1

    iget-object v0, p0, Lp1/g$b;->e:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->w()V

    iget-object v0, p0, Lp1/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lp1/g$b;->e()V

    iget-object v0, p0, Lp1/g$b;->c:Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    :cond_0
    return-void
.end method

.method private e()V
    .locals 3

    iget-object v0, p0, Lp1/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Caller should have verified scheduledFuture is non-null."

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    iget-object v0, p0, Lp1/g$b;->e:Lp1/g;

    invoke-static {v0, p0}, Lp1/g;->f(Lp1/g;Lp1/g$b;)V

    return-void
.end method

.method private f(J)V
    .locals 3

    iget-object v0, p0, Lp1/g$b;->e:Lp1/g;

    invoke-static {v0}, Lp1/g;->e(Lp1/g;)Lp1/g$c;

    move-result-object v0

    new-instance v1, Lp1/h;

    invoke-direct {v1, p0}, Lp1/h;-><init>(Lp1/g$b;)V

    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-static {v0, v1, p1, p2, v2}, Lp1/g$c;->d(Lp1/g$c;Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    move-result-object p1

    iput-object p1, p0, Lp1/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    return-void
.end method


# virtual methods
.method public c()V
    .locals 2

    iget-object v0, p0, Lp1/g$b;->e:Lp1/g;

    invoke-virtual {v0}, Lp1/g;->w()V

    iget-object v0, p0, Lp1/g$b;->d:Ljava/util/concurrent/ScheduledFuture;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/concurrent/ScheduledFuture;->cancel(Z)Z

    invoke-direct {p0}, Lp1/g$b;->e()V

    :cond_0
    return-void
.end method
