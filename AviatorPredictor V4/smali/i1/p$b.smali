.class Li1/p$b;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/p;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "b"
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Li1/y0;",
            ">;"
        }
    .end annotation
.end field

.field private b:Li1/u1;

.field private c:I


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Li1/p$b;->a:Ljava/util/List;

    return-void
.end method

.method static synthetic a(Li1/p$b;)Ljava/util/List;
    .locals 0

    iget-object p0, p0, Li1/p$b;->a:Ljava/util/List;

    return-object p0
.end method

.method static synthetic b(Li1/p$b;)Li1/u1;
    .locals 0

    iget-object p0, p0, Li1/p$b;->b:Li1/u1;

    return-object p0
.end method

.method static synthetic c(Li1/p$b;Li1/u1;)Li1/u1;
    .locals 0

    iput-object p1, p0, Li1/p$b;->b:Li1/u1;

    return-object p1
.end method

.method static synthetic d(Li1/p$b;)I
    .locals 0

    iget p0, p0, Li1/p$b;->c:I

    return p0
.end method

.method static synthetic e(Li1/p$b;I)I
    .locals 0

    iput p1, p0, Li1/p$b;->c:I

    return p1
.end method
