.class public final Lo3/c$a;
.super Lkotlin/coroutines/jvm/internal/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo3/c;->a(Lu3/p;Ljava/lang/Object;Ln3/d;)Ln3/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private e:I

.field final synthetic f:Ln3/d;

.field final synthetic g:Lu3/p;

.field final synthetic h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ln3/d;Lu3/p;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lo3/c$a;->f:Ln3/d;

    iput-object p2, p0, Lo3/c$a;->g:Lu3/p;

    iput-object p3, p0, Lo3/c$a;->h:Ljava/lang/Object;

    invoke-direct {p0, p1}, Lkotlin/coroutines/jvm/internal/j;-><init>(Ln3/d;)V

    return-void
.end method


# virtual methods
.method protected invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Lo3/c$a;->e:I

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_1

    if-ne v0, v2, :cond_0

    iput v1, p0, Lo3/c$a;->e:I

    invoke-static {p1}, Lk3/n;->b(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "This coroutine had already completed"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iput v2, p0, Lo3/c$a;->e:I

    invoke-static {p1}, Lk3/n;->b(Ljava/lang/Object;)V

    iget-object p1, p0, Lo3/c$a;->g:Lu3/p;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/n;->a(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lu3/p;

    iget-object v0, p0, Lo3/c$a;->h:Ljava/lang/Object;

    invoke-interface {p1, v0, p0}, Lu3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
