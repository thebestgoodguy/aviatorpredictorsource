.class public final Lx1/t$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/t;",
        "Lx1/t$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/t;->T()Lx1/t;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/t$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/t$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/t$c$a;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/t$c;

    invoke-static {v0, p1}, Lx1/t;->U(Lx1/t;Lx1/t$c;)V

    return-object p0
.end method

.method public D(Lx1/t$i;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-static {v0, p1}, Lx1/t;->W(Lx1/t;Lx1/t$i;)V

    return-object p0
.end method

.method public E(Lx1/g$b;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/g;

    invoke-static {v0, p1}, Lx1/t;->Y(Lx1/t;Lx1/g;)V

    return-object p0
.end method

.method public F(Lcom/google/protobuf/b0$b;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lcom/google/protobuf/b0;

    invoke-static {v0, p1}, Lx1/t;->Z(Lx1/t;Lcom/google/protobuf/b0;)V

    return-object p0
.end method

.method public G(Lx1/g$b;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/g;

    invoke-static {v0, p1}, Lx1/t;->X(Lx1/t;Lx1/g;)V

    return-object p0
.end method

.method public H(Lx1/t$h;)Lx1/t$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t;

    invoke-static {v0, p1}, Lx1/t;->V(Lx1/t;Lx1/t$h;)V

    return-object p0
.end method
