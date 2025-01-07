.class public final enum Li1/q0$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/q0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/q0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Li1/q0$a;

.field public static final enum f:Li1/q0$a;

.field private static final synthetic g:[Li1/q0$a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Li1/q0$a;

    const-string v1, "ADDED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li1/q0$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/q0$a;->e:Li1/q0$a;

    new-instance v1, Li1/q0$a;

    const-string v3, "REMOVED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Li1/q0$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li1/q0$a;->f:Li1/q0$a;

    const/4 v3, 0x2

    new-array v3, v3, [Li1/q0$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Li1/q0$a;->g:[Li1/q0$a;

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

.method public static valueOf(Ljava/lang/String;)Li1/q0$a;
    .locals 1

    const-class v0, Li1/q0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/q0$a;

    return-object p0
.end method

.method public static values()[Li1/q0$a;
    .locals 1

    sget-object v0, Li1/q0$a;->g:[Li1/q0$a;

    invoke-virtual {v0}, [Li1/q0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/q0$a;

    return-object v0
.end method
