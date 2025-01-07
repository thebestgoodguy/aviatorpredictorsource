.class public final Lar;
.super Ljava/lang/Object;


# direct methods
.method public static synthetic $r8$lambda$cnq-FWf0nlXFUc7QnZ5q6Boa3sI(Laq;)Ljava/util/Spliterator;
    .locals 0

    invoke-static {p0}, Lar;->a(Laq;)Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method static a(Lap;)Ljava/util/Spliterator;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "Lap<",
            "TE;>;)",
            "Ljava/util/Spliterator<",
            "TE;>;"
        }
    .end annotation

    invoke-interface {p0}, Lap;->a()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->spliterator()Ljava/util/Spliterator;

    move-result-object v0

    new-instance v1, Lar$$ExternalSyntheticLambda0;

    invoke-direct {v1}, Lar$$ExternalSyntheticLambda0;-><init>()V

    invoke-interface {v0}, Ljava/util/Spliterator;->characteristics()I

    move-result v2

    and-int/lit16 v2, v2, 0x510

    or-int/lit8 v2, v2, 0x40

    invoke-interface {p0}, Lap;->size()I

    move-result p0

    int-to-long v3, p0

    invoke-static {v0, v1, v2, v3, v4}, Lal;->a(Ljava/util/Spliterator;Ljava/util/function/Function;IJ)Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic a(Laq;)Ljava/util/Spliterator;
    .locals 1

    invoke-interface {p0}, Laq;->b()I

    move-result v0

    invoke-interface {p0}, Laq;->a()Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/util/Collections;->nCopies(ILjava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/List;->spliterator()Ljava/util/Spliterator;

    move-result-object p0

    return-object p0
.end method
