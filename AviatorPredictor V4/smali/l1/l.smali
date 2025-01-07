.class public final Ll1/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ll1/l;",
        ">;"
    }
.end annotation


# static fields
.field private static final f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Lc1/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final e:Ll1/u;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ll1/k;->e:Ll1/k;

    sput-object v0, Ll1/l;->f:Ljava/util/Comparator;

    new-instance v1, Lc1/e;

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lc1/e;-><init>(Ljava/util/List;Ljava/util/Comparator;)V

    sput-object v1, Ll1/l;->g:Lc1/e;

    return-void
.end method

.method private constructor <init>(Ll1/u;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ll1/l;->v(Ll1/u;)Z

    move-result v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string v2, "Not a document key path: %s"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-object p1, p0, Ll1/l;->e:Ll1/u;

    return-void
.end method

.method public static d()Ljava/util/Comparator;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll1/l;->f:Ljava/util/Comparator;

    return-object v0
.end method

.method public static h()Ll1/l;
    .locals 1

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ll1/l;->p(Ljava/util/List;)Ll1/l;

    move-result-object v0

    return-object v0
.end method

.method public static i()Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    sget-object v0, Ll1/l;->g:Lc1/e;

    return-object v0
.end method

.method public static k(Ljava/lang/String;)Ll1/l;
    .locals 5

    invoke-static {p0}, Ll1/u;->x(Ljava/lang/String;)Ll1/u;

    move-result-object p0

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x0

    if-le v0, v2, :cond_0

    invoke-virtual {p0, v3}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "projects"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    const-string v4, "databases"

    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0, v2}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    const-string v2, "documents"

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    new-array v1, v1, [Ljava/lang/Object;

    aput-object p0, v1, v3

    const-string v2, "Tried to parse an invalid key: %s"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    const/4 v0, 0x5

    invoke-virtual {p0, v0}, Ll1/e;->t(I)Ll1/e;

    move-result-object p0

    check-cast p0, Ll1/u;

    invoke-static {p0}, Ll1/l;->n(Ll1/u;)Ll1/l;

    move-result-object p0

    return-object p0
.end method

.method public static n(Ll1/u;)Ll1/l;
    .locals 1

    new-instance v0, Ll1/l;

    invoke-direct {v0, p0}, Ll1/l;-><init>(Ll1/u;)V

    return-object v0
.end method

.method public static p(Ljava/util/List;)Ll1/l;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ll1/l;"
        }
    .end annotation

    new-instance v0, Ll1/l;

    invoke-static {p0}, Ll1/u;->w(Ljava/util/List;)Ll1/u;

    move-result-object p0

    invoke-direct {v0, p0}, Ll1/l;-><init>(Ll1/u;)V

    return-object v0
.end method

.method public static v(Ll1/u;)Z
    .locals 0

    invoke-virtual {p0}, Ll1/e;->s()I

    move-result p0

    rem-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll1/l;

    invoke-virtual {p0, p1}, Ll1/l;->g(Ll1/l;)I

    move-result p1

    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    const-class v0, Ll1/l;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll1/l;

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    iget-object p1, p1, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0, p1}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public g(Ll1/l;)I
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    iget-object p1, p1, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0, p1}, Ll1/e;->i(Ll1/e;)I

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->hashCode()I

    move-result v0

    return v0
.end method

.method public q()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->s()I

    move-result v1

    add-int/lit8 v1, v1, -0x2

    invoke-virtual {v0, v1}, Ll1/e;->p(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public r()Ll1/u;
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->u()Ll1/e;

    move-result-object v0

    check-cast v0, Ll1/u;

    return-object v0
.end method

.method public s()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->n()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public t()Ll1/u;
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    invoke-virtual {v0}, Ll1/e;->s()I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_0

    iget-object v0, p0, Ll1/l;->e:Ll1/u;

    iget-object v2, v0, Ll1/e;->e:Ljava/util/List;

    invoke-virtual {v0}, Ll1/e;->s()I

    move-result v0

    sub-int/2addr v0, v1

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
