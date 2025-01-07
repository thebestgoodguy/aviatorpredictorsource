.class final Lkotlinx/coroutines/internal/c0$b;
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
        "Lb4/f2<",
        "*>;",
        "Ln3/g$b;",
        "Lb4/f2<",
        "*>;>;"
    }
.end annotation


# static fields
.field public static final e:Lkotlinx/coroutines/internal/c0$b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lkotlinx/coroutines/internal/c0$b;

    invoke-direct {v0}, Lkotlinx/coroutines/internal/c0$b;-><init>()V

    sput-object v0, Lkotlinx/coroutines/internal/c0$b;->e:Lkotlinx/coroutines/internal/c0$b;

    return-void
.end method

.method constructor <init>()V
    .locals 1

    const/4 v0, 0x2

    invoke-direct {p0, v0}, Lkotlin/jvm/internal/j;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final a(Lb4/f2;Ln3/g$b;)Lb4/f2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb4/f2<",
            "*>;",
            "Ln3/g$b;",
            ")",
            "Lb4/f2<",
            "*>;"
        }
    .end annotation

    if-eqz p1, :cond_0

    return-object p1

    :cond_0
    instance-of p1, p2, Lb4/f2;

    if-eqz p1, :cond_1

    check-cast p2, Lb4/f2;

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    return-object p2
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lb4/f2;

    check-cast p2, Ln3/g$b;

    invoke-virtual {p0, p1, p2}, Lkotlinx/coroutines/internal/c0$b;->a(Lb4/f2;Ln3/g$b;)Lb4/f2;

    move-result-object p1

    return-object p1
.end method
