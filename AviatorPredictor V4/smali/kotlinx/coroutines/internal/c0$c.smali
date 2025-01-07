.class final Lkotlinx/coroutines/internal/c0$c;
.super Lkotlin/jvm/internal/j;
.source ""

# interfaces
.implements Lu3/p;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkotlinx/coroutines/internal/c0;-><clinit>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lkotlin/jvm/internal/j;",
        "Lu3/p<",
        "Lkotlinx/coroutines/internal/f0;",
        "Ln3/g$b;",
        "Lkotlinx/coroutines/internal/f0;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Lkotlinx/coroutines/internal/c0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/c0$c;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/c0$c;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/c0$c;->e:Lkotlinx/coroutines/internal/c0$c;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lkotlinx/coroutines/internal/f0;Ln3/g$b;)Lkotlinx/coroutines/internal/f0;
    .locals 1

    instance-of v0, p2, Lb4/f2;

    if-eqz v0, :cond_0

    check-cast p2, Lb4/f2;

    iget-object v0, p1, Lkotlinx/coroutines/internal/f0;->a:Ln3/g;

    invoke-interface {p2, v0}, Lb4/f2;->d(Ln3/g;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lkotlinx/coroutines/internal/f0;->a(Lb4/f2;Ljava/lang/Object;)V

    :cond_0
    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lkotlinx/coroutines/internal/f0;

    check-cast p2, Ln3/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/c0$c;->a(Lkotlinx/coroutines/internal/f0;Ln3/g$b;)Lkotlinx/coroutines/internal/f0;

    move-result-object p1

    return-object p1
.end method
