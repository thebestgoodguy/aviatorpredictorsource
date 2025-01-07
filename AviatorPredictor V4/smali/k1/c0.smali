.class public final synthetic Lk1/c0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lk1/f0;

.field public final synthetic f:Lk1/f0$b;

.field public final synthetic g:Li1/c1;


# direct methods
.method public synthetic constructor <init>(Lk1/f0;Lk1/f0$b;Li1/c1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/c0;->e:Lk1/f0;

    iput-object p2, p0, Lk1/c0;->f:Lk1/f0$b;

    iput-object p3, p0, Lk1/c0;->g:Li1/c1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lk1/c0;->e:Lk1/f0;

    iget-object v1, p0, Lk1/c0;->f:Lk1/f0$b;

    iget-object v2, p0, Lk1/c0;->g:Li1/c1;

    invoke-static {v0, v1, v2}, Lk1/f0;->l(Lk1/f0;Lk1/f0$b;Li1/c1;)V

    return-void
.end method
