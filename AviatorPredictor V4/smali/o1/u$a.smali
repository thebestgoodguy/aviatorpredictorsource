.class Lo1/u$a;
.super Lb3/g$a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/u;->i([Lb3/g;Lo1/f0;Lo0/h;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/f0;

.field final synthetic b:[Lb3/g;

.field final synthetic c:Lo1/u;


# direct methods
.method constructor <init>(Lo1/u;Lo1/f0;[Lb3/g;)V
    .locals 0

    iput-object p1, p0, Lo1/u$a;->c:Lo1/u;

    iput-object p2, p0, Lo1/u$a;->a:Lo1/f0;

    iput-object p3, p0, Lo1/u$a;->b:[Lb3/g;

    invoke-direct {p0}, Lb3/g$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/f1;Lb3/u0;)V
    .locals 0

    :try_start_0
    iget-object p2, p0, Lo1/u$a;->a:Lo1/f0;

    invoke-interface {p2, p1}, Lo1/f0;->b(Lb3/f1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object p2, p0, Lo1/u$a;->c:Lo1/u;

    invoke-static {p2}, Lo1/u;->d(Lo1/u;)Lp1/g;

    move-result-object p2

    invoke-virtual {p2, p1}, Lp1/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b(Lb3/u0;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lo1/u$a;->a:Lo1/f0;

    invoke-interface {v0, p1}, Lo1/f0;->d(Lb3/u0;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lo1/u$a;->c:Lo1/u;

    invoke-static {v0}, Lo1/u;->d(Lo1/u;)Lp1/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c(Ljava/lang/Object;)V
    .locals 1

    :try_start_0
    iget-object v0, p0, Lo1/u$a;->a:Lo1/f0;

    invoke-interface {v0, p1}, Lo1/f0;->c(Ljava/lang/Object;)V

    iget-object p1, p0, Lo1/u$a;->b:[Lb3/g;

    const/4 v0, 0x0

    aget-object p1, p1, v0

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lb3/g;->c(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    iget-object v0, p0, Lo1/u$a;->c:Lo1/u;

    invoke-static {v0}, Lo1/u;->d(Lo1/u;)Lp1/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lp1/g;->u(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method
