.class public final Lx1/u$c;
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
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/u$c$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/u$c;",
        "Lx1/u$c$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/u$c;

.field public static final DOCUMENTS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/u$c;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private documents_:Lcom/google/protobuf/d0$i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$i<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/u$c;

    invoke-direct {v0}, Lx1/u$c;-><init>()V

    sput-object v0, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    const-class v1, Lx1/u$c;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/u$c;
    .locals 1

    sget-object v0, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    return-object v0
.end method

.method static synthetic U(Lx1/u$c;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/u$c;->V(Ljava/lang/String;)V

    return-void
.end method

.method private V(Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/u$c;->W()V

    iget-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method private W()V
    .locals 2

    iget-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Lcom/google/protobuf/d0$i;->n()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-static {v0}, Lcom/google/protobuf/a0;->H(Lcom/google/protobuf/d0$i;)Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    :cond_0
    return-void
.end method

.method public static X()Lx1/u$c;
    .locals 1

    sget-object v0, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    return-object v0
.end method

.method public static a0()Lx1/u$c$a;
    .locals 1

    sget-object v0, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/u$c$a;

    return-object v0
.end method


# virtual methods
.method public Y(I)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    return-object p1
.end method

.method public Z()I
    .locals 1

    iget-object v0, p0, Lx1/u$c;->documents_:Lcom/google/protobuf/d0$i;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    return v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

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
    sget-object p1, Lx1/u$c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/u$c;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/u$c;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/u$c;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    return-object p1

    :pswitch_4
    new-array p1, p2, [Ljava/lang/Object;

    const/4 p2, 0x0

    const-string p3, "documents_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u021a"

    sget-object p3, Lx1/u$c;->DEFAULT_INSTANCE:Lx1/u$c;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/u$c$a;

    invoke-direct {p1, p3}, Lx1/u$c$a;-><init>(Lx1/u$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/u$c;

    invoke-direct {p1}, Lx1/u$c;-><init>()V

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
