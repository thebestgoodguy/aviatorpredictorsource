.class public final Lx1/m$c$a;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/m$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/m$c;",
        "Lx1/m$c$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/m$c;->T()Lx1/m$c;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/m$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/m$c$a;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Lx1/a$b;)Lx1/m$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/m$c;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/a;

    invoke-static {v0, p1}, Lx1/m$c;->U(Lx1/m$c;Lx1/a;)V

    return-object p0
.end method

.method public D(Ljava/lang/String;)Lx1/m$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/m$c;

    invoke-static {v0, p1}, Lx1/m$c;->V(Lx1/m$c;Ljava/lang/String;)V

    return-object p0
.end method

.method public E(Lx1/x;)Lx1/m$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/m$c;

    invoke-static {v0, p1}, Lx1/m$c;->Y(Lx1/m$c;Lx1/x;)V

    return-object p0
.end method

.method public F(Lx1/a$b;)Lx1/m$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/m$c;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/a;

    invoke-static {v0, p1}, Lx1/m$c;->W(Lx1/m$c;Lx1/a;)V

    return-object p0
.end method

.method public G(Lx1/m$c$b;)Lx1/m$c$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/m$c;

    invoke-static {v0, p1}, Lx1/m$c;->X(Lx1/m$c;Lx1/m$c$b;)V

    return-object p0
.end method
