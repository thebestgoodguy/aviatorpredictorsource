.class public final La4/c$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La4/c;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Lx3/c;",
        ">;"
    }
.end annotation


# instance fields
.field private e:I

.field private f:I

.field private g:I

.field private h:Lx3/c;

.field private i:I

.field final synthetic j:La4/c;


# direct methods
.method constructor <init>(La4/c;)V
    .locals 2

    iput-object p1, p0, La4/c$a;->j:La4/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, La4/c$a;->e:I

    invoke-static {p1}, La4/c;->d(La4/c;)I

    move-result v0

    invoke-static {p1}, La4/c;->b(La4/c;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    const/4 v1, 0x0

    invoke-static {v0, v1, p1}, Lx3/d;->e(III)I

    move-result p1

    iput p1, p0, La4/c$a;->f:I

    iput p1, p0, La4/c$a;->g:I

    return-void
.end method

.method private final c()V
    .locals 6

    iget v0, p0, La4/c$a;->g:I

    const/4 v1, 0x0

    if-gez v0, :cond_0

    iput v1, p0, La4/c$a;->e:I

    const/4 v0, 0x0

    iput-object v0, p0, La4/c$a;->h:Lx3/c;

    goto/16 :goto_3

    :cond_0
    iget-object v0, p0, La4/c$a;->j:La4/c;

    invoke-static {v0}, La4/c;->c(La4/c;)I

    move-result v0

    const/4 v2, -0x1

    const/4 v3, 0x1

    if-lez v0, :cond_1

    iget v0, p0, La4/c$a;->i:I

    add-int/2addr v0, v3

    iput v0, p0, La4/c$a;->i:I

    iget-object v4, p0, La4/c$a;->j:La4/c;

    invoke-static {v4}, La4/c;->c(La4/c;)I

    move-result v4

    if-ge v0, v4, :cond_2

    :cond_1
    iget v0, p0, La4/c$a;->g:I

    iget-object v4, p0, La4/c$a;->j:La4/c;

    invoke-static {v4}, La4/c;->b(La4/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    move-result v4

    if-le v0, v4, :cond_3

    :cond_2
    new-instance v0, Lx3/c;

    iget v1, p0, La4/c$a;->f:I

    iget-object v4, p0, La4/c$a;->j:La4/c;

    invoke-static {v4}, La4/c;->b(La4/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, La4/n;->u(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lx3/c;-><init>(II)V

    :goto_0
    iput-object v0, p0, La4/c$a;->h:Lx3/c;

    :goto_1
    iput v2, p0, La4/c$a;->g:I

    goto :goto_2

    :cond_3
    iget-object v0, p0, La4/c$a;->j:La4/c;

    invoke-static {v0}, La4/c;->a(La4/c;)Lu3/p;

    move-result-object v0

    iget-object v4, p0, La4/c$a;->j:La4/c;

    invoke-static {v4}, La4/c;->b(La4/c;)Ljava/lang/CharSequence;

    move-result-object v4

    iget v5, p0, La4/c$a;->g:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v0, v4, v5}, Lu3/p;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk3/l;

    if-nez v0, :cond_4

    new-instance v0, Lx3/c;

    iget v1, p0, La4/c$a;->f:I

    iget-object v4, p0, La4/c$a;->j:La4/c;

    invoke-static {v4}, La4/c;->b(La4/c;)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-static {v4}, La4/n;->u(Ljava/lang/CharSequence;)I

    move-result v4

    invoke-direct {v0, v1, v4}, Lx3/c;-><init>(II)V

    goto :goto_0

    :cond_4
    invoke-virtual {v0}, Lk3/l;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v0}, Lk3/l;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v4, p0, La4/c$a;->f:I

    invoke-static {v4, v2}, Lx3/d;->g(II)Lx3/c;

    move-result-object v4

    iput-object v4, p0, La4/c$a;->h:Lx3/c;

    add-int/2addr v2, v0

    iput v2, p0, La4/c$a;->f:I

    if-nez v0, :cond_5

    const/4 v1, 0x1

    :cond_5
    add-int/2addr v2, v1

    goto :goto_1

    :goto_2
    iput v3, p0, La4/c$a;->e:I

    :goto_3
    return-void
.end method


# virtual methods
.method public d()Lx3/c;
    .locals 3

    iget v0, p0, La4/c$a;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, La4/c$a;->c()V

    :cond_0
    iget v0, p0, La4/c$a;->e:I

    if-eqz v0, :cond_1

    iget-object v0, p0, La4/c$a;->h:Lx3/c;

    const-string v2, "null cannot be cast to non-null type kotlin.ranges.IntRange"

    invoke-static {v0, v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    const/4 v2, 0x0

    iput-object v2, p0, La4/c$a;->h:Lx3/c;

    iput v1, p0, La4/c$a;->e:I

    return-object v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, La4/c$a;->e:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, La4/c$a;->c()V

    :cond_0
    iget v0, p0, La4/c$a;->e:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, La4/c$a;->d()Lx3/c;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
