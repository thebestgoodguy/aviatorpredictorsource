.class public final Li1/x0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/x0$b;,
        Li1/x0$a;
    }
.end annotation


# static fields
.field private static final k:Li1/w0;

.field private static final l:Li1/w0;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/w0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/w0;",
            ">;"
        }
    .end annotation
.end field

.field private c:Li1/c1;

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/r;",
            ">;"
        }
    .end annotation
.end field

.field private final e:Ll1/u;

.field private final f:Ljava/lang/String;

.field private final g:J

.field private final h:Li1/x0$a;

.field private final i:Li1/i;

.field private final j:Li1/i;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Li1/w0$a;->f:Li1/w0$a;

    sget-object v1, Ll1/r;->f:Ll1/r;

    invoke-static {v0, v1}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object v0

    sput-object v0, Li1/x0;->k:Li1/w0;

    sget-object v0, Li1/w0$a;->g:Li1/w0$a;

    invoke-static {v0, v1}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object v0

    sput-object v0, Li1/x0;->l:Li1/w0;

    return-void
.end method

.method public constructor <init>(Ll1/u;Ljava/lang/String;)V
    .locals 10

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v3

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v4

    sget-object v7, Li1/x0$a;->e:Li1/x0$a;

    const-wide/16 v5, -0x1

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-void
.end method

.method public constructor <init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/u;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Li1/r;",
            ">;",
            "Ljava/util/List<",
            "Li1/w0;",
            ">;J",
            "Li1/x0$a;",
            "Li1/i;",
            "Li1/i;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/x0;->e:Ll1/u;

    iput-object p2, p0, Li1/x0;->f:Ljava/lang/String;

    iput-object p4, p0, Li1/x0;->a:Ljava/util/List;

    iput-object p3, p0, Li1/x0;->d:Ljava/util/List;

    iput-wide p5, p0, Li1/x0;->g:J

    iput-object p7, p0, Li1/x0;->h:Li1/x0$a;

    iput-object p8, p0, Li1/x0;->i:Li1/i;

    iput-object p9, p0, Li1/x0;->j:Li1/i;

    return-void
.end method

.method private A(Ll1/i;)Z
    .locals 4

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object v0

    invoke-virtual {v0}, Ll1/l;->t()Ll1/u;

    move-result-object v0

    iget-object v1, p0, Li1/x0;->f:Ljava/lang/String;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    iget-object v1, p0, Li1/x0;->f:Ljava/lang/String;

    invoke-virtual {p1, v1}, Ll1/l;->u(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Li1/x0;->e:Ll1/u;

    invoke-virtual {p1, v0}, Ll1/e;->r(Ll1/e;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    :cond_0
    return v2

    :cond_1
    iget-object p1, p0, Li1/x0;->e:Ll1/u;

    invoke-static {p1}, Ll1/l;->v(Ll1/u;)Z

    move-result p1

    if-eqz p1, :cond_2

    iget-object p1, p0, Li1/x0;->e:Ll1/u;

    invoke-virtual {p1, v0}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    iget-object p1, p0, Li1/x0;->e:Ll1/u;

    invoke-virtual {p1, v0}, Ll1/e;->r(Ll1/e;)Z

    move-result p1

    if-eqz p1, :cond_3

    iget-object p1, p0, Li1/x0;->e:Ll1/u;

    invoke-virtual {p1}, Ll1/e;->s()I

    move-result p1

    invoke-virtual {v0}, Ll1/e;->s()I

    move-result v0

    sub-int/2addr v0, v3

    if-ne p1, v0, :cond_3

    const/4 v2, 0x1

    :cond_3
    return v2
.end method

.method public static b(Ll1/u;)Li1/x0;
    .locals 2

    new-instance v0, Li1/x0;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;)V

    return-object v0
.end method

.method private x(Ll1/i;)Z
    .locals 3

    iget-object v0, p0, Li1/x0;->i:Li1/i;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Li1/i;->f(Ljava/util/List;Ll1/i;)Z

    move-result v0

    if-nez v0, :cond_0

    return v1

    :cond_0
    iget-object v0, p0, Li1/x0;->j:Li1/i;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2, p1}, Li1/i;->e(Ljava/util/List;Ll1/i;)Z

    move-result p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private y(Ll1/i;)Z
    .locals 2

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/r;

    invoke-virtual {v1, p1}, Li1/r;->e(Ll1/i;)Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method

.method private z(Ll1/i;)Z
    .locals 4

    invoke-virtual {p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/w0;

    invoke-virtual {v1}, Li1/w0;->c()Ll1/r;

    move-result-object v2

    sget-object v3, Ll1/r;->f:Ll1/r;

    invoke-virtual {v2, v3}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    iget-object v1, v1, Li1/w0;->b:Ll1/r;

    invoke-interface {p1, v1}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_1
    const/4 p1, 0x1

    return p1
.end method


# virtual methods
.method public B(Li1/w0;)Li1/x0;
    .locals 10

    invoke-virtual {p0}, Li1/x0;->s()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const/4 v1, 0x0

    new-array v2, v1, [Ljava/lang/Object;

    const-string v3, "No ordering is allowed for document query"

    invoke-static {v0, v3, v2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Li1/x0;->q()Ll1/r;

    move-result-object v0

    if-eqz v0, :cond_1

    iget-object v2, p1, Li1/w0;->b:Ll1/r;

    invoke-virtual {v0, v2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-array p1, v1, [Ljava/lang/Object;

    const-string v0, "First orderBy must match inequality field"

    invoke-static {v0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :cond_1
    :goto_0
    new-instance v4, Ljava/util/ArrayList;

    iget-object v0, p0, Li1/x0;->a:Ljava/util/List;

    invoke-direct {v4, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v4, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Li1/x0;

    iget-object v1, p0, Li1/x0;->e:Ll1/u;

    iget-object v2, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-wide v5, p0, Li1/x0;->g:J

    iget-object v7, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v8, p0, Li1/x0;->i:Li1/i;

    iget-object v9, p0, Li1/x0;->j:Li1/i;

    move-object v0, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object p1
.end method

.method public C(Li1/i;)Li1/x0;
    .locals 11

    new-instance v10, Li1/x0;

    iget-object v1, p0, Li1/x0;->e:Ll1/u;

    iget-object v2, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-object v4, p0, Li1/x0;->a:Ljava/util/List;

    iget-wide v5, p0, Li1/x0;->g:J

    iget-object v7, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v9, p0, Li1/x0;->j:Li1/i;

    move-object v0, v10

    move-object v8, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object v10
.end method

.method public D()Li1/c1;
    .locals 21

    move-object/from16 v0, p0

    iget-object v1, v0, Li1/x0;->c:Li1/c1;

    if-nez v1, :cond_5

    iget-object v1, v0, Li1/x0;->h:Li1/x0$a;

    sget-object v2, Li1/x0$a;->e:Li1/x0$a;

    if-ne v1, v2, :cond_0

    new-instance v1, Li1/c1;

    invoke-virtual/range {p0 .. p0}, Li1/x0;->n()Ll1/u;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Li1/x0;->f()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Li1/x0;->i()Ljava/util/List;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v7

    iget-wide v8, v0, Li1/x0;->g:J

    invoke-virtual/range {p0 .. p0}, Li1/x0;->o()Li1/i;

    move-result-object v10

    invoke-virtual/range {p0 .. p0}, Li1/x0;->g()Li1/i;

    move-result-object v11

    move-object v3, v1

    invoke-direct/range {v3 .. v11}, Li1/c1;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/i;Li1/i;)V

    iput-object v1, v0, Li1/x0;->c:Li1/c1;

    goto/16 :goto_2

    :cond_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/w0;

    invoke-virtual {v3}, Li1/w0;->b()Li1/w0$a;

    move-result-object v4

    sget-object v5, Li1/w0$a;->g:Li1/w0$a;

    if-ne v4, v5, :cond_1

    sget-object v5, Li1/w0$a;->f:Li1/w0$a;

    :cond_1
    invoke-virtual {v3}, Li1/w0;->c()Ll1/r;

    move-result-object v3

    invoke-static {v5, v3}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object v3

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    iget-object v2, v0, Li1/x0;->j:Li1/i;

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    new-instance v4, Li1/i;

    invoke-virtual {v2}, Li1/i;->b()Ljava/util/List;

    move-result-object v2

    iget-object v5, v0, Li1/x0;->j:Li1/i;

    invoke-virtual {v5}, Li1/i;->c()Z

    move-result v5

    invoke-direct {v4, v2, v5}, Li1/i;-><init>(Ljava/util/List;Z)V

    move-object/from16 v19, v4

    goto :goto_1

    :cond_3
    move-object/from16 v19, v3

    :goto_1
    iget-object v2, v0, Li1/x0;->i:Li1/i;

    if-eqz v2, :cond_4

    new-instance v3, Li1/i;

    invoke-virtual {v2}, Li1/i;->b()Ljava/util/List;

    move-result-object v2

    iget-object v4, v0, Li1/x0;->i:Li1/i;

    invoke-virtual {v4}, Li1/i;->c()Z

    move-result v4

    invoke-direct {v3, v2, v4}, Li1/i;-><init>(Ljava/util/List;Z)V

    :cond_4
    move-object/from16 v20, v3

    new-instance v2, Li1/c1;

    invoke-virtual/range {p0 .. p0}, Li1/x0;->n()Ll1/u;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Li1/x0;->f()Ljava/lang/String;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Li1/x0;->i()Ljava/util/List;

    move-result-object v15

    iget-wide v3, v0, Li1/x0;->g:J

    move-object v12, v2

    move-object/from16 v16, v1

    move-wide/from16 v17, v3

    invoke-direct/range {v12 .. v20}, Li1/c1;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/i;Li1/i;)V

    iput-object v2, v0, Li1/x0;->c:Li1/c1;

    :cond_5
    :goto_2
    iget-object v1, v0, Li1/x0;->c:Li1/c1;

    return-object v1
.end method

.method public a(Ll1/u;)Li1/x0;
    .locals 11

    new-instance v10, Li1/x0;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-object v4, p0, Li1/x0;->a:Ljava/util/List;

    iget-wide v5, p0, Li1/x0;->g:J

    iget-object v7, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v8, p0, Li1/x0;->i:Li1/i;

    iget-object v9, p0, Li1/x0;->j:Li1/i;

    const/4 v2, 0x0

    move-object v0, v10

    move-object v1, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object v10
.end method

.method public c()Ljava/util/Comparator;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Comparator<",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    new-instance v0, Li1/x0$b;

    invoke-virtual {p0}, Li1/x0;->m()Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Li1/x0$b;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public d(Li1/i;)Li1/x0;
    .locals 11

    new-instance v10, Li1/x0;

    iget-object v1, p0, Li1/x0;->e:Ll1/u;

    iget-object v2, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-object v4, p0, Li1/x0;->a:Ljava/util/List;

    iget-wide v5, p0, Li1/x0;->g:J

    iget-object v7, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v8, p0, Li1/x0;->i:Li1/i;

    move-object v0, v10

    move-object v9, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object v10
.end method

.method public e(Li1/r;)Li1/x0;
    .locals 13

    invoke-virtual {p0}, Li1/x0;->s()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    const/4 v2, 0x0

    new-array v3, v2, [Ljava/lang/Object;

    const-string v4, "No filter is allowed for document query"

    invoke-static {v0, v4, v3}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Li1/r;->c()Ll1/r;

    move-result-object v0

    invoke-virtual {p0}, Li1/x0;->q()Ll1/r;

    move-result-object v3

    if-eqz v3, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {v3, v0}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v3, 0x1

    :goto_1
    new-array v4, v2, [Ljava/lang/Object;

    const-string v5, "Query must only have one inequality field"

    invoke-static {v3, v5, v4}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v3, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    if-eqz v0, :cond_3

    iget-object v3, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Li1/w0;

    iget-object v3, v3, Li1/w0;->b:Ll1/r;

    invoke-virtual {v3, v0}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_2
    new-array v0, v2, [Ljava/lang/Object;

    const-string v2, "First orderBy must match inequality field"

    invoke-static {v1, v2, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance v6, Ljava/util/ArrayList;

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    invoke-direct {v6, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-interface {v6, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    new-instance p1, Li1/x0;

    iget-object v4, p0, Li1/x0;->e:Ll1/u;

    iget-object v5, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v7, p0, Li1/x0;->a:Ljava/util/List;

    iget-wide v8, p0, Li1/x0;->g:J

    iget-object v10, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v11, p0, Li1/x0;->i:Li1/i;

    iget-object v12, p0, Li1/x0;->j:Li1/i;

    move-object v3, p1

    invoke-direct/range {v3 .. v12}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-class v1, Li1/x0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Li1/x0;

    iget-object v1, p0, Li1/x0;->h:Li1/x0$a;

    iget-object v2, p1, Li1/x0;->h:Li1/x0$a;

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    invoke-virtual {p0}, Li1/x0;->D()Li1/c1;

    move-result-object v0

    invoke-virtual {p1}, Li1/x0;->D()Li1/c1;

    move-result-object p1

    invoke-virtual {v0, p1}, Li1/c1;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li1/x0;->f:Ljava/lang/String;

    return-object v0
.end method

.method public g()Li1/i;
    .locals 1

    iget-object v0, p0, Li1/x0;->j:Li1/i;

    return-object v0
.end method

.method public h()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/w0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/x0;->a:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Li1/x0;->D()Li1/c1;

    move-result-object v0

    invoke-virtual {v0}, Li1/c1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Li1/x0;->h:Li1/x0$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/r;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    return-object v0
.end method

.method public j()Ll1/r;
    .locals 2

    iget-object v0, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    iget-object v0, p0, Li1/x0;->a:Ljava/util/List;

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/w0;

    invoke-virtual {v0}, Li1/w0;->c()Ll1/r;

    move-result-object v0

    return-object v0
.end method

.method public k()J
    .locals 2

    iget-wide v0, p0, Li1/x0;->g:J

    return-wide v0
.end method

.method public l()Li1/x0$a;
    .locals 1

    iget-object v0, p0, Li1/x0;->h:Li1/x0$a;

    return-object v0
.end method

.method public m()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Li1/w0;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/x0;->b:Ljava/util/List;

    if-nez v0, :cond_7

    invoke-virtual {p0}, Li1/x0;->q()Ll1/r;

    move-result-object v0

    invoke-virtual {p0}, Li1/x0;->j()Ll1/r;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {v0}, Ll1/r;->z()Z

    move-result v1

    if-eqz v1, :cond_0

    sget-object v0, Li1/x0;->k:Li1/w0;

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    new-array v1, v1, [Li1/w0;

    sget-object v4, Li1/w0$a;->f:Li1/w0$a;

    invoke-static {v4, v0}, Li1/w0;->d(Li1/w0$a;Ll1/r;)Li1/w0;

    move-result-object v0

    aput-object v0, v1, v2

    sget-object v0, Li1/x0;->k:Li1/w0;

    aput-object v0, v1, v3

    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    :cond_1
    :goto_0
    iput-object v0, p0, Li1/x0;->b:Ljava/util/List;

    goto :goto_4

    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li1/w0;

    invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v4}, Li1/w0;->c()Ll1/r;

    move-result-object v4

    sget-object v5, Ll1/r;->f:Ll1/r;

    invoke-virtual {v4, v5}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/4 v2, 0x1

    goto :goto_1

    :cond_4
    if-nez v2, :cond_1

    iget-object v1, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    if-lez v1, :cond_5

    iget-object v1, p0, Li1/x0;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v2, v3

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/w0;

    invoke-virtual {v1}, Li1/w0;->b()Li1/w0$a;

    move-result-object v1

    goto :goto_2

    :cond_5
    sget-object v1, Li1/w0$a;->f:Li1/w0$a;

    :goto_2
    sget-object v2, Li1/w0$a;->f:Li1/w0$a;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    sget-object v1, Li1/x0;->k:Li1/w0;

    goto :goto_3

    :cond_6
    sget-object v1, Li1/x0;->l:Li1/w0;

    :goto_3
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_7
    :goto_4
    iget-object v0, p0, Li1/x0;->b:Ljava/util/List;

    return-object v0
.end method

.method public n()Ll1/u;
    .locals 1

    iget-object v0, p0, Li1/x0;->e:Ll1/u;

    return-object v0
.end method

.method public o()Li1/i;
    .locals 1

    iget-object v0, p0, Li1/x0;->i:Li1/i;

    return-object v0
.end method

.method public p()Z
    .locals 5

    iget-wide v0, p0, Li1/x0;->g:J

    const-wide/16 v2, -0x1

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q()Ll1/r;
    .locals 2

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Li1/r;

    invoke-virtual {v1}, Li1/r;->c()Ll1/r;

    move-result-object v1

    if-eqz v1, :cond_0

    return-object v1

    :cond_1
    const/4 v0, 0x0

    return-object v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Li1/x0;->f:Ljava/lang/String;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public s()Z
    .locals 1

    iget-object v0, p0, Li1/x0;->e:Ll1/u;

    invoke-static {v0}, Ll1/l;->v(Ll1/u;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li1/x0;->f:Ljava/lang/String;

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public t(J)Li1/x0;
    .locals 11

    new-instance v10, Li1/x0;

    iget-object v1, p0, Li1/x0;->e:Ll1/u;

    iget-object v2, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-object v4, p0, Li1/x0;->a:Ljava/util/List;

    sget-object v7, Li1/x0$a;->e:Li1/x0$a;

    iget-object v8, p0, Li1/x0;->i:Li1/i;

    iget-object v9, p0, Li1/x0;->j:Li1/i;

    move-object v0, v10

    move-wide v5, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object v10
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Query(target="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li1/x0;->D()Li1/c1;

    move-result-object v1

    invoke-virtual {v1}, Li1/c1;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ";limitType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/x0;->h:Li1/x0$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u(J)Li1/x0;
    .locals 11

    new-instance v10, Li1/x0;

    iget-object v1, p0, Li1/x0;->e:Ll1/u;

    iget-object v2, p0, Li1/x0;->f:Ljava/lang/String;

    iget-object v3, p0, Li1/x0;->d:Ljava/util/List;

    iget-object v4, p0, Li1/x0;->a:Ljava/util/List;

    sget-object v7, Li1/x0$a;->f:Li1/x0$a;

    iget-object v8, p0, Li1/x0;->i:Li1/i;

    iget-object v9, p0, Li1/x0;->j:Li1/i;

    move-object v0, v10

    move-wide v5, p1

    invoke-direct/range {v0 .. v9}, Li1/x0;-><init>(Ll1/u;Ljava/lang/String;Ljava/util/List;Ljava/util/List;JLi1/x0$a;Li1/i;Li1/i;)V

    return-object v10
.end method

.method public v(Ll1/i;)Z
    .locals 1

    invoke-interface {p1}, Ll1/i;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Li1/x0;->A(Ll1/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Li1/x0;->z(Ll1/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Li1/x0;->y(Ll1/i;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Li1/x0;->x(Ll1/i;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public w()Z
    .locals 6

    iget-object v0, p0, Li1/x0;->d:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    if-eqz v0, :cond_0

    iget-wide v2, p0, Li1/x0;->g:J

    const-wide/16 v4, -0x1

    cmp-long v0, v2, v4

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/x0;->i:Li1/i;

    if-nez v0, :cond_0

    iget-object v0, p0, Li1/x0;->j:Li1/i;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Li1/x0;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Li1/x0;->h()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, Li1/x0;->j()Ll1/r;

    move-result-object v0

    invoke-virtual {v0}, Ll1/r;->z()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    return v1
.end method
