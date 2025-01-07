.class public Lcom/google/protobuf/a0$e;
.super Lcom/google/protobuf/p;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/a0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ContainingType::",
        "Lcom/google/protobuf/v0;",
        "Type:",
        "Ljava/lang/Object;",
        ">",
        "Lcom/google/protobuf/p<",
        "TContainingType;TType;>;"
    }
.end annotation


# instance fields
.field final a:Lcom/google/protobuf/v0;

.field final b:Lcom/google/protobuf/a0$d;


# virtual methods
.method public a()Lcom/google/protobuf/b2$b;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$e;->b:Lcom/google/protobuf/a0$d;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$d;->j()Lcom/google/protobuf/b2$b;

    move-result-object v0

    return-object v0
.end method

.method public b()Lcom/google/protobuf/v0;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$e;->a:Lcom/google/protobuf/v0;

    return-object v0
.end method

.method public c()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$e;->b:Lcom/google/protobuf/a0$d;

    invoke-virtual {v0}, Lcom/google/protobuf/a0$d;->e()I

    move-result v0

    return v0
.end method

.method public d()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$e;->b:Lcom/google/protobuf/a0$d;

    iget-boolean v0, v0, Lcom/google/protobuf/a0$d;->h:Z

    return v0
.end method
