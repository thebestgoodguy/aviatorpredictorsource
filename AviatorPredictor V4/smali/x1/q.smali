.class public final Lx1/q;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/q$b;,
        Lx1/q$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/q;",
        "Lx1/q$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/q;

.field public static final DOCUMENT_CHANGE_FIELD_NUMBER:I = 0x3

.field public static final DOCUMENT_DELETE_FIELD_NUMBER:I = 0x4

.field public static final DOCUMENT_REMOVE_FIELD_NUMBER:I = 0x6

.field public static final FILTER_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/q;",
            ">;"
        }
    .end annotation
.end field

.field public static final TARGET_CHANGE_FIELD_NUMBER:I = 0x2


# instance fields
.field private responseTypeCase_:I

.field private responseType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/q;

    invoke-direct {v0}, Lx1/q;-><init>()V

    sput-object v0, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    const-class v1, Lx1/q;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/q;->responseTypeCase_:I

    return-void
.end method

.method static synthetic T()Lx1/q;
    .locals 1

    sget-object v0, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    return-object v0
.end method

.method public static U()Lx1/q;
    .locals 1

    sget-object v0, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    return-object v0
.end method


# virtual methods
.method public V()Lx1/i;
    .locals 2

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/q;->responseType_:Ljava/lang/Object;

    check-cast v0, Lx1/i;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/i;->U()Lx1/i;

    move-result-object v0

    return-object v0
.end method

.method public W()Lx1/j;
    .locals 2

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    const/4 v1, 0x4

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/q;->responseType_:Ljava/lang/Object;

    check-cast v0, Lx1/j;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/j;->U()Lx1/j;

    move-result-object v0

    return-object v0
.end method

.method public X()Lx1/l;
    .locals 2

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/q;->responseType_:Ljava/lang/Object;

    check-cast v0, Lx1/l;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/l;->U()Lx1/l;

    move-result-object v0

    return-object v0
.end method

.method public Y()Lx1/n;
    .locals 2

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/q;->responseType_:Ljava/lang/Object;

    check-cast v0, Lx1/n;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/n;->V()Lx1/n;

    move-result-object v0

    return-object v0
.end method

.method public Z()Lx1/q$c;
    .locals 1

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    invoke-static {v0}, Lx1/q$c;->d(I)Lx1/q$c;

    move-result-object v0

    return-object v0
.end method

.method public a0()Lx1/v;
    .locals 2

    iget v0, p0, Lx1/q;->responseTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/q;->responseType_:Ljava/lang/Object;

    check-cast v0, Lx1/v;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/v;->V()Lx1/v;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/q$a;->a:[I

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
    sget-object p1, Lx1/q;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/q;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/q;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/q;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    return-object p1

    :pswitch_4
    const/4 p1, 0x7

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "responseType_"

    aput-object v0, p1, p3

    const-string p3, "responseTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/v;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lx1/i;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lx1/j;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lx1/n;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-class p3, Lx1/l;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0005\u0001\u0000\u0002\u0006\u0005\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000"

    sget-object p3, Lx1/q;->DEFAULT_INSTANCE:Lx1/q;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/q$b;

    invoke-direct {p1, p3}, Lx1/q$b;-><init>(Lx1/q$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/q;

    invoke-direct {p1}, Lx1/q;-><init>()V

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
