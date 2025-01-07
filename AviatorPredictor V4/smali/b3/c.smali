.class public final Lb3/c;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb3/c$a;
    }
.end annotation


# static fields
.field public static final k:Lb3/c;


# instance fields
.field private a:Lb3/t;

.field private b:Ljava/util/concurrent/Executor;

.field private c:Ljava/lang/String;

.field private d:Lb3/b;

.field private e:Ljava/lang/String;

.field private f:[[Ljava/lang/Object;

.field private g:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lb3/k$a;",
            ">;"
        }
    .end annotation
.end field

.field private h:Ljava/lang/Boolean;

.field private i:Ljava/lang/Integer;

.field private j:Ljava/lang/Integer;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lb3/c;

    invoke-direct {v0}, Lb3/c;-><init>()V

    sput-object v0, Lb3/c;->k:Lb3/c;

    return-void
.end method

.method private constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lb3/c;->g:Ljava/util/List;

    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    const-class v1, Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Ljava/lang/Object;

    iput-object v0, p0, Lb3/c;->f:[[Ljava/lang/Object;

    return-void

    :array_0
    .array-data 4
        0x0
        0x2
    .end array-data
.end method

.method private constructor <init>(Lb3/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lb3/c;->g:Ljava/util/List;

    iget-object v0, p1, Lb3/c;->a:Lb3/t;

    iput-object v0, p0, Lb3/c;->a:Lb3/t;

    iget-object v0, p1, Lb3/c;->c:Ljava/lang/String;

    iput-object v0, p0, Lb3/c;->c:Ljava/lang/String;

    iget-object v0, p1, Lb3/c;->d:Lb3/b;

    iput-object v0, p0, Lb3/c;->d:Lb3/b;

    iget-object v0, p1, Lb3/c;->b:Ljava/util/concurrent/Executor;

    iput-object v0, p0, Lb3/c;->b:Ljava/util/concurrent/Executor;

    iget-object v0, p1, Lb3/c;->e:Ljava/lang/String;

    iput-object v0, p0, Lb3/c;->e:Ljava/lang/String;

    iget-object v0, p1, Lb3/c;->f:[[Ljava/lang/Object;

    iput-object v0, p0, Lb3/c;->f:[[Ljava/lang/Object;

    iget-object v0, p1, Lb3/c;->h:Ljava/lang/Boolean;

    iput-object v0, p0, Lb3/c;->h:Ljava/lang/Boolean;

    iget-object v0, p1, Lb3/c;->i:Ljava/lang/Integer;

    iput-object v0, p0, Lb3/c;->i:Ljava/lang/Integer;

    iget-object v0, p1, Lb3/c;->j:Ljava/lang/Integer;

    iput-object v0, p0, Lb3/c;->j:Ljava/lang/Integer;

    iget-object p1, p1, Lb3/c;->g:Ljava/util/List;

    iput-object p1, p0, Lb3/c;->g:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/c;->c:Ljava/lang/String;

    return-object v0
.end method

.method public b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lb3/c;->e:Ljava/lang/String;

    return-object v0
.end method

.method public c()Lb3/b;
    .locals 1

    iget-object v0, p0, Lb3/c;->d:Lb3/b;

    return-object v0
.end method

.method public d()Lb3/t;
    .locals 1

    iget-object v0, p0, Lb3/c;->a:Lb3/t;

    return-object v0
.end method

.method public e()Ljava/util/concurrent/Executor;
    .locals 1

    iget-object v0, p0, Lb3/c;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public f()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lb3/c;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public g()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lb3/c;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public h(Lb3/c$a;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/c$a<",
            "TT;>;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, Lb3/c;->f:[[Ljava/lang/Object;

    array-length v3, v2

    if-ge v1, v3, :cond_1

    aget-object v2, v2, v1

    aget-object v2, v2, v0

    invoke-virtual {p1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object p1, p0, Lb3/c;->f:[[Ljava/lang/Object;

    aget-object p1, p1, v1

    const/4 v0, 0x1

    aget-object p1, p1, v0

    return-object p1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lb3/c$a;->a(Lb3/c$a;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lb3/k$a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lb3/c;->g:Ljava/util/List;

    return-object v0
.end method

.method public j()Z
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iget-object v1, p0, Lb3/c;->h:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public k(Lb3/b;)Lb3/c;
    .locals 1

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    iput-object p1, v0, Lb3/c;->d:Lb3/b;

    return-object v0
.end method

.method public l(Lb3/t;)Lb3/c;
    .locals 1

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    iput-object p1, v0, Lb3/c;->a:Lb3/t;

    return-object v0
.end method

.method public m(Ljava/util/concurrent/Executor;)Lb3/c;
    .locals 1

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    iput-object p1, v0, Lb3/c;->b:Ljava/util/concurrent/Executor;

    return-object v0
.end method

.method public n(I)Lb3/c;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid maxsize %s"

    invoke-static {v0, v1, p1}, Lq0/l;->h(ZLjava/lang/String;I)V

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lb3/c;->i:Ljava/lang/Integer;

    return-object v0
.end method

.method public o(I)Lb3/c;
    .locals 2

    if-ltz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "invalid maxsize %s"

    invoke-static {v0, v1, p1}, Lq0/l;->h(ZLjava/lang/String;I)V

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, v0, Lb3/c;->j:Ljava/lang/Integer;

    return-object v0
.end method

.method public p(Lb3/c$a;Ljava/lang/Object;)Lb3/c;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lb3/c$a<",
            "TT;>;TT;)",
            "Lb3/c;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "value"

    invoke-static {p2, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    iget-object v3, p0, Lb3/c;->f:[[Ljava/lang/Object;

    array-length v4, v3

    const/4 v5, -0x1

    if-ge v2, v4, :cond_1

    aget-object v3, v3, v2

    aget-object v3, v3, v1

    invoke-virtual {p1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    const/4 v2, -0x1

    :goto_1
    iget-object v3, p0, Lb3/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    const/4 v4, 0x1

    if-ne v2, v5, :cond_2

    const/4 v6, 0x1

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    add-int/2addr v3, v6

    const/4 v6, 0x2

    new-array v7, v6, [I

    aput v6, v7, v4

    aput v3, v7, v1

    const-class v3, Ljava/lang/Object;

    invoke-static {v3, v7}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, [[Ljava/lang/Object;

    iput-object v3, v0, Lb3/c;->f:[[Ljava/lang/Object;

    iget-object v7, p0, Lb3/c;->f:[[Ljava/lang/Object;

    array-length v8, v7

    invoke-static {v7, v1, v3, v1, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-ne v2, v5, :cond_3

    iget-object v2, v0, Lb3/c;->f:[[Ljava/lang/Object;

    iget-object v3, p0, Lb3/c;->f:[[Ljava/lang/Object;

    array-length v3, v3

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v2, v3

    goto :goto_3

    :cond_3
    iget-object v3, v0, Lb3/c;->f:[[Ljava/lang/Object;

    new-array v5, v6, [Ljava/lang/Object;

    aput-object p1, v5, v1

    aput-object p2, v5, v4

    aput-object v5, v3, v2

    :goto_3
    return-object v0
.end method

.method public q(Lb3/k$a;)Lb3/c;
    .locals 3

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    new-instance v1, Ljava/util/ArrayList;

    iget-object v2, p0, Lb3/c;->g:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    iget-object v2, p0, Lb3/c;->g:Ljava/util/List;

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, v0, Lb3/c;->g:Ljava/util/List;

    return-object v0
.end method

.method public r()Lb3/c;
    .locals 2

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput-object v1, v0, Lb3/c;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public s()Lb3/c;
    .locals 2

    new-instance v0, Lb3/c;

    invoke-direct {v0, p0}, Lb3/c;-><init>(Lb3/c;)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    iput-object v1, v0, Lb3/c;->h:Ljava/lang/Boolean;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->a:Lb3/t;

    const-string v2, "deadline"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->c:Ljava/lang/String;

    const-string v2, "authority"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->d:Lb3/b;

    const-string v2, "callCredentials"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->b:Ljava/util/concurrent/Executor;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v2, "executor"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->e:Ljava/lang/String;

    const-string v2, "compressorName"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->f:[[Ljava/lang/Object;

    invoke-static {v1}, Ljava/util/Arrays;->deepToString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "customOptions"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/c;->j()Z

    move-result v1

    const-string v2, "waitForReady"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->e(Ljava/lang/String;Z)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->i:Ljava/lang/Integer;

    const-string v2, "maxInboundMessageSize"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->j:Ljava/lang/Integer;

    const-string v2, "maxOutboundMessageSize"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lb3/c;->g:Ljava/util/List;

    const-string v2, "streamTracerFactories"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
