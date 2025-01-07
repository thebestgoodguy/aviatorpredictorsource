.class final Lcom/google/protobuf/j$e;
.super Lcom/google/protobuf/j$j;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/j;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "e"
.end annotation


# instance fields
.field private final j:I

.field private final k:I


# direct methods
.method constructor <init>([BII)V
    .locals 1

    invoke-direct {p0, p1}, Lcom/google/protobuf/j$j;-><init>([B)V

    add-int v0, p2, p3

    array-length p1, p1

    invoke-static {p2, v0, p1}, Lcom/google/protobuf/j;->t(III)I

    iput p2, p0, Lcom/google/protobuf/j$e;->j:I

    iput p3, p0, Lcom/google/protobuf/j$e;->k:I

    return-void
.end method


# virtual methods
.method protected A([BIII)V
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/j$j;->i:[B

    invoke-virtual {p0}, Lcom/google/protobuf/j$e;->Y()I

    move-result v1

    add-int/2addr v1, p2

    invoke-static {v0, v1, p1, p3, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method C(I)B
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/j$j;->i:[B

    iget v1, p0, Lcom/google/protobuf/j$e;->j:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method protected Y()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/j$e;->j:I

    return v0
.end method

.method public r(I)B
    .locals 2

    invoke-virtual {p0}, Lcom/google/protobuf/j$e;->size()I

    move-result v0

    invoke-static {p1, v0}, Lcom/google/protobuf/j;->s(II)V

    iget-object v0, p0, Lcom/google/protobuf/j$j;->i:[B

    iget v1, p0, Lcom/google/protobuf/j$e;->j:I

    add-int/2addr v1, p1

    aget-byte p1, v0, v1

    return p1
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/j$e;->k:I

    return v0
.end method
