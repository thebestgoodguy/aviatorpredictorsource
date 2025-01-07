.class final Lb3/m$b;
.super Lb3/b$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "b"
.end annotation


# instance fields
.field private final a:Lb3/b$b;

.field private final b:Ljava/util/concurrent/Executor;

.field private final c:Lb3/b$a;

.field private final d:Lb3/r;

.field final synthetic e:Lb3/m;


# direct methods
.method public constructor <init>(Lb3/m;Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;Lb3/r;)V
    .locals 0

    iput-object p1, p0, Lb3/m$b;->e:Lb3/m;

    invoke-direct {p0}, Lb3/b$a;-><init>()V

    iput-object p2, p0, Lb3/m$b;->a:Lb3/b$b;

    iput-object p3, p0, Lb3/m$b;->b:Ljava/util/concurrent/Executor;

    const-string p1, "delegate"

    invoke-static {p4, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/b$a;

    iput-object p1, p0, Lb3/m$b;->c:Lb3/b$a;

    const-string p1, "context"

    invoke-static {p5, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/r;

    iput-object p1, p0, Lb3/m$b;->d:Lb3/r;

    return-void
.end method


# virtual methods
.method public a(Lb3/u0;)V
    .locals 6

    const-string v0, "headers"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lb3/m$b;->d:Lb3/r;

    invoke-virtual {v0}, Lb3/r;->b()Lb3/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lb3/m$b;->e:Lb3/m;

    invoke-static {v1}, Lb3/m;->b(Lb3/m;)Lb3/b;

    move-result-object v1

    iget-object v2, p0, Lb3/m$b;->a:Lb3/b$b;

    iget-object v3, p0, Lb3/m$b;->b:Ljava/util/concurrent/Executor;

    new-instance v4, Lb3/m$a;

    iget-object v5, p0, Lb3/m$b;->c:Lb3/b$a;

    invoke-direct {v4, v5, p1}, Lb3/m$a;-><init>(Lb3/b$a;Lb3/u0;)V

    invoke-virtual {v1, v2, v3, v4}, Lb3/b;->a(Lb3/b$b;Ljava/util/concurrent/Executor;Lb3/b$a;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Lb3/m$b;->d:Lb3/r;

    invoke-virtual {p1, v0}, Lb3/r;->f(Lb3/r;)V

    return-void

    :catchall_0
    move-exception p1

    iget-object v1, p0, Lb3/m$b;->d:Lb3/r;

    invoke-virtual {v1, v0}, Lb3/r;->f(Lb3/r;)V

    throw p1
.end method

.method public b(Lb3/f1;)V
    .locals 1

    iget-object v0, p0, Lb3/m$b;->c:Lb3/b$a;

    invoke-virtual {v0, p1}, Lb3/b$a;->b(Lb3/f1;)V

    return-void
.end method
