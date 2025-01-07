.class public final synthetic Lo1/f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/c$c;

.field public final synthetic f:Lb3/f1;


# direct methods
.method public synthetic constructor <init>(Lo1/c$c;Lb3/f1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/f;->e:Lo1/c$c;

    iput-object p2, p0, Lo1/f;->f:Lb3/f1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lo1/f;->e:Lo1/c$c;

    iget-object v1, p0, Lo1/f;->f:Lb3/f1;

    invoke-static {v0, v1}, Lo1/c$c;->h(Lo1/c$c;Lb3/f1;)V

    return-void
.end method
