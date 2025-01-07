.class public Ll1/y;
.super Ljava/lang/Object;
.source ""


# static fields
.field public static final a:Lx1/x;

.field public static final b:Lx1/x;

.field public static final c:Lx1/x;

.field private static final d:Lx1/x;

.field public static final e:Lx1/x;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    const-wide/high16 v1, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {v0, v1, v2}, Lx1/x$b;->H(D)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    sput-object v0, Ll1/y;->a:Lx1/x;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    sget-object v1, Lcom/google/protobuf/e1;->f:Lcom/google/protobuf/e1;

    invoke-virtual {v0, v1}, Lx1/x$b;->O(Lcom/google/protobuf/e1;)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    sput-object v0, Ll1/y;->b:Lx1/x;

    sput-object v0, Ll1/y;->c:Lx1/x;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    const-string v1, "__max__"

    invoke-virtual {v0, v1}, Lx1/x$b;->Q(Ljava/lang/String;)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    sput-object v0, Ll1/y;->d:Lx1/x;

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v1

    invoke-static {}, Lx1/r;->d0()Lx1/r$b;

    move-result-object v2

    const-string v3, "__type__"

    invoke-virtual {v2, v3, v0}, Lx1/r$b;->E(Ljava/lang/String;Lx1/x;)Lx1/r$b;

    move-result-object v0

    invoke-virtual {v1, v0}, Lx1/x$b;->L(Lx1/r$b;)Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object v0

    check-cast v0, Lx1/x;

    sput-object v0, Ll1/y;->e:Lx1/x;

    return-void
.end method

.method public static A(Lx1/x;)Z
    .locals 1

    invoke-static {p0}, Ll1/y;->v(Lx1/x;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Ll1/y;->u(Lx1/x;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p0, 0x1

    :goto_1
    return p0
.end method

.method public static B(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->m:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static C(Lx1/x;ZLx1/x;Z)I
    .locals 0

    invoke-static {p0, p2}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result p0

    if-eqz p0, :cond_0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    const/4 p0, -0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static D(Lx1/x;Lx1/x;)Z
    .locals 5

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->h:Lx1/x$c;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_1

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lx1/x;->l0()J

    move-result-wide v0

    invoke-virtual {p1}, Lx1/x;->l0()J

    move-result-wide p0

    cmp-long v4, v0, p0

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    return v2

    :cond_1
    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->i:Lx1/x$c;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p0}, Lx1/x;->j0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-virtual {p1}, Lx1/x;->j0()D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    cmp-long v4, v0, p0

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    const/4 v2, 0x0

    :goto_1
    return v2

    :cond_3
    return v3
.end method

.method private static E(Lx1/x;Lx1/x;)Z
    .locals 4

    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->m0()Lx1/r;

    move-result-object p1

    invoke-virtual {p0}, Lx1/r;->W()I

    move-result v0

    invoke-virtual {p1}, Lx1/r;->W()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    invoke-virtual {p0}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-virtual {p1}, Lx1/r;->X()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-static {v0, v1}, Ll1/y;->q(Lx1/x;Lx1/x;)Z

    move-result v0

    if-nez v0, :cond_1

    return v2

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static F(Ll1/f;Ll1/l;)Lx1/x;
    .locals 4

    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    const/4 v1, 0x3

    new-array v1, v1, [Ljava/lang/Object;

    invoke-virtual {p0}, Ll1/f;->k()Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-virtual {p0}, Ll1/f;->i()Ljava/lang/String;

    move-result-object p0

    const/4 v2, 0x1

    aput-object p0, v1, v2

    invoke-virtual {p1}, Ll1/l;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x2

    aput-object p0, v1, p1

    const-string p0, "projects/%s/databases/%s/documents/%s"

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lx1/x$b;->P(Ljava/lang/String;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0
.end method

.method public static G(Lx1/x;)I
    .locals 3

    sget-object v0, Ll1/y$a;->a:[I

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x2

    const/4 v2, 0x0

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Invalid value type: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array v0, v2, [Ljava/lang/Object;

    invoke-static {p0, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-static {p0}, Ll1/v;->c(Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x4

    return p0

    :cond_0
    invoke-static {p0}, Ll1/y;->x(Lx1/x;)Z

    move-result p0

    if-eqz p0, :cond_1

    const p0, 0x7fffffff

    return p0

    :cond_1
    const/16 p0, 0xa

    return p0

    :pswitch_1
    const/16 p0, 0x9

    return p0

    :pswitch_2
    const/16 p0, 0x8

    return p0

    :pswitch_3
    const/4 p0, 0x7

    return p0

    :pswitch_4
    const/4 p0, 0x6

    return p0

    :pswitch_5
    const/4 p0, 0x5

    return p0

    :pswitch_6
    const/4 p0, 0x3

    return p0

    :pswitch_7
    return v1

    :pswitch_8
    const/4 p0, 0x1

    return p0

    :pswitch_9
    return v2

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
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

.method public static H(Lx1/x;ZLx1/x;Z)I
    .locals 0

    invoke-static {p0, p2}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result p0

    if-eqz p0, :cond_0

    return p0

    :cond_0
    if-eqz p1, :cond_1

    if-nez p3, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    if-nez p1, :cond_2

    if-eqz p3, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method private static a(Lx1/x;Lx1/x;)Z
    .locals 4

    invoke-virtual {p0}, Lx1/x;->f0()Lx1/a;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-virtual {p0}, Lx1/a;->c0()I

    move-result v0

    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result v1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_0

    return v2

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lx1/a;->c0()I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0, v0}, Lx1/a;->b0(I)Lx1/x;

    move-result-object v1

    invoke-virtual {p1, v0}, Lx1/a;->b0(I)Lx1/x;

    move-result-object v3

    invoke-static {v1, v3}, Ll1/y;->q(Lx1/x;Lx1/x;)Z

    move-result v1

    if-nez v1, :cond_1

    return v2

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, 0x1

    return p0
.end method

.method public static b(Lx1/x;)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v0, p0}, Ll1/y;->h(Ljava/lang/StringBuilder;Lx1/x;)V

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static c(Ljava/lang/StringBuilder;Lx1/a;)V
    .locals 2

    const-string v0, "["

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result v1

    if-ge v0, v1, :cond_1

    invoke-virtual {p1, v0}, Lx1/a;->b0(I)Lx1/x;

    move-result-object v1

    invoke-static {p0, v1}, Ll1/y;->h(Ljava/lang/StringBuilder;Lx1/x;)V

    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-eq v0, v1, :cond_0

    const-string v1, ","

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    const-string p1, "]"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static d(Ljava/lang/StringBuilder;Lb2/a;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lb2/a;->X()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lb2/a;->Y()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "geo(%s,%s)"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static e(Ljava/lang/StringBuilder;Lx1/r;)V
    .locals 4

    new-instance v0, Ljava/util/ArrayList;

    invoke-virtual {p1}, Lx1/r;->X()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v0}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    const-string v1, "{"

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    if-nez v1, :cond_0

    const-string v3, ","

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    :goto_1
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, ":"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v2}, Lx1/r;->Z(Ljava/lang/String;)Lx1/x;

    move-result-object v2

    invoke-static {p0, v2}, Ll1/y;->h(Ljava/lang/StringBuilder;Lx1/x;)V

    goto :goto_0

    :cond_1
    const-string p1, "}"

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static f(Ljava/lang/StringBuilder;Lx1/x;)V
    .locals 3

    invoke-static {p1}, Ll1/y;->B(Lx1/x;)Z

    move-result v0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "Value should be a ReferenceValue"

    invoke-static {v0, v2, v1}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p1}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->k(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static g(Ljava/lang/StringBuilder;Lcom/google/protobuf/t1;)V
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v1, v0, v2

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->X()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const/4 v1, 0x1

    aput-object p1, v0, v1

    const-string p1, "time(%s,%s)"

    invoke-static {p1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private static h(Ljava/lang/StringBuilder;Lx1/x;)V
    .locals 2

    sget-object v0, Ll1/y$a;->a:[I

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "Invalid value type: "

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    new-array p1, p1, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-virtual {p1}, Lx1/x;->m0()Lx1/r;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->e(Ljava/lang/StringBuilder;Lx1/r;)V

    goto :goto_1

    :pswitch_1
    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->c(Ljava/lang/StringBuilder;Lx1/a;)V

    goto :goto_1

    :pswitch_2
    invoke-virtual {p1}, Lx1/x;->k0()Lb2/a;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->d(Ljava/lang/StringBuilder;Lb2/a;)V

    goto :goto_1

    :pswitch_3
    invoke-static {p0, p1}, Ll1/y;->f(Ljava/lang/StringBuilder;Lx1/x;)V

    goto :goto_1

    :pswitch_4
    invoke-virtual {p1}, Lx1/x;->h0()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-static {p1}, Lp1/g0;->y(Lcom/google/protobuf/j;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_5
    invoke-virtual {p1}, Lx1/x;->o0()Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :pswitch_6
    invoke-virtual {p1}, Lx1/x;->p0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->g(Ljava/lang/StringBuilder;Lcom/google/protobuf/t1;)V

    goto :goto_1

    :pswitch_7
    invoke-virtual {p1}, Lx1/x;->j0()D

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_8
    invoke-virtual {p1}, Lx1/x;->l0()J

    move-result-wide v0

    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_9
    invoke-virtual {p1}, Lx1/x;->g0()Z

    move-result p1

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    goto :goto_1

    :pswitch_a
    const-string p1, "null"

    :goto_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    return-void

    :pswitch_data_0
    .packed-switch 0x1
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

.method public static i(Lx1/x;Lx1/x;)I
    .locals 3

    invoke-static {p0}, Ll1/y;->G(Lx1/x;)I

    move-result v0

    invoke-static {p1}, Ll1/y;->G(Lx1/x;)I

    move-result v1

    if-eq v0, v1, :cond_0

    invoke-static {v0, v1}, Lp1/g0;->k(II)I

    move-result p0

    return p0

    :cond_0
    const v1, 0x7fffffff

    const/4 v2, 0x0

    if-eq v0, v1, :cond_1

    packed-switch v0, :pswitch_data_0

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string p1, "Invalid value type: "

    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    new-array p1, v2, [Ljava/lang/Object;

    invoke-static {p0, p1}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0

    :pswitch_0
    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->m0()Lx1/r;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->l(Lx1/r;Lx1/r;)I

    move-result p0

    return p0

    :pswitch_1
    invoke-virtual {p0}, Lx1/x;->f0()Lx1/a;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->j(Lx1/a;Lx1/a;)I

    move-result p0

    return p0

    :pswitch_2
    invoke-virtual {p0}, Lx1/x;->k0()Lb2/a;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->k0()Lb2/a;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->k(Lb2/a;Lb2/a;)I

    move-result p0

    return p0

    :pswitch_3
    invoke-virtual {p0}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->n(Ljava/lang/String;Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_4
    invoke-virtual {p0}, Lx1/x;->h0()Lcom/google/protobuf/j;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->h0()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-static {p0, p1}, Lp1/g0;->i(Lcom/google/protobuf/j;Lcom/google/protobuf/j;)I

    move-result p0

    return p0

    :pswitch_5
    invoke-virtual {p0}, Lx1/x;->o0()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->o0()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0

    :pswitch_6
    invoke-static {p0}, Ll1/v;->a(Lx1/x;)Lcom/google/protobuf/t1;

    move-result-object p0

    invoke-static {p1}, Ll1/v;->a(Lx1/x;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->o(Lcom/google/protobuf/t1;Lcom/google/protobuf/t1;)I

    move-result p0

    return p0

    :pswitch_7
    invoke-virtual {p0}, Lx1/x;->p0()Lcom/google/protobuf/t1;

    move-result-object p0

    invoke-virtual {p1}, Lx1/x;->p0()Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-static {p0, p1}, Ll1/y;->o(Lcom/google/protobuf/t1;Lcom/google/protobuf/t1;)I

    move-result p0

    return p0

    :pswitch_8
    invoke-static {p0, p1}, Ll1/y;->m(Lx1/x;Lx1/x;)I

    move-result p0

    return p0

    :pswitch_9
    invoke-virtual {p0}, Lx1/x;->g0()Z

    move-result p0

    invoke-virtual {p1}, Lx1/x;->g0()Z

    move-result p1

    invoke-static {p0, p1}, Lp1/g0;->g(ZZ)I

    move-result p0

    return p0

    :cond_1
    :pswitch_a
    return v2

    nop

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

.method private static j(Lx1/a;Lx1/a;)I
    .locals 4

    invoke-virtual {p0}, Lx1/a;->c0()I

    move-result v0

    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    invoke-virtual {p0, v1}, Lx1/a;->b0(I)Lx1/x;

    move-result-object v2

    invoke-virtual {p1, v1}, Lx1/a;->b0(I)Lx1/x;

    move-result-object v3

    invoke-static {v2, v3}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lx1/a;->c0()I

    move-result p0

    invoke-virtual {p1}, Lx1/a;->c0()I

    move-result p1

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method private static k(Lb2/a;Lb2/a;)I
    .locals 4

    invoke-virtual {p0}, Lb2/a;->X()D

    move-result-wide v0

    invoke-virtual {p1}, Lb2/a;->X()D

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lp1/g0;->j(DD)I

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lb2/a;->Y()D

    move-result-wide v0

    invoke-virtual {p1}, Lb2/a;->Y()D

    move-result-wide p0

    invoke-static {v0, v1, p0, p1}, Lp1/g0;->j(DD)I

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method private static l(Lx1/r;Lx1/r;)I
    .locals 4

    new-instance v0, Ljava/util/TreeMap;

    invoke-virtual {p0}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    new-instance v0, Ljava/util/TreeMap;

    invoke-virtual {p1}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/util/TreeMap;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0}, Ljava/util/TreeMap;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_1

    return v2

    :cond_1
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    invoke-static {v0, v1}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    invoke-static {p0, p1}, Lp1/g0;->g(ZZ)I

    move-result p0

    return p0
.end method

.method private static m(Lx1/x;Lx1/x;)I
    .locals 5

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->i:Lx1/x$c;

    if-ne v0, v1, :cond_1

    invoke-virtual {p0}, Lx1/x;->j0()D

    move-result-wide v2

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lx1/x;->j0()D

    move-result-wide p0

    invoke-static {v2, v3, p0, p1}, Lp1/g0;->j(DD)I

    move-result p0

    return p0

    :cond_0
    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v1, Lx1/x$c;->h:Lx1/x$c;

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lx1/x;->l0()J

    move-result-wide p0

    invoke-static {v2, v3, p0, p1}, Lp1/g0;->m(DJ)I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    sget-object v2, Lx1/x$c;->h:Lx1/x$c;

    if-ne v0, v2, :cond_3

    invoke-virtual {p0}, Lx1/x;->l0()J

    move-result-wide v3

    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    if-ne v0, v2, :cond_2

    invoke-virtual {p1}, Lx1/x;->l0()J

    move-result-wide p0

    invoke-static {v3, v4, p0, p1}, Lp1/g0;->l(JJ)I

    move-result p0

    return p0

    :cond_2
    invoke-virtual {p1}, Lx1/x;->q0()Lx1/x$c;

    move-result-object v0

    if-ne v0, v1, :cond_3

    invoke-virtual {p1}, Lx1/x;->j0()D

    move-result-wide p0

    invoke-static {p0, p1, v3, v4}, Lp1/g0;->m(DJ)I

    move-result p0

    mul-int/lit8 p0, p0, -0x1

    return p0

    :cond_3
    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    aput-object p0, v0, v1

    const/4 p0, 0x1

    aput-object p1, v0, p0

    const-string p0, "Unexpected values: %s vs %s"

    invoke-static {p0, v0}, Lp1/b;->a(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/AssertionError;

    move-result-object p0

    throw p0
.end method

.method private static n(Ljava/lang/String;Ljava/lang/String;)I
    .locals 4

    const-string v0, "/"

    const/4 v1, -0x1

    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p0

    array-length v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    aget-object v2, p0, v1

    aget-object v3, p1, v1

    invoke-virtual {v2, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method private static o(Lcom/google/protobuf/t1;Lcom/google/protobuf/t1;)I
    .locals 4

    invoke-virtual {p0}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v0

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->Y()J

    move-result-wide v2

    invoke-static {v0, v1, v2, v3}, Lp1/g0;->l(JJ)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Lcom/google/protobuf/t1;->X()I

    move-result p0

    invoke-virtual {p1}, Lcom/google/protobuf/t1;->X()I

    move-result p1

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method public static p(Lx1/b;Lx1/x;)Z
    .locals 1

    invoke-interface {p0}, Lx1/b;->k()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Ll1/y;->q(Lx1/x;Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static q(Lx1/x;Lx1/x;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p0, :cond_8

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {p0}, Ll1/y;->G(Lx1/x;)I

    move-result v2

    invoke-static {p1}, Ll1/y;->G(Lx1/x;)I

    move-result v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    const/4 v1, 0x2

    if-eq v2, v1, :cond_7

    const/4 v1, 0x4

    if-eq v2, v1, :cond_6

    const v1, 0x7fffffff

    if-eq v2, v1, :cond_5

    const/16 v0, 0x9

    if-eq v2, v0, :cond_4

    const/16 v0, 0xa

    if-eq v2, v0, :cond_3

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_3
    invoke-static {p0, p1}, Ll1/y;->E(Lx1/x;Lx1/x;)Z

    move-result p0

    return p0

    :cond_4
    invoke-static {p0, p1}, Ll1/y;->a(Lx1/x;Lx1/x;)Z

    move-result p0

    return p0

    :cond_5
    return v0

    :cond_6
    invoke-static {p0}, Ll1/v;->a(Lx1/x;)Lcom/google/protobuf/t1;

    move-result-object p0

    invoke-static {p1}, Ll1/v;->a(Lx1/x;)Lcom/google/protobuf/t1;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0

    :cond_7
    invoke-static {p0, p1}, Ll1/y;->D(Lx1/x;Lx1/x;)Z

    move-result p0

    return p0

    :cond_8
    :goto_0
    return v1
.end method

.method public static r(Lx1/x$c;)Lx1/x;
    .locals 3

    sget-object v0, Ll1/y$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    invoke-static {}, Lx1/r;->V()Lx1/r;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx1/x$b;->N(Lx1/r;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_1
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    invoke-static {}, Lx1/a;->a0()Lx1/a;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx1/x$b;->E(Lx1/a;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_2
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    invoke-static {}, Lb2/a;->Z()Lb2/a$b;

    move-result-object v0

    const-wide v1, -0x3fa9800000000000L    # -90.0

    invoke-virtual {v0, v1, v2}, Lb2/a$b;->B(D)Lb2/a$b;

    move-result-object v0

    const-wide v1, -0x3f99800000000000L    # -180.0

    invoke-virtual {v0, v1, v2}, Lb2/a$b;->D(D)Lb2/a$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx1/x$b;->I(Lb2/a$b;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_3
    sget-object p0, Ll1/f;->g:Ll1/f;

    invoke-static {}, Ll1/l;->h()Ll1/l;

    move-result-object v0

    invoke-static {p0, v0}, Ll1/y;->F(Ll1/f;Ll1/l;)Lx1/x;

    move-result-object p0

    return-object p0

    :pswitch_4
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    invoke-virtual {p0, v0}, Lx1/x$b;->G(Lcom/google/protobuf/j;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_5
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    const-string v0, ""

    invoke-virtual {p0, v0}, Lx1/x$b;->Q(Ljava/lang/String;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_6
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    invoke-static {}, Lcom/google/protobuf/t1;->Z()Lcom/google/protobuf/t1$b;

    move-result-object v0

    const-wide/high16 v1, -0x8000000000000000L

    invoke-virtual {v0, v1, v2}, Lcom/google/protobuf/t1$b;->D(J)Lcom/google/protobuf/t1$b;

    move-result-object v0

    invoke-virtual {p0, v0}, Lx1/x$b;->R(Lcom/google/protobuf/t1$b;)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_7
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    const-wide/high16 v0, 0x7ff8000000000000L    # Double.NaN

    invoke-virtual {p0, v0, v1}, Lx1/x$b;->H(D)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_8
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object p0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Lx1/x$b;->F(Z)Lx1/x$b;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/x;

    return-object p0

    :pswitch_9
    sget-object p0, Ll1/y;->b:Lx1/x;

    return-object p0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
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

.method public static s(Lx1/x$c;)Lx1/x;
    .locals 3

    sget-object v0, Ll1/y$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown value type: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    sget-object p0, Ll1/y;->e:Lx1/x;

    return-object p0

    :pswitch_1
    sget-object p0, Lx1/x$c;->p:Lx1/x$c;

    :goto_0
    invoke-static {p0}, Ll1/y;->r(Lx1/x$c;)Lx1/x;

    move-result-object p0

    return-object p0

    :pswitch_2
    sget-object p0, Lx1/x$c;->o:Lx1/x$c;

    goto :goto_0

    :pswitch_3
    sget-object p0, Lx1/x$c;->n:Lx1/x$c;

    goto :goto_0

    :pswitch_4
    sget-object p0, Lx1/x$c;->m:Lx1/x$c;

    goto :goto_0

    :pswitch_5
    sget-object p0, Lx1/x$c;->l:Lx1/x$c;

    goto :goto_0

    :pswitch_6
    sget-object p0, Lx1/x$c;->k:Lx1/x$c;

    goto :goto_0

    :pswitch_7
    sget-object p0, Lx1/x$c;->j:Lx1/x$c;

    goto :goto_0

    :pswitch_8
    sget-object p0, Lx1/x$c;->h:Lx1/x$c;

    goto :goto_0

    :pswitch_9
    sget-object p0, Lx1/x$c;->g:Lx1/x$c;

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_9
        :pswitch_8
        :pswitch_7
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

.method public static t(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->o:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static u(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->i:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static v(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->h:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static w(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->p:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static x(Lx1/x;)Z
    .locals 2

    sget-object v0, Ll1/y;->d:Lx1/x;

    invoke-virtual {p0}, Lx1/x;->m0()Lx1/r;

    move-result-object p0

    invoke-virtual {p0}, Lx1/r;->X()Ljava/util/Map;

    move-result-object p0

    const-string v1, "__type__"

    invoke-interface {p0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/google/protobuf/a0;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static y(Lx1/x;)Z
    .locals 2

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->j0()D

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Double;->isNaN(D)Z

    move-result p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static z(Lx1/x;)Z
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lx1/x;->q0()Lx1/x$c;

    move-result-object p0

    sget-object v0, Lx1/x$c;->f:Lx1/x$c;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method
