.class public final Lb3/w0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/w0$b$a;
    }
.end annotation


# instance fields
.field private final a:I

.field private final b:Lb3/c1;

.field private final c:Lb3/j1;

.field private final d:Lb3/w0$h;

.field private final e:Ljava/util/concurrent/ScheduledExecutorService;

.field private final f:Lb3/f;

.field private final g:Ljava/util/concurrent/Executor;


# direct methods
.method private constructor <init>(Ljava/lang/Integer;Lb3/c1;Lb3/j1;Lb3/w0$h;Ljava/util/concurrent/ScheduledExecutorService;Lb3/f;Ljava/util/concurrent/Executor;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "defaultPort not set"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    iput p1, p0, Lb3/w0$b;->a:I

    const-string p1, "proxyDetector not set"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/c1;

    iput-object p1, p0, Lb3/w0$b;->b:Lb3/c1;

    const-string p1, "syncContext not set"

    invoke-static {p3, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/j1;

    iput-object p1, p0, Lb3/w0$b;->c:Lb3/j1;

    const-string p1, "serviceConfigParser not set"

    invoke-static {p4, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/w0$h;

    iput-object p1, p0, Lb3/w0$b;->d:Lb3/w0$h;

    iput-object p5, p0, Lb3/w0$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p6, p0, Lb3/w0$b;->f:Lb3/f;

    iput-object p7, p0, Lb3/w0$b;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method synthetic constructor <init>(Ljava/lang/Integer;Lb3/c1;Lb3/j1;Lb3/w0$h;Ljava/util/concurrent/ScheduledExecutorService;Lb3/f;Ljava/util/concurrent/Executor;Lb3/w0$a;)V
    .locals 0

    invoke-direct/range {p0 .. p7}, Lb3/w0$b;-><init>(Ljava/lang/Integer;Lb3/c1;Lb3/j1;Lb3/w0$h;Ljava/util/concurrent/ScheduledExecutorService;Lb3/f;Ljava/util/concurrent/Executor;)V

    return-void
.end method

.method public static f()Lb3/w0$b$a;
    .locals 1

    new-instance v0, Lb3/w0$b$a;

    invoke-direct {v0}, Lb3/w0$b$a;-><init>()V

    return-object v0
.end method


# virtual methods
.method public a()I
    .locals 1

    iget v0, p0, Lb3/w0$b;->a:I

    return v0
.end method

.method public b()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lb3/w0$b;->g:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public c()Lb3/c1;
    .locals 1

    iget-object v0, p0, Lb3/w0$b;->b:Lb3/c1;

    return-object v0
.end method

.method public d()Lb3/w0$h;
    .locals 1

    iget-object v0, p0, Lb3/w0$b;->d:Lb3/w0$h;

    return-object v0
.end method

.method public e()Lb3/j1;
    .locals 1

    iget-object v0, p0, Lb3/w0$b;->c:Lb3/j1;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget v1, p0, Lb3/w0$b;->a:I

    const-string v2, "defaultPort"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->b(Ljava/lang/String;I)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->b:Lb3/c1;

    const-string v2, "proxyDetector"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->c:Lb3/j1;

    const-string v2, "syncContext"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->d:Lb3/w0$h;

    const-string v2, "serviceConfigParser"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->e:Ljava/util/concurrent/ScheduledExecutorService;

    const-string v2, "scheduledExecutorService"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->f:Lb3/f;

    const-string v2, "channelLogger"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/w0$b;->g:Ljava/util/concurrent/Executor;

    const-string v2, "executor"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
