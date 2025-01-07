.class public final Ln1/a;
.super Lcom/google/protobuf/a0;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ln1/a$b;,
        Ln1/a$c;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0<",
        "Ln1/a;",
        "Ln1/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# static fields
.field private static final DEFAULT_INSTANCE:Ln1/a;

.field public static final DOCUMENT_FIELD_NUMBER:I = 0x2

.field public static final HAS_COMMITTED_MUTATIONS_FIELD_NUMBER:I = 0x4

.field public static final NO_DOCUMENT_FIELD_NUMBER:I = 0x1

.field private static volatile PARSER:Lcom/google/protobuf/f1; = null
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/f1<",
            "Ln1/a;",
            ">;"
        }
    .end annotation
.end field

.field public static final UNKNOWN_DOCUMENT_FIELD_NUMBER:I = 0x3


# instance fields
.field private documentTypeCase_:I

.field private documentType_:Ljava/lang/Object;

.field private hasCommittedMutations_:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ln1/a;

    invoke-direct {v0}, Ln1/a;-><init>()V

    sput-object v0, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    const-class v1, Ln1/a;

    invoke-static {v1, v0}, Lcom/google/protobuf/a0;->R(Ljava/lang/Class;Lcom/google/protobuf/a0;)V

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lcom/google/protobuf/a0;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ln1/a;->documentTypeCase_:I

    return-void
.end method

.method static synthetic T()Ln1/a;
    .locals 1

    sget-object v0, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    return-object v0
.end method

.method static synthetic U(Ln1/a;Z)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/a;->g0(Z)V

    return-void
.end method

.method static synthetic V(Ln1/a;Ln1/b;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/a;->h0(Ln1/b;)V

    return-void
.end method

.method static synthetic W(Ln1/a;Lx1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/a;->f0(Lx1/h;)V

    return-void
.end method

.method static synthetic X(Ln1/a;Ln1/d;)V
    .locals 0

    invoke-direct {p0, p1}, Ln1/a;->i0(Ln1/d;)V

    return-void
.end method

.method public static d0()Ln1/a$b;
    .locals 1

    sget-object v0, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    invoke-virtual {v0}, Lcom/google/protobuf/a0;->u()Lcom/google/protobuf/a0$a;

    move-result-object v0

    check-cast v0, Ln1/a$b;

    return-object v0
.end method

.method public static e0([B)Ln1/a;
    .locals 1

    sget-object v0, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    invoke-static {v0, p0}, Lcom/google/protobuf/a0;->N(Lcom/google/protobuf/a0;[B)Lcom/google/protobuf/a0;

    move-result-object p0

    check-cast p0, Ln1/a;

    return-object p0
.end method

.method private f0(Lx1/h;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x2

    iput p1, p0, Ln1/a;->documentTypeCase_:I

    return-void
.end method

.method private g0(Z)V
    .locals 0

    iput-boolean p1, p0, Ln1/a;->hasCommittedMutations_:Z

    return-void
.end method

.method private h0(Ln1/b;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x1

    iput p1, p0, Ln1/a;->documentTypeCase_:I

    return-void
.end method

.method private i0(Ln1/d;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iput-object p1, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    const/4 p1, 0x3

    iput p1, p0, Ln1/a;->documentTypeCase_:I

    return-void
.end method


# virtual methods
.method public Y()Lx1/h;
    .locals 2

    iget v0, p0, Ln1/a;->documentTypeCase_:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Lx1/h;

    return-object v0

    :cond_0
    invoke-static {}, Lx1/h;->X()Lx1/h;

    move-result-object v0

    return-object v0
.end method

.method public Z()Ln1/a$c;
    .locals 1

    iget v0, p0, Ln1/a;->documentTypeCase_:I

    invoke-static {v0}, Ln1/a$c;->d(I)Ln1/a$c;

    move-result-object v0

    return-object v0
.end method

.method public a0()Z
    .locals 1

    iget-boolean v0, p0, Ln1/a;->hasCommittedMutations_:Z

    return v0
.end method

.method public b0()Ln1/b;
    .locals 2

    iget v0, p0, Ln1/a;->documentTypeCase_:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Ln1/b;

    return-object v0

    :cond_0
    invoke-static {}, Ln1/b;->W()Ln1/b;

    move-result-object v0

    return-object v0
.end method

.method public c0()Ln1/d;
    .locals 2

    iget v0, p0, Ln1/a;->documentTypeCase_:I

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Ln1/a;->documentType_:Ljava/lang/Object;

    check-cast v0, Ln1/d;

    return-object v0

    :cond_0
    invoke-static {}, Ln1/d;->W()Ln1/d;

    move-result-object v0

    return-object v0
.end method

.method protected final y(Lcom/google/protobuf/a0$f;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    sget-object p2, Ln1/a$a;->a:[I

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
    sget-object p1, Ln1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_1

    const-class p2, Ln1/a;

    monitor-enter p2

    :try_start_0
    sget-object p1, Ln1/a;->PARSER:Lcom/google/protobuf/f1;

    if-nez p1, :cond_0

    new-instance p1, Lcom/google/protobuf/a0$b;

    sget-object p3, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    invoke-direct {p1, p3}, Lcom/google/protobuf/a0$b;-><init>(Lcom/google/protobuf/a0;)V

    sput-object p1, Ln1/a;->PARSER:Lcom/google/protobuf/f1;

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
    sget-object p1, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    return-object p1

    :pswitch_4
    const/4 p1, 0x6

    new-array p1, p1, [Ljava/lang/Object;

    const/4 p3, 0x0

    const-string v0, "documentType_"

    aput-object v0, p1, p3

    const-string p3, "documentTypeCase_"

    aput-object p3, p1, p2

    const/4 p2, 0x2

    const-class p3, Ln1/b;

    aput-object p3, p1, p2

    const/4 p2, 0x3

    const-class p3, Lx1/h;

    aput-object p3, p1, p2

    const/4 p2, 0x4

    const-class p3, Ln1/d;

    aput-object p3, p1, p2

    const/4 p2, 0x5

    const-string p3, "hasCommittedMutations_"

    aput-object p3, p1, p2

    const-string p2, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\u0007"

    sget-object p3, Ln1/a;->DEFAULT_INSTANCE:Ln1/a;

    invoke-static {p3, p2, p1}, Lcom/google/protobuf/a0;->J(Lcom/google/protobuf/v0;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_5
    new-instance p1, Ln1/a$b;

    invoke-direct {p1, p3}, Ln1/a$b;-><init>(Ln1/a$a;)V

    return-object p1

    :pswitch_6
    new-instance p1, Ln1/a;

    invoke-direct {p1}, Ln1/a;-><init>()V

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
