.class public final synthetic Lo1/b0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:Lo1/d0;


# direct methods
.method public synthetic constructor <init>(Lo1/d0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/b0;->a:Lo1/d0;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lo1/b0;->a:Lo1/d0;

    invoke-static {v0}, Lo1/d0;->d(Lo1/d0;)Lb3/q0;

    move-result-object v0

    return-object v0
.end method
