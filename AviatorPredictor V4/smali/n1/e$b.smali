.class public final Ln1/e$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/e;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Ln1/e;",
        "Ln1/e$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ln1/e;->T()Ln1/e;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Ln1/e$a;)V
    .locals 0

    invoke-direct {p0}, Ln1/e$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/y;)Ln1/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/e;

    invoke-static {v0, p1}, Ln1/e;->V(Ln1/e;Lx1/y;)V

    return-object p0
.end method

.method public D(Lx1/y;)Ln1/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/e;

    invoke-static {v0, p1}, Ln1/e;->W(Ln1/e;Lx1/y;)V

    return-object p0
.end method

.method public E(I)Ln1/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/e;

    invoke-static {v0, p1}, Ln1/e;->U(Ln1/e;I)V

    return-object p0
.end method

.method public F(Lcom/google/protobuf/t1;)Ln1/e$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/e;

    invoke-static {v0, p1}, Ln1/e;->X(Ln1/e;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
