.class public final Lb2/a$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb2/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lb2/a;",
        "Lb2/a$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lb2/a;->T()Lb2/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lb2/a$a;)V
    .locals 0

    invoke-direct {p0}, Lb2/a$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(D)Lb2/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lb2/a;

    invoke-static {v0, p1, p2}, Lb2/a;->U(Lb2/a;D)V

    return-object p0
.end method

.method public D(D)Lb2/a$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lb2/a;

    invoke-static {v0, p1, p2}, Lb2/a;->V(Lb2/a;D)V

    return-object p0
.end method
