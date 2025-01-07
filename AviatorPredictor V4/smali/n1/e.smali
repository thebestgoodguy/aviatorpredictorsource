.class public final Ln1/e;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/e$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Ln1/e;",
        "Ln1/e$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final BASE_WRITES_FIELD_NUMBER:I = 0x4

.field public static final BATCH_ID_FIELD_NUMBER:I = 0x1

.field private static final DEFAULT_INSTANCE:Ln1/e;

.field public static final LOCAL_WRITE_TIME_FIELD_NUMBER:I = 0x3

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ln1/e;",
            ">;"
        }
    .end annotation
.end field

.field public static final WRITES_FIELD_NUMBER:I = 0x2


# instance fields
.field private baseWrites_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/y;",
            ">;"
        }
    .end annotation
.end field

.field private batchId_:I

.field private localWriteTime_:Lcom/google/protobuf/t1;

.field private writes_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/y;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/e;

    invoke-direct {v0}, Ln1/e;-><init>()V

    sput-object v0, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    const-class v1, Ln1/e;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Ln1/e;
    .locals 1

    sget-object v0, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    return-object v0
.end method

.method static synthetic U(Ln1/e;I)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/e;->l0(I)V

    return-void
.end method

.method static synthetic V(Ln1/e;Lx1/y;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/e;->Y(Lx1/y;)V

    return-void
.end method

.method static synthetic W(Ln1/e;Lx1/y;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/e;->Z(Lx1/y;)V

    return-void
.end method

.method static synthetic X(Ln1/e;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/e;->m0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method private Y(Lx1/y;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ln1/e;->a0()V

    iget-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private Z(Lx1/y;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Ln1/e;->b0()V

    iget-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private a0()V
    .locals 2

    iget-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method private b0()V
    .locals 2

    iget-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static i0()Ln1/e$b;
    .locals 1

    sget-object v0, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Ln1/e$b;

    return-object v0
.end method

.method public static j0(Lcom/google/protobuf/j;)Ln1/e;
    .locals 1

    sget-object v0, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    invoke-static {v0, p0}, Lcom/google/protobuf/a0;->L(Lcom/google/protobuf/a0;Lcom/google/protobuf/j;)Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Ln1/e;

    return-object p0
.end method

.method public static k0([B)Ln1/e;
    .locals 1

    sget-object v0, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    invoke-static {v0, p0}, Lcom/google/protobuf/a0;->N(Lcom/google/protobuf/a0;[B)Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Ln1/e;

    return-object p0
.end method

.method private l0(I)V
    .locals 0

    iput p1, p0, Ln1/e;->batchId_:I

    return-void
.end method

.method private m0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/e;->localWriteTime_:Lcom/google/protobuf/t1;

    return-void
.end method


# virtual methods
.method public c0(I)Lx1/y;
    .locals 1

    iget-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/y;

    return-object p1
.end method

.method public d0()I
    .locals 1

    iget-object v0, p0, Ln1/e;->baseWrites_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method public e0()I
    .locals 1

    iget v0, p0, Ln1/e;->batchId_:I

    return v0
.end method

.method public f0()Lcom/google/protobuf/t1;
    .locals 1

    iget-object v0, p0, Ln1/e;->localWriteTime_:Lcom/google/protobuf/t1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/t1;->W()Lcom/google/protobuf/t1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public g0(I)Lx1/y;
    .locals 1

    iget-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/y;

    return-object p1
.end method

.method public h0()I
    .locals 1

    iget-object v0, p0, Ln1/e;->writes_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    const-class p2, Lx1/y;

    sget-object p3, Ln1/e$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p3, p1

    const/4 p3, 0x1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    invoke-direct {p1}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw p1

    :pswitch_0
    return-object v0

    :pswitch_1
    invoke-static {p3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object p1

    return-object p1

    :pswitch_2
    sget-object p1, Ln1/e;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ln1/e;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ln1/e;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Ln1/e;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 v0, 0x0

    const-string v1, "batchId_"

    aput-object v1, p1, v0

    const-string v0, "writes_"

    aput-object v0, p1, p3

    const/4 p3, 0x2

    aput-object p2, p1, p3

    const/4 p3, 0x3

    const-string v0, "localWriteTime_"

    aput-object v0, p1, p3

    const/4 p3, 0x4

    const-string v0, "baseWrites_"

    aput-object v0, p1, p3

    const/4 p3, 0x5

    aput-object p2, p1, p3

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\t\u0004\u001b"

    sget-object p3, Ln1/e;->DEFAULT_INSTANCE:Ln1/e;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ln1/e$b;

    invoke-direct {p1, v0}, Ln1/e$b;-><init>(Ln1/e$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ln1/e;

    invoke-direct {p1}, Ln1/e;-><init>()V

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
