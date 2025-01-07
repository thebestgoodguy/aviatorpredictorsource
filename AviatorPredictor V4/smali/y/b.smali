.class public final synthetic Ly/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lu/j;


# instance fields
.field public final synthetic a:Lw/v;


# direct methods
.method public synthetic constructor <init>(Lw/v;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/b;->a:Lw/v;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    iget-object v0, p0, Ly/b;->a:Lw/v;

    check-cast p1, Ly/e;

    check-cast p2, Lo0/i;

    sget v1, Ly/d;->n:I

    invoke-virtual {p1}, Lw/c;->C()Landroid/os/IInterface;

    move-result-object p1

    check-cast p1, Ly/a;

    invoke-virtual {p1, v0}, Ly/a;->w(Lw/v;)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lo0/i;->c(Ljava/lang/Object;)V

    return-void
.end method
