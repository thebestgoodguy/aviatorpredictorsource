.class Lio/flutter/plugin/platform/g$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/platform/g;->k(Landroid/view/View$OnFocusChangeListener;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Landroid/view/View$OnFocusChangeListener;

.field final synthetic f:Lio/flutter/plugin/platform/g;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/g;Landroid/view/View$OnFocusChangeListener;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/g$c;->f:Lio/flutter/plugin/platform/g;

    iput-object p2, p0, Lio/flutter/plugin/platform/g$c;->e:Landroid/view/View$OnFocusChangeListener;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onGlobalFocusChanged(Landroid/view/View;Landroid/view/View;)V
    .locals 1

    iget-object p1, p0, Lio/flutter/plugin/platform/g$c;->e:Landroid/view/View$OnFocusChangeListener;

    iget-object p2, p0, Lio/flutter/plugin/platform/g$c;->f:Lio/flutter/plugin/platform/g;

    invoke-static {p2}, Lz2/h;->c(Landroid/view/View;)Z

    move-result v0

    invoke-interface {p1, p2, v0}, Landroid/view/View$OnFocusChangeListener;->onFocusChange(Landroid/view/View;Z)V

    return-void
.end method
