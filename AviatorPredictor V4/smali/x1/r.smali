.class public final Lx1/r;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lx1/r$b;,
        Lx1/r$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lx1/r;",
        "Lx1/r$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lx1/r;

.field public static final FIELDS_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lx1/r;",
            ">;"
        }
    .end annotation
.end field


# instance fields
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


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lx1/r;

    invoke-direct {v0}, Lx1/r;-><init>()V

    sput-object v0, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    const-class v1, Lx1/r;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    invoke-static {}, Lcom/google/protobuf/p0;->d()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

    return-void
.end method

.method static synthetic T()Lx1/r;
    .locals 1

    sget-object v0, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    return-object v0
.end method

.method static synthetic U(Lx1/r;)Ljava/util/Map;
    .locals 0

    invoke-direct {p0}, Lx1/r;->a0()Ljava/util/Map;

    move-result-object p0

    return-object p0
.end method

.method public static V()Lx1/r;
    .locals 1

    sget-object v0, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    return-object v0
.end method

.method private a0()Ljava/util/Map;
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

    invoke-direct {p0}, Lx1/r;->c0()Lcom/google/protobuf/p0;

    move-result-object v0

    return-object v0
.end method

.method private b0()Lcom/google/protobuf/p0;
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

    iget-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

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

    iget-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->h()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

    invoke-virtual {v0}, Lcom/google/protobuf/p0;->l()Lcom/google/protobuf/p0;

    move-result-object v0

    iput-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

    :cond_0
    iget-object v0, p0, Lx1/r;->fields_:Lcom/google/protobuf/p0;

    return-object v0
.end method

.method public static d0()Lx1/r$b;
    .locals 1

    sget-object v0, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lx1/r$b;

    return-object v0
.end method


# virtual methods
.method public W()I
    .locals 1

    invoke-direct {p0}, Lx1/r;->b0()Lcom/google/protobuf/p0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->size()I

    move-result v0

    return v0
.end method

.method public X()Ljava/util/Map;
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

    invoke-direct {p0}, Lx1/r;->b0()Lcom/google/protobuf/p0;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method public Y(Ljava/lang/String;Lx1/x;)Lx1/x;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/r;->b0()Lcom/google/protobuf/p0;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    move-object p2, p1

    check-cast p2, Lx1/x;

    :cond_0
    return-object p2
.end method

.method public Z(Ljava/lang/String;)Lx1/x;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-direct {p0}, Lx1/r;->b0()Lcom/google/protobuf/p0;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    throw p1
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lx1/r$a;->a:[I

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
    sget-object p1, Lx1/r;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lx1/r;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lx1/r;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lx1/r;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "fields_"

    aput-object v0, p1, p3

    sget-object p3, Lx1/r$c;->a:Lcom/google/protobuf/o0;

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012"

    sget-object p3, Lx1/r;->DEFAULT_INSTANCE:Lx1/r;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lx1/r$b;

    invoke-direct {p1, p3}, Lx1/r$b;-><init>(Lx1/r$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lx1/r;

    invoke-direct {p1}, Lx1/r;-><init>()V

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
