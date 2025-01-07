.class public final Lm1/i;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/w;

.field private final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll1/w;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/w;",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lp1/x;->b(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/w;

    iput-object p1, p0, Lm1/i;->a:Ll1/w;

    iput-object p2, p0, Lm1/i;->b:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/i;->b:Ljava/util/List;

    return-object v0
.end method

.method public b()Ll1/w;
    .locals 1

    iget-object v0, p0, Lm1/i;->a:Ll1/w;

    return-object v0
.end method
