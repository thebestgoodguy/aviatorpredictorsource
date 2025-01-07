.class final Lio/grpc/internal/f1$z$a;
.super Lio/grpc/internal/x0$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$z;->g(Lb3/n0$j;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lb3/n0$j;

.field final synthetic b:Lio/grpc/internal/f1$z;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$z;Lb3/n0$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iput-object p2, p0, Lio/grpc/internal/f1$z$a;->a:Lb3/n0$j;

    invoke-direct {p0}, Lio/grpc/internal/x0$j;-><init>()V

    return-void
.end method


# virtual methods
.method a(Lio/grpc/internal/x0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object v0, v0, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method b(Lio/grpc/internal/x0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object v0, v0, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    iget-object v0, v0, Lio/grpc/internal/f1;->i0:Lio/grpc/internal/v0;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method

.method c(Lio/grpc/internal/x0;Lb3/q;)V
    .locals 2

    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->a:Lb3/n0$j;

    const/4 v0, 0x1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const-string v1, "listener is null"

    invoke-static {p1, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->a:Lb3/n0$j;

    invoke-interface {p1, p2}, Lb3/n0$j;->a(Lb3/q;)V

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object p1

    sget-object v1, Lb3/p;->g:Lb3/p;

    if-eq p1, v1, :cond_1

    invoke-virtual {p2}, Lb3/q;->c()Lb3/p;

    move-result-object p1

    sget-object p2, Lb3/p;->h:Lb3/p;

    if-ne p1, p2, :cond_2

    :cond_1
    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object p1, p1, Lio/grpc/internal/f1$z;->b:Lio/grpc/internal/f1$u;

    iget-boolean p2, p1, Lio/grpc/internal/f1$u;->c:Z

    if-nez p2, :cond_2

    iget-boolean p1, p1, Lio/grpc/internal/f1$u;->b:Z

    if-nez p1, :cond_2

    sget-object p1, Lio/grpc/internal/f1;->n0:Ljava/util/logging/Logger;

    sget-object p2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v1, "LoadBalancer should call Helper.refreshNameResolution() to refresh name resolution if subchannel state becomes TRANSIENT_FAILURE or IDLE. This will no longer happen automatically in the future releases"

    invoke-virtual {p1, p2, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object p1, p1, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->Z(Lio/grpc/internal/f1;)V

    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object p1, p1, Lio/grpc/internal/f1$z;->b:Lio/grpc/internal/f1$u;

    iput-boolean v0, p1, Lio/grpc/internal/f1$u;->b:Z

    :cond_2
    return-void
.end method

.method d(Lio/grpc/internal/x0;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object v0, v0, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->l0(Lio/grpc/internal/f1;)Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object v0, v0, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->g0(Lio/grpc/internal/f1;)Lb3/c0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb3/c0;->k(Lb3/g0;)V

    iget-object p1, p0, Lio/grpc/internal/f1$z$a;->b:Lio/grpc/internal/f1$z;

    iget-object p1, p1, Lio/grpc/internal/f1$z;->k:Lio/grpc/internal/f1;

    invoke-static {p1}, Lio/grpc/internal/f1;->h0(Lio/grpc/internal/f1;)V

    return-void
.end method
