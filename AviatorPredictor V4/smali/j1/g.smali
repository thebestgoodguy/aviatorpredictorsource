.class public Lj1/g;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final c:[[B


# instance fields
.field private a:[B

.field private b:I


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [[B

    const/4 v1, 0x2

    new-array v2, v1, [B

    fill-array-data v2, :array_0

    const/4 v3, 0x0

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    const/4 v3, 0x1

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_2

    aput-object v2, v0, v1

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    const/4 v3, 0x3

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_4

    const/4 v3, 0x4

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_5

    const/4 v3, 0x5

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_6

    const/4 v3, 0x6

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_7

    const/4 v3, 0x7

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_8

    const/16 v3, 0x8

    aput-object v2, v0, v3

    new-array v2, v1, [B

    fill-array-data v2, :array_9

    const/16 v3, 0x9

    aput-object v2, v0, v3

    new-array v1, v1, [B

    fill-array-data v1, :array_a

    const/16 v2, 0xa

    aput-object v1, v0, v2

    sput-object v0, Lj1/g;->c:[[B

    return-void

    :array_0
    .array-data 1
        0x0t
        0x0t
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x80t
        0x0t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x40t
        0x0t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x20t
        0x0t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x10t
        0x0t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x8t
        0x0t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x4t
        0x0t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x2t
        0x0t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x1t
        0x0t
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x1t
        -0x80t
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x1t
        -0x40t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lj1/g;->b:I

    const/16 v0, 0x400

    new-array v0, v0, [B

    iput-object v0, p0, Lj1/g;->a:[B

    return-void
.end method

.method private b(I)V
    .locals 2

    iget v0, p0, Lj1/g;->b:I

    add-int/2addr p1, v0

    iget-object v0, p0, Lj1/g;->a:[B

    array-length v1, v0

    if-gt p1, v1, :cond_0

    return-void

    :cond_0
    array-length v1, v0

    mul-int/lit8 v1, v1, 0x2

    if-ge v1, p1, :cond_1

    goto :goto_0

    :cond_1
    move p1, v1

    :goto_0
    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    iput-object p1, p0, Lj1/g;->a:[B

    return-void
.end method

.method private d(J)I
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    not-long p1, p1

    :cond_0
    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x40

    add-int/lit8 p1, p1, 0x1

    const/4 p2, 0x7

    sget-object v0, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    invoke-static {p1, p2, v0}, Lj1/f;->a(IILjava/math/RoundingMode;)I

    move-result p1

    return p1
.end method

.method private e(J)I
    .locals 1

    invoke-static {p1, p2}, Ljava/lang/Long;->numberOfLeadingZeros(J)I

    move-result p1

    rsub-int/lit8 p1, p1, 0x40

    sget-object p2, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    const/16 v0, 0x8

    invoke-static {p1, v0, p2}, Lj1/f;->a(IILjava/math/RoundingMode;)I

    move-result p1

    return p1
.end method

.method private f(B)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    invoke-direct {p0, v1}, Lj1/g;->l(B)V

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    invoke-direct {p0, v1}, Lj1/g;->l(B)V

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lj1/g;->l(B)V

    :goto_0
    return-void
.end method

.method private g(B)V
    .locals 2

    const/4 v0, 0x0

    const/4 v1, -0x1

    if-nez p1, :cond_0

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    invoke-direct {p0, v1}, Lj1/g;->m(B)V

    goto :goto_0

    :cond_0
    if-ne p1, v1, :cond_1

    invoke-direct {p0, v1}, Lj1/g;->m(B)V

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lj1/g;->m(B)V

    :goto_0
    return-void
.end method

.method private l(B)V
    .locals 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj1/g;->b(I)V

    iget-object v0, p0, Lj1/g;->a:[B

    iget v1, p0, Lj1/g;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj1/g;->b:I

    aput-byte p1, v0, v1

    return-void
.end method

.method private m(B)V
    .locals 3

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj1/g;->b(I)V

    iget-object v0, p0, Lj1/g;->a:[B

    iget v1, p0, Lj1/g;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj1/g;->b:I

    not-int p1, p1

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method private p()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    return-void
.end method

.method private q()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    return-void
.end method


# virtual methods
.method public a()[B
    .locals 2

    iget-object v0, p0, Lj1/g;->a:[B

    iget v1, p0, Lj1/g;->b:I

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0
.end method

.method public c([B)V
    .locals 6

    array-length v0, p1

    invoke-direct {p0, v0}, Lj1/g;->b(I)V

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-byte v2, p1, v1

    iget-object v3, p0, Lj1/g;->a:[B

    iget v4, p0, Lj1/g;->b:I

    add-int/lit8 v5, v4, 0x1

    iput v5, p0, Lj1/g;->b:I

    aput-byte v2, v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public h(Lcom/google/protobuf/j;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lcom/google/protobuf/j;->r(I)B

    move-result v1

    invoke-direct {p0, v1}, Lj1/g;->f(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj1/g;->p()V

    return-void
.end method

.method public i(Lcom/google/protobuf/j;)V
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p1, v0}, Lcom/google/protobuf/j;->r(I)B

    move-result v1

    invoke-direct {p0, v1}, Lj1/g;->g(B)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lj1/g;->q()V

    return-void
.end method

.method public j(D)V
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    :goto_0
    xor-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lj1/g;->t(J)V

    return-void
.end method

.method public k(D)V
    .locals 3

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p1

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    const-wide/16 v0, -0x1

    goto :goto_0

    :cond_0
    const-wide/high16 v0, -0x8000000000000000L

    :goto_0
    xor-long/2addr p1, v0

    invoke-virtual {p0, p1, p2}, Lj1/g;->u(J)V

    return-void
.end method

.method public n()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    invoke-direct {p0, v0}, Lj1/g;->l(B)V

    return-void
.end method

.method public o()V
    .locals 1

    const/4 v0, -0x1

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    invoke-direct {p0, v0}, Lj1/g;->m(B)V

    return-void
.end method

.method public r(J)V
    .locals 9

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    not-long v0, p1

    goto :goto_0

    :cond_0
    move-wide v0, p1

    :goto_0
    const-wide/16 v3, 0x40

    const/4 v5, 0x0

    const/4 v6, 0x1

    cmp-long v7, v0, v3

    if-gez v7, :cond_1

    invoke-direct {p0, v6}, Lj1/g;->b(I)V

    iget-object v0, p0, Lj1/g;->a:[B

    iget v1, p0, Lj1/g;->b:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lj1/g;->b:I

    sget-object v2, Lj1/g;->c:[[B

    aget-object v2, v2, v6

    aget-byte v2, v2, v5

    int-to-long v2, v2

    xor-long/2addr p1, v2

    long-to-int p2, p1

    int-to-byte p1, p2

    aput-byte p1, v0, v1

    return-void

    :cond_1
    invoke-direct {p0, v0, v1}, Lj1/g;->d(J)I

    move-result v0

    invoke-direct {p0, v0}, Lj1/g;->b(I)V

    const/4 v1, 0x2

    if-lt v0, v1, :cond_6

    if-gez v2, :cond_2

    const/4 v1, -0x1

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :goto_1
    iget v2, p0, Lj1/g;->b:I

    const/16 v3, 0xa

    if-ne v0, v3, :cond_3

    add-int/lit8 v3, v2, 0x2

    iget-object v4, p0, Lj1/g;->a:[B

    aput-byte v1, v4, v2

    add-int/lit8 v7, v2, 0x1

    aput-byte v1, v4, v7

    goto :goto_2

    :cond_3
    const/16 v3, 0x9

    if-ne v0, v3, :cond_4

    add-int/lit8 v3, v2, 0x1

    iget-object v4, p0, Lj1/g;->a:[B

    aput-byte v1, v4, v2

    goto :goto_2

    :cond_4
    move v3, v2

    :goto_2
    add-int/lit8 v1, v0, -0x1

    add-int/2addr v1, v2

    :goto_3
    if-lt v1, v3, :cond_5

    iget-object v2, p0, Lj1/g;->a:[B

    const-wide/16 v7, 0xff

    and-long/2addr v7, p1

    long-to-int v4, v7

    int-to-byte v4, v4

    aput-byte v4, v2, v1

    const/16 v2, 0x8

    shr-long/2addr p1, v2

    add-int/lit8 v1, v1, -0x1

    goto :goto_3

    :cond_5
    iget-object p1, p0, Lj1/g;->a:[B

    iget p2, p0, Lj1/g;->b:I

    aget-byte v1, p1, p2

    sget-object v2, Lj1/g;->c:[[B

    aget-object v3, v2, v0

    aget-byte v3, v3, v5

    xor-int/2addr v1, v3

    int-to-byte v1, v1

    aput-byte v1, p1, p2

    add-int/lit8 v1, p2, 0x1

    aget-byte v3, p1, v1

    aget-object v2, v2, v0

    aget-byte v2, v2, v6

    xor-int/2addr v2, v3

    int-to-byte v2, v2

    aput-byte v2, p1, v1

    add-int/2addr p2, v0

    iput p2, p0, Lj1/g;->b:I

    return-void

    :cond_6
    new-instance p1, Ljava/lang/AssertionError;

    new-array p2, v6, [Ljava/lang/Object;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    aput-object v0, p2, v5

    const-string v0, "Invalid length (%d) returned by signedNumLength"

    invoke-static {v0, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw p1
.end method

.method public s(J)V
    .locals 0

    not-long p1, p1

    invoke-virtual {p0, p1, p2}, Lj1/g;->r(J)V

    return-void
.end method

.method public t(J)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lj1/g;->e(J)I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-direct {p0, v1}, Lj1/g;->b(I)V

    iget-object v1, p0, Lj1/g;->a:[B

    iget v2, p0, Lj1/g;->b:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lj1/g;->b:I

    int-to-byte v4, v0

    aput-byte v4, v1, v2

    add-int/2addr v3, v0

    add-int/lit8 v3, v3, -0x1

    :goto_0
    iget v1, p0, Lj1/g;->b:I

    if-lt v3, v1, :cond_0

    iget-object v1, p0, Lj1/g;->a:[B

    const-wide/16 v4, 0xff

    and-long/2addr v4, p1

    long-to-int v2, v4

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    const/16 v1, 0x8

    ushr-long/2addr p1, v1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    add-int/2addr v1, v0

    iput v1, p0, Lj1/g;->b:I

    return-void
.end method

.method public u(J)V
    .locals 6

    invoke-direct {p0, p1, p2}, Lj1/g;->e(J)I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-direct {p0, v1}, Lj1/g;->b(I)V

    iget-object v1, p0, Lj1/g;->a:[B

    iget v2, p0, Lj1/g;->b:I

    add-int/lit8 v3, v2, 0x1

    iput v3, p0, Lj1/g;->b:I

    not-int v4, v0

    int-to-byte v4, v4

    aput-byte v4, v1, v2

    add-int/2addr v3, v0

    add-int/lit8 v3, v3, -0x1

    :goto_0
    iget v1, p0, Lj1/g;->b:I

    if-lt v3, v1, :cond_0

    iget-object v1, p0, Lj1/g;->a:[B

    const-wide/16 v4, 0xff

    and-long/2addr v4, p1

    not-long v4, v4

    long-to-int v2, v4

    int-to-byte v2, v2

    aput-byte v2, v1, v3

    const/16 v1, 0x8

    ushr-long/2addr p1, v1

    add-int/lit8 v3, v3, -0x1

    goto :goto_0

    :cond_0
    add-int/2addr v1, v0

    iput v1, p0, Lj1/g;->b:I

    return-void
.end method

.method public v(Ljava/lang/CharSequence;)V
    .locals 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_0

    goto :goto_3

    :cond_0
    const/16 v4, 0x800

    if-ge v2, v4, :cond_1

    ushr-int/lit8 v4, v2, 0x6

    or-int/lit16 v4, v4, 0x3c0

    :goto_1
    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->f(B)V

    goto :goto_2

    :cond_1
    const v4, 0xd800

    if-lt v2, v4, :cond_3

    const v4, 0xdfff

    if-ge v4, v2, :cond_2

    goto :goto_4

    :cond_2
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    ushr-int/lit8 v4, v2, 0x12

    or-int/lit16 v4, v4, 0xf0

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->f(B)V

    ushr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->f(B)V

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->f(B)V

    :goto_2
    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    :goto_3
    int-to-byte v2, v2

    invoke-direct {p0, v2}, Lj1/g;->f(B)V

    goto :goto_5

    :cond_3
    :goto_4
    ushr-int/lit8 v4, v2, 0xc

    or-int/lit16 v4, v4, 0x1e0

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->f(B)V

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    goto :goto_1

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lj1/g;->p()V

    return-void
.end method

.method public w(Ljava/lang/CharSequence;)V
    .locals 5

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_4

    invoke-interface {p1, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v2

    const/16 v3, 0x80

    if-ge v2, v3, :cond_0

    goto :goto_3

    :cond_0
    const/16 v4, 0x800

    if-ge v2, v4, :cond_1

    ushr-int/lit8 v4, v2, 0x6

    or-int/lit16 v4, v4, 0x3c0

    :goto_1
    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->g(B)V

    goto :goto_2

    :cond_1
    const v4, 0xd800

    if-lt v2, v4, :cond_3

    const v4, 0xdfff

    if-ge v4, v2, :cond_2

    goto :goto_4

    :cond_2
    invoke-static {p1, v1}, Ljava/lang/Character;->codePointAt(Ljava/lang/CharSequence;I)I

    move-result v2

    add-int/lit8 v1, v1, 0x1

    ushr-int/lit8 v4, v2, 0x12

    or-int/lit16 v4, v4, 0xf0

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->g(B)V

    ushr-int/lit8 v4, v2, 0xc

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->g(B)V

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->g(B)V

    :goto_2
    and-int/lit8 v2, v2, 0x3f

    or-int/2addr v2, v3

    :goto_3
    int-to-byte v2, v2

    invoke-direct {p0, v2}, Lj1/g;->g(B)V

    goto :goto_5

    :cond_3
    :goto_4
    ushr-int/lit8 v4, v2, 0xc

    or-int/lit16 v4, v4, 0x1e0

    int-to-byte v4, v4

    invoke-direct {p0, v4}, Lj1/g;->g(B)V

    ushr-int/lit8 v4, v2, 0x6

    and-int/lit8 v4, v4, 0x3f

    or-int/2addr v4, v3

    goto :goto_1

    :goto_5
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_4
    invoke-direct {p0}, Lj1/g;->q()V

    return-void
.end method
