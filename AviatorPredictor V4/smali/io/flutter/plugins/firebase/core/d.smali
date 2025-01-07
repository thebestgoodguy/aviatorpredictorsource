.class public final synthetic Lio/flutter/plugins/firebase/core/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugins/firebase/core/i;

.field public final synthetic f:Lx0/e;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/i;Lx0/e;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/d;->e:Lio/flutter/plugins/firebase/core/i;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/d;->f:Lx0/e;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/d;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/d;->e:Lio/flutter/plugins/firebase/core/i;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/d;->f:Lx0/e;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/d;->g:Lo0/i;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/core/i;->p(Lio/flutter/plugins/firebase/core/i;Lx0/e;Lo0/i;)V

    return-void
.end method
