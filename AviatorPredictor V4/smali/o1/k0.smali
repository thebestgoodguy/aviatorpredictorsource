.class public final synthetic Lo1/k0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/n0;

.field public final synthetic f:Lo1/k$a;


# direct methods
.method public synthetic constructor <init>(Lo1/n0;Lo1/k$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/k0;->e:Lo1/n0;

    iput-object p2, p0, Lo1/k0;->f:Lo1/k$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo1/k0;->e:Lo1/n0;

    iget-object v1, p0, Lo1/k0;->f:Lo1/k$a;

    invoke-static {v0, v1}, Lo1/n0;->d(Lo1/n0;Lo1/k$a;)V

    return-void
.end method
