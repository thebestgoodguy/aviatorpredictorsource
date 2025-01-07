.class public Li1/p0;
.super Li1/q;
.source ""


# instance fields
.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ll1/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ll1/r;Lx1/x;)V
    .locals 1

    sget-object v0, Li1/q$b;->o:Li1/q$b;

    invoke-direct {p0, p1, v0, p2}, Li1/q;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Li1/p0;->d:Ljava/util/List;

    invoke-static {v0, p2}, Li1/o0;->l(Li1/q$b;Lx1/x;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    return-void
.end method


# virtual methods
.method public e(Ll1/i;)Z
    .locals 1

    iget-object v0, p0, Li1/p0;->d:Ljava/util/List;

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method
