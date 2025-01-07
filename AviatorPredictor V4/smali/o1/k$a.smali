.class public final enum Lo1/k$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/k;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo1/k$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lo1/k$a;

.field public static final enum f:Lo1/k$a;

.field private static final synthetic g:[Lo1/k$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lo1/k$a;

    const-string v1, "UNREACHABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo1/k$a;->e:Lo1/k$a;

    new-instance v1, Lo1/k$a;

    const-string v3, "REACHABLE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo1/k$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo1/k$a;->f:Lo1/k$a;

    const/4 v3, 0x2

    new-array v3, v3, [Lo1/k$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lo1/k$a;->g:[Lo1/k$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lo1/k$a;
    .locals 1

    const-class v0, Lo1/k$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo1/k$a;

    return-object p0
.end method

.method public static values()[Lo1/k$a;
    .locals 1

    sget-object v0, Lo1/k$a;->g:[Lo1/k$a;

    invoke-virtual {v0}, [Lo1/k$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo1/k$a;

    return-object v0
.end method
