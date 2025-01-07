.class public final enum Lx1/d$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lx1/d$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lx1/d$c;

.field public static final enum g:Lx1/d$c;

.field public static final enum h:Lx1/d$c;

.field private static final synthetic i:[Lx1/d$c;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lx1/d$c;

    const-string v1, "FOUND"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Lx1/d$c;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lx1/d$c;->f:Lx1/d$c;

    new-instance v1, Lx1/d$c;

    const-string v4, "MISSING"

    const/4 v5, 0x2

    invoke-direct {v1, v4, v3, v5}, Lx1/d$c;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lx1/d$c;->g:Lx1/d$c;

    new-instance v4, Lx1/d$c;

    const-string v6, "RESULT_NOT_SET"

    invoke-direct {v4, v6, v5, v2}, Lx1/d$c;-><init>(Ljava/lang/String;II)V

    sput-object v4, Lx1/d$c;->h:Lx1/d$c;

    const/4 v6, 0x3

    new-array v6, v6, [Lx1/d$c;

    aput-object v0, v6, v2

    aput-object v1, v6, v3

    aput-object v4, v6, v5

    sput-object v6, Lx1/d$c;->i:[Lx1/d$c;

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

    iput p3, p0, Lx1/d$c;->e:I

    return-void
.end method

.method public static d(I)Lx1/d$c;
    .locals 1

    if-eqz p0, :cond_2

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-eq p0, v0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    sget-object p0, Lx1/d$c;->g:Lx1/d$c;

    return-object p0

    :cond_1
    sget-object p0, Lx1/d$c;->f:Lx1/d$c;

    return-object p0

    :cond_2
    sget-object p0, Lx1/d$c;->h:Lx1/d$c;

    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lx1/d$c;
    .locals 1

    const-class v0, Lx1/d$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lx1/d$c;

    return-object p0
.end method

.method public static values()[Lx1/d$c;
    .locals 1

    sget-object v0, Lx1/d$c;->i:[Lx1/d$c;

    invoke-virtual {v0}, [Lx1/d$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lx1/d$c;

    return-object v0
.end method
