.class public final enum Lo1/o0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo1/o0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lo1/o0;

.field public static final enum f:Lo1/o0;

.field public static final enum g:Lo1/o0;

.field public static final enum h:Lo1/o0;

.field public static final enum i:Lo1/o0;

.field public static final enum j:Lo1/o0;

.field private static final synthetic k:[Lo1/o0;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lo1/o0;

    const-string v1, "Initial"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo1/o0;->e:Lo1/o0;

    new-instance v1, Lo1/o0;

    const-string v3, "Starting"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo1/o0;->f:Lo1/o0;

    new-instance v3, Lo1/o0;

    const-string v5, "Open"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo1/o0;->g:Lo1/o0;

    new-instance v5, Lo1/o0;

    const-string v7, "Healthy"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo1/o0;->h:Lo1/o0;

    new-instance v7, Lo1/o0;

    const-string v9, "Error"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lo1/o0;->i:Lo1/o0;

    new-instance v9, Lo1/o0;

    const-string v11, "Backoff"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lo1/o0;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lo1/o0;->j:Lo1/o0;

    const/4 v11, 0x6

    new-array v11, v11, [Lo1/o0;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lo1/o0;->k:[Lo1/o0;

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

.method public static valueOf(Ljava/lang/String;)Lo1/o0;
    .locals 1

    const-class v0, Lo1/o0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo1/o0;

    return-object p0
.end method

.method public static values()[Lo1/o0;
    .locals 1

    sget-object v0, Lo1/o0;->k:[Lo1/o0;

    invoke-virtual {v0}, [Lo1/o0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo1/o0;

    return-object v0
.end method
