.class final Lac;
.super Lad;


# instance fields
.field final transient a:I

.field final transient b:I

.field final synthetic c:Lad;


# direct methods
.method constructor <init>(Lad;II)V
    .locals 0

    iput-object p1, p0, Lac;->c:Lad;

    invoke-direct {p0}, Lad;-><init>()V

    iput p2, p0, Lac;->a:I

    iput p3, p0, Lac;->b:I

    return-void
.end method


# virtual methods
.method final a()I
    .locals 2

    iget-object v0, p0, Lac;->c:Lad;

    invoke-virtual {v0}, Laa;->b()I

    move-result v0

    iget v1, p0, Lac;->a:I

    add-int/2addr v0, v1

    iget v1, p0, Lac;->b:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final a(II)Lad;
    .locals 2

    iget v0, p0, Lac;->b:I

    invoke-static {p1, p2, v0}, Lv;->a(III)V

    iget-object v0, p0, Lac;->c:Lad;

    iget v1, p0, Lac;->a:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lad;->a(II)Lad;

    move-result-object p1

    return-object p1
.end method

.method final b()I
    .locals 2

    iget-object v0, p0, Lac;->c:Lad;

    invoke-virtual {v0}, Laa;->b()I

    move-result v0

    iget v1, p0, Lac;->a:I

    add-int/2addr v0, v1

    return v0
.end method

.method final c()[Ljava/lang/Object;
    .locals 1
    .annotation runtime Ljavax/annotation/CheckForNull;
    .end annotation

    iget-object v0, p0, Lac;->c:Lad;

    invoke-virtual {v0}, Laa;->c()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public final get(I)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Lac;->b:I

    const-string v1, "index"

    invoke-static {p1, v0, v1}, Lv;->a(IILjava/lang/String;)I

    iget-object v0, p0, Lac;->c:Lad;

    iget v1, p0, Lac;->a:I

    add-int/2addr p1, v1

    invoke-virtual {v0, p1}, Lad;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final size()I
    .locals 1

    iget v0, p0, Lac;->b:I

    return v0
.end method

.method public final synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lad;->a(II)Lad;

    move-result-object p1

    return-object p1
.end method
