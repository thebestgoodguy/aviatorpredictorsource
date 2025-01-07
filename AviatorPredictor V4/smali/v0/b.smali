.class final enum Lv0/b;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Ljava/util/concurrent/Executor;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lv0/b;",
        ">;",
        "Ljava/util/concurrent/Executor;"
    }
.end annotation


# static fields
.field public static final enum e:Lv0/b;

.field private static final synthetic f:[Lv0/b;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lv0/b;

    const-string v1, "INSTANCE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lv0/b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lv0/b;->e:Lv0/b;

    invoke-static {}, Lv0/b;->d()[Lv0/b;

    move-result-object v0

    sput-object v0, Lv0/b;->f:[Lv0/b;

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

.method private static synthetic d()[Lv0/b;
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [Lv0/b;

    sget-object v1, Lv0/b;->e:Lv0/b;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lv0/b;
    .locals 1

    const-class v0, Lv0/b;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lv0/b;

    return-object p0
.end method

.method public static values()[Lv0/b;
    .locals 1

    sget-object v0, Lv0/b;->f:[Lv0/b;

    invoke-virtual {v0}, [Lv0/b;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lv0/b;

    return-object v0
.end method


# virtual methods
.method public execute(Ljava/lang/Runnable;)V
    .locals 0

    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "MoreExecutors.directExecutor()"

    return-object v0
.end method
