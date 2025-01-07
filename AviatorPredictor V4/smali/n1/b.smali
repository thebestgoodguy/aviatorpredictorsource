.class public final Ln1/b;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/b$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Ln1/b;",
        "Ln1/b$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ln1/b;

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ln1/b;",
            ">;"
        }
    .end annotation
.end field

.field public static final READ_TIME_FIELD_NUMBER:I = 0x2


# instance fields
.field private name_:Ljava/lang/String;

.field private readTime_:Lcom/google/protobuf/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/b;

    invoke-direct {v0}, Ln1/b;-><init>()V

    sput-object v0, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    const-class v1, Ln1/b;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Ln1/b;->name_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T()Ln1/b;
    .locals 1

    sget-object v0, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    return-object v0
.end method

.method static synthetic U(Ln1/b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/b;->a0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V(Ln1/b;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/b;->b0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method public static W()Ln1/b;
    .locals 1

    sget-object v0, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    return-object v0
.end method

.method public static Z()Ln1/b$b;
    .locals 1

    sget-object v0, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Ln1/b$b;

    return-object v0
.end method

.method private a0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/b;->name_:Ljava/lang/String;

    return-void
.end method

.method private b0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/b;->readTime_:Lcom/google/protobuf/t1;

    return-void
.end method


# virtual methods
.method public X()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Ln1/b;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public Y()Lcom/google/protobuf/t1;
    .locals 1

    iget-object v0, p0, Ln1/b;->readTime_:Lcom/google/protobuf/t1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/t1;->W()Lcom/google/protobuf/t1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ln1/b$a;->a:[I

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
    sget-object p1, Ln1/b;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ln1/b;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ln1/b;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Ln1/b;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "name_"

    aput-object v0, p1, p3

    const-string p3, "readTime_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t"

    sget-object p3, Ln1/b;->DEFAULT_INSTANCE:Ln1/b;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ln1/b$b;

    invoke-direct {p1, p3}, Ln1/b$b;-><init>(Ln1/b$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ln1/b;

    invoke-direct {p1}, Ln1/b;-><init>()V

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
