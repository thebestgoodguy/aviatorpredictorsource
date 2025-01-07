.class public final enum Lx1/t$e;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/d0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx1/t$e;",
        ">;",
        "Lcom/google/protobuf/d0$c;"
    }
.end annotation


# static fields
.field public static final enum f:Lx1/t$e;

.field public static final enum g:Lx1/t$e;

.field public static final enum h:Lx1/t$e;

.field public static final enum i:Lx1/t$e;

.field private static final j:Lcom/google/protobuf/d0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$d<",
            "Lx1/t$e;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic k:[Lx1/t$e;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lx1/t$e;

    const-string v1, "DIRECTION_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lx1/t$e;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx1/t$e;->f:Lx1/t$e;

    new-instance v1, Lx1/t$e;

    const-string v3, "ASCENDING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lx1/t$e;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx1/t$e;->g:Lx1/t$e;

    new-instance v3, Lx1/t$e;

    const-string v5, "DESCENDING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lx1/t$e;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lx1/t$e;->h:Lx1/t$e;

    new-instance v5, Lx1/t$e;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Lx1/t$e;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lx1/t$e;->i:Lx1/t$e;

    const/4 v7, 0x4

    new-array v7, v7, [Lx1/t$e;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lx1/t$e;->k:[Lx1/t$e;

    new-instance v0, Lx1/t$e$a;

    invoke-direct {v0}, Lx1/t$e$a;-><init>()V

    sput-object v0, Lx1/t$e;->j:Lcom/google/protobuf/d0$d;

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

    iput p3, p0, Lx1/t$e;->e:I

    return-void
.end method

.method public static d(I)Lx1/t$e;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lx1/t$e;->h:Lx1/t$e;

    return-object p0

    :cond_1
    sget-object p0, Lx1/t$e;->g:Lx1/t$e;

    return-object p0

    :cond_2
    sget-object p0, Lx1/t$e;->f:Lx1/t$e;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lx1/t$e;
    .locals 1

    const-class v0, Lx1/t$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx1/t$e;

    return-object p0
.end method

.method public static values()[Lx1/t$e;
    .locals 1

    sget-object v0, Lx1/t$e;->k:[Lx1/t$e;

    invoke-virtual {v0}, [Lx1/t$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/t$e;

    return-object v0
.end method


# virtual methods
.method public final e()I
    .locals 2

    sget-object v0, Lx1/t$e;->i:Lx1/t$e;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lx1/t$e;->e:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
