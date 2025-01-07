.class public Ll1/x;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ljava/lang/String;

.field private b:Li1/q;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/q;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/w0;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Li1/c1;)V
    .locals 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Li1/c1;->d()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Li1/c1;->n()Ll1/u;

    move-result-object v0

    invoke-virtual {v0}, Ll1/e;->n()Ljava/lang/String;

    move-result-object v0

    :goto_0
    iput-object v0, p0, Ll1/x;->a:Ljava/lang/String;

    invoke-virtual {p1}, Li1/c1;->m()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Ll1/x;->d:Ljava/util/List;

    const/4 v0, 0x0

    iput-object v0, p0, Ll1/x;->b:Li1/q;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll1/x;->c:Ljava/util/List;

    invoke-virtual {p1}, Li1/c1;->h()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/r;

    check-cast v0, Li1/q;

    invoke-virtual {v0}, Li1/q;->j()Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll1/x;->b:Li1/q;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Li1/q;->g()Ll1/r;

    move-result-object v1

    invoke-virtual {v0}, Li1/q;->g()Ll1/r;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_2

    :cond_1
    const/4 v1, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 v1, 0x1

    :goto_3
    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "Only a single inequality is supported"

    invoke-static {v1, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object v0, p0, Ll1/x;->b:Li1/q;

    goto :goto_1

    :cond_3
    iget-object v1, p0, Ll1/x;->c:Ljava/util/List;

    invoke-interface {v1, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    return-void
.end method

.method private a(Ll1/q$c;)Z
    .locals 2

    iget-object v0, p0, Ll1/x;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/q;

    invoke-direct {p0, v1, p1}, Ll1/x;->b(Li1/q;Ll1/q$c;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private b(Li1/q;Ll1/q$c;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Li1/q;->g()Ll1/r;

    move-result-object v1

    invoke-virtual {p2}, Ll1/q$c;->h()Ll1/r;

    move-result-object v2

    invoke-virtual {v1, v2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object v1

    sget-object v2, Li1/q$b;->l:Li1/q$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x1

    if-nez v1, :cond_2

    invoke-virtual {p1}, Li1/q;->h()Li1/q$b;

    move-result-object p1

    sget-object v1, Li1/q$b;->m:Li1/q$b;

    invoke-virtual {p1, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    invoke-virtual {p2}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object p2

    sget-object v1, Ll1/q$c$a;->g:Ll1/q$c$a;

    invoke-virtual {p2, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-ne p2, p1, :cond_3

    const/4 v0, 0x1

    :cond_3
    :goto_2
    return v0
.end method

.method private c(Li1/w0;Ll1/q$c;)Z
    .locals 3

    invoke-virtual {p1}, Li1/w0;->c()Ll1/r;

    move-result-object v0

    invoke-virtual {p2}, Ll1/q$c;->h()Ll1/r;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p2}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object v0

    sget-object v2, Ll1/q$c$a;->e:Ll1/q$c$a;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Li1/w0;->b()Li1/w0$a;

    move-result-object v0

    sget-object v2, Li1/w0$a;->f:Li1/w0$a;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    :cond_1
    invoke-virtual {p2}, Ll1/q$c;->i()Ll1/q$c$a;

    move-result-object p2

    sget-object v0, Ll1/q$c$a;->f:Ll1/q$c$a;

    invoke-virtual {p2, v0}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Li1/w0;->b()Li1/w0$a;

    move-result-object p1

    sget-object p2, Li1/w0$a;->g:Li1/w0$a;

    invoke-virtual {p1, p2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    const/4 v1, 0x1

    :cond_3
    return v1
.end method


# virtual methods
.method public d(Ll1/q;)Z
    .locals 6

    invoke-virtual {p1}, Ll1/q;->d()Ljava/lang/String;

    move-result-object v0

    iget-object v1, p0, Ll1/x;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "Collection IDs do not match"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Ll1/q;->c()Ll1/q$c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Ll1/x;->a(Ll1/q$c;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Ll1/x;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-virtual {p1}, Ll1/q;->e()Ljava/util/List;

    move-result-object p1

    const/4 v2, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/q$c;

    invoke-direct {p0, v3}, Ll1/x;->a(Ll1/q$c;)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    const/4 v4, 0x1

    if-ne v2, v3, :cond_3

    return v4

    :cond_3
    iget-object v3, p0, Ll1/x;->b:Li1/q;

    if-eqz v3, :cond_6

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/q$c;

    iget-object v5, p0, Ll1/x;->b:Li1/q;

    invoke-direct {p0, v5, v3}, Ll1/x;->b(Li1/q;Ll1/q$c;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li1/w0;

    invoke-direct {p0, v5, v3}, Ll1/x;->c(Li1/w0;Ll1/q$c;)Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_2

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_5
    :goto_2
    return v1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_8

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/q$c;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li1/w0;

    invoke-direct {p0, v5, v3}, Ll1/x;->c(Li1/w0;Ll1/q$c;)Z

    move-result v3

    if-nez v3, :cond_4

    :cond_7
    return v1

    :cond_8
    return v4
.end method
