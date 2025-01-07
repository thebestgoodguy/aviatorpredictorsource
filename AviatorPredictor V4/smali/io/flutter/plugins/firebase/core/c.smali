.class public final synthetic Lio/flutter/plugins/firebase/core/c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugins/firebase/core/i;

.field public final synthetic f:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/c;->e:Lio/flutter/plugins/firebase/core/i;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/c;->f:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/c;->e:Lio/flutter/plugins/firebase/core/i;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/c;->f:Lo0/i;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/i;->n(Lio/flutter/plugins/firebase/core/i;Lo0/i;)V

    return-void
.end method
