.class public final synthetic Li1/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Li1/l0;

.field public final synthetic f:Lg1/j;


# direct methods
.method public synthetic constructor <init>(Li1/l0;Lg1/j;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/g0;->e:Li1/l0;

    iput-object p2, p0, Li1/g0;->f:Lg1/j;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/g0;->e:Li1/l0;

    iget-object v1, p0, Li1/g0;->f:Lg1/j;

    invoke-static {v0, v1}, Li1/l0;->f(Li1/l0;Lg1/j;)V

    return-void
.end method
