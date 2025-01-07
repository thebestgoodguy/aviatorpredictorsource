.class public Li1/f;
.super Li1/q;
.source ""


# direct methods
.method constructor <init>(Ll1/r;Lx1/x;)V
    .locals 1

    sget-object v0, Li1/q$b;->l:Li1/q$b;

    invoke-direct {p0, p1, v0, p2}, Li1/q;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    return-void
.end method


# virtual methods
.method public e(Ll1/i;)Z
    .locals 1

    invoke-virtual {p0}, Li1/q;->g()Ll1/r;

    move-result-object v0

    invoke-interface {p1, v0}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object p1

    invoke-static {p1}, Ll1/y;->t(Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-virtual {p0}, Li1/q;->i()Lx1/x;

    move-result-object v0

    invoke-static {p1, v0}, Ll1/y;->p(Lx1/b;Lx1/x;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method
