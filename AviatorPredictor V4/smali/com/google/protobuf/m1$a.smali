.class Lcom/google/protobuf/m1$a;
.super Lcom/google/protobuf/j$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/m1;->F()Lcom/google/protobuf/j$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final e:Lcom/google/protobuf/m1$c;

.field f:Lcom/google/protobuf/j$g;

.field final synthetic g:Lcom/google/protobuf/m1;


# direct methods
.method constructor <init>(Lcom/google/protobuf/m1;)V
    .locals 2

    iput-object p1, p0, Lcom/google/protobuf/m1$a;->g:Lcom/google/protobuf/m1;

    invoke-direct {p0}, Lcom/google/protobuf/j$c;-><init>()V

    new-instance v0, Lcom/google/protobuf/m1$c;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lcom/google/protobuf/m1$c;-><init>(Lcom/google/protobuf/j;Lcom/google/protobuf/m1$a;)V

    iput-object v0, p0, Lcom/google/protobuf/m1$a;->e:Lcom/google/protobuf/m1$c;

    invoke-direct {p0}, Lcom/google/protobuf/m1$a;->d()Lcom/google/protobuf/j$g;

    move-result-object p1

    iput-object p1, p0, Lcom/google/protobuf/m1$a;->f:Lcom/google/protobuf/j$g;

    return-void
.end method

.method private d()Lcom/google/protobuf/j$g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->e:Lcom/google/protobuf/m1$c;

    invoke-virtual {v0}, Lcom/google/protobuf/m1$c;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->e:Lcom/google/protobuf/m1$c;

    invoke-virtual {v0}, Lcom/google/protobuf/m1$c;->e()Lcom/google/protobuf/j$i;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/protobuf/j;->F()Lcom/google/protobuf/j$g;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return-object v0
.end method


# virtual methods
.method public b()B
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->f:Lcom/google/protobuf/j$g;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/google/protobuf/j$g;->b()B

    move-result v0

    iget-object v1, p0, Lcom/google/protobuf/m1$a;->f:Lcom/google/protobuf/j$g;

    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    invoke-direct {p0}, Lcom/google/protobuf/m1$a;->d()Lcom/google/protobuf/j$g;

    move-result-object v1

    iput-object v1, p0, Lcom/google/protobuf/m1$a;->f:Lcom/google/protobuf/j$g;

    :cond_0
    return v0

    :cond_1
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/m1$a;->f:Lcom/google/protobuf/j$g;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
