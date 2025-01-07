.class public final Lw1/a;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lw1/a$b;,
        Lw1/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lw1/a;",
        "Lw1/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lw1/a;

.field public static final LIMIT_TYPE_FIELD_NUMBER:I = 0x3

.field public static final PARENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lw1/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRUCTURED_QUERY_FIELD_NUMBER:I = 0x2


# instance fields
.field private limitType_:I

.field private parent_:Ljava/lang/String;

.field private queryTypeCase_:I

.field private queryType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lw1/a;

    invoke-direct {v0}, Lw1/a;-><init>()V

    sput-object v0, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    const-class v1, Lw1/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lw1/a;->queryTypeCase_:I

    const-string v0, ""

    iput-object v0, p0, Lw1/a;->parent_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T()Lw1/a;
    .locals 1

    sget-object v0, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    return-object v0
.end method

.method static synthetic U(Lw1/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/a;->d0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V(Lw1/a;Lx1/t;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/a;->e0(Lx1/t;)V

    return-void
.end method

.method static synthetic W(Lw1/a;Lw1/a$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lw1/a;->c0(Lw1/a$c;)V

    return-void
.end method

.method public static a0()Lw1/a$b;
    .locals 1

    sget-object v0, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lw1/a$b;

    return-object v0
.end method

.method public static b0([B)Lw1/a;
    .locals 1

    sget-object v0, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/a0;->N(Lcom/google/protobuf/a0;[B)Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lw1/a;

    return-object p0
.end method

.method private c0(Lw1/a$c;)V
    .locals 0

    invoke-virtual {p1}, Lw1/a$c;->e()I

    move-result p1

    iput p1, p0, Lw1/a;->limitType_:I

    return-void
.end method

.method private d0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lw1/a;->parent_:Ljava/lang/String;

    return-void
.end method

.method private e0(Lx1/t;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lw1/a;->queryType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lw1/a;->queryTypeCase_:I

    return-void
.end method


# virtual methods
.method public X()Lw1/a$c;
    .locals 1

    iget v0, p0, Lw1/a;->limitType_:I

    invoke-static {v0}, Lw1/a$c;->d(I)Lw1/a$c;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lw1/a$c;->h:Lw1/a$c;

    :cond_0
    return-object v0
.end method

.method public Y()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lw1/a;->parent_:Ljava/lang/String;

    return-object v0
.end method

.method public Z()Lx1/t;
    .locals 2

    iget v0, p0, Lw1/a;->queryTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lw1/a;->queryType_:Ljava/lang/Object;

    check-cast v0, Lx1/t;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/t;->e0()Lx1/t;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lw1/a$a;->a:[I

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
    sget-object p1, Lw1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lw1/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lw1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lw1/a;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "queryType_"

    aput-object v0, p1, p3

    const-string p3, "queryTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "parent_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lx1/t;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "limitType_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0208\u0002<\u0000\u0003\u000c"

    sget-object p3, Lw1/a;->DEFAULT_INSTANCE:Lw1/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lw1/a$b;

    invoke-direct {p1, p3}, Lw1/a$b;-><init>(Lw1/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lw1/a;

    invoke-direct {p1}, Lw1/a;-><init>()V

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
