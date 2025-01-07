.class public final synthetic Lo1/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/c$c;


# direct methods
.method public synthetic constructor <init>(Lo1/c$c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/d;->e:Lo1/c$c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo1/d;->e:Lo1/c$c;

    invoke-static {v0}, Lo1/c$c;->f(Lo1/c$c;)V

    return-void
.end method
