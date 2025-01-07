.class public final synthetic Lio/flutter/plugin/platform/m;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugin/platform/n$a;

.field public final synthetic f:Lio/flutter/plugin/platform/o;

.field public final synthetic g:Lq2/k$b;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/n$a;Lio/flutter/plugin/platform/o;Lq2/k$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/m;->e:Lio/flutter/plugin/platform/n$a;

    iput-object p2, p0, Lio/flutter/plugin/platform/m;->f:Lio/flutter/plugin/platform/o;

    iput-object p3, p0, Lio/flutter/plugin/platform/m;->g:Lq2/k$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugin/platform/m;->e:Lio/flutter/plugin/platform/n$a;

    iget-object v1, p0, Lio/flutter/plugin/platform/m;->f:Lio/flutter/plugin/platform/o;

    iget-object v2, p0, Lio/flutter/plugin/platform/m;->g:Lq2/k$b;

    invoke-static {v0, v1, v2}, Lio/flutter/plugin/platform/n$a;->k(Lio/flutter/plugin/platform/n$a;Lio/flutter/plugin/platform/o;Lq2/k$b;)V

    return-void
.end method
