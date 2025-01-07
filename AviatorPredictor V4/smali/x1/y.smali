.class public final Lx1/y;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/y$b;,
        Lx1/y$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/y;",
        "Lx1/y$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final CURRENT_DOCUMENT_FIELD_NUMBER:I = 0x4

.field private static final DEFAULT_INSTANCE:Lx1/y;

.field public static final DELETE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/y;",
            ">;"
        }
    .end annotation
.end field

.field public static final TRANSFORM_FIELD_NUMBER:I = 0x6

.field public static final UPDATE_FIELD_NUMBER:I = 0x1

.field public static final UPDATE_MASK_FIELD_NUMBER:I = 0x3

.field public static final UPDATE_TRANSFORMS_FIELD_NUMBER:I = 0x7

.field public static final VERIFY_FIELD_NUMBER:I = 0x5


# instance fields
.field private currentDocument_:Lx1/s;

.field private operationCase_:I

.field private operation_:Ljava/lang/Object;

.field private updateMask_:Lx1/k;

.field private updateTransforms_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Lx1/m$c;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/y;

    invoke-direct {v0}, Lx1/y;-><init>()V

    sput-object v0, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    const-class v1, Lx1/y;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lx1/y;->operationCase_:I

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/y;->updateTransforms_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/y;
    .locals 1

    sget-object v0, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    return-object v0
.end method

.method static synthetic U(Lx1/y;Lx1/k;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->u0(Lx1/k;)V

    return-void
.end method

.method static synthetic V(Lx1/y;Lx1/m$c;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->a0(Lx1/m$c;)V

    return-void
.end method

.method static synthetic W(Lx1/y;Lx1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->t0(Lx1/h;)V

    return-void
.end method

.method static synthetic X(Lx1/y;Lx1/s;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->r0(Lx1/s;)V

    return-void
.end method

.method static synthetic Y(Lx1/y;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->s0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic Z(Lx1/y;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/y;->v0(Ljava/lang/String;)V

    return-void
.end method

.method private a0(Lx1/m$c;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/y;->b0()V

    iget-object v0, p0, Lx1/y;->updateTransforms_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private b0()V
    .locals 2

    iget-object v0, p0, Lx1/y;->updateTransforms_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/y;->updateTransforms_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static o0()Lx1/y$b;
    .locals 1

    sget-object v0, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/y$b;

    return-object v0
.end method

.method public static p0(Lx1/y;)Lx1/y$b;
    .locals 1

    sget-object v0, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    invoke-virtual {v0, p0}, Lcom/google/protobuf/a0;->v(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    move-result-object p0

    check-cast p0, Lx1/y$b;

    return-object p0
.end method

.method public static q0([B)Lx1/y;
    .locals 1

    sget-object v0, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    invoke-static {v0, p0}, Lcom/google/protobuf/a0;->N(Lcom/google/protobuf/a0;[B)Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Lx1/y;

    return-object p0
.end method

.method private r0(Lx1/s;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/y;->currentDocument_:Lx1/s;

    return-void
.end method

.method private s0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x2

    iput v0, p0, Lx1/y;->operationCase_:I

    iput-object p1, p0, Lx1/y;->operation_:Ljava/lang/Object;

    return-void
.end method

.method private t0(Lx1/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/y;->operation_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Lx1/y;->operationCase_:I

    return-void
.end method

.method private u0(Lx1/k;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/y;->updateMask_:Lx1/k;

    return-void
.end method

.method private v0(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x5

    iput v0, p0, Lx1/y;->operationCase_:I

    iput-object p1, p0, Lx1/y;->operation_:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public c0()Lx1/s;
    .locals 1

    iget-object v0, p0, Lx1/y;->currentDocument_:Lx1/s;

    if-nez v0, :cond_0

    invoke-static {}, Lx1/s;->X()Lx1/s;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public d0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/y;->operation_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public e0()Lx1/y$c;
    .locals 1

    iget v0, p0, Lx1/y;->operationCase_:I

    invoke-static {v0}, Lx1/y$c;->d(I)Lx1/y$c;

    move-result-object v0

    return-object v0
.end method

.method public f0()Lx1/m;
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/y;->operation_:Ljava/lang/Object;

    check-cast v0, Lx1/m;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/m;->U()Lx1/m;

    move-result-object v0

    return-object v0
.end method

.method public g0()Lx1/h;
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/y;->operation_:Ljava/lang/Object;

    check-cast v0, Lx1/h;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/h;->X()Lx1/h;

    move-result-object v0

    return-object v0
.end method

.method public h0()Lx1/k;
    .locals 1

    iget-object v0, p0, Lx1/y;->updateMask_:Lx1/k;

    if-nez v0, :cond_0

    invoke-static {}, Lx1/k;->X()Lx1/k;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public i0()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/m$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/y;->updateTransforms_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

.method public j0()Ljava/lang/String;
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x5

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lx1/y;->operation_:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const-string v0, ""

    :goto_0
    return-object v0
.end method

.method public k0()Z
    .locals 1

    iget-object v0, p0, Lx1/y;->currentDocument_:Lx1/s;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public l0()Z
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public m0()Z
    .locals 2

    iget v0, p0, Lx1/y;->operationCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public n0()Z
    .locals 1

    iget-object v0, p0, Lx1/y;->updateMask_:Lx1/k;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/y$a;->a:[I

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
    sget-object p1, Lx1/y;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/y;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/y;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/y;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    return-object p1

    :pswitch_4
    const/16 p1, 0x8

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "operation_"

    aput-object v0, p1, p3

    const-string p3, "operationCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/h;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "updateMask_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "currentDocument_"

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-class p3, Lx1/m;

    aput-object p3, p1, p2

    const/4 p2, 0x6

    const-string p3, "updateTransforms_"

    aput-object p3, p1, p2

    const/4 p2, 0x7

    const-class p3, Lx1/m$c;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001<\u0000\u0002\u023b\u0000\u0003\t\u0004\t\u0005\u023b\u0000\u0006<\u0000\u0007\u001b"

    sget-object p3, Lx1/y;->DEFAULT_INSTANCE:Lx1/y;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/y$b;

    invoke-direct {p1, p3}, Lx1/y$b;-><init>(Lx1/y$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/y;

    invoke-direct {p1}, Lx1/y;-><init>()V

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
