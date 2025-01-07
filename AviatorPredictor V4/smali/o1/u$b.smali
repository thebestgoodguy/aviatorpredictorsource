.class Lo1/u$b;
.super Lb3/z;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/u;->m(Lb3/v0;Lo1/f0;)Lb3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb3/z<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:[Lb3/g;

.field final synthetic b:Lo0/h;

.field final synthetic c:Lo1/u;


# direct methods
.method constructor <init>(Lo1/u;[Lb3/g;Lo0/h;)V
    .locals 0

    iput-object p1, p0, Lo1/u$b;->c:Lo1/u;

    iput-object p2, p0, Lo1/u$b;->a:[Lb3/g;

    iput-object p3, p0, Lo1/u$b;->b:Lo0/h;

    invoke-direct {p0}, Lb3/z;-><init>()V

    return-void
.end method


# virtual methods
.method public b()V
    .locals 3

    iget-object v0, p0, Lo1/u$b;->a:[Lb3/g;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-nez v0, :cond_0

    iget-object v0, p0, Lo1/u$b;->b:Lo0/h;

    iget-object v1, p0, Lo1/u$b;->c:Lo1/u;

    invoke-static {v1}, Lo1/u;->d(Lo1/u;)Lp1/g;

    move-result-object v1

    invoke-virtual {v1}, Lp1/g;->o()Ljava/util/concurrent/Executor;

    move-result-object v1

    sget-object v2, Lo1/v;->a:Lo1/v;

    invoke-virtual {v0, v1, v2}, Lo0/h;->f(Ljava/util/concurrent/Executor;Lo0/f;)Lo0/h;

    goto :goto_0

    :cond_0
    invoke-super {p0}, Lb3/z;->b()V

    :goto_0
    return-void
.end method

.method protected f()Lb3/g;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation

    iget-object v0, p0, Lo1/u$b;->a:[Lb3/g;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "ClientCall used before onOpen() callback"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Lo1/u$b;->a:[Lb3/g;

    aget-object v0, v0, v1

    return-object v0
.end method
