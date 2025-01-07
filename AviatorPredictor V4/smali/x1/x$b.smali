.class public final Lx1/x$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/x;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/x;",
        "Lx1/x$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/x;->T()Lx1/x;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/x$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/x$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B()Lx1/r;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-virtual {v0}, Lx1/x;->m0()Lx1/r;

    move-result-object v0

    return-object v0
.end method

.method public D(Lx1/a$b;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/a;

    invoke-static {v0, p1}, Lx1/x;->Z(Lx1/x;Lx1/a;)V

    return-object p0
.end method

.method public E(Lx1/a;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->Z(Lx1/x;Lx1/a;)V

    return-object p0
.end method

.method public F(Z)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->c0(Lx1/x;Z)V

    return-object p0
.end method

.method public G(Lcom/google/protobuf/j;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->W(Lx1/x;Lcom/google/protobuf/j;)V

    return-object p0
.end method

.method public H(D)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1, p2}, Lx1/x;->e0(Lx1/x;D)V

    return-object p0
.end method

.method public I(Lb2/a$b;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lb2/a;

    invoke-static {v0, p1}, Lx1/x;->Y(Lx1/x;Lb2/a;)V

    return-object p0
.end method

.method public J(J)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1, p2}, Lx1/x;->d0(Lx1/x;J)V

    return-object p0
.end method

.method public L(Lx1/r$b;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/r;

    invoke-static {v0, p1}, Lx1/x;->a0(Lx1/x;Lx1/r;)V

    return-object p0
.end method

.method public N(Lx1/r;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->a0(Lx1/x;Lx1/r;)V

    return-object p0
.end method

.method public O(Lcom/google/protobuf/e1;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->b0(Lx1/x;Lcom/google/protobuf/e1;)V

    return-object p0
.end method

.method public P(Ljava/lang/String;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->X(Lx1/x;Ljava/lang/String;)V

    return-object p0
.end method

.method public Q(Ljava/lang/String;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-static {v0, p1}, Lx1/x;->V(Lx1/x;Ljava/lang/String;)V

    return-object p0
.end method

.method public R(Lcom/google/protobuf/t1$b;)Lx1/x$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/x;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/t1;

    invoke-static {v0, p1}, Lx1/x;->U(Lx1/x;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
