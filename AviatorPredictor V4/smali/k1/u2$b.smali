.class Lk1/u2$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/u2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "b"
.end annotation


# instance fields
.field private final a:Lk1/u2;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private e:I

.field private final f:Ljava/util/Iterator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lk1/u2;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/u2;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk1/u2$b;->e:I

    iput-object p1, p0, Lk1/u2$b;->a:Lk1/u2;

    iput-object p2, p0, Lk1/u2$b;->b:Ljava/lang/String;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lk1/u2$b;->d:Ljava/util/List;

    iput-object p4, p0, Lk1/u2$b;->c:Ljava/lang/String;

    invoke-interface {p3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lk1/u2$b;->f:Ljava/util/Iterator;

    return-void
.end method

.method constructor <init>(Lk1/u2;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lk1/u2;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lk1/u2$b;->e:I

    iput-object p1, p0, Lk1/u2$b;->a:Lk1/u2;

    iput-object p2, p0, Lk1/u2$b;->b:Ljava/lang/String;

    iput-object p3, p0, Lk1/u2$b;->d:Ljava/util/List;

    iput-object p5, p0, Lk1/u2$b;->c:Ljava/lang/String;

    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lk1/u2$b;->f:Ljava/util/Iterator;

    return-void
.end method

.method private b()[Ljava/lang/Object;
    .locals 3

    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lk1/u2$b;->d:Ljava/util/List;

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lk1/u2$b;->f:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lk1/u2$b;->d:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    rsub-int v2, v2, 0x384

    if-ge v1, v2, :cond_0

    iget-object v2, p0, Lk1/u2$b;->f:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method a()V
    .locals 6

    iget v0, p0, Lk1/u2$b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lk1/u2$b;->e:I

    invoke-direct {p0}, Lk1/u2$b;->b()[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lk1/u2$b;->a:Lk1/u2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lk1/u2$b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v0

    const-string v4, "?"

    const-string v5, ", "

    invoke-static {v4, v3, v5}, Lp1/g0;->x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lk1/u2$b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Lk1/u2;->v(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method

.method c()I
    .locals 1

    iget v0, p0, Lk1/u2$b;->e:I

    return v0
.end method

.method d()Z
    .locals 1

    iget-object v0, p0, Lk1/u2$b;->f:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method e()Lk1/u2$d;
    .locals 6

    iget v0, p0, Lk1/u2$b;->e:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lk1/u2$b;->e:I

    invoke-direct {p0}, Lk1/u2$b;->b()[Ljava/lang/Object;

    move-result-object v0

    iget-object v1, p0, Lk1/u2$b;->a:Lk1/u2;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v3, p0, Lk1/u2$b;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    array-length v3, v0

    const-string v4, "?"

    const-string v5, ", "

    invoke-static {v4, v3, v5}, Lp1/g0;->x(Ljava/lang/CharSequence;ILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lk1/u2$b;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lk1/u2;->E(Ljava/lang/String;)Lk1/u2$d;

    move-result-object v1

    invoke-virtual {v1, v0}, Lk1/u2$d;->b([Ljava/lang/Object;)Lk1/u2$d;

    move-result-object v0

    return-object v0
.end method
