.class public Lc1/f;
.super Lc1/j;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Lc1/j<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field private e:I


# direct methods
.method constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Lc1/h;Lc1/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lc1/h<",
            "TK;TV;>;",
            "Lc1/h<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2, p3, p4}, Lc1/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc1/h;Lc1/h;)V

    const/4 p1, -0x1

    iput p1, p0, Lc1/f;->e:I

    return-void
.end method


# virtual methods
.method public g()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method protected k(Ljava/lang/Object;Ljava/lang/Object;Lc1/h;Lc1/h;)Lc1/j;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "Lc1/h<",
            "TK;TV;>;",
            "Lc1/h<",
            "TK;TV;>;)",
            "Lc1/j<",
            "TK;TV;>;"
        }
    .end annotation

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lc1/j;->getKey()Ljava/lang/Object;

    move-result-object p1

    :cond_0
    if-nez p2, :cond_1

    invoke-virtual {p0}, Lc1/j;->getValue()Ljava/lang/Object;

    move-result-object p2

    :cond_1
    if-nez p3, :cond_2

    invoke-virtual {p0}, Lc1/j;->b()Lc1/h;

    move-result-object p3

    :cond_2
    if-nez p4, :cond_3

    invoke-virtual {p0}, Lc1/j;->a()Lc1/h;

    move-result-object p4

    :cond_3
    new-instance v0, Lc1/f;

    invoke-direct {v0, p1, p2, p3, p4}, Lc1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lc1/h;Lc1/h;)V

    return-object v0
.end method

.method protected m()Lc1/h$a;
    .locals 1

    sget-object v0, Lc1/h$a;->f:Lc1/h$a;

    return-object v0
.end method

.method public size()I
    .locals 2

    iget v0, p0, Lc1/f;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Lc1/j;->b()Lc1/h;

    move-result-object v0

    invoke-interface {v0}, Lc1/h;->size()I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lc1/j;->a()Lc1/h;

    move-result-object v1

    invoke-interface {v1}, Lc1/h;->size()I

    move-result v1

    add-int/2addr v0, v1

    iput v0, p0, Lc1/f;->e:I

    :cond_0
    iget v0, p0, Lc1/f;->e:I

    return v0
.end method

.method t(Lc1/h;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/h<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget v0, p0, Lc1/f;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-super {p0, p1}, Lc1/j;->t(Lc1/h;)V

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Can\'t set left after using size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
