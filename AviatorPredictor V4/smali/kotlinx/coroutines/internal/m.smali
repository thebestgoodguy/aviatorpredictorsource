.class public final Lkotlinx/coroutines/internal/m;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final a:Ljava/lang/Object;

.field private static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "CONDITION_FALSE"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/m;->a:Ljava/lang/Object;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "LIST_EMPTY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Lkotlinx/coroutines/internal/m;->b:Ljava/lang/Object;

    return-void
.end method

.method public static final a()Ljava/lang/Object;
    .locals 1

    sget-object v0, Lkotlinx/coroutines/internal/m;->a:Ljava/lang/Object;

    return-object v0
.end method

.method public static final b(Ljava/lang/Object;)Lkotlinx/coroutines/internal/n;
    .locals 1

    instance-of v0, p0, Lkotlinx/coroutines/internal/v;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lkotlinx/coroutines/internal/v;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-nez v0, :cond_1

    check-cast p0, Lkotlinx/coroutines/internal/n;

    goto :goto_1

    :cond_1
    iget-object p0, v0, Lkotlinx/coroutines/internal/v;->a:Lkotlinx/coroutines/internal/n;

    :goto_1
    return-object p0
.end method
