.class public final enum Lx1/t$h$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t$h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx1/t$h$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lx1/t$h$b;

.field public static final enum g:Lx1/t$h$b;

.field public static final enum h:Lx1/t$h$b;

.field public static final enum i:Lx1/t$h$b;

.field private static final synthetic j:[Lx1/t$h$b;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lx1/t$h$b;

    const-string v1, "COMPOSITE_FILTER"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lx1/t$h$b;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx1/t$h$b;->f:Lx1/t$h$b;

    new-instance v1, Lx1/t$h$b;

    const-string v4, "FIELD_FILTER"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lx1/t$h$b;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx1/t$h$b;->g:Lx1/t$h$b;

    new-instance v4, Lx1/t$h$b;

    const-string v6, "UNARY_FILTER"

    const/4 v7, 0x3

    invoke-direct {v4, v6, v5, v7}, Lx1/t$h$b;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lx1/t$h$b;->h:Lx1/t$h$b;

    new-instance v6, Lx1/t$h$b;

    const-string v8, "FILTERTYPE_NOT_SET"

    invoke-direct {v6, v8, v7, v2}, Lx1/t$h$b;-><init>(Ljava/lang/String;II)V

    sput-object v6, Lx1/t$h$b;->i:Lx1/t$h$b;

    const/4 v8, 0x4

    new-array v8, v8, [Lx1/t$h$b;

    aput-object v0, v8, v2

    aput-object v1, v8, v3

    aput-object v4, v8, v5

    aput-object v6, v8, v7

    sput-object v8, Lx1/t$h$b;->j:[Lx1/t$h$b;

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

    iput p3, p0, Lx1/t$h$b;->e:I

    return-void
.end method

.method public static d(I)Lx1/t$h$b;
    .locals 1

    if-eqz p0, :cond_3

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lx1/t$h$b;->h:Lx1/t$h$b;

    return-object p0

    :cond_1
    sget-object p0, Lx1/t$h$b;->g:Lx1/t$h$b;

    return-object p0

    :cond_2
    sget-object p0, Lx1/t$h$b;->f:Lx1/t$h$b;

    return-object p0

    :cond_3
    sget-object p0, Lx1/t$h$b;->i:Lx1/t$h$b;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lx1/t$h$b;
    .locals 1

    const-class v0, Lx1/t$h$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx1/t$h$b;

    return-object p0
.end method

.method public static values()[Lx1/t$h$b;
    .locals 1

    sget-object v0, Lx1/t$h$b;->j:[Lx1/t$h$b;

    invoke-virtual {v0}, [Lx1/t$h$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/t$h$b;

    return-object v0
.end method
