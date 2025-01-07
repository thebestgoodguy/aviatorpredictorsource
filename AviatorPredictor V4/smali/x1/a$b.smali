.class public final Lx1/a$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lx1/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/a;",
        "Lx1/a$b;",
        ">;",
        "Lx1/b;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/a;->T()Lx1/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/a$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/Iterable;)Lx1/a$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Iterable<",
            "+",
            "Lx1/x;",
            ">;)",
            "Lx1/a$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-static {v0, p1}, Lx1/a;->V(Lx1/a;Ljava/lang/Iterable;)V

    return-object p0
.end method

.method public D(Lx1/x;)Lx1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-static {v0, p1}, Lx1/a;->U(Lx1/a;Lx1/x;)V

    return-object p0
.end method

.method public E(I)Lx1/x;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-virtual {v0, p1}, Lx1/a;->b0(I)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public F()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-virtual {v0}, Lx1/a;->c0()I

    move-result v0

    return v0
.end method

.method public G(I)Lx1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-static {v0, p1}, Lx1/a;->W(Lx1/a;I)V

    return-object p0
.end method

.method public k()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/a;

    invoke-virtual {v0}, Lx1/a;->k()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
