.class Lv2/b;
.super Lr2/p;
.source ""


# static fields
.field public static final d:Lv2/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lv2/b;

    invoke-direct {v0}, Lv2/b;-><init>()V

    sput-object v0, Lv2/b;->d:Lv2/b;

    return-void
.end method

.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lr2/p;-><init>()V

    return-void
.end method

.method private q(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/FirebaseFirestore;
    .locals 3

    invoke-virtual {p0, p1}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/v;

    sget-object v1, Lv2/t;->i:Ljava/util/HashMap;

    monitor-enter v1

    :try_start_0
    invoke-static {v0}, Lv2/t;->J(Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-static {v0}, Lv2/t;->J(Ljava/lang/String;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p1

    monitor-exit v1

    return-object p1

    :cond_0
    invoke-static {v0}, Lx0/e;->p(Ljava/lang/String;)Lx0/e;

    move-result-object v2

    invoke-static {v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->u(Lx0/e;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v2

    invoke-virtual {v2, p1}, Lcom/google/firebase/firestore/FirebaseFirestore;->K(Lcom/google/firebase/firestore/v;)V

    invoke-static {v2, v0}, Lv2/t;->i0(Lcom/google/firebase/firestore/FirebaseFirestore;Ljava/lang/String;)V

    monitor-exit v1

    return-object v2

    :catchall_0
    move-exception p1

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method private r(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/k0;
    .locals 7

    const-string v0, "FLTFirestoreMsgCodec"

    :try_start_0
    invoke-virtual {p0, p1}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    const-string v1, "firestore"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Lcom/google/firebase/firestore/FirebaseFirestore;

    const-string v2, "path"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    const-string v3, "isCollectionGroup"

    invoke-interface {p1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    const-string v4, "parameters"

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    if-eqz v3, :cond_0

    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->m(Ljava/lang/String;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/FirebaseFirestore;->l(Ljava/lang/String;)Lcom/google/firebase/firestore/b;

    move-result-object v1

    :goto_0
    if-nez p1, :cond_1

    return-object v1

    :cond_1
    const-string v2, "where"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/firestore/l;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    const/4 v6, 0x2

    invoke-interface {v3, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v6, "=="

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->L(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_2
    const-string v6, "!="

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->R(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_3
    const-string v6, "<"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->P(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_4
    const-string v6, "<="

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->Q(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_5
    const-string v6, ">"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->M(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_6
    const-string v6, ">="

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->N(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_7
    const-string v6, "array-contains"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->J(Lcom/google/firebase/firestore/l;Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_1

    :cond_8
    const-string v6, "array-contains-any"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->K(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto/16 :goto_1

    :cond_9
    const-string v6, "in"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->O(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto/16 :goto_1

    :cond_a
    const-string v6, "not-in"

    invoke-virtual {v6, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    check-cast v3, Ljava/util/List;

    invoke-virtual {v1, v5, v3}, Lcom/google/firebase/firestore/k0;->S(Lcom/google/firebase/firestore/l;Ljava/util/List;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto/16 :goto_1

    :cond_b
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v5, "An invalid query operator "

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " was received but not handled."

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    :cond_c
    const-string v2, "limit"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/firestore/k0;->s(J)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    :cond_d
    const-string v2, "limitToLast"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lcom/google/firebase/firestore/k0;->t(J)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    :cond_e
    const-string v2, "orderBy"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-nez v2, :cond_f

    return-object v1

    :cond_f
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/google/firebase/firestore/l;

    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_10

    sget-object v3, Lcom/google/firebase/firestore/k0$b;->f:Lcom/google/firebase/firestore/k0$b;

    goto :goto_3

    :cond_10
    sget-object v3, Lcom/google/firebase/firestore/k0$b;->e:Lcom/google/firebase/firestore/k0$b;

    :goto_3
    invoke-virtual {v1, v6, v3}, Lcom/google/firebase/firestore/k0;->u(Lcom/google/firebase/firestore/l;Lcom/google/firebase/firestore/k0$b;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    goto :goto_2

    :cond_11
    const-string v2, "startAt"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_12

    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/k0;->B([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    :cond_12
    const-string v2, "startAfter"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_13

    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/k0;->A([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    :cond_13
    const-string v2, "endAt"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    if-eqz v2, :cond_14

    invoke-interface {v2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v2, [Ljava/lang/Object;

    invoke-virtual {v1, v2}, Lcom/google/firebase/firestore/k0;->i([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1

    :cond_14
    const-string v2, "endBefore"

    invoke-interface {p1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    if-eqz p1, :cond_15

    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast p1, [Ljava/lang/Object;

    invoke-virtual {v1, p1}, Lcom/google/firebase/firestore/k0;->j([Ljava/lang/Object;)Lcom/google/firebase/firestore/k0;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :cond_15
    return-object v1

    :catch_0
    move-exception p1

    const-string v1, "An error occurred while parsing query arguments, this is most likely an error with this SDK."

    invoke-static {v0, v1, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    const/4 p1, 0x0

    return-object p1
.end method

.method private s(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/v;
    .locals 7

    invoke-virtual {p0, p1}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Map;

    new-instance v0, Lcom/google/firebase/firestore/v$b;

    invoke-direct {v0}, Lcom/google/firebase/firestore/v$b;-><init>()V

    const-string v1, "persistenceEnabled"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/v$b;->h(Z)Lcom/google/firebase/firestore/v$b;

    :cond_0
    const-string v1, "host"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/v$b;->g(Ljava/lang/String;)Lcom/google/firebase/firestore/v$b;

    const-string v1, "sslEnabled"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v0, v1}, Lcom/google/firebase/firestore/v$b;->i(Z)Lcom/google/firebase/firestore/v$b;

    :cond_1
    const-string v1, "cacheSizeBytes"

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_5

    const-wide/32 v2, 0x6400000

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    instance-of v1, p1, Ljava/lang/Long;

    if-eqz v1, :cond_2

    move-object v2, p1

    check-cast v2, Ljava/lang/Long;

    goto :goto_0

    :cond_2
    instance-of v1, p1, Ljava/lang/Integer;

    if-eqz v1, :cond_3

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    int-to-long v1, p1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    :cond_3
    :goto_0
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long p1, v3, v5

    if-nez p1, :cond_4

    invoke-virtual {v0, v5, v6}, Lcom/google/firebase/firestore/v$b;->f(J)Lcom/google/firebase/firestore/v$b;

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/google/firebase/firestore/v$b;->f(J)Lcom/google/firebase/firestore/v$b;

    :cond_5
    :goto_1
    invoke-virtual {v0}, Lcom/google/firebase/firestore/v$b;->e()Lcom/google/firebase/firestore/v;

    move-result-object p1

    return-object p1
.end method

.method private t(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 3

    instance-of v0, p1, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->toArray()[Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const-string p1, "java.util.List was expected, unable to convert \'%s\' to an object array"

    invoke-static {p1, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method private u(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/c;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sget-object v1, Lv2/b$a;->a:[I

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->e()Lcom/google/firebase/firestore/c$b;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v1, v1, v2

    const/4 v2, 0x1

    if-eq v1, v2, :cond_2

    const/4 v2, 0x2

    if-eq v1, v2, :cond_1

    const/4 v2, 0x3

    if-eq v1, v2, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    const-string v1, "DocumentChangeType.removed"

    goto :goto_0

    :cond_1
    const-string v1, "DocumentChangeType.modified"

    goto :goto_0

    :cond_2
    const-string v1, "DocumentChangeType.added"

    :goto_0
    const-string v2, "type"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->b()Lcom/google/firebase/firestore/l0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/l0;->d()Ljava/util/Map;

    move-result-object v1

    const-string v2, "data"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->b()Lcom/google/firebase/firestore/l0;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/i;->g()Lcom/google/firebase/firestore/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/h;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "oldIndex"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->c()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "newIndex"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/c;->b()Lcom/google/firebase/firestore/l0;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/firestore/i;->f()Lcom/google/firebase/firestore/p0;

    move-result-object p2

    const-string v1, "metadata"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method private v(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/i;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/i;->g()Lcom/google/firebase/firestore/h;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/firebase/firestore/h;->m()Ljava/lang/String;

    move-result-object v1

    const-string v2, "path"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/i;->a()Z

    move-result v1

    const-string v2, "data"

    if-eqz v1, :cond_0

    invoke-virtual {p2}, Lcom/google/firebase/firestore/i;->d()Ljava/util/Map;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/i;->f()Lcom/google/firebase/firestore/p0;

    move-result-object p2

    const-string v1, "metadata"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method private w(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/d0;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/d0;->c()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "bytesLoaded"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/d0;->d()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "documentsLoaded"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/d0;->f()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "totalBytes"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/d0;->g()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "totalDocuments"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/d0;->e()Lcom/google/firebase/firestore/d0$a;

    move-result-object p2

    sget-object v1, Lv2/b$a;->b:[I

    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    aget p2, v1, p2

    const/4 v1, 0x1

    const-string v2, "running"

    if-eq p2, v1, :cond_2

    const/4 v1, 0x2

    if-eq p2, v1, :cond_1

    const/4 v1, 0x3

    if-eq p2, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v2, "error"

    goto :goto_0

    :cond_1
    const-string v2, "success"

    :cond_2
    :goto_0
    const-string p2, "taskState"

    invoke-interface {v0, p2, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method private x(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/m0;)V
    .locals 7

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/m0;->s()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/google/firebase/firestore/i;

    invoke-virtual {v5}, Lcom/google/firebase/firestore/i;->g()Lcom/google/firebase/firestore/h;

    move-result-object v6

    invoke-virtual {v6}, Lcom/google/firebase/firestore/h;->m()Ljava/lang/String;

    move-result-object v6

    invoke-interface {v0, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lcom/google/firebase/firestore/i;->d()Ljava/util/Map;

    move-result-object v6

    invoke-interface {v2, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    invoke-virtual {v5}, Lcom/google/firebase/firestore/i;->f()Lcom/google/firebase/firestore/p0;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    const-string v4, "paths"

    invoke-interface {v1, v4, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "documents"

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "metadatas"

    invoke-interface {v1, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/m0;->q()Ljava/util/List;

    move-result-object v0

    const-string v2, "documentChanges"

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/m0;->t()Lcom/google/firebase/firestore/p0;

    move-result-object p2

    const-string v0, "metadata"

    invoke-interface {v1, v0, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v1}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method

.method private y(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/p0;)V
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/p0;->a()Z

    move-result v1

    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    const-string v2, "hasPendingWrites"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/p0;->b()Z

    move-result p2

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    const-string v1, "isFromCache"

    invoke-interface {v0, v1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p0, p1, v0}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method protected g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;
    .locals 4

    packed-switch p1, :pswitch_data_0

    invoke-super {p0, p1, p2}, Lr2/p;->g(BLjava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-direct {p0, p2}, Lv2/b;->s(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/v;

    move-result-object p1

    return-object p1

    :pswitch_1
    invoke-direct {p0, p2}, Lv2/b;->r(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/k0;

    move-result-object p1

    return-object p1

    :pswitch_2
    invoke-direct {p0, p2}, Lv2/b;->q(Ljava/nio/ByteBuffer;)Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object p1

    return-object p1

    :pswitch_3
    const-wide/high16 p1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_4
    const-wide/high16 p1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_5
    const-wide/high16 p1, 0x7ff8000000000000L    # Double.NaN

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    return-object p1

    :pswitch_6
    invoke-static {p2}, Lr2/p;->e(Ljava/nio/ByteBuffer;)I

    move-result p1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0, p1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    new-array p1, v1, [Ljava/lang/String;

    invoke-interface {v0, p1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [Ljava/lang/String;

    invoke-static {p1}, Lcom/google/firebase/firestore/l;->d([Ljava/lang/String;)Lcom/google/firebase/firestore/l;

    move-result-object p1

    return-object p1

    :pswitch_7
    invoke-static {}, Lcom/google/firebase/firestore/l;->a()Lcom/google/firebase/firestore/l;

    move-result-object p1

    return-object p1

    :pswitch_8
    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    int-to-long p1, p1

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/m;->f(J)Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_9
    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p1

    invoke-static {p1, p2}, Lcom/google/firebase/firestore/m;->e(D)Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_a
    new-instance p1, Lx0/o;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getInt()I

    move-result p2

    invoke-direct {p1, v0, v1, p2}, Lx0/o;-><init>(JI)V

    return-object p1

    :pswitch_b
    invoke-static {}, Lcom/google/firebase/firestore/m;->g()Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_c
    invoke-static {}, Lcom/google/firebase/firestore/m;->c()Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_d
    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lv2/b;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/m;->a([Ljava/lang/Object;)Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_e
    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    invoke-direct {p0, p1}, Lv2/b;->t(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/m;->b([Ljava/lang/Object;)Lcom/google/firebase/firestore/m;

    move-result-object p1

    return-object p1

    :pswitch_f
    invoke-static {p2}, Lr2/p;->d(Ljava/nio/ByteBuffer;)[B

    move-result-object p1

    invoke-static {p1}, Lcom/google/firebase/firestore/a;->h([B)Lcom/google/firebase/firestore/a;

    move-result-object p1

    return-object p1

    :pswitch_10
    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/firebase/firestore/FirebaseFirestore;

    invoke-virtual {p0, p2}, Lr2/p;->f(Ljava/nio/ByteBuffer;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p2}, Lcom/google/firebase/firestore/FirebaseFirestore;->o(Ljava/lang/String;)Lcom/google/firebase/firestore/h;

    move-result-object p1

    return-object p1

    :pswitch_11
    const/16 p1, 0x8

    invoke-static {p2, p1}, Lr2/p;->c(Ljava/nio/ByteBuffer;I)V

    new-instance p1, Lcom/google/firebase/firestore/y;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getDouble()D

    move-result-wide v0

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getDouble()D

    move-result-wide v2

    invoke-direct {p1, v0, v1, v2, v3}, Lcom/google/firebase/firestore/y;-><init>(DD)V

    return-object p1

    :pswitch_12
    new-instance p1, Ljava/util/Date;

    invoke-virtual {p2}, Ljava/nio/ByteBuffer;->getLong()J

    move-result-wide v0

    invoke-direct {p1, v0, v1}, Ljava/util/Date;-><init>(J)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch -0x80
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
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

.method protected p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V
    .locals 3

    instance-of v0, p2, Ljava/util/Date;

    if-eqz v0, :cond_0

    const/16 v0, -0x80

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Ljava/util/Date;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lr2/p;->n(Ljava/io/ByteArrayOutputStream;J)V

    goto/16 :goto_1

    :cond_0
    instance-of v0, p2, Lx0/o;

    if-eqz v0, :cond_1

    const/16 v0, -0x78

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lx0/o;

    invoke-virtual {p2}, Lx0/o;->i()J

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lr2/p;->n(Ljava/io/ByteArrayOutputStream;J)V

    invoke-virtual {p2}, Lx0/o;->g()I

    move-result p2

    invoke-static {p1, p2}, Lr2/p;->m(Ljava/io/ByteArrayOutputStream;I)V

    goto/16 :goto_1

    :cond_1
    instance-of v0, p2, Lcom/google/firebase/firestore/y;

    if-eqz v0, :cond_2

    const/16 v0, -0x7f

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    const/16 v0, 0x8

    invoke-static {p1, v0}, Lr2/p;->h(Ljava/io/ByteArrayOutputStream;I)V

    check-cast p2, Lcom/google/firebase/firestore/y;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/y;->g()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lr2/p;->k(Ljava/io/ByteArrayOutputStream;D)V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/y;->h()D

    move-result-wide v0

    invoke-static {p1, v0, v1}, Lr2/p;->k(Ljava/io/ByteArrayOutputStream;D)V

    goto/16 :goto_1

    :cond_2
    instance-of v0, p2, Lcom/google/firebase/firestore/h;

    if-eqz v0, :cond_3

    const/16 v0, -0x7e

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lcom/google/firebase/firestore/h;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/h;->k()Lcom/google/firebase/firestore/FirebaseFirestore;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/firestore/FirebaseFirestore;->r()Lx0/e;

    move-result-object v0

    invoke-virtual {v0}, Lx0/e;->q()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, p1, v0}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lcom/google/firebase/firestore/h;->m()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lv2/b;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_3
    instance-of v0, p2, Lcom/google/firebase/firestore/i;

    if-eqz v0, :cond_4

    check-cast p2, Lcom/google/firebase/firestore/i;

    invoke-direct {p0, p1, p2}, Lv2/b;->v(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/i;)V

    goto/16 :goto_1

    :cond_4
    instance-of v0, p2, Lcom/google/firebase/firestore/m0;

    if-eqz v0, :cond_5

    check-cast p2, Lcom/google/firebase/firestore/m0;

    invoke-direct {p0, p1, p2}, Lv2/b;->x(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/m0;)V

    goto/16 :goto_1

    :cond_5
    instance-of v0, p2, Lcom/google/firebase/firestore/c;

    if-eqz v0, :cond_6

    check-cast p2, Lcom/google/firebase/firestore/c;

    invoke-direct {p0, p1, p2}, Lv2/b;->u(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/c;)V

    goto :goto_1

    :cond_6
    instance-of v0, p2, Lcom/google/firebase/firestore/d0;

    if-eqz v0, :cond_7

    check-cast p2, Lcom/google/firebase/firestore/d0;

    invoke-direct {p0, p1, p2}, Lv2/b;->w(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/d0;)V

    goto :goto_1

    :cond_7
    instance-of v0, p2, Lcom/google/firebase/firestore/p0;

    if-eqz v0, :cond_8

    check-cast p2, Lcom/google/firebase/firestore/p0;

    invoke-direct {p0, p1, p2}, Lv2/b;->y(Ljava/io/ByteArrayOutputStream;Lcom/google/firebase/firestore/p0;)V

    goto :goto_1

    :cond_8
    instance-of v0, p2, Lcom/google/firebase/firestore/a;

    if-eqz v0, :cond_9

    const/16 v0, -0x7d

    invoke-virtual {p1, v0}, Ljava/io/ByteArrayOutputStream;->write(I)V

    check-cast p2, Lcom/google/firebase/firestore/a;

    invoke-virtual {p2}, Lcom/google/firebase/firestore/a;->k()[B

    move-result-object p2

    invoke-static {p1, p2}, Lr2/p;->i(Ljava/io/ByteArrayOutputStream;[B)V

    goto :goto_1

    :cond_9
    instance-of v0, p2, Ljava/lang/Double;

    if-eqz v0, :cond_c

    move-object v0, p2

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->isNaN(D)Z

    move-result v1

    if-eqz v1, :cond_a

    const/16 p2, -0x73

    :goto_0
    invoke-virtual {p1, p2}, Ljava/io/ByteArrayOutputStream;->write(I)V

    goto :goto_1

    :cond_a
    const-wide/high16 v1, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_b

    const/16 p2, -0x71

    goto :goto_0

    :cond_b
    const-wide/high16 v1, 0x7ff0000000000000L    # Double.POSITIVE_INFINITY

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/Double;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_c

    const/16 p2, -0x72

    goto :goto_0

    :cond_c
    invoke-super {p0, p1, p2}, Lr2/p;->p(Ljava/io/ByteArrayOutputStream;Ljava/lang/Object;)V

    :goto_1
    return-void
.end method
