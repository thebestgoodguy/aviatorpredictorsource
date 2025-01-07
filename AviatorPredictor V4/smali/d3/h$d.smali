.class Ld3/h$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/h;->e(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/util/concurrent/CountDownLatch;

.field final synthetic f:Ld3/a;

.field final synthetic g:Lf3/j;

.field final synthetic h:Ld3/h;


# direct methods
.method constructor <init>(Ld3/h;Ljava/util/concurrent/CountDownLatch;Ld3/a;Lf3/j;)V
    .locals 0

    iput-object p1, p0, Ld3/h$d;->h:Ld3/h;

    iput-object p2, p0, Ld3/h$d;->e:Ljava/util/concurrent/CountDownLatch;

    iput-object p3, p0, Ld3/h$d;->f:Ld3/a;

    iput-object p4, p0, Ld3/h$d;->g:Lf3/j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 10

    :try_start_0
    iget-object v0, p0, Ld3/h$d;->e:Ljava/util/concurrent/CountDownLatch;

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->await()V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    :goto_0
    new-instance v0, Ld3/h$d$a;

    invoke-direct {v0, p0}, Ld3/h$d$a;-><init>(Ld3/h$d;)V

    invoke-static {v0}, Lh4/g;->b(Lh4/n;)Lh4/e;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    :try_start_1
    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v4, v3, Ld3/h;->U:Lb3/b0;

    if-nez v4, :cond_0

    invoke-static {v3}, Ld3/h;->j(Ld3/h;)Ljavax/net/SocketFactory;

    move-result-object v3

    iget-object v4, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v4}, Ld3/h;->P(Ld3/h;)Ljava/net/InetSocketAddress;

    move-result-object v4

    invoke-virtual {v4}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v4

    iget-object v5, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v5}, Ld3/h;->P(Ld3/h;)Ljava/net/InetSocketAddress;

    move-result-object v5

    invoke-virtual {v5}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v5

    invoke-virtual {v3, v4, v5}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object v3

    :goto_1
    move-object v6, v3

    goto :goto_2

    :cond_0
    invoke-virtual {v4}, Lb3/b0;->b()Ljava/net/SocketAddress;

    move-result-object v3

    instance-of v3, v3, Ljava/net/InetSocketAddress;

    if-eqz v3, :cond_4

    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v4, v3, Ld3/h;->U:Lb3/b0;

    invoke-virtual {v4}, Lb3/b0;->c()Ljava/net/InetSocketAddress;

    move-result-object v4

    iget-object v5, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v5, v5, Ld3/h;->U:Lb3/b0;

    invoke-virtual {v5}, Lb3/b0;->b()Ljava/net/SocketAddress;

    move-result-object v5

    check-cast v5, Ljava/net/InetSocketAddress;

    iget-object v6, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v6, v6, Ld3/h;->U:Lb3/b0;

    invoke-virtual {v6}, Lb3/b0;->d()Ljava/lang/String;

    move-result-object v6

    iget-object v7, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v7, v7, Ld3/h;->U:Lb3/b0;

    invoke-virtual {v7}, Lb3/b0;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v3, v4, v5, v6, v7}, Ld3/h;->k(Ld3/h;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object v3

    goto :goto_1

    :goto_2
    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v3}, Ld3/h;->l(Ld3/h;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v1}, Ld3/h;->l(Ld3/h;)Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v4

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v1}, Ld3/h;->m(Ld3/h;)Ljavax/net/ssl/HostnameVerifier;

    move-result-object v5

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    invoke-virtual {v1}, Ld3/h;->X()Ljava/lang/String;

    move-result-object v7

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    invoke-virtual {v1}, Ld3/h;->Y()I

    move-result v8

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v1}, Ld3/h;->n(Ld3/h;)Le3/b;

    move-result-object v9

    invoke-static/range {v4 .. v9}, Ld3/m;->b(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Ljava/net/Socket;Ljava/lang/String;ILe3/b;)Ljavax/net/ssl/SSLSocket;

    move-result-object v6

    invoke-virtual {v6}, Ljavax/net/ssl/SSLSocket;->getSession()Ljavax/net/ssl/SSLSession;

    move-result-object v1

    :cond_1
    invoke-virtual {v6, v2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    invoke-static {v6}, Lh4/g;->g(Ljava/net/Socket;)Lh4/n;

    move-result-object v3

    invoke-static {v3}, Lh4/g;->b(Lh4/n;)Lh4/e;

    move-result-object v0

    iget-object v3, p0, Ld3/h$d;->f:Ld3/a;

    invoke-static {v6}, Lh4/g;->e(Ljava/net/Socket;)Lh4/m;

    move-result-object v4

    invoke-virtual {v3, v4, v6}, Ld3/a;->n(Lh4/m;Ljava/net/Socket;)V

    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v3}, Ld3/h;->o(Ld3/h;)Lb3/a;

    move-result-object v4

    invoke-virtual {v4}, Lb3/a;->d()Lb3/a$b;

    move-result-object v4

    sget-object v5, Lb3/a0;->a:Lb3/a$c;

    invoke-virtual {v6}, Ljava/net/Socket;->getRemoteSocketAddress()Ljava/net/SocketAddress;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v4

    sget-object v5, Lb3/a0;->b:Lb3/a$c;

    invoke-virtual {v6}, Ljava/net/Socket;->getLocalSocketAddress()Ljava/net/SocketAddress;

    move-result-object v7

    invoke-virtual {v4, v5, v7}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v4

    sget-object v5, Lb3/a0;->c:Lb3/a$c;

    invoke-virtual {v4, v5, v1}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v4

    sget-object v5, Lio/grpc/internal/p0;->a:Lb3/a$c;

    if-nez v1, :cond_2

    sget-object v7, Lb3/d1;->e:Lb3/d1;

    goto :goto_3

    :cond_2
    sget-object v7, Lb3/d1;->g:Lb3/d1;

    :goto_3
    invoke-virtual {v4, v5, v7}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v4

    invoke-virtual {v4}, Lb3/a$b;->a()Lb3/a;

    move-result-object v4

    invoke-static {v3, v4}, Ld3/h;->p(Ld3/h;Lb3/a;)Lb3/a;
    :try_end_1
    .catch Lb3/g1; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    new-instance v4, Ld3/h$f;

    iget-object v5, p0, Ld3/h$d;->g:Lf3/j;

    invoke-interface {v5, v0, v2}, Lf3/j;->b(Lh4/e;Z)Lf3/b;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Ld3/h$f;-><init>(Ld3/h;Lf3/b;)V

    invoke-static {v3, v4}, Ld3/h;->J(Ld3/h;Ld3/h$f;)Ld3/h$f;

    iget-object v0, p0, Ld3/h$d;->h:Ld3/h;

    invoke-static {v0}, Ld3/h;->i(Ld3/h;)Ljava/lang/Object;

    move-result-object v3

    monitor-enter v3

    :try_start_2
    iget-object v0, p0, Ld3/h$d;->h:Ld3/h;

    const-string v2, "socket"

    invoke-static {v6, v2}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/Socket;

    invoke-static {v0, v2}, Ld3/h;->r(Ld3/h;Ljava/net/Socket;)Ljava/net/Socket;

    if-eqz v1, :cond_3

    iget-object v0, p0, Ld3/h$d;->h:Ld3/h;

    new-instance v2, Lb3/c0$b;

    new-instance v4, Lb3/c0$c;

    invoke-direct {v4, v1}, Lb3/c0$c;-><init>(Ljavax/net/ssl/SSLSession;)V

    invoke-direct {v2, v4}, Lb3/c0$b;-><init>(Lb3/c0$c;)V

    invoke-static {v0, v2}, Ld3/h;->s(Ld3/h;Lb3/c0$b;)Lb3/c0$b;

    :cond_3
    monitor-exit v3

    return-void

    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw v0

    :cond_4
    :try_start_3
    sget-object v1, Lb3/f1;->t:Lb3/f1;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Unsupported SocketAddress implementation "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v4, p0, Ld3/h$d;->h:Ld3/h;

    iget-object v4, v4, Ld3/h;->U:Lb3/b0;

    invoke-virtual {v4}, Lb3/b0;->b()Ljava/net/SocketAddress;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/f1;->c()Lb3/g1;

    move-result-object v1

    throw v1
    :try_end_3
    .catch Lb3/g1; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    goto :goto_5

    :catch_1
    move-exception v1

    :try_start_4
    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    invoke-virtual {v3, v1}, Ld3/h;->b(Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    new-instance v3, Ld3/h$f;

    iget-object v4, p0, Ld3/h$d;->g:Lf3/j;

    invoke-interface {v4, v0, v2}, Lf3/j;->b(Lh4/e;Z)Lf3/b;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Ld3/h$f;-><init>(Ld3/h;Lf3/b;)V

    :goto_4
    invoke-static {v1, v3}, Ld3/h;->J(Ld3/h;Ld3/h$f;)Ld3/h$f;

    return-void

    :catch_2
    move-exception v1

    :try_start_5
    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    const/4 v4, 0x0

    sget-object v5, Lf3/a;->n:Lf3/a;

    invoke-virtual {v1}, Lb3/g1;->a()Lb3/f1;

    move-result-object v1

    invoke-static {v3, v4, v5, v1}, Ld3/h;->q(Ld3/h;ILf3/a;Lb3/f1;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    iget-object v1, p0, Ld3/h$d;->h:Ld3/h;

    new-instance v3, Ld3/h$f;

    iget-object v4, p0, Ld3/h$d;->g:Lf3/j;

    invoke-interface {v4, v0, v2}, Lf3/j;->b(Lh4/e;Z)Lf3/b;

    move-result-object v0

    invoke-direct {v3, v1, v0}, Ld3/h$f;-><init>(Ld3/h;Lf3/b;)V

    goto :goto_4

    :goto_5
    iget-object v3, p0, Ld3/h$d;->h:Ld3/h;

    new-instance v4, Ld3/h$f;

    iget-object v5, p0, Ld3/h$d;->g:Lf3/j;

    invoke-interface {v5, v0, v2}, Lf3/j;->b(Lh4/e;Z)Lf3/b;

    move-result-object v0

    invoke-direct {v4, v3, v0}, Ld3/h$f;-><init>(Ld3/h;Lf3/b;)V

    invoke-static {v3, v4}, Ld3/h;->J(Ld3/h;Ld3/h$f;)Ld3/h$f;

    throw v1
.end method
