.class public final Lx1/z$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/z;",
        "Lx1/z$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/z;->T()Lx1/z;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/z$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/z$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/y;)Lx1/z$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/z;

    invoke-static {v0, p1}, Lx1/z;->W(Lx1/z;Lx1/y;)V

    return-object p0
.end method

.method public D(Ljava/lang/String;)Lx1/z$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/z;

    invoke-static {v0, p1}, Lx1/z;->U(Lx1/z;Ljava/lang/String;)V

    return-object p0
.end method

.method public E(Lcom/google/protobuf/j;)Lx1/z$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/z;

    invoke-static {v0, p1}, Lx1/z;->V(Lx1/z;Lcom/google/protobuf/j;)V

    return-object p0
.end method
