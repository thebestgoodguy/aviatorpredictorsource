.class final Lj1/a;
.super Lj1/e;
.source ""


# instance fields
.field private final e:I

.field private final f:Ll1/l;

.field private final g:[B

.field private final h:[B


# direct methods
.method constructor <init>(ILl1/l;[B[B)V
    .locals 0

    invoke-direct {p0}, Lj1/e;-><init>()V

    iput p1, p0, Lj1/a;->e:I

    const-string p1, "Null documentKey"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lj1/a;->f:Ll1/l;

    const-string p1, "Null arrayValue"

    invoke-static {p3, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p3, p0, Lj1/a;->g:[B

    const-string p1, "Null directionalValue"

    invoke-static {p4, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p4, p0, Lj1/a;->h:[B

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 5

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lj1/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    check-cast p1, Lj1/e;

    iget v1, p0, Lj1/a;->e:I

    invoke-virtual {p1}, Lj1/e;->n()I

    move-result v3

    if-ne v1, v3, :cond_3

    iget-object v1, p0, Lj1/a;->f:Ll1/l;

    invoke-virtual {p1}, Lj1/e;->k()Ll1/l;

    move-result-object v3

    invoke-virtual {v1, v3}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lj1/a;->g:[B

    instance-of v3, p1, Lj1/a;

    if-eqz v3, :cond_1

    move-object v4, p1

    check-cast v4, Lj1/a;

    iget-object v4, v4, Lj1/a;->g:[B

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lj1/e;->h()[B

    move-result-object v4

    :goto_0
    invoke-static {v1, v4}, Ljava/util/Arrays;->equals([B[B)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, p0, Lj1/a;->h:[B

    if-eqz v3, :cond_2

    check-cast p1, Lj1/a;

    iget-object p1, p1, Lj1/a;->h:[B

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lj1/e;->i()[B

    move-result-object p1

    :goto_1
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    return v0

    :cond_4
    return v2
.end method

.method public h()[B
    .locals 1

    iget-object v0, p0, Lj1/a;->g:[B

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lj1/a;->e:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v2, p0, Lj1/a;->f:Ll1/l;

    invoke-virtual {v2}, Ll1/l;->hashCode()I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v2, p0, Lj1/a;->g:[B

    invoke-static {v2}, Ljava/util/Arrays;->hashCode([B)I

    move-result v2

    xor-int/2addr v0, v2

    mul-int v0, v0, v1

    iget-object v1, p0, Lj1/a;->h:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public i()[B
    .locals 1

    iget-object v0, p0, Lj1/a;->h:[B

    return-object v0
.end method

.method public k()Ll1/l;
    .locals 1

    iget-object v0, p0, Lj1/a;->f:Ll1/l;

    return-object v0
.end method

.method public n()I
    .locals 1

    iget v0, p0, Lj1/a;->e:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "IndexEntry{indexId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lj1/a;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", documentKey="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj1/a;->f:Ll1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", arrayValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj1/a;->g:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", directionalValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lj1/a;->h:[B

    invoke-static {v1}, Ljava/util/Arrays;->toString([B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
