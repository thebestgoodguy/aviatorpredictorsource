.class final Lio/grpc/internal/o;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final f:Ljava/util/logging/Logger;


# instance fields
.field private final a:Ljava/lang/Object;

.field private final b:Lb3/h0;

.field private final c:Ljava/util/Collection;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Collection<",
            "Lb3/d0;",
            ">;"
        }
    .end annotation
.end field

.field private final d:J

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lb3/f;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lio/grpc/internal/o;->f:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Lb3/h0;IJLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/o;->a:Ljava/lang/Object;

    const-string v0, "description"

    invoke-static {p5, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "logId"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/h0;

    iput-object p1, p0, Lio/grpc/internal/o;->b:Lb3/h0;

    if-lez p2, :cond_0

    new-instance p1, Lio/grpc/internal/o$a;

    invoke-direct {p1, p0, p2}, Lio/grpc/internal/o$a;-><init>(Lio/grpc/internal/o;I)V

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    iput-object p1, p0, Lio/grpc/internal/o;->c:Ljava/util/Collection;

    iput-wide p3, p0, Lio/grpc/internal/o;->d:J

    new-instance p1, Lb3/d0$a;

    invoke-direct {p1}, Lb3/d0$a;-><init>()V

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p5, " created"

    invoke-virtual {p2, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lb3/d0$a;->b(Ljava/lang/String;)Lb3/d0$a;

    move-result-object p1

    sget-object p2, Lb3/d0$b;->f:Lb3/d0$b;

    invoke-virtual {p1, p2}, Lb3/d0$a;->c(Lb3/d0$b;)Lb3/d0$a;

    move-result-object p1

    invoke-virtual {p1, p3, p4}, Lb3/d0$a;->e(J)Lb3/d0$a;

    move-result-object p1

    invoke-virtual {p1}, Lb3/d0$a;->a()Lb3/d0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/grpc/internal/o;->e(Lb3/d0;)V

    return-void
.end method

.method static synthetic a(Lio/grpc/internal/o;)I
    .locals 2

    iget v0, p0, Lio/grpc/internal/o;->e:I

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lio/grpc/internal/o;->e:I

    return v0
.end method

.method static d(Lb3/h0;Ljava/util/logging/Level;Ljava/lang/String;)V
    .locals 4

    sget-object v0, Lio/grpc/internal/o;->f:Ljava/util/logging/Logger;

    invoke-virtual {v0, p1}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Ljava/util/logging/LogRecord;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "["

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, "] "

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v1, p1, p0}, Ljava/util/logging/LogRecord;-><init>(Ljava/util/logging/Level;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/logging/Logger;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/logging/LogRecord;->setLoggerName(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/util/logging/Logger;->getName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/util/logging/LogRecord;->setSourceClassName(Ljava/lang/String;)V

    const-string p0, "log"

    invoke-virtual {v1, p0}, Ljava/util/logging/LogRecord;->setSourceMethodName(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/logging/Logger;->log(Ljava/util/logging/LogRecord;)V

    :cond_0
    return-void
.end method


# virtual methods
.method b()Lb3/h0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/o;->b:Lb3/h0;

    return-object v0
.end method

.method c()Z
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/o;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/o;->c:Ljava/util/Collection;

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method e(Lb3/d0;)V
    .locals 2

    sget-object v0, Lio/grpc/internal/o$b;->a:[I

    iget-object v1, p1, Lb3/d0;->b:Lb3/d0$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    sget-object v0, Ljava/util/logging/Level;->FINEST:Ljava/util/logging/Level;

    goto :goto_0

    :cond_0
    sget-object v0, Ljava/util/logging/Level;->FINER:Ljava/util/logging/Level;

    goto :goto_0

    :cond_1
    sget-object v0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    :goto_0
    invoke-virtual {p0, p1}, Lio/grpc/internal/o;->f(Lb3/d0;)V

    iget-object v1, p0, Lio/grpc/internal/o;->b:Lb3/h0;

    iget-object p1, p1, Lb3/d0;->a:Ljava/lang/String;

    invoke-static {v1, v0, p1}, Lio/grpc/internal/o;->d(Lb3/h0;Ljava/util/logging/Level;Ljava/lang/String;)V

    return-void
.end method

.method f(Lb3/d0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/o;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/o;->c:Ljava/util/Collection;

    if-eqz v1, :cond_0

    invoke-interface {v1, p1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
