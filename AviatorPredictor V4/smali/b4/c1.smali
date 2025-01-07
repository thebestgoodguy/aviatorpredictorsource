.class public abstract Lb4/c1;
.super Lb4/a1;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb4/a1;-><init>()V

    return-void
.end method


# virtual methods
.method protected abstract k0()Ljava/lang/Thread;
.end method

.method protected final l0(JLb4/b1$a;)V
    .locals 1

    invoke-static {}, Lb4/q0;->a()Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object v0, Lb4/s0;->k:Lb4/s0;

    if-eq p0, v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    invoke-direct {p1}, Ljava/lang/AssertionError;-><init>()V

    throw p1

    :cond_2
    :goto_1
    sget-object v0, Lb4/s0;->k:Lb4/s0;

    invoke-virtual {v0, p1, p2, p3}, Lb4/b1;->x0(JLb4/b1$a;)V

    return-void
.end method

.method protected final m0()V
    .locals 2

    invoke-virtual {p0}, Lb4/c1;->k0()Ljava/lang/Thread;

    move-result-object v0

    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v1

    if-eq v1, v0, :cond_0

    invoke-static {}, Lb4/c;->a()Lb4/b;

    invoke-static {v0}, Ljava/util/concurrent/locks/LockSupport;->unpark(Ljava/lang/Thread;)V

    :cond_0
    return-void
.end method
