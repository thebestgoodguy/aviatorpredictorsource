.class final Lw/z0;
.super Lh0/e;
.source ""


# instance fields
.field final synthetic a:Lw/c;


# direct methods
.method public constructor <init>(Lw/c;Landroid/os/Looper;)V
    .locals 0

    iput-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-direct {p0, p2}, Lh0/e;-><init>(Landroid/os/Looper;)V

    return-void
.end method

.method private static final a(Landroid/os/Message;)V
    .locals 0

    iget-object p0, p0, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p0, Lw/a1;

    invoke-virtual {p0}, Lw/a1;->b()V

    invoke-virtual {p0}, Lw/a1;->e()V

    return-void
.end method

.method private static final b(Landroid/os/Message;)Z
    .locals 2

    iget p0, p0, Landroid/os/Message;->what:I

    const/4 v0, 0x1

    const/4 v1, 0x2

    if-eq p0, v1, :cond_1

    if-eq p0, v0, :cond_1

    const/4 v1, 0x7

    if-ne p0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    return v0
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)V
    .locals 7

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    iget-object v0, v0, Lw/c;->C:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v0

    iget v1, p1, Landroid/os/Message;->arg1:I

    if-eq v0, v1, :cond_1

    invoke-static {p1}, Lw/z0;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {p1}, Lw/z0;->a(Landroid/os/Message;)V

    :cond_0
    return-void

    :cond_1
    iget v0, p1, Landroid/os/Message;->what:I

    const/4 v1, 0x4

    const/4 v2, 0x1

    const/4 v3, 0x5

    if-eq v0, v2, :cond_3

    const/4 v4, 0x7

    if-eq v0, v4, :cond_3

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {v0}, Lw/c;->s()Z

    move-result v0

    if-eqz v0, :cond_3

    :cond_2
    iget v0, p1, Landroid/os/Message;->what:I

    if-ne v0, v3, :cond_4

    :cond_3
    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {v0}, Lw/c;->b()Z

    move-result v0

    if-eqz v0, :cond_12

    :cond_4
    iget v0, p1, Landroid/os/Message;->what:I

    const/16 v4, 0x8

    const/4 v5, 0x3

    const/4 v6, 0x0

    if-ne v0, v1, :cond_8

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    new-instance v1, Ls/a;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v1, p1}, Ls/a;-><init>(I)V

    invoke-static {v0, v1}, Lw/c;->X(Lw/c;Ls/a;)V

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-static {p1}, Lw/c;->f0(Lw/c;)Z

    move-result p1

    if-eqz p1, :cond_6

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-static {p1}, Lw/c;->d0(Lw/c;)Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_0

    :cond_5
    invoke-static {p1, v5, v6}, Lw/c;->Z(Lw/c;ILandroid/os/IInterface;)V

    return-void

    :cond_6
    :goto_0
    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-static {p1}, Lw/c;->R(Lw/c;)Ls/a;

    move-result-object v0

    if-eqz v0, :cond_7

    invoke-static {p1}, Lw/c;->R(Lw/c;)Ls/a;

    move-result-object p1

    goto :goto_1

    :cond_7
    new-instance p1, Ls/a;

    invoke-direct {p1, v4}, Ls/a;-><init>(I)V

    :goto_1
    iget-object v0, p0, Lw/z0;->a:Lw/c;

    iget-object v0, v0, Lw/c;->p:Lw/c$c;

    invoke-interface {v0, p1}, Lw/c$c;->c(Ls/a;)V

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {v0, p1}, Lw/c;->K(Ls/a;)V

    return-void

    :cond_8
    if-ne v0, v3, :cond_a

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-static {p1}, Lw/c;->R(Lw/c;)Ls/a;

    move-result-object v0

    if-eqz v0, :cond_9

    invoke-static {p1}, Lw/c;->R(Lw/c;)Ls/a;

    move-result-object p1

    goto :goto_2

    :cond_9
    new-instance p1, Ls/a;

    invoke-direct {p1, v4}, Ls/a;-><init>(I)V

    :goto_2
    iget-object v0, p0, Lw/z0;->a:Lw/c;

    iget-object v0, v0, Lw/c;->p:Lw/c$c;

    invoke-interface {v0, p1}, Lw/c$c;->c(Ls/a;)V

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {v0, p1}, Lw/c;->K(Ls/a;)V

    return-void

    :cond_a
    if-ne v0, v5, :cond_c

    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    instance-of v1, v0, Landroid/app/PendingIntent;

    if-eqz v1, :cond_b

    move-object v6, v0

    check-cast v6, Landroid/app/PendingIntent;

    :cond_b
    new-instance v0, Ls/a;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-direct {v0, p1, v6}, Ls/a;-><init>(ILandroid/app/PendingIntent;)V

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    iget-object p1, p1, Lw/c;->p:Lw/c$c;

    invoke-interface {p1, v0}, Lw/c$c;->c(Ls/a;)V

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {p1, v0}, Lw/c;->K(Ls/a;)V

    return-void

    :cond_c
    const/4 v1, 0x6

    if-ne v0, v1, :cond_e

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-static {v0, v3, v6}, Lw/c;->Z(Lw/c;ILandroid/os/IInterface;)V

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-static {v0}, Lw/c;->S(Lw/c;)Lw/c$a;

    move-result-object v1

    if-eqz v1, :cond_d

    invoke-static {v0}, Lw/c;->S(Lw/c;)Lw/c$a;

    move-result-object v0

    iget v1, p1, Landroid/os/Message;->arg2:I

    invoke-interface {v0, v1}, Lw/c$a;->f(I)V

    :cond_d
    iget-object v0, p0, Lw/z0;->a:Lw/c;

    iget p1, p1, Landroid/os/Message;->arg2:I

    invoke-virtual {v0, p1}, Lw/c;->L(I)V

    iget-object p1, p0, Lw/z0;->a:Lw/c;

    invoke-static {p1, v3, v2, v6}, Lw/c;->e0(Lw/c;IILandroid/os/IInterface;)Z

    return-void

    :cond_e
    const/4 v1, 0x2

    if-ne v0, v1, :cond_10

    iget-object v0, p0, Lw/z0;->a:Lw/c;

    invoke-virtual {v0}, Lw/c;->d()Z

    move-result v0

    if-eqz v0, :cond_f

    goto :goto_3

    :cond_f
    invoke-static {p1}, Lw/z0;->a(Landroid/os/Message;)V

    return-void

    :cond_10
    :goto_3
    invoke-static {p1}, Lw/z0;->b(Landroid/os/Message;)Z

    move-result v0

    if-eqz v0, :cond_11

    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    check-cast p1, Lw/a1;

    invoke-virtual {p1}, Lw/a1;->c()V

    return-void

    :cond_11
    iget p1, p1, Landroid/os/Message;->what:I

    new-instance v0, Ljava/lang/StringBuilder;

    const/16 v1, 0x2d

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v1, "Don\'t know how to handle message: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    new-instance p1, Ljava/lang/Exception;

    invoke-direct {p1}, Ljava/lang/Exception;-><init>()V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "GmsClient"

    invoke-static {v1, v0, p1}, Landroid/util/Log;->wtf(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    return-void

    :cond_12
    invoke-static {p1}, Lw/z0;->a(Landroid/os/Message;)V

    return-void
.end method
