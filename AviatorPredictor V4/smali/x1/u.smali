.class public final Lx1/u;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/u$b;,
        Lx1/u$d;,
        Lx1/u$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/u;",
        "Lx1/u$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/u;

.field public static final DOCUMENTS_FIELD_NUMBER:I = 0x3

.field public static final ONCE_FIELD_NUMBER:I = 0x6

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/u;",
            ">;"
        }
    .end annotation
.end field

.field public static final QUERY_FIELD_NUMBER:I = 0x2

.field public static final READ_TIME_FIELD_NUMBER:I = 0xb

.field public static final RESUME_TOKEN_FIELD_NUMBER:I = 0x4

.field public static final TARGET_ID_FIELD_NUMBER:I = 0x5


# instance fields
.field private once_:Z

.field private resumeTypeCase_:I

.field private resumeType_:Ljava/lang/Object;

.field private targetId_:I

.field private targetTypeCase_:I

.field private targetType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/u;

    invoke-direct {v0}, Lx1/u;-><init>()V

    sput-object v0, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    const-class v1, Lx1/u;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/u;->targetTypeCase_:I

    iput v0, p0, Lx1/u;->resumeTypeCase_:I

    return-void
.end method

.method static synthetic T()Lx1/u;
    .locals 1

    sget-object v0, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    return-object v0
.end method

.method static synthetic U(Lx1/u;Lx1/u$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u;->b0(Lx1/u$d;)V

    return-void
.end method

.method static synthetic V(Lx1/u;Lx1/u$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u;->a0(Lx1/u$c;)V

    return-void
.end method

.method static synthetic W(Lx1/u;Lcom/google/protobuf/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u;->d0(Lcom/google/protobuf/j;)V

    return-void
.end method

.method static synthetic X(Lx1/u;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u;->c0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method static synthetic Y(Lx1/u;I)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u;->e0(I)V

    return-void
.end method

.method public static Z()Lx1/u$b;
    .locals 1

    sget-object v0, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/u$b;

    return-object v0
.end method

.method private a0(Lx1/u$c;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/u;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lx1/u;->targetTypeCase_:I

    return-void
.end method

.method private b0(Lx1/u$d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/u;->targetType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lx1/u;->targetTypeCase_:I

    return-void
.end method

.method private c0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/u;->resumeType_:Ljava/lang/Object;

    const/16 p1, 0xb

    iput p1, p0, Lx1/u;->resumeTypeCase_:I

    return-void
.end method

.method private d0(Lcom/google/protobuf/j;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    iput v0, p0, Lx1/u;->resumeTypeCase_:I

    iput-object p1, p0, Lx1/u;->resumeType_:Ljava/lang/Object;

    return-void
.end method

.method private e0(I)V
    .locals 0

    iput p1, p0, Lx1/u;->targetId_:I

    return-void
.end method


# virtual methods
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
    sget-object p1, Lx1/u;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/u;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/u;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/u;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    return-object p1

    :pswitch_4
    const/16 p1, 0x9

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "targetType_"

    aput-object v0, p1, p3

    const-string p3, "targetTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-string p3, "resumeType_"

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "resumeTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lx1/u$d;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lx1/u$c;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "targetId_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-string p3, "once_"

    aput-object p3, p1, p2

    const/16 p2, 0x8

    const-class p3, Lcom/google/protobuf/t1;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0006\u0002\u0000\u0002\u000b\u0006\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004=\u0001\u0005\u0004\u0006\u0007\u000b<\u0001"

    sget-object p3, Lx1/u;->DEFAULT_INSTANCE:Lx1/u;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/u$b;

    invoke-direct {p1, p3}, Lx1/u$b;-><init>(Lx1/u$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/u;

    invoke-direct {p1}, Lx1/u;-><init>()V

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
