.class final Lcom/google/protobuf/m$e;
.super Lcom/google/protobuf/m$b;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final i:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Ljava/io/OutputStream;I)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/protobuf/m$b;-><init>(I)V

    const-string p2, "out"

    invoke-static {p1, p2}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/google/protobuf/m$e;->i:Ljava/io/OutputStream;

    return-void
.end method

.method private j1()V
    .locals 4

    iget-object v0, p0, Lcom/google/protobuf/m$e;->i:Ljava/io/OutputStream;

    iget-object v1, p0, Lcom/google/protobuf/m$b;->e:[B

    iget v2, p0, Lcom/google/protobuf/m$b;->g:I

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    iput v3, p0, Lcom/google/protobuf/m$b;->g:I

    return-void
.end method

.method private k1(I)V
    .locals 2

    iget v0, p0, Lcom/google/protobuf/m$b;->f:I

    iget v1, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int/2addr v0, v1

    if-ge v0, p1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    :cond_0
    return-void
.end method


# virtual methods
.method public F0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$b;->f1(I)V

    return-void
.end method

.method public G0(I)V
    .locals 2

    if-ltz p1, :cond_0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$e;->Z0(I)V

    goto :goto_0

    :cond_0
    int-to-long v0, p1

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/m$e;->b1(J)V

    :goto_0
    return-void
.end method

.method J0(ILcom/google/protobuf/v0;Lcom/google/protobuf/n1;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$e;->X0(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/m$e;->o1(Lcom/google/protobuf/v0;Lcom/google/protobuf/n1;)V

    return-void
.end method

.method public K0(Lcom/google/protobuf/v0;)V
    .locals 1

    invoke-interface {p1}, Lcom/google/protobuf/v0;->b()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/m$e;->Z0(I)V

    invoke-interface {p1, p0}, Lcom/google/protobuf/v0;->l(Lcom/google/protobuf/m;)V

    return-void
.end method

.method public L0(ILcom/google/protobuf/v0;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/m$e;->X0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/m$e;->Y0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/m$e;->n1(ILcom/google/protobuf/v0;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/m$e;->X0(II)V

    return-void
.end method

.method public M0(ILcom/google/protobuf/j;)V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x3

    invoke-virtual {p0, v0, v1}, Lcom/google/protobuf/m$e;->X0(II)V

    const/4 v2, 0x2

    invoke-virtual {p0, v2, p1}, Lcom/google/protobuf/m$e;->Y0(II)V

    invoke-virtual {p0, v1, p2}, Lcom/google/protobuf/m$e;->p0(ILcom/google/protobuf/j;)V

    const/4 p1, 0x4

    invoke-virtual {p0, v0, p1}, Lcom/google/protobuf/m$e;->X0(II)V

    return-void
.end method

.method public V0(ILjava/lang/String;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$e;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$e;->W0(Ljava/lang/String;)V

    return-void
.end method

.method public W0(Ljava/lang/String;)V
    .locals 5

    :try_start_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    mul-int/lit8 v0, v0, 0x3

    invoke-static {v0}, Lcom/google/protobuf/m;->Y(I)I

    move-result v1

    add-int v2, v1, v0

    iget v3, p0, Lcom/google/protobuf/m$b;->f:I

    if-le v2, v3, :cond_0

    new-array v1, v0, [B

    const/4 v2, 0x0

    invoke-static {p1, v1, v2, v0}, Lcom/google/protobuf/a2;->i(Ljava/lang/CharSequence;[BII)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/m$e;->Z0(I)V

    invoke-virtual {p0, v1, v2, v0}, Lcom/google/protobuf/m$e;->b([BII)V

    return-void

    :cond_0
    iget v0, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int/2addr v3, v0

    if-le v2, v3, :cond_1

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0}, Lcom/google/protobuf/m;->Y(I)I

    move-result v0

    iget v2, p0, Lcom/google/protobuf/m$b;->g:I
    :try_end_0
    .catch Lcom/google/protobuf/a2$d; {:try_start_0 .. :try_end_0} :catch_2

    if-ne v0, v1, :cond_2

    add-int v1, v2, v0

    :try_start_1
    iput v1, p0, Lcom/google/protobuf/m$b;->g:I

    iget-object v3, p0, Lcom/google/protobuf/m$b;->e:[B

    iget v4, p0, Lcom/google/protobuf/m$b;->f:I

    sub-int/2addr v4, v1

    invoke-static {p1, v3, v1, v4}, Lcom/google/protobuf/a2;->i(Ljava/lang/CharSequence;[BII)I

    move-result v1

    iput v2, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int v3, v1, v2

    sub-int/2addr v3, v0

    invoke-virtual {p0, v3}, Lcom/google/protobuf/m$b;->h1(I)V

    iput v1, p0, Lcom/google/protobuf/m$b;->g:I

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lcom/google/protobuf/a2;->j(Ljava/lang/CharSequence;)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/google/protobuf/m$b;->h1(I)V

    iget-object v0, p0, Lcom/google/protobuf/m$b;->e:[B

    iget v1, p0, Lcom/google/protobuf/m$b;->g:I

    invoke-static {p1, v0, v1, v3}, Lcom/google/protobuf/a2;->i(Ljava/lang/CharSequence;[BII)I

    move-result v0

    iput v0, p0, Lcom/google/protobuf/m$b;->g:I

    :goto_0
    iget v0, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr v0, v3

    iput v0, p0, Lcom/google/protobuf/m$b;->h:I
    :try_end_1
    .catch Lcom/google/protobuf/a2$d; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ArrayIndexOutOfBoundsException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    :try_start_2
    new-instance v1, Lcom/google/protobuf/m$d;

    invoke-direct {v1, v0}, Lcom/google/protobuf/m$d;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :catch_1
    move-exception v0

    iget v1, p0, Lcom/google/protobuf/m$b;->h:I

    iget v3, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int/2addr v3, v2

    sub-int/2addr v1, v3

    iput v1, p0, Lcom/google/protobuf/m$b;->h:I

    iput v2, p0, Lcom/google/protobuf/m$b;->g:I

    throw v0
    :try_end_2
    .catch Lcom/google/protobuf/a2$d; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception v0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m;->e0(Ljava/lang/String;Lcom/google/protobuf/a2$d;)V

    :goto_1
    return-void
.end method

.method public X0(II)V
    .locals 0

    invoke-static {p1, p2}, Lcom/google/protobuf/b2;->c(II)I

    move-result p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$e;->Z0(I)V

    return-void
.end method

.method public Y0(II)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$b;->h1(I)V

    return-void
.end method

.method public Z0(I)V
    .locals 1

    const/4 v0, 0x5

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$b;->h1(I)V

    return-void
.end method

.method public a(Ljava/nio/ByteBuffer;)V
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$e;->l1(Ljava/nio/ByteBuffer;)V

    return-void
.end method

.method public a1(IJ)V
    .locals 1

    const/16 v0, 0x14

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/m$b;->i1(J)V

    return-void
.end method

.method public b([BII)V
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/m$e;->m1([BII)V

    return-void
.end method

.method public b1(J)V
    .locals 1

    const/16 v0, 0xa

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/m$b;->i1(J)V

    return-void
.end method

.method public d0()V
    .locals 1

    iget v0, p0, Lcom/google/protobuf/m$b;->g:I

    if-lez v0, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    :cond_0
    return-void
.end method

.method public k0(B)V
    .locals 2

    iget v0, p0, Lcom/google/protobuf/m$b;->g:I

    iget v1, p0, Lcom/google/protobuf/m$b;->f:I

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    :cond_0
    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$b;->c1(B)V

    return-void
.end method

.method public l0(IZ)V
    .locals 1

    const/16 v0, 0xb

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    int-to-byte p1, p2

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$b;->c1(B)V

    return-void
.end method

.method public l1(Ljava/nio/ByteBuffer;)V
    .locals 5

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->remaining()I

    move-result v0

    iget v1, p0, Lcom/google/protobuf/m$b;->f:I

    iget v2, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int v3, v1, v2

    if-lt v3, v0, :cond_0

    iget-object v1, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-virtual {p1, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget p1, p0, Lcom/google/protobuf/m$b;->g:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/protobuf/m$b;->g:I

    :goto_0
    iget p1, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr p1, v0

    iput p1, p0, Lcom/google/protobuf/m$b;->h:I

    goto :goto_2

    :cond_0
    sub-int/2addr v1, v2

    iget-object v3, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-virtual {p1, v3, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr v0, v1

    iget v2, p0, Lcom/google/protobuf/m$b;->f:I

    iput v2, p0, Lcom/google/protobuf/m$b;->g:I

    iget v2, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/google/protobuf/m$b;->h:I

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    :goto_1
    iget v1, p0, Lcom/google/protobuf/m$b;->f:I

    const/4 v2, 0x0

    if-le v0, v1, :cond_1

    iget-object v3, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-virtual {p1, v3, v2, v1}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iget-object v1, p0, Lcom/google/protobuf/m$e;->i:Ljava/io/OutputStream;

    iget-object v3, p0, Lcom/google/protobuf/m$b;->e:[B

    iget v4, p0, Lcom/google/protobuf/m$b;->f:I

    invoke-virtual {v1, v3, v2, v4}, Ljava/io/OutputStream;->write([BII)V

    iget v1, p0, Lcom/google/protobuf/m$b;->f:I

    sub-int/2addr v0, v1

    iget v2, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr v2, v1

    iput v2, p0, Lcom/google/protobuf/m$b;->h:I

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-virtual {p1, v1, v2, v0}, Ljava/nio/ByteBuffer;->get([BII)Ljava/nio/ByteBuffer;

    iput v0, p0, Lcom/google/protobuf/m$b;->g:I

    goto :goto_0

    :goto_2
    return-void
.end method

.method public m1([BII)V
    .locals 3

    iget v0, p0, Lcom/google/protobuf/m$b;->f:I

    iget v1, p0, Lcom/google/protobuf/m$b;->g:I

    sub-int v2, v0, v1

    if-lt v2, p3, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lcom/google/protobuf/m$b;->g:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/protobuf/m$b;->g:I

    :goto_0
    iget p1, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/google/protobuf/m$b;->h:I

    goto :goto_1

    :cond_0
    sub-int/2addr v0, v1

    iget-object v2, p0, Lcom/google/protobuf/m$b;->e:[B

    invoke-static {p1, p2, v2, v1, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr p2, v0

    sub-int/2addr p3, v0

    iget v1, p0, Lcom/google/protobuf/m$b;->f:I

    iput v1, p0, Lcom/google/protobuf/m$b;->g:I

    iget v1, p0, Lcom/google/protobuf/m$b;->h:I

    add-int/2addr v1, v0

    iput v1, p0, Lcom/google/protobuf/m$b;->h:I

    invoke-direct {p0}, Lcom/google/protobuf/m$e;->j1()V

    iget v0, p0, Lcom/google/protobuf/m$b;->f:I

    if-gt p3, v0, :cond_1

    iget-object v0, p0, Lcom/google/protobuf/m$b;->e:[B

    const/4 v1, 0x0

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput p3, p0, Lcom/google/protobuf/m$b;->g:I

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/m$e;->i:Ljava/io/OutputStream;

    invoke-virtual {v0, p1, p2, p3}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :goto_1
    return-void
.end method

.method public n1(ILcom/google/protobuf/v0;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$e;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$e;->K0(Lcom/google/protobuf/v0;)V

    return-void
.end method

.method public o0([BII)V
    .locals 0

    invoke-virtual {p0, p3}, Lcom/google/protobuf/m$e;->Z0(I)V

    invoke-virtual {p0, p1, p2, p3}, Lcom/google/protobuf/m$e;->m1([BII)V

    return-void
.end method

.method o1(Lcom/google/protobuf/v0;Lcom/google/protobuf/n1;)V
    .locals 1

    move-object v0, p1

    check-cast v0, Lcom/google/protobuf/a;

    invoke-virtual {v0, p2}, Lcom/google/protobuf/a;->n(Lcom/google/protobuf/n1;)I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/m$e;->Z0(I)V

    iget-object v0, p0, Lcom/google/protobuf/m;->a:Lcom/google/protobuf/n;

    invoke-interface {p2, p1, v0}, Lcom/google/protobuf/n1;->h(Ljava/lang/Object;Lcom/google/protobuf/c2;)V

    return-void
.end method

.method public p0(ILcom/google/protobuf/j;)V
    .locals 1

    const/4 v0, 0x2

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$e;->X0(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$e;->q0(Lcom/google/protobuf/j;)V

    return-void
.end method

.method public q0(Lcom/google/protobuf/j;)V
    .locals 1

    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result v0

    invoke-virtual {p0, v0}, Lcom/google/protobuf/m$e;->Z0(I)V

    invoke-virtual {p1, p0}, Lcom/google/protobuf/j;->W(Lcom/google/protobuf/i;)V

    return-void
.end method

.method public v0(II)V
    .locals 1

    const/16 v0, 0xe

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x5

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    invoke-virtual {p0, p2}, Lcom/google/protobuf/m$b;->d1(I)V

    return-void
.end method

.method public w0(I)V
    .locals 1

    const/4 v0, 0x4

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    invoke-virtual {p0, p1}, Lcom/google/protobuf/m$b;->d1(I)V

    return-void
.end method

.method public x0(IJ)V
    .locals 1

    const/16 v0, 0x12

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/google/protobuf/m$b;->g1(II)V

    invoke-virtual {p0, p2, p3}, Lcom/google/protobuf/m$b;->e1(J)V

    return-void
.end method

.method public y0(J)V
    .locals 1

    const/16 v0, 0x8

    invoke-direct {p0, v0}, Lcom/google/protobuf/m$e;->k1(I)V

    invoke-virtual {p0, p1, p2}, Lcom/google/protobuf/m$b;->e1(J)V

    return-void
.end method
