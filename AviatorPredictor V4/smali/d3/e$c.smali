.class final enum Ld3/e$c;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401a
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Ld3/e$c;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum e:Ld3/e$c;

.field public static final enum f:Ld3/e$c;

.field private static final synthetic g:[Ld3/e$c;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ld3/e$c;

    const-string v1, "TLS"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Ld3/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v0, Ld3/e$c;->e:Ld3/e$c;

    new-instance v1, Ld3/e$c;

    const-string v3, "PLAINTEXT"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Ld3/e$c;-><init>(Ljava/lang/String;I)V

    sput-object v1, Ld3/e$c;->f:Ld3/e$c;

    const/4 v3, 0x2

    new-array v3, v3, [Ld3/e$c;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Ld3/e$c;->g:[Ld3/e$c;

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

.method public static valueOf(Ljava/lang/String;)Ld3/e$c;
    .locals 1

    const-class v0, Ld3/e$c;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Ld3/e$c;

    return-object p0
.end method

.method public static values()[Ld3/e$c;
    .locals 1

    sget-object v0, Ld3/e$c;->g:[Ld3/e$c;

    invoke-virtual {v0}, [Ld3/e$c;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ld3/e$c;

    return-object v0
.end method
