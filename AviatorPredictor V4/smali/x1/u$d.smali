.class public final Lx1/u$d;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/u$d$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/u$d;",
        "Lx1/u$d$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/u$d;

.field public static final PARENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/u$d;",
            ">;"
        }
    .end annotation
.end field

.field public static final STRUCTURED_QUERY_FIELD_NUMBER:I = 0x2


# instance fields
.field private parent_:Ljava/lang/String;

.field private queryTypeCase_:I

.field private queryType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/u$d;

    invoke-direct {v0}, Lx1/u$d;-><init>()V

    sput-object v0, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    const-class v1, Lx1/u$d;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/u$d;->queryTypeCase_:I

    const-string v0, ""

    iput-object v0, p0, Lx1/u$d;->parent_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T(Lx1/u$d;Lx1/t;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u$d;->b0(Lx1/t;)V

    return-void
.end method

.method static synthetic U()Lx1/u$d;
    .locals 1

    sget-object v0, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    return-object v0
.end method

.method static synthetic V(Lx1/u$d;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u$d;->a0(Ljava/lang/String;)V

    return-void
.end method

.method public static W()Lx1/u$d;
    .locals 1

    sget-object v0, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    return-object v0
.end method

.method public static Z()Lx1/u$d$a;
    .locals 1

    sget-object v0, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/u$d$a;

    return-object v0
.end method

.method private a0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/u$d;->parent_:Ljava/lang/String;

    return-void
.end method

.method private b0(Lx1/t;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/u$d;->queryType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lx1/u$d;->queryTypeCase_:I

    return-void
.end method


# virtual methods
.method public X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx1/u$d;->parent_:Ljava/lang/String;

    return-object v0
.end method

.method public Y()Lx1/t;
    .locals 2

    iget v0, p0, Lx1/u$d;->queryTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/u$d;->queryType_:Ljava/lang/Object;

    check-cast v0, Lx1/t;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/t;->e0()Lx1/t;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/u$a;->a:[I

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
    sget-object p1, Lx1/u$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/u$d;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/u$d;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/u$d;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    return-object p1

    :pswitch_4
    const/4 p1, 0x4

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

    const-string p2, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002<\u0000"

    sget-object p3, Lx1/u$d;->DEFAULT_INSTANCE:Lx1/u$d;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/u$d$a;

    invoke-direct {p1, p3}, Lx1/u$d$a;-><init>(Lx1/u$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/u$d;

    invoke-direct {p1}, Lx1/u$d;-><init>()V

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
