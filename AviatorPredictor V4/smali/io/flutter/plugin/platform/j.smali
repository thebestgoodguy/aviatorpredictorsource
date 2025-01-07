.class public final synthetic Lio/flutter/plugin/platform/j;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lio/flutter/plugin/platform/n;


# direct methods
.method public synthetic constructor <init>(Lio/flutter/plugin/platform/n;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/flutter/plugin/platform/j;->e:Lio/flutter/plugin/platform/n;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lio/flutter/plugin/platform/j;->e:Lio/flutter/plugin/platform/n;

    invoke-static {v0}, Lio/flutter/plugin/platform/n;->e(Lio/flutter/plugin/platform/n;)V

    return-void
.end method
