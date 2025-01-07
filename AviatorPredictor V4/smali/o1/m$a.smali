.class Lo1/m$a;
.super Lo1/u$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/m;->m(Ljava/util/List;)Lo0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lo1/u$e<",
        "Lx1/d;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Ljava/util/List;

.field final synthetic b:Ljava/util/List;

.field final synthetic c:Lo0/i;

.field final synthetic d:Lo1/m;


# direct methods
.method constructor <init>(Lo1/m;Ljava/util/List;Ljava/util/List;Lo0/i;)V
    .locals 0

    iput-object p1, p0, Lo1/m$a;->d:Lo1/m;

    iput-object p2, p0, Lo1/m$a;->a:Ljava/util/List;

    iput-object p3, p0, Lo1/m$a;->b:Ljava/util/List;

    iput-object p4, p0, Lo1/m$a;->c:Lo0/i;

    invoke-direct {p0}, Lo1/u$e;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lb3/f1;)V
    .locals 2

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lo1/m$a;->c:Lo0/i;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lo0/i;->e(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p1}, Lp1/g0;->r(Lb3/f1;)Lcom/google/firebase/firestore/u;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/firestore/u;->a()Lcom/google/firebase/firestore/u$a;

    move-result-object v0

    sget-object v1, Lcom/google/firebase/firestore/u$a;->v:Lcom/google/firebase/firestore/u$a;

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lo1/m$a;->d:Lo1/m;

    invoke-static {v0}, Lo1/m;->c(Lo1/m;)Lo1/u;

    move-result-object v0

    invoke-virtual {v0}, Lo1/u;->h()V

    :cond_1
    iget-object v0, p0, Lo1/m$a;->c:Lo0/i;

    invoke-virtual {v0, p1}, Lo0/i;->d(Ljava/lang/Exception;)Z

    :goto_0
    return-void
.end method

.method public bridge synthetic b(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lx1/d;

    invoke-virtual {p0, p1}, Lo1/m$a;->c(Lx1/d;)V

    return-void
.end method

.method public c(Lx1/d;)V
    .locals 3

    iget-object v0, p0, Lo1/m$a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    iget-object p1, p0, Lo1/m$a;->a:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    iget-object v0, p0, Lo1/m$a;->b:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne p1, v0, :cond_2

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iget-object v0, p0, Lo1/m$a;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/d;

    iget-object v2, p0, Lo1/m$a;->d:Lo1/m;

    invoke-static {v2}, Lo1/m;->b(Lo1/m;)Lo1/j0;

    move-result-object v2

    invoke-virtual {v2, v1}, Lo1/j0;->m(Lx1/d;)Ll1/s;

    move-result-object v1

    invoke-virtual {v1}, Ll1/s;->getKey()Ll1/l;

    move-result-object v2

    invoke-interface {p1, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lo1/m$a;->b:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/s;

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lo1/m$a;->c:Lo0/i;

    invoke-virtual {p1, v0}, Lo0/i;->e(Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
