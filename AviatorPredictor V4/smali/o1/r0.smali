.class final Lo1/r0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private a:I

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ll1/l;",
            "Li1/n$a;",
            ">;"
        }
    .end annotation
.end field

.field private c:Z

.field private d:Lcom/google/protobuf/j;

.field private e:Z


# direct methods
.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lo1/r0;->a:I

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    iput-object v1, p0, Lo1/r0;->b:Ljava/util/Map;

    const/4 v1, 0x1

    iput-boolean v1, p0, Lo1/r0;->c:Z

    sget-object v1, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    iput-object v1, p0, Lo1/r0;->d:Lcom/google/protobuf/j;

    iput-boolean v0, p0, Lo1/r0;->e:Z

    return-void
.end method


# virtual methods
.method a(Ll1/l;Li1/n$a;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo1/r0;->c:Z

    iget-object v0, p0, Lo1/r0;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method b()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lo1/r0;->c:Z

    iget-object v0, p0, Lo1/r0;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method c()Z
    .locals 1

    iget-boolean v0, p0, Lo1/r0;->c:Z

    return v0
.end method

.method d()Z
    .locals 1

    iget-boolean v0, p0, Lo1/r0;->e:Z

    return v0
.end method

.method e()Z
    .locals 1

    iget v0, p0, Lo1/r0;->a:I

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method f()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo1/r0;->c:Z

    iput-boolean v0, p0, Lo1/r0;->e:Z

    return-void
.end method

.method g()V
    .locals 1

    iget v0, p0, Lo1/r0;->a:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lo1/r0;->a:I

    return-void
.end method

.method h()V
    .locals 1

    iget v0, p0, Lo1/r0;->a:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lo1/r0;->a:I

    return-void
.end method

.method i(Ll1/l;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo1/r0;->c:Z

    iget-object v0, p0, Lo1/r0;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method j()Lo1/q0;
    .locals 10

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v0

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v1

    invoke-static {}, Ll1/l;->i()Lc1/e;

    move-result-object v2

    iget-object v3, p0, Lo1/r0;->b:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move-object v7, v0

    move-object v8, v1

    move-object v9, v2

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll1/l;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li1/n$a;

    sget-object v2, Lo1/r0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    const/4 v5, 0x2

    if-eq v2, v5, :cond_1

    const/4 v5, 0x3

    if-ne v2, v5, :cond_0

    invoke-virtual {v9, v1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    move-object v9, v0

    goto :goto_0

    :cond_0
    new-array v1, v4, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    const-string v0, "Encountered invalid change type: %s"

    invoke-static {v0, v1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {v8, v1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    move-object v8, v0

    goto :goto_0

    :cond_2
    invoke-virtual {v7, v1}, Lc1/e;->q(Ljava/lang/Object;)Lc1/e;

    move-result-object v0

    move-object v7, v0

    goto :goto_0

    :cond_3
    new-instance v0, Lo1/q0;

    iget-object v5, p0, Lo1/r0;->d:Lcom/google/protobuf/j;

    iget-boolean v6, p0, Lo1/r0;->e:Z

    move-object v4, v0

    invoke-direct/range {v4 .. v9}, Lo1/q0;-><init>(Lcom/google/protobuf/j;ZLc1/e;Lc1/e;Lc1/e;)V

    return-object v0
.end method

.method k(Lcom/google/protobuf/j;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/protobuf/j;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lo1/r0;->c:Z

    iput-object p1, p0, Lo1/r0;->d:Lcom/google/protobuf/j;

    :cond_0
    return-void
.end method
