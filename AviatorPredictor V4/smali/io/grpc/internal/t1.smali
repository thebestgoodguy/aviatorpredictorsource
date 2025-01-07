.class Lio/grpc/internal/t1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lb3/c1;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/t1$c;
    }
.end annotation


# static fields
.field private static final d:Ljava/util/logging/Logger;

.field private static final e:Lio/grpc/internal/t1$c;

.field private static final f:Lq0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq0/p<",
            "Ljava/net/ProxySelector;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lq0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq0/p<",
            "Ljava/net/ProxySelector;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lio/grpc/internal/t1$c;

.field private final c:Ljava/net/InetSocketAddress;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lio/grpc/internal/t1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    new-instance v0, Lio/grpc/internal/t1$a;

    invoke-direct {v0}, Lio/grpc/internal/t1$a;-><init>()V

    sput-object v0, Lio/grpc/internal/t1;->e:Lio/grpc/internal/t1$c;

    new-instance v0, Lio/grpc/internal/t1$b;

    invoke-direct {v0}, Lio/grpc/internal/t1$b;-><init>()V

    sput-object v0, Lio/grpc/internal/t1;->f:Lq0/p;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    sget-object v0, Lio/grpc/internal/t1;->f:Lq0/p;

    sget-object v1, Lio/grpc/internal/t1;->e:Lio/grpc/internal/t1$c;

    const-string v2, "GRPC_PROXY_EXP"

    invoke-static {v2}, Ljava/lang/System;->getenv(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0, v0, v1, v2}, Lio/grpc/internal/t1;-><init>(Lq0/p;Lio/grpc/internal/t1$c;Ljava/lang/String;)V

    return-void
.end method

.method constructor <init>(Lq0/p;Lio/grpc/internal/t1$c;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq0/p<",
            "Ljava/net/ProxySelector;",
            ">;",
            "Lio/grpc/internal/t1$c;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lq0/p;

    iput-object p1, p0, Lio/grpc/internal/t1;->a:Lq0/p;

    invoke-static {p2}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/t1$c;

    iput-object p1, p0, Lio/grpc/internal/t1;->b:Lio/grpc/internal/t1$c;

    if-eqz p3, :cond_0

    invoke-static {p3}, Lio/grpc/internal/t1;->d(Ljava/lang/String;)Ljava/net/InetSocketAddress;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lio/grpc/internal/t1;->c:Ljava/net/InetSocketAddress;

    return-void
.end method

.method static synthetic b()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    return-object v0
.end method

.method private c(Ljava/net/InetSocketAddress;)Lb3/b1;
    .locals 10

    invoke-static {p1}, Lio/grpc/internal/q0;->h(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v3

    const/4 v8, 0x0

    :try_start_0
    new-instance v9, Ljava/net/URI;

    const-string v1, "https"

    const/4 v2, 0x0

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, v9

    invoke-direct/range {v0 .. v7}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    iget-object v0, p0, Lio/grpc/internal/t1;->a:Lq0/p;

    invoke-interface {v0}, Lq0/p;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/ProxySelector;

    if-nez v0, :cond_0

    sget-object p1, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-string v1, "proxy selector is null, so continuing without proxy lookup"

    invoke-virtual {p1, v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;)V

    return-object v8

    :cond_0
    invoke-virtual {v0, v9}, Ljava/net/ProxySelector;->select(Ljava/net/URI;)Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    sget-object v1, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    const-string v2, "More than 1 proxy detected, gRPC will select the first one"

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    :cond_1
    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/Proxy;

    invoke-virtual {v0}, Ljava/net/Proxy;->type()Ljava/net/Proxy$Type;

    move-result-object v1

    sget-object v2, Ljava/net/Proxy$Type;->DIRECT:Ljava/net/Proxy$Type;

    if-ne v1, v2, :cond_2

    return-object v8

    :cond_2
    invoke-virtual {v0}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    iget-object v1, p0, Lio/grpc/internal/t1;->b:Lio/grpc/internal/t1$c;

    invoke-static {v0}, Lio/grpc/internal/q0;->h(Ljava/net/InetSocketAddress;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v4

    const/4 v7, 0x0

    const-string v5, "https"

    const-string v6, ""

    invoke-interface/range {v1 .. v7}, Lio/grpc/internal/t1$c;->a(Ljava/lang/String;Ljava/net/InetAddress;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/PasswordAuthentication;

    move-result-object v1

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->isUnresolved()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object v2

    new-instance v3, Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    invoke-direct {v3, v2, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/net/InetAddress;I)V

    move-object v0, v3

    :cond_3
    invoke-static {}, Lb3/b0;->e()Lb3/b0$b;

    move-result-object v2

    invoke-virtual {v2, p1}, Lb3/b0$b;->d(Ljava/net/InetSocketAddress;)Lb3/b0$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lb3/b0$b;->c(Ljava/net/SocketAddress;)Lb3/b0$b;

    move-result-object p1

    if-nez v1, :cond_4

    invoke-virtual {p1}, Lb3/b0$b;->a()Lb3/b0;

    move-result-object p1

    return-object p1

    :cond_4
    invoke-virtual {v1}, Ljava/net/PasswordAuthentication;->getUserName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lb3/b0$b;->e(Ljava/lang/String;)Lb3/b0$b;

    move-result-object p1

    invoke-virtual {v1}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v0

    if-nez v0, :cond_5

    goto :goto_0

    :cond_5
    new-instance v8, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/net/PasswordAuthentication;->getPassword()[C

    move-result-object v0

    invoke-direct {v8, v0}, Ljava/lang/String;-><init>([C)V

    :goto_0
    invoke-virtual {p1, v8}, Lb3/b0$b;->b(Ljava/lang/String;)Lb3/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Lb3/b0$b;->a()Lb3/b0;

    move-result-object p1

    return-object p1

    :catch_0
    move-exception p1

    sget-object v0, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "Failed to construct URI for proxy lookup, proceeding without proxy"

    invoke-virtual {v0, v1, v2, p1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-object v8
.end method

.method private static d(Ljava/lang/String;)Ljava/net/InetSocketAddress;
    .locals 3

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const/4 v0, 0x2

    const-string v1, ":"

    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    const/16 v0, 0x50

    array-length v1, p0

    const/4 v2, 0x1

    if-le v1, v2, :cond_1

    aget-object v0, p0, v2

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    :cond_1
    sget-object v1, Lio/grpc/internal/t1;->d:Ljava/util/logging/Logger;

    const-string v2, "Detected GRPC_PROXY_EXP and will honor it, but this feature will be removed in a future release. Use the JVM flags \"-Dhttps.proxyHost=HOST -Dhttps.proxyPort=PORT\" to set the https proxy for this JVM."

    invoke-virtual {v1, v2}, Ljava/util/logging/Logger;->warning(Ljava/lang/String;)V

    new-instance v1, Ljava/net/InetSocketAddress;

    const/4 v2, 0x0

    aget-object p0, p0, v2

    invoke-direct {v1, p0, v0}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V

    return-object v1
.end method


# virtual methods
.method public a(Ljava/net/SocketAddress;)Lb3/b1;
    .locals 2

    instance-of v0, p1, Ljava/net/InetSocketAddress;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/t1;->c:Ljava/net/InetSocketAddress;

    if-eqz v0, :cond_1

    invoke-static {}, Lb3/b0;->e()Lb3/b0$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/t1;->c:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1}, Lb3/b0$b;->c(Ljava/net/SocketAddress;)Lb3/b0$b;

    move-result-object v0

    check-cast p1, Ljava/net/InetSocketAddress;

    invoke-virtual {v0, p1}, Lb3/b0$b;->d(Ljava/net/InetSocketAddress;)Lb3/b0$b;

    move-result-object p1

    invoke-virtual {p1}, Lb3/b0$b;->a()Lb3/b0;

    move-result-object p1

    return-object p1

    :cond_1
    check-cast p1, Ljava/net/InetSocketAddress;

    invoke-direct {p0, p1}, Lio/grpc/internal/t1;->c(Ljava/net/InetSocketAddress;)Lb3/b1;

    move-result-object p1

    return-object p1
.end method
