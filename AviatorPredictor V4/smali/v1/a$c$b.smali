.class public final enum Lv1/a$c$b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lcom/google/protobuf/d0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lv1/a$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv1/a$c$b;",
        ">;",
        "Lcom/google/protobuf/d0$c;"
    }
.end annotation


# static fields
.field public static final enum f:Lv1/a$c$b;

.field public static final enum g:Lv1/a$c$b;

.field public static final enum h:Lv1/a$c$b;

.field public static final enum i:Lv1/a$c$b;

.field private static final j:Lcom/google/protobuf/d0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$d<",
            "Lv1/a$c$b;",
            ">;"
        }
    .end annotation
.end field

.field private static final synthetic k:[Lv1/a$c$b;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lv1/a$c$b;

    const-string v1, "ORDER_UNSPECIFIED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lv1/a$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lv1/a$c$b;->f:Lv1/a$c$b;

    new-instance v1, Lv1/a$c$b;

    const-string v3, "ASCENDING"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lv1/a$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lv1/a$c$b;->g:Lv1/a$c$b;

    new-instance v3, Lv1/a$c$b;

    const-string v5, "DESCENDING"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6, v6}, Lv1/a$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v3, Lv1/a$c$b;->h:Lv1/a$c$b;

    new-instance v5, Lv1/a$c$b;

    const-string v7, "UNRECOGNIZED"

    const/4 v8, 0x3

    const/4 v9, -0x1

    invoke-direct {v5, v7, v8, v9}, Lv1/a$c$b;-><init>(Ljava/lang/String;II)V

    sput-object v5, Lv1/a$c$b;->i:Lv1/a$c$b;

    const/4 v7, 0x4

    new-array v7, v7, [Lv1/a$c$b;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lv1/a$c$b;->k:[Lv1/a$c$b;

    new-instance v0, Lv1/a$c$b$a;

    invoke-direct {v0}, Lv1/a$c$b$a;-><init>()V

    sput-object v0, Lv1/a$c$b;->j:Lcom/google/protobuf/d0$d;

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

    iput p3, p0, Lv1/a$c$b;->e:I

    return-void
.end method

.method public static d(I)Lv1/a$c$b;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lv1/a$c$b;->h:Lv1/a$c$b;

    return-object p0

    :cond_1
    sget-object p0, Lv1/a$c$b;->g:Lv1/a$c$b;

    return-object p0

    :cond_2
    sget-object p0, Lv1/a$c$b;->f:Lv1/a$c$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lv1/a$c$b;
    .locals 1

    const-class v0, Lv1/a$c$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv1/a$c$b;

    return-object p0
.end method

.method public static values()[Lv1/a$c$b;
    .locals 1

    sget-object v0, Lv1/a$c$b;->k:[Lv1/a$c$b;

    invoke-virtual {v0}, [Lv1/a$c$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv1/a$c$b;

    return-object v0
.end method


# virtual methods
.method public final e()I
    .locals 2

    sget-object v0, Lv1/a$c$b;->i:Lv1/a$c$b;

    if-eq p0, v0, :cond_0

    iget v0, p0, Lv1/a$c$b;->e:I

    return v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can\'t get the number of an unknown enum value."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
