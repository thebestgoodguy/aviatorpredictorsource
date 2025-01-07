.class Lk1/e;
.super Ljava/lang/Object;
.source ""


# static fields
.field static final c:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lk1/e;",
            ">;"
        }
    .end annotation
.end field

.field static final d:Ljava/util/Comparator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Comparator<",
            "Lk1/e;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Ll1/l;

.field private final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lk1/d;->e:Lk1/d;

    sput-object v0, Lk1/e;->c:Ljava/util/Comparator;

    sget-object v0, Lk1/c;->e:Lk1/c;

    sput-object v0, Lk1/e;->d:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(Ll1/l;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk1/e;->a:Ll1/l;

    iput p2, p0, Lk1/e;->b:I

    return-void
.end method

.method public static synthetic a(Lk1/e;Lk1/e;)I
    .locals 0

    invoke-static {p0, p1}, Lk1/e;->f(Lk1/e;Lk1/e;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lk1/e;Lk1/e;)I
    .locals 0

    invoke-static {p0, p1}, Lk1/e;->e(Lk1/e;Lk1/e;)I

    move-result p0

    return p0
.end method

.method private static synthetic e(Lk1/e;Lk1/e;)I
    .locals 2

    iget-object v0, p0, Lk1/e;->a:Ll1/l;

    iget-object v1, p1, Lk1/e;->a:Ll1/l;

    invoke-virtual {v0, v1}, Ll1/l;->g(Ll1/l;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget p0, p0, Lk1/e;->b:I

    iget p1, p1, Lk1/e;->b:I

    invoke-static {p0, p1}, Lp1/g0;->k(II)I

    move-result p0

    return p0
.end method

.method private static synthetic f(Lk1/e;Lk1/e;)I
    .locals 2

    iget v0, p0, Lk1/e;->b:I

    iget v1, p1, Lk1/e;->b:I

    invoke-static {v0, v1}, Lp1/g0;->k(II)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    :cond_0
    iget-object p0, p0, Lk1/e;->a:Ll1/l;

    iget-object p1, p1, Lk1/e;->a:Ll1/l;

    invoke-virtual {p0, p1}, Ll1/l;->g(Ll1/l;)I

    move-result p0

    return p0
.end method


# virtual methods
.method c()I
    .locals 1

    iget v0, p0, Lk1/e;->b:I

    return v0
.end method

.method d()Ll1/l;
    .locals 1

    iget-object v0, p0, Lk1/e;->a:Ll1/l;

    return-object v0
.end method
