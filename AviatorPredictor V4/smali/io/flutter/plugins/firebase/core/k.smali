.class public final synthetic Lio/flutter/plugins/firebase/core/k;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lx0/e;

.field public final synthetic f:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lx0/e;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/k;->e:Lx0/e;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/k;->f:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/k;->e:Lx0/e;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/k;->f:Lo0/i;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/FlutterFirebasePluginRegistry;->a(Lx0/e;Lo0/i;)V

    return-void
.end method
