.class final Lcom/google/protobuf/a0$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/google/protobuf/w$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/protobuf/w$b<",
        "Lcom/google/protobuf/a0$d;",
        ">;"
    }
.end annotation


# instance fields
.field final e:Lcom/google/protobuf/d0$d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/d0$d<",
            "*>;"
        }
    .end annotation
.end field

.field final f:I

.field final g:Lcom/google/protobuf/b2$b;

.field final h:Z

.field final i:Z


# virtual methods
.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, Lcom/google/protobuf/a0$d;

    invoke-virtual {p0, p1}, Lcom/google/protobuf/a0$d;->d(Lcom/google/protobuf/a0$d;)I

    move-result p1

    return p1
.end method

.method public d(Lcom/google/protobuf/a0$d;)I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/a0$d;->f:I

    iget p1, p1, Lcom/google/protobuf/a0$d;->f:I

    sub-int/2addr v0, p1

    return v0
.end method

.method public e()I
    .locals 1

    iget v0, p0, Lcom/google/protobuf/a0$d;->f:I

    return v0
.end method

.method public f()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/a0$d;->h:Z

    return v0
.end method

.method public g()Lcom/google/protobuf/d0$d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/google/protobuf/d0$d<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/a0$d;->e:Lcom/google/protobuf/d0$d;

    return-object v0
.end method

.method public j()Lcom/google/protobuf/b2$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$d;->g:Lcom/google/protobuf/b2$b;

    return-object v0
.end method

.method public l()Lcom/google/protobuf/b2$c;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$d;->g:Lcom/google/protobuf/b2$b;

    invoke-virtual {v0}, Lcom/google/protobuf/b2$b;->d()Lcom/google/protobuf/b2$c;

    move-result-object v0

    return-object v0
.end method

.method public m()Z
    .locals 1

    iget-boolean v0, p0, Lcom/google/protobuf/a0$d;->i:Z

    return v0
.end method

.method public o(Lcom/google/protobuf/v0$a;Lcom/google/protobuf/v0;)Lcom/google/protobuf/v0$a;
    .locals 0

    check-cast p1, Lcom/google/protobuf/a0$a;

    check-cast p2, Lcom/google/protobuf/a0;

    invoke-virtual {p1, p2}, Lcom/google/protobuf/a0$a;->z(Lcom/google/protobuf/a0;)Lcom/google/protobuf/a0$a;

    move-result-object p1

    return-object p1
.end method
