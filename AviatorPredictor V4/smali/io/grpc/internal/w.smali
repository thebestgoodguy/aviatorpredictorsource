.class final Lio/grpc/internal/w;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/w$a;
    }
.end annotation


# instance fields
.field private a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lio/grpc/internal/w$a;",
            ">;"
        }
    .end annotation
.end field

.field private volatile b:Lb3/p;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/w;->a:Ljava/util/ArrayList;

    sget-object v0, Lb3/p;->h:Lb3/p;

    iput-object v0, p0, Lio/grpc/internal/w;->b:Lb3/p;

    return-void
.end method


# virtual methods
.method a()Lb3/p;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/w;->b:Lb3/p;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Channel state API is not implemented"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method b(Lb3/p;)V
    .locals 2

    const-string v0, "newState"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lio/grpc/internal/w;->b:Lb3/p;

    if-eq v0, p1, :cond_1

    iget-object v0, p0, Lio/grpc/internal/w;->b:Lb3/p;

    sget-object v1, Lb3/p;->i:Lb3/p;

    if-eq v0, v1, :cond_1

    iput-object p1, p0, Lio/grpc/internal/w;->b:Lb3/p;

    iget-object p1, p0, Lio/grpc/internal/w;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/w;->a:Ljava/util/ArrayList;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/w;->a:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/w$a;

    invoke-virtual {v0}, Lio/grpc/internal/w$a;->a()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method c(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;Lb3/p;)V
    .locals 1

    const-string v0, "callback"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "executor"

    invoke-static {p2, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "source"

    invoke-static {p3, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lio/grpc/internal/w$a;

    invoke-direct {v0, p1, p2}, Lio/grpc/internal/w$a;-><init>(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    iget-object p1, p0, Lio/grpc/internal/w;->b:Lb3/p;

    if-eq p1, p3, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/w$a;->a()V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/grpc/internal/w;->a:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_0
    return-void
.end method
