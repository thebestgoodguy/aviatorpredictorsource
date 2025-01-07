.class public final Lb3/w0$b$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/w0$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/Integer;

.field private b:Lb3/c1;

.field private c:Lb3/j1;

.field private d:Lb3/w0$h;

.field private e:Ljava/util/concurrent/ScheduledExecutorService;

.field private f:Lb3/f;

.field private g:Ljava/util/concurrent/Executor;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/w0$b;
    .locals 10

    new-instance v9, Lb3/w0$b;

    iget-object v1, p0, Lb3/w0$b$a;->a:Ljava/lang/Integer;

    iget-object v2, p0, Lb3/w0$b$a;->b:Lb3/c1;

    iget-object v3, p0, Lb3/w0$b$a;->c:Lb3/j1;

    iget-object v4, p0, Lb3/w0$b$a;->d:Lb3/w0$h;

    iget-object v5, p0, Lb3/w0$b$a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v6, p0, Lb3/w0$b$a;->f:Lb3/f;

    iget-object v7, p0, Lb3/w0$b$a;->g:Ljava/util/concurrent/Executor;

    const/4 v8, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v8}, Lb3/w0$b;-><init>(Ljava/lang/Integer;Lb3/c1;Lb3/j1;Lb3/w0$h;Ljava/util/concurrent/ScheduledExecutorService;Lb3/f;Ljava/util/concurrent/Executor;Lb3/w0$a;)V

    return-object v9
.end method

.method public b(Lb3/f;)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/f;

    iput-object p1, p0, Lb3/w0$b$a;->f:Lb3/f;

    return-object p0
.end method

.method public c(I)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lb3/w0$b$a;->a:Ljava/lang/Integer;

    return-object p0
.end method

.method public d(Ljava/util/concurrent/Executor;)Lb3/w0$b$a;
    .locals 0

    iput-object p1, p0, Lb3/w0$b$a;->g:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public e(Lb3/c1;)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/c1;

    iput-object p1, p0, Lb3/w0$b$a;->b:Lb3/c1;

    return-object p0
.end method

.method public f(Ljava/util/concurrent/ScheduledExecutorService;)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Lb3/w0$b$a;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public g(Lb3/w0$h;)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/w0$h;

    iput-object p1, p0, Lb3/w0$b$a;->d:Lb3/w0$h;

    return-object p0
.end method

.method public h(Lb3/j1;)Lb3/w0$b$a;
    .locals 0

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/j1;

    iput-object p1, p0, Lb3/w0$b$a;->c:Lb3/j1;

    return-object p0
.end method
