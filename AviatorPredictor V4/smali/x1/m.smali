.class public final Lx1/m;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/m$b;,
        Lx1/m$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/m;",
        "Lx1/m$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/m;

.field public static final DOCUMENT_FIELD_NUMBER:I = 0x1

.field public static final FIELD_TRANSFORMS_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/m;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private document_:Ljava/lang/String;

.field private fieldTransforms_:Lcom/google/protobuf/d0$i;
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

    new-instance v0, Lx1/m;

    invoke-direct {v0}, Lx1/m;-><init>()V

    sput-object v0, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    const-class v1, Lx1/m;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lx1/m;->document_:Ljava/lang/String;

    invoke-static {}, Lcom/google/protobuf/a0;->A()Lcom/google/protobuf/d0$i;

    move-result-object v0

    iput-object v0, p0, Lx1/m;->fieldTransforms_:Lcom/google/protobuf/d0$i;

    return-void
.end method

.method static synthetic T()Lx1/m;
    .locals 1

    sget-object v0, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    return-object v0
.end method

.method public static U()Lx1/m;
    .locals 1

    sget-object v0, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    return-object v0
.end method


# virtual methods
.method public V()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/m$c;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/m;->fieldTransforms_:Lcom/google/protobuf/d0$i;

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/m$a;->a:[I

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
    sget-object p1, Lx1/m;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/m;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/m;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/m;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    return-object p1

    :pswitch_4
    const/4 p1, 0x3

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "document_"

    aput-object v0, p1, p3

    const-string p3, "fieldTransforms_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Lx1/m$c;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0208\u0002\u001b"

    sget-object p3, Lx1/m;->DEFAULT_INSTANCE:Lx1/m;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/m$b;

    invoke-direct {p1, p3}, Lx1/m$b;-><init>(Lx1/m$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/m;

    invoke-direct {p1}, Lx1/m;-><init>()V

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
