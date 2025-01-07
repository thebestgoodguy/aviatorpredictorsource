.class public final Lx1/t;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/t$b;,
        Lx1/t$j;,
        Lx1/t$g;,
        Lx1/t$i;,
        Lx1/t$k;,
        Lx1/t$f;,
        Lx1/t$d;,
        Lx1/t$h;,
        Lx1/t$c;,
        Lx1/t$e;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/t;",
        "Lx1/t$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/t;

.field public static final END_AT_FIELD_NUMBER:I = 0x8

.field public static final FROM_FIELD_NUMBER:I = 0x2

.field public static final LIMIT_FIELD_NUMBER:I = 0x5

.field public static final OFFSET_FIELD_NUMBER:I = 0x6

.field public static final ORDER_BY_FIELD_NUMBER:I = 0x4

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/t;",
            ">;"
        }
    .end annotation
.end field

.field public static final SELECT_FIELD_NUMBER:I = 0x1

.field public static final START_AT_FIELD_NUMBER:I = 0x7

.field public static final WHERE_FIELD_NUMBER:I = 0x3


# instance fields
.field private endAt_:Lx1/g;

.field private from_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/t$c;",
            ">;"
        }
    .end annotation
.end field

.field private limit_:Lcom/google/protobuf/b0;

.field private offset_:I

.field private orderBy_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/t$i;",
            ">;"
        }
    .end annotation
.end field

.field private select_:Lx1/t$j;

.field private startAt_:Lx1/g;

.field private where_:Lx1/t$h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/t;

    invoke-direct {v0}, Lx1/t;-><init>()V

    sput-object v0, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    const-class v1, Lx1/t;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/t;
    .locals 1

    sget-object v0, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    return-object v0
.end method

.method static synthetic U(Lx1/t;Lx1/t$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->a0(Lx1/t$c;)V

    return-void
.end method

.method static synthetic V(Lx1/t;Lx1/t$h;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->v0(Lx1/t$h;)V

    return-void
.end method

.method static synthetic W(Lx1/t;Lx1/t$i;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->b0(Lx1/t$i;)V

    return-void
.end method

.method static synthetic X(Lx1/t;Lx1/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->u0(Lx1/g;)V

    return-void
.end method

.method static synthetic Y(Lx1/t;Lx1/g;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->s0(Lx1/g;)V

    return-void
.end method

.method static synthetic Z(Lx1/t;Lcom/google/protobuf/b0;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t;->t0(Lcom/google/protobuf/b0;)V

    return-void
.end method

.method private a0(Lx1/t$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/t;->c0()V

    iget-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private b0(Lx1/t$i;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/t;->d0()V

    iget-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private c0()V
    .locals 2

    iget-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method private d0()V
    .locals 2

    iget-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static e0()Lx1/t;
    .locals 1

    sget-object v0, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    return-object v0
.end method

.method public static r0()Lx1/t$b;
    .locals 1

    sget-object v0, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/t$b;

    return-object v0
.end method

.method private s0(Lx1/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t;->endAt_:Lx1/g;

    return-void
.end method

.method private t0(Lcom/google/protobuf/b0;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t;->limit_:Lcom/google/protobuf/b0;

    return-void
.end method

.method private u0(Lx1/g;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t;->startAt_:Lx1/g;

    return-void
.end method

.method private v0(Lx1/t$h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t;->where_:Lx1/t$h;

    return-void
.end method


# virtual methods
.method public f0()Lx1/g;
    .locals 1

    iget-object v0, p0, Lx1/t;->endAt_:Lx1/g;

    if-nez v0, :cond_0

    invoke-static {}, Lx1/g;->Z()Lx1/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public g0(I)Lx1/t$c;
    .locals 1

    iget-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/t$c;

    return-object p1
.end method

.method public h0()I
    .locals 1

    iget-object v0, p0, Lx1/t;->from_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public i0()Lcom/google/protobuf/b0;
    .locals 1

    iget-object v0, p0, Lx1/t;->limit_:Lcom/google/protobuf/b0;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/b0;->V()Lcom/google/protobuf/b0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public j0(I)Lx1/t$i;
    .locals 1

    iget-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/t$i;

    return-object p1
.end method

.method public k0()I
    .locals 1

    iget-object v0, p0, Lx1/t;->orderBy_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public l0()Lx1/g;
    .locals 1

    iget-object v0, p0, Lx1/t;->startAt_:Lx1/g;

    if-nez v0, :cond_0

    invoke-static {}, Lx1/g;->Z()Lx1/g;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public m0()Lx1/t$h;
    .locals 1

    iget-object v0, p0, Lx1/t;->where_:Lx1/t$h;

    if-nez v0, :cond_0

    invoke-static {}, Lx1/t$h;->Y()Lx1/t$h;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public n0()Z
    .locals 1

    iget-object v0, p0, Lx1/t;->endAt_:Lx1/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public o0()Z
    .locals 1

    iget-object v0, p0, Lx1/t;->limit_:Lcom/google/protobuf/b0;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public p0()Z
    .locals 1

    iget-object v0, p0, Lx1/t;->startAt_:Lx1/g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public q0()Z
    .locals 1

    iget-object v0, p0, Lx1/t;->where_:Lx1/t$h;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/t$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    const/4 p2, 0x1

    const/4 p3, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object p3

    :pswitch_1
    invoke-static {p2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lx1/t;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/t;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/t;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/t;->PARSER:Lcom/google/protobuf/f1;

    :cond_0
    monitor-exit p2

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1

    :cond_1
    :goto_0
    return-object p1

    :pswitch_3
    sget-object p1, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    return-object p1

    :pswitch_4
    const/16 p1, 0xa

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "select_"

    aput-object v0, p1, p3

    const-string p3, "from_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/t$c;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "where_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "orderBy_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lx1/t$i;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "limit_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "offset_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-string p3, "startAt_"

    aput-object p3, p1, p2

    const/16 p2, 0x9

    const-string p3, "endAt_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0008\u0000\u0000\u0001\u0008\u0008\u0000\u0002\u0000\u0001\t\u0002\u001b\u0003\t\u0004\u001b\u0005\t\u0006\u0004\u0007\t\u0008\t"

    sget-object p3, Lx1/t;->DEFAULT_INSTANCE:Lx1/t;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/t$b;

    invoke-direct {p1, p3}, Lx1/t$b;-><init>(Lx1/t$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/t;

    invoke-direct {p1}, Lx1/t;-><init>()V

    return-object p1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
