.class public final Lx1/u$d$a;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/u$d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/u$d;",
        "Lx1/u$d$a;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/u$d;->U()Lx1/u$d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/u$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/u$d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)Lx1/u$d$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u$d;

    invoke-static {v0, p1}, Lx1/u$d;->V(Lx1/u$d;Ljava/lang/String;)V

    return-object p0
.end method

.method public D(Lx1/t$b;)Lx1/u$d$a;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/u$d;

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/t;

    invoke-static {v0, p1}, Lx1/u$d;->T(Lx1/u$d;Lx1/t;)V

    return-object p0
.end method
