.class public abstract Lb4/b1$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;
.implements Ljava/lang/Comparable;
.implements Lb4/y0;
.implements Lkotlinx/coroutines/internal/e0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb4/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Runnable;",
        "Ljava/lang/Comparable<",
        "Lb4/b1$a;",
        ">;",
        "Lb4/y0;",
        "Lkotlinx/coroutines/internal/e0;"
    }
.end annotation


# instance fields
.field public e:J

.field private f:Ljava/lang/Object;

.field private g:I


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lb4/b1$a;

    invoke-virtual {p0, p1}, Lb4/b1$a;->p(Lb4/b1$a;)I

    move-result p1

    return p1
.end method

.method public final declared-synchronized d()V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb4/b1$a;->f:Ljava/lang/Object;

    invoke-static {}, Lb4/e1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-ne v0, v1, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    instance-of v1, v0, Lb4/b1$b;

    if-eqz v1, :cond_1

    check-cast v0, Lb4/b1$b;

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v0, p0}, Lkotlinx/coroutines/internal/d0;->g(Lkotlinx/coroutines/internal/e0;)Z

    :goto_1
    invoke-static {}, Lb4/e1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v0

    iput-object v0, p0, Lb4/b1$a;->f:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public g(I)V
    .locals 0

    iput p1, p0, Lb4/b1$a;->g:I

    return-void
.end method

.method public h(Lkotlinx/coroutines/internal/d0;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlinx/coroutines/internal/d0<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb4/b1$a;->f:Ljava/lang/Object;

    invoke-static {}, Lb4/e1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    iput-object p1, p0, Lb4/b1$a;->f:Ljava/lang/Object;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Failed requirement."

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public k()Lkotlinx/coroutines/internal/d0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlinx/coroutines/internal/d0<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lb4/b1$a;->f:Ljava/lang/Object;

    instance-of v1, v0, Lkotlinx/coroutines/internal/d0;

    if-eqz v1, :cond_0

    check-cast v0, Lkotlinx/coroutines/internal/d0;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lb4/b1$a;->g:I

    return v0
.end method

.method public p(Lb4/b1$a;)I
    .locals 4

    iget-wide v0, p0, Lb4/b1$a;->e:J

    iget-wide v2, p1, Lb4/b1$a;->e:J

    sub-long/2addr v0, v2

    const-wide/16 v2, 0x0

    cmp-long p1, v0, v2

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    if-gez p1, :cond_1

    const/4 p1, -0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final declared-synchronized q(JLb4/b1$b;Lb4/b1;)I
    .locals 7

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lb4/b1$a;->f:Ljava/lang/Object;

    invoke-static {}, Lb4/e1;->b()Lkotlinx/coroutines/internal/y;

    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v0, v1, :cond_0

    const/4 p1, 0x2

    :goto_0
    monitor-exit p0

    return p1

    :cond_0
    :try_start_1
    monitor-enter p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p3}, Lkotlinx/coroutines/internal/d0;->b()Lkotlinx/coroutines/internal/e0;

    move-result-object v0

    check-cast v0, Lb4/b1$a;

    invoke-static {p4}, Lb4/b1;->n0(Lb4/b1;)Z

    move-result p4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-eqz p4, :cond_1

    const/4 p1, 0x1

    :try_start_3
    monitor-exit p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    monitor-exit p0

    return p1

    :cond_1
    const-wide/16 v1, 0x0

    if-nez v0, :cond_2

    :goto_1
    :try_start_4
    iput-wide p1, p3, Lb4/b1$b;->b:J

    goto :goto_3

    :cond_2
    iget-wide v3, v0, Lb4/b1$a;->e:J

    sub-long v5, v3, p1

    cmp-long p4, v5, v1

    if-ltz p4, :cond_3

    goto :goto_2

    :cond_3
    move-wide p1, v3

    :goto_2
    iget-wide v3, p3, Lb4/b1$b;->b:J

    sub-long v3, p1, v3

    cmp-long p4, v3, v1

    if-lez p4, :cond_4

    goto :goto_1

    :cond_4
    :goto_3
    iget-wide p1, p0, Lb4/b1$a;->e:J

    iget-wide v3, p3, Lb4/b1$b;->b:J

    sub-long/2addr p1, v3

    cmp-long p4, p1, v1

    if-gez p4, :cond_5

    iput-wide v3, p0, Lb4/b1$a;->e:J

    :cond_5
    invoke-virtual {p3, p0}, Lkotlinx/coroutines/internal/d0;->a(Lkotlinx/coroutines/internal/e0;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :try_start_5
    monitor-exit p3

    const/4 p1, 0x0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p3

    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :catchall_1
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final r(J)Z
    .locals 3

    iget-wide v0, p0, Lb4/b1$a;->e:J

    sub-long/2addr p1, v0

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-ltz v2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Delayed[nanos="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lb4/b1$a;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
