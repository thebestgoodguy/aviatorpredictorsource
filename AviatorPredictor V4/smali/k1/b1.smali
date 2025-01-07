.class public final enum Lk1/b1;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lk1/b1;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Lk1/b1;

.field public static final enum f:Lk1/b1;

.field public static final enum g:Lk1/b1;

.field private static final synthetic h:[Lk1/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lk1/b1;

    const-string v1, "LISTEN"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lk1/b1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lk1/b1;->e:Lk1/b1;

    new-instance v1, Lk1/b1;

    const-string v3, "EXISTENCE_FILTER_MISMATCH"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lk1/b1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lk1/b1;->f:Lk1/b1;

    new-instance v3, Lk1/b1;

    const-string v5, "LIMBO_RESOLUTION"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lk1/b1;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lk1/b1;->g:Lk1/b1;

    const/4 v5, 0x3

    new-array v5, v5, [Lk1/b1;

    aput-object v0, v5, v2

    aput-object v1, v5, v4

    aput-object v3, v5, v6

    sput-object v5, Lk1/b1;->h:[Lk1/b1;

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

.method public static valueOf(Ljava/lang/String;)Lk1/b1;
    .locals 1

    const-class v0, Lk1/b1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lk1/b1;

    return-object p0
.end method

.method public static values()[Lk1/b1;
    .locals 1

    sget-object v0, Lk1/b1;->h:[Lk1/b1;

    invoke-virtual {v0}, [Lk1/b1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lk1/b1;

    return-object v0
.end method
