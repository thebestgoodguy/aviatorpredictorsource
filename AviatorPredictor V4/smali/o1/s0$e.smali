.class public final enum Lo1/s0$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo1/s0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lo1/s0$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lo1/s0$e;

.field public static final enum f:Lo1/s0$e;

.field public static final enum g:Lo1/s0$e;

.field public static final enum h:Lo1/s0$e;

.field public static final enum i:Lo1/s0$e;

.field private static final synthetic j:[Lo1/s0$e;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lo1/s0$e;

    const-string v1, "NoChange"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo1/s0$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lo1/s0$e;->e:Lo1/s0$e;

    new-instance v1, Lo1/s0$e;

    const-string v3, "Added"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lo1/s0$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lo1/s0$e;->f:Lo1/s0$e;

    new-instance v3, Lo1/s0$e;

    const-string v5, "Removed"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lo1/s0$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lo1/s0$e;->g:Lo1/s0$e;

    new-instance v5, Lo1/s0$e;

    const-string v7, "Current"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lo1/s0$e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lo1/s0$e;->h:Lo1/s0$e;

    new-instance v7, Lo1/s0$e;

    const-string v9, "Reset"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lo1/s0$e;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lo1/s0$e;->i:Lo1/s0$e;

    const/4 v9, 0x5

    new-array v9, v9, [Lo1/s0$e;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lo1/s0$e;->j:[Lo1/s0$e;

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

.method public static valueOf(Ljava/lang/String;)Lo1/s0$e;
    .locals 1

    const-class v0, Lo1/s0$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lo1/s0$e;

    return-object p0
.end method

.method public static values()[Lo1/s0$e;
    .locals 1

    sget-object v0, Lo1/s0$e;->j:[Lo1/s0$e;

    invoke-virtual {v0}, [Lo1/s0$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lo1/s0$e;

    return-object v0
.end method
