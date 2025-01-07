.class public final Lb3/b0$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb3/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/net/SocketAddress;

.field private b:Ljava/net/InetSocketAddress;

.field private c:Ljava/lang/String;

.field private d:Ljava/lang/String;


# direct methods
.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lb3/b0$a;)V
    .locals 0

    invoke-direct {p0}, Lb3/b0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lb3/b0;
    .locals 7

    new-instance v6, Lb3/b0;

    iget-object v1, p0, Lb3/b0$b;->a:Ljava/net/SocketAddress;

    iget-object v2, p0, Lb3/b0$b;->b:Ljava/net/InetSocketAddress;

    iget-object v3, p0, Lb3/b0$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lb3/b0$b;->d:Ljava/lang/String;

    const/4 v5, 0x0

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Lb3/b0;-><init>(Ljava/net/SocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lb3/b0$a;)V

    return-object v6
.end method

.method public b(Ljava/lang/String;)Lb3/b0$b;
    .locals 0

    iput-object p1, p0, Lb3/b0$b;->d:Ljava/lang/String;

    return-object p0
.end method

.method public c(Ljava/net/SocketAddress;)Lb3/b0$b;
    .locals 1

    const-string v0, "proxyAddress"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/SocketAddress;

    iput-object p1, p0, Lb3/b0$b;->a:Ljava/net/SocketAddress;

    return-object p0
.end method

.method public d(Ljava/net/InetSocketAddress;)Lb3/b0$b;
    .locals 1

    const-string v0, "targetAddress"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/InetSocketAddress;

    iput-object p1, p0, Lb3/b0$b;->b:Ljava/net/InetSocketAddress;

    return-object p0
.end method

.method public e(Ljava/lang/String;)Lb3/b0$b;
    .locals 0

    iput-object p1, p0, Lb3/b0$b;->c:Ljava/lang/String;

    return-object p0
.end method
