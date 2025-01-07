.class public final Ln1/a$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Ln1/a;",
        "Ln1/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ln1/a;->T()Ln1/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Ln1/a$a;)V
    .locals 0

    invoke-direct {p0}, Ln1/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/h;)Ln1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/a;

    invoke-static {v0, p1}, Ln1/a;->W(Ln1/a;Lx1/h;)V

    return-object p0
.end method

.method public D(Z)Ln1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/a;

    invoke-static {v0, p1}, Ln1/a;->U(Ln1/a;Z)V

    return-object p0
.end method

.method public E(Ln1/b;)Ln1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/a;

    invoke-static {v0, p1}, Ln1/a;->V(Ln1/a;Ln1/b;)V

    return-object p0
.end method

.method public F(Ln1/d;)Ln1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/a;

    invoke-static {v0, p1}, Ln1/a;->X(Ln1/a;Ln1/d;)V

    return-object p0
.end method
