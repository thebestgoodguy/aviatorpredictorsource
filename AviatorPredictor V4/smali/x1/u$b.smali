.class public final Lx1/u$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/u;",
        "Lx1/u$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/u;->T()Lx1/u;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/u$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/u$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/u$c;)Lx1/u$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u;

    invoke-static {v0, p1}, Lx1/u;->V(Lx1/u;Lx1/u$c;)V

    return-object p0
.end method

.method public D(Lx1/u$d;)Lx1/u$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u;

    invoke-static {v0, p1}, Lx1/u;->U(Lx1/u;Lx1/u$d;)V

    return-object p0
.end method

.method public E(Lcom/google/protobuf/t1;)Lx1/u$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u;

    invoke-static {v0, p1}, Lx1/u;->X(Lx1/u;Lcom/google/protobuf/t1;)V

    return-object p0
.end method

.method public F(Lcom/google/protobuf/j;)Lx1/u$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u;

    invoke-static {v0, p1}, Lx1/u;->W(Lx1/u;Lcom/google/protobuf/j;)V

    return-object p0
.end method

.method public G(I)Lx1/u$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u;

    invoke-static {v0, p1}, Lx1/u;->Y(Lx1/u;I)V

    return-object p0
.end method
