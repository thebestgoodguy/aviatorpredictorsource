.class Lio/flutter/plugin/platform/o$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/o$b;->onDraw()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/flutter/plugin/platform/o$b;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/o$b;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/o$b$a;->e:Lio/flutter/plugin/platform/o$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/o$b$a;->e:Lio/flutter/plugin/platform/o$b;

    iget-object v0, v0, Lio/flutter/plugin/platform/o$b;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lio/flutter/plugin/platform/o$b$a;->e:Lio/flutter/plugin/platform/o$b;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnDrawListener(Landroid/view/ViewTreeObserver$OnDrawListener;)V

    return-void
.end method
