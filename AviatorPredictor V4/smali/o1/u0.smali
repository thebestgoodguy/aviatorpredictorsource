.class public Lo1/u0;
.super Lo1/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/u0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/c<",
        "Lx1/p;",
        "Lx1/q;",
        "Lo1/u0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final t:Lcom/google/protobuf/j;


# instance fields
.field private final s:Lo1/j0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    sput-object v0, Lo1/u0;->t:Lcom/google/protobuf/j;

    return-void
.end method

.method constructor <init>(Lo1/u;Lp1/g;Lo1/j0;Lo1/u0$a;)V
    .locals 8

    invoke-static {}, Lx1/o;->c()Lb3/v0;

    move-result-object v2

    sget-object v4, Lp1/g$d;->g:Lp1/g$d;

    sget-object v5, Lp1/g$d;->f:Lp1/g$d;

    sget-object v6, Lp1/g$d;->j:Lp1/g$d;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lo1/c;-><init>(Lo1/u;Lb3/v0;Lp1/g;Lp1/g$d;Lp1/g$d;Lp1/g$d;Lo1/p0;)V

    iput-object p3, p0, Lo1/u0;->s:Lo1/j0;

    return-void
.end method


# virtual methods
.method public A(Lk1/b4;)V
    .locals 3

    invoke-virtual {p0}, Lo1/u0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Watching queries requires an open stream"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lx1/p;->b0()Lx1/p$b;

    move-result-object v0

    iget-object v1, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v1}, Lo1/j0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/p$b;->E(Ljava/lang/String;)Lx1/p$b;

    move-result-object v0

    iget-object v1, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->U(Lk1/b4;)Lx1/u;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/p$b;->D(Lx1/u;)Lx1/p$b;

    move-result-object v0

    iget-object v1, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->N(Lk1/b4;)Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {v0, p1}, Lx1/p$b;->B(Ljava/util/Map;)Lx1/p$b;

    :cond_0
    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/p;

    invoke-virtual {p0, p1}, Lo1/c;->x(Ljava/lang/Object;)V

    return-void
.end method

.method public bridge synthetic l()V
    .locals 0

    invoke-super {p0}, Lo1/c;->l()V

    return-void
.end method

.method public bridge synthetic m()Z
    .locals 1

    invoke-super {p0}, Lo1/c;->m()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic n()Z
    .locals 1

    invoke-super {p0}, Lo1/c;->n()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic r(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lx1/q;

    invoke-virtual {p0, p1}, Lo1/u0;->y(Lx1/q;)V

    return-void
.end method

.method public bridge synthetic u()V
    .locals 0

    invoke-super {p0}, Lo1/c;->u()V

    return-void
.end method

.method public bridge synthetic v()V
    .locals 0

    invoke-super {p0}, Lo1/c;->v()V

    return-void
.end method

.method public y(Lx1/q;)V
    .locals 2

    iget-object v0, p0, Lo1/c;->l:Lp1/r;

    invoke-virtual {v0}, Lp1/r;->f()V

    iget-object v0, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v0, p1}, Lo1/j0;->A(Lx1/q;)Lo1/s0;

    move-result-object v0

    iget-object v1, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v1, p1}, Lo1/j0;->z(Lx1/q;)Ll1/w;

    move-result-object p1

    iget-object v1, p0, Lo1/c;->m:Lo1/p0;

    check-cast v1, Lo1/u0$a;

    invoke-interface {v1, p1, v0}, Lo1/u0$a;->e(Ll1/w;Lo1/s0;)V

    return-void
.end method

.method public z(I)V
    .locals 3

    invoke-virtual {p0}, Lo1/u0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Unwatching targets requires an open stream"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lx1/p;->b0()Lx1/p$b;

    move-result-object v0

    iget-object v1, p0, Lo1/u0;->s:Lo1/j0;

    invoke-virtual {v1}, Lo1/j0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/p$b;->E(Ljava/lang/String;)Lx1/p$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx1/p$b;->F(I)Lx1/p$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/p;

    invoke-virtual {p0, p1}, Lo1/c;->x(Ljava/lang/Object;)V

    return-void
.end method
