.class abstract Lw/t0;
.super Lw/a1;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lw/a1<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# instance fields
.field public final d:I

.field public final e:Landroid/os/Bundle;

.field final synthetic f:Lw/c;


# direct methods
.method protected constructor <init>(Lw/c;ILandroid/os/Bundle;)V
    .locals 1

    iput-object p1, p0, Lw/t0;->f:Lw/c;

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-direct {p0, p1, v0}, Lw/a1;-><init>(Lw/c;Ljava/lang/Object;)V

    iput p2, p0, Lw/t0;->d:I

    iput-object p3, p0, Lw/t0;->e:Landroid/os/Bundle;

    return-void
.end method


# virtual methods
.method protected final bridge synthetic a(Ljava/lang/Object;)V
    .locals 2

    iget p1, p0, Lw/t0;->d:I

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lw/t0;->g()Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, Lw/t0;->f:Lw/c;

    invoke-static {p1, v0, v1}, Lw/c;->Z(Lw/c;ILandroid/os/IInterface;)V

    new-instance p1, Ls/a;

    const/16 v0, 0x8

    invoke-direct {p1, v0, v1}, Ls/a;-><init>(ILandroid/app/PendingIntent;)V

    :goto_0
    invoke-virtual {p0, p1}, Lw/t0;->f(Ls/a;)V

    :cond_0
    return-void

    :cond_1
    iget-object p1, p0, Lw/t0;->f:Lw/c;

    invoke-static {p1, v0, v1}, Lw/c;->Z(Lw/c;ILandroid/os/IInterface;)V

    iget-object p1, p0, Lw/t0;->e:Landroid/os/Bundle;

    if-eqz p1, :cond_2

    const-string v0, "pendingIntent"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Landroid/app/PendingIntent;

    :cond_2
    new-instance p1, Ls/a;

    iget v0, p0, Lw/t0;->d:I

    invoke-direct {p1, v0, v1}, Ls/a;-><init>(ILandroid/app/PendingIntent;)V

    goto :goto_0
.end method

.method protected final b()V
    .locals 0

    return-void
.end method

.method protected abstract f(Ls/a;)V
.end method

.method protected abstract g()Z
.end method
