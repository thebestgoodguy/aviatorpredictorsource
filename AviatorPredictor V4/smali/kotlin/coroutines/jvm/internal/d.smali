.class public abstract Lkotlin/coroutines/jvm/internal/d;
.super Lkotlin/coroutines/jvm/internal/a;
.source ""


# instance fields
.field private final _context:Ln3/g;

.field private transient intercepted:Ln3/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln3/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ln3/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-interface {p1}, Ln3/d;->getContext()Ln3/g;

    move-result-object v0

    :goto_0
    invoke-direct {p0, p1, v0}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ln3/d;Ln3/g;)V

    return-void
.end method

.method public constructor <init>(Ln3/d;Ln3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln3/d<",
            "Ljava/lang/Object;",
            ">;",
            "Ln3/g;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/a;-><init>(Ln3/d;)V

    iput-object p2, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Ln3/g;

    return-void
.end method


# virtual methods
.method public getContext()Ln3/g;
    .locals 1

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->_context:Ln3/g;

    invoke-static {v0}, Lkotlin/jvm/internal/i;->b(Ljava/lang/Object;)V

    return-object v0
.end method

.method public final intercepted()Ln3/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ln3/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Ln3/d;

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Ln3/g;

    move-result-object v0

    sget-object v1, Ln3/e;->d:Ln3/e$b;

    invoke-interface {v0, v1}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object v0

    check-cast v0, Ln3/e;

    if-nez v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    invoke-interface {v0, p0}, Ln3/e;->k(Ln3/d;)Ln3/d;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Ln3/d;

    :cond_1
    return-object v0
.end method

.method protected releaseIntercepted()V
    .locals 3

    iget-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Ln3/d;

    if-eqz v0, :cond_0

    if-eq v0, p0, :cond_0

    invoke-virtual {p0}, Lkotlin/coroutines/jvm/internal/d;->getContext()Ln3/g;

    move-result-object v1

    sget-object v2, Ln3/e;->d:Ln3/e$b;

    invoke-interface {v1, v2}, Ln3/g;->get(Ln3/g$c;)Ln3/g$b;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/i;->b(Ljava/lang/Object;)V

    check-cast v1, Ln3/e;

    invoke-interface {v1, v0}, Ln3/e;->n(Ln3/d;)V

    :cond_0
    sget-object v0, Lkotlin/coroutines/jvm/internal/c;->e:Lkotlin/coroutines/jvm/internal/c;

    iput-object v0, p0, Lkotlin/coroutines/jvm/internal/d;->intercepted:Ln3/d;

    return-void
.end method
