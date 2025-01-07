.class public final Lx1/x;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/x$b;,
        Lx1/x$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/x;",
        "Lx1/x$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final ARRAY_VALUE_FIELD_NUMBER:I = 0x9

.field public static final BOOLEAN_VALUE_FIELD_NUMBER:I = 0x1

.field public static final BYTES_VALUE_FIELD_NUMBER:I = 0x12

.field private static final DEFAULT_INSTANCE:Lx1/x;

.field public static final DOUBLE_VALUE_FIELD_NUMBER:I = 0x3

.field public static final GEO_POINT_VALUE_FIELD_NUMBER:I = 0x8

.field public static final INTEGER_VALUE_FIELD_NUMBER:I = 0x2

.field public static final MAP_VALUE_FIELD_NUMBER:I = 0x6

.field public static final NULL_VALUE_FIELD_NUMBER:I = 0xb

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field

.field public static final REFERENCE_VALUE_FIELD_NUMBER:I = 0x5

.field public static final STRING_VALUE_FIELD_NUMBER:I = 0x11

.field public static final TIMESTAMP_VALUE_FIELD_NUMBER:I = 0xa


# instance fields
.field private valueTypeCase_:I

.field private valueType_:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/x;

    invoke-direct {v0}, Lx1/x;-><init>()V

    sput-object v0, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    const-class v1, Lx1/x;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method

.method private A0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private B0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x11

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private C0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    const/16 p1, 0xa

    iput p1, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method

.method static synthetic T()Lx1/x;
    .locals 1

    sget-object v0, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    return-object v0
.end method

.method static synthetic U(Lx1/x;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->C0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method static synthetic V(Lx1/x;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->B0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic W(Lx1/x;Lcom/google/protobuf/j;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->u0(Lcom/google/protobuf/j;)V

    return-void
.end method

.method static synthetic X(Lx1/x;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->A0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Y(Lx1/x;Lb2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->w0(Lb2/a;)V

    return-void
.end method

.method static synthetic Z(Lx1/x;Lx1/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->s0(Lx1/a;)V

    return-void
.end method

.method static synthetic a0(Lx1/x;Lx1/r;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->y0(Lx1/r;)V

    return-void
.end method

.method static synthetic b0(Lx1/x;Lcom/google/protobuf/e1;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->z0(Lcom/google/protobuf/e1;)V

    return-void
.end method

.method static synthetic c0(Lx1/x;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/x;->t0(Z)V

    return-void
.end method

.method static synthetic d0(Lx1/x;J)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/x;->x0(J)V

    return-void
.end method

.method static synthetic e0(Lx1/x;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lx1/x;->v0(D)V

    return-void
.end method

.method public static i0()Lx1/x;
    .locals 1

    sget-object v0, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    return-object v0
.end method

.method public static r0()Lx1/x$b;
    .locals 1

    sget-object v0, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/x$b;

    return-object v0
.end method

.method private s0(Lx1/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    const/16 p1, 0x9

    iput p1, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method

.method private t0(Z)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private u0(Lcom/google/protobuf/j;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/16 v0, 0x12

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private v0(D)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private w0(Lb2/a;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    const/16 p1, 0x8

    iput p1, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method

.method private x0(J)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lx1/x;->valueTypeCase_:I

    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    return-void
.end method

.method private y0(Lx1/r;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    const/4 p1, 0x6

    iput p1, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method

.method private z0(Lcom/google/protobuf/e1;)V
    .locals 0

    invoke-virtual {p1}, Lcom/google/protobuf/e1;->e()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    const/16 p1, 0xb

    iput p1, p0, Lx1/x;->valueTypeCase_:I

    return-void
.end method


# virtual methods
.method public f0()Lx1/a;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/16 v1, 0x9

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Lx1/a;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/a;->a0()Lx1/a;

    move-result-object v0

    return-object v0
.end method

.method public g0()Z
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public h0()Lcom/google/protobuf/j;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/16 v1, 0x12

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/j;

    return-object v0

    :cond_0
    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    return-object v0
.end method

.method public j0()D
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public k0()Lb2/a;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Lb2/a;

    return-object v0

    :cond_0
    invoke-static {}, Lb2/a;->W()Lb2/a;

    move-result-object v0

    return-object v0
.end method

.method public l0()J
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    return-wide v0

    :cond_0
    const-wide/16 v0, 0x0

    return-wide v0
.end method

.method public m0()Lx1/r;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Lx1/r;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/r;->V()Lx1/r;

    move-result-object v0

    return-object v0
.end method

.method public n0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public o0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/16 v1, 0x11

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public p0()Lcom/google/protobuf/t1;
    .locals 2

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    const/16 v1, 0xa

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/x;->valueType_:Ljava/lang/Object;

    check-cast v0, Lcom/google/protobuf/t1;

    return-object v0

    :cond_0
    invoke-static {}, Lcom/google/protobuf/t1;->W()Lcom/google/protobuf/t1;

    move-result-object v0

    return-object v0
.end method

.method public q0()Lx1/x$c;
    .locals 1

    iget v0, p0, Lx1/x;->valueTypeCase_:I

    invoke-static {v0}, Lx1/x$c;->d(I)Lx1/x$c;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/x$a;->a:[I

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
    sget-object p1, Lx1/x;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/x;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/x;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/x;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "valueType_"

    aput-object v0, p1, p3

    const-string p3, "valueTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/r;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lb2/a;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Lx1/a;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lcom/google/protobuf/t1;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u000b\u0001\u0000\u0001\u0012\u000b\u0000\u0000\u0000\u0001:\u0000\u00025\u0000\u00033\u0000\u0005\u023b\u0000\u0006<\u0000\u0008<\u0000\t<\u0000\n<\u0000\u000b?\u0000\u0011\u023b\u0000\u0012=\u0000"

    sget-object p3, Lx1/x;->DEFAULT_INSTANCE:Lx1/x;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/x$b;

    invoke-direct {p1, p3}, Lx1/x$b;-><init>(Lx1/x$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/x;

    invoke-direct {p1}, Lx1/x;-><init>()V

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
