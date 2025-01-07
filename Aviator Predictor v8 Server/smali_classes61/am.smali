.class abstract Lam;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/Spliterator;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<InElementT:",
        "Ljava/lang/Object;",
        "OutElementT:",
        "Ljava/lang/Object;",
        "OutSpliteratorT::",
        "Ljava/util/Spliterator<",
        "TOutElementT;>;>",
        "Ljava/lang/Object;",
        "Ljava/util/Spliterator<",
        "TOutElementT;>;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Spliterator;
    .annotation build Lcom/google/j2objc/annotations/Weak;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TOutSpliteratorT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation
.end field

.field final b:Ljava/util/Spliterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Spliterator<",
            "TInElementT;>;"
        }
    .end annotation
.end field

.field final c:Ljava/util/function/Function;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/function/Function<",
            "-TInElementT;TOutSpliteratorT;>;"
        }
    .end annotation
.end field

.field final d:Lan;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lan<",
            "TInElementT;TOutSpliteratorT;>;"
        }
    .end annotation
.end field

.field e:I

.field f:J


# direct methods
.method public static synthetic $r8$lambda$1_6Sge72vH4PPvm3izq4tvI-m-s(Lam;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lam;->a(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic $r8$lambda$fhlpQcYQYGoDt0oCEumEXP1SHDM(Lam;Ljava/util/function/Consumer;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lam;->a(Ljava/util/function/Consumer;Ljava/lang/Object;)V

    return-void
.end method

.method constructor <init>(Ljava/util/Spliterator;Ljava/util/Spliterator;Ljava/util/function/Function;Lan;IJ)V
    .locals 0
    .param p1    # Ljava/util/Spliterator;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TOutSpliteratorT;",
            "Ljava/util/Spliterator<",
            "TInElementT;>;",
            "Ljava/util/function/Function<",
            "-TInElementT;TOutSpliteratorT;>;",
            "Lan<",
            "TInElementT;TOutSpliteratorT;>;IJ)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lam;->a:Ljava/util/Spliterator;

    iput-object p2, p0, Lam;->b:Ljava/util/Spliterator;

    iput-object p3, p0, Lam;->c:Ljava/util/function/Function;

    iput-object p4, p0, Lam;->d:Lan;

    iput p5, p0, Lam;->e:I

    iput-wide p6, p0, Lam;->f:J

    return-void
.end method

.method private synthetic a(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lam;->c:Ljava/util/function/Function;

    invoke-interface {v0, p1}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Spliterator;

    iput-object p1, p0, Lam;->a:Ljava/util/Spliterator;

    return-void
.end method

.method private synthetic a(Ljava/util/function/Consumer;Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lam;->c:Ljava/util/function/Function;

    invoke-interface {v0, p2}, Ljava/util/function/Function;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Spliterator;

    if-eqz p2, :cond_0

    invoke-interface {p2, p1}, Ljava/util/Spliterator;->forEachRemaining(Ljava/util/function/Consumer;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final characteristics()I
    .locals 1

    iget v0, p0, Lam;->e:I

    return v0
.end method

.method public final estimateSize()J
    .locals 5

    iget-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    if-eqz v0, :cond_0

    iget-wide v1, p0, Lam;->f:J

    invoke-interface {v0}, Ljava/util/Spliterator;->estimateSize()J

    move-result-wide v3

    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    iput-wide v0, p0, Lam;->f:J

    :cond_0
    iget-wide v0, p0, Lam;->f:J

    const-wide/16 v2, 0x0

    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    return-wide v0
.end method

.method public final forEachRemaining(Ljava/util/function/Consumer;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "-TOutElementT;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Spliterator;->forEachRemaining(Ljava/util/function/Consumer;)V

    const/4 v0, 0x0

    iput-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    :cond_0
    iget-object v0, p0, Lam;->b:Ljava/util/Spliterator;

    new-instance v1, Lam$$ExternalSyntheticLambda0;

    invoke-direct {v1, p0, p1}, Lam$$ExternalSyntheticLambda0;-><init>(Lam;Ljava/util/function/Consumer;)V

    invoke-interface {v0, v1}, Ljava/util/Spliterator;->forEachRemaining(Ljava/util/function/Consumer;)V

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lam;->f:J

    return-void
.end method

.method public final tryAdvance(Ljava/util/function/Consumer;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/function/Consumer<",
            "-TOutElementT;>;)Z"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    if-eqz v0, :cond_2

    invoke-interface {v0, p1}, Ljava/util/Spliterator;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-wide v0, p0, Lam;->f:J

    const-wide v2, 0x7fffffffffffffffL

    cmp-long p1, v0, v2

    if-eqz p1, :cond_1

    const-wide/16 v2, 0x1

    sub-long/2addr v0, v2

    iput-wide v0, p0, Lam;->f:J

    :cond_1
    const/4 p1, 0x1

    return p1

    :cond_2
    const/4 v0, 0x0

    iput-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    iget-object v0, p0, Lam;->b:Ljava/util/Spliterator;

    new-instance v1, Lam$$ExternalSyntheticLambda1;

    invoke-direct {v1, p0}, Lam$$ExternalSyntheticLambda1;-><init>(Lam;)V

    invoke-interface {v0, v1}, Ljava/util/Spliterator;->tryAdvance(Ljava/util/function/Consumer;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1
.end method

.method public final trySplit()Ljava/util/Spliterator;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TOutSpliteratorT;"
        }
    .end annotation

    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lam;->b:Ljava/util/Spliterator;

    invoke-interface {v0}, Ljava/util/Spliterator;->trySplit()Ljava/util/Spliterator;

    move-result-object v3

    const/4 v0, 0x0

    if-eqz v3, :cond_1

    iget v1, p0, Lam;->e:I

    and-int/lit8 v5, v1, -0x41

    invoke-virtual {p0}, Lam;->estimateSize()J

    move-result-wide v1

    const-wide v6, 0x7fffffffffffffffL

    cmp-long v4, v1, v6

    if-gez v4, :cond_0

    const-wide/16 v6, 0x2

    div-long/2addr v1, v6

    iget-wide v6, p0, Lam;->f:J

    sub-long/2addr v6, v1

    iput-wide v6, p0, Lam;->f:J

    iput v5, p0, Lam;->e:I

    :cond_0
    move-wide v6, v1

    iget-object v1, p0, Lam;->d:Lan;

    iget-object v2, p0, Lam;->a:Ljava/util/Spliterator;

    iget-object v4, p0, Lam;->c:Ljava/util/function/Function;

    invoke-interface/range {v1 .. v7}, Lan;->newFlatMapSpliterator(Ljava/util/Spliterator;Ljava/util/Spliterator;Ljava/util/function/Function;IJ)Ljava/util/Spliterator;

    move-result-object v1

    iput-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    return-object v1

    :cond_1
    iget-object v1, p0, Lam;->a:Ljava/util/Spliterator;

    if-eqz v1, :cond_2

    iput-object v0, p0, Lam;->a:Ljava/util/Spliterator;

    return-object v1

    :cond_2
    return-object v0
.end method
