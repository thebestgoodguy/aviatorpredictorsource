.class Lcom/google/protobuf/j$a;
.super Lcom/google/protobuf/j$c;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/protobuf/j;->F()Lcom/google/protobuf/j$g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field private e:I

.field private final f:I

.field final synthetic g:Lcom/google/protobuf/j;


# direct methods
.method constructor <init>(Lcom/google/protobuf/j;)V
    .locals 1

    iput-object p1, p0, Lcom/google/protobuf/j$a;->g:Lcom/google/protobuf/j;

    invoke-direct {p0}, Lcom/google/protobuf/j$c;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Lcom/google/protobuf/j$a;->e:I

    invoke-virtual {p1}, Lcom/google/protobuf/j;->size()I

    move-result p1

    iput p1, p0, Lcom/google/protobuf/j$a;->f:I

    return-void
.end method


# virtual methods
.method public b()B
    .locals 2

    iget v0, p0, Lcom/google/protobuf/j$a;->e:I

    iget v1, p0, Lcom/google/protobuf/j$a;->f:I

    if-ge v0, v1, :cond_0

    add-int/lit8 v1, v0, 0x1

    iput v1, p0, Lcom/google/protobuf/j$a;->e:I

    iget-object v1, p0, Lcom/google/protobuf/j$a;->g:Lcom/google/protobuf/j;

    invoke-virtual {v1, v0}, Lcom/google/protobuf/j;->C(I)B

    move-result v0

    return v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public hasNext()Z
    .locals 2

    iget v0, p0, Lcom/google/protobuf/j$a;->e:I

    iget v1, p0, Lcom/google/protobuf/j$a;->f:I

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
