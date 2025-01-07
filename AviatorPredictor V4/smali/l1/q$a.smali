.class public abstract Ll1/q$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation build Lcom/google/auto/value/AutoValue;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll1/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Ll1/q$a;",
        ">;"
    }
.end annotation


# static fields
.field public static final e:Ll1/q$a;

.field public static final f:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Ll1/s;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    sget-object v0, Ll1/w;->f:Ll1/w;

    invoke-static {}, Ll1/l;->h()Ll1/l;

    move-result-object v1

    const/4 v2, -0x1

    invoke-static {v0, v1, v2}, Ll1/q$a;->h(Ll1/w;Ll1/l;I)Ll1/q$a;

    move-result-object v0

    sput-object v0, Ll1/q$a;->e:Ll1/q$a;

    sget-object v0, Ll1/p;->e:Ll1/p;

    sput-object v0, Ll1/q$a;->f:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic d(Ll1/s;Ll1/s;)I
    .locals 0

    invoke-static {p0, p1}, Ll1/q$a;->r(Ll1/s;Ll1/s;)I

    move-result p0

    return p0
.end method

.method public static h(Ll1/w;Ll1/l;I)Ll1/q$a;
    .locals 1

    new-instance v0, Ll1/b;

    invoke-direct {v0, p0, p1, p2}, Ll1/b;-><init>(Ll1/w;Ll1/l;I)V

    return-object v0
.end method

.method public static i(Ll1/w;I)Ll1/q$a;
    .locals 8

    invoke-virtual {p0}, Ll1/w;->g()Lx0/o;

    move-result-object v0

    invoke-virtual {v0}, Lx0/o;->i()J

    move-result-wide v0

    invoke-virtual {p0}, Ll1/w;->g()Lx0/o;

    move-result-object p0

    invoke-virtual {p0}, Lx0/o;->g()I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    new-instance v2, Ll1/w;

    int-to-double v3, p0

    const-wide v5, 0x41cdcd6500000000L    # 1.0E9

    cmpl-double v7, v3, v5

    if-nez v7, :cond_0

    new-instance p0, Lx0/o;

    const-wide/16 v3, 0x1

    add-long/2addr v0, v3

    const/4 v3, 0x0

    invoke-direct {p0, v0, v1, v3}, Lx0/o;-><init>(JI)V

    goto :goto_0

    :cond_0
    new-instance v3, Lx0/o;

    invoke-direct {v3, v0, v1, p0}, Lx0/o;-><init>(JI)V

    move-object p0, v3

    :goto_0
    invoke-direct {v2, p0}, Ll1/w;-><init>(Lx0/o;)V

    invoke-static {}, Ll1/l;->h()Ll1/l;

    move-result-object p0

    invoke-static {v2, p0, p1}, Ll1/q$a;->h(Ll1/w;Ll1/l;I)Ll1/q$a;

    move-result-object p0

    return-object p0
.end method

.method public static k(Ll1/i;)Ll1/q$a;
    .locals 2

    invoke-interface {p0}, Ll1/i;->d()Ll1/w;

    move-result-object v0

    invoke-interface {p0}, Ll1/i;->getKey()Ll1/l;

    move-result-object p0

    const/4 v1, -0x1

    invoke-static {v0, p0, v1}, Ll1/q$a;->h(Ll1/w;Ll1/l;I)Ll1/q$a;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic r(Ll1/s;Ll1/s;)I
    .locals 0

    invoke-static {p0}, Ll1/q$a;->k(Ll1/i;)Ll1/q$a;

    move-result-object p0

    invoke-static {p1}, Ll1/q$a;->k(Ll1/i;)Ll1/q$a;

    move-result-object p1

    invoke-virtual {p0, p1}, Ll1/q$a;->g(Ll1/q$a;)I

    move-result p0

    return p0
.end method


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Ll1/q$a;

    invoke-virtual {p0, p1}, Ll1/q$a;->g(Ll1/q$a;)I

    move-result p1

    return p1
.end method

.method public g(Ll1/q$a;)I
    .locals 2

    invoke-virtual {p0}, Ll1/q$a;->q()Ll1/w;

    move-result-object v0

    invoke-virtual {p1}, Ll1/q$a;->q()Ll1/w;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/w;->d(Ll1/w;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    invoke-virtual {p0}, Ll1/q$a;->n()Ll1/l;

    move-result-object v0

    invoke-virtual {p1}, Ll1/q$a;->n()Ll1/l;

    move-result-object v1

    invoke-virtual {v0, v1}, Ll1/l;->g(Ll1/l;)I

    move-result v0

    if-eqz v0, :cond_1

    return v0

    :cond_1
    invoke-virtual {p0}, Ll1/q$a;->p()I

    move-result v0

    invoke-virtual {p1}, Ll1/q$a;->p()I

    move-result p1

    invoke-static {v0, p1}, Ljava/lang/Integer;->compare(II)I

    move-result p1

    return p1
.end method

.method public abstract n()Ll1/l;
.end method

.method public abstract p()I
.end method

.method public abstract q()Ll1/w;
.end method
