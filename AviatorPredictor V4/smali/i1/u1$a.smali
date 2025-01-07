.class public final enum Li1/u1$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/u1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/u1$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Li1/u1$a;

.field public static final enum f:Li1/u1$a;

.field public static final enum g:Li1/u1$a;

.field private static final synthetic h:[Li1/u1$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li1/u1$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Li1/u1$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Li1/u1$a;->e:Li1/u1$a;

    new-instance v1, Li1/u1$a;

    const-string v3, "LOCAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Li1/u1$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Li1/u1$a;->f:Li1/u1$a;

    new-instance v3, Li1/u1$a;

    const-string v5, "SYNCED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Li1/u1$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Li1/u1$a;->g:Li1/u1$a;

    const/4 v5, 0x3

    new-array v5, v5, [Li1/u1$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Li1/u1$a;->h:[Li1/u1$a;

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

.method public static valueOf(Ljava/lang/String;)Li1/u1$a;
    .locals 1

    const-class v0, Li1/u1$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/u1$a;

    return-object p0
.end method

.method public static values()[Li1/u1$a;
    .locals 1

    sget-object v0, Li1/u1$a;->h:[Li1/u1$a;

    invoke-virtual {v0}, [Li1/u1$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/u1$a;

    return-object v0
.end method
