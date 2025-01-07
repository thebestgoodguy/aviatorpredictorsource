.class final Lm1/b;
.super Lm1/k;
.source ""


# instance fields
.field private final a:I

.field private final b:Lm1/f;


# direct methods
.method constructor <init>(ILm1/f;)V
    .locals 0

    invoke-direct {p0}, Lm1/k;-><init>()V

    iput p1, p0, Lm1/b;->a:I

    const-string p1, "Null mutation"

    invoke-static {p2, p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p2, p0, Lm1/b;->b:Lm1/f;

    return-void
.end method


# virtual methods
.method public c()I
    .locals 1

    iget v0, p0, Lm1/b;->a:I

    return v0
.end method

.method public d()Lm1/f;
    .locals 1

    iget-object v0, p0, Lm1/b;->b:Lm1/f;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p1, p0, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lm1/k;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    check-cast p1, Lm1/k;

    iget v1, p0, Lm1/b;->a:I

    invoke-virtual {p1}, Lm1/k;->c()I

    move-result v3

    if-ne v1, v3, :cond_1

    iget-object v1, p0, Lm1/b;->b:Lm1/f;

    invoke-virtual {p1}, Lm1/k;->d()Lm1/f;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_2
    return v2
.end method

.method public hashCode()I
    .locals 2

    iget v0, p0, Lm1/b;->a:I

    const v1, 0xf4243

    xor-int/2addr v0, v1

    mul-int v0, v0, v1

    iget-object v1, p0, Lm1/b;->b:Lm1/f;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Overlay{largestBatchId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lm1/b;->a:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", mutation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lm1/b;->b:Lm1/f;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
