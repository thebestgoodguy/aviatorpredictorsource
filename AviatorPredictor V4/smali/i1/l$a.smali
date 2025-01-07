.class public final enum Li1/l$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/l$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Li1/l$a;

.field public static final enum g:Li1/l$a;

.field private static final synthetic h:[Li1/l$a;


# instance fields
.field private final e:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Li1/l$a;

    const-string v1, "AND"

    const/4 v2, 0x0

    const-string v3, "and"

    invoke-direct {v0, v1, v2, v3}, Li1/l$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Li1/l$a;->f:Li1/l$a;

    new-instance v1, Li1/l$a;

    const-string v3, "OR"

    const/4 v4, 0x1

    const-string v5, "or"

    invoke-direct {v1, v3, v4, v5}, Li1/l$a;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Li1/l$a;->g:Li1/l$a;

    const/4 v3, 0x2

    new-array v3, v3, [Li1/l$a;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Li1/l$a;->h:[Li1/l$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Li1/l$a;->e:Ljava/lang/String;

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li1/l$a;
    .locals 1

    const-class v0, Li1/l$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/l$a;

    return-object p0
.end method

.method public static values()[Li1/l$a;
    .locals 1

    sget-object v0, Li1/l$a;->h:[Li1/l$a;

    invoke-virtual {v0}, [Li1/l$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/l$a;

    return-object v0
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Li1/l$a;->e:Ljava/lang/String;

    return-object v0
.end method
