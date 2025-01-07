.class public Li1/e;
.super Li1/q;
.source ""


# direct methods
.method constructor <init>(Ll1/r;Lx1/x;)V
    .locals 1

    sget-object v0, Li1/q$b;->m:Li1/q$b;

    invoke-direct {p0, p1, v0, p2}, Li1/q;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    invoke-static {p2}, Ll1/y;->t(Lx1/x;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string v0, "ArrayContainsAnyFilter expects an ArrayValue"

    invoke-static {p1, v0, p2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public e(Ll1/i;)Z
    .locals 3

    invoke-virtual {p0}, Li1/q;->g()Ll1/r;

    move-result-object v0

    invoke-interface {p1, v0}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object p1

    invoke-static {p1}, Ll1/y;->t(Lx1/x;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, Lx1/x;->f0()Lx1/a;

    move-result-object p1

    invoke-virtual {p1}, Lx1/a;->k()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx1/x;

    invoke-virtual {p0}, Li1/q;->i()Lx1/x;

    move-result-object v2

    invoke-virtual {v2}, Lx1/x;->f0()Lx1/a;

    move-result-object v2

    invoke-static {v2, v0}, Ll1/y;->p(Lx1/b;Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method
