.class public final Lx1/t$d;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/t$d$a;,
        Lx1/t$d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/t$d;",
        "Lx1/t$d$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/t$d;

.field public static final FILTERS_FIELD_NUMBER:I = 0x2

.field public static final OP_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/t$d;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private filters_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/t$h;",
            ">;"
        }
    .end annotation
.end field

.field private op_:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/t$d;

    invoke-direct {v0}, Lx1/t$d;-><init>()V

    sput-object v0, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    const-class v1, Lx1/t$d;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t$d;->filters_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/t$d;
    .locals 1

    sget-object v0, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    return-object v0
.end method

.method static synthetic U(Lx1/t$d;Lx1/t$d$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t$d;->c0(Lx1/t$d$b;)V

    return-void
.end method

.method static synthetic V(Lx1/t$d;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t$d;->W(Ljava/lang/Iterable;)V

    return-void
.end method

.method private W(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lx1/t$h;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lx1/t$d;->X()V

    iget-object v0, p0, Lx1/t$d;->filters_:Lcom/google/protobuf/d0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private X()V
    .locals 2

    iget-object v0, p0, Lx1/t$d;->filters_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/t$d;->filters_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static Y()Lx1/t$d;
    .locals 1

    sget-object v0, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    return-object v0
.end method

.method public static b0()Lx1/t$d$a;
    .locals 1

    sget-object v0, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/t$d$a;

    return-object v0
.end method

.method private c0(Lx1/t$d$b;)V
    .locals 0

    invoke-virtual {p1}, Lx1/t$d$b;->e()I

    move-result p1

    iput p1, p0, Lx1/t$d;->op_:I

    return-void
.end method


# virtual methods
.method public Z()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/t$h;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/t$d;->filters_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

.method public a0()Lx1/t$d$b;
    .locals 1

    iget v0, p0, Lx1/t$d;->op_:I

    invoke-static {v0}, Lx1/t$d$b;->d(I)Lx1/t$d$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lx1/t$d$b;->h:Lx1/t$d$b;

    :cond_0
    return-object v0
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
    sget-object p1, Lx1/t$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/t$d;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/t$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/t$d;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "op_"

    aput-object v0, p1, p3

    const-string p3, "filters_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/t$h;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000c\u0002\u001b"

    sget-object p3, Lx1/t$d;->DEFAULT_INSTANCE:Lx1/t$d;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/t$d$a;

    invoke-direct {p1, p3}, Lx1/t$d$a;-><init>(Lx1/t$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/t$d;

    invoke-direct {p1}, Lx1/t$d;-><init>()V

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
