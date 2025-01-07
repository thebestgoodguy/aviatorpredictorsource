.class public final synthetic Lio/flutter/plugins/firebase/core/g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Ljava/lang/String;

.field public final synthetic f:Lo0/i;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lo0/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugins/firebase/core/g;->e:Ljava/lang/String;

    iput-object p2, p0, Lio/flutter/plugins/firebase/core/g;->f:Lo0/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lio/flutter/plugins/firebase/core/g;->e:Ljava/lang/String;

    iget-object v1, p0, Lio/flutter/plugins/firebase/core/g;->f:Lo0/i;

    invoke-static {v0, v1}, Lio/flutter/plugins/firebase/core/i;->m(Ljava/lang/String;Lo0/i;)V

    return-void
.end method
