.class final Ld;
.super Lah;


# instance fields
.field private final transient a:Lag;

.field private final transient b:[Ljava/lang/Object;

.field private final transient c:I


# direct methods
.method constructor <init>(Lag;[Ljava/lang/Object;II)V
    .locals 0

    invoke-direct {p0}, Lah;-><init>()V

    iput-object p1, p0, Ld;->a:Lag;

    iput-object p2, p0, Ld;->b:[Ljava/lang/Object;

    iput p4, p0, Ld;->c:I

    return-void
.end method

.method static synthetic a(Ld;)I
    .locals 0

    iget p0, p0, Ld;->c:I

    return p0
.end method

.method static synthetic b(Ld;)[Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Ld;->b:[Ljava/lang/Object;

    return-object p0
.end method


# virtual methods
.method final a([Ljava/lang/Object;I)I
    .locals 1

    invoke-virtual {p0}, Laa;->f()Lad;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, p1, v0}, Laa;->a([Ljava/lang/Object;I)I

    move-result p1

    return p1
.end method

.method public final contains(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation runtime Ljavax/annotation/CheckForNull;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/util/Map$Entry;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object v2, p0, Ld;->a:Lag;

    invoke-virtual {v2, v0}, Lag;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method final d()Lad;
    .locals 1

    new-instance v0, Lc;

    invoke-direct {v0, p0}, Lc;-><init>(Ld;)V

    return-object v0
.end method

.method public final e()Li;
    .locals 2

    invoke-virtual {p0}, Laa;->f()Lad;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lad;->a(I)Lj;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic iterator()Ljava/util/Iterator;
    .locals 2

    invoke-virtual {p0}, Laa;->f()Lad;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lad;->a(I)Lj;

    move-result-object v0

    return-object v0
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Ld;->c:I

    return v0
.end method
