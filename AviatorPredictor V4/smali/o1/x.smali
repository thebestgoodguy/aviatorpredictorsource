.class public final synthetic Lo1/x;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/d0;

.field public final synthetic f:Lb3/q0;


# direct methods
.method public synthetic constructor <init>(Lo1/d0;Lb3/q0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/x;->e:Lo1/d0;

    iput-object p2, p0, Lo1/x;->f:Lb3/q0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo1/x;->e:Lo1/d0;

    iget-object v1, p0, Lo1/x;->f:Lb3/q0;

    invoke-static {v0, v1}, Lo1/d0;->b(Lo1/d0;Lb3/q0;)V

    return-void
.end method
