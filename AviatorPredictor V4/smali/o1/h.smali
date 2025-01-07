.class public final synthetic Lo1/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/j;

.field public final synthetic f:Lo1/j$c;


# direct methods
.method public synthetic constructor <init>(Lo1/j;Lo1/j$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/h;->e:Lo1/j;

    iput-object p2, p0, Lo1/h;->f:Lo1/j$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo1/h;->e:Lo1/j;

    iget-object v1, p0, Lo1/h;->f:Lo1/j$c;

    invoke-static {v0, v1}, Lo1/j;->c(Lo1/j;Lo1/j$c;)V

    return-void
.end method
