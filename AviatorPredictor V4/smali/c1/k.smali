.class public Lc1/k;
.super Lc1/c;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc1/k$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc1/c<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private e:Lc1/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field private f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lc1/h;Ljava/util/Comparator;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/h<",
            "TK;TV;>;",
            "Ljava/util/Comparator<",
            "TK;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Lc1/c;-><init>()V

    iput-object p1, p0, Lc1/k;->e:Lc1/h;

    iput-object p2, p0, Lc1/k;->f:Ljava/util/Comparator;

    return-void
.end method

.method synthetic constructor <init>(Lc1/h;Ljava/util/Comparator;Lc1/k$a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lc1/k;-><init>(Lc1/h;Ljava/util/Comparator;)V

    return-void
.end method

.method public static w(Ljava/util/List;Ljava/util/Map;Lc1/c$a$a;Ljava/util/Comparator;)Lc1/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            "C:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/List<",
            "TA;>;",
            "Ljava/util/Map<",
            "TB;TC;>;",
            "Lc1/c$a$a<",
            "TA;TB;>;",
            "Ljava/util/Comparator<",
            "TA;>;)",
            "Lc1/k<",
            "TA;TC;>;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lc1/k$b;->b(Ljava/util/List;Ljava/util/Map;Lc1/c$a$a;Ljava/util/Comparator;)Lc1/k;

    move-result-object p0

    return-object p0
.end method

.method public static x(Ljava/util/Map;Ljava/util/Comparator;)Lc1/k;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A:",
            "Ljava/lang/Object;",
            "B:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Map<",
            "TA;TB;>;",
            "Ljava/util/Comparator<",
            "TA;>;)",
            "Lc1/k<",
            "TA;TB;>;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {}, Lc1/c$a;->d()Lc1/c$a$a;

    move-result-object v1

    invoke-static {v0, p0, v1, p1}, Lc1/k$b;->b(Ljava/util/List;Ljava/util/Map;Lc1/c$a$a;Ljava/util/Comparator;)Lc1/k;

    move-result-object p0

    return-object p0
.end method

.method private y(Ljava/lang/Object;)Lc1/h;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lc1/h<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    :goto_0
    invoke-interface {v0}, Lc1/h;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    iget-object v1, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-interface {v0}, Lc1/h;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v1, p1, v2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v1

    if-gez v1, :cond_0

    invoke-interface {v0}, Lc1/h;->b()Lc1/h;

    move-result-object v0

    goto :goto_0

    :cond_0
    if-nez v1, :cond_1

    return-object v0

    :cond_1
    invoke-interface {v0}, Lc1/h;->a()Lc1/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public i(Ljava/lang/Object;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)Z"
        }
    .end annotation

    invoke-direct {p0, p1}, Lc1/k;->y(Ljava/lang/Object;)Lc1/h;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)I"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0}, Lc1/h;->isEmpty()Z

    move-result v2

    if-nez v2, :cond_2

    iget-object v2, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-interface {v0}, Lc1/h;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v2, p1, v3}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v2

    if-nez v2, :cond_0

    invoke-interface {v0}, Lc1/h;->b()Lc1/h;

    move-result-object p1

    invoke-interface {p1}, Lc1/h;->size()I

    move-result p1

    add-int/2addr v1, p1

    return v1

    :cond_0
    if-gez v2, :cond_1

    invoke-interface {v0}, Lc1/h;->b()Lc1/h;

    move-result-object v0

    goto :goto_0

    :cond_1
    invoke-interface {v0}, Lc1/h;->b()Lc1/h;

    move-result-object v2

    invoke-interface {v2}, Lc1/h;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    add-int/2addr v1, v2

    invoke-interface {v0}, Lc1/h;->a()Lc1/h;

    move-result-object v0

    goto :goto_0

    :cond_2
    const/4 p1, -0x1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    invoke-interface {v0}, Lc1/h;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lc1/d;

    iget-object v1, p0, Lc1/k;->e:Lc1/h;

    iget-object v2, p0, Lc1/k;->f:Ljava/util/Comparator;

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct {v0, v1, v3, v2, v4}, Lc1/d;-><init>(Lc1/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method

.method public p(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-direct {p0, p1}, Lc1/k;->y(Ljava/lang/Object;)Lc1/h;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lc1/h;->getValue()Ljava/lang/Object;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return-object p1
.end method

.method public q()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "TK;>;"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->f:Ljava/util/Comparator;

    return-object v0
.end method

.method public r()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    invoke-interface {v0}, Lc1/h;->h()Lc1/h;

    move-result-object v0

    invoke-interface {v0}, Lc1/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public s()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    invoke-interface {v0}, Lc1/h;->f()Lc1/h;

    move-result-object v0

    invoke-interface {v0}, Lc1/h;->getKey()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    invoke-interface {v0}, Lc1/h;->size()I

    move-result v0

    return v0
.end method

.method public t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lc1/c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    iget-object v1, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-interface {v0, p1, p2, v1}, Lc1/h;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Comparator;)Lc1/h;

    move-result-object v2

    sget-object v5, Lc1/h$a;->f:Lc1/h$a;

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Lc1/h;->e(Ljava/lang/Object;Ljava/lang/Object;Lc1/h$a;Lc1/h;Lc1/h;)Lc1/h;

    move-result-object p1

    new-instance p2, Lc1/k;

    iget-object v0, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-direct {p2, p1, v0}, Lc1/k;-><init>(Lc1/h;Ljava/util/Comparator;)V

    return-object p2
.end method

.method public u(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Ljava/util/Iterator<",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;>;"
        }
    .end annotation

    new-instance v0, Lc1/d;

    iget-object v1, p0, Lc1/k;->e:Lc1/h;

    iget-object v2, p0, Lc1/k;->f:Ljava/util/Comparator;

    const/4 v3, 0x0

    invoke-direct {v0, v1, p1, v2, v3}, Lc1/d;-><init>(Lc1/h;Ljava/lang/Object;Ljava/util/Comparator;Z)V

    return-object v0
.end method

.method public v(Ljava/lang/Object;)Lc1/c;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)",
            "Lc1/c<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lc1/k;->i(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    iget-object v0, p0, Lc1/k;->e:Lc1/h;

    iget-object v1, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-interface {v0, p1, v1}, Lc1/h;->d(Ljava/lang/Object;Ljava/util/Comparator;)Lc1/h;

    move-result-object v2

    const/4 v3, 0x0

    const/4 v4, 0x0

    sget-object v5, Lc1/h$a;->f:Lc1/h$a;

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-interface/range {v2 .. v7}, Lc1/h;->e(Ljava/lang/Object;Ljava/lang/Object;Lc1/h$a;Lc1/h;Lc1/h;)Lc1/h;

    move-result-object p1

    new-instance v0, Lc1/k;

    iget-object v1, p0, Lc1/k;->f:Ljava/util/Comparator;

    invoke-direct {v0, p1, v1}, Lc1/k;-><init>(Lc1/h;Ljava/util/Comparator;)V

    return-object v0
.end method
