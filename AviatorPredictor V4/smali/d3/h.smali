.class Ld3/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/v;
.implements Ld3/b$a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/h$f;
    }
.end annotation


# static fields
.field private static final X:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lf3/a;",
            "Lb3/f1;",
            ">;"
        }
    .end annotation
.end field

.field private static final Y:Ljava/util/logging/Logger;

.field private static final Z:[Ld3/g;


# instance fields
.field private final A:Ljavax/net/SocketFactory;

.field private B:Ljavax/net/ssl/SSLSocketFactory;

.field private C:Ljavax/net/ssl/HostnameVerifier;

.field private D:Ljava/net/Socket;

.field private E:I

.field private final F:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Ld3/g;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Le3/b;

.field private H:Lf3/c;

.field private I:Ljava/util/concurrent/ScheduledExecutorService;

.field private J:Lio/grpc/internal/b1;

.field private K:Z

.field private L:J

.field private M:J

.field private N:Z

.field private final O:Ljava/lang/Runnable;

.field private final P:I

.field private final Q:Z

.field private final R:Lio/grpc/internal/n2;

.field private final S:Lio/grpc/internal/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/v0<",
            "Ld3/g;",
            ">;"
        }
    .end annotation
.end field

.field private T:Lb3/c0$b;

.field final U:Lb3/b0;

.field V:Ljava/lang/Runnable;

.field W:Lv0/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lv0/d<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Ljava/net/InetSocketAddress;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/Random;

.field private final e:Lq0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq0/p<",
            "Lq0/n;",
            ">;"
        }
    .end annotation
.end field

.field private final f:I

.field private g:Lio/grpc/internal/j1$a;

.field private h:Lf3/b;

.field private i:Ld3/i;

.field private j:Ld3/b;

.field private k:Ld3/p;

.field private final l:Ljava/lang/Object;

.field private final m:Lb3/h0;

.field private n:I

.field private final o:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ld3/g;",
            ">;"
        }
    .end annotation
.end field

.field private final p:Ljava/util/concurrent/Executor;

.field private final q:Lio/grpc/internal/c2;

.field private final r:I

.field private s:I

.field private t:Ld3/h$f;

.field private u:Lb3/a;

.field private v:Lb3/f1;

.field private w:Z

.field private x:Lio/grpc/internal/u0;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Ld3/h;->Q()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Ld3/h;->X:Ljava/util/Map;

    const-class v0, Ld3/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ld3/h;->Y:Ljava/util/logging/Logger;

    const/4 v0, 0x0

    new-array v0, v0, [Ld3/g;

    sput-object v0, Ld3/h;->Z:[Ld3/g;

    return-void
.end method

.method constructor <init>(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lb3/a;Ljava/util/concurrent/Executor;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IILb3/b0;Ljava/lang/Runnable;ILio/grpc/internal/n2;Z)V
    .locals 4

    move-object v0, p0

    move-object v1, p5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v2, Ljava/util/Random;

    invoke-direct {v2}, Ljava/util/Random;-><init>()V

    iput-object v2, v0, Ld3/h;->d:Ljava/util/Random;

    new-instance v2, Ljava/lang/Object;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iput-object v2, v0, Ld3/h;->l:Ljava/lang/Object;

    new-instance v2, Ljava/util/HashMap;

    invoke-direct {v2}, Ljava/util/HashMap;-><init>()V

    iput-object v2, v0, Ld3/h;->o:Ljava/util/Map;

    const/4 v2, 0x0

    iput v2, v0, Ld3/h;->E:I

    new-instance v2, Ljava/util/LinkedList;

    invoke-direct {v2}, Ljava/util/LinkedList;-><init>()V

    iput-object v2, v0, Ld3/h;->F:Ljava/util/Deque;

    new-instance v2, Ld3/h$a;

    invoke-direct {v2, p0}, Ld3/h$a;-><init>(Ld3/h;)V

    iput-object v2, v0, Ld3/h;->S:Lio/grpc/internal/v0;

    const-string v2, "address"

    move-object v3, p1

    invoke-static {p1, v2}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/net/InetSocketAddress;

    iput-object v2, v0, Ld3/h;->a:Ljava/net/InetSocketAddress;

    move-object v2, p2

    iput-object v2, v0, Ld3/h;->b:Ljava/lang/String;

    move v2, p10

    iput v2, v0, Ld3/h;->r:I

    move v2, p11

    iput v2, v0, Ld3/h;->f:I

    const-string v2, "executor"

    invoke-static {p5, v2}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/concurrent/Executor;

    iput-object v2, v0, Ld3/h;->p:Ljava/util/concurrent/Executor;

    new-instance v2, Lio/grpc/internal/c2;

    invoke-direct {v2, p5}, Lio/grpc/internal/c2;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object v2, v0, Ld3/h;->q:Lio/grpc/internal/c2;

    const/4 v1, 0x3

    iput v1, v0, Ld3/h;->n:I

    if-nez p6, :cond_0

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, p6

    :goto_0
    iput-object v1, v0, Ld3/h;->A:Ljavax/net/SocketFactory;

    move-object v1, p7

    iput-object v1, v0, Ld3/h;->B:Ljavax/net/ssl/SSLSocketFactory;

    move-object v1, p8

    iput-object v1, v0, Ld3/h;->C:Ljavax/net/ssl/HostnameVerifier;

    const-string v1, "connectionSpec"

    move-object v2, p9

    invoke-static {p9, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le3/b;

    iput-object v1, v0, Ld3/h;->G:Le3/b;

    sget-object v1, Lio/grpc/internal/q0;->v:Lq0/p;

    iput-object v1, v0, Ld3/h;->e:Lq0/p;

    const-string v1, "okhttp"

    move-object v2, p3

    invoke-static {v1, p3}, Lio/grpc/internal/q0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Ld3/h;->c:Ljava/lang/String;

    move-object/from16 v1, p12

    iput-object v1, v0, Ld3/h;->U:Lb3/b0;

    const-string v1, "tooManyPingsRunnable"

    move-object/from16 v2, p13

    invoke-static {v2, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Runnable;

    iput-object v1, v0, Ld3/h;->O:Ljava/lang/Runnable;

    move/from16 v1, p14

    iput v1, v0, Ld3/h;->P:I

    invoke-static/range {p15 .. p15}, Lq0/l;->n(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/grpc/internal/n2;

    iput-object v1, v0, Ld3/h;->R:Lio/grpc/internal/n2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Lb3/h0;->a(Ljava/lang/Class;Ljava/lang/String;)Lb3/h0;

    move-result-object v1

    iput-object v1, v0, Ld3/h;->m:Lb3/h0;

    invoke-static {}, Lb3/a;->c()Lb3/a$b;

    move-result-object v1

    sget-object v2, Lio/grpc/internal/p0;->b:Lb3/a$c;

    move-object v3, p4

    invoke-virtual {v1, v2, p4}, Lb3/a$b;->d(Lb3/a$c;Ljava/lang/Object;)Lb3/a$b;

    move-result-object v1

    invoke-virtual {v1}, Lb3/a$b;->a()Lb3/a;

    move-result-object v1

    iput-object v1, v0, Ld3/h;->u:Lb3/a;

    move/from16 v1, p16

    iput-boolean v1, v0, Ld3/h;->Q:Z

    invoke-direct {p0}, Ld3/h;->b0()V

    return-void
.end method

.method static synthetic A(Ld3/h;I)I
    .locals 0

    iput p1, p0, Ld3/h;->s:I

    return p1
.end method

.method static synthetic B(Ld3/h;I)I
    .locals 1

    iget v0, p0, Ld3/h;->s:I

    add-int/2addr v0, p1

    iput v0, p0, Ld3/h;->s:I

    return v0
.end method

.method static synthetic C(Ld3/h;)I
    .locals 0

    iget p0, p0, Ld3/h;->f:I

    return p0
.end method

.method static synthetic D(Ld3/h;)I
    .locals 0

    iget p0, p0, Ld3/h;->P:I

    return p0
.end method

.method static synthetic E(Ld3/h;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Ld3/h;->o:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic F(Ld3/h;)Lio/grpc/internal/u0;
    .locals 0

    iget-object p0, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    return-object p0
.end method

.method static synthetic G(Ld3/h;Lio/grpc/internal/u0;)Lio/grpc/internal/u0;
    .locals 0

    iput-object p1, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    return-object p1
.end method

.method static synthetic H(Ld3/h;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Ld3/h;->O:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic I(Ld3/h;)Ld3/h$f;
    .locals 0

    iget-object p0, p0, Ld3/h;->t:Ld3/h$f;

    return-object p0
.end method

.method static synthetic J(Ld3/h;Ld3/h$f;)Ld3/h$f;
    .locals 0

    iput-object p1, p0, Ld3/h;->t:Ld3/h$f;

    return-object p1
.end method

.method static synthetic K(Ld3/h;)Lf3/b;
    .locals 0

    iget-object p0, p0, Ld3/h;->h:Lf3/b;

    return-object p0
.end method

.method static synthetic L(Ld3/h;)Ld3/i;
    .locals 0

    iget-object p0, p0, Ld3/h;->i:Ld3/i;

    return-object p0
.end method

.method static synthetic M(Ld3/h;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Ld3/h;->p:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic N(Ld3/h;I)I
    .locals 0

    iput p1, p0, Ld3/h;->E:I

    return p1
.end method

.method static synthetic O(Ld3/h;)Z
    .locals 0

    invoke-direct {p0}, Ld3/h;->n0()Z

    move-result p0

    return p0
.end method

.method static synthetic P(Ld3/h;)Ljava/net/InetSocketAddress;
    .locals 0

    iget-object p0, p0, Ld3/h;->a:Ljava/net/InetSocketAddress;

    return-object p0
.end method

.method private static Q()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lf3/a;",
            "Lb3/f1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lf3/a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lf3/a;->h:Lf3/a;

    sget-object v2, Lb3/f1;->t:Lb3/f1;

    const-string v3, "No error: A GRPC status of OK should have been sent"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->i:Lf3/a;

    const-string v3, "Protocol error"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->n:Lf3/a;

    const-string v3, "Internal error"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->o:Lf3/a;

    const-string v3, "Flow control error"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->p:Lf3/a;

    const-string v3, "Stream closed"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->q:Lf3/a;

    const-string v3, "Frame too large"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->r:Lf3/a;

    sget-object v3, Lb3/f1;->u:Lb3/f1;

    const-string v4, "Refused stream"

    invoke-virtual {v3, v4}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->s:Lf3/a;

    sget-object v3, Lb3/f1;->g:Lb3/f1;

    const-string v4, "Cancelled"

    invoke-virtual {v3, v4}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->t:Lf3/a;

    const-string v3, "Compression error"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->u:Lf3/a;

    const-string v3, "Connect error"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->v:Lf3/a;

    sget-object v2, Lb3/f1;->o:Lb3/f1;

    const-string v3, "Enhance your calm"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lf3/a;->w:Lf3/a;

    sget-object v2, Lb3/f1;->m:Lb3/f1;

    const-string v3, "Inadequate security"

    invoke-virtual {v2, v3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private R(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lc2/e;
    .locals 3

    new-instance v0, Lc2/c$b;

    invoke-direct {v0}, Lc2/c$b;-><init>()V

    const-string v1, "https"

    invoke-virtual {v0, v1}, Lc2/c$b;->k(Ljava/lang/String;)Lc2/c$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc2/c$b;->h(Ljava/lang/String;)Lc2/c$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p1

    invoke-virtual {v0, p1}, Lc2/c$b;->j(I)Lc2/c$b;

    move-result-object p1

    invoke-virtual {p1}, Lc2/c$b;->a()Lc2/c;

    move-result-object p1

    new-instance v0, Lc2/e$b;

    invoke-direct {v0}, Lc2/e$b;-><init>()V

    invoke-virtual {v0, p1}, Lc2/e$b;->h(Lc2/c;)Lc2/e$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lc2/c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lc2/c;->j()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Host"

    invoke-virtual {v0, v1, p1}, Lc2/e$b;->g(Ljava/lang/String;Ljava/lang/String;)Lc2/e$b;

    move-result-object p1

    iget-object v0, p0, Ld3/h;->c:Ljava/lang/String;

    const-string v1, "User-Agent"

    invoke-virtual {p1, v1, v0}, Lc2/e$b;->g(Ljava/lang/String;Ljava/lang/String;)Lc2/e$b;

    move-result-object p1

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    invoke-static {p2, p3}, Lc2/a;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "Proxy-Authorization"

    invoke-virtual {p1, p3, p2}, Lc2/e$b;->g(Ljava/lang/String;Ljava/lang/String;)Lc2/e$b;

    :cond_0
    invoke-virtual {p1}, Lc2/e$b;->f()Lc2/e;

    move-result-object p1

    return-object p1
.end method

.method private S(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 8

    const-string v0, "\r\n"

    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Ld3/h;->A:Ljavax/net/SocketFactory;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v1, v2, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ld3/h;->A:Ljavax/net/SocketFactory;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v1, v2, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p2

    :goto_0
    const/4 v1, 0x1

    invoke-virtual {p2, v1}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    invoke-static {p2}, Lh4/g;->g(Ljava/net/Socket;)Lh4/n;

    move-result-object v2

    invoke-static {p2}, Lh4/g;->e(Ljava/net/Socket;)Lh4/m;

    move-result-object v3

    invoke-static {v3}, Lh4/g;->a(Lh4/m;)Lh4/d;

    move-result-object v3

    invoke-direct {p0, p1, p3, p4}, Ld3/h;->R(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lc2/e;

    move-result-object p1

    invoke-virtual {p1}, Lc2/e;->b()Lc2/c;

    move-result-object p3

    const-string p4, "CONNECT %s:%d HTTP/1.1"

    const/4 v4, 0x2

    new-array v5, v4, [Ljava/lang/Object;

    invoke-virtual {p3}, Lc2/c;->c()Ljava/lang/String;

    move-result-object v6

    const/4 v7, 0x0

    aput-object v6, v5, v7

    invoke-virtual {p3}, Lc2/c;->j()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v5, v1

    invoke-static {p4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v3, p3}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    move-result-object p3

    invoke-interface {p3, v0}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    invoke-virtual {p1}, Lc2/e;->a()Lc2/b;

    move-result-object p3

    invoke-virtual {p3}, Lc2/b;->b()I

    move-result p3

    const/4 p4, 0x0

    :goto_1
    if-ge p4, p3, :cond_1

    invoke-virtual {p1}, Lc2/e;->a()Lc2/b;

    move-result-object v5

    invoke-virtual {v5, p4}, Lc2/b;->a(I)Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    move-result-object v5

    const-string v6, ": "

    invoke-interface {v5, v6}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    move-result-object v5

    invoke-virtual {p1}, Lc2/e;->a()Lc2/b;

    move-result-object v6

    invoke-virtual {v6, p4}, Lc2/b;->c(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v5, v6}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    move-result-object v5

    invoke-interface {v5, v0}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v3, v0}, Lh4/d;->U(Ljava/lang/String;)Lh4/d;

    invoke-interface {v3}, Lh4/d;->flush()V

    invoke-static {v2}, Ld3/h;->i0(Lh4/n;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ld2/a;->a(Ljava/lang/String;)Ld2/a;

    move-result-object p1

    :goto_2
    invoke-static {v2}, Ld3/h;->i0(Lh4/n;)Ljava/lang/String;

    move-result-object p3

    const-string p4, ""

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    iget p3, p1, Ld2/a;->b:I

    const/16 p4, 0xc8

    if-lt p3, p4, :cond_3

    const/16 p4, 0x12c

    if-ge p3, p4, :cond_3

    return-object p2

    :cond_3
    new-instance p3, Lh4/c;

    invoke-direct {p3}, Lh4/c;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {p2}, Ljava/net/Socket;->shutdownOutput()V

    const-wide/16 v5, 0x400

    invoke-interface {v2, p3, v5, v6}, Lh4/n;->o(Lh4/c;J)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p4

    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to read body: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/io/IOException;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Lh4/c;->u0(Ljava/lang/String;)Lh4/c;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    :try_start_3
    invoke-virtual {p2}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :try_start_4
    const-string p2, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"

    const/4 p4, 0x3

    new-array p4, p4, [Ljava/lang/Object;

    iget v0, p1, Ld2/a;->b:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p4, v7

    iget-object p1, p1, Ld2/a;->c:Ljava/lang/String;

    aput-object p1, p4, v1

    invoke-virtual {p3}, Lh4/c;->R()Ljava/lang/String;

    move-result-object p1

    aput-object p1, p4, v4

    invoke-static {p2, p4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lb3/f1;->u:Lb3/f1;

    invoke-virtual {p2, p1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/f1;->c()Lb3/g1;

    move-result-object p1

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception p1

    sget-object p2, Lb3/f1;->u:Lb3/f1;

    const-string p3, "Failed trying to connect with proxy"

    invoke-virtual {p2, p3}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lb3/f1;->p(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1}, Lb3/f1;->c()Lb3/g1;

    move-result-object p1

    throw p1
.end method

.method private Z()Ljava/lang/Throwable;
    .locals 3

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->v:Lb3/f1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lb3/f1;->c()Lb3/g1;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_0
    sget-object v1, Lb3/f1;->u:Lb3/f1;

    const-string v2, "Connection closed"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-virtual {v1}, Lb3/f1;->c()Lb3/g1;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private b0()V
    .locals 3

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->R:Lio/grpc/internal/n2;

    new-instance v2, Ld3/h$b;

    invoke-direct {v2, p0}, Ld3/h$b;-><init>(Ld3/h;)V

    invoke-virtual {v1, v2}, Lio/grpc/internal/n2;->g(Lio/grpc/internal/n2$c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private c0()Z
    .locals 1

    iget-object v0, p0, Ld3/h;->a:Ljava/net/InetSocketAddress;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private f0(Ld3/g;)V
    .locals 2

    iget-boolean v0, p0, Ld3/h;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Ld3/h;->z:Z

    iget-object v0, p0, Ld3/h;->J:Lio/grpc/internal/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/b1;->o()V

    :cond_0
    invoke-virtual {p1}, Lio/grpc/internal/a;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld3/h;->S:Lio/grpc/internal/v0;

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    :cond_1
    return-void
.end method

.method static synthetic h(Ld3/h;)Lio/grpc/internal/j1$a;
    .locals 0

    iget-object p0, p0, Ld3/h;->g:Lio/grpc/internal/j1$a;

    return-object p0
.end method

.method private h0(Lf3/a;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Ld3/h;->r0(Lf3/a;)Lb3/f1;

    move-result-object v0

    invoke-virtual {v0, p2}, Lb3/f1;->e(Ljava/lang/String;)Lb3/f1;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Ld3/h;->m0(ILf3/a;Lb3/f1;)V

    return-void
.end method

.method static synthetic i(Ld3/h;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld3/h;->l:Ljava/lang/Object;

    return-object p0
.end method

.method private static i0(Lh4/n;)Ljava/lang/String;
    .locals 8

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    :cond_0
    const-wide/16 v1, 0x1

    invoke-interface {p0, v0, v1, v2}, Lh4/n;->o(Lh4/c;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v7, v3, v5

    if-eqz v7, :cond_1

    invoke-virtual {v0}, Lh4/c;->i0()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {v0, v3, v4}, Lh4/c;->l(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lh4/c;->c0()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Lh4/c;->y()Lh4/f;

    move-result-object v0

    invoke-virtual {v0}, Lh4/f;->n()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static synthetic j(Ld3/h;)Ljavax/net/SocketFactory;
    .locals 0

    iget-object p0, p0, Ld3/h;->A:Ljavax/net/SocketFactory;

    return-object p0
.end method

.method static synthetic k(Ld3/h;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Ld3/h;->S(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p0

    return-object p0
.end method

.method static synthetic l(Ld3/h;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    iget-object p0, p0, Ld3/h;->B:Ljavax/net/ssl/SSLSocketFactory;

    return-object p0
.end method

.method private l0(Ld3/g;)V
    .locals 2

    iget-boolean v0, p0, Ld3/h;->z:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Ld3/h;->z:Z

    iget-object v0, p0, Ld3/h;->J:Lio/grpc/internal/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/b1;->n()V

    :cond_0
    invoke-virtual {p1}, Lio/grpc/internal/a;->y()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Ld3/h;->S:Lio/grpc/internal/v0;

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    :cond_1
    return-void
.end method

.method static synthetic m(Ld3/h;)Ljavax/net/ssl/HostnameVerifier;
    .locals 0

    iget-object p0, p0, Ld3/h;->C:Ljavax/net/ssl/HostnameVerifier;

    return-object p0
.end method

.method private m0(ILf3/a;Lb3/f1;)V
    .locals 7

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->v:Lb3/f1;

    if-nez v1, :cond_0

    iput-object p3, p0, Ld3/h;->v:Lb3/f1;

    iget-object v1, p0, Ld3/h;->g:Lio/grpc/internal/j1$a;

    invoke-interface {v1, p3}, Lio/grpc/internal/j1$a;->c(Lb3/f1;)V

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iget-boolean v3, p0, Ld3/h;->w:Z

    if-nez v3, :cond_1

    iput-boolean v1, p0, Ld3/h;->w:Z

    iget-object v3, p0, Ld3/h;->j:Ld3/b;

    new-array v4, v2, [B

    invoke-virtual {v3, v2, p2, v4}, Ld3/b;->q(ILf3/a;[B)V

    :cond_1
    iget-object p2, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v4, p1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ld3/g;

    invoke-virtual {v4}, Ld3/g;->S()Ld3/g$b;

    move-result-object v4

    sget-object v5, Lio/grpc/internal/r$a;->f:Lio/grpc/internal/r$a;

    new-instance v6, Lb3/u0;

    invoke-direct {v6}, Lb3/u0;-><init>()V

    invoke-virtual {v4, p3, v5, v2, v6}, Lio/grpc/internal/a$c;->M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld3/g;

    invoke-direct {p0, v3}, Ld3/h;->f0(Ld3/g;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ld3/g;

    invoke-virtual {p2}, Ld3/g;->S()Ld3/g$b;

    move-result-object v2

    sget-object v3, Lio/grpc/internal/r$a;->f:Lio/grpc/internal/r$a;

    new-instance v4, Lb3/u0;

    invoke-direct {v4}, Lb3/u0;-><init>()V

    invoke-virtual {v2, p3, v3, v1, v4}, Lio/grpc/internal/a$c;->M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V

    invoke-direct {p0, p2}, Ld3/h;->f0(Ld3/g;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->clear()V

    invoke-direct {p0}, Ld3/h;->p0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic n(Ld3/h;)Le3/b;
    .locals 0

    iget-object p0, p0, Ld3/h;->G:Le3/b;

    return-object p0
.end method

.method private n0()Z
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    iget v2, p0, Ld3/h;->E:I

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ld3/g;

    invoke-direct {p0, v0}, Ld3/h;->o0(Ld3/g;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method static synthetic o(Ld3/h;)Lb3/a;
    .locals 0

    iget-object p0, p0, Ld3/h;->u:Lb3/a;

    return-object p0
.end method

.method private o0(Ld3/g;)V
    .locals 3

    invoke-virtual {p1}, Ld3/g;->Q()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "StreamId already assigned"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Ld3/h;->o:Ljava/util/Map;

    iget v1, p0, Ld3/h;->n:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Ld3/h;->l0(Ld3/g;)V

    invoke-virtual {p1}, Ld3/g;->S()Ld3/g$b;

    move-result-object v0

    iget v1, p0, Ld3/h;->n:I

    invoke-virtual {v0, v1}, Ld3/g$b;->d0(I)V

    invoke-virtual {p1}, Ld3/g;->P()Lb3/v0$d;

    move-result-object v0

    sget-object v1, Lb3/v0$d;->e:Lb3/v0$d;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Ld3/g;->P()Lb3/v0$d;

    move-result-object v0

    sget-object v1, Lb3/v0$d;->g:Lb3/v0$d;

    if-ne v0, v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Ld3/g;->T()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Ld3/h;->j:Ld3/b;

    invoke-virtual {p1}, Ld3/b;->flush()V

    :cond_3
    iget p1, p0, Ld3/h;->n:I

    const v0, 0x7ffffffd

    if-lt p1, v0, :cond_4

    const p1, 0x7fffffff

    iput p1, p0, Ld3/h;->n:I

    sget-object v0, Lf3/a;->h:Lf3/a;

    sget-object v1, Lb3/f1;->u:Lb3/f1;

    const-string v2, "Stream ids exhausted"

    invoke-virtual {v1, v2}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Ld3/h;->m0(ILf3/a;Lb3/f1;)V

    goto :goto_1

    :cond_4
    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Ld3/h;->n:I

    :goto_1
    return-void
.end method

.method static synthetic p(Ld3/h;Lb3/a;)Lb3/a;
    .locals 0

    iput-object p1, p0, Ld3/h;->u:Lb3/a;

    return-object p1
.end method

.method private p0()V
    .locals 4

    iget-object v0, p0, Ld3/h;->v:Lb3/f1;

    if-eqz v0, :cond_5

    iget-object v0, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Ld3/h;->y:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Ld3/h;->y:Z

    iget-object v1, p0, Ld3/h;->J:Lio/grpc/internal/b1;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/grpc/internal/b1;->q()V

    sget-object v1, Lio/grpc/internal/q0;->u:Lio/grpc/internal/e2$d;

    iget-object v2, p0, Ld3/h;->I:Ljava/util/concurrent/ScheduledExecutorService;

    invoke-static {v1, v2}, Lio/grpc/internal/e2;->f(Lio/grpc/internal/e2$d;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object v1, p0, Ld3/h;->I:Ljava/util/concurrent/ScheduledExecutorService;

    :cond_2
    iget-object v1, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Ld3/h;->Z()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/grpc/internal/u0;->f(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    iput-object v1, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    :cond_3
    iget-boolean v1, p0, Ld3/h;->w:Z

    if-nez v1, :cond_4

    iput-boolean v0, p0, Ld3/h;->w:Z

    iget-object v0, p0, Ld3/h;->j:Ld3/b;

    sget-object v1, Lf3/a;->h:Lf3/a;

    const/4 v2, 0x0

    new-array v3, v2, [B

    invoke-virtual {v0, v2, v1, v3}, Ld3/b;->q(ILf3/a;[B)V

    :cond_4
    iget-object v0, p0, Ld3/h;->j:Ld3/b;

    invoke-virtual {v0}, Ld3/b;->close()V

    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic q(Ld3/h;ILf3/a;Lb3/f1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ld3/h;->m0(ILf3/a;Lb3/f1;)V

    return-void
.end method

.method static synthetic r(Ld3/h;Ljava/net/Socket;)Ljava/net/Socket;
    .locals 0

    iput-object p1, p0, Ld3/h;->D:Ljava/net/Socket;

    return-object p1
.end method

.method static r0(Lf3/a;)Lb3/f1;
    .locals 3

    sget-object v0, Ld3/h;->X:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb3/f1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lb3/f1;->h:Lb3/f1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown http2 error code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lf3/a;->e:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method static synthetic s(Ld3/h;Lb3/c0$b;)Lb3/c0$b;
    .locals 0

    iput-object p1, p0, Ld3/h;->T:Lb3/c0$b;

    return-object p1
.end method

.method static synthetic t(Ld3/h;)Lio/grpc/internal/b1;
    .locals 0

    iget-object p0, p0, Ld3/h;->J:Lio/grpc/internal/b1;

    return-object p0
.end method

.method static synthetic u(Ld3/h;)Ld3/p;
    .locals 0

    iget-object p0, p0, Ld3/h;->k:Ld3/p;

    return-object p0
.end method

.method static synthetic v(Ld3/h;)Lb3/f1;
    .locals 0

    iget-object p0, p0, Ld3/h;->v:Lb3/f1;

    return-object p0
.end method

.method static synthetic w()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Ld3/h;->Y:Ljava/util/logging/Logger;

    return-object v0
.end method

.method static synthetic x(Ld3/h;)Ld3/b;
    .locals 0

    iget-object p0, p0, Ld3/h;->j:Ld3/b;

    return-object p0
.end method

.method static synthetic y(Ld3/h;Lf3/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Ld3/h;->h0(Lf3/a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic z(Ld3/h;)I
    .locals 0

    iget p0, p0, Ld3/h;->s:I

    return p0
.end method


# virtual methods
.method T(ZJJZ)V
    .locals 0

    iput-boolean p1, p0, Ld3/h;->K:Z

    iput-wide p2, p0, Ld3/h;->L:J

    iput-wide p4, p0, Ld3/h;->M:J

    iput-boolean p6, p0, Ld3/h;->N:Z

    return-void
.end method

.method U(ILb3/f1;Lio/grpc/internal/r$a;ZLf3/a;Lb3/u0;)V
    .locals 3

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ld3/g;

    if-eqz v1, :cond_3

    if-eqz p5, :cond_0

    iget-object p5, p0, Ld3/h;->j:Ld3/b;

    sget-object v2, Lf3/a;->s:Lf3/a;

    invoke-virtual {p5, p1, v2}, Ld3/b;->c(ILf3/a;)V

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {v1}, Ld3/g;->S()Ld3/g$b;

    move-result-object p1

    if-eqz p6, :cond_1

    goto :goto_0

    :cond_1
    new-instance p6, Lb3/u0;

    invoke-direct {p6}, Lb3/u0;-><init>()V

    :goto_0
    invoke-virtual {p1, p2, p3, p4, p6}, Lio/grpc/internal/a$c;->M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V

    :cond_2
    invoke-direct {p0}, Ld3/h;->n0()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Ld3/h;->p0()V

    invoke-direct {p0, v1}, Ld3/h;->f0(Ld3/g;)V

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method V()[Ld3/g;
    .locals 3

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v1

    sget-object v2, Ld3/h;->Z:[Ld3/g;

    invoke-interface {v1, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ld3/g;

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public W()Lb3/a;
    .locals 1

    iget-object v0, p0, Ld3/h;->u:Lb3/a;

    return-object v0
.end method

.method X()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ld3/h;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/grpc/internal/q0;->b(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Ld3/h;->b:Ljava/lang/String;

    return-object v0
.end method

.method Y()I
    .locals 3

    iget-object v0, p0, Ld3/h;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/grpc/internal/q0;->b(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Ld3/h;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method public a(Lb3/f1;)V
    .locals 6

    invoke-virtual {p0, p1}, Ld3/h;->f(Lb3/f1;)V

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ld3/g;

    invoke-virtual {v3}, Ld3/g;->S()Ld3/g$b;

    move-result-object v3

    const/4 v4, 0x0

    new-instance v5, Lb3/u0;

    invoke-direct {v5}, Lb3/u0;-><init>()V

    invoke-virtual {v3, p1, v4, v5}, Lio/grpc/internal/a$c;->N(Lb3/f1;ZLb3/u0;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/g;

    invoke-direct {p0, v2}, Ld3/h;->f0(Ld3/g;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ld3/g;

    invoke-virtual {v2}, Ld3/g;->S()Ld3/g$b;

    move-result-object v3

    const/4 v4, 0x1

    new-instance v5, Lb3/u0;

    invoke-direct {v5}, Lb3/u0;-><init>()V

    invoke-virtual {v3, p1, v4, v5}, Lio/grpc/internal/a$c;->N(Lb3/f1;ZLb3/u0;)V

    invoke-direct {p0, v2}, Ld3/h;->f0(Ld3/g;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->clear()V

    invoke-direct {p0}, Ld3/h;->p0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method a0(I)Ld3/g;
    .locals 2

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/g;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "failureCause"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lb3/f1;->u:Lb3/f1;

    invoke-virtual {v0, p1}, Lb3/f1;->p(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p1

    sget-object v0, Lf3/a;->n:Lf3/a;

    const/4 v1, 0x0

    invoke-direct {p0, v1, v0, p1}, Ld3/h;->m0(ILf3/a;Lb3/f1;)V

    return-void
.end method

.method public bridge synthetic c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Ld3/h;->g0(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Ld3/g;

    move-result-object p1

    return-object p1
.end method

.method public d()Lb3/h0;
    .locals 1

    iget-object v0, p0, Ld3/h;->m:Lb3/h0;

    return-object v0
.end method

.method d0()Z
    .locals 1

    iget-object v0, p0, Ld3/h;->B:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public e(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
    .locals 8

    const-string v0, "listener"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/j1$a;

    iput-object p1, p0, Ld3/h;->g:Lio/grpc/internal/j1$a;

    iget-boolean p1, p0, Ld3/h;->K:Z

    if-eqz p1, :cond_0

    sget-object p1, Lio/grpc/internal/q0;->u:Lio/grpc/internal/e2$d;

    invoke-static {p1}, Lio/grpc/internal/e2;->d(Lio/grpc/internal/e2$d;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Ld3/h;->I:Ljava/util/concurrent/ScheduledExecutorService;

    new-instance p1, Lio/grpc/internal/b1;

    new-instance v1, Lio/grpc/internal/b1$c;

    invoke-direct {v1, p0}, Lio/grpc/internal/b1$c;-><init>(Lio/grpc/internal/v;)V

    iget-object v2, p0, Ld3/h;->I:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v3, p0, Ld3/h;->L:J

    iget-wide v5, p0, Ld3/h;->M:J

    iget-boolean v7, p0, Ld3/h;->N:Z

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/b1;-><init>(Lio/grpc/internal/b1$d;Ljava/util/concurrent/ScheduledExecutorService;JJZ)V

    iput-object p1, p0, Ld3/h;->J:Lio/grpc/internal/b1;

    invoke-virtual {p1}, Lio/grpc/internal/b1;->p()V

    :cond_0
    invoke-direct {p0}, Ld3/h;->c0()Z

    move-result p1

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter p1

    :try_start_0
    new-instance v1, Ld3/b;

    iget-object v2, p0, Ld3/h;->H:Lf3/c;

    iget-object v3, p0, Ld3/h;->i:Ld3/i;

    invoke-direct {v1, p0, v2, v3}, Ld3/b;-><init>(Ld3/b$a;Lf3/c;Ld3/i;)V

    iput-object v1, p0, Ld3/h;->j:Ld3/b;

    new-instance v2, Ld3/p;

    invoke-direct {v2, p0, v1}, Ld3/p;-><init>(Ld3/h;Lf3/c;)V

    iput-object v2, p0, Ld3/h;->k:Ld3/p;

    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iget-object p1, p0, Ld3/h;->q:Lio/grpc/internal/c2;

    new-instance v1, Ld3/h$c;

    invoke-direct {v1, p0}, Ld3/h$c;-><init>(Ld3/h;)V

    :goto_0
    invoke-virtual {p1, v1}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_1
    iget-object p1, p0, Ld3/h;->q:Lio/grpc/internal/c2;

    invoke-static {p1, p0}, Ld3/a;->r(Lio/grpc/internal/c2;Ld3/b$a;)Ld3/a;

    move-result-object p1

    new-instance v1, Lf3/g;

    invoke-direct {v1}, Lf3/g;-><init>()V

    invoke-static {p1}, Lh4/g;->a(Lh4/m;)Lh4/d;

    move-result-object v2

    const/4 v3, 0x1

    invoke-interface {v1, v2, v3}, Lf3/j;->a(Lh4/d;Z)Lf3/c;

    move-result-object v2

    iget-object v4, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v4

    :try_start_2
    new-instance v5, Ld3/b;

    invoke-direct {v5, p0, v2}, Ld3/b;-><init>(Ld3/b$a;Lf3/c;)V

    iput-object v5, p0, Ld3/h;->j:Ld3/b;

    new-instance v2, Ld3/p;

    invoke-direct {v2, p0, v5}, Ld3/p;-><init>(Ld3/h;Lf3/c;)V

    iput-object v2, p0, Ld3/h;->k:Ld3/p;

    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    new-instance v2, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v2, v3}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v3, p0, Ld3/h;->q:Lio/grpc/internal/c2;

    new-instance v4, Ld3/h$d;

    invoke-direct {v4, p0, v2, p1, v1}, Ld3/h$d;-><init>(Ld3/h;Ljava/util/concurrent/CountDownLatch;Ld3/a;Lf3/j;)V

    invoke-virtual {v3, v4}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    :try_start_3
    invoke-virtual {p0}, Ld3/h;->k0()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object p1, p0, Ld3/h;->q:Lio/grpc/internal/c2;

    new-instance v1, Ld3/h$e;

    invoke-direct {v1, p0}, Ld3/h$e;-><init>(Ld3/h;)V

    goto :goto_0

    :catchall_1
    move-exception p1

    invoke-virtual {v2}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw p1

    :catchall_2
    move-exception p1

    :try_start_4
    monitor-exit v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    throw p1
.end method

.method e0(I)Z
    .locals 3

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Ld3/h;->n:I

    const/4 v2, 0x1

    if-ge p1, v1, :cond_0

    and-int/2addr p1, v2

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    monitor-exit v0

    return v2

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public f(Lb3/f1;)V
    .locals 2

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->v:Lb3/f1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iput-object p1, p0, Ld3/h;->v:Lb3/f1;

    iget-object v1, p0, Ld3/h;->g:Lio/grpc/internal/j1$a;

    invoke-interface {v1, p1}, Lio/grpc/internal/j1$a;->c(Lb3/f1;)V

    invoke-direct {p0}, Ld3/h;->p0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public g(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V
    .locals 8

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->j:Ld3/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Lq0/l;->t(Z)V

    iget-boolean v1, p0, Ld3/h;->y:Z

    if-eqz v1, :cond_1

    invoke-direct {p0}, Ld3/h;->Z()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {p1, p2, v1}, Lio/grpc/internal/u0;->g(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;Ljava/lang/Throwable;)V

    monitor-exit v0

    return-void

    :cond_1
    iget-object v1, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    if-eqz v1, :cond_2

    const-wide/16 v4, 0x0

    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    iget-object v1, p0, Ld3/h;->d:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    iget-object v1, p0, Ld3/h;->e:Lq0/p;

    invoke-interface {v1}, Lq0/p;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lq0/n;

    invoke-virtual {v1}, Lq0/n;->g()Lq0/n;

    new-instance v6, Lio/grpc/internal/u0;

    invoke-direct {v6, v4, v5, v1}, Lio/grpc/internal/u0;-><init>(JLq0/n;)V

    iput-object v6, p0, Ld3/h;->x:Lio/grpc/internal/u0;

    iget-object v1, p0, Ld3/h;->R:Lio/grpc/internal/n2;

    invoke-virtual {v1}, Lio/grpc/internal/n2;->b()V

    move-object v1, v6

    :goto_1
    if-eqz v2, :cond_3

    iget-object v2, p0, Ld3/h;->j:Ld3/b;

    const/16 v6, 0x20

    ushr-long v6, v4, v6

    long-to-int v7, v6

    long-to-int v5, v4

    invoke-virtual {v2, v3, v7, v5}, Ld3/b;->g(ZII)V

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, p1, p2}, Lio/grpc/internal/u0;->a(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g0(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Ld3/g;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/v0<",
            "**>;",
            "Lb3/u0;",
            "Lb3/c;",
            "[",
            "Lb3/k;",
            ")",
            "Ld3/g;"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p2

    const-string v1, "method"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "headers"

    invoke-static {v0, v1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Ld3/h;->W()Lb3/a;

    move-result-object v1

    move-object/from16 v3, p4

    invoke-static {v3, v1, v0}, Lio/grpc/internal/h2;->h([Lb3/k;Lb3/a;Lb3/u0;)Lio/grpc/internal/h2;

    move-result-object v12

    iget-object v14, v15, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    new-instance v16, Ld3/g;

    iget-object v4, v15, Ld3/h;->j:Ld3/b;

    iget-object v6, v15, Ld3/h;->k:Ld3/p;

    iget-object v7, v15, Ld3/h;->l:Ljava/lang/Object;

    iget v8, v15, Ld3/h;->r:I

    iget v9, v15, Ld3/h;->f:I

    iget-object v10, v15, Ld3/h;->b:Ljava/lang/String;

    iget-object v11, v15, Ld3/h;->c:Ljava/lang/String;

    iget-object v13, v15, Ld3/h;->R:Lio/grpc/internal/n2;

    iget-boolean v5, v15, Ld3/h;->Q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v0, v5

    move-object/from16 v5, p0

    move-object/from16 v17, v14

    move-object/from16 v14, p3

    move v15, v0

    :try_start_1
    invoke-direct/range {v1 .. v15}, Ld3/g;-><init>(Lb3/v0;Lb3/u0;Ld3/b;Ld3/h;Ld3/p;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lb3/c;Z)V

    monitor-exit v17

    return-object v16

    :catchall_0
    move-exception v0

    move-object/from16 v17, v14

    :goto_0
    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method j0(Ld3/g;)V
    .locals 1

    iget-object v0, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Ld3/h;->f0(Ld3/g;)V

    return-void
.end method

.method k0()V
    .locals 5

    iget-object v0, p0, Ld3/h;->l:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Ld3/h;->j:Ld3/b;

    invoke-virtual {v1}, Ld3/b;->a0()V

    new-instance v1, Lf3/i;

    invoke-direct {v1}, Lf3/i;-><init>()V

    const/4 v2, 0x7

    iget v3, p0, Ld3/h;->f:I

    invoke-static {v1, v2, v3}, Ld3/l;->c(Lf3/i;II)V

    iget-object v2, p0, Ld3/h;->j:Ld3/b;

    invoke-virtual {v2, v1}, Ld3/b;->P(Lf3/i;)V

    iget v1, p0, Ld3/h;->f:I

    const v2, 0xffff

    if-le v1, v2, :cond_0

    iget-object v3, p0, Ld3/h;->j:Ld3/b;

    const/4 v4, 0x0

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-virtual {v3, v4, v1, v2}, Ld3/b;->f(IJ)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method q0(Ld3/g;)V
    .locals 4

    iget-object v0, p0, Ld3/h;->v:Lb3/f1;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ld3/g;->S()Ld3/g$b;

    move-result-object p1

    iget-object v0, p0, Ld3/h;->v:Lb3/f1;

    sget-object v1, Lio/grpc/internal/r$a;->f:Lio/grpc/internal/r$a;

    const/4 v2, 0x1

    new-instance v3, Lb3/u0;

    invoke-direct {v3}, Lb3/u0;-><init>()V

    invoke-virtual {p1, v0, v1, v2, v3}, Lio/grpc/internal/a$c;->M(Lb3/f1;Lio/grpc/internal/r$a;ZLb3/u0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld3/h;->o:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Ld3/h;->E:I

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Ld3/h;->F:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Ld3/h;->l0(Ld3/g;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Ld3/h;->o0(Ld3/g;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Ld3/h;->m:Lb3/h0;

    invoke-virtual {v1}, Lb3/h0;->d()J

    move-result-wide v1

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Lq0/h$b;->c(Ljava/lang/String;J)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Ld3/h;->a:Ljava/net/InetSocketAddress;

    const-string v2, "address"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
