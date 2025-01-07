.class public final Lx1/a;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lx1/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/a;",
        "Lx1/a$b;",
        ">;",
        "Lx1/b;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/a;

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final VALUES_FIELD_NUMBER:I = 0x1


# instance fields
.field private values_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/a;

    invoke-direct {v0}, Lx1/a;-><init>()V

    sput-object v0, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    const-class v1, Lx1/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/a;
    .locals 1

    sget-object v0, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    return-object v0
.end method

.method static synthetic U(Lx1/a;Lx1/x;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/a;->Y(Lx1/x;)V

    return-void
.end method

.method static synthetic V(Lx1/a;Ljava/lang/Iterable;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/a;->X(Ljava/lang/Iterable;)V

    return-void
.end method

.method static synthetic W(Lx1/a;I)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/a;->e0(I)V

    return-void
.end method

.method private X(Ljava/lang/Iterable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lx1/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Lx1/a;->Z()V

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-static {p1, v0}, Lcom/google/protobuf/a;->i(Ljava/lang/Iterable;Ljava/util/List;)V

    return-void
.end method

.method private Y(Lx1/x;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/a;->Z()V

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private Z()V
    .locals 2

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static a0()Lx1/a;
    .locals 1

    sget-object v0, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    return-object v0
.end method

.method public static d0()Lx1/a$b;
    .locals 1

    sget-object v0, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/a$b;

    return-object v0
.end method

.method private e0(I)V
    .locals 1

    invoke-direct {p0}, Lx1/a;->Z()V

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public b0(I)Lx1/x;
    .locals 1

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1
.end method

.method public c0()I
    .locals 1

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/a;->values_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/a$a;->a:[I

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
    sget-object p1, Lx1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/a;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "values_"

    aput-object v0, p1, p3

    const-class p3, Lx1/x;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b"

    sget-object p3, Lx1/a;->DEFAULT_INSTANCE:Lx1/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/a$b;

    invoke-direct {p1, p3}, Lx1/a$b;-><init>(Lx1/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/a;

    invoke-direct {p1}, Lx1/a;-><init>()V

    return-object p1

    nop

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
