.class public final synthetic Ll1/h;
.super Ljava/lang/Object;
.source ""


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Ll1/i;->a:Ljava/util/Comparator;

    return-void
.end method

.method public static synthetic a(Ll1/i;Ll1/i;)I
    .locals 0

    .line 1
    invoke-static {p0, p1}, Ll1/h;->b(Ll1/i;Ll1/i;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Ll1/i;Ll1/i;)I
    .locals 0

    .line 1
    invoke-interface {p0}, Ll1/i;->getKey()Ll1/l;

    move-result-object p0

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll1/l;->g(Ll1/l;)I

    move-result p0

    return p0
.end method
