.class Lp2/a$f$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lp2/a$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lp2/a$f;


# direct methods
.method constructor <init>(Lp2/a$f;)V
    .locals 0

    iput-object p1, p0, Lp2/a$f$a;->e:Lp2/a$f;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lp2/a$f$a;->e:Lp2/a$f;

    invoke-static {v0}, Lp2/a$f;->e(Lp2/a$f;)Lio/flutter/view/d$a;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lp2/a$f$a;->e:Lp2/a$f;

    invoke-static {v0}, Lp2/a$f;->e(Lp2/a$f;)Lio/flutter/view/d$a;

    move-result-object v0

    invoke-interface {v0}, Lio/flutter/view/d$a;->a()V

    :cond_0
    return-void
.end method
