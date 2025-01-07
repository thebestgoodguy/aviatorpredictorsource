.class public final Lw1/a$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lw1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lw1/a;",
        "Lw1/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lw1/a;->T()Lw1/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lw1/a$a;)V
    .locals 0

    invoke-direct {p0}, Lw1/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lw1/a$c;)Lw1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lw1/a;

    invoke-static {v0, p1}, Lw1/a;->W(Lw1/a;Lw1/a$c;)V

    return-object p0
.end method

.method public D(Ljava/lang/String;)Lw1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lw1/a;

    invoke-static {v0, p1}, Lw1/a;->U(Lw1/a;Ljava/lang/String;)V

    return-object p0
.end method

.method public E(Lx1/t;)Lw1/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lw1/a;

    invoke-static {v0, p1}, Lw1/a;->V(Lw1/a;Lx1/t;)V

    return-object p0
.end method
