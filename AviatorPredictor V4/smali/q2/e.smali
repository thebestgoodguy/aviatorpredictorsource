.class public Lq2/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lr2/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lr2/a<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lf2/a;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lr2/a;

    sget-object v1, Lr2/r;->b:Lr2/r;

    const-string v2, "flutter/lifecycle"

    invoke-direct {v0, p1, v2, v1}, Lr2/a;-><init>(Lr2/b;Ljava/lang/String;Lr2/h;)V

    iput-object v0, p0, Lq2/e;->a:Lr2/a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.detached message."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/e;->a:Lr2/a;

    const-string v1, "AppLifecycleState.detached"

    invoke-virtual {v0, v1}, Lr2/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public b()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.inactive message."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/e;->a:Lr2/a;

    const-string v1, "AppLifecycleState.inactive"

    invoke-virtual {v0, v1}, Lr2/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public c()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.paused message."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/e;->a:Lr2/a;

    const-string v1, "AppLifecycleState.paused"

    invoke-virtual {v0, v1}, Lr2/a;->c(Ljava/lang/Object;)V

    return-void
.end method

.method public d()V
    .locals 2

    const-string v0, "LifecycleChannel"

    const-string v1, "Sending AppLifecycleState.resumed message."

    invoke-static {v0, v1}, Le2/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v0, p0, Lq2/e;->a:Lr2/a;

    const-string v1, "AppLifecycleState.resumed"

    invoke-virtual {v0, v1}, Lr2/a;->c(Ljava/lang/Object;)V

    return-void
.end method
