.class public Landroidx/fragment/app/c;
.super Landroidx/fragment/app/Fragment;
.source ""

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private c0:Landroid/os/Handler;

.field private d0:Ljava/lang/Runnable;

.field e0:I

.field f0:I

.field g0:Z

.field h0:Z

.field i0:I

.field j0:Landroid/app/Dialog;

.field k0:Z

.field l0:Z

.field m0:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Landroidx/fragment/app/Fragment;-><init>()V

    new-instance v0, Landroidx/fragment/app/c$a;

    invoke-direct {v0, p0}, Landroidx/fragment/app/c$a;-><init>(Landroidx/fragment/app/c;)V

    iput-object v0, p0, Landroidx/fragment/app/c;->d0:Ljava/lang/Runnable;

    const/4 v0, 0x0

    iput v0, p0, Landroidx/fragment/app/c;->e0:I

    iput v0, p0, Landroidx/fragment/app/c;->f0:I

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c;->g0:Z

    iput-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    const/4 v0, -0x1

    iput v0, p0, Landroidx/fragment/app/c;->i0:I

    return-void
.end method


# virtual methods
.method public V(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->V(Landroid/os/Bundle;)V

    iget-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    if-nez v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->L()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-nez v1, :cond_1

    iget-object v1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    goto :goto_0

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "DialogFragment can not be attached to a container view"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->l()Landroidx/fragment/app/d;

    move-result-object v0

    if-eqz v0, :cond_3

    iget-object v1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    :cond_3
    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    iget-boolean v1, p0, Landroidx/fragment/app/c;->g0:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    if-eqz p1, :cond_4

    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    :cond_4
    return-void
.end method

.method public Y(Landroid/content/Context;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->Y(Landroid/content/Context;)V

    iget-boolean p1, p0, Landroidx/fragment/app/c;->m0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x0

    iput-boolean p1, p0, Landroidx/fragment/app/c;->l0:Z

    :cond_0
    return-void
.end method

.method public b0(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->b0(Landroid/os/Bundle;)V

    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    iput-object v0, p0, Landroidx/fragment/app/c;->c0:Landroid/os/Handler;

    iget v0, p0, Landroidx/fragment/app/Fragment;->A:I

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    if-eqz p1, :cond_1

    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/c;->e0:I

    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Landroidx/fragment/app/c;->f0:I

    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/c;->g0:Z

    iget-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    const/4 v0, -0x1

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Landroidx/fragment/app/c;->i0:I

    :cond_1
    return-void
.end method

.method public i0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->i0()V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    iput-boolean v1, p0, Landroidx/fragment/app/c;->k0:Z

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    iget-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {p0, v0}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    :cond_0
    iput-object v1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    :cond_1
    return-void
.end method

.method public j0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->j0()V

    iget-boolean v0, p0, Landroidx/fragment/app/c;->m0:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    :cond_0
    return-void
.end method

.method public k0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2

    iget-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    if-nez v0, :cond_0

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->k0(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1}, Landroidx/fragment/app/c;->q1(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    iput-object p1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    const-string v0, "layout_inflater"

    if-eqz p1, :cond_1

    iget v1, p0, Landroidx/fragment/app/c;->e0:I

    invoke-virtual {p0, p1, v1}, Landroidx/fragment/app/c;->s1(Landroid/app/Dialog;I)V

    iget-object p1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {p1}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object p1

    :goto_0
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/view/LayoutInflater;

    return-object p1

    :cond_1
    iget-object p1, p0, Landroidx/fragment/app/Fragment;->w:Landroidx/fragment/app/h;

    invoke-virtual {p1}, Landroidx/fragment/app/h;->f()Landroid/content/Context;

    move-result-object p1

    goto :goto_0
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 0

    iget-boolean p1, p0, Landroidx/fragment/app/c;->k0:Z

    if-nez p1, :cond_0

    const/4 p1, 0x1

    invoke-virtual {p0, p1, p1}, Landroidx/fragment/app/c;->p1(ZZ)V

    :cond_0
    return-void
.end method

.method p1(ZZ)V
    .locals 3

    iget-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/c;->m0:Z

    iget-object v1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    iget-object v1, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {v1}, Landroid/app/Dialog;->dismiss()V

    if-nez p2, :cond_2

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object p2

    iget-object v1, p0, Landroidx/fragment/app/c;->c0:Landroid/os/Handler;

    invoke-virtual {v1}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v1

    if-ne p2, v1, :cond_1

    iget-object p2, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    invoke-virtual {p0, p2}, Landroidx/fragment/app/c;->onDismiss(Landroid/content/DialogInterface;)V

    goto :goto_0

    :cond_1
    iget-object p2, p0, Landroidx/fragment/app/c;->c0:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/fragment/app/c;->d0:Ljava/lang/Runnable;

    invoke-virtual {p2, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    :cond_2
    :goto_0
    iput-boolean v0, p0, Landroidx/fragment/app/c;->k0:Z

    iget p2, p0, Landroidx/fragment/app/c;->i0:I

    if-ltz p2, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b1()Landroidx/fragment/app/i;

    move-result-object p1

    iget p2, p0, Landroidx/fragment/app/c;->i0:I

    invoke-virtual {p1, p2, v0}, Landroidx/fragment/app/i;->g(II)V

    const/4 p1, -0x1

    iput p1, p0, Landroidx/fragment/app/c;->i0:I

    goto :goto_1

    :cond_3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->b1()Landroidx/fragment/app/i;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object p2

    invoke-virtual {p2, p0}, Landroidx/fragment/app/n;->g(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/n;

    if-eqz p1, :cond_4

    invoke-virtual {p2}, Landroidx/fragment/app/n;->e()I

    goto :goto_1

    :cond_4
    invoke-virtual {p2}, Landroidx/fragment/app/n;->d()I

    :goto_1
    return-void
.end method

.method public q1(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 0

    const/4 p0, 0x0

    throw p0
.end method

.method public r1(Z)V
    .locals 0

    iput-boolean p1, p0, Landroidx/fragment/app/c;->h0:Z

    return-void
.end method

.method public s1(Landroid/app/Dialog;I)V
    .locals 2

    const/4 v0, 0x1

    if-eq p2, v0, :cond_1

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p2

    const/16 v1, 0x18

    invoke-virtual {p2, v1}, Landroid/view/Window;->addFlags(I)V

    :cond_1
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    :goto_0
    return-void
.end method

.method public t1(Landroidx/fragment/app/i;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Landroidx/fragment/app/c;->l0:Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Landroidx/fragment/app/c;->m0:Z

    invoke-virtual {p1}, Landroidx/fragment/app/i;->a()Landroidx/fragment/app/n;

    move-result-object p1

    invoke-virtual {p1, p0, p2}, Landroidx/fragment/app/n;->b(Landroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/n;

    invoke-virtual {p1}, Landroidx/fragment/app/n;->d()I

    return-void
.end method

.method public x0(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Landroidx/fragment/app/Fragment;->x0(Landroid/os/Bundle;)V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_0

    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    :cond_0
    iget v0, p0, Landroidx/fragment/app/c;->e0:I

    if-eqz v0, :cond_1

    const-string v1, "android:style"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_1
    iget v0, p0, Landroidx/fragment/app/c;->f0:I

    if-eqz v0, :cond_2

    const-string v1, "android:theme"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_2
    iget-boolean v0, p0, Landroidx/fragment/app/c;->g0:Z

    if-nez v0, :cond_3

    const-string v1, "android:cancelable"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_3
    iget-boolean v0, p0, Landroidx/fragment/app/c;->h0:Z

    if-nez v0, :cond_4

    const-string v1, "android:showsDialog"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    :cond_4
    iget v0, p0, Landroidx/fragment/app/c;->i0:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    const-string v1, "android:backStackId"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    :cond_5
    return-void
.end method

.method public y0()V
    .locals 2

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->y0()V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    iput-boolean v1, p0, Landroidx/fragment/app/c;->k0:Z

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    :cond_0
    return-void
.end method

.method public z0()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/Fragment;->z0()V

    iget-object v0, p0, Landroidx/fragment/app/c;->j0:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    :cond_0
    return-void
.end method
