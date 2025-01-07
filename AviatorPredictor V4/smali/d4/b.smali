.class public final Ld4/b;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lkotlinx/coroutines/internal/y;

.field public static final b:Lkotlinx/coroutines/internal/y;

.field public static final c:Lkotlinx/coroutines/internal/y;

.field public static final d:Lkotlinx/coroutines/internal/y;

.field public static final e:Lkotlinx/coroutines/internal/y;

.field public static final f:Lkotlinx/coroutines/internal/y;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "EMPTY"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->a:Lkotlinx/coroutines/internal/y;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "OFFER_SUCCESS"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->b:Lkotlinx/coroutines/internal/y;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "OFFER_FAILED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->c:Lkotlinx/coroutines/internal/y;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "POLL_FAILED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->d:Lkotlinx/coroutines/internal/y;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "ENQUEUE_FAILED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->e:Lkotlinx/coroutines/internal/y;

    new-instance v0, Lkotlinx/coroutines/internal/y;

    const-string v1, "ON_CLOSE_HANDLER_INVOKED"

    invoke-direct {v0, v1}, Lkotlinx/coroutines/internal/y;-><init>(Ljava/lang/String;)V

    sput-object v0, Ld4/b;->f:Lkotlinx/coroutines/internal/y;

    return-void
.end method
