.class public final synthetic Lio/flutter/plugins/firebase/core/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugins/firebase/core/i;

.field public final synthetic f:Lio/flutter/plugins/firebase/core/l$f;

.field public final synthetic g:Ljava/lang/String;

.field public final synthetic h:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/a;->e:Lio/flutter/plugins/firebase/core/i;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/a;->f:Lio/flutter/plugins/firebase/core/l$f;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/a;->g:Ljava/lang/String;

    iput-object p4, p0, Lio/flutter/plugins/firebase/core/a;->h:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/a;->e:Lio/flutter/plugins/firebase/core/i;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/a;->f:Lio/flutter/plugins/firebase/core/l$f;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/a;->g:Ljava/lang/String;

    iget-object v3, p0, Lio/flutter/plugins/firebase/core/a;->h:Lo0/i;

    invoke-static {v0, v1, v2, v3}, Lio/flutter/plugins/firebase/core/i;->j(Lio/flutter/plugins/firebase/core/i;Lio/flutter/plugins/firebase/core/l$f;Ljava/lang/String;Lo0/i;)V

    return-void
.end method
