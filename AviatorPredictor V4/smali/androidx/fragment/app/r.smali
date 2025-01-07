.class Landroidx/fragment/app/r;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroidx/lifecycle/g;


# instance fields
.field private e:Landroidx/lifecycle/h;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    return-void
.end method


# virtual methods
.method a(Landroidx/lifecycle/d$a;)V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    invoke-virtual {v0, p1}, Landroidx/lifecycle/h;->i(Landroidx/lifecycle/d$a;)V

    return-void
.end method

.method public b()Landroidx/lifecycle/d;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/r;->c()V

    iget-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    return-object v0
.end method

.method c()V
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    if-nez v0, :cond_0

    new-instance v0, Landroidx/lifecycle/h;

    invoke-direct {v0, p0}, Landroidx/lifecycle/h;-><init>(Landroidx/lifecycle/g;)V

    iput-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    :cond_0
    return-void
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Landroidx/fragment/app/r;->e:Landroidx/lifecycle/h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
