.class public final Lio/grpc/internal/g1;
.super Lb3/r0;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/g1$d;,
        Lio/grpc/internal/g1$b;,
        Lio/grpc/internal/g1$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb3/r0<",
        "Lio/grpc/internal/g1;",
        ">;"
    }
.end annotation


# static fields
.field private static final H:Ljava/util/logging/Logger;

.field static final I:J

.field static final J:J

.field private static final K:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "+",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private static final L:Lb3/v;

.field private static final M:Lb3/o;


# instance fields
.field private A:Z

.field private B:Z

.field private C:Z

.field private D:Z

.field private E:Z

.field private final F:Lio/grpc/internal/g1$c;

.field private final G:Lio/grpc/internal/g1$b;

.field a:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "+",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field b:Lio/grpc/internal/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/o1<",
            "+",
            "Ljava/util/concurrent/Executor;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/h;",
            ">;"
        }
    .end annotation
.end field

.field final d:Lb3/y0;

.field e:Lb3/w0$d;

.field final f:Ljava/lang/String;

.field final g:Lb3/b;

.field private final h:Ljava/net/SocketAddress;

.field i:Ljava/lang/String;

.field j:Ljava/lang/String;

.field k:Ljava/lang/String;

.field l:Z

.field m:Lb3/v;

.field n:Lb3/o;

.field o:J

.field p:I

.field q:I

.field r:J

.field s:J

.field t:Z

.field u:Lb3/c0;

.field v:I

.field w:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;"
        }
    .end annotation
.end field

.field x:Z

.field y:Lb3/c1;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const-class v0, Lio/grpc/internal/g1;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/g1;->H:Ljava/util/logging/Logger;

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1e

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lio/grpc/internal/g1;->I:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lio/grpc/internal/g1;->J:J

    sget-object v0, Lio/grpc/internal/q0;->t:Lio/grpc/internal/e2$d;

    invoke-static {v0}, Lio/grpc/internal/f2;->c(Lio/grpc/internal/e2$d;)Lio/grpc/internal/f2;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/g1;->K:Lio/grpc/internal/o1;

    invoke-static {}, Lb3/v;->c()Lb3/v;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/g1;->L:Lb3/v;

    invoke-static {}, Lb3/o;->a()Lb3/o;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/g1;->M:Lb3/o;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lb3/e;Lb3/b;Lio/grpc/internal/g1$c;Lio/grpc/internal/g1$b;)V
    .locals 2

    invoke-direct {p0}, Lb3/r0;-><init>()V

    sget-object p2, Lio/grpc/internal/g1;->K:Lio/grpc/internal/o1;

    iput-object p2, p0, Lio/grpc/internal/g1;->a:Lio/grpc/internal/o1;

    iput-object p2, p0, Lio/grpc/internal/g1;->b:Lio/grpc/internal/o1;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    iput-object p2, p0, Lio/grpc/internal/g1;->c:Ljava/util/List;

    invoke-static {}, Lb3/y0;->d()Lb3/y0;

    move-result-object p2

    iput-object p2, p0, Lio/grpc/internal/g1;->d:Lb3/y0;

    invoke-virtual {p2}, Lb3/y0;->c()Lb3/w0$d;

    move-result-object p2

    iput-object p2, p0, Lio/grpc/internal/g1;->e:Lb3/w0$d;

    const-string p2, "pick_first"

    iput-object p2, p0, Lio/grpc/internal/g1;->k:Ljava/lang/String;

    sget-object p2, Lio/grpc/internal/g1;->L:Lb3/v;

    iput-object p2, p0, Lio/grpc/internal/g1;->m:Lb3/v;

    sget-object p2, Lio/grpc/internal/g1;->M:Lb3/o;

    iput-object p2, p0, Lio/grpc/internal/g1;->n:Lb3/o;

    sget-wide v0, Lio/grpc/internal/g1;->I:J

    iput-wide v0, p0, Lio/grpc/internal/g1;->o:J

    const/4 p2, 0x5

    iput p2, p0, Lio/grpc/internal/g1;->p:I

    iput p2, p0, Lio/grpc/internal/g1;->q:I

    const-wide/32 v0, 0x1000000

    iput-wide v0, p0, Lio/grpc/internal/g1;->r:J

    const-wide/32 v0, 0x100000

    iput-wide v0, p0, Lio/grpc/internal/g1;->s:J

    const/4 p2, 0x1

    iput-boolean p2, p0, Lio/grpc/internal/g1;->t:Z

    invoke-static {}, Lb3/c0;->g()Lb3/c0;

    move-result-object v0

    iput-object v0, p0, Lio/grpc/internal/g1;->u:Lb3/c0;

    iput-boolean p2, p0, Lio/grpc/internal/g1;->x:Z

    iput-boolean p2, p0, Lio/grpc/internal/g1;->z:Z

    iput-boolean p2, p0, Lio/grpc/internal/g1;->A:Z

    iput-boolean p2, p0, Lio/grpc/internal/g1;->B:Z

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/grpc/internal/g1;->C:Z

    iput-boolean p2, p0, Lio/grpc/internal/g1;->D:Z

    iput-boolean p2, p0, Lio/grpc/internal/g1;->E:Z

    const-string p2, "target"

    invoke-static {p1, p2}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/grpc/internal/g1;->f:Ljava/lang/String;

    iput-object p3, p0, Lio/grpc/internal/g1;->g:Lb3/b;

    const-string p1, "clientTransportFactoryBuilder"

    invoke-static {p4, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/g1$c;

    iput-object p1, p0, Lio/grpc/internal/g1;->F:Lio/grpc/internal/g1$c;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/grpc/internal/g1;->h:Ljava/net/SocketAddress;

    if-eqz p5, :cond_0

    iput-object p5, p0, Lio/grpc/internal/g1;->G:Lio/grpc/internal/g1$b;

    goto :goto_0

    :cond_0
    new-instance p2, Lio/grpc/internal/g1$d;

    invoke-direct {p2, p1}, Lio/grpc/internal/g1$d;-><init>(Lio/grpc/internal/g1$a;)V

    iput-object p2, p0, Lio/grpc/internal/g1;->G:Lio/grpc/internal/g1$b;

    :goto_0
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lio/grpc/internal/g1$c;Lio/grpc/internal/g1$b;)V
    .locals 6

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v4, p2

    move-object v5, p3

    invoke-direct/range {v0 .. v5}, Lio/grpc/internal/g1;-><init>(Ljava/lang/String;Lb3/e;Lb3/b;Lio/grpc/internal/g1$c;Lio/grpc/internal/g1$b;)V

    return-void
.end method


# virtual methods
.method public a()Lb3/q0;
    .locals 10

    new-instance v0, Lio/grpc/internal/h1;

    new-instance v9, Lio/grpc/internal/f1;

    iget-object v1, p0, Lio/grpc/internal/g1;->F:Lio/grpc/internal/g1$c;

    invoke-interface {v1}, Lio/grpc/internal/g1$c;->a()Lio/grpc/internal/t;

    move-result-object v3

    new-instance v4, Lio/grpc/internal/e0$a;

    invoke-direct {v4}, Lio/grpc/internal/e0$a;-><init>()V

    sget-object v1, Lio/grpc/internal/q0;->t:Lio/grpc/internal/e2$d;

    invoke-static {v1}, Lio/grpc/internal/f2;->c(Lio/grpc/internal/e2$d;)Lio/grpc/internal/f2;

    move-result-object v5

    sget-object v6, Lio/grpc/internal/q0;->v:Lq0/p;

    invoke-virtual {p0}, Lio/grpc/internal/g1;->f()Ljava/util/List;

    move-result-object v7

    sget-object v8, Lio/grpc/internal/k2;->a:Lio/grpc/internal/k2;

    move-object v1, v9

    move-object v2, p0

    invoke-direct/range {v1 .. v8}, Lio/grpc/internal/f1;-><init>(Lio/grpc/internal/g1;Lio/grpc/internal/t;Lio/grpc/internal/k$a;Lio/grpc/internal/o1;Lq0/p;Ljava/util/List;Lio/grpc/internal/k2;)V

    invoke-direct {v0, v9}, Lio/grpc/internal/h1;-><init>(Lb3/q0;)V

    return-object v0
.end method

.method e()I
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/g1;->G:Lio/grpc/internal/g1$b;

    invoke-interface {v0}, Lio/grpc/internal/g1$b;->a()I

    move-result v0

    return v0
.end method

.method f()Ljava/util/List;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb3/h;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lio/grpc/internal/g1;->c:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iget-boolean v1, p0, Lio/grpc/internal/g1;->z:Z

    const-string v2, "getClientInterceptor"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "Unable to apply census stats"

    if-eqz v1, :cond_0

    :try_start_0
    const-string v1, "io.grpc.census.InternalCensusStatsAccessor"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    const/4 v6, 0x4

    new-array v7, v6, [Ljava/lang/Class;

    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v8, v7, v4

    const/4 v9, 0x1

    aput-object v8, v7, v9

    const/4 v10, 0x2

    aput-object v8, v7, v10

    const/4 v11, 0x3

    aput-object v8, v7, v11

    invoke-virtual {v1, v2, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v6, v6, [Ljava/lang/Object;

    iget-boolean v7, p0, Lio/grpc/internal/g1;->A:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v4

    iget-boolean v7, p0, Lio/grpc/internal/g1;->B:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v9

    iget-boolean v7, p0, Lio/grpc/internal/g1;->C:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v10

    iget-boolean v7, p0, Lio/grpc/internal/g1;->D:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    aput-object v7, v6, v11

    invoke-virtual {v1, v3, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/h;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_0

    :catch_2
    move-exception v1

    goto :goto_0

    :catch_3
    move-exception v1

    :goto_0
    sget-object v6, Lio/grpc/internal/g1;->H:Ljava/util/logging/Logger;

    sget-object v7, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v6, v7, v5, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    move-object v1, v3

    :goto_1
    if-eqz v1, :cond_0

    invoke-interface {v0, v4, v1}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_0
    iget-boolean v1, p0, Lio/grpc/internal/g1;->E:Z

    if-eqz v1, :cond_1

    :try_start_1
    const-string v1, "io.grpc.census.InternalCensusTracingAccessor"

    invoke-static {v1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v1

    new-array v6, v4, [Ljava/lang/Class;

    invoke-virtual {v1, v2, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v1

    new-array v2, v4, [Ljava/lang/Object;

    invoke-virtual {v1, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb3/h;
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_7
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_6
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_5
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_4

    move-object v3, v1

    goto :goto_3

    :catch_4
    move-exception v1

    goto :goto_2

    :catch_5
    move-exception v1

    goto :goto_2

    :catch_6
    move-exception v1

    goto :goto_2

    :catch_7
    move-exception v1

    :goto_2
    sget-object v2, Lio/grpc/internal/g1;->H:Ljava/util/logging/Logger;

    sget-object v6, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v6, v5, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_3
    if-eqz v3, :cond_1

    invoke-interface {v0, v4, v3}, Ljava/util/List;->add(ILjava/lang/Object;)V

    :cond_1
    return-object v0
.end method
