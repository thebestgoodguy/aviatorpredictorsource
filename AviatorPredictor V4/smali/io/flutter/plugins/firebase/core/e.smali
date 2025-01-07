.class public final synthetic Lio/flutter/plugins/firebase/core/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Ljava/lang/Boolean;

.field public final synthetic g:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/e;->e:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/e;->f:Ljava/lang/Boolean;

    iput-object p3, p0, Lio/flutter/plugins/firebase/core/e;->g:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/e;->e:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/e;->f:Ljava/lang/Boolean;

    iget-object v2, p0, Lio/flutter/plugins/firebase/core/e;->g:Lo0/i;

    invoke-static {v0, v1, v2}, Lio/flutter/plugins/firebase/core/i;->i(Ljava/lang/String;Ljava/lang/Boolean;Lo0/i;)V

    return-void
.end method
