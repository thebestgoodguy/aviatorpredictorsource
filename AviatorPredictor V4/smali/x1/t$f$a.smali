.class public final Lx1/t$f$a;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/t$f;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/t$f;",
        "Lx1/t$f$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/t$f;->T()Lx1/t$f;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/t$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/t$f$a;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/t$g;)Lx1/t$f$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t$f;

    invoke-static {v0, p1}, Lx1/t$f;->U(Lx1/t$f;Lx1/t$g;)V

    return-object p0
.end method

.method public D(Lx1/t$f$b;)Lx1/t$f$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t$f;

    invoke-static {v0, p1}, Lx1/t$f;->V(Lx1/t$f;Lx1/t$f$b;)V

    return-object p0
.end method

.method public E(Lx1/x;)Lx1/t$f$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/t$f;

    invoke-static {v0, p1}, Lx1/t$f;->W(Lx1/t$f;Lx1/x;)V

    return-object p0
.end method
