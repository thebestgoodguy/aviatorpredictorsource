.class public final Lk1/m;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:I

.field private final b:Lc1/c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(ILc1/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lk1/m;->a:I

    iput-object p2, p0, Lk1/m;->b:Lc1/c;

    return-void
.end method

.method public static a(ILjava/util/Map;)Lk1/m;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/Map<",
            "Ll1/l;",
            "Lk1/y0;",
            ">;)",
            "Lk1/m;"
        }
    .end annotation

    invoke-static {}, Ll1/j;->a()Lc1/c;

    move-result-object v0

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll1/l;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lk1/y0;

    invoke-virtual {v1}, Lk1/y0;->a()Ll1/i;

    move-result-object v1

    invoke-virtual {v0, v2, v1}, Lc1/c;->t(Ljava/lang/Object;Ljava/lang/Object;)Lc1/c;

    move-result-object v0

    goto :goto_0

    :cond_0
    new-instance p1, Lk1/m;

    invoke-direct {p1, p0, v0}, Lk1/m;-><init>(ILc1/c;)V

    return-object p1
.end method


# virtual methods
.method public b()I
    .locals 1

    iget v0, p0, Lk1/m;->a:I

    return v0
.end method

.method public c()Lc1/c;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc1/c<",
            "Ll1/l;",
            "Ll1/i;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lk1/m;->b:Lc1/c;

    return-object v0
.end method
