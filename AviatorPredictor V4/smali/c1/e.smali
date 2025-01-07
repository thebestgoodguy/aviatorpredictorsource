.class public Lc1/e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Iterable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc1/e$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/lang/Iterable<",
        "TT;>;"
    }
.end annotation


# instance fields
.field private final e:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "TT;",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lc1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "TT;",
            "Ljava/lang/Void;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc1/e;->e:Lc1/c;

    return-void
.end method

.method public constructor <init>(Ljava/util/List;Ljava/util/Comparator;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/Comparator<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyMap()Ljava/util/Map;

    move-result-object v0

    invoke-static {}, Lc1/c$a;->d()Lc1/c$a$a;

    move-result-object v1

    invoke-static {p1, v0, v1, p2}, Lc1/c$a;->b(Ljava/util/List;Ljava/util/Map;Lc1/c$a$a;Ljava/util/Comparator;)Lc1/c;

    move-result-object p1

    iput-object p1, p0, Lc1/e;->e:Lc1/c;

    return-void
.end method


# virtual methods
.method public contains(Ljava/lang/Object;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0, p1}, Lc1/c;->i(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lc1/e;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lc1/e;

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    iget-object p1, p1, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0, p1}, Lc1/c;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0}, Lc1/c;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0}, Lc1/c;->r()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public indexOf(Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)I"
        }
    .end annotation

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0, p1}, Lc1/c;->indexOf(Ljava/lang/Object;)I

    move-result p1

    return p1
.end method

.method public isEmpty()Z
    .locals 1

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0}, Lc1/c;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public iterator()Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lc1/e$a;

    iget-object v1, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v1}, Lc1/c;->iterator()Ljava/util/Iterator;

    move-result-object v1

    invoke-direct {v0, v1}, Lc1/e$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public p()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0}, Lc1/c;->s()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/Object;)Lc1/e;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lc1/e<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lc1/e;

    iget-object v1, p0, Lc1/e;->e:Lc1/c;

    const/4 v2, 0x0

    invoke-virtual {v1, p1, v2}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object p1

    invoke-direct {v0, p1}, Lc1/e;-><init>(Lc1/c;)V

    return-object v0
.end method

.method public r(Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, Lc1/e$a;

    iget-object v1, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v1, p1}, Lc1/c;->u(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object p1

    invoke-direct {v0, p1}, Lc1/e$a;-><init>(Ljava/util/Iterator;)V

    return-object v0
.end method

.method public s(Ljava/lang/Object;)Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)",
            "Lc1/e<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0, p1}, Lc1/c;->v(Ljava/lang/Object;)Lc1/c;

    move-result-object p1

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    if-ne p1, v0, :cond_0

    move-object v0, p0

    goto :goto_0

    :cond_0
    new-instance v0, Lc1/e;

    invoke-direct {v0, p1}, Lc1/e;-><init>(Lc1/c;)V

    :goto_0
    return-object v0
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lc1/e;->e:Lc1/c;

    invoke-virtual {v0}, Lc1/c;->size()I

    move-result v0

    return v0
.end method

.method public t(Lc1/e;)Lc1/e;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/e<",
            "TT;>;)",
            "Lc1/e<",
            "TT;>;"
        }
    .end annotation

    invoke-virtual {p0}, Lc1/e;->size()I

    move-result v0

    invoke-virtual {p1}, Lc1/e;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    move-object v0, p1

    move-object p1, p0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    invoke-virtual {p1}, Lc1/e;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    goto :goto_1

    :cond_1
    return-object v0
.end method
