.class public final Lx1/y$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/y;",
        "Lx1/y$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/y;->T()Lx1/y;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/y$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/y$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/m$c;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->V(Lx1/y;Lx1/m$c;)V

    return-object p0
.end method

.method public D(Lx1/s;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->X(Lx1/y;Lx1/s;)V

    return-object p0
.end method

.method public E(Ljava/lang/String;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->Y(Lx1/y;Ljava/lang/String;)V

    return-object p0
.end method

.method public F(Lx1/h;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->W(Lx1/y;Lx1/h;)V

    return-object p0
.end method

.method public G(Lx1/k;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->U(Lx1/y;Lx1/k;)V

    return-object p0
.end method

.method public H(Ljava/lang/String;)Lx1/y$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/y;

    invoke-static {v0, p1}, Lx1/y;->Z(Lx1/y;Ljava/lang/String;)V

    return-object p0
.end method
