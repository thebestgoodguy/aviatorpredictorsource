.class Lo1/j$d;
.super Landroid/content/BroadcastReceiver;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "d"
.end annotation


# instance fields
.field private a:Z

.field final synthetic b:Lo1/j;


# direct methods
.method private constructor <init>(Lo1/j;)V
    .locals 0

    iput-object p1, p0, Lo1/j$d;->b:Lo1/j;

    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lo1/j$d;->a:Z

    return-void
.end method

.method synthetic constructor <init>(Lo1/j;Lo1/j$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/j$d;-><init>(Lo1/j;)V

    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    iget-object p1, p0, Lo1/j$d;->b:Lo1/j;

    invoke-static {p1}, Lo1/j;->e(Lo1/j;)Z

    move-result p1

    iget-object p2, p0, Lo1/j$d;->b:Lo1/j;

    invoke-static {p2}, Lo1/j;->e(Lo1/j;)Z

    move-result p2

    if-eqz p2, :cond_0

    iget-boolean p2, p0, Lo1/j$d;->a:Z

    if-nez p2, :cond_0

    iget-object p2, p0, Lo1/j$d;->b:Lo1/j;

    const/4 v0, 0x1

    :goto_0
    invoke-static {p2, v0}, Lo1/j;->d(Lo1/j;Z)V

    goto :goto_1

    :cond_0
    if-nez p1, :cond_1

    iget-boolean p2, p0, Lo1/j$d;->a:Z

    if-eqz p2, :cond_1

    iget-object p2, p0, Lo1/j$d;->b:Lo1/j;

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    :goto_1
    iput-boolean p1, p0, Lo1/j$d;->a:Z

    return-void
.end method
