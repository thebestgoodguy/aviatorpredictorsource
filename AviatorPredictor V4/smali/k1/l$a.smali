.class public final enum Lk1/l$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk1/l$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lk1/l$a;

.field public static final enum f:Lk1/l$a;

.field public static final enum g:Lk1/l$a;

.field private static final synthetic h:[Lk1/l$a;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lk1/l$a;

    const-string v1, "NONE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk1/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/l$a;->e:Lk1/l$a;

    new-instance v1, Lk1/l$a;

    const-string v3, "PARTIAL"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk1/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk1/l$a;->f:Lk1/l$a;

    new-instance v3, Lk1/l$a;

    const-string v5, "FULL"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk1/l$a;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk1/l$a;->g:Lk1/l$a;

    const/4 v5, 0x3

    new-array v5, v5, [Lk1/l$a;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lk1/l$a;->h:[Lk1/l$a;

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

.method public static valueOf(Ljava/lang/String;)Lk1/l$a;
    .locals 1

    const-class v0, Lk1/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk1/l$a;

    return-object p0
.end method

.method public static values()[Lk1/l$a;
    .locals 1

    sget-object v0, Lk1/l$a;->h:[Lk1/l$a;

    invoke-virtual {v0}, [Lk1/l$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk1/l$a;

    return-object v0
.end method
