.class public final Lcom/google/protobuf/b0$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/protobuf/b0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lcom/google/protobuf/b0;",
        "Lcom/google/protobuf/b0$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/b0;->T()Lcom/google/protobuf/b0;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/protobuf/b0$a;)V
    .locals 0

    invoke-direct {p0}, Lcom/google/protobuf/b0$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(I)Lcom/google/protobuf/b0$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lcom/google/protobuf/b0;

    invoke-static {v0, p1}, Lcom/google/protobuf/b0;->U(Lcom/google/protobuf/b0;I)V

    return-object p0
.end method
