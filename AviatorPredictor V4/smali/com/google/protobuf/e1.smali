.class public final enum Lcom/google/protobuf/e1;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/d0$c;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/protobuf/e1;",
        ">;",
        "Lcom/google/protobuf/d0$c;"
    }
.end annotation


# static fields
.field public static final enum f:Lcom/google/protobuf/e1;

.field public static final enum g:Lcom/google/protobuf/e1;

.field private static final h:Lcom/google/protobuf/d0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$d<",
            "Lcom/google/protobuf/e1;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic i:[Lcom/google/protobuf/e1;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/google/protobuf/e1;

    const-string v1, "NULL_VALUE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lcom/google/protobuf/e1;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lcom/google/protobuf/e1;->f:Lcom/google/protobuf/e1;

    new-instance v1, Lcom/google/protobuf/e1;

    const-string v3, "UNRECOGNIZED"

    const/4 v4, 0x1

    const/4 v5, -0x1

    invoke-direct {v1, v3, v4, v5}, Lcom/google/protobuf/e1;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lcom/google/protobuf/e1;->g:Lcom/google/protobuf/e1;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/protobuf/e1;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/protobuf/e1;->i:[Lcom/google/protobuf/e1;

    new-instance v0, Lcom/google/protobuf/e1$a;

    invoke-direct {v0}, Lcom/google/protobuf/e1$a;-><init>()V

    sput-object v0, Lcom/google/protobuf/e1;->h:Lcom/google/protobuf/d0$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lcom/google/protobuf/e1;->e:I

    return-void
.end method

.method public static d(I)Lcom/google/protobuf/e1;
    .locals 0

    if-eqz p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lcom/google/protobuf/e1;->f:Lcom/google/protobuf/e1;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/protobuf/e1;
    .locals 1

    const-class v0, Lcom/google/protobuf/e1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/protobuf/e1;

    return-object p0
.end method

.method public static values()[Lcom/google/protobuf/e1;
    .locals 1

    sget-object v0, Lcom/google/protobuf/e1;->i:[Lcom/google/protobuf/e1;

    invoke-virtual {v0}, [Lcom/google/protobuf/e1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/protobuf/e1;

    return-object v0
.end method


# virtual methods
.method public final e()I
    .locals 2

    sget-object v0, Lcom/google/protobuf/e1;->g:Lcom/google/protobuf/e1;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lcom/google/protobuf/e1;->e:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
