.class public abstract Lb4/a1;
.super Lb4/g0;
.source ""


# instance fields
.field private f:J

.field private g:Z

.field private h:Lkotlinx/coroutines/internal/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlinx/coroutines/internal/a<",
            "Lb4/u0<",
            "*>;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb4/g0;-><init>()V

    return-void
.end method

.method private final M(Z)J
    .locals 2

    if-eqz p1, :cond_0

    const-wide v0, 0x100000000L

    goto :goto_0

    :cond_0
    const-wide/16 v0, 0x1

    :goto_0
    return-wide v0
.end method

.method public static synthetic c0(Lb4/a1;ZILjava/lang/Object;)V
    .locals 0

    if-nez p3, :cond_1

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-virtual {p0, p1}, Lb4/a1;->X(Z)V

    return-void

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: incrementUseCount"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final K(Z)V
    .locals 4

    iget-wide v0, p0, Lb4/a1;->f:J

    invoke-direct {p0, p1}, Lb4/a1;->M(Z)J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lb4/a1;->f:J

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    return-void

    :cond_0
    invoke-static {}, Lb4/q0;->a()Z

    move-result p1

    if-eqz p1, :cond_3

    iget-wide v0, p0, Lb4/a1;->f:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_3
    :goto_1
    iget-boolean p1, p0, Lb4/a1;->g:Z

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lb4/a1;->shutdown()V

    :cond_4
    return-void
.end method

.method public final R(Lb4/u0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/u0<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb4/a1;->h:Lkotlinx/coroutines/internal/a;

    if-nez v0, :cond_0

    new-instance v0, Lkotlinx/coroutines/internal/a;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/a;-><init>()V

    iput-object v0, p0, Lb4/a1;->h:Lkotlinx/coroutines/internal/a;

    :cond_0
    invoke-virtual {v0, p1}, Lkotlinx/coroutines/internal/a;->a(Ljava/lang/Object;)V

    return-void
.end method

.method protected S()J
    .locals 3

    iget-object v0, p0, Lb4/a1;->h:Lkotlinx/coroutines/internal/a;

    const-wide v1, 0x7fffffffffffffffL

    if-nez v0, :cond_0

    return-wide v1

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    :goto_0
    return-wide v1
.end method

.method public final X(Z)V
    .locals 4

    iget-wide v0, p0, Lb4/a1;->f:J

    invoke-direct {p0, p1}, Lb4/a1;->M(Z)J

    move-result-wide v2

    add-long/2addr v0, v2

    iput-wide v0, p0, Lb4/a1;->f:J

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lb4/a1;->g:Z

    :cond_0
    return-void
.end method

.method public final f0()Z
    .locals 6

    iget-wide v0, p0, Lb4/a1;->f:J

    const/4 v2, 0x1

    invoke-direct {p0, v2}, Lb4/a1;->M(Z)J

    move-result-wide v3

    cmp-long v5, v0, v3

    if-ltz v5, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2
.end method

.method public final i0()Z
    .locals 1

    iget-object v0, p0, Lb4/a1;->h:Lkotlinx/coroutines/internal/a;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a;->c()Z

    move-result v0

    :goto_0
    return v0
.end method

.method public final j0()Z
    .locals 2

    iget-object v0, p0, Lb4/a1;->h:Lkotlinx/coroutines/internal/a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {v0}, Lkotlinx/coroutines/internal/a;->d()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb4/u0;

    if-nez v0, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, Lb4/u0;->run()V

    const/4 v0, 0x1

    return v0
.end method

.method protected shutdown()V
    .locals 0

    return-void
.end method
