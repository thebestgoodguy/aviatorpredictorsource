.class public final enum Li1/w0$a;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/w0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Li1/w0$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum f:Li1/w0$a;

.field public static final enum g:Li1/w0$a;

.field private static final synthetic h:[Li1/w0$a;


# instance fields
.field private final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Li1/w0$a;

    const-string v1, "ASCENDING"

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-direct {v0, v1, v2, v3}, Li1/w0$a;-><init>(Ljava/lang/String;II)V

    sput-object v0, Li1/w0$a;->f:Li1/w0$a;

    new-instance v1, Li1/w0$a;

    const-string v4, "DESCENDING"

    const/4 v5, -0x1

    invoke-direct {v1, v4, v3, v5}, Li1/w0$a;-><init>(Ljava/lang/String;II)V

    sput-object v1, Li1/w0$a;->g:Li1/w0$a;

    const/4 v4, 0x2

    new-array v4, v4, [Li1/w0$a;

    aput-object v0, v4, v2

    aput-object v1, v4, v3

    sput-object v4, Li1/w0$a;->h:[Li1/w0$a;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Li1/w0$a;->e:I

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Li1/w0$a;
    .locals 1

    const-class v0, Li1/w0$a;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Li1/w0$a;

    return-object p0
.end method

.method public static values()[Li1/w0$a;
    .locals 1

    sget-object v0, Li1/w0$a;->h:[Li1/w0$a;

    invoke-virtual {v0}, [Li1/w0$a;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Li1/w0$a;

    return-object v0
.end method


# virtual methods
.method d()I
    .locals 1

    iget v0, p0, Li1/w0$a;->e:I

    return v0
.end method
