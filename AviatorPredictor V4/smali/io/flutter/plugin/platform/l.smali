.class public final synthetic Lio/flutter/plugin/platform/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field public final synthetic a:Lio/flutter/plugin/platform/n$a;

.field public final synthetic b:Lq2/k$d;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/n$a;Lq2/k$d;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/l;->a:Lio/flutter/plugin/platform/n$a;

    iput-object p2, p0, Lio/flutter/plugin/platform/l;->b:Lq2/k$d;

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/platform/l;->a:Lio/flutter/plugin/platform/n$a;

    iget-object v1, p0, Lio/flutter/plugin/platform/l;->b:Lq2/k$d;

    invoke-static {v0, v1, p1, p2}, Lio/flutter/plugin/platform/n$a;->l(Lio/flutter/plugin/platform/n$a;Lq2/k$d;Landroid/view/View;Z)V

    return-void
.end method
