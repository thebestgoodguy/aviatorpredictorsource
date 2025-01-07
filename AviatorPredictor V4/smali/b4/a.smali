.class public abstract Lb4/a;
.super Lb4/w1;
.source ""

# interfaces
.implements Ln3/d;
.implements Lb4/m0;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Lb4/w1;",
        "Ln3/d<",
        "TT;>;",
        "Lb4/m0;"
    }
.end annotation


# instance fields
.field private final f:Ln3/g;


# direct methods
.method public constructor <init>(Ln3/g;ZZ)V
    .locals 0

    invoke-direct {p0, p3}, Lb4/w1;-><init>(Z)V

    if-eqz p2, :cond_0

    sget-object p2, Lb4/p1;->a:Lb4/p1$b;

    invoke-interface {p1, p2}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object p2

    check-cast p2, Lb4/p1;

    invoke-virtual {p0, p2}, Lb4/w1;->S(Lb4/p1;)V

    :cond_0
    invoke-interface {p1, p0}, Ln3/g;->plus(Ln3/g;)Ln3/g;

    move-result-object p1

    iput-object p1, p0, Lb4/a;->f:Ln3/g;

    return-void
.end method


# virtual methods
.method protected C()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lb4/r0;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, " was cancelled"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final R(Ljava/lang/Throwable;)V
    .locals 1

    iget-object v0, p0, Lb4/a;->f:Ln3/g;

    invoke-static {v0, p1}, Lb4/i0;->a(Ln3/g;Ljava/lang/Throwable;)V

    return-void
.end method

.method public Y()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lb4/a;->f:Ln3/g;

    invoke-static {v0}, Lb4/f0;->b(Ln3/g;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-super {p0}, Lb4/w1;->Y()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const/16 v2, 0x22

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\":"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lb4/w1;->Y()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public c()Ln3/g;
    .locals 1

    iget-object v0, p0, Lb4/a;->f:Ln3/g;

    return-object v0
.end method

.method protected final d0(Ljava/lang/Object;)V
    .locals 1

    instance-of v0, p1, Lb4/z;

    if-eqz v0, :cond_0

    check-cast p1, Lb4/z;

    iget-object v0, p1, Lb4/z;->a:Ljava/lang/Throwable;

    invoke-virtual {p1}, Lb4/z;->a()Z

    move-result p1

    invoke-virtual {p0, v0, p1}, Lb4/a;->u0(Ljava/lang/Throwable;Z)V

    goto :goto_0

    :cond_0
    invoke-virtual {p0, p1}, Lb4/a;->v0(Ljava/lang/Object;)V

    :goto_0
    return-void
.end method

.method public e()Z
    .locals 1

    invoke-super {p0}, Lb4/w1;->e()Z

    move-result v0

    return v0
.end method

.method public final getContext()Ln3/g;
    .locals 1

    iget-object v0, p0, Lb4/a;->f:Ln3/g;

    return-object v0
.end method

.method public final resumeWith(Ljava/lang/Object;)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lb4/d0;->d(Ljava/lang/Object;Lu3/l;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, p1}, Lb4/w1;->W(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lb4/x1;->b:Lkotlinx/coroutines/internal/y;

    if-ne p1, v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, Lb4/a;->t0(Ljava/lang/Object;)V

    return-void
.end method

.method protected t0(Ljava/lang/Object;)V
    .locals 0

    invoke-virtual {p0, p1}, Lb4/w1;->x(Ljava/lang/Object;)V

    return-void
.end method

.method protected u0(Ljava/lang/Throwable;Z)V
    .locals 0

    return-void
.end method

.method protected v0(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    return-void
.end method

.method public final w0(Lb4/o0;Ljava/lang/Object;Lu3/p;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "Lb4/o0;",
            "TR;",
            "Lu3/p<",
            "-TR;-",
            "Ln3/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p1, p3, p2, p0}, Lb4/o0;->g(Lu3/p;Ljava/lang/Object;Ln3/d;)V

    return-void
.end method
