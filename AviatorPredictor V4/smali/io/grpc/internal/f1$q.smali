.class final Lio/grpc/internal/f1$q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/j1$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "q"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1;


# direct methods
.method private constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/f1$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lio/grpc/internal/f1$q;-><init>(Lio/grpc/internal/f1;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->t(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    const-string v1, "Channel must have been shut down"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->b0(Lio/grpc/internal/f1;Z)Z

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/f1;->x0(Lio/grpc/internal/f1;Z)V

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->K(Lio/grpc/internal/f1;)V

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->h0(Lio/grpc/internal/f1;)V

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(Lb3/f1;)V
    .locals 1

    iget-object p1, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->t(Lio/grpc/internal/f1;)Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    const-string v0, "Channel must have been shut down"

    invoke-static {p1, v0}, Lq0/l;->u(ZLjava/lang/Object;)V

    return-void
.end method

.method public d(Z)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$q;->a:Lio/grpc/internal/f1;

    iget-object v1, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    invoke-static {v0}, Lio/grpc/internal/f1;->u(Lio/grpc/internal/f1;)Lio/grpc/internal/a0;

    move-result-object v0

    invoke-virtual {v1, v0, p1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method
