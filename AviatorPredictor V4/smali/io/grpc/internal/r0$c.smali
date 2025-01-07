.class final enum Lio/grpc/internal/r0$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/r0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/grpc/internal/r0$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lio/grpc/internal/r0$c;

.field public static final enum f:Lio/grpc/internal/r0$c;

.field public static final enum g:Lio/grpc/internal/r0$c;

.field public static final enum h:Lio/grpc/internal/r0$c;

.field public static final enum i:Lio/grpc/internal/r0$c;

.field public static final enum j:Lio/grpc/internal/r0$c;

.field public static final enum k:Lio/grpc/internal/r0$c;

.field public static final enum l:Lio/grpc/internal/r0$c;

.field public static final enum m:Lio/grpc/internal/r0$c;

.field public static final enum n:Lio/grpc/internal/r0$c;

.field private static final synthetic o:[Lio/grpc/internal/r0$c;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    new-instance v0, Lio/grpc/internal/r0$c;

    const-string v1, "HEADER"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/grpc/internal/r0$c;->e:Lio/grpc/internal/r0$c;

    new-instance v1, Lio/grpc/internal/r0$c;

    const-string v3, "HEADER_EXTRA_LEN"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lio/grpc/internal/r0$c;->f:Lio/grpc/internal/r0$c;

    new-instance v3, Lio/grpc/internal/r0$c;

    const-string v5, "HEADER_EXTRA"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lio/grpc/internal/r0$c;->g:Lio/grpc/internal/r0$c;

    new-instance v5, Lio/grpc/internal/r0$c;

    const-string v7, "HEADER_NAME"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lio/grpc/internal/r0$c;->h:Lio/grpc/internal/r0$c;

    new-instance v7, Lio/grpc/internal/r0$c;

    const-string v9, "HEADER_COMMENT"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lio/grpc/internal/r0$c;->i:Lio/grpc/internal/r0$c;

    new-instance v9, Lio/grpc/internal/r0$c;

    const-string v11, "HEADER_CRC"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lio/grpc/internal/r0$c;->j:Lio/grpc/internal/r0$c;

    new-instance v11, Lio/grpc/internal/r0$c;

    const-string v13, "INITIALIZE_INFLATER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lio/grpc/internal/r0$c;->k:Lio/grpc/internal/r0$c;

    new-instance v13, Lio/grpc/internal/r0$c;

    const-string v15, "INFLATING"

    const/4 v14, 0x7

    invoke-direct {v13, v15, v14}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v13, Lio/grpc/internal/r0$c;->l:Lio/grpc/internal/r0$c;

    new-instance v15, Lio/grpc/internal/r0$c;

    const-string v14, "INFLATER_NEEDS_INPUT"

    const/16 v12, 0x8

    invoke-direct {v15, v14, v12}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v15, Lio/grpc/internal/r0$c;->m:Lio/grpc/internal/r0$c;

    new-instance v14, Lio/grpc/internal/r0$c;

    const-string v12, "TRAILER"

    const/16 v10, 0x9

    invoke-direct {v14, v12, v10}, Lio/grpc/internal/r0$c;-><init>(Ljava/lang/String;I)V

    sput-object v14, Lio/grpc/internal/r0$c;->n:Lio/grpc/internal/r0$c;

    const/16 v12, 0xa

    new-array v12, v12, [Lio/grpc/internal/r0$c;

    aput-object v0, v12, v2

    aput-object v1, v12, v4

    aput-object v3, v12, v6

    aput-object v5, v12, v8

    const/4 v0, 0x4

    aput-object v7, v12, v0

    const/4 v0, 0x5

    aput-object v9, v12, v0

    const/4 v0, 0x6

    aput-object v11, v12, v0

    const/4 v0, 0x7

    aput-object v13, v12, v0

    const/16 v0, 0x8

    aput-object v15, v12, v0

    aput-object v14, v12, v10

    sput-object v12, Lio/grpc/internal/r0$c;->o:[Lio/grpc/internal/r0$c;

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

.method public static valueOf(Ljava/lang/String;)Lio/grpc/internal/r0$c;
    .locals 1

    const-class v0, Lio/grpc/internal/r0$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/grpc/internal/r0$c;

    return-object p0
.end method

.method public static values()[Lio/grpc/internal/r0$c;
    .locals 1

    sget-object v0, Lio/grpc/internal/r0$c;->o:[Lio/grpc/internal/r0$c;

    invoke-virtual {v0}, [Lio/grpc/internal/r0$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/grpc/internal/r0$c;

    return-object v0
.end method
