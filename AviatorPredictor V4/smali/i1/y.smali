.class public final synthetic Li1/y;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Li1/l0;

.field public final synthetic b:Ll1/l;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Ll1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/y;->a:Li1/l0;

    iput-object p2, p0, Li1/y;->b:Ll1/l;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 2

    iget-object v0, p0, Li1/y;->a:Li1/l0;

    iget-object v1, p0, Li1/y;->b:Ll1/l;

    invoke-static {v0, v1}, Li1/l0;->q(Li1/l0;Ll1/l;)Ll1/i;

    move-result-object v0

    return-object v0
.end method
