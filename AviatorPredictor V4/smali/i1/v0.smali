.class public final enum Li1/v0;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/v0;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Li1/v0;

.field public static final enum f:Li1/v0;

.field public static final enum g:Li1/v0;

.field private static final synthetic h:[Li1/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li1/v0;

    const-string v1, "UNKNOWN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li1/v0;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/v0;->e:Li1/v0;

    new-instance v1, Li1/v0;

    const-string v3, "ONLINE"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Li1/v0;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li1/v0;->f:Li1/v0;

    new-instance v3, Li1/v0;

    const-string v5, "OFFLINE"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Li1/v0;-><init>(Ljava/lang/String;I)V

    sput-object v3, Li1/v0;->g:Li1/v0;

    const/4 v5, 0x3

    new-array v5, v5, [Li1/v0;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Li1/v0;->h:[Li1/v0;

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

.method public static valueOf(Ljava/lang/String;)Li1/v0;
    .locals 1

    const-class v0, Li1/v0;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/v0;

    return-object p0
.end method

.method public static values()[Li1/v0;
    .locals 1

    sget-object v0, Li1/v0;->h:[Li1/v0;

    invoke-virtual {v0}, [Li1/v0;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/v0;

    return-object v0
.end method
