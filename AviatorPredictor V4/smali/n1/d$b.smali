.class public final Ln1/d$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ln1/d;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Ln1/d;",
        "Ln1/d$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Ln1/d;->T()Ln1/d;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Ln1/d$a;)V
    .locals 0

    invoke-direct {p0}, Ln1/d$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)Ln1/d$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/d;

    invoke-static {v0, p1}, Ln1/d;->U(Ln1/d;Ljava/lang/String;)V

    return-object p0
.end method

.method public D(Lcom/google/protobuf/t1;)Ln1/d$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Ln1/d;

    invoke-static {v0, p1}, Ln1/d;->V(Ln1/d;Lcom/google/protobuf/t1;)V

    return-object p0
.end method
