.class public final Ln1/c$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Ln1/c;",
        "Ln1/c$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ln1/c;->T()Ln1/c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Ln1/c$a;)V
    .locals 0

    invoke-direct {p0}, Ln1/c$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B()Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0}, Ln1/c;->X(Ln1/c;)V

    return-object p0
.end method

.method public D(Lx1/u$c;)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->V(Ln1/c;Lx1/u$c;)V

    return-object p0
.end method

.method public E(Lcom/google/protobuf/t1;)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->W(Ln1/c;Lcom/google/protobuf/t1;)V

    return-object p0
.end method

.method public F(J)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1, p2}, Ln1/c;->b0(Ln1/c;J)V

    return-object p0
.end method

.method public G(Lx1/u$d;)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->U(Ln1/c;Lx1/u$d;)V

    return-object p0
.end method

.method public H(Lcom/google/protobuf/j;)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->a0(Ln1/c;Lcom/google/protobuf/j;)V

    return-object p0
.end method

.method public I(Lcom/google/protobuf/t1;)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->Z(Ln1/c;Lcom/google/protobuf/t1;)V

    return-object p0
.end method

.method public J(I)Ln1/c$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/c;

    invoke-static {v0, p1}, Ln1/c;->Y(Ln1/c;I)V

    return-object p0
.end method
