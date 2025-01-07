.class Lio/flutter/plugin/platform/n$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq2/k$g;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugin/platform/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/platform/n;


# direct methods
.method constructor <init>(Lio/flutter/plugin/platform/n;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic j(Lio/flutter/plugin/platform/n$a;ILandroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugin/platform/n$a;->o(ILandroid/view/View;Z)V

    return-void
.end method

.method public static synthetic k(Lio/flutter/plugin/platform/n$a;Lio/flutter/plugin/platform/o;Lq2/k$b;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/flutter/plugin/platform/n$a;->p(Lio/flutter/plugin/platform/o;Lq2/k$b;)V

    return-void
.end method

.method public static synthetic l(Lio/flutter/plugin/platform/n$a;Lq2/k$d;Landroid/view/View;Z)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lio/flutter/plugin/platform/n$a;->n(Lq2/k$d;Landroid/view/View;Z)V

    return-void
.end method

.method private m(I)V
    .locals 4

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    if-lt v0, p1, :cond_0

    return-void

    :cond_0
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to use platform views with API "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", required API level is: "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method private synthetic n(Lq2/k$d;Landroid/view/View;Z)V
    .locals 0

    if-eqz p3, :cond_0

    iget-object p2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p2}, Lio/flutter/plugin/platform/n;->p(Lio/flutter/plugin/platform/n;)Lq2/k;

    move-result-object p2

    iget p1, p1, Lq2/k$d;->a:I

    invoke-virtual {p2, p1}, Lq2/k;->d(I)V

    :cond_0
    return-void
.end method

.method private synthetic o(ILandroid/view/View;Z)V
    .locals 0

    iget-object p2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lio/flutter/plugin/platform/n;->p(Lio/flutter/plugin/platform/n;)Lq2/k;

    move-result-object p2

    invoke-virtual {p2, p1}, Lq2/k;->d(I)V

    goto :goto_0

    :cond_0
    invoke-static {p2}, Lio/flutter/plugin/platform/n;->q(Lio/flutter/plugin/platform/n;)Lio/flutter/plugin/editing/f;

    move-result-object p2

    if-eqz p2, :cond_1

    iget-object p2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p2}, Lio/flutter/plugin/platform/n;->q(Lio/flutter/plugin/platform/n;)Lio/flutter/plugin/editing/f;

    move-result-object p2

    invoke-virtual {p2, p1}, Lio/flutter/plugin/editing/f;->l(I)V

    :cond_1
    :goto_0
    return-void
.end method

.method private synthetic p(Lio/flutter/plugin/platform/o;Lq2/k$b;)V
    .locals 5

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0, p1}, Lio/flutter/plugin/platform/n;->o(Lio/flutter/plugin/platform/n;Lio/flutter/plugin/platform/o;)V

    new-instance v0, Lq2/k$c;

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {p1}, Lio/flutter/plugin/platform/o;->d()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/n;->m(Lio/flutter/plugin/platform/n;D)I

    move-result v1

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {p1}, Lio/flutter/plugin/platform/o;->c()I

    move-result p1

    int-to-double v3, p1

    invoke-static {v2, v3, v4}, Lio/flutter/plugin/platform/n;->m(Lio/flutter/plugin/platform/n;D)I

    move-result p1

    invoke-direct {v0, v1, p1}, Lq2/k$c;-><init>(II)V

    invoke-interface {p2, v0}, Lq2/k$b;->a(Lq2/k$c;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v0

    const-string v1, "PlatformViewsController"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v0, v0, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/o;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->e()Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/c;

    if-nez v0, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing focus on an unknown view with id: "

    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Clearing focus on a null view with id: "

    goto :goto_0

    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->clearFocus()V

    return-void
.end method

.method public b(Z)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0, p1}, Lio/flutter/plugin/platform/n;->n(Lio/flutter/plugin/platform/n;Z)Z

    return-void
.end method

.method public c(IDD)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/g;

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "Setting offset for unknown platform view with id: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlatformViewsController"

    invoke-static {p2, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p1, p2, p3}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result p1

    iget-object p2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p2, p4, p5}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result p2

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p3

    check-cast p3, Landroid/widget/FrameLayout$LayoutParams;

    iput p1, p3, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p2, p3, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v0, p3}, Lio/flutter/plugin/platform/g;->j(Landroid/widget/FrameLayout$LayoutParams;)V

    return-void
.end method

.method public d(II)V
    .locals 3

    invoke-static {p2}, Lio/flutter/plugin/platform/n;->g(I)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v0

    const-string v1, "PlatformViewsController"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v0, v0, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/o;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->e()Landroid/view/View;

    move-result-object v0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/c;

    if-nez v0, :cond_1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting direction to an unknown view with id: "

    :goto_0
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v0

    :goto_1
    if-nez v0, :cond_2

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Setting direction to a null view with id: "

    goto :goto_0

    :cond_2
    invoke-virtual {v0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    return-void

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to set unknown direction value: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "(view id: "

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public e(Lq2/k$f;)V
    .locals 4

    iget v0, p1, Lq2/k$f;->a:I

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v1

    iget v1, v1, Landroid/util/DisplayMetrics;->density:F

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v2, v0}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v2, v2, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/o;

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    const/4 v3, 0x1

    invoke-virtual {v2, v1, p1, v3}, Lio/flutter/plugin/platform/n;->h0(FLq2/k$f;Z)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/o;->b(Landroid/view/MotionEvent;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugin/platform/c;

    const-string v3, "PlatformViewsController"

    if-nez v2, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending touch to an unknown view with id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    invoke-interface {v2}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v2

    if-nez v2, :cond_2

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Sending touch to a null view with id: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v3, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    const/4 v3, 0x0

    invoke-virtual {v0, v1, p1, v3}, Lio/flutter/plugin/platform/n;->h0(FLq2/k$f;Z)Landroid/view/MotionEvent;

    move-result-object p1

    invoke-virtual {v2, p1}, Landroid/view/View;->dispatchTouchEvent(Landroid/view/MotionEvent;)Z

    return-void
.end method

.method public f(I)V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/c;

    const-string v1, "PlatformViewsController"

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Disposing unknown platform view with id: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->remove(I)V

    :try_start_0
    invoke-interface {v0}, Lio/flutter/plugin/platform/c;->d()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    const-string v2, "Disposing platform view threw an exception"

    invoke-static {v1, v2, v0}, Le2/b;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v0, p1}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v0, v0, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/o;

    invoke-virtual {v0}, Lio/flutter/plugin/platform/o;->e()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v1, v1, Lio/flutter/plugin/platform/n;->j:Ljava/util/HashMap;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v0, v0, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/flutter/plugin/platform/g;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    invoke-virtual {v0}, Lio/flutter/plugin/platform/g;->h()V

    invoke-virtual {v0}, Lio/flutter/plugin/platform/g;->o()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_3

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_3
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void

    :cond_4
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->k(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/a;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->removeAllViews()V

    invoke-virtual {v0}, Li2/a;->b()V

    invoke-virtual {v0}, Landroid/widget/FrameLayout;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_5

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_5
    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->k(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/util/SparseArray;->remove(I)V

    :cond_6
    return-void
.end method

.method public g(Lq2/k$d;)J
    .locals 12

    iget v0, p1, Lq2/k$d;->a:I

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_d

    iget v1, p1, Lq2/k$d;->g:I

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->g(I)Z

    move-result v1

    if-eqz v1, :cond_c

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->u(Lio/flutter/plugin/platform/n;)Lio/flutter/view/d;

    move-result-object v1

    if-eqz v1, :cond_b

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->v(Lio/flutter/plugin/platform/n;)Lio/flutter/embedding/android/k;

    move-result-object v1

    if-eqz v1, :cond_a

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->h(Lio/flutter/plugin/platform/n;)Lio/flutter/plugin/platform/f;

    move-result-object v1

    iget-object v2, p1, Lq2/k$d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugin/platform/f;->a(Ljava/lang/String;)Lio/flutter/plugin/platform/d;

    move-result-object v1

    if-eqz v1, :cond_9

    const/4 v2, 0x0

    iget-object v3, p1, Lq2/k$d;->h:Ljava/nio/ByteBuffer;

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lio/flutter/plugin/platform/d;->b()Lr2/h;

    move-result-object v2

    iget-object v3, p1, Lq2/k$d;->h:Ljava/nio/ByteBuffer;

    invoke-interface {v2, v3}, Lr2/h;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    move-object v10, v2

    new-instance v2, Landroid/content/MutableContextWrapper;

    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Landroid/content/MutableContextWrapper;-><init>(Landroid/content/Context;)V

    invoke-virtual {v1, v2, v0, v10}, Lio/flutter/plugin/platform/d;->a(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/c;

    move-result-object v5

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v1

    invoke-virtual {v1, v0, v5}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    invoke-interface {v5}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    if-nez v2, :cond_7

    iget v2, p1, Lq2/k$d;->g:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v3, p1, Lq2/k$d;->c:D

    invoke-static {v2, v3, v4}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result v7

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v3, p1, Lq2/k$d;->d:D

    invoke-static {v2, v3, v4}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result v8

    invoke-static {}, Lio/flutter/plugin/platform/n;->x()[Ljava/lang/Class;

    move-result-object v2

    invoke-static {v1, v2}, Lz2/h;->f(Landroid/view/View;[Ljava/lang/Class;)Z

    move-result v2

    const/16 v3, 0x17

    if-nez v2, :cond_2

    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    if-ge v2, v3, :cond_1

    goto :goto_0

    :cond_1
    const/4 v2, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 v2, 0x1

    :goto_1
    iget-object v4, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v4}, Lio/flutter/plugin/platform/n;->y(Lio/flutter/plugin/platform/n;)Z

    move-result v4

    const-string v6, "PlatformViewsController"

    if-nez v4, :cond_5

    if-eqz v2, :cond_5

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hosting view in a virtual display for platform view: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v6, v0}, Le2/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/n$a;->m(I)V

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->u(Lio/flutter/plugin/platform/n;)Lio/flutter/view/d;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/view/d;->a()Lio/flutter/view/d$c;

    move-result-object v0

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v3

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->i(Lio/flutter/plugin/platform/n;)Lio/flutter/plugin/platform/a;

    move-result-object v4

    iget v9, p1, Lq2/k$d;->a:I

    new-instance v11, Lio/flutter/plugin/platform/l;

    invoke-direct {v11, p0, p1}, Lio/flutter/plugin/platform/l;-><init>(Lio/flutter/plugin/platform/n$a;Lq2/k$d;)V

    move-object v6, v0

    invoke-static/range {v3 .. v11}, Lio/flutter/plugin/platform/o;->a(Landroid/content/Context;Lio/flutter/plugin/platform/a;Lio/flutter/plugin/platform/c;Lio/flutter/view/d$c;IIILjava/lang/Object;Landroid/view/View$OnFocusChangeListener;)Lio/flutter/plugin/platform/o;

    move-result-object v2

    if-eqz v2, :cond_4

    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->v(Lio/flutter/plugin/platform/n;)Lio/flutter/embedding/android/k;

    move-result-object v3

    if-eqz v3, :cond_3

    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->v(Lio/flutter/plugin/platform/n;)Lio/flutter/embedding/android/k;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/flutter/plugin/platform/o;->f(Landroid/view/View;)V

    :cond_3
    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v3, v3, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    iget p1, p1, Lq2/k$d;->a:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v3, p1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object p1, p1, Lio/flutter/plugin/platform/n;->j:Ljava/util/HashMap;

    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {p1, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {v0}, Lio/flutter/view/d$c;->a()J

    move-result-wide v0

    return-wide v0

    :cond_4
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Failed creating virtual display for a "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v2, p1, Lq2/k$d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " with id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lq2/k$d;->a:I

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_5
    invoke-direct {p0, v3}, Lio/flutter/plugin/platform/n$a;->m(I)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Hosting view in view hierarchy for platform view: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v6, v2}, Le2/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->y(Lio/flutter/plugin/platform/n;)Z

    move-result v2

    if-eqz v2, :cond_6

    new-instance v2, Lio/flutter/plugin/platform/g;

    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v2, v3}, Lio/flutter/plugin/platform/g;-><init>(Landroid/content/Context;)V

    const-wide/16 v3, -0x1

    goto :goto_2

    :cond_6
    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->u(Lio/flutter/plugin/platform/n;)Lio/flutter/view/d;

    move-result-object v2

    invoke-interface {v2}, Lio/flutter/view/d;->a()Lio/flutter/view/d$c;

    move-result-object v2

    new-instance v3, Lio/flutter/plugin/platform/g;

    iget-object v4, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v4}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v3, v4, v2}, Lio/flutter/plugin/platform/g;-><init>(Landroid/content/Context;Lio/flutter/view/d$c;)V

    invoke-interface {v2}, Lio/flutter/view/d$c;->a()J

    move-result-wide v4

    move-object v2, v3

    move-wide v3, v4

    :goto_2
    iget-object v5, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v5}, Lio/flutter/plugin/platform/n;->j(Lio/flutter/plugin/platform/n;)Lio/flutter/embedding/android/a;

    move-result-object v5

    invoke-virtual {v2, v5}, Lio/flutter/plugin/platform/g;->m(Lio/flutter/embedding/android/a;)V

    invoke-virtual {v2, v7, v8}, Lio/flutter/plugin/platform/g;->i(II)V

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    iget-object v6, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v9, p1, Lq2/k$d;->e:D

    invoke-static {v6, v9, v10}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result v6

    iget-object v9, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v10, p1, Lq2/k$d;->f:D

    invoke-static {v9, v10, v11}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result p1

    iput v6, v5, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    iput p1, v5, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    invoke-virtual {v2, v5}, Lio/flutter/plugin/platform/g;->j(Landroid/widget/FrameLayout$LayoutParams;)V

    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {p1, v7, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v1, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p1, 0x4

    invoke-virtual {v1, p1}, Landroid/view/View;->setImportantForAccessibility(I)V

    invoke-virtual {v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    new-instance p1, Lio/flutter/plugin/platform/k;

    invoke-direct {p1, p0, v0}, Lio/flutter/plugin/platform/k;-><init>(Lio/flutter/plugin/platform/n$a;I)V

    invoke-virtual {v2, p1}, Lio/flutter/plugin/platform/g;->k(Landroid/view/View$OnFocusChangeListener;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p1}, Lio/flutter/plugin/platform/n;->v(Lio/flutter/plugin/platform/n;)Lio/flutter/embedding/android/k;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    iget-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p1}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v0, v2}, Landroid/util/SparseArray;->append(ILjava/lang/Object;)V

    return-wide v3

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "The Android view returned from PlatformView#getView() was already added to a parent view."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "PlatformView#getView() returned null, but an Android view reference was expected."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to create a platform view of unregistered type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lq2/k$d;->b:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Flutter view is null. This means the platform views controller doesn\'t have an attached view, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Texture registry is null. This means that platform views controller was detached, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_c
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to create a view with unknown direction value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lq2/k$d;->g:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "(view id: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to create an already created platform view, view id: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public h(Lq2/k$e;Lq2/k$b;)V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v1, p1, Lq2/k$e;->b:D

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-wide v2, p1, Lq2/k$e;->c:D

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/n;->w(Lio/flutter/plugin/platform/n;D)I

    move-result v1

    iget p1, p1, Lq2/k$e;->a:I

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v2, p1}, Lio/flutter/plugin/platform/n;->c(I)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    iget-object v2, v2, Lio/flutter/plugin/platform/n;->i:Ljava/util/HashMap;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/flutter/plugin/platform/o;

    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2, p1}, Lio/flutter/plugin/platform/n;->l(Lio/flutter/plugin/platform/n;Lio/flutter/plugin/platform/o;)V

    new-instance v2, Lio/flutter/plugin/platform/m;

    invoke-direct {v2, p0, p1, p2}, Lio/flutter/plugin/platform/m;-><init>(Lio/flutter/plugin/platform/n$a;Lio/flutter/plugin/platform/o;Lq2/k$b;)V

    invoke-virtual {p1, v0, v1, v2}, Lio/flutter/plugin/platform/o;->i(IILjava/lang/Runnable;)V

    return-void

    :cond_0
    iget-object v2, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v2}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v2

    invoke-virtual {v2, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/plugin/platform/c;

    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->t(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object v3

    invoke-virtual {v3, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/flutter/plugin/platform/g;

    if-eqz v2, :cond_5

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {v3}, Lio/flutter/plugin/platform/g;->e()I

    move-result p1

    if-gt v0, p1, :cond_2

    invoke-virtual {v3}, Lio/flutter/plugin/platform/g;->d()I

    move-result p1

    if-le v1, p1, :cond_3

    :cond_2
    invoke-virtual {v3, v0, v1}, Lio/flutter/plugin/platform/g;->i(II)V

    :cond_3
    invoke-virtual {v3}, Landroid/widget/FrameLayout;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    iput v0, p1, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, p1, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {v3, p1}, Landroid/widget/FrameLayout;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-interface {v2}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    iput v0, v2, Landroid/view/ViewGroup$LayoutParams;->width:I

    iput v1, v2, Landroid/view/ViewGroup$LayoutParams;->height:I

    invoke-virtual {p1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    new-instance p1, Lq2/k$c;

    iget-object v0, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v3}, Lio/flutter/plugin/platform/g;->e()I

    move-result v1

    int-to-double v1, v1

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/n;->m(Lio/flutter/plugin/platform/n;D)I

    move-result v0

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-virtual {v3}, Lio/flutter/plugin/platform/g;->d()I

    move-result v2

    int-to-double v2, v2

    invoke-static {v1, v2, v3}, Lio/flutter/plugin/platform/n;->m(Lio/flutter/plugin/platform/n;D)I

    move-result v1

    invoke-direct {p1, v0, v1}, Lq2/k$c;-><init>(II)V

    invoke-interface {p2, p1}, Lq2/k$b;->a(Lq2/k$c;)V

    return-void

    :cond_5
    :goto_0
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Resizing unknown platform view with id: "

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "PlatformViewsController"

    invoke-static {p2, p1}, Le2/b;->b(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public i(Lq2/k$d;)V
    .locals 4

    const/16 v0, 0x13

    invoke-direct {p0, v0}, Lio/flutter/plugin/platform/n$a;->m(I)V

    iget v0, p1, Lq2/k$d;->a:I

    iget v1, p1, Lq2/k$d;->g:I

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->g(I)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v1}, Lio/flutter/plugin/platform/n;->h(Lio/flutter/plugin/platform/n;)Lio/flutter/plugin/platform/f;

    move-result-object v1

    iget-object v2, p1, Lq2/k$d;->b:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lio/flutter/plugin/platform/f;->a(Ljava/lang/String;)Lio/flutter/plugin/platform/d;

    move-result-object v1

    if-eqz v1, :cond_1

    const/4 v2, 0x0

    iget-object v3, p1, Lq2/k$d;->h:Ljava/nio/ByteBuffer;

    if-eqz v3, :cond_0

    invoke-virtual {v1}, Lio/flutter/plugin/platform/d;->b()Lr2/h;

    move-result-object v2

    iget-object v3, p1, Lq2/k$d;->h:Ljava/nio/ByteBuffer;

    invoke-interface {v2, v3}, Lr2/h;->a(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v2

    :cond_0
    iget-object v3, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {v3}, Lio/flutter/plugin/platform/n;->r(Lio/flutter/plugin/platform/n;)Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v1, v3, v0, v2}, Lio/flutter/plugin/platform/d;->a(Landroid/content/Context;ILjava/lang/Object;)Lio/flutter/plugin/platform/c;

    move-result-object v1

    invoke-interface {v1}, Lio/flutter/plugin/platform/c;->f()Landroid/view/View;

    move-result-object v2

    iget p1, p1, Lq2/k$d;->g:I

    invoke-virtual {v2, p1}, Landroid/view/View;->setLayoutDirection(I)V

    iget-object p1, p0, Lio/flutter/plugin/platform/n$a;->a:Lio/flutter/plugin/platform/n;

    invoke-static {p1}, Lio/flutter/plugin/platform/n;->s(Lio/flutter/plugin/platform/n;)Landroid/util/SparseArray;

    move-result-object p1

    invoke-virtual {p1, v0, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Using hybrid composition for platform view: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PlatformViewsController"

    invoke-static {v0, p1}, Le2/b;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Trying to create a platform view of unregistered type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p1, Lq2/k$d;->b:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Trying to create a view with unknown direction value: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p1, Lq2/k$d;->g:I

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "(view id: "

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ")"

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method
