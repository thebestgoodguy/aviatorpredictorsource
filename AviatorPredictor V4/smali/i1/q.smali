.class public Li1/q;
.super Li1/r;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/q$b;
    }
.end annotation


# instance fields
.field private final a:Li1/q$b;

.field private final b:Lx1/x;

.field private final c:Ll1/r;


# direct methods
.method protected constructor <init>(Ll1/r;Li1/q$b;Lx1/x;)V
    .locals 0

    invoke-direct {p0}, Li1/r;-><init>()V

    iput-object p1, p0, Li1/q;->c:Ll1/r;

    iput-object p2, p0, Li1/q;->a:Li1/q$b;

    iput-object p3, p0, Li1/q;->b:Lx1/x;

    return-void
.end method

.method public static f(Ll1/r;Li1/q$b;Lx1/x;)Li1/q;
    .locals 4

    invoke-virtual {p0}, Ll1/r;->z()Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object v0, Li1/q$b;->n:Li1/q$b;

    if-ne p1, v0, :cond_0

    new-instance p1, Li1/o0;

    invoke-direct {p1, p0, p2}, Li1/o0;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_0
    sget-object v0, Li1/q$b;->o:Li1/q$b;

    if-ne p1, v0, :cond_1

    new-instance p1, Li1/p0;

    invoke-direct {p1, p0, p2}, Li1/p0;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_1
    sget-object v0, Li1/q$b;->l:Li1/q$b;

    const/4 v1, 0x0

    if-eq p1, v0, :cond_2

    sget-object v0, Li1/q$b;->m:Li1/q$b;

    if-eq p1, v0, :cond_2

    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x0

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, "queries don\'t make sense on document keys"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v0, Li1/n0;

    invoke-direct {v0, p0, p1, p2}, Li1/n0;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    return-object v0

    :cond_3
    sget-object v0, Li1/q$b;->l:Li1/q$b;

    if-ne p1, v0, :cond_4

    new-instance p1, Li1/f;

    invoke-direct {p1, p0, p2}, Li1/f;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_4
    sget-object v0, Li1/q$b;->n:Li1/q$b;

    if-ne p1, v0, :cond_5

    new-instance p1, Li1/m0;

    invoke-direct {p1, p0, p2}, Li1/m0;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_5
    sget-object v0, Li1/q$b;->m:Li1/q$b;

    if-ne p1, v0, :cond_6

    new-instance p1, Li1/e;

    invoke-direct {p1, p0, p2}, Li1/e;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_6
    sget-object v0, Li1/q$b;->o:Li1/q$b;

    if-ne p1, v0, :cond_7

    new-instance p1, Li1/u0;

    invoke-direct {p1, p0, p2}, Li1/u0;-><init>(Ll1/r;Lx1/x;)V

    return-object p1

    :cond_7
    new-instance v0, Li1/q;

    invoke-direct {v0, p0, p1, p2}, Li1/q;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    return-object v0
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, Li1/q;->g()Ll1/r;

    move-result-object v1

    invoke-virtual {v1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li1/q;->h()Li1/q$b;

    move-result-object v1

    invoke-virtual {v1}, Li1/q$b;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li1/q;->i()Lx1/x;

    move-result-object v1

    invoke-static {v1}, Ll1/y;->b(Lx1/x;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/r;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public c()Ll1/r;
    .locals 1

    invoke-virtual {p0}, Li1/q;->j()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/q;->g()Ll1/r;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public d()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/q;",
            ">;"
        }
    .end annotation

    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public e(Ll1/i;)Z
    .locals 4

    iget-object v0, p0, Li1/q;->c:Ll1/r;

    invoke-interface {p1, v0}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object p1

    iget-object v0, p0, Li1/q;->a:Li1/q$b;

    sget-object v1, Li1/q$b;->i:Li1/q$b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    if-eqz p1, :cond_0

    iget-object v0, p0, Li1/q;->b:Lx1/x;

    invoke-static {p1, v0}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result p1

    invoke-virtual {p0, p1}, Li1/q;->k(I)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_1
    if-eqz p1, :cond_2

    invoke-static {p1}, Ll1/y;->G(Lx1/x;)I

    move-result v0

    iget-object v1, p0, Li1/q;->b:Lx1/x;

    invoke-static {v1}, Ll1/y;->G(Lx1/x;)I

    move-result v1

    if-ne v0, v1, :cond_2

    iget-object v0, p0, Li1/q;->b:Lx1/x;

    invoke-static {p1, v0}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result p1

    invoke-virtual {p0, p1}, Li1/q;->k(I)Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Li1/q;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Li1/q;

    iget-object v1, p0, Li1/q;->a:Li1/q$b;

    iget-object v2, p1, Li1/q;->a:Li1/q$b;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Li1/q;->c:Ll1/r;

    iget-object v2, p1, Li1/q;->c:Ll1/r;

    invoke-virtual {v1, v2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v1, p0, Li1/q;->b:Lx1/x;

    iget-object p1, p1, Li1/q;->b:Lx1/x;

    invoke-virtual {v1, p1}, Lcom/google/protobuf/a0;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public g()Ll1/r;
    .locals 1

    iget-object v0, p0, Li1/q;->c:Ll1/r;

    return-object v0
.end method

.method public h()Li1/q$b;
    .locals 1

    iget-object v0, p0, Li1/q;->a:Li1/q$b;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li1/q;->a:Li1/q$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    const/16 v1, 0x47b

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li1/q;->c:Ll1/r;

    invoke-virtual {v0}, Ll1/e;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li1/q;->b:Lx1/x;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public i()Lx1/x;
    .locals 1

    iget-object v0, p0, Li1/q;->b:Lx1/x;

    return-object v0
.end method

.method public j()Z
    .locals 3

    const/4 v0, 0x6

    new-array v0, v0, [Li1/q$b;

    sget-object v1, Li1/q$b;->f:Li1/q$b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Li1/q$b;->g:Li1/q$b;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    sget-object v1, Li1/q$b;->j:Li1/q$b;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    sget-object v1, Li1/q$b;->k:Li1/q$b;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    sget-object v1, Li1/q$b;->i:Li1/q$b;

    const/4 v2, 0x4

    aput-object v1, v0, v2

    sget-object v1, Li1/q$b;->o:Li1/q$b;

    const/4 v2, 0x5

    aput-object v1, v0, v2

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iget-object v1, p0, Li1/q;->a:Li1/q$b;

    invoke-interface {v0, v1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method protected k(I)Z
    .locals 3

    sget-object v0, Li1/q$a;->a:[I

    iget-object v1, p0, Li1/q;->a:Li1/q$b;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    packed-switch v0, :pswitch_data_0

    new-array p1, v2, [Ljava/lang/Object;

    iget-object v0, p0, Li1/q;->a:Li1/q$b;

    aput-object v0, p1, v1

    const-string v0, "Unknown FieldFilter operator: %s"

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    if-ltz p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1

    :pswitch_1
    if-lez p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1

    :pswitch_2
    if-eqz p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1

    :pswitch_3
    if-nez p1, :cond_3

    const/4 v1, 0x1

    :cond_3
    return v1

    :pswitch_4
    if-gtz p1, :cond_4

    const/4 v1, 0x1

    :cond_4
    return v1

    :pswitch_5
    if-gez p1, :cond_5

    const/4 v1, 0x1

    :cond_5
    return v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Li1/q;->a()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
