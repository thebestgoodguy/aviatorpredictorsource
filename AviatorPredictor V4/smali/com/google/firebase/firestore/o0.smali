.class public final Lcom/google/firebase/firestore/o0;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final c:Lcom/google/firebase/firestore/o0;

.field private static final d:Lcom/google/firebase/firestore/o0;


# instance fields
.field private final a:Z

.field private final b:Lm1/d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/google/firebase/firestore/o0;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/o0;-><init>(ZLm1/d;)V

    sput-object v0, Lcom/google/firebase/firestore/o0;->c:Lcom/google/firebase/firestore/o0;

    new-instance v0, Lcom/google/firebase/firestore/o0;

    const/4 v1, 0x1

    invoke-direct {v0, v1, v2}, Lcom/google/firebase/firestore/o0;-><init>(ZLm1/d;)V

    sput-object v0, Lcom/google/firebase/firestore/o0;->d:Lcom/google/firebase/firestore/o0;

    return-void
.end method

.method private constructor <init>(ZLm1/d;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    if-eqz p2, :cond_1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Cannot specify a fieldMask for non-merge sets()"

    invoke-static {v1, v2, v0}, Lp1/x;->a(ZLjava/lang/String;[Ljava/lang/Object;)V

    iput-boolean p1, p0, Lcom/google/firebase/firestore/o0;->a:Z

    iput-object p2, p0, Lcom/google/firebase/firestore/o0;->b:Lm1/d;

    return-void
.end method

.method public static c()Lcom/google/firebase/firestore/o0;
    .locals 1

    sget-object v0, Lcom/google/firebase/firestore/o0;->d:Lcom/google/firebase/firestore/o0;

    return-object v0
.end method

.method public static d(Ljava/util/List;)Lcom/google/firebase/firestore/o0;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/google/firebase/firestore/l;",
            ">;)",
            "Lcom/google/firebase/firestore/o0;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/firebase/firestore/l;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/l;->c()Ll1/r;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lcom/google/firebase/firestore/o0;

    const/4 v1, 0x1

    invoke-static {v0}, Lm1/d;->b(Ljava/util/Set;)Lm1/d;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lcom/google/firebase/firestore/o0;-><init>(ZLm1/d;)V

    return-object p0
.end method


# virtual methods
.method public a()Lm1/d;
    .locals 1

    iget-object v0, p0, Lcom/google/firebase/firestore/o0;->b:Lm1/d;

    return-object v0
.end method

.method b()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/firebase/firestore/o0;->a:Z

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_5

    const-class v2, Lcom/google/firebase/firestore/o0;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lcom/google/firebase/firestore/o0;

    iget-boolean v2, p0, Lcom/google/firebase/firestore/o0;->a:Z

    iget-boolean v3, p1, Lcom/google/firebase/firestore/o0;->a:Z

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lcom/google/firebase/firestore/o0;->b:Lm1/d;

    iget-object p1, p1, Lcom/google/firebase/firestore/o0;->b:Lm1/d;

    if-eqz v2, :cond_3

    invoke-virtual {v2, p1}, Lm1/d;->equals(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_3
    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-boolean v0, p0, Lcom/google/firebase/firestore/o0;->a:Z

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/google/firebase/firestore/o0;->b:Lm1/d;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lm1/d;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method
