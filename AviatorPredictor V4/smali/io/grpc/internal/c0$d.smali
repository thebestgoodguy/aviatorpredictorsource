.class final enum Lio/grpc/internal/c0$d;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lio/grpc/internal/c0$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/c0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/grpc/internal/c0$d;",
        ">;",
        "Lio/grpc/internal/c0$b;"
    }
.end annotation


# static fields
.field public static final enum e:Lio/grpc/internal/c0$d;

.field private static final synthetic f:[Lio/grpc/internal/c0$d;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lio/grpc/internal/c0$d;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lio/grpc/internal/c0$d;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lio/grpc/internal/c0$d;->e:Lio/grpc/internal/c0$d;

    const/4 v1, 0x1

    new-array v1, v1, [Lio/grpc/internal/c0$d;

    aput-object v0, v1, v2

    sput-object v1, Lio/grpc/internal/c0$d;->f:[Lio/grpc/internal/c0$d;

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

.method public static valueOf(Ljava/lang/String;)Lio/grpc/internal/c0$d;
    .locals 1

    const-class v0, Lio/grpc/internal/c0$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/grpc/internal/c0$d;

    return-object p0
.end method

.method public static values()[Lio/grpc/internal/c0$d;
    .locals 1

    sget-object v0, Lio/grpc/internal/c0$d;->f:[Lio/grpc/internal/c0$d;

    invoke-virtual {v0}, [Lio/grpc/internal/c0$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/grpc/internal/c0$d;

    return-object v0
.end method


# virtual methods
.method public d(Ljava/lang/String;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;"
        }
    .end annotation

    invoke-static {p1}, Ljava/net/InetAddress;->getAllByName(Ljava/lang/String;)[Ljava/net/InetAddress;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method
