.class final Lkotlinx/coroutines/internal/t$a;
.super Lkotlin/jvm/internal/j;
.source ""

# interfaces
.implements Lu3/l;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/t;->a(Lu3/l;Ljava/lang/Object;Ln3/g;)Lu3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Lu3/l<",
        "Ljava/lang/Throwable;",
        "Lk3/s;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic e:Lu3/l;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lu3/l<",
            "TE;",
            "Lk3/s;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic f:Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TE;"
        }
    .end annotation
.end field

.field final synthetic g:Ln3/g;


# direct methods
.method constructor <init>(Lu3/l;Ljava/lang/Object;Ln3/g;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;TE;",
            "Ln3/g;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lkotlinx/coroutines/internal/t$a;->e:Lu3/l;

    iput-object p2, p0, Lkotlinx/coroutines/internal/t$a;->f:Ljava/lang/Object;

    iput-object p3, p0, Lkotlinx/coroutines/internal/t$a;->g:Ln3/g;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Throwable;)V
    .locals 2

    iget-object p1, p0, Lkotlinx/coroutines/internal/t$a;->e:Lu3/l;

    iget-object v0, p0, Lkotlinx/coroutines/internal/t$a;->f:Ljava/lang/Object;

    iget-object v1, p0, Lkotlinx/coroutines/internal/t$a;->g:Ln3/g;

    invoke-static {p1, v0, v1}, Lkotlinx/coroutines/internal/t;->b(Lu3/l;Ljava/lang/Object;Ln3/g;)V

    return-void
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Ljava/lang/Throwable;

    invoke-virtual {p0, p1}, Lkotlinx/coroutines/internal/t$a;->a(Ljava/lang/Throwable;)V

    sget-object p1, Lk3/s;->a:Lk3/s;

    return-object p1
.end method
