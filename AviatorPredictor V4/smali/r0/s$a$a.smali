.class Lr0/s$a$a;
.super Lr0/h;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lr0/s$a;->y()Lr0/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lr0/h<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;"
    }
.end annotation


# instance fields
.field final synthetic g:Lr0/s$a;


# direct methods
.method constructor <init>(Lr0/s$a;)V
    .locals 0

    iput-object p1, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-direct {p0}, Lr0/h;-><init>()V

    return-void
.end method


# virtual methods
.method public D(I)Ljava/util/Map$Entry;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v0}, Lr0/s$a;->D(Lr0/s$a;)I

    move-result v0

    invoke-static {p1, v0}, Lq0/l;->l(II)I

    iget-object v0, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v0}, Lr0/s$a;->E(Lr0/s$a;)[Ljava/lang/Object;

    move-result-object v0

    mul-int/lit8 p1, p1, 0x2

    iget-object v1, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v1}, Lr0/s$a;->F(Lr0/s$a;)I

    move-result v1

    add-int/2addr v1, p1

    aget-object v0, v0, v1

    iget-object v1, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v1}, Lr0/s$a;->E(Lr0/s$a;)[Ljava/lang/Object;

    move-result-object v1

    iget-object v2, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v2}, Lr0/s$a;->F(Lr0/s$a;)I

    move-result v2

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr p1, v2

    aget-object p1, v1, p1

    new-instance v1, Ljava/util/AbstractMap$SimpleImmutableEntry;

    invoke-direct {v1, v0, p1}, Ljava/util/AbstractMap$SimpleImmutableEntry;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object v1
.end method

.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1}, Lr0/s$a$a;->D(I)Ljava/util/Map$Entry;

    move-result-object p1

    return-object p1
.end method

.method public size()I
    .locals 1

    iget-object v0, p0, Lr0/s$a$a;->g:Lr0/s$a;

    invoke-static {v0}, Lr0/s$a;->D(Lr0/s$a;)I

    move-result v0

    return v0
.end method
