.class final Lio/grpc/internal/f1$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->k(Z)Lb3/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "g"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-virtual {v0}, Lio/grpc/internal/f1;->D0()V

    iget-object v0, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->s(Lio/grpc/internal/f1;)Lb3/n0$i;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->s(Lio/grpc/internal/f1;)Lb3/n0$i;

    move-result-object v0

    invoke-virtual {v0}, Lb3/n0$i;->b()V

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$u;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/f1$g;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->z0(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$u;

    move-result-object v0

    iget-object v0, v0, Lio/grpc/internal/f1$u;->a:Lio/grpc/internal/j$b;

    invoke-virtual {v0}, Lio/grpc/internal/j$b;->c()V

    :cond_1
    return-void
.end method
