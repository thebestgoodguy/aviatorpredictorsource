.class Lo1/j$c;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lo1/j;


# direct methods
.method private constructor <init>(Lo1/j;)V
    .locals 0

    iput-object p1, p0, Lo1/j$c;->a:Lo1/j;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lo1/j;Lo1/j$a;)V
    .locals 0

    invoke-direct {p0, p1}, Lo1/j$c;-><init>(Lo1/j;)V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lo1/j$c;->a:Lo1/j;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lo1/j;->d(Lo1/j;Z)V

    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    iget-object p1, p0, Lo1/j$c;->a:Lo1/j;

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lo1/j;->d(Lo1/j;Z)V

    return-void
.end method
