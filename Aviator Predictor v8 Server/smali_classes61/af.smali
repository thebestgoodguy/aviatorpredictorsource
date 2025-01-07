.class public final Laf;
.super Ljava/lang/Object;


# instance fields
.field a:[Ljava/lang/Object;

.field b:I

.field c:Lae;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    new-array v0, v0, [Ljava/lang/Object;

    iput-object v0, p0, Laf;->a:[Ljava/lang/Object;

    const/4 v0, 0x0

    iput v0, p0, Laf;->b:I

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;)Laf;
    .locals 4

    iget v0, p0, Laf;->b:I

    add-int/lit8 v0, v0, 0x1

    add-int/2addr v0, v0

    iget-object v1, p0, Laf;->a:[Ljava/lang/Object;

    array-length v2, v1

    if-le v0, v2, :cond_2

    shr-int/lit8 v3, v2, 0x1

    add-int/2addr v2, v3

    add-int/lit8 v2, v2, 0x1

    if-ge v2, v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    add-int v2, v0, v0

    :cond_0
    if-gez v2, :cond_1

    const v2, 0x7fffffff

    :cond_1
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    iput-object v0, p0, Laf;->a:[Ljava/lang/Object;

    :cond_2
    invoke-static {p1, p2}, Ly;->a(Ljava/lang/Object;Ljava/lang/Object;)V

    iget-object v0, p0, Laf;->a:[Ljava/lang/Object;

    iget v1, p0, Laf;->b:I

    add-int v2, v1, v1

    aput-object p1, v0, v2

    add-int/lit8 v2, v2, 0x1

    aput-object p2, v0, v2

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Laf;->b:I

    return-object p0
.end method

.method public final a()Lag;
    .locals 2

    iget-object v0, p0, Laf;->c:Lae;

    if-nez v0, :cond_1

    iget v0, p0, Laf;->b:I

    iget-object v1, p0, Laf;->a:[Ljava/lang/Object;

    invoke-static {v0, v1, p0}, Lg;->a(I[Ljava/lang/Object;Laf;)Lg;

    move-result-object v0

    iget-object v1, p0, Laf;->c:Lae;

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    invoke-virtual {v1}, Lae;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0

    :cond_1
    invoke-virtual {v0}, Lae;->a()Ljava/lang/IllegalArgumentException;

    move-result-object v0

    throw v0
.end method
