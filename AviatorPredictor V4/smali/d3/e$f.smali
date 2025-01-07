.class final Ld3/e$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/t;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "f"
.end annotation


# instance fields
.field private final e:Ljava/util/concurrent/Executor;

.field private final f:Z

.field private final g:Z

.field private final h:Lio/grpc/internal/n2$b;

.field private final i:Ljavax/net/SocketFactory;

.field private final j:Ljavax/net/ssl/SSLSocketFactory;

.field private final k:Ljavax/net/ssl/HostnameVerifier;

.field private final l:Le3/b;

.field private final m:I

.field private final n:Z

.field private final o:J

.field private final p:Lio/grpc/internal/h;

.field private final q:J

.field private final r:I

.field private final s:Z

.field private final t:I

.field private final u:Ljava/util/concurrent/ScheduledExecutorService;

.field private final v:Z

.field private w:Z


# direct methods
.method private constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IZJJIZILio/grpc/internal/n2$b;Z)V
    .locals 8

    move-object v0, p0

    move-object v1, p1

    move-wide/from16 v2, p9

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-nez p2, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    iput-boolean v6, v0, Ld3/e$f;->g:Z

    if-eqz v6, :cond_1

    sget-object v6, Lio/grpc/internal/q0;->u:Lio/grpc/internal/e2$d;

    invoke-static {v6}, Lio/grpc/internal/e2;->d(Lio/grpc/internal/e2$d;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/concurrent/ScheduledExecutorService;

    goto :goto_1

    :cond_1
    move-object v6, p2

    :goto_1
    iput-object v6, v0, Ld3/e$f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    move-object v6, p3

    iput-object v6, v0, Ld3/e$f;->i:Ljavax/net/SocketFactory;

    move-object v6, p4

    iput-object v6, v0, Ld3/e$f;->j:Ljavax/net/ssl/SSLSocketFactory;

    move-object v6, p5

    iput-object v6, v0, Ld3/e$f;->k:Ljavax/net/ssl/HostnameVerifier;

    move-object v6, p6

    iput-object v6, v0, Ld3/e$f;->l:Le3/b;

    move v6, p7

    iput v6, v0, Ld3/e$f;->m:I

    move/from16 v6, p8

    iput-boolean v6, v0, Ld3/e$f;->n:Z

    iput-wide v2, v0, Ld3/e$f;->o:J

    new-instance v6, Lio/grpc/internal/h;

    const-string v7, "keepalive time nanos"

    invoke-direct {v6, v7, v2, v3}, Lio/grpc/internal/h;-><init>(Ljava/lang/String;J)V

    iput-object v6, v0, Ld3/e$f;->p:Lio/grpc/internal/h;

    move-wide/from16 v2, p11

    iput-wide v2, v0, Ld3/e$f;->q:J

    move/from16 v2, p13

    iput v2, v0, Ld3/e$f;->r:I

    move/from16 v2, p14

    iput-boolean v2, v0, Ld3/e$f;->s:Z

    move/from16 v2, p15

    iput v2, v0, Ld3/e$f;->t:I

    move/from16 v2, p17

    iput-boolean v2, v0, Ld3/e$f;->v:Z

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    iput-boolean v4, v0, Ld3/e$f;->f:Z

    const-string v2, "transportTracerFactory"

    move-object/from16 v3, p16

    invoke-static {v3, v2}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/grpc/internal/n2$b;

    iput-object v2, v0, Ld3/e$f;->h:Lio/grpc/internal/n2$b;

    if-eqz v4, :cond_3

    invoke-static {}, Ld3/e;->f()Lio/grpc/internal/e2$d;

    move-result-object v1

    invoke-static {v1}, Lio/grpc/internal/e2;->d(Lio/grpc/internal/e2$d;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/Executor;

    :cond_3
    iput-object v1, v0, Ld3/e$f;->e:Ljava/util/concurrent/Executor;

    return-void
.end method

.method synthetic constructor <init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IZJJIZILio/grpc/internal/n2$b;ZLd3/e$a;)V
    .locals 0

    invoke-direct/range {p0 .. p17}, Ld3/e$f;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IZJJIZILio/grpc/internal/n2$b;Z)V

    return-void
.end method


# virtual methods
.method public B()Ljava/util/concurrent/ScheduledExecutorService;
    .locals 1

    iget-object v0, p0, Ld3/e$f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    return-object v0
.end method

.method public V(Ljava/net/SocketAddress;Lio/grpc/internal/t$a;Lb3/f;)Lio/grpc/internal/v;
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Ld3/e$f;->w:Z

    if-nez v1, :cond_1

    iget-object v1, v0, Ld3/e$f;->p:Lio/grpc/internal/h;

    invoke-virtual {v1}, Lio/grpc/internal/h;->d()Lio/grpc/internal/h$b;

    move-result-object v1

    new-instance v2, Ld3/e$f$a;

    move-object v15, v2

    invoke-direct {v2, v0, v1}, Ld3/e$f$a;-><init>(Ld3/e$f;Lio/grpc/internal/h$b;)V

    move-object/from16 v3, p1

    check-cast v3, Ljava/net/InetSocketAddress;

    new-instance v19, Ld3/h;

    move-object/from16 v2, v19

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->d()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->b()Lb3/a;

    move-result-object v6

    iget-object v7, v0, Ld3/e$f;->e:Ljava/util/concurrent/Executor;

    iget-object v8, v0, Ld3/e$f;->i:Ljavax/net/SocketFactory;

    iget-object v9, v0, Ld3/e$f;->j:Ljavax/net/ssl/SSLSocketFactory;

    iget-object v10, v0, Ld3/e$f;->k:Ljavax/net/ssl/HostnameVerifier;

    iget-object v11, v0, Ld3/e$f;->l:Le3/b;

    iget v12, v0, Ld3/e$f;->m:I

    iget v13, v0, Ld3/e$f;->r:I

    invoke-virtual/range {p2 .. p2}, Lio/grpc/internal/t$a;->c()Lb3/b0;

    move-result-object v14

    move-object/from16 p3, v1

    iget v1, v0, Ld3/e$f;->t:I

    move/from16 v16, v1

    iget-object v1, v0, Ld3/e$f;->h:Lio/grpc/internal/n2$b;

    invoke-virtual {v1}, Lio/grpc/internal/n2$b;->a()Lio/grpc/internal/n2;

    move-result-object v17

    iget-boolean v1, v0, Ld3/e$f;->v:Z

    move/from16 v18, v1

    invoke-direct/range {v2 .. v18}, Ld3/h;-><init>(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lb3/a;Ljava/util/concurrent/Executor;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IILb3/b0;Ljava/lang/Runnable;ILio/grpc/internal/n2;Z)V

    iget-boolean v1, v0, Ld3/e$f;->n:Z

    if-eqz v1, :cond_0

    const/4 v5, 0x1

    invoke-virtual/range {p3 .. p3}, Lio/grpc/internal/h$b;->b()J

    move-result-wide v6

    iget-wide v8, v0, Ld3/e$f;->q:J

    iget-boolean v10, v0, Ld3/e$f;->s:Z

    move-object/from16 v4, v19

    invoke-virtual/range {v4 .. v10}, Ld3/h;->T(ZJJZ)V

    :cond_0
    return-object v19

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "The transport factory is closed."

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public close()V
    .locals 2

    iget-boolean v0, p0, Ld3/e$f;->w:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/e$f;->w:Z

    iget-boolean v0, p0, Ld3/e$f;->g:Z

    if-eqz v0, :cond_1

    sget-object v0, Lio/grpc/internal/q0;->u:Lio/grpc/internal/e2$d;

    iget-object v1, p0, Ld3/e$f;->u:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v0, v1}, Lio/grpc/internal/e2;->f(Lio/grpc/internal/e2$d;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-boolean v0, p0, Ld3/e$f;->f:Z

    if-eqz v0, :cond_2

    invoke-static {}, Ld3/e;->f()Lio/grpc/internal/e2$d;

    move-result-object v0

    iget-object v1, p0, Ld3/e$f;->e:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, Lio/grpc/internal/e2;->f(Lio/grpc/internal/e2$d;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    return-void
.end method
