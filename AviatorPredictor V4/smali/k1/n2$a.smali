.class Lk1/n2$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lp1/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk1/n2;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lp1/n<",
        "Landroid/database/Cursor;",
        ">;"
    }
.end annotation


# instance fields
.field private final a:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/google/protobuf/j;",
            ">;"
        }
    .end annotation
.end field

.field private b:Z


# direct methods
.method constructor <init>([B)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lk1/n2$a;->a:Ljava/util/ArrayList;

    const/4 v0, 0x1

    iput-boolean v0, p0, Lk1/n2$a;->b:Z

    invoke-direct {p0, p1}, Lk1/n2$a;->c([B)V

    return-void
.end method

.method static synthetic b(Lk1/n2$a;)Z
    .locals 0

    iget-boolean p0, p0, Lk1/n2$a;->b:Z

    return p0
.end method

.method private c([B)V
    .locals 1

    invoke-static {p1}, Lcom/google/protobuf/j;->w([B)Lcom/google/protobuf/j;

    move-result-object p1

    iget-object v0, p0, Lk1/n2$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public a(Landroid/database/Cursor;)V
    .locals 2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Landroid/database/Cursor;->getBlob(I)[B

    move-result-object p1

    invoke-direct {p0, p1}, Lk1/n2$a;->c([B)V

    array-length p1, p1

    const v1, 0xf4240

    if-ge p1, v1, :cond_0

    iput-boolean v0, p0, Lk1/n2$a;->b:Z

    :cond_0
    return-void
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Landroid/database/Cursor;

    invoke-virtual {p0, p1}, Lk1/n2$a;->a(Landroid/database/Cursor;)V

    return-void
.end method

.method d()I
    .locals 1

    iget-object v0, p0, Lk1/n2$a;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    return v0
.end method

.method e()Lcom/google/protobuf/j;
    .locals 1

    iget-object v0, p0, Lk1/n2$a;->a:Ljava/util/ArrayList;

    invoke-static {v0}, Lcom/google/protobuf/j;->v(Ljava/lang/Iterable;)Lcom/google/protobuf/j;

    move-result-object v0

    return-object v0
.end method
