.class public final Lx1/t$h;
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
    name = "h"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/t$h$a;,
        Lx1/t$h$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/t$h;",
        "Lx1/t$h$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final COMPOSITE_FILTER_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Lx1/t$h;

.field public static final FIELD_FILTER_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/t$h;",
            ">;"
        }
    .end annotation
.end field

.field public static final UNARY_FILTER_FIELD_NUMBER:I = 0x3


# instance fields
.field private filterTypeCase_:I

.field private filterType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/t$h;

    invoke-direct {v0}, Lx1/t$h;-><init>()V

    sput-object v0, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    const-class v1, Lx1/t$h;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/t$h;->filterTypeCase_:I

    return-void
.end method

.method static synthetic T(Lx1/t$h;Lx1/t$f;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t$h;->e0(Lx1/t$f;)V

    return-void
.end method

.method static synthetic U(Lx1/t$h;Lx1/t$k;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t$h;->f0(Lx1/t$k;)V

    return-void
.end method

.method static synthetic V()Lx1/t$h;
    .locals 1

    sget-object v0, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    return-object v0
.end method

.method static synthetic W(Lx1/t$h;Lx1/t$d;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/t$h;->d0(Lx1/t$d;)V

    return-void
.end method

.method public static Y()Lx1/t$h;
    .locals 1

    sget-object v0, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    return-object v0
.end method

.method public static c0()Lx1/t$h$a;
    .locals 1

    sget-object v0, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/t$h$a;

    return-object v0
.end method

.method private d0(Lx1/t$d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lx1/t$h;->filterTypeCase_:I

    return-void
.end method

.method private e0(Lx1/t$f;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lx1/t$h;->filterTypeCase_:I

    return-void
.end method

.method private f0(Lx1/t$k;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lx1/t$h;->filterTypeCase_:I

    return-void
.end method


# virtual methods
.method public X()Lx1/t$d;
    .locals 2

    iget v0, p0, Lx1/t$h;->filterTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    check-cast v0, Lx1/t$d;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/t$d;->Y()Lx1/t$d;

    move-result-object v0

    return-object v0
.end method

.method public Z()Lx1/t$f;
    .locals 2

    iget v0, p0, Lx1/t$h;->filterTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    check-cast v0, Lx1/t$f;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/t$f;->X()Lx1/t$f;

    move-result-object v0

    return-object v0
.end method

.method public a0()Lx1/t$h$b;
    .locals 1

    iget v0, p0, Lx1/t$h;->filterTypeCase_:I

    invoke-static {v0}, Lx1/t$h$b;->d(I)Lx1/t$h$b;

    move-result-object v0

    return-object v0
.end method

.method public b0()Lx1/t$k;
    .locals 2

    iget v0, p0, Lx1/t$h;->filterTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/t$h;->filterType_:Ljava/lang/Object;

    check-cast v0, Lx1/t$k;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/t$k;->W()Lx1/t$k;

    move-result-object v0

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
    sget-object p1, Lx1/t$h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/t$h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/t$h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/t$h;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "filterType_"

    aput-object v0, p1, p3

    const-string p3, "filterTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/t$d;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lx1/t$f;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lx1/t$k;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000"

    sget-object p3, Lx1/t$h;->DEFAULT_INSTANCE:Lx1/t$h;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/t$h$a;

    invoke-direct {p1, p3}, Lx1/t$h$a;-><init>(Lx1/t$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/t$h;

    invoke-direct {p1}, Lx1/t$h;-><init>()V

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
