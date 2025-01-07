.class final Lio/grpc/internal/q1;
.super Lb3/n0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/q1$d;,
        Lio/grpc/internal/q1$c;
    }
.end annotation


# instance fields
.field private final b:Lb3/n0$d;

.field private c:Lb3/n0$h;


# direct methods
.method constructor <init>(Lb3/n0$d;)V
    .locals 1

    invoke-direct {p0}, Lb3/n0;-><init>()V

    const-string v0, "helper"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/n0$d;

    iput-object p1, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    return-void
.end method

.method static synthetic f(Lio/grpc/internal/q1;Lb3/n0$h;Lb3/q;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/grpc/internal/q1;->h(Lb3/n0$h;Lb3/q;)V

    return-void
.end method

.method static synthetic g(Lio/grpc/internal/q1;)Lb3/n0$d;
    .locals 0

    iget-object p0, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    return-object p0
.end method

.method private h(Lb3/n0$h;Lb3/q;)V
    .locals 3

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v0

    sget-object v1, Lb3/p;->i:Lb3/p;

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v1

    sget-object v2, Lb3/p;->g:Lb3/p;

    if-eq v1, v2, :cond_1

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object v1

    sget-object v2, Lb3/p;->h:Lb3/p;

    if-ne v1, v2, :cond_2

    :cond_1
    iget-object v1, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    invoke-virtual {v1}, Lb3/n0$d;->d()V

    :cond_2
    sget-object v1, Lio/grpc/internal/q1$b;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_6

    const/4 v2, 0x2

    if-eq v1, v2, :cond_5

    const/4 v2, 0x3

    if-eq v1, v2, :cond_4

    const/4 p1, 0x4

    if-ne v1, p1, :cond_3

    new-instance p1, Lio/grpc/internal/q1$c;

    invoke-virtual {p2}, Lb3/q;->d()Lb3/f1;

    move-result-object p2

    invoke-static {p2}, Lb3/n0$e;->f(Lb3/f1;)Lb3/n0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/q1$c;-><init>(Lb3/n0$e;)V

    goto :goto_1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unsupported state:"

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    new-instance p2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lb3/n0$e;->h(Lb3/n0$h;)Lb3/n0$e;

    move-result-object p1

    invoke-direct {p2, p1}, Lio/grpc/internal/q1$c;-><init>(Lb3/n0$e;)V

    goto :goto_0

    :cond_5
    new-instance p1, Lio/grpc/internal/q1$c;

    invoke-static {}, Lb3/n0$e;->g()Lb3/n0$e;

    move-result-object p2

    invoke-direct {p1, p2}, Lio/grpc/internal/q1$c;-><init>(Lb3/n0$e;)V

    goto :goto_1

    :cond_6
    new-instance p2, Lio/grpc/internal/q1$d;

    invoke-direct {p2, p0, p1}, Lio/grpc/internal/q1$d;-><init>(Lio/grpc/internal/q1;Lb3/n0$h;)V

    :goto_0
    move-object p1, p2

    :goto_1
    iget-object p2, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    invoke-virtual {p2, v0, p1}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    return-void
.end method


# virtual methods
.method public b(Lb3/f1;)V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb3/n0$h;->f()V

    const/4 v0, 0x0

    iput-object v0, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    sget-object v1, Lb3/p;->g:Lb3/p;

    new-instance v2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lb3/n0$e;->f(Lb3/f1;)Lb3/n0$e;

    move-result-object p1

    invoke-direct {v2, p1}, Lio/grpc/internal/q1$c;-><init>(Lb3/n0$e;)V

    invoke-virtual {v0, v1, v2}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    return-void
.end method

.method public c(Lb3/n0$g;)V
    .locals 4

    invoke-virtual {p1}, Lb3/n0$g;->a()Ljava/util/List;

    move-result-object p1

    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    invoke-static {}, Lb3/n0$b;->c()Lb3/n0$b$a;

    move-result-object v1

    invoke-virtual {v1, p1}, Lb3/n0$b$a;->e(Ljava/util/List;)Lb3/n0$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lb3/n0$b$a;->b()Lb3/n0$b;

    move-result-object p1

    invoke-virtual {v0, p1}, Lb3/n0$d;->a(Lb3/n0$b;)Lb3/n0$h;

    move-result-object p1

    new-instance v0, Lio/grpc/internal/q1$a;

    invoke-direct {v0, p0, p1}, Lio/grpc/internal/q1$a;-><init>(Lio/grpc/internal/q1;Lb3/n0$h;)V

    invoke-virtual {p1, v0}, Lb3/n0$h;->g(Lb3/n0$j;)V

    iput-object p1, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    iget-object v0, p0, Lio/grpc/internal/q1;->b:Lb3/n0$d;

    sget-object v1, Lb3/p;->e:Lb3/p;

    new-instance v2, Lio/grpc/internal/q1$c;

    invoke-static {p1}, Lb3/n0$e;->h(Lb3/n0$h;)Lb3/n0$e;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/grpc/internal/q1$c;-><init>(Lb3/n0$e;)V

    invoke-virtual {v0, v1, v2}, Lb3/n0$d;->e(Lb3/p;Lb3/n0$i;)V

    invoke-virtual {p1}, Lb3/n0$h;->e()V

    goto :goto_0

    :cond_0
    invoke-virtual {v0, p1}, Lb3/n0$h;->h(Ljava/util/List;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb3/n0$h;->e()V

    :cond_0
    return-void
.end method

.method public e()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/q1;->c:Lb3/n0$h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb3/n0$h;->f()V

    :cond_0
    return-void
.end method
