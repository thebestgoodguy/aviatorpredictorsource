.class public Lcom/google/firebase/firestore/w0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Lcom/google/firebase/firestore/FirebaseFirestore;

.field private final b:Lcom/google/firebase/firestore/i$a;


# direct methods
.method public constructor <init>(Lcom/google/firebase/firestore/FirebaseFirestore;Lcom/google/firebase/firestore/i$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/firestore/w0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    iput-object p2, p0, Lcom/google/firebase/firestore/w0;->b:Lcom/google/firebase/firestore/i$a;

    return-void
.end method

.method private a(Lx1/a;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx1/a;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p1}, Lx1/a;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-virtual {p0, v1}, Lcom/google/firebase/firestore/w0;->f(Lx1/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private c(Lx1/x;)Ljava/lang/Object;
    .locals 5

    invoke-virtual {p1}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll1/f;->h(Ljava/lang/String;)Ll1/f;

    move-result-object v0

    invoke-virtual {p1}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->k(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    iget-object v1, p0, Lcom/google/firebase/firestore/w0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {v1}, Lcom/google/firebase/firestore/FirebaseFirestore;->t()Ll1/f;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/f;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    const/4 v2, 0x5

    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    invoke-virtual {p1}, Ll1/l;->t()Ll1/u;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x1

    invoke-virtual {v0}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v4

    aput-object v4, v2, v3

    const/4 v3, 0x2

    invoke-virtual {v0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v0

    aput-object v0, v2, v3

    const/4 v0, 0x3

    invoke-virtual {v1}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v2, v0

    const/4 v0, 0x4

    invoke-virtual {v1}, Ll1/f;->i()Ljava/lang/String;

    move-result-object v1

    aput-object v1, v2, v0

    const-string v0, "DocumentSnapshot"

    const-string v1, "Document %s contains a document reference within a different database (%s/%s) which is not supported. It will be treated as a reference in the current database (%s/%s) instead."

    invoke-static {v0, v1, v2}, Lp1/v;->d(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_0
    new-instance v0, Lcom/google/firebase/firestore/h;

    iget-object v1, p0, Lcom/google/firebase/firestore/w0;->a:Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-direct {v0, p1, v1}, Lcom/google/firebase/firestore/h;-><init>(Ll1/l;Lcom/google/firebase/firestore/FirebaseFirestore;)V

    return-object v0
.end method

.method private d(Lx1/x;)Ljava/lang/Object;
    .locals 3

    sget-object v0, Lcom/google/firebase/firestore/w0$a;->a:[I

    iget-object v1, p0, Lcom/google/firebase/firestore/w0;->b:Lcom/google/firebase/firestore/i$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    const/4 v1, 0x2

    if-eq v0, v1, :cond_0

    return-object v2

    :cond_0
    invoke-static {p1}, Ll1/v;->a(Lx1/x;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/w0;->e(Lcom/google/protobuf/t1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-static {p1}, Ll1/v;->b(Lx1/x;)Lx1/x;

    move-result-object p1

    if-nez p1, :cond_2

    return-object v2

    :cond_2
    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/w0;->f(Lx1/x;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private e(Lcom/google/protobuf/t1;)Ljava/lang/Object;
    .locals 3

    new-instance v0, Lx0/o;

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v1

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->X()I

    move-result p1

    invoke-direct {v0, v1, v2, p1}, Lx0/o;-><init>(JI)V

    return-object v0
.end method


# virtual methods
.method b(Ljava/util/Map;)Ljava/util/Map;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-virtual {p0, v1}, Lcom/google/firebase/firestore/w0;->f(Lx1/x;)Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public f(Lx1/x;)Ljava/lang/Object;
    .locals 5

    invoke-static {p1}, Ll1/y;->G(Lx1/x;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Unknown value type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p1

    throw p1

    :pswitch_0
    invoke-virtual {p1}, Lx1/x;->m0()Lx1/r;

    move-result-object p1

    invoke-virtual {p1}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/firebase/firestore/w0;->b(Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/w0;->a(Lx1/a;)Ljava/util/List;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lcom/google/firebase/firestore/y;

    invoke-virtual {p1}, Lx1/x;->k0()Lb2/a;

    move-result-object v1

    invoke-virtual {v1}, Lb2/a;->X()D

    move-result-wide v1

    invoke-virtual {p1}, Lx1/x;->k0()Lb2/a;

    move-result-object p1

    invoke-virtual {p1}, Lb2/a;->Y()D

    move-result-wide v3

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/google/firebase/firestore/y;-><init>(DD)V

    return-object v0

    :pswitch_3
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/w0;->c(Lx1/x;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_4
    invoke-virtual {p1}, Lx1/x;->h0()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/a;->g(Lcom/google/protobuf/j;)Lcom/google/firebase/firestore/a;

    move-result-object p1

    return-object p1

    :pswitch_5
    invoke-virtual {p1}, Lx1/x;->o0()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/w0;->d(Lx1/x;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-virtual {p1}, Lx1/x;->p0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/google/firebase/firestore/w0;->e(Lcom/google/protobuf/t1;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->h:Lx1/x$c;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lx1/x;->l0()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Lx1/x;->j0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    :goto_0
    return-object p1

    :pswitch_9
    invoke-virtual {p1}, Lx1/x;->g0()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :pswitch_a
    const/4 p1, 0x0

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
