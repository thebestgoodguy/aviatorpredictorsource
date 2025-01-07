.class Lk1/q0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lk1/l;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lk1/q0$a;
    }
.end annotation


# instance fields
.field private final a:Lk1/q0$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lk1/q0$a;

    invoke-direct {v0}, Lk1/q0$a;-><init>()V

    iput-object v0, p0, Lk1/q0;->a:Lk1/q0$a;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 0

    return-void
.end method

.method public b(Ljava/lang/String;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ll1/u;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/q0;->a:Lk1/q0$a;

    invoke-virtual {v0, p1}, Lk1/q0$a;->b(Ljava/lang/String;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public c(Ljava/lang/String;)Ll1/q$a;
    .locals 0

    sget-object p1, Ll1/q$a;->e:Ll1/q$a;

    return-object p1
.end method

.method public d(Li1/c1;)Ll1/q$a;
    .locals 0

    sget-object p1, Ll1/q$a;->e:Ll1/q$a;

    return-object p1
.end method

.method public e(Li1/c1;)Lk1/l$a;
    .locals 0

    sget-object p1, Lk1/l$a;->e:Lk1/l$a;

    return-object p1
.end method

.method public f(Lc1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;)V"
        }
    .end annotation

    return-void
.end method

.method public g(Li1/c1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li1/c1;",
            ")",
            "Ljava/util/List<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public h(Ljava/lang/String;Ll1/q$a;)V
    .locals 0

    return-void
.end method

.method public i()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public j(Ll1/u;)V
    .locals 1

    iget-object v0, p0, Lk1/q0;->a:Lk1/q0$a;

    invoke-virtual {v0, p1}, Lk1/q0$a;->a(Ll1/u;)Z

    return-void
.end method
