.class public final synthetic Li1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Li1/l0;

.field public final synthetic b:Li1/x0;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Li1/x0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/x;->a:Li1/l0;

    iput-object p2, p0, Li1/x;->b:Li1/x0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li1/x;->a:Li1/l0;

    iget-object v1, p0, Li1/x;->b:Li1/x0;

    invoke-static {v0, v1}, Li1/l0;->o(Li1/l0;Li1/x0;)Li1/u1;

    move-result-object v0

    return-object v0
.end method
