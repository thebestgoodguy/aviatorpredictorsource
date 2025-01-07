.class final enum Lio/grpc/internal/b1$e;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/b1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/grpc/internal/b1$e;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lio/grpc/internal/b1$e;

.field public static final enum f:Lio/grpc/internal/b1$e;

.field public static final enum g:Lio/grpc/internal/b1$e;

.field public static final enum h:Lio/grpc/internal/b1$e;

.field public static final enum i:Lio/grpc/internal/b1$e;

.field public static final enum j:Lio/grpc/internal/b1$e;

.field private static final synthetic k:[Lio/grpc/internal/b1$e;


# direct methods
.method static constructor <clinit>()V
    .locals 13

    new-instance v0, Lio/grpc/internal/b1$e;

    const-string v1, "IDLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/grpc/internal/b1$e;->e:Lio/grpc/internal/b1$e;

    new-instance v1, Lio/grpc/internal/b1$e;

    const-string v3, "PING_SCHEDULED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/grpc/internal/b1$e;->f:Lio/grpc/internal/b1$e;

    new-instance v3, Lio/grpc/internal/b1$e;

    const-string v5, "PING_DELAYED"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/grpc/internal/b1$e;->g:Lio/grpc/internal/b1$e;

    new-instance v5, Lio/grpc/internal/b1$e;

    const-string v7, "PING_SENT"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lio/grpc/internal/b1$e;->h:Lio/grpc/internal/b1$e;

    new-instance v7, Lio/grpc/internal/b1$e;

    const-string v9, "IDLE_AND_PING_SENT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lio/grpc/internal/b1$e;->i:Lio/grpc/internal/b1$e;

    new-instance v9, Lio/grpc/internal/b1$e;

    const-string v11, "DISCONNECTED"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lio/grpc/internal/b1$e;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lio/grpc/internal/b1$e;->j:Lio/grpc/internal/b1$e;

    const/4 v11, 0x6

    new-array v11, v11, [Lio/grpc/internal/b1$e;

    aput-object v0, v11, v2

    aput-object v1, v11, v4

    aput-object v3, v11, v6

    aput-object v5, v11, v8

    aput-object v7, v11, v10

    aput-object v9, v11, v12

    sput-object v11, Lio/grpc/internal/b1$e;->k:[Lio/grpc/internal/b1$e;

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

.method public static valueOf(Ljava/lang/String;)Lio/grpc/internal/b1$e;
    .locals 1

    const-class v0, Lio/grpc/internal/b1$e;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/grpc/internal/b1$e;

    return-object p0
.end method

.method public static values()[Lio/grpc/internal/b1$e;
    .locals 1

    sget-object v0, Lio/grpc/internal/b1$e;->k:[Lio/grpc/internal/b1$e;

    invoke-virtual {v0}, [Lio/grpc/internal/b1$e;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/grpc/internal/b1$e;

    return-object v0
.end method
