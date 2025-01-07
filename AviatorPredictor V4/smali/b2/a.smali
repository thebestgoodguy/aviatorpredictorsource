.class public final Lb2/a;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lb2/a$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Lb2/a;",
        "Lb2/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Lb2/a;

.field public static final LATITUDE_FIELD_NUMBER:I = 0x1

.field public static final LONGITUDE_FIELD_NUMBER:I = 0x2

.field private static volatile PARSER:Lcom/google/protobuf/f1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Lb2/a;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private latitude_:D

.field private longitude_:D


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lb2/a;

    invoke-direct {v0}, Lb2/a;-><init>()V

    sput-object v0, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    const-class v1, Lb2/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    return-void
.end method

.method static synthetic T()Lb2/a;
    .locals 1

    sget-object v0, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    return-object v0
.end method

.method static synthetic U(Lb2/a;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb2/a;->a0(D)V

    return-void
.end method

.method static synthetic V(Lb2/a;D)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb2/a;->b0(D)V

    return-void
.end method

.method public static W()Lb2/a;
    .locals 1

    sget-object v0, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    return-object v0
.end method

.method public static Z()Lb2/a$b;
    .locals 1

    sget-object v0, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Lb2/a$b;

    return-object v0
.end method

.method private a0(D)V
    .locals 0

    iput-wide p1, p0, Lb2/a;->latitude_:D

    return-void
.end method

.method private b0(D)V
    .locals 0

    iput-wide p1, p0, Lb2/a;->longitude_:D

    return-void
.end method


# virtual methods
.method public X()D
    .locals 2

    iget-wide v0, p0, Lb2/a;->latitude_:D

    return-wide v0
.end method

.method public Y()D
    .locals 2

    iget-wide v0, p0, Lb2/a;->longitude_:D

    return-wide v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Lb2/a$a;->a:[I

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
    sget-object p1, Lb2/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Lb2/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Lb2/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Lb2/a;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x2

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "latitude_"

    aput-object v0, p1, p3

    const-string p3, "longitude_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000"

    sget-object p3, Lb2/a;->DEFAULT_INSTANCE:Lb2/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Lb2/a$b;

    invoke-direct {p1, p3}, Lb2/a$b;-><init>(Lb2/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Lb2/a;

    invoke-direct {p1}, Lb2/a;-><init>()V

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
