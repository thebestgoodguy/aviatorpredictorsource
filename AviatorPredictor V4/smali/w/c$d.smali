.class public Lw/c$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lw/c$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lw/c;


# direct methods
.method public constructor <init>(Lw/c;)V
    .locals 0

    iput-object p1, p0, Lw/c$d;->a:Lw/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(Ls/a;)V
    .locals 2

    invoke-virtual {p1}, Ls/a;->n0()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lw/c$d;->a:Lw/c;

    const/4 v0, 0x0

    invoke-virtual {p1}, Lw/c;->B()Ljava/util/Set;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lw/c;->f(Lw/j;Ljava/util/Set;)V

    return-void

    :cond_0
    iget-object v0, p0, Lw/c$d;->a:Lw/c;

    invoke-static {v0}, Lw/c;->T(Lw/c;)Lw/c$b;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw/c$d;->a:Lw/c;

    invoke-static {v0}, Lw/c;->T(Lw/c;)Lw/c$b;

    move-result-object v0

    invoke-interface {v0, p1}, Lw/c$b;->a(Ls/a;)V

    :cond_1
    return-void
.end method
