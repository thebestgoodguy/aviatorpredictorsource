.class public final Lcom/google/protobuf/t1$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/t1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lcom/google/protobuf/t1;",
        "Lcom/google/protobuf/t1$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/t1;->T()Lcom/google/protobuf/t1;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/t1$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/t1$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(I)Lcom/google/protobuf/t1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lcom/google/protobuf/t1;

    invoke-static {v0, p1}, Lcom/google/protobuf/t1;->V(Lcom/google/protobuf/t1;I)V

    return-object p0
.end method

.method public D(J)Lcom/google/protobuf/t1$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lcom/google/protobuf/t1;

    invoke-static {v0, p1, p2}, Lcom/google/protobuf/t1;->U(Lcom/google/protobuf/t1;J)V

    return-object p0
.end method
