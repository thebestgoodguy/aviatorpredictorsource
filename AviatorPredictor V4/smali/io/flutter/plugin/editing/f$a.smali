.class Lio/flutter/plugin/editing/f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lq2/p$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/flutter/plugin/editing/f;-><init>(Landroid/view/View;Lq2/p;Lio/flutter/plugin/platform/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/flutter/plugin/editing/f;


# direct methods
.method constructor <init>(Lio/flutter/plugin/editing/f;)V
    .locals 0

    iput-object p1, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/f;->B(Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0}, Lio/flutter/plugin/editing/f;->m()V

    return-void
.end method

.method public c()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->b(Lio/flutter/plugin/editing/f;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/flutter/plugin/editing/f;->F(Landroid/view/View;)V

    return-void
.end method

.method public d(IZ)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0, p1, p2}, Lio/flutter/plugin/editing/f;->h(Lio/flutter/plugin/editing/f;IZ)V

    return-void
.end method

.method public e(DD[D)V
    .locals 6

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p5

    invoke-static/range {v0 .. v5}, Lio/flutter/plugin/editing/f;->i(Lio/flutter/plugin/editing/f;DD[D)V

    return-void
.end method

.method public f()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->f(Lio/flutter/plugin/editing/f;)V

    return-void
.end method

.method public g(Lq2/p$e;)V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->b(Lio/flutter/plugin/editing/f;)Landroid/view/View;

    move-result-object v1

    invoke-virtual {v0, v1, p1}, Lio/flutter/plugin/editing/f;->E(Landroid/view/View;Lq2/p$e;)V

    return-void
.end method

.method public h(ILq2/p$b;)V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-virtual {v0, p1, p2}, Lio/flutter/plugin/editing/f;->D(ILq2/p$b;)V

    return-void
.end method

.method public i(Z)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1a

    if-lt v0, v1, :cond_2

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->g(Lio/flutter/plugin/editing/f;)Landroid/view/autofill/AutofillManager;

    move-result-object v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {p1}, Lio/flutter/plugin/editing/f;->g(Lio/flutter/plugin/editing/f;)Landroid/view/autofill/AutofillManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/autofill/AutofillManager;->commit()V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {p1}, Lio/flutter/plugin/editing/f;->g(Lio/flutter/plugin/editing/f;)Landroid/view/autofill/AutofillManager;

    move-result-object p1

    invoke-virtual {p1}, Landroid/view/autofill/AutofillManager;->cancel()V

    :cond_2
    :goto_0
    return-void
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->c(Lio/flutter/plugin/editing/f;)Lio/flutter/plugin/editing/f$c;

    move-result-object v0

    iget-object v0, v0, Lio/flutter/plugin/editing/f$c;->a:Lio/flutter/plugin/editing/f$c$a;

    sget-object v1, Lio/flutter/plugin/editing/f$c$a;->h:Lio/flutter/plugin/editing/f$c$a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->d(Lio/flutter/plugin/editing/f;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/flutter/plugin/editing/f$a;->a:Lio/flutter/plugin/editing/f;

    invoke-static {v0}, Lio/flutter/plugin/editing/f;->b(Lio/flutter/plugin/editing/f;)Landroid/view/View;

    move-result-object v1

    invoke-static {v0, v1}, Lio/flutter/plugin/editing/f;->e(Lio/flutter/plugin/editing/f;Landroid/view/View;)V

    :goto_0
    return-void
.end method
