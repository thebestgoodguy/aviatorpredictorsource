.class public final Lx1/h;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/h$b;,
        Lx1/h$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/h;",
        "Lx1/h$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field public static final CREATE_TIME_FIELD_NUMBER:I = 0x3

.field private static final DEFAULT_INSTANCE:Lx1/h;

.field public static final FIELDS_FIELD_NUMBER:I = 0x2

.field public static final NAME_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/h;",
            ">;"
        }
    .end annotation
.end field

.field public static final UPDATE_TIME_FIELD_NUMBER:I = 0x4


# instance fields
.field private createTime_:Lcom/google/protobuf/t1;

.field private fields_:Lcom/google/protobuf/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/p0<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field

.field private name_:Ljava/lang/String;

.field private updateTime_:Lcom/google/protobuf/t1;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/h;

    invoke-direct {v0}, Lx1/h;-><init>()V

    sput-object v0, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    const-class v1, Lx1/h;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/p0;->d()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    const-string v0, ""

    iput-object v0, p0, Lx1/h;->name_:Ljava/lang/String;

    return-void
.end method

.method static synthetic T()Lx1/h;
    .locals 1

    sget-object v0, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    return-object v0
.end method

.method static synthetic U(Lx1/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/h;->f0(Ljava/lang/String;)V

    return-void
.end method

.method static synthetic V(Lx1/h;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lx1/h;->Z()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method static synthetic W(Lx1/h;Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-direct {p0, p1}, Lx1/h;->g0(Lcom/google/protobuf/t1;)V

    return-void
.end method

.method public static X()Lx1/h;
    .locals 1

    sget-object v0, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    return-object v0
.end method

.method private Z()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lx1/h;->d0()Lcom/google/protobuf/p0;

    move-result-object v0

    return-object v0
.end method

.method private c0()Lcom/google/protobuf/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/p0<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    return-object v0
.end method

.method private d0()Lcom/google/protobuf/p0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/p0<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->l()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    :cond_0
    iget-object v0, p0, Lx1/h;->fields_:Lcom/google/protobuf/p0;

    return-object v0
.end method

.method public static e0()Lx1/h$b;
    .locals 1

    sget-object v0, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/h$b;

    return-object v0
.end method

.method private f0(Ljava/lang/String;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/h;->name_:Ljava/lang/String;

    return-void
.end method

.method private g0(Lcom/google/protobuf/t1;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Lx1/h;->updateTime_:Lcom/google/protobuf/t1;

    return-void
.end method


# virtual methods
.method public Y()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lx1/h;->c0()Lcom/google/protobuf/p0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public a0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lx1/h;->name_:Ljava/lang/String;

    return-object v0
.end method

.method public b0()Lcom/google/protobuf/t1;
    .locals 1

    iget-object v0, p0, Lx1/h;->updateTime_:Lcom/google/protobuf/t1;

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/protobuf/t1;->W()Lcom/google/protobuf/t1;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/h$a;->a:[I

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
    sget-object p1, Lx1/h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/h;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/h;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/h;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    return-object p1

    :pswitch_4
    const/4 p1, 0x5

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "name_"

    aput-object v0, p1, p3

    const-string p3, "fields_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    sget-object p3, Lx1/h$c;->a:Lcom/google/protobuf/o0;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-string p3, "createTime_"

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-string p3, "updateTime_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0208\u00022\u0003\t\u0004\t"

    sget-object p3, Lx1/h;->DEFAULT_INSTANCE:Lx1/h;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/h$b;

    invoke-direct {p1, p3}, Lx1/h$b;-><init>(Lx1/h$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/h;

    invoke-direct {p1}, Lx1/h;-><init>()V

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
