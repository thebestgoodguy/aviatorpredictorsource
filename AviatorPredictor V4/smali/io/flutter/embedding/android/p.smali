.class public Lio/flutter/embedding/android/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/flutter/embedding/android/q$d;


# instance fields
.field private final a:Lr2/b;

.field private final b:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Lio/flutter/embedding/android/r$e;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lio/flutter/embedding/android/q$b;


# direct methods
.method public constructor <init>(Lr2/b;)V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/android/p;->c:Ljava/util/HashMap;

    new-instance v0, Lio/flutter/embedding/android/q$b;

    invoke-direct {v0}, Lio/flutter/embedding/android/q$b;-><init>()V

    iput-object v0, p0, Lio/flutter/embedding/android/p;->d:Lio/flutter/embedding/android/q$b;

    iput-object p1, p0, Lio/flutter/embedding/android/p;->a:Lr2/b;

    invoke-static {}, Lio/flutter/embedding/android/r;->a()[Lio/flutter/embedding/android/r$e;

    move-result-object p1

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    iget-object v3, p0, Lio/flutter/embedding/android/p;->c:Ljava/util/HashMap;

    iget-wide v4, v2, Lio/flutter/embedding/android/r$e;->c:J

    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public static synthetic b(Lio/flutter/embedding/android/q$d$a;Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-static {p0, p1}, Lio/flutter/embedding/android/p;->h(Lio/flutter/embedding/android/q$d$a;Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method private static c(Landroid/view/KeyEvent;)Lio/flutter/embedding/android/n$a;
    .locals 2

    invoke-virtual {p0}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    const/4 v1, 0x1

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Landroid/view/KeyEvent;->getAction()I

    move-result p0

    if-eqz p0, :cond_2

    if-ne p0, v1, :cond_1

    sget-object p0, Lio/flutter/embedding/android/n$a;->g:Lio/flutter/embedding/android/n$a;

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/AssertionError;

    const-string v0, "Unexpected event type"

    invoke-direct {p0, v0}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p0

    :cond_2
    if-eqz v0, :cond_3

    sget-object p0, Lio/flutter/embedding/android/n$a;->h:Lio/flutter/embedding/android/n$a;

    goto :goto_1

    :cond_3
    sget-object p0, Lio/flutter/embedding/android/n$a;->f:Lio/flutter/embedding/android/n$a;

    :goto_1
    return-object p0
.end method

.method private d(Landroid/view/KeyEvent;)Ljava/lang/Long;
    .locals 4

    sget-object v0, Lio/flutter/embedding/android/r;->b:Ljava/util/HashMap;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    int-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    int-to-long v0, p1

    const-wide v2, 0x1100000000L

    invoke-static {v0, v1, v2, v3}, Lio/flutter/embedding/android/p;->g(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1
.end method

.method private e(Landroid/view/KeyEvent;)Ljava/lang/Long;
    .locals 7

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v0

    int-to-long v0, v0

    const-wide v2, 0x1100000000L

    const-wide/16 v4, 0x0

    cmp-long v6, v0, v4

    if-nez v6, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result p1

    :goto_0
    int-to-long v0, p1

    invoke-static {v0, v1, v2, v3}, Lio/flutter/embedding/android/p;->g(JJ)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    return-object p1

    :cond_0
    sget-object v4, Lio/flutter/embedding/android/r;->a:Ljava/util/HashMap;

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    move-result p1

    goto :goto_0
.end method

.method private f(Landroid/view/KeyEvent;Lio/flutter/embedding/android/q$d$a;)Z
    .locals 14

    move-object v6, p0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getScanCode()I

    move-result v0

    const/4 v7, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v0

    if-nez v0, :cond_0

    return v7

    :cond_0
    invoke-direct {p0, p1}, Lio/flutter/embedding/android/p;->e(Landroid/view/KeyEvent;)Ljava/lang/Long;

    move-result-object v8

    invoke-direct {p0, p1}, Lio/flutter/embedding/android/p;->d(Landroid/view/KeyEvent;)Ljava/lang/Long;

    move-result-object v9

    sget-object v10, Lio/flutter/embedding/android/r;->c:[Lio/flutter/embedding/android/r$d;

    array-length v11, v10

    const/4 v12, 0x0

    :goto_0
    const/4 v13, 0x1

    if-ge v12, v11, :cond_2

    aget-object v1, v10, v12

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    iget v2, v1, Lio/flutter/embedding/android/r$d;->a:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    const/4 v2, 0x1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lio/flutter/embedding/android/p;->j(Lio/flutter/embedding/android/r$d;ZJLandroid/view/KeyEvent;)V

    add-int/lit8 v12, v12, 0x1

    goto :goto_0

    :cond_2
    iget-object v0, v6, Lio/flutter/embedding/android/p;->c:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_2
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/flutter/embedding/android/r$e;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getMetaState()I

    move-result v0

    iget v2, v1, Lio/flutter/embedding/android/r$e;->a:I

    and-int/2addr v0, v2

    if-eqz v0, :cond_3

    const/4 v2, 0x1

    goto :goto_3

    :cond_3
    const/4 v2, 0x0

    :goto_3
    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p1

    invoke-virtual/range {v0 .. v5}, Lio/flutter/embedding/android/p;->k(Lio/flutter/embedding/android/r$e;ZJLandroid/view/KeyEvent;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-eqz v0, :cond_6

    if-eq v0, v13, :cond_5

    return v7

    :cond_5
    const/4 v10, 0x0

    goto :goto_4

    :cond_6
    const/4 v10, 0x1

    :goto_4
    iget-object v0, v6, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    invoke-virtual {v0, v8}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Ljava/lang/Long;

    const/4 v11, 0x0

    if-eqz v10, :cond_9

    if-nez v2, :cond_7

    :goto_5
    sget-object v0, Lio/flutter/embedding/android/n$a;->f:Lio/flutter/embedding/android/n$a;

    goto :goto_6

    :cond_7
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    move-result v0

    if-lez v0, :cond_8

    sget-object v0, Lio/flutter/embedding/android/n$a;->h:Lio/flutter/embedding/android/n$a;

    goto :goto_6

    :cond_8
    const/4 v1, 0x0

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v4

    move-object v0, p0

    move-object v3, v8

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/android/p;->l(ZLjava/lang/Long;Ljava/lang/Long;J)V

    goto :goto_5

    :goto_6
    iget-object v1, v6, Lio/flutter/embedding/android/p;->d:Lio/flutter/embedding/android/q$b;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getUnicodeChar()I

    move-result v2

    invoke-virtual {v1, v2}, Lio/flutter/embedding/android/q$b;->a(I)Ljava/lang/Character;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Character;->charValue()C

    move-result v1

    if-eqz v1, :cond_b

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ""

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    goto :goto_7

    :cond_9
    if-nez v2, :cond_a

    return v7

    :cond_a
    sget-object v0, Lio/flutter/embedding/android/n$a;->g:Lio/flutter/embedding/android/n$a;

    :cond_b
    move-object v1, v11

    :goto_7
    sget-object v2, Lio/flutter/embedding/android/n$a;->h:Lio/flutter/embedding/android/n$a;

    if-eq v0, v2, :cond_d

    if-eqz v10, :cond_c

    move-object v11, v9

    :cond_c
    invoke-virtual {p0, v8, v11}, Lio/flutter/embedding/android/p;->m(Ljava/lang/Long;Ljava/lang/Long;)V

    :cond_d
    sget-object v2, Lio/flutter/embedding/android/n$a;->f:Lio/flutter/embedding/android/n$a;

    if-ne v0, v2, :cond_e

    iget-object v2, v6, Lio/flutter/embedding/android/p;->c:Ljava/util/HashMap;

    invoke-virtual {v2, v9}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/flutter/embedding/android/r$e;

    if-eqz v2, :cond_e

    iget-boolean v3, v2, Lio/flutter/embedding/android/r$e;->d:Z

    xor-int/2addr v3, v13

    iput-boolean v3, v2, Lio/flutter/embedding/android/r$e;->d:Z

    :cond_e
    new-instance v2, Lio/flutter/embedding/android/n;

    invoke-direct {v2}, Lio/flutter/embedding/android/n;-><init>()V

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v3

    iput-wide v3, v2, Lio/flutter/embedding/android/n;->a:J

    iput-object v0, v2, Lio/flutter/embedding/android/n;->b:Lio/flutter/embedding/android/n$a;

    invoke-virtual {v9}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v2, Lio/flutter/embedding/android/n;->d:J

    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    iput-wide v3, v2, Lio/flutter/embedding/android/n;->c:J

    iput-object v1, v2, Lio/flutter/embedding/android/n;->f:Ljava/lang/String;

    iput-boolean v7, v2, Lio/flutter/embedding/android/n;->e:Z

    move-object/from16 v0, p2

    invoke-direct {p0, v2, v0}, Lio/flutter/embedding/android/p;->i(Lio/flutter/embedding/android/n;Lio/flutter/embedding/android/q$d$a;)V

    return v13
.end method

.method private static g(JJ)J
    .locals 2

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    or-long/2addr p0, p2

    return-wide p0
.end method

.method private static synthetic h(Lio/flutter/embedding/android/q$d$a;Ljava/nio/ByteBuffer;)V
    .locals 2

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->get()B

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-interface {p0, p1}, Lio/flutter/embedding/android/q$d$a;->a(Z)V

    return-void
.end method

.method private i(Lio/flutter/embedding/android/n;Lio/flutter/embedding/android/q$d$a;)V
    .locals 2

    if-nez p2, :cond_0

    const/4 p2, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lio/flutter/embedding/android/o;

    invoke-direct {v0, p2}, Lio/flutter/embedding/android/o;-><init>(Lio/flutter/embedding/android/q$d$a;)V

    move-object p2, v0

    :goto_0
    iget-object v0, p0, Lio/flutter/embedding/android/p;->a:Lr2/b;

    invoke-virtual {p1}, Lio/flutter/embedding/android/n;->a()Ljava/nio/ByteBuffer;

    move-result-object p1

    const-string v1, "flutter/keydata"

    invoke-interface {v0, v1, p1, p2}, Lr2/b;->e(Ljava/lang/String;Ljava/nio/ByteBuffer;Lr2/b$b;)V

    return-void
.end method

.method private l(ZLjava/lang/Long;Ljava/lang/Long;J)V
    .locals 5

    new-instance v0, Lio/flutter/embedding/android/n;

    invoke-direct {v0}, Lio/flutter/embedding/android/n;-><init>()V

    iput-wide p4, v0, Lio/flutter/embedding/android/n;->a:J

    if-eqz p1, :cond_0

    sget-object p4, Lio/flutter/embedding/android/n$a;->f:Lio/flutter/embedding/android/n$a;

    goto :goto_0

    :cond_0
    sget-object p4, Lio/flutter/embedding/android/n$a;->g:Lio/flutter/embedding/android/n$a;

    :goto_0
    iput-object p4, v0, Lio/flutter/embedding/android/n;->b:Lio/flutter/embedding/android/n$a;

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    iput-wide p4, v0, Lio/flutter/embedding/android/n;->d:J

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide p4

    iput-wide p4, v0, Lio/flutter/embedding/android/n;->c:J

    const/4 p4, 0x0

    iput-object p4, v0, Lio/flutter/embedding/android/n;->f:Ljava/lang/String;

    const/4 p5, 0x1

    iput-boolean p5, v0, Lio/flutter/embedding/android/n;->e:Z

    invoke-virtual {p3}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    const-wide/16 v3, 0x0

    cmp-long p5, v1, v3

    if-eqz p5, :cond_2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    cmp-long p5, v1, v3

    if-eqz p5, :cond_2

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    move-object p2, p4

    :goto_1
    invoke-virtual {p0, p3, p2}, Lio/flutter/embedding/android/p;->m(Ljava/lang/Long;Ljava/lang/Long;)V

    :cond_2
    invoke-direct {p0, v0, p4}, Lio/flutter/embedding/android/p;->i(Lio/flutter/embedding/android/n;Lio/flutter/embedding/android/q$d$a;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/view/KeyEvent;Lio/flutter/embedding/android/q$d$a;)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lio/flutter/embedding/android/p;->f(Landroid/view/KeyEvent;Lio/flutter/embedding/android/q$d$a;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 v1, 0x1

    const-wide/16 v2, 0x0

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    const-wide/16 v4, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/android/p;->l(ZLjava/lang/Long;Ljava/lang/Long;J)V

    const/4 p1, 0x1

    invoke-interface {p2, p1}, Lio/flutter/embedding/android/q$d$a;->a(Z)V

    :cond_0
    return-void
.end method

.method j(Lio/flutter/embedding/android/r$d;ZJLandroid/view/KeyEvent;)V
    .locals 10

    iget-object v0, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    array-length v1, v0

    new-array v1, v1, [Z

    array-length v0, v0

    new-array v0, v0, [Ljava/lang/Boolean;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    :goto_0
    iget-object v5, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    array-length v6, v5

    const/4 v7, 0x1

    if-ge v3, v6, :cond_8

    iget-object v6, p0, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    aget-object v5, v5, v3

    iget-wide v8, v5, Lio/flutter/embedding/android/r$c;->a:J

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    invoke-virtual {v6, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v5

    aput-boolean v5, v1, v3

    iget-object v5, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    aget-object v5, v5, v3

    iget-wide v5, v5, Lio/flutter/embedding/android/r$c;->b:J

    cmp-long v8, v5, p3

    if-nez v8, :cond_5

    sget-object v5, Lio/flutter/embedding/android/p$a;->a:[I

    invoke-static {p5}, Lio/flutter/embedding/android/p;->c(Landroid/view/KeyEvent;)Lio/flutter/embedding/android/n$a;

    move-result-object v6

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v5, v5, v6

    if-eq v5, v7, :cond_3

    const/4 v6, 0x2

    if-eq v5, v6, :cond_2

    const/4 v6, 0x3

    if-eq v5, v6, :cond_0

    goto :goto_3

    :cond_0
    if-eqz p2, :cond_1

    aget-boolean v4, v1, v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    aput-object v4, v0, v3

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/AssertionError;

    new-array p2, v7, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v2

    const-string p3, "Unexpected metaState 0 for key 0x%x during an ACTION_down repeat event."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_2
    aget-boolean v5, v1, v3

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v5

    aput-object v5, v0, v3

    goto :goto_3

    :cond_3
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object v4, v0, v3

    if-eqz p2, :cond_4

    :goto_1
    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    new-instance p1, Ljava/lang/AssertionError;

    new-array p2, v7, [Ljava/lang/Object;

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    aput-object p3, p2, v2

    const-string p3, "Unexpected metaState 0 for key 0x%x during an ACTION_down event."

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_5
    if-nez v4, :cond_7

    aget-boolean v4, v1, v3

    if-eqz v4, :cond_6

    goto :goto_2

    :cond_6
    const/4 v7, 0x0

    :cond_7
    :goto_2
    move v4, v7

    :goto_3
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_0

    :cond_8
    if-eqz p2, :cond_c

    const/4 p2, 0x0

    :goto_4
    iget-object p3, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    array-length p3, p3

    if-ge p2, p3, :cond_b

    aget-object p3, v0, p2

    if-eqz p3, :cond_9

    goto :goto_5

    :cond_9
    if-eqz v4, :cond_a

    aget-boolean p3, v1, p2

    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p3

    aput-object p3, v0, p2

    goto :goto_5

    :cond_a
    sget-object p3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object p3, v0, p2

    const/4 v4, 0x1

    :goto_5
    add-int/lit8 p2, p2, 0x1

    goto :goto_4

    :cond_b
    if-nez v4, :cond_e

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    aput-object p2, v0, v2

    goto :goto_8

    :cond_c
    const/4 p2, 0x0

    :goto_6
    iget-object p3, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    array-length p3, p3

    if-ge p2, p3, :cond_e

    aget-object p3, v0, p2

    if-eqz p3, :cond_d

    goto :goto_7

    :cond_d
    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    aput-object p3, v0, p2

    :goto_7
    add-int/lit8 p2, p2, 0x1

    goto :goto_6

    :cond_e
    :goto_8
    iget-object p2, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    array-length p2, p2

    if-ge v2, p2, :cond_10

    aget-boolean p2, v1, v2

    aget-object p3, v0, v2

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eq p2, p3, :cond_f

    iget-object p2, p1, Lio/flutter/embedding/android/r$d;->b:[Lio/flutter/embedding/android/r$c;

    aget-object p2, p2, v2

    aget-object p3, v0, v2

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    iget-wide p3, p2, Lio/flutter/embedding/android/r$c;->b:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v5

    iget-wide p2, p2, Lio/flutter/embedding/android/r$c;->a:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-virtual {p5}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v7

    move-object v3, p0

    invoke-direct/range {v3 .. v8}, Lio/flutter/embedding/android/p;->l(ZLjava/lang/Long;Ljava/lang/Long;J)V

    :cond_f
    add-int/lit8 v2, v2, 0x1

    goto :goto_8

    :cond_10
    return-void
.end method

.method k(Lio/flutter/embedding/android/r$e;ZJLandroid/view/KeyEvent;)V
    .locals 6

    iget-wide v0, p1, Lio/flutter/embedding/android/r$e;->c:J

    cmp-long v2, v0, p3

    if-nez v2, :cond_0

    return-void

    :cond_0
    iget-boolean p3, p1, Lio/flutter/embedding/android/r$e;->d:Z

    if-eq p3, p2, :cond_3

    iget-object p2, p0, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    iget-wide p3, p1, Lio/flutter/embedding/android/r$e;->b:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    invoke-virtual {p2, p3}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    xor-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_1

    iget-boolean p3, p1, Lio/flutter/embedding/android/r$e;->d:Z

    xor-int/lit8 p3, p3, 0x1

    iput-boolean p3, p1, Lio/flutter/embedding/android/r$e;->d:Z

    :cond_1
    iget-wide p3, p1, Lio/flutter/embedding/android/r$e;->c:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide p3, p1, Lio/flutter/embedding/android/r$e;->b:J

    invoke-static {p3, p4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p5}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v4

    move-object v0, p0

    move v1, p2

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/android/p;->l(ZLjava/lang/Long;Ljava/lang/Long;J)V

    if-nez p2, :cond_2

    iget-boolean p3, p1, Lio/flutter/embedding/android/r$e;->d:Z

    xor-int/lit8 p3, p3, 0x1

    iput-boolean p3, p1, Lio/flutter/embedding/android/r$e;->d:Z

    :cond_2
    xor-int/lit8 v1, p2, 0x1

    iget-wide p2, p1, Lio/flutter/embedding/android/r$e;->c:J

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    iget-wide p1, p1, Lio/flutter/embedding/android/r$e;->b:J

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {p5}, Landroid/view/KeyEvent;->getEventTime()J

    move-result-wide v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/flutter/embedding/android/p;->l(ZLjava/lang/Long;Ljava/lang/Long;J)V

    :cond_3
    return-void
.end method

.method m(Ljava/lang/Long;Ljava/lang/Long;)V
    .locals 1

    if-eqz p2, :cond_1

    iget-object v0, p0, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "The key was not empty"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1

    :cond_1
    iget-object p2, p0, Lio/flutter/embedding/android/p;->b:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Long;

    if-eqz p1, :cond_2

    :goto_0
    return-void

    :cond_2
    new-instance p1, Ljava/lang/AssertionError;

    const-string p2, "The key was empty"

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method
