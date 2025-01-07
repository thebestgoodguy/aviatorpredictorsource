.class final Lk1/v0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/a4;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Li1/c1;",
            "Lk1/b4;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lk1/e1;

.field private c:I

.field private d:Ll1/w;

.field private e:J

.field private final f:Lk1/t0;


# direct methods
.method constructor <init>(Lk1/t0;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lk1/v0;->a:Ljava/util/Map;

    new-instance v0, Lk1/e1;

    invoke-direct {v0}, Lk1/e1;-><init>()V

    iput-object v0, p0, Lk1/v0;->b:Lk1/e1;

    sget-object v0, Ll1/w;->f:Ll1/w;

    iput-object v0, p0, Lk1/v0;->d:Ll1/w;

    const-wide/16 v0, 0x0

    iput-wide v0, p0, Lk1/v0;->e:J

    iput-object p1, p0, Lk1/v0;->f:Lk1/t0;

    return-void
.end method


# virtual methods
.method public a(Lk1/b4;)V
    .locals 0

    invoke-virtual {p0, p1}, Lk1/v0;->i(Lk1/b4;)V

    return-void
.end method

.method public b(I)Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {v0, p1}, Lk1/e1;->d(I)Lc1/e;

    move-result-object p1

    return-object p1
.end method

.method public c()Ll1/w;
    .locals 1

    iget-object v0, p0, Lk1/v0;->d:Ll1/w;

    return-object v0
.end method

.method public d(Lc1/e;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "Ll1/l;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {v0, p1, p2}, Lk1/e1;->b(Lc1/e;I)V

    iget-object p2, p0, Lk1/v0;->f:Lk1/t0;

    invoke-virtual {p2}, Lk1/t0;->f()Lk1/d1;

    move-result-object p2

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    invoke-interface {p2, v0}, Lk1/d1;->a(Ll1/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public e(Ll1/w;)V
    .locals 0

    iput-object p1, p0, Lk1/v0;->d:Ll1/w;

    return-void
.end method

.method public f(I)V
    .locals 1

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {v0, p1}, Lk1/e1;->h(I)Lc1/e;

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

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {v0, p1, p2}, Lk1/e1;->g(Lc1/e;I)V

    iget-object p2, p0, Lk1/v0;->f:Lk1/t0;

    invoke-virtual {p2}, Lk1/t0;->f()Lk1/d1;

    move-result-object p2

    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/l;

    invoke-interface {p2, v0}, Lk1/d1;->f(Ll1/l;)V

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Li1/c1;)Lk1/b4;
    .locals 1

    iget-object v0, p0, Lk1/v0;->a:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lk1/b4;

    return-object p1
.end method

.method public i(Lk1/b4;)V
    .locals 5

    iget-object v0, p0, Lk1/v0;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lk1/b4;->f()Li1/c1;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result v0

    iget v1, p0, Lk1/v0;->c:I

    if-le v0, v1, :cond_0

    iput v0, p0, Lk1/v0;->c:I

    :cond_0
    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v0

    iget-wide v2, p0, Lk1/v0;->e:J

    cmp-long v4, v0, v2

    if-lez v4, :cond_1

    invoke-virtual {p1}, Lk1/b4;->d()J

    move-result-wide v0

    iput-wide v0, p0, Lk1/v0;->e:J

    :cond_1
    return-void
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lk1/v0;->c:I

    return v0
.end method

.method public k(Ll1/l;)Z
    .locals 1

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {v0, p1}, Lk1/e1;->c(Ll1/l;)Z

    move-result p1

    return p1
.end method

.method public l(Lk1/b4;)V
    .locals 2

    iget-object v0, p0, Lk1/v0;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lk1/b4;->f()Li1/c1;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lk1/v0;->b:Lk1/e1;

    invoke-virtual {p1}, Lk1/b4;->g()I

    move-result p1

    invoke-virtual {v0, p1}, Lk1/e1;->h(I)Lc1/e;

    return-void
.end method
