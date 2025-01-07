.class public final enum Lq2/m$b;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lq2/m$b;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Lq2/m$b;

.field public static final enum g:Lq2/m$b;

.field private static final synthetic h:[Lq2/m$b;


# instance fields
.field public e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lq2/m$b;

    const-string v1, "light"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v1}, Lq2/m$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lq2/m$b;->f:Lq2/m$b;

    new-instance v1, Lq2/m$b;

    const-string v3, "dark"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v3}, Lq2/m$b;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lq2/m$b;->g:Lq2/m$b;

    const/4 v3, 0x2

    new-array v3, v3, [Lq2/m$b;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lq2/m$b;->h:[Lq2/m$b;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lq2/m$b;->e:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lq2/m$b;
    .locals 1

    const-class v0, Lq2/m$b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lq2/m$b;

    return-object p0
.end method

.method public static values()[Lq2/m$b;
    .locals 1

    sget-object v0, Lq2/m$b;->h:[Lq2/m$b;

    invoke-virtual {v0}, [Lq2/m$b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lq2/m$b;

    return-object v0
.end method
