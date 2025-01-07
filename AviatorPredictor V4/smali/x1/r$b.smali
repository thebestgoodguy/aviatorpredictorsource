.class public final Lx1/r$b;
.super Lcom/google/protobuf/a0$a;
.source ""

# interfaces
.implements Lcom/google/protobuf/w0;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lx1/r;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/a0$a<",
        "Lx1/r;",
        "Lx1/r$b;",
        ">;",
        "Lcom/google/protobuf/w0;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lx1/r;->T()Lx1/r;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/a0$a;-><init>(Lcom/google/protobuf/a0;)V

    return-void
.end method

.method synthetic constructor <init>(Lx1/r$a;)V
    .locals 0

    invoke-direct {p0}, Lx1/r$b;-><init>()V

    return-void
.end method


# virtual methods
.method public B(Ljava/lang/String;)Z
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/r;

    invoke-virtual {v0}, Lx1/r;->X()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public D(Ljava/util/Map;)Lx1/r$b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lx1/x;",
            ">;)",
            "Lx1/r$b;"
        }
    .end annotation

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/r;

    invoke-static {v0}, Lx1/r;->U(Lx1/r;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    return-object p0
.end method

.method public E(Ljava/lang/String;Lx1/x;)Lx1/r$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/r;

    invoke-static {v0}, Lx1/r;->U(Lx1/r;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public F(Ljava/lang/String;)Lx1/r$b;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Lcom/google/protobuf/a0$a;->v()V

    iget-object v0, p0, Lcom/google/protobuf/a0$a;->f:Lcom/google/protobuf/a0;

    check-cast v0, Lx1/r;

    invoke-static {v0}, Lx1/r;->U(Lx1/r;)Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method
