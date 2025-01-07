.class public Lm1/a$a;
.super Lm1/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lm1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# direct methods
.method public constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Lm1/a;-><init>(Ljava/util/List;)V

    return-void
.end method


# virtual methods
.method protected d(Lx1/x;)Lx1/x;
    .locals 4

    invoke-static {p1}, Lm1/a;->e(Lx1/x;)Lx1/a$b;

    move-result-object p1

    invoke-virtual {p0}, Lm1/a;->f()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lx1/x;

    const/4 v2, 0x0

    :goto_0
    invoke-virtual {p1}, Lx1/a$b;->F()I

    move-result v3

    if-ge v2, v3, :cond_0

    invoke-virtual {p1, v2}, Lx1/a$b;->E(I)Lx1/x;

    move-result-object v3

    invoke-static {v3, v1}, Ll1/y;->q(Lx1/x;Lx1/x;)Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {p1, v2}, Lx1/a$b;->G(I)Lx1/a$b;

    goto :goto_0

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    invoke-static {}, Lx1/x;->r0()Lx1/x$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lx1/x$b;->D(Lx1/a$b;)Lx1/x$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a0$a;->r()Lcom/google/protobuf/a0;

    move-result-object p1

    check-cast p1, Lx1/x;

    return-object p1
.end method
