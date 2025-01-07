.class public final Lm1/h;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lm1/g;

.field private final b:Ll1/w;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm1/i;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/google/protobuf/j;

.field private final e:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/w;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lm1/g;Ll1/w;Ljava/util/List;Lcom/google/protobuf/j;Lc1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/g;",
            "Ll1/w;",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;",
            "Lcom/google/protobuf/j;",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/w;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/h;->a:Lm1/g;

    iput-object p2, p0, Lm1/h;->b:Ll1/w;

    iput-object p3, p0, Lm1/h;->c:Ljava/util/List;

    iput-object p4, p0, Lm1/h;->d:Lcom/google/protobuf/j;

    iput-object p5, p0, Lm1/h;->e:Lc1/c;

    return-void
.end method

.method public static a(Lm1/g;Ll1/w;Ljava/util/List;Lcom/google/protobuf/j;)Lm1/h;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm1/g;",
            "Ll1/w;",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;",
            "Lcom/google/protobuf/j;",
            ")",
            "Lm1/h;"
        }
    .end annotation

    invoke-virtual {p0}, Lm1/g;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Lm1/g;->h()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v3

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v1, v2

    const-string v2, "Mutations sent %d must equal results received %d"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-static {}, Ll1/j;->c()Lc1/c;

    move-result-object v0

    invoke-virtual {p0}, Lm1/g;->h()Ljava/util/List;

    move-result-object v1

    move-object v9, v0

    :goto_1
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v0

    if-ge v3, v0, :cond_1

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/i;

    invoke-virtual {v0}, Lm1/i;->b()Ll1/w;

    move-result-object v0

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm1/f;

    invoke-virtual {v2}, Lm1/f;->g()Ll1/l;

    move-result-object v2

    invoke-virtual {v9, v2, v0}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v9

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    new-instance v0, Lm1/h;

    move-object v4, v0

    move-object v5, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v4 .. v9}, Lm1/h;-><init>(Lm1/g;Ll1/w;Ljava/util/List;Lcom/google/protobuf/j;Lc1/c;)V

    return-object v0
.end method


# virtual methods
.method public b()Lm1/g;
    .locals 1

    iget-object v0, p0, Lm1/h;->a:Lm1/g;

    return-object v0
.end method

.method public c()Ll1/w;
    .locals 1

    iget-object v0, p0, Lm1/h;->b:Ll1/w;

    return-object v0
.end method

.method public d()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/w;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/h;->e:Lc1/c;

    return-object v0
.end method

.method public e()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/h;->c:Ljava/util/List;

    return-object v0
.end method

.method public f()Lcom/google/protobuf/j;
    .locals 1

    iget-object v0, p0, Lm1/h;->d:Lcom/google/protobuf/j;

    return-object v0
.end method
