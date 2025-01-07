.class Ld4/a$b;
.super Ld4/o;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld4/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ld4/o<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final h:Ld4/a$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ld4/a$a<",
            "TE;>;"
        }
    .end annotation
.end field

.field public final i:Lb4/k;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb4/k<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ld4/a$a;Lb4/k;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld4/a$a<",
            "TE;>;",
            "Lb4/k<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ld4/o;-><init>()V

    iput-object p1, p0, Ld4/a$b;->h:Ld4/a$a;

    iput-object p2, p0, Ld4/a$b;->i:Lb4/k;

    return-void
.end method


# virtual methods
.method public A(Ljava/lang/Object;)Lu3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Lu3/l<",
            "Ljava/lang/Throwable;",
            "Lk3/s;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Ld4/a$b;->h:Ld4/a$a;

    iget-object v0, v0, Ld4/a$a;->a:Ld4/a;

    iget-object v0, v0, Ld4/c;->b:Lu3/l;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Ld4/a$b;->i:Lb4/k;

    invoke-interface {v1}, Ln3/d;->getContext()Ln3/g;

    move-result-object v1

    invoke-static {v0, p1, v1}, Lkotlinx/coroutines/internal/t;->a(Lu3/l;Ljava/lang/Object;Ln3/g;)Lu3/l;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public b(Ljava/lang/Object;Lkotlinx/coroutines/internal/n$b;)Lkotlinx/coroutines/internal/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;",
            "Lkotlinx/coroutines/internal/n$b;",
            ")",
            "Lkotlinx/coroutines/internal/y;"
        }
    .end annotation

    iget-object p2, p0, Ld4/a$b;->i:Lb4/k;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Ld4/a$b;->A(Ljava/lang/Object;)Lu3/l;

    move-result-object p1

    const/4 v1, 0x0

    invoke-interface {p2, v0, v1, p1}, Lb4/k;->o(Ljava/lang/Object;Ljava/lang/Object;Lu3/l;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    invoke-static {}, Lb4/q0;->a()Z

    move-result p2

    if-eqz p2, :cond_3

    sget-object p2, Lb4/n;->a:Lkotlinx/coroutines/internal/y;

    if-ne p1, p2, :cond_1

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
    sget-object p1, Lb4/n;->a:Lkotlinx/coroutines/internal/y;

    return-object p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    iget-object v0, p0, Ld4/a$b;->h:Ld4/a$a;

    invoke-virtual {v0, p1}, Ld4/a$a;->e(Ljava/lang/Object;)V

    iget-object p1, p0, Ld4/a$b;->i:Lb4/k;

    sget-object v0, Lb4/n;->a:Lkotlinx/coroutines/internal/y;

    invoke-interface {p1, v0}, Lb4/k;->m(Ljava/lang/Object;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    invoke-static {p0}, Lb4/r0;->b(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "ReceiveHasNext@"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public z(Ld4/j;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ld4/j<",
            "*>;)V"
        }
    .end annotation

    iget-object v0, p1, Ld4/j;->h:Ljava/lang/Throwable;

    if-nez v0, :cond_0

    iget-object v0, p0, Ld4/a$b;->i:Lb4/k;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {v0, v1, v3, v2, v3}, Lb4/k$a;->a(Lb4/k;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Ld4/a$b;->i:Lb4/k;

    invoke-virtual {p1}, Ld4/j;->E()Ljava/lang/Throwable;

    move-result-object v1

    invoke-interface {v0, v1}, Lb4/k;->j(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object v0

    :goto_0
    if-eqz v0, :cond_1

    iget-object v1, p0, Ld4/a$b;->h:Ld4/a$a;

    invoke-virtual {v1, p1}, Ld4/a$a;->e(Ljava/lang/Object;)V

    iget-object p1, p0, Ld4/a$b;->i:Lb4/k;

    invoke-interface {p1, v0}, Lb4/k;->m(Ljava/lang/Object;)V

    :cond_1
    return-void
.end method
