.class Lo1/n0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/v0$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo1/n0;-><init>(Lo1/n0$c;Lk1/f0;Lo1/m;Lp1/g;Lo1/k;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo1/n0;


# direct methods
.method constructor <init>(Lo1/n0;)V
    .locals 0

    iput-object p1, p0, Lo1/n0$b;->a:Lo1/n0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lo1/n0$b;->a:Lo1/n0;

    invoke-static {v0}, Lo1/n0;->h(Lo1/n0;)Lo1/v0;

    move-result-object v0

    invoke-virtual {v0}, Lo1/v0;->C()V

    return-void
.end method

.method public b(Lb3/f1;)V
    .locals 1

    iget-object v0, p0, Lo1/n0$b;->a:Lo1/n0;

    invoke-static {v0, p1}, Lo1/n0;->k(Lo1/n0;Lb3/f1;)V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lo1/n0$b;->a:Lo1/n0;

    invoke-static {v0}, Lo1/n0;->i(Lo1/n0;)V

    return-void
.end method

.method public d(Ll1/w;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/w;",
            "Ljava/util/List<",
            "Lm1/i;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lo1/n0$b;->a:Lo1/n0;

    invoke-static {v0, p1, p2}, Lo1/n0;->j(Lo1/n0;Ll1/w;Ljava/util/List;)V

    return-void
.end method
