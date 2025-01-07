.class public Lo1/v0;
.super Lo1/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lo1/v0$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/c<",
        "Lx1/z;",
        "Lx1/a0;",
        "Lo1/v0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final v:Lcom/google/protobuf/j;


# instance fields
.field private final s:Lo1/j0;

.field protected t:Z

.field private u:Lcom/google/protobuf/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    sput-object v0, Lo1/v0;->v:Lcom/google/protobuf/j;

    return-void
.end method

.method constructor <init>(Lo1/u;Lp1/g;Lo1/j0;Lo1/v0$a;)V
    .locals 8

    invoke-static {}, Lx1/o;->d()Lb3/v0;

    move-result-object v2

    sget-object v4, Lp1/g$d;->i:Lp1/g$d;

    sget-object v5, Lp1/g$d;->h:Lp1/g$d;

    sget-object v6, Lp1/g$d;->j:Lp1/g$d;

    move-object v0, p0

    move-object v1, p1

    move-object v3, p2

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lo1/c;-><init>(Lo1/u;Lb3/v0;Lp1/g;Lp1/g$d;Lp1/g$d;Lp1/g$d;Lo1/p0;)V

    const/4 p1, 0x0

    iput-boolean p1, p0, Lo1/v0;->t:Z

    sget-object p1, Lo1/v0;->v:Lcom/google/protobuf/j;

    iput-object p1, p0, Lo1/v0;->u:Lcom/google/protobuf/j;

    iput-object p3, p0, Lo1/v0;->s:Lo1/j0;

    return-void
.end method


# virtual methods
.method public A(Lx1/a0;)V
    .locals 6

    invoke-virtual {p1}, Lx1/a0;->W()Lcom/google/protobuf/j;

    move-result-object v0

    iput-object v0, p0, Lo1/v0;->u:Lcom/google/protobuf/j;

    iget-boolean v0, p0, Lo1/v0;->t:Z

    if-nez v0, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lo1/v0;->t:Z

    iget-object p1, p0, Lo1/c;->m:Lo1/p0;

    check-cast p1, Lo1/v0$a;

    invoke-interface {p1}, Lo1/v0$a;->c()V

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lo1/c;->l:Lp1/r;

    invoke-virtual {v0}, Lp1/r;->f()V

    iget-object v0, p0, Lo1/v0;->s:Lo1/j0;

    invoke-virtual {p1}, Lx1/a0;->U()Lcom/google/protobuf/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lo1/j0;->y(Lcom/google/protobuf/t1;)Ll1/w;

    move-result-object v0

    invoke-virtual {p1}, Lx1/a0;->Y()I

    move-result v1

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_1

    invoke-virtual {p1, v3}, Lx1/a0;->X(I)Lx1/b0;

    move-result-object v4

    iget-object v5, p0, Lo1/v0;->s:Lo1/j0;

    invoke-virtual {v5, v4, v0}, Lo1/j0;->p(Lx1/b0;Ll1/w;)Lm1/i;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lo1/c;->m:Lo1/p0;

    check-cast p1, Lo1/v0$a;

    invoke-interface {p1, v0, v2}, Lo1/v0$a;->d(Ll1/w;Ljava/util/List;)V

    :goto_1
    return-void
.end method

.method B(Lcom/google/protobuf/j;)V
    .locals 0

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/j;

    iput-object p1, p0, Lo1/v0;->u:Lcom/google/protobuf/j;

    return-void
.end method

.method C()V
    .locals 4

    invoke-virtual {p0}, Lo1/v0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Writing handshake requires an opened stream"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lo1/v0;->t:Z

    xor-int/lit8 v0, v0, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handshake already completed"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lx1/z;->a0()Lx1/z$b;

    move-result-object v0

    iget-object v1, p0, Lo1/v0;->s:Lo1/j0;

    invoke-virtual {v1}, Lo1/j0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/z$b;->D(Ljava/lang/String;)Lx1/z$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/z;

    invoke-virtual {p0, v0}, Lo1/c;->x(Ljava/lang/Object;)V

    return-void
.end method

.method D(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lm1/f;",
            ">;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lo1/v0;->m()Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Writing mutations requires an opened stream"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-boolean v0, p0, Lo1/v0;->t:Z

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Handshake must be complete before writing mutations"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Lx1/z;->a0()Lx1/z$b;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/f;

    iget-object v2, p0, Lo1/v0;->s:Lo1/j0;

    invoke-virtual {v2, v1}, Lo1/j0;->O(Lm1/f;)Lx1/y;

    move-result-object v1

    invoke-virtual {v0, v1}, Lx1/z$b;->B(Lx1/y;)Lx1/z$b;

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lo1/v0;->u:Lcom/google/protobuf/j;

    invoke-virtual {v0, p1}, Lx1/z$b;->E(Lcom/google/protobuf/j;)Lx1/z$b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/z;

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

    check-cast p1, Lx1/a0;

    invoke-virtual {p0, p1}, Lo1/v0;->A(Lx1/a0;)V

    return-void
.end method

.method public u()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/v0;->t:Z

    invoke-super {p0}, Lo1/c;->u()V

    return-void
.end method

.method public bridge synthetic v()V
    .locals 0

    invoke-super {p0}, Lo1/c;->v()V

    return-void
.end method

.method protected w()V
    .locals 1

    iget-boolean v0, p0, Lo1/v0;->t:Z

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0, v0}, Lo1/v0;->D(Ljava/util/List;)V

    :cond_0
    return-void
.end method

.method y()Lcom/google/protobuf/j;
    .locals 1

    iget-object v0, p0, Lo1/v0;->u:Lcom/google/protobuf/j;

    return-object v0
.end method

.method z()Z
    .locals 1

    iget-boolean v0, p0, Lo1/v0;->t:Z

    return v0
.end method
