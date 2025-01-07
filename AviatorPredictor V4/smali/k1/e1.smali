.class public Lk1/e1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Lk1/e;",
            ">;"
        }
    .end annotation
.end field

.field private b:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Lk1/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lc1/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lk1/e;->c:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lc1/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Lk1/e1;->a:Lc1/e;

    new-instance v0, Lc1/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v1

    sget-object v2, Lk1/e;->d:Ljava/util/Comparator;

    invoke-direct {v0, v1, v2}, Lc1/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    iput-object v0, p0, Lk1/e1;->b:Lc1/e;

    return-void
.end method

.method private e(Lk1/e;)V
    .locals 1

    iget-object v0, p0, Lk1/e1;->a:Lc1/e;

    invoke-virtual {v0, p1}, Lc1/e;->s(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    iput-object v0, p0, Lk1/e1;->a:Lc1/e;

    iget-object v0, p0, Lk1/e1;->b:Lc1/e;

    invoke-virtual {v0, p1}, Lc1/e;->s(Ljava/lang/Object;)Lc1/e;

    move-result-object p1

    iput-object p1, p0, Lk1/e1;->b:Lc1/e;

    return-void
.end method


# virtual methods
.method public a(Ll1/l;I)V
    .locals 1

    new-instance v0, Lk1/e;

    invoke-direct {v0, p1, p2}, Lk1/e;-><init>(Ll1/l;I)V

    iget-object p1, p0, Lk1/e1;->a:Lc1/e;

    invoke-virtual {p1, v0}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object p1

    iput-object p1, p0, Lk1/e1;->a:Lc1/e;

    iget-object p1, p0, Lk1/e1;->b:Lc1/e;

    invoke-virtual {p1, v0}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object p1

    iput-object p1, p0, Lk1/e1;->b:Lc1/e;

    return-void
.end method

.method public b(Lc1/e;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "Ll1/l;",
            ">;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    invoke-virtual {p0, v0, p2}, Lk1/e1;->a(Ll1/l;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public c(Ll1/l;)Z
    .locals 3

    new-instance v0, Lk1/e;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lk1/e;-><init>(Ll1/l;I)V

    iget-object v2, p0, Lk1/e1;->a:Lc1/e;

    invoke-virtual {v2, v0}, Lc1/e;->r(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_0

    return v1

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk1/e;

    invoke-virtual {v0}, Lk1/e;->d()Ll1/l;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public d(I)Lc1/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll1/l;->h()Ll1/l;

    move-result-object v0

    new-instance v1, Lk1/e;

    invoke-direct {v1, v0, p1}, Lk1/e;-><init>(Ll1/l;I)V

    iget-object v0, p0, Lk1/e1;->b:Lc1/e;

    invoke-virtual {v0, v1}, Lc1/e;->r(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk1/e;

    invoke-virtual {v2}, Lk1/e;->c()I

    move-result v3

    if-ne v3, p1, :cond_0

    invoke-virtual {v2}, Lk1/e;->d()Ll1/l;

    move-result-object v2

    invoke-virtual {v1, v2}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v1

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method public f(Ll1/l;I)V
    .locals 1

    new-instance v0, Lk1/e;

    invoke-direct {v0, p1, p2}, Lk1/e;-><init>(Ll1/l;I)V

    invoke-direct {p0, v0}, Lk1/e1;->e(Lk1/e;)V

    return-void
.end method

.method public g(Lc1/e;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "Ll1/l;",
            ">;I)V"
        }
    .end annotation

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    invoke-virtual {p0, v0, p2}, Lk1/e1;->f(Ll1/l;I)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(I)Lc1/e;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    invoke-static {}, Ll1/l;->h()Ll1/l;

    move-result-object v0

    new-instance v1, Lk1/e;

    invoke-direct {v1, v0, p1}, Lk1/e;-><init>(Ll1/l;I)V

    iget-object v0, p0, Lk1/e1;->b:Lc1/e;

    invoke-virtual {v0, v1}, Lc1/e;->r(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v0

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lk1/e;

    invoke-virtual {v2}, Lk1/e;->c()I

    move-result v3

    if-ne v3, p1, :cond_0

    invoke-virtual {v2}, Lk1/e;->d()Ll1/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v1

    invoke-direct {p0, v2}, Lk1/e1;->e(Lk1/e;)V

    goto :goto_0

    :cond_0
    return-object v1
.end method
