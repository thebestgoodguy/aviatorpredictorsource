.class public final synthetic Lo1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic e:Lo1/c;


# direct methods
.method public synthetic constructor <init>(Lo1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo1/a;->e:Lo1/c;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lo1/a;->e:Lo1/c;

    invoke-static {v0}, Lo1/c;->a(Lo1/c;)V

    return-void
.end method
