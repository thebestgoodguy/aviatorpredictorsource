.class public Lp1/r;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lp1/g;

.field private final b:Lp1/g$d;

.field private final c:J

.field private final d:D

.field private final e:J

.field private f:J

.field private g:J

.field private h:J

.field private i:Lp1/g$b;


# direct methods
.method public constructor <init>(Lp1/g;Lp1/g$d;)V
    .locals 9

    const-wide/16 v3, 0x3e8

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    const-wide/32 v7, 0xea60

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v8}, Lp1/r;-><init>(Lp1/g;Lp1/g$d;JDJ)V

    return-void
.end method

.method public constructor <init>(Lp1/g;Lp1/g$d;JDJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp1/r;->a:Lp1/g;

    iput-object p2, p0, Lp1/r;->b:Lp1/g$d;

    iput-wide p3, p0, Lp1/r;->c:J

    iput-wide p5, p0, Lp1/r;->d:D

    iput-wide p7, p0, Lp1/r;->e:J

    iput-wide p7, p0, Lp1/r;->f:J

    new-instance p1, Ljava/util/Date;

    invoke-direct {p1}, Ljava/util/Date;-><init>()V

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    iput-wide p1, p0, Lp1/r;->h:J

    invoke-virtual {p0}, Lp1/r;->f()V

    return-void
.end method

.method public static synthetic a(Lp1/r;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0, p1}, Lp1/r;->e(Ljava/lang/Runnable;)V

    return-void
.end method

.method private d()J
    .locals 4

    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v0

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    sub-double/2addr v0, v2

    iget-wide v2, p0, Lp1/r;->g:J

    long-to-double v2, v2

    mul-double v0, v0, v2

    double-to-long v0, v0

    return-wide v0
.end method

.method private synthetic e(Ljava/lang/Runnable;)V
    .locals 2

    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    invoke-virtual {v0}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    iput-wide v0, p0, Lp1/r;->h:J

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method


# virtual methods
.method public b(Ljava/lang/Runnable;)V
    .locals 11

    invoke-virtual {p0}, Lp1/r;->c()V

    iget-wide v0, p0, Lp1/r;->g:J

    invoke-direct {p0}, Lp1/r;->d()J

    move-result-wide v2

    add-long/2addr v0, v2

    new-instance v2, Ljava/util/Date;

    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    iget-wide v4, p0, Lp1/r;->h:J

    sub-long/2addr v2, v4

    const-wide/16 v4, 0x0

    invoke-static {v4, v5, v2, v3}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    sub-long v6, v0, v2

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v6

    iget-wide v8, p0, Lp1/r;->g:J

    cmp-long v10, v8, v4

    if-lez v10, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x4

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v8, 0x0

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v5, v8

    const/4 v8, 0x1

    iget-wide v9, p0, Lp1/r;->g:J

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    aput-object v9, v5, v8

    const/4 v8, 0x2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    aput-object v0, v5, v8

    const/4 v0, 0x3

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    aput-object v1, v5, v0

    const-string v0, "Backing off for %d ms (base delay: %d ms, delay with jitter: %d ms, last attempt: %d ms ago)"

    invoke-static {v4, v0, v5}, Lp1/v;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, Lp1/r;->a:Lp1/g;

    iget-object v1, p0, Lp1/r;->b:Lp1/g$d;

    new-instance v2, Lp1/q;

    invoke-direct {v2, p0, p1}, Lp1/q;-><init>(Lp1/r;Ljava/lang/Runnable;)V

    invoke-virtual {v0, v1, v6, v7, v2}, Lp1/g;->k(Lp1/g$d;JLjava/lang/Runnable;)Lp1/g$b;

    move-result-object p1

    iput-object p1, p0, Lp1/r;->i:Lp1/g$b;

    iget-wide v0, p0, Lp1/r;->g:J

    long-to-double v0, v0

    iget-wide v2, p0, Lp1/r;->d:D

    mul-double v0, v0, v2

    double-to-long v0, v0

    iput-wide v0, p0, Lp1/r;->g:J

    iget-wide v2, p0, Lp1/r;->c:J

    cmp-long p1, v0, v2

    if-gez p1, :cond_1

    :goto_0
    iput-wide v2, p0, Lp1/r;->g:J

    goto :goto_1

    :cond_1
    iget-wide v2, p0, Lp1/r;->f:J

    cmp-long p1, v0, v2

    if-lez p1, :cond_2

    goto :goto_0

    :cond_2
    :goto_1
    iget-wide v0, p0, Lp1/r;->e:J

    iput-wide v0, p0, Lp1/r;->f:J

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lp1/r;->i:Lp1/g$b;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lp1/g$b;->c()V

    const/4 v0, 0x0

    iput-object v0, p0, Lp1/r;->i:Lp1/g$b;

    :cond_0
    return-void
.end method

.method public f()V
    .locals 2

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lp1/r;->g:J

    return-void
.end method

.method public g()V
    .locals 2

    iget-wide v0, p0, Lp1/r;->f:J

    iput-wide v0, p0, Lp1/r;->g:J

    return-void
.end method

.method public h(J)V
    .locals 0

    iput-wide p1, p0, Lp1/r;->f:J

    return-void
.end method
