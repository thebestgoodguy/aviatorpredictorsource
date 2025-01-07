.class Lr0/h$b;
.super Lr0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lr0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr0/h<",
        "TE;>;"
    }
.end annotation


# instance fields
.field final transient g:I

.field final transient h:I

.field final synthetic i:Lr0/h;


# direct methods
.method constructor <init>(Lr0/h;II)V
    .locals 0

    iput-object p1, p0, Lr0/h$b;->i:Lr0/h;

    invoke-direct {p0}, Lr0/h;-><init>()V

    iput p2, p0, Lr0/h$b;->g:I

    iput p3, p0, Lr0/h$b;->h:I

    return-void
.end method


# virtual methods
.method public B(II)Lr0/h;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Lr0/h<",
            "TE;>;"
        }
    .end annotation

    iget v0, p0, Lr0/h$b;->h:I

    invoke-static {p1, p2, v0}, Lq0/l;->s(III)V

    iget-object v0, p0, Lr0/h$b;->i:Lr0/h;

    iget v1, p0, Lr0/h$b;->g:I

    add-int/2addr p1, v1

    add-int/2addr p2, v1

    invoke-virtual {v0, p1, p2}, Lr0/h;->B(II)Lr0/h;

    move-result-object p1

    return-object p1
.end method

.method public get(I)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)TE;"
        }
    .end annotation

    iget v0, p0, Lr0/h$b;->h:I

    invoke-static {p1, v0}, Lq0/l;->l(II)I

    iget-object v0, p0, Lr0/h$b;->i:Lr0/h;

    iget v1, p0, Lr0/h$b;->g:I

    add-int/2addr p1, v1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic iterator()Ljava/util/Iterator;
    .locals 1

    invoke-super {p0}, Lr0/h;->t()Lr0/x;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator()Ljava/util/ListIterator;
    .locals 1

    invoke-super {p0}, Lr0/h;->x()Lr0/y;

    move-result-object v0

    return-object v0
.end method

.method public bridge synthetic listIterator(I)Ljava/util/ListIterator;
    .locals 0

    invoke-super {p0, p1}, Lr0/h;->y(I)Lr0/y;

    move-result-object p1

    return-object p1
.end method

.method p()[Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, Lr0/h$b;->i:Lr0/h;

    invoke-virtual {v0}, Lr0/g;->p()[Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method q()I
    .locals 2

    iget-object v0, p0, Lr0/h$b;->i:Lr0/h;

    invoke-virtual {v0}, Lr0/g;->r()I

    move-result v0

    iget v1, p0, Lr0/h$b;->g:I

    add-int/2addr v0, v1

    iget v1, p0, Lr0/h$b;->h:I

    add-int/2addr v0, v1

    return v0
.end method

.method r()I
    .locals 2

    iget-object v0, p0, Lr0/h$b;->i:Lr0/h;

    invoke-virtual {v0}, Lr0/g;->r()I

    move-result v0

    iget v1, p0, Lr0/h$b;->g:I

    add-int/2addr v0, v1

    return v0
.end method

.method public size()I
    .locals 1

    iget v0, p0, Lr0/h$b;->h:I

    return v0
.end method

.method public bridge synthetic subList(II)Ljava/util/List;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lr0/h$b;->B(II)Lr0/h;

    move-result-object p1

    return-object p1
.end method
