.class abstract enum Lr0/n$a;
.super Ljava/lang/Enum;
.source ""

# interfaces
.implements Lq0/d;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x440a
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lr0/n$a;",
        ">;",
        "Lq0/d<",
        "Ljava/util/Map$Entry<",
        "**>;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lr0/n$a;

.field public static final enum f:Lr0/n$a;

.field private static final synthetic g:[Lr0/n$a;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr0/n$a$a;

    const-string v1, "KEY"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr0/n$a$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr0/n$a;->e:Lr0/n$a;

    new-instance v0, Lr0/n$a$b;

    const-string v1, "VALUE"

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2}, Lr0/n$a$b;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lr0/n$a;->f:Lr0/n$a;

    invoke-static {}, Lr0/n$a;->g()[Lr0/n$a;

    move-result-object v0

    sput-object v0, Lr0/n$a;->g:[Lr0/n$a;

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

.method synthetic constructor <init>(Ljava/lang/String;ILr0/m;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lr0/n$a;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method private static synthetic g()[Lr0/n$a;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lr0/n$a;

    sget-object v1, Lr0/n$a;->e:Lr0/n$a;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    sget-object v1, Lr0/n$a;->f:Lr0/n$a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lr0/n$a;
    .locals 1

    const-class v0, Lr0/n$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lr0/n$a;

    return-object p0
.end method

.method public static values()[Lr0/n$a;
    .locals 1

    sget-object v0, Lr0/n$a;->g:[Lr0/n$a;

    invoke-virtual {v0}, [Lr0/n$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lr0/n$a;

    return-object v0
.end method
