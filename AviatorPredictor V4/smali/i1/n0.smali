.class public Li1/n0;
.super Li1/q;
.source ""


# instance fields
.field private final d:Ll1/l;


# direct methods
.method constructor <init>(Ll1/r;Li1/q$b;Lx1/x;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Li1/q;-><init>(Ll1/r;Li1/q$b;Lx1/x;)V

    invoke-static {p3}, Ll1/y;->B(Lx1/x;)Z

    move-result p1

    const/4 p2, 0x0

    new-array p2, p2, [Ljava/lang/Object;

    const-string p3, "KeyFieldFilter expects a ReferenceValue"

    invoke-static {p1, p3, p2}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {p0}, Li1/q;->i()Lx1/x;

    move-result-object p1

    invoke-virtual {p1}, Lx1/x;->n0()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ll1/l;->k(Ljava/lang/String;)Ll1/l;

    move-result-object p1

    iput-object p1, p0, Li1/n0;->d:Ll1/l;

    return-void
.end method


# virtual methods
.method public e(Ll1/i;)Z
    .locals 1

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    iget-object v0, p0, Li1/n0;->d:Ll1/l;

    invoke-virtual {p1, v0}, Ll1/l;->g(Ll1/l;)I

    move-result p1

    invoke-virtual {p0, p1}, Li1/q;->k(I)Z

    move-result p1

    return p1
.end method
