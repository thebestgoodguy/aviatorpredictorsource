.class public final Lm1/o;
.super Lm1/f;
.source ""


# instance fields
.field private final d:Ll1/t;


# direct methods
.method public constructor <init>(Ll1/l;Ll1/t;Lm1/m;)V
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {p0, p1, p2, p3, v0}, Lm1/o;-><init>(Ll1/l;Ll1/t;Lm1/m;Ljava/util/List;)V

    return-void
.end method

.method public constructor <init>(Ll1/l;Ll1/t;Lm1/m;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            "Ll1/t;",
            "Lm1/m;",
            "Ljava/util/List<",
            "Lm1/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1, p3, p4}, Lm1/f;-><init>(Ll1/l;Lm1/m;Ljava/util/List;)V

    iput-object p2, p0, Lm1/o;->d:Ll1/t;

    return-void
.end method


# virtual methods
.method public a(Ll1/s;Lm1/d;Lx0/o;)Lm1/d;
    .locals 1

    invoke-virtual {p0, p1}, Lm1/f;->n(Ll1/s;)V

    invoke-virtual {p0}, Lm1/f;->h()Lm1/m;

    move-result-object v0

    invoke-virtual {v0, p1}, Lm1/m;->e(Ll1/s;)Z

    move-result v0

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    invoke-virtual {p0, p3, p1}, Lm1/f;->l(Lx0/o;Ll1/s;)Ljava/util/Map;

    move-result-object p2

    iget-object p3, p0, Lm1/o;->d:Ll1/t;

    invoke-virtual {p3}, Ll1/t;->c()Ll1/t;

    move-result-object p3

    invoke-virtual {p3, p2}, Ll1/t;->m(Ljava/util/Map;)V

    invoke-virtual {p1}, Ll1/s;->j()Ll1/w;

    move-result-object p2

    invoke-virtual {p1, p2, p3}, Ll1/s;->l(Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p1

    invoke-virtual {p1}, Ll1/s;->u()Ll1/s;

    const/4 p1, 0x0

    return-object p1
.end method

.method public b(Ll1/s;Lm1/i;)V
    .locals 2

    invoke-virtual {p0, p1}, Lm1/f;->n(Ll1/s;)V

    iget-object v0, p0, Lm1/o;->d:Ll1/t;

    invoke-virtual {v0}, Ll1/t;->c()Ll1/t;

    move-result-object v0

    invoke-virtual {p2}, Lm1/i;->a()Ljava/util/List;

    move-result-object v1

    invoke-virtual {p0, p1, v1}, Lm1/f;->m(Ll1/s;Ljava/util/List;)Ljava/util/Map;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/t;->m(Ljava/util/Map;)V

    invoke-virtual {p2}, Lm1/i;->b()Ll1/w;

    move-result-object p2

    invoke-virtual {p1, p2, v0}, Ll1/s;->l(Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p1

    invoke-virtual {p1}, Ll1/s;->t()Ll1/s;

    return-void
.end method

.method public e()Lm1/d;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_3

    const-class v2, Lm1/o;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lm1/o;

    invoke-virtual {p0, p1}, Lm1/f;->i(Lm1/f;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Lm1/o;->d:Ll1/t;

    iget-object v3, p1, Lm1/o;->d:Ll1/t;

    invoke-virtual {v2, v3}, Ll1/t;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p0}, Lm1/f;->f()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p1}, Lm1/f;->f()Ljava/util/List;

    move-result-object p1

    invoke-interface {v2, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_3
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Lm1/f;->j()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm1/o;->d:Ll1/t;

    invoke-virtual {v1}, Ll1/t;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public o()Ll1/t;
    .locals 1

    iget-object v0, p0, Lm1/o;->d:Ll1/t;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SetMutation{"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lm1/f;->k()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/o;->d:Ll1/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
