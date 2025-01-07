.class final Lio/grpc/internal/f1$n$b;
.super Lio/grpc/internal/y1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$n;->a(Lb3/v0;Lb3/c;Lb3/u0;Lb3/r;)Lio/grpc/internal/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        ">",
        "Lio/grpc/internal/y1<",
        "TReqT;>;"
    }
.end annotation


# instance fields
.field final synthetic B:Lb3/v0;

.field final synthetic C:Lb3/u0;

.field final synthetic D:Lb3/c;

.field final synthetic E:Lio/grpc/internal/z1;

.field final synthetic F:Lio/grpc/internal/s0;

.field final synthetic G:Lio/grpc/internal/y1$c0;

.field final synthetic H:Lb3/r;

.field final synthetic I:Lio/grpc/internal/f1$n;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$n;Lb3/v0;Lb3/u0;Lb3/c;Lio/grpc/internal/z1;Lio/grpc/internal/s0;Lio/grpc/internal/y1$c0;Lb3/r;)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    move-object v13, p0

    move-object/from16 v0, p1

    move-object/from16 v1, p4

    iput-object v0, v13, Lio/grpc/internal/f1$n$b;->I:Lio/grpc/internal/f1$n;

    move-object/from16 v2, p2

    iput-object v2, v13, Lio/grpc/internal/f1$n$b;->B:Lb3/v0;

    move-object/from16 v3, p3

    iput-object v3, v13, Lio/grpc/internal/f1$n$b;->C:Lb3/u0;

    iput-object v1, v13, Lio/grpc/internal/f1$n$b;->D:Lb3/c;

    move-object/from16 v10, p5

    iput-object v10, v13, Lio/grpc/internal/f1$n$b;->E:Lio/grpc/internal/z1;

    move-object/from16 v11, p6

    iput-object v11, v13, Lio/grpc/internal/f1$n$b;->F:Lio/grpc/internal/s0;

    move-object/from16 v12, p7

    iput-object v12, v13, Lio/grpc/internal/f1$n$b;->G:Lio/grpc/internal/y1$c0;

    move-object/from16 v4, p8

    iput-object v4, v13, Lio/grpc/internal/f1$n$b;->H:Lb3/r;

    iget-object v4, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v4}, Lio/grpc/internal/f1;->y(Lio/grpc/internal/f1;)Lio/grpc/internal/y1$t;

    move-result-object v4

    iget-object v5, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v5}, Lio/grpc/internal/f1;->z(Lio/grpc/internal/f1;)J

    move-result-wide v5

    iget-object v7, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v7}, Lio/grpc/internal/f1;->A(Lio/grpc/internal/f1;)J

    move-result-wide v7

    iget-object v9, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v9, v1}, Lio/grpc/internal/f1;->B(Lio/grpc/internal/f1;Lb3/c;)Ljava/util/concurrent/Executor;

    move-result-object v9

    iget-object v0, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->C(Lio/grpc/internal/f1;)Lio/grpc/internal/t;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/t;->B()Ljava/util/concurrent/ScheduledExecutorService;

    move-result-object v14

    move-object v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move-object v3, v4

    move-wide v4, v5

    move-wide v6, v7

    move-object v8, v9

    move-object v9, v14

    invoke-direct/range {v0 .. v12}, Lio/grpc/internal/y1;-><init>(Lb3/v0;Lb3/u0;Lio/grpc/internal/y1$t;JJLjava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Lio/grpc/internal/z1;Lio/grpc/internal/s0;Lio/grpc/internal/y1$c0;)V

    return-void
.end method


# virtual methods
.method f0(Lb3/u0;Lb3/k$a;IZ)Lio/grpc/internal/q;
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->D:Lb3/c;

    invoke-virtual {v0, p2}, Lb3/c;->q(Lb3/k$a;)Lb3/c;

    move-result-object p2

    invoke-static {p2, p1, p3, p4}, Lio/grpc/internal/q0;->f(Lb3/c;Lb3/u0;IZ)[Lb3/k;

    move-result-object p3

    iget-object p4, p0, Lio/grpc/internal/f1$n$b;->I:Lio/grpc/internal/f1$n;

    new-instance v0, Lio/grpc/internal/s1;

    iget-object v1, p0, Lio/grpc/internal/f1$n$b;->B:Lb3/v0;

    invoke-direct {v0, v1, p1, p2}, Lio/grpc/internal/s1;-><init>(Lb3/v0;Lb3/u0;Lb3/c;)V

    invoke-static {p4, v0}, Lio/grpc/internal/f1$n;->b(Lio/grpc/internal/f1$n;Lb3/n0$f;)Lio/grpc/internal/s;

    move-result-object p4

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->H:Lb3/r;

    invoke-virtual {v0}, Lb3/r;->b()Lb3/r;

    move-result-object v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/f1$n$b;->B:Lb3/v0;

    invoke-interface {p4, v1, p1, p2, p3}, Lio/grpc/internal/s;->c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p2, p0, Lio/grpc/internal/f1$n$b;->H:Lb3/r;

    invoke-virtual {p2, v0}, Lb3/r;->f(Lb3/r;)V

    return-object p1

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lio/grpc/internal/f1$n$b;->H:Lb3/r;

    invoke-virtual {p2, v0}, Lb3/r;->f(Lb3/r;)V

    throw p1
.end method

.method g0()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->I:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->D(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/grpc/internal/f1$a0;->d(Lio/grpc/internal/y1;)V

    return-void
.end method

.method h0()Lb3/f1;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$n$b;->I:Lio/grpc/internal/f1$n;

    iget-object v0, v0, Lio/grpc/internal/f1$n;->a:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->D(Lio/grpc/internal/f1;)Lio/grpc/internal/f1$a0;

    move-result-object v0

    invoke-virtual {v0, p0}, Lio/grpc/internal/f1$a0;->a(Lio/grpc/internal/y1;)Lb3/f1;

    move-result-object v0

    return-object v0
.end method
