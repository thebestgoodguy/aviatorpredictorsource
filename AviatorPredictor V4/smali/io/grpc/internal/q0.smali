.class public final Lio/grpc/internal/q0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/q0$i;,
        Lio/grpc/internal/q0$h;,
        Lio/grpc/internal/q0$g;
    }
.end annotation


# static fields
.field private static final a:Ljava/util/logging/Logger;

.field public static final b:Ljava/nio/charset/Charset;

.field public static final c:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field public static final d:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final e:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "[B>;"
        }
    .end annotation
.end field

.field public static final f:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final g:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "[B>;"
        }
    .end annotation
.end field

.field static final h:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final i:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final j:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final k:Lb3/u0$g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/u0$g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static final l:Lq0/m;

.field public static final m:J

.field public static final n:J

.field public static final o:J

.field public static final p:Lb3/c1;

.field public static final q:Lb3/c1;

.field public static final r:Lb3/c$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/c$a<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final s:Lb3/k;

.field public static final t:Lio/grpc/internal/e2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/e2$d<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field public static final u:Lio/grpc/internal/e2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/e2$d<",
            "Ljava/util/concurrent/ScheduledExecutorService;",
            ">;"
        }
    .end annotation
.end field

.field public static final v:Lq0/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lq0/p<",
            "Lq0/n;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-class v0, Lio/grpc/internal/q0;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->a:Ljava/util/logging/Logger;

    sget-object v0, Ljava/nio/charset/StandardCharsets;->US_ASCII:Ljava/nio/charset/Charset;

    sput-object v0, Lio/grpc/internal/q0;->b:Ljava/nio/charset/Charset;

    new-instance v0, Lio/grpc/internal/q0$i;

    invoke-direct {v0}, Lio/grpc/internal/q0$i;-><init>()V

    const-string v1, "grpc-timeout"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->c:Lb3/u0$g;

    sget-object v0, Lb3/u0;->e:Lb3/u0$d;

    const-string v1, "grpc-encoding"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->d:Lb3/u0$g;

    new-instance v1, Lio/grpc/internal/q0$g;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lio/grpc/internal/q0$g;-><init>(Lio/grpc/internal/q0$a;)V

    const-string v3, "grpc-accept-encoding"

    invoke-static {v3, v1}, Lb3/i0;->b(Ljava/lang/String;Lb3/i0$a;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->e:Lb3/u0$g;

    const-string v1, "content-encoding"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->f:Lb3/u0$g;

    new-instance v1, Lio/grpc/internal/q0$g;

    invoke-direct {v1, v2}, Lio/grpc/internal/q0$g;-><init>(Lio/grpc/internal/q0$a;)V

    const-string v2, "accept-encoding"

    invoke-static {v2, v1}, Lb3/i0;->b(Ljava/lang/String;Lb3/i0$a;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->g:Lb3/u0$g;

    const-string v1, "content-length"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->h:Lb3/u0$g;

    const-string v1, "content-type"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->i:Lb3/u0$g;

    const-string v1, "te"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v1

    sput-object v1, Lio/grpc/internal/q0;->j:Lb3/u0$g;

    const-string v1, "user-agent"

    invoke-static {v1, v0}, Lb3/u0$g;->e(Ljava/lang/String;Lb3/u0$d;)Lb3/u0$g;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->k:Lb3/u0$g;

    const/16 v0, 0x2c

    invoke-static {v0}, Lq0/m;->a(C)Lq0/m;

    move-result-object v0

    invoke-virtual {v0}, Lq0/m;->c()Lq0/m;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->l:Lq0/m;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x14

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sput-wide v3, Lio/grpc/internal/q0;->m:J

    sget-object v3, Ljava/util/concurrent/TimeUnit;->HOURS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v4, 0x2

    invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v3

    sput-wide v3, Lio/grpc/internal/q0;->n:J

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Lio/grpc/internal/q0;->o:J

    new-instance v0, Lio/grpc/internal/t1;

    invoke-direct {v0}, Lio/grpc/internal/t1;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->p:Lb3/c1;

    new-instance v0, Lio/grpc/internal/q0$a;

    invoke-direct {v0}, Lio/grpc/internal/q0$a;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->q:Lb3/c1;

    const-string v0, "io.grpc.internal.CALL_OPTIONS_RPC_OWNED_BY_BALANCER"

    invoke-static {v0}, Lb3/c$a;->b(Ljava/lang/String;)Lb3/c$a;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/q0;->r:Lb3/c$a;

    new-instance v0, Lio/grpc/internal/q0$b;

    invoke-direct {v0}, Lio/grpc/internal/q0$b;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->s:Lb3/k;

    new-instance v0, Lio/grpc/internal/q0$c;

    invoke-direct {v0}, Lio/grpc/internal/q0$c;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->t:Lio/grpc/internal/e2$d;

    new-instance v0, Lio/grpc/internal/q0$d;

    invoke-direct {v0}, Lio/grpc/internal/q0$d;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->u:Lio/grpc/internal/e2$d;

    new-instance v0, Lio/grpc/internal/q0$e;

    invoke-direct {v0}, Lio/grpc/internal/q0$e;-><init>()V

    sput-object v0, Lio/grpc/internal/q0;->v:Lq0/p;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static synthetic a()Lb3/k;
    .locals 1

    sget-object v0, Lio/grpc/internal/q0;->s:Lb3/k;

    return-object v0
.end method

.method public static b(Ljava/lang/String;)Ljava/net/URI;
    .locals 7

    const-string v0, "authority"

    invoke-static {p0, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_0
    new-instance v0, Ljava/net/URI;

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, v0

    move-object v3, p0

    invoke-direct/range {v1 .. v6}, Ljava/net/URI;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/net/URISyntaxException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/IllegalArgumentException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid authority: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1
.end method

.method public static c(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    invoke-static {p0}, Lio/grpc/internal/q0;->b(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v4, "No host in authority \'%s\'"

    invoke-static {v1, v4, p0}, Lq0/l;->j(ZLjava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {v0}, Ljava/net/URI;->getUserInfo()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v0, "Userinfo must not be present on authority: \'%s\'"

    invoke-static {v2, v0, p0}, Lq0/l;->j(ZLjava/lang/String;Ljava/lang/Object;)V

    return-object p0
.end method

.method static d(Lio/grpc/internal/j2$a;)V
    .locals 1

    :goto_0
    invoke-interface {p0}, Lio/grpc/internal/j2$a;->next()Ljava/io/InputStream;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/grpc/internal/q0;->e(Ljava/io/Closeable;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static e(Ljava/io/Closeable;)V
    .locals 3

    if-nez p0, :cond_0

    return-void

    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    sget-object v0, Lio/grpc/internal/q0;->a:Ljava/util/logging/Logger;

    sget-object v1, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v2, "exception caught in closeQuietly"

    invoke-virtual {v0, v1, v2, p0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public static f(Lb3/c;Lb3/u0;IZ)[Lb3/k;
    .locals 4

    invoke-virtual {p0}, Lb3/c;->i()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    new-array v2, v1, [Lb3/k;

    invoke-static {}, Lb3/k$b;->a()Lb3/k$b$a;

    move-result-object v3

    invoke-virtual {v3, p0}, Lb3/k$b$a;->b(Lb3/c;)Lb3/k$b$a;

    move-result-object p0

    invoke-virtual {p0, p2}, Lb3/k$b$a;->d(I)Lb3/k$b$a;

    move-result-object p0

    invoke-virtual {p0, p3}, Lb3/k$b$a;->c(Z)Lb3/k$b$a;

    move-result-object p0

    invoke-virtual {p0}, Lb3/k$b$a;->a()Lb3/k$b;

    move-result-object p0

    const/4 p2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result p3

    if-ge p2, p3, :cond_0

    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lb3/k$a;

    invoke-virtual {p3, p0, p1}, Lb3/k$a;->a(Lb3/k$b;Lb3/u0;)Lb3/k;

    move-result-object p3

    aput-object p3, v2, p2

    add-int/lit8 p2, p2, 0x1

    goto :goto_0

    :cond_0
    add-int/lit8 v1, v1, -0x1

    sget-object p0, Lio/grpc/internal/q0;->s:Lb3/k;

    aput-object p0, v2, v1

    return-object v2
.end method

.method public static g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p1, 0x20

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    const-string p1, "grpc-java-"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2f

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    const-string p0, "1.44.1"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Ljava/net/InetSocketAddress;)Ljava/lang/String;
    .locals 4

    :try_start_0
    const-class v0, Ljava/net/InetSocketAddress;

    const-string v1, "getHostString"

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Class;

    invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v0

    new-array v1, v2, [Ljava/lang/Object;

    invoke-virtual {v0, p0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    invoke-virtual {p0}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static i(Ljava/lang/String;Z)Ljava/util/concurrent/ThreadFactory;
    .locals 1

    new-instance v0, Lv0/e;

    invoke-direct {v0}, Lv0/e;-><init>()V

    invoke-virtual {v0, p1}, Lv0/e;->e(Z)Lv0/e;

    move-result-object p1

    invoke-virtual {p1, p0}, Lv0/e;->f(Ljava/lang/String;)Lv0/e;

    move-result-object p0

    invoke-virtual {p0}, Lv0/e;->b()Ljava/util/concurrent/ThreadFactory;

    move-result-object p0

    return-object p0
.end method

.method static j(Lb3/n0$e;Z)Lio/grpc/internal/s;
    .locals 2

    invoke-virtual {p0}, Lb3/n0$e;->c()Lb3/n0$h;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lb3/n0$h;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/grpc/internal/m2;

    invoke-interface {v0}, Lio/grpc/internal/m2;->b()Lio/grpc/internal/s;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_2

    invoke-virtual {p0}, Lb3/n0$e;->b()Lb3/k$a;

    move-result-object p0

    if-nez p0, :cond_1

    return-object v0

    :cond_1
    new-instance p1, Lio/grpc/internal/q0$f;

    invoke-direct {p1, p0, v0}, Lio/grpc/internal/q0$f;-><init>(Lb3/k$a;Lio/grpc/internal/s;)V

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lb3/n0$e;->a()Lb3/f1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1;->o()Z

    move-result v0

    if-nez v0, :cond_4

    invoke-virtual {p0}, Lb3/n0$e;->d()Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance p1, Lio/grpc/internal/g0;

    invoke-virtual {p0}, Lb3/n0$e;->a()Lb3/f1;

    move-result-object p0

    sget-object v0, Lio/grpc/internal/r$a;->g:Lio/grpc/internal/r$a;

    invoke-direct {p1, p0, v0}, Lio/grpc/internal/g0;-><init>(Lb3/f1;Lio/grpc/internal/r$a;)V

    return-object p1

    :cond_3
    if-nez p1, :cond_4

    new-instance p1, Lio/grpc/internal/g0;

    invoke-virtual {p0}, Lb3/n0$e;->a()Lb3/f1;

    move-result-object p0

    sget-object v0, Lio/grpc/internal/r$a;->e:Lio/grpc/internal/r$a;

    invoke-direct {p1, p0, v0}, Lio/grpc/internal/g0;-><init>(Lb3/f1;Lio/grpc/internal/r$a;)V

    return-object p1

    :cond_4
    return-object v1
.end method

.method private static k(I)Lb3/f1$b;
    .locals 1

    const/16 v0, 0x64

    if-lt p0, v0, :cond_0

    const/16 v0, 0xc8

    if-ge p0, v0, :cond_0

    sget-object p0, Lb3/f1$b;->t:Lb3/f1$b;

    return-object p0

    :cond_0
    const/16 v0, 0x190

    if-eq p0, v0, :cond_5

    const/16 v0, 0x191

    if-eq p0, v0, :cond_4

    const/16 v0, 0x193

    if-eq p0, v0, :cond_3

    const/16 v0, 0x194

    if-eq p0, v0, :cond_2

    const/16 v0, 0x1ad

    if-eq p0, v0, :cond_1

    const/16 v0, 0x1af

    if-eq p0, v0, :cond_5

    packed-switch p0, :pswitch_data_0

    sget-object p0, Lb3/f1$b;->i:Lb3/f1$b;

    return-object p0

    :cond_1
    :pswitch_0
    sget-object p0, Lb3/f1$b;->u:Lb3/f1$b;

    return-object p0

    :cond_2
    sget-object p0, Lb3/f1$b;->s:Lb3/f1$b;

    return-object p0

    :cond_3
    sget-object p0, Lb3/f1$b;->n:Lb3/f1$b;

    return-object p0

    :cond_4
    sget-object p0, Lb3/f1$b;->w:Lb3/f1$b;

    return-object p0

    :cond_5
    sget-object p0, Lb3/f1$b;->t:Lb3/f1$b;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x1f6
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static l(I)Lb3/f1;
    .locals 3

    invoke-static {p0}, Lio/grpc/internal/q0;->k(I)Lb3/f1$b;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1$b;->g()Lb3/f1;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "HTTP status code "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p0

    return-object p0
.end method

.method public static m(Ljava/lang/String;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/16 v2, 0x10

    if-le v2, v1, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object p0

    const-string v1, "application/grpc"

    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v3, 0x1

    if-ne v1, v2, :cond_3

    return v3

    :cond_3
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    move-result p0

    const/16 v1, 0x2b

    if-eq p0, v1, :cond_4

    const/16 v1, 0x3b

    if-ne p0, v1, :cond_5

    :cond_4
    const/4 v0, 0x1

    :cond_5
    return v0
.end method

.method public static n(Lb3/c;)Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v1, Lio/grpc/internal/q0;->r:Lb3/c$a;

    invoke-virtual {p0, v1}, Lb3/c;->h(Lb3/c$a;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    return p0
.end method
