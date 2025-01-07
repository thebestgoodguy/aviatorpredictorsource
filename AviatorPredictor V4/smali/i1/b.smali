.class public final synthetic Li1/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Landroidx/fragment/app/d;

.field public final synthetic f:Ljava/lang/Runnable;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/d;Ljava/lang/Runnable;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/b;->e:Landroidx/fragment/app/d;

    iput-object p2, p0, Li1/b;->f:Ljava/lang/Runnable;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Li1/b;->e:Landroidx/fragment/app/d;

    iget-object v1, p0, Li1/b;->f:Ljava/lang/Runnable;

    invoke-static {v0, v1}, Li1/d;->b(Landroidx/fragment/app/d;Ljava/lang/Runnable;)V

    return-void
.end method
