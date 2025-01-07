.class Li1/t0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lo1/n0$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li1/t0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "b"
.end annotation


# instance fields
.field final synthetic a:Li1/t0;


# direct methods
.method private constructor <init>(Li1/t0;)V
    .locals 0

    iput-object p1, p0, Li1/t0$b;->a:Li1/t0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Li1/t0;Li1/t0$a;)V
    .locals 0

    invoke-direct {p0, p1}, Li1/t0$b;-><init>(Li1/t0;)V

    return-void
.end method


# virtual methods
.method public a(Li1/v0;)V
    .locals 1

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Li1/b1;->a(Li1/v0;)V

    return-void
.end method

.method public b(I)Lc1/e;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lc1/e<",
            "Ll1/l;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Li1/b1;->b(I)Lc1/e;

    move-result-object p1

    return-object p1
.end method

.method public c(ILb3/f1;)V
    .locals 1

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li1/b1;->c(ILb3/f1;)V

    return-void
.end method

.method public d(Lo1/i0;)V
    .locals 1

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Li1/b1;->d(Lo1/i0;)V

    return-void
.end method

.method public e(ILb3/f1;)V
    .locals 1

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Li1/b1;->e(ILb3/f1;)V

    return-void
.end method

.method public f(Lm1/h;)V
    .locals 1

    iget-object v0, p0, Li1/t0$b;->a:Li1/t0;

    invoke-virtual {v0}, Li1/j;->p()Li1/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Li1/b1;->f(Lm1/h;)V

    return-void
.end method
