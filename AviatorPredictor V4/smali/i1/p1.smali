.class public Li1/p1;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/t;

.field private final b:Lm1/d;

.field private final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lm1/e;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ll1/t;Lm1/d;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/t;",
            "Lm1/d;",
            "Ljava/util/List<",
            "Lm1/e;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/p1;->a:Ll1/t;

    iput-object p2, p0, Li1/p1;->b:Lm1/d;

    iput-object p3, p0, Li1/p1;->c:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a(Ll1/l;Lm1/m;)Lm1/f;
    .locals 7

    new-instance v6, Lm1/l;

    iget-object v2, p0, Li1/p1;->a:Ll1/t;

    iget-object v3, p0, Li1/p1;->b:Lm1/d;

    iget-object v5, p0, Li1/p1;->c:Ljava/util/List;

    move-object v0, v6

    move-object v1, p1

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lm1/l;-><init>(Ll1/l;Ll1/t;Lm1/d;Lm1/m;Ljava/util/List;)V

    return-object v6
.end method
