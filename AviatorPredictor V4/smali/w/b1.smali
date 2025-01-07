.class public final Lw/b1;
.super Lw/u0;
.source ""


# instance fields
.field private a:Lw/c;

.field private final b:I


# direct methods
.method public constructor <init>(Lw/c;I)V
    .locals 0

    invoke-direct {p0}, Lw/u0;-><init>()V

    iput-object p1, p0, Lw/b1;->a:Lw/c;

    iput p2, p0, Lw/b1;->b:I

    return-void
.end method


# virtual methods
.method public final k(ILandroid/os/Bundle;)V
    .locals 1

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    const-string p2, "GmsClient"

    const-string v0, "received deprecated onAccountValidationComplete callback, ignoring"

    invoke-static {p2, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void
.end method

.method public final t(ILandroid/os/IBinder;Lw/f1;)V
    .locals 2

    iget-object v0, p0, Lw/b1;->a:Lw/c;

    const-string v1, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService"

    invoke-static {v0, v1}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p3}, Lw/r;->i(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0, p3}, Lw/c;->a0(Lw/c;Lw/f1;)V

    iget-object p3, p3, Lw/f1;->e:Landroid/os/Bundle;

    invoke-virtual {p0, p1, p2, p3}, Lw/b1;->u(ILandroid/os/IBinder;Landroid/os/Bundle;)V

    return-void
.end method

.method public final u(ILandroid/os/IBinder;Landroid/os/Bundle;)V
    .locals 2

    iget-object v0, p0, Lw/b1;->a:Lw/c;

    const-string v1, "onPostInitComplete can be called only once per call to getRemoteService"

    invoke-static {v0, v1}, Lw/r;->j(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lw/b1;->a:Lw/c;

    iget v1, p0, Lw/b1;->b:I

    invoke-virtual {v0, p1, p2, p3, v1}, Lw/c;->M(ILandroid/os/IBinder;Landroid/os/Bundle;I)V

    const/4 p1, 0x0

    iput-object p1, p0, Lw/b1;->a:Lw/c;

    return-void
.end method
