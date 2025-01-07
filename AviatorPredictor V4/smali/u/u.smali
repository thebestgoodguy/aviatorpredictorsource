.class public final synthetic Lu/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lu/g;

.field public final synthetic f:Landroid/os/IBinder;


# direct methods
.method public synthetic constructor <init>(Lu/g;Landroid/os/IBinder;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu/u;->e:Lu/g;

    iput-object p2, p0, Lu/u;->f:Landroid/os/IBinder;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lu/u;->e:Lu/g;

    iget-object v1, p0, Lu/u;->f:Landroid/os/IBinder;

    invoke-virtual {v0, v1}, Lu/g;->q(Landroid/os/IBinder;)V

    return-void
.end method
