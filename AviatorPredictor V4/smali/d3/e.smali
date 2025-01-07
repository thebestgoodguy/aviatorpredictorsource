.class public final Ld3/e;
.super Lio/grpc/internal/b;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/e$f;,
        Ld3/e$d;,
        Ld3/e$e;,
        Ld3/e$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/b<",
        "Ld3/e;",
        ">;"
    }
.end annotation


# static fields
.field private static final r:Ljava/util/logging/Logger;

.field static final s:Le3/b;

.field private static final t:J

.field private static final u:Lio/grpc/internal/e2$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/e2$d<",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private static final v:Ljava/util/EnumSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/EnumSet<",
            "Lb3/l1;",
            ">;"
        }
    .end annotation
.end field

.field public static final synthetic w:I


# instance fields
.field private final b:Lio/grpc/internal/g1;

.field private c:Lio/grpc/internal/n2$b;

.field private d:Ljava/util/concurrent/Executor;

.field private e:Ljava/util/concurrent/ScheduledExecutorService;

.field private f:Ljavax/net/SocketFactory;

.field private g:Ljavax/net/ssl/SSLSocketFactory;

.field private final h:Z

.field private i:Ljavax/net/ssl/HostnameVerifier;

.field private j:Le3/b;

.field private k:Ld3/e$c;

.field private l:J

.field private m:J

.field private n:I

.field private o:Z

.field private p:I

.field private final q:Z


# direct methods
.method static constructor <clinit>()V
    .locals 6

    const-class v0, Ld3/e;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ld3/e;->r:Ljava/util/logging/Logger;

    new-instance v0, Le3/b$b;

    sget-object v1, Le3/b;->f:Le3/b;

    invoke-direct {v0, v1}, Le3/b$b;-><init>(Le3/b;)V

    const/4 v1, 0x6

    new-array v1, v1, [Le3/a;

    sget-object v2, Le3/a;->P0:Le3/a;

    const/4 v3, 0x0

    aput-object v2, v1, v3

    sget-object v2, Le3/a;->T0:Le3/a;

    const/4 v4, 0x1

    aput-object v2, v1, v4

    sget-object v2, Le3/a;->Q0:Le3/a;

    const/4 v5, 0x2

    aput-object v2, v1, v5

    sget-object v2, Le3/a;->U0:Le3/a;

    const/4 v5, 0x3

    aput-object v2, v1, v5

    sget-object v2, Le3/a;->Y0:Le3/a;

    const/4 v5, 0x4

    aput-object v2, v1, v5

    sget-object v2, Le3/a;->X0:Le3/a;

    const/4 v5, 0x5

    aput-object v2, v1, v5

    invoke-virtual {v0, v1}, Le3/b$b;->f([Le3/a;)Le3/b$b;

    move-result-object v0

    new-array v1, v4, [Le3/h;

    sget-object v2, Le3/h;->g:Le3/h;

    aput-object v2, v1, v3

    invoke-virtual {v0, v1}, Le3/b$b;->i([Le3/h;)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0, v4}, Le3/b$b;->h(Z)Le3/b$b;

    move-result-object v0

    invoke-virtual {v0}, Le3/b$b;->e()Le3/b;

    move-result-object v0

    sput-object v0, Ld3/e;->s:Le3/b;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide v0

    sput-wide v0, Ld3/e;->t:J

    new-instance v0, Ld3/e$a;

    invoke-direct {v0}, Ld3/e$a;-><init>()V

    sput-object v0, Ld3/e;->u:Lio/grpc/internal/e2$d;

    sget-object v0, Lb3/l1;->f:Lb3/l1;

    sget-object v1, Lb3/l1;->g:Lb3/l1;

    invoke-static {v0, v1}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    move-result-object v0

    sput-object v0, Ld3/e;->v:Ljava/util/EnumSet;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/grpc/internal/b;-><init>()V

    invoke-static {}, Lio/grpc/internal/n2;->a()Lio/grpc/internal/n2$b;

    move-result-object v0

    iput-object v0, p0, Ld3/e;->c:Lio/grpc/internal/n2$b;

    sget-object v0, Ld3/e;->s:Le3/b;

    iput-object v0, p0, Ld3/e;->j:Le3/b;

    sget-object v0, Ld3/e$c;->e:Ld3/e$c;

    iput-object v0, p0, Ld3/e;->k:Ld3/e$c;

    const-wide v0, 0x7fffffffffffffffL

    iput-wide v0, p0, Ld3/e;->l:J

    sget-wide v0, Lio/grpc/internal/q0;->m:J

    iput-wide v0, p0, Ld3/e;->m:J

    const v0, 0xffff

    iput v0, p0, Ld3/e;->n:I

    const v0, 0x7fffffff

    iput v0, p0, Ld3/e;->p:I

    const/4 v0, 0x0

    iput-boolean v0, p0, Ld3/e;->q:Z

    new-instance v1, Lio/grpc/internal/g1;

    new-instance v2, Ld3/e$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Ld3/e$e;-><init>(Ld3/e;Ld3/e$a;)V

    new-instance v4, Ld3/e$d;

    invoke-direct {v4, p0, v3}, Ld3/e$d;-><init>(Ld3/e;Ld3/e$a;)V

    invoke-direct {v1, p1, v2, v4}, Lio/grpc/internal/g1;-><init>(Ljava/lang/String;Lio/grpc/internal/g1$c;Lio/grpc/internal/g1$b;)V

    iput-object v1, p0, Ld3/e;->b:Lio/grpc/internal/g1;

    iput-boolean v0, p0, Ld3/e;->h:Z

    return-void
.end method

.method static synthetic f()Lio/grpc/internal/e2$d;
    .locals 1

    sget-object v0, Ld3/e;->u:Lio/grpc/internal/e2$d;

    return-object v0
.end method

.method public static forTarget(Ljava/lang/String;)Ld3/e;
    .locals 1

    new-instance v0, Ld3/e;

    invoke-direct {v0, p0}, Ld3/e;-><init>(Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public bridge synthetic c(JLjava/util/concurrent/TimeUnit;)Lb3/r0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Ld3/e;->j(JLjava/util/concurrent/TimeUnit;)Ld3/e;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lb3/r0;
    .locals 1

    invoke-virtual {p0}, Ld3/e;->k()Ld3/e;

    move-result-object v0

    return-object v0
.end method

.method protected e()Lb3/r0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/r0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Ld3/e;->b:Lio/grpc/internal/g1;

    return-object v0
.end method

.method g()Lio/grpc/internal/t;
    .locals 22

    move-object/from16 v0, p0

    iget-wide v1, v0, Ld3/e;->l:J

    const-wide v3, 0x7fffffffffffffffL

    cmp-long v5, v1, v3

    if-eqz v5, :cond_0

    const/4 v1, 0x1

    const/4 v10, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    const/4 v10, 0x0

    :goto_0
    new-instance v1, Ld3/e$f;

    move-object v2, v1

    iget-object v3, v0, Ld3/e;->d:Ljava/util/concurrent/Executor;

    iget-object v4, v0, Ld3/e;->e:Ljava/util/concurrent/ScheduledExecutorService;

    iget-object v5, v0, Ld3/e;->f:Ljavax/net/SocketFactory;

    invoke-virtual/range {p0 .. p0}, Ld3/e;->h()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v6

    iget-object v7, v0, Ld3/e;->i:Ljavax/net/ssl/HostnameVerifier;

    iget-object v8, v0, Ld3/e;->j:Le3/b;

    iget v9, v0, Lio/grpc/internal/b;->a:I

    iget-wide v11, v0, Ld3/e;->l:J

    iget-wide v13, v0, Ld3/e;->m:J

    iget v15, v0, Ld3/e;->n:I

    move-object/from16 v21, v1

    iget-boolean v1, v0, Ld3/e;->o:Z

    move/from16 v16, v1

    iget v1, v0, Ld3/e;->p:I

    move/from16 v17, v1

    iget-object v1, v0, Ld3/e;->c:Lio/grpc/internal/n2$b;

    move-object/from16 v18, v1

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v2 .. v20}, Ld3/e$f;-><init>(Ljava/util/concurrent/Executor;Ljava/util/concurrent/ScheduledExecutorService;Ljavax/net/SocketFactory;Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/HostnameVerifier;Le3/b;IZJJIZILio/grpc/internal/n2$b;ZLd3/e$a;)V

    return-object v21
.end method

.method h()Ljavax/net/ssl/SSLSocketFactory;
    .locals 3

    sget-object v0, Ld3/e$b;->b:[I

    iget-object v1, p0, Ld3/e;->k:Ld3/e$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    :try_start_0
    iget-object v0, p0, Ld3/e;->g:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    const-string v0, "Default"

    invoke-static {}, Le3/f;->e()Le3/f;

    move-result-object v1

    invoke-virtual {v1}, Le3/f;->g()Ljava/security/Provider;

    move-result-object v1

    invoke-static {v0, v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;Ljava/security/Provider;)Ljavax/net/ssl/SSLContext;

    move-result-object v0

    invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

    move-result-object v0

    iput-object v0, p0, Ld3/e;->g:Ljavax/net/ssl/SSLSocketFactory;

    :cond_0
    iget-object v0, p0, Ld3/e;->g:Ljavax/net/ssl/SSLSocketFactory;
    :try_end_0
    .catch Ljava/security/GeneralSecurityException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    const-string v2, "TLS Provider failure"

    invoke-direct {v1, v2, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v1

    :cond_1
    new-instance v0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown negotiation type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p0, Ld3/e;->k:Ld3/e$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const/4 v0, 0x0

    return-object v0
.end method

.method i()I
    .locals 3

    sget-object v0, Ld3/e$b;->b:[I

    iget-object v1, p0, Ld3/e;->k:Ld3/e$c;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/16 v0, 0x1bb

    return v0

    :cond_0
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v2, p0, Ld3/e;->k:Ld3/e$c;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not handled"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_1
    const/16 v0, 0x50

    return v0
.end method

.method public j(JLjava/util/concurrent/TimeUnit;)Ld3/e;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-lez v2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "keepalive time must be positive"

    invoke-static {v0, v1}, Lq0/l;->e(ZLjava/lang/Object;)V

    invoke-virtual {p3, p1, p2}, Ljava/util/concurrent/TimeUnit;->toNanos(J)J

    move-result-wide p1

    iput-wide p1, p0, Ld3/e;->l:J

    invoke-static {p1, p2}, Lio/grpc/internal/b1;->l(J)J

    move-result-wide p1

    iput-wide p1, p0, Ld3/e;->l:J

    sget-wide v0, Ld3/e;->t:J

    cmp-long p3, p1, v0

    if-ltz p3, :cond_1

    const-wide p1, 0x7fffffffffffffffL

    iput-wide p1, p0, Ld3/e;->l:J

    :cond_1
    return-object p0
.end method

.method public k()Ld3/e;
    .locals 2

    iget-boolean v0, p0, Ld3/e;->h:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot change security when using ChannelCredentials"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    sget-object v0, Ld3/e$c;->f:Ld3/e$c;

    iput-object v0, p0, Ld3/e;->k:Ld3/e$c;

    return-object p0
.end method

.method public scheduledExecutorService(Ljava/util/concurrent/ScheduledExecutorService;)Ld3/e;
    .locals 1

    const-string v0, "scheduledExecutorService"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p1, p0, Ld3/e;->e:Ljava/util/concurrent/ScheduledExecutorService;

    return-object p0
.end method

.method public sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)Ld3/e;
    .locals 2

    iget-boolean v0, p0, Ld3/e;->h:Z

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "Cannot change security when using ChannelCredentials"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iput-object p1, p0, Ld3/e;->g:Ljavax/net/ssl/SSLSocketFactory;

    sget-object p1, Ld3/e$c;->e:Ld3/e$c;

    iput-object p1, p0, Ld3/e;->k:Ld3/e$c;

    return-object p0
.end method

.method public transportExecutor(Ljava/util/concurrent/Executor;)Ld3/e;
    .locals 0

    iput-object p1, p0, Ld3/e;->d:Ljava/util/concurrent/Executor;

    return-object p0
.end method
