.class public final Lw/e1;
.super Lw/t0;
.source ""


# instance fields
.field final synthetic g:Lw/c;


# direct methods
.method public constructor <init>(Lw/c;ILandroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, Lw/e1;->g:Lw/c;

    const/4 p3, 0x0

    invoke-direct {p0, p1, p2, p3}, Lw/t0;-><init>(Lw/c;ILandroid/os/Bundle;)V

    return-void
.end method


# virtual methods
.method protected final f(Ls/a;)V
    .locals 1

    iget-object v0, p0, Lw/e1;->g:Lw/c;

    invoke-virtual {v0}, Lw/c;->s()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw/e1;->g:Lw/c;

    invoke-static {v0}, Lw/c;->f0(Lw/c;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw/e1;->g:Lw/c;

    const/16 v0, 0x10

    invoke-static {p1, v0}, Lw/c;->b0(Lw/c;I)V

    return-void

    :cond_0
    iget-object v0, p0, Lw/e1;->g:Lw/c;

    iget-object v0, v0, Lw/c;->p:Lw/c$c;

    invoke-interface {v0, p1}, Lw/c$c;->c(Ls/a;)V

    iget-object v0, p0, Lw/e1;->g:Lw/c;

    invoke-virtual {v0, p1}, Lw/c;->K(Ls/a;)V

    return-void
.end method

.method protected final g()Z
    .locals 2

    iget-object v0, p0, Lw/e1;->g:Lw/c;

    iget-object v0, v0, Lw/c;->p:Lw/c$c;

    sget-object v1, Ls/a;->i:Ls/a;

    invoke-interface {v0, v1}, Lw/c$c;->c(Ls/a;)V

    const/4 v0, 0x1

    return v0
.end method
