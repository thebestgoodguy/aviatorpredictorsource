.class public final Lx1/m$c;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/m$c$a;,
        Lx1/m$c$c;,
        Lx1/m$c$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/m$c;",
        "Lx1/m$c$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final APPEND_MISSING_ELEMENTS_FIELD_NUMBER:I = 0x6

.field private static final DEFAULT_INSTANCE:Lx1/m$c;

.field public static final FIELD_PATH_FIELD_NUMBER:I = 0x1

.field public static final INCREMENT_FIELD_NUMBER:I = 0x3

.field public static final MAXIMUM_FIELD_NUMBER:I = 0x4

.field public static final MINIMUM_FIELD_NUMBER:I = 0x5

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/m$c;",
            ">;"
        }
    .end annotation
.end field

.field public static final REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER:I = 0x7

.field public static final SET_TO_SERVER_VALUE_FIELD_NUMBER:I = 0x2


# instance fields
.field private fieldPath_:Ljava/lang/String;

.field private transformTypeCase_:I

.field private transformType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/m$c;

    invoke-direct {v0}, Lx1/m$c;-><init>()V

    sput-object v0, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    const-class v1, Lx1/m$c;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/m$c;->transformTypeCase_:I

    const-string v0, ""

    iput-object v0, p0, Lx1/m$c;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T()Lx1/m$c;
    .locals 1

    sget-object v0, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    return-object v0
.end method

.method static synthetic U(Lx1/m$c;Lx1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/m$c;->g0(Lx1/a;)V

    return-void
.end method

.method static synthetic V(Lx1/m$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/m$c;->h0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W(Lx1/m$c;Lx1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/m$c;->j0(Lx1/a;)V

    return-void
.end method

.method static synthetic X(Lx1/m$c;Lx1/m$c$b;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/m$c;->k0(Lx1/m$c$b;)V

    return-void
.end method

.method static synthetic Y(Lx1/m$c;Lx1/x;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/m$c;->i0(Lx1/x;)V

    return-void
.end method

.method public static f0()Lx1/m$c$a;
    .locals 1

    sget-object v0, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/m$c$a;

    return-object v0
.end method

.method private g0(Lx1/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lx1/m$c;->transformTypeCase_:I

    return-void
.end method

.method private h0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/m$c;->fieldPath_:Ljava/lang/String;

    return-void
.end method

.method private i0(Lx1/x;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Lx1/m$c;->transformTypeCase_:I

    return-void
.end method

.method private j0(Lx1/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, p0, Lx1/m$c;->transformTypeCase_:I

    return-void
.end method

.method private k0(Lx1/m$c$b;)V
    .locals 0

    invoke-virtual {p1}, Lx1/m$c$b;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Lx1/m$c;->transformTypeCase_:I

    return-void
.end method


# virtual methods
.method public Z()Lx1/a;
    .locals 2

    iget v0, p0, Lx1/m$c;->transformTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    check-cast v0, Lx1/a;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/a;->a0()Lx1/a;

    move-result-object v0

    return-object v0
.end method

.method public a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx1/m$c;->fieldPath_:Ljava/lang/String;

    return-object v0
.end method

.method public b0()Lx1/x;
    .locals 2

    iget v0, p0, Lx1/m$c;->transformTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    check-cast v0, Lx1/x;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/x;->i0()Lx1/x;

    move-result-object v0

    return-object v0
.end method

.method public c0()Lx1/a;
    .locals 2

    iget v0, p0, Lx1/m$c;->transformTypeCase_:I

    const/4 v1, 0x7

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    check-cast v0, Lx1/a;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/a;->a0()Lx1/a;

    move-result-object v0

    return-object v0
.end method

.method public d0()Lx1/m$c$b;
    .locals 2

    iget v0, p0, Lx1/m$c;->transformTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_1

    iget-object v0, p0, Lx1/m$c;->transformType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lx1/m$c$b;->d(I)Lx1/m$c$b;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lx1/m$c$b;->h:Lx1/m$c$b;

    :cond_0
    return-object v0

    :cond_1
    sget-object v0, Lx1/m$c$b;->f:Lx1/m$c$b;

    return-object v0
.end method

.method public e0()Lx1/m$c$c;
    .locals 1

    iget v0, p0, Lx1/m$c;->transformTypeCase_:I

    invoke-static {v0}, Lx1/m$c$c;->d(I)Lx1/m$c$c;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const-class p2, Lx1/a;

    const-class p3, Lx1/x;

    sget-object v0, Lx1/m$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    const/4 v1, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object v1

    :pswitch_1
    invoke-static {v0}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Lx1/m$c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/m$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/m$c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/m$c;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    return-object p1

    :pswitch_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v1, 0x0

    const-string v2, "transformType_"

    aput-object v2, p1, v1

    const-string v1, "transformTypeCase_"

    aput-object v1, p1, v0

    const/4 v0, 0x2

    const-string v1, "fieldPath_"

    aput-object v1, p1, v0

    const/4 v0, 0x3

    aput-object p3, p1, v0

    const/4 v0, 0x4

    aput-object p3, p1, v0

    const/4 v0, 0x5

    aput-object p3, p1, v0

    const/4 p3, 0x6

    aput-object p2, p1, p3

    const/4 p3, 0x7

    aput-object p2, p1, p3

    const-string p2, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001\u0208\u0002?\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000"

    sget-object p3, Lx1/m$c;->DEFAULT_INSTANCE:Lx1/m$c;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/m$c$a;

    invoke-direct {p1, v1}, Lx1/m$c$a;-><init>(Lx1/m$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/m$c;

    invoke-direct {p1}, Lx1/m$c;-><init>()V

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
