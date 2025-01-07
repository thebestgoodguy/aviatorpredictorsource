.class public Lcom/google/firebase/firestore/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/firebase/firestore/c$b;
    }
.end annotation


# instance fields
.field private final a:Lcom/google/firebase/firestore/c$b;

.field private final b:Lcom/google/firebase/firestore/l0;

.field private final c:I

.field private final d:I


# direct methods
.method constructor <init>(Lcom/google/firebase/firestore/l0;Lcom/google/firebase/firestore/c$b;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/google/firebase/firestore/c;->a:Lcom/google/firebase/firestore/c$b;

    iput-object p1, p0, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/l0;

    iput p3, p0, Lcom/google/firebase/firestore/c;->c:I

    iput p4, p0, Lcom/google/firebase/firestore/c;->d:I

    return-void
.end method

.method static a(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/e0;Li1/u1;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/firebase/firestore/FirebaseFirestore;",
            "Lcom/google/firebase/firestore/e0;",
            "Li1/u1;",
            ")",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Li1/u1;->g()Ll1/n;

    move-result-object v1

    invoke-virtual {v1}, Ll1/n;->isEmpty()Z

    move-result v1

    const/4 v2, -0x1

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_3

    const/4 p1, 0x0

    invoke-virtual {p2}, Li1/u1;->d()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v5, 0x0

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li1/n;

    invoke-virtual {v6}, Li1/n;->b()Ll1/i;

    move-result-object v7

    invoke-virtual {p2}, Li1/u1;->j()Z

    move-result v8

    invoke-virtual {p2}, Li1/u1;->f()Lc1/e;

    move-result-object v9

    invoke-interface {v7}, Ll1/i;->getKey()Ll1/l;

    move-result-object v10

    invoke-virtual {v9, v10}, Lc1/e;->contains(Ljava/lang/Object;)Z

    move-result v9

    invoke-static {p0, v7, v8, v9}, Lcom/google/firebase/firestore/l0;->h(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/l0;

    move-result-object v8

    invoke-virtual {v6}, Li1/n;->c()Li1/n$a;

    move-result-object v6

    sget-object v9, Li1/n$a;->f:Li1/n$a;

    if-ne v6, v9, :cond_0

    const/4 v6, 0x1

    goto :goto_1

    :cond_0
    const/4 v6, 0x0

    :goto_1
    new-array v9, v4, [Ljava/lang/Object;

    const-string v10, "Invalid added event for first snapshot"

    invoke-static {v6, v10, v9}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    if-eqz p1, :cond_2

    invoke-virtual {p2}, Li1/u1;->h()Li1/x0;

    move-result-object v6

    invoke-virtual {v6}, Li1/x0;->c()Ljava/util/Comparator;

    move-result-object v6

    invoke-interface {v6, p1, v7}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    if-gez p1, :cond_1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    goto :goto_3

    :cond_2
    :goto_2
    const/4 p1, 0x1

    :goto_3
    new-array v6, v4, [Ljava/lang/Object;

    const-string v9, "Got added events in wrong order"

    invoke-static {p1, v9, v6}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    new-instance p1, Lcom/google/firebase/firestore/c;

    sget-object v6, Lcom/google/firebase/firestore/c$b;->e:Lcom/google/firebase/firestore/c$b;

    add-int/lit8 v9, v5, 0x1

    invoke-direct {p1, v8, v6, v2, v5}, Lcom/google/firebase/firestore/c;-><init>(Lcom/google/firebase/firestore/l0;Lcom/google/firebase/firestore/c$b;II)V

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    move-object p1, v7

    move v5, v9

    goto :goto_0

    :cond_3
    invoke-virtual {p2}, Li1/u1;->g()Ll1/n;

    move-result-object v1

    invoke-virtual {p2}, Li1/u1;->d()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li1/n;

    sget-object v7, Lcom/google/firebase/firestore/e0;->e:Lcom/google/firebase/firestore/e0;

    if-ne p1, v7, :cond_4

    invoke-virtual {v6}, Li1/n;->c()Li1/n$a;

    move-result-object v7

    sget-object v8, Li1/n$a;->h:Li1/n$a;

    if-ne v7, v8, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Li1/n;->b()Ll1/i;

    move-result-object v7

    invoke-virtual {p2}, Li1/u1;->j()Z

    move-result v8

    invoke-virtual {p2}, Li1/u1;->f()Lc1/e;

    move-result-object v9

    invoke-interface {v7}, Ll1/i;->getKey()Ll1/l;

    move-result-object v10

    invoke-virtual {v9, v10}, Lc1/e;->contains(Ljava/lang/Object;)Z

    move-result v9

    invoke-static {p0, v7, v8, v9}, Lcom/google/firebase/firestore/l0;->h(Lcom/google/firebase/firestore/FirebaseFirestore;Ll1/i;ZZ)Lcom/google/firebase/firestore/l0;

    move-result-object v8

    invoke-static {v6}, Lcom/google/firebase/firestore/c;->f(Li1/n;)Lcom/google/firebase/firestore/c$b;

    move-result-object v6

    sget-object v9, Lcom/google/firebase/firestore/c$b;->e:Lcom/google/firebase/firestore/c$b;

    const-string v10, "Index for document not found"

    if-eq v6, v9, :cond_6

    invoke-interface {v7}, Ll1/i;->getKey()Ll1/l;

    move-result-object v9

    invoke-virtual {v1, v9}, Ll1/n;->u(Ll1/l;)I

    move-result v9

    if-ltz v9, :cond_5

    const/4 v11, 0x1

    goto :goto_5

    :cond_5
    const/4 v11, 0x0

    :goto_5
    new-array v12, v4, [Ljava/lang/Object;

    invoke-static {v11, v10, v12}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-interface {v7}, Ll1/i;->getKey()Ll1/l;

    move-result-object v11

    invoke-virtual {v1, v11}, Ll1/n;->w(Ll1/l;)Ll1/n;

    move-result-object v1

    goto :goto_6

    :cond_6
    const/4 v9, -0x1

    :goto_6
    sget-object v11, Lcom/google/firebase/firestore/c$b;->g:Lcom/google/firebase/firestore/c$b;

    if-eq v6, v11, :cond_8

    invoke-virtual {v1, v7}, Ll1/n;->p(Ll1/i;)Ll1/n;

    move-result-object v1

    invoke-interface {v7}, Ll1/i;->getKey()Ll1/l;

    move-result-object v7

    invoke-virtual {v1, v7}, Ll1/n;->u(Ll1/l;)I

    move-result v7

    if-ltz v7, :cond_7

    const/4 v11, 0x1

    goto :goto_7

    :cond_7
    const/4 v11, 0x0

    :goto_7
    new-array v12, v4, [Ljava/lang/Object;

    invoke-static {v11, v10, v12}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    goto :goto_8

    :cond_8
    const/4 v7, -0x1

    :goto_8
    new-instance v10, Lcom/google/firebase/firestore/c;

    invoke-direct {v10, v8, v6, v9, v7}, Lcom/google/firebase/firestore/c;-><init>(Lcom/google/firebase/firestore/l0;Lcom/google/firebase/firestore/c$b;II)V

    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    return-object v0
.end method

.method private static f(Li1/n;)Lcom/google/firebase/firestore/c$b;
    .locals 3

    sget-object v0, Lcom/google/firebase/firestore/c$a;->a:[I

    invoke-virtual {p0}, Li1/n;->c()Li1/n$a;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_2

    const/4 v1, 0x2

    if-eq v0, v1, :cond_1

    const/4 v1, 0x3

    if-eq v0, v1, :cond_1

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    sget-object p0, Lcom/google/firebase/firestore/c$b;->g:Lcom/google/firebase/firestore/c$b;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown view change type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Li1/n;->c()Li1/n$a;

    move-result-object p0

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    sget-object p0, Lcom/google/firebase/firestore/c$b;->f:Lcom/google/firebase/firestore/c$b;

    return-object p0

    :cond_2
    sget-object p0, Lcom/google/firebase/firestore/c$b;->e:Lcom/google/firebase/firestore/c$b;

    return-object p0
.end method


# virtual methods
.method public b()Lcom/google/firebase/firestore/l0;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/l0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/c;->d:I

    return v0
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lcom/google/firebase/firestore/c;->c:I

    return v0
.end method

.method public e()Lcom/google/firebase/firestore/c$b;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/c;->a:Lcom/google/firebase/firestore/c$b;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lcom/google/firebase/firestore/c;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/google/firebase/firestore/c;

    iget-object v0, p0, Lcom/google/firebase/firestore/c;->a:Lcom/google/firebase/firestore/c$b;

    iget-object v2, p1, Lcom/google/firebase/firestore/c;->a:Lcom/google/firebase/firestore/c$b;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/l0;

    iget-object v2, p1, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/l0;

    invoke-virtual {v0, v2}, Lcom/google/firebase/firestore/i;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, Lcom/google/firebase/firestore/c;->c:I

    iget v2, p1, Lcom/google/firebase/firestore/c;->c:I

    if-ne v0, v2, :cond_0

    iget v0, p0, Lcom/google/firebase/firestore/c;->d:I

    iget p1, p1, Lcom/google/firebase/firestore/c;->d:I

    if-ne v0, p1, :cond_0

    const/4 v1, 0x1

    :cond_0
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/google/firebase/firestore/c;->a:Lcom/google/firebase/firestore/c$b;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/c;->b:Lcom/google/firebase/firestore/l0;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/i;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/firebase/firestore/c;->c:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/google/firebase/firestore/c;->d:I

    add-int/2addr v0, v1

    return v0
.end method
