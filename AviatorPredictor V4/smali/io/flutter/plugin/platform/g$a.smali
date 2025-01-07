.class Lio/flutter/plugin/platform/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/view/d$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/platform/g;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/g;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/g$a;->a:Lio/flutter/plugin/platform/g;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1d

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/g$a;->a:Lio/flutter/plugin/platform/g;

    invoke-static {v0}, Lio/flutter/plugin/platform/g;->a(Lio/flutter/plugin/platform/g;)Ljava/util/concurrent/atomic/AtomicLong;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicLong;->decrementAndGet()J

    :cond_0
    return-void
.end method
