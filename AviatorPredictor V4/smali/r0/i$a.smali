.class public Lr0/i$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field a:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "-TV;>;"
        }
    .end annotation
.end field

.field b:[Ljava/lang/Object;

.field c:I

.field d:Z


# direct methods
.method constructor <init>(I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    mul-int/lit8 p1, p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, Lr0/i$a;->c:I

    iput-boolean p1, p0, Lr0/i$a;->d:Z

    return-void
.end method

.method private b(I)V
    .locals 2

    mul-int/lit8 p1, p1, 0x2

    iget-object v0, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    array-length v1, v0

    if-le p1, v1, :cond_0

    array-length v1, v0

    invoke-static {v1, p1}, Lr0/g$a;->a(II)I

    move-result p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    iput-object p1, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    const/4 p1, 0x0

    iput-boolean p1, p0, Lr0/i$a;->d:Z

    :cond_0
    return-void
.end method


# virtual methods
.method public a()Lr0/i;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lr0/i<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lr0/i$a;->f()V

    const/4 v0, 0x1

    iput-boolean v0, p0, Lr0/i$a;->d:Z

    iget v0, p0, Lr0/i$a;->c:I

    iget-object v1, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    invoke-static {v0, v1}, Lr0/s;->k(I[Ljava/lang/Object;)Lr0/s;

    move-result-object v0

    return-object v0
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Lr0/i$a;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;)",
            "Lr0/i$a<",
            "TK;TV;>;"
        }
    .end annotation

    iget v0, p0, Lr0/i$a;->c:I

    add-int/lit8 v0, v0, 0x1

    invoke-direct {p0, v0}, Lr0/i$a;->b(I)V

    invoke-static {p1, p2}, Lr0/c;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    iget v1, p0, Lr0/i$a;->c:I

    mul-int/lit8 v2, v1, 0x2

    aput-object p1, v0, v2

    mul-int/lit8 p1, v1, 0x2

    add-int/lit8 p1, p1, 0x1

    aput-object p2, v0, p1

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lr0/i$a;->c:I

    return-object p0
.end method

.method public d(Ljava/util/Map$Entry;)Lr0/i$a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;)",
            "Lr0/i$a<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0, v0, p1}, Lr0/i$a;->c(Ljava/lang/Object;Ljava/lang/Object;)Lr0/i$a;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/Iterable;)Lr0/i$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Ljava/util/Map$Entry<",
            "+TK;+TV;>;>;)",
            "Lr0/i$a<",
            "TK;TV;>;"
        }
    .end annotation

    instance-of v0, p1, Ljava/util/Collection;

    if-eqz v0, :cond_0

    iget v0, p0, Lr0/i$a;->c:I

    move-object v1, p1

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    add-int/2addr v0, v1

    invoke-direct {p0, v0}, Lr0/i$a;->b(I)V

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p0, v0}, Lr0/i$a;->d(Ljava/util/Map$Entry;)Lr0/i$a;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method f()V
    .locals 7

    iget-object v0, p0, Lr0/i$a;->a:Ljava/util/Comparator;

    if-eqz v0, :cond_2

    iget-boolean v0, p0, Lr0/i$a;->d:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    iget v1, p0, Lr0/i$a;->c:I

    mul-int/lit8 v1, v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    :cond_0
    iget v0, p0, Lr0/i$a;->c:I

    new-array v0, v0, [Ljava/util/Map$Entry;

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget v3, p0, Lr0/i$a;->c:I

    if-ge v2, v3, :cond_1

    new-instance v3, Ljava/util/AbstractMap$SimpleImmutableEntry;

    iget-object v4, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    mul-int/lit8 v5, v2, 0x2

    aget-object v6, v4, v5

    add-int/lit8 v5, v5, 0x1

    aget-object v4, v4, v5

    invoke-direct {v3, v6, v4}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    aput-object v3, v0, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Lr0/i$a;->a:Ljava/util/Comparator;

    invoke-static {v2}, Lr0/p;->a(Ljava/util/Comparator;)Lr0/p;

    move-result-object v2

    invoke-static {}, Lr0/n;->c()Lq0/d;

    move-result-object v4

    invoke-virtual {v2, v4}, Lr0/p;->b(Lq0/d;)Lr0/p;

    move-result-object v2

    invoke-static {v0, v1, v3, v2}, Ljava/util/Arrays;->sort([Ljava/lang/Object;IILjava/util/Comparator;)V

    :goto_1
    iget v2, p0, Lr0/i$a;->c:I

    if-ge v1, v2, :cond_2

    iget-object v2, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    mul-int/lit8 v3, v1, 0x2

    aget-object v4, v0, v1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    iget-object v2, p0, Lr0/i$a;->b:[Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    aget-object v4, v0, v1

    invoke-interface {v4}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_2
    return-void
.end method
