.class public Lh1/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh1/c;


# instance fields
.field private final a:Ll1/l;

.field private final b:Ll1/w;

.field private final c:Z

.field private final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ll1/l;Ll1/w;ZLjava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll1/l;",
            "Ll1/w;",
            "Z",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/h;->a:Ll1/l;

    iput-object p2, p0, Lh1/h;->b:Ll1/w;

    iput-boolean p3, p0, Lh1/h;->c:Z

    iput-object p4, p0, Lh1/h;->d:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-boolean v0, p0, Lh1/h;->c:Z

    return v0
.end method

.method public b()Ll1/l;
    .locals 1

    iget-object v0, p0, Lh1/h;->a:Ll1/l;

    return-object v0
.end method

.method public c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lh1/h;->d:Ljava/util/List;

    return-object v0
.end method

.method public d()Ll1/w;
    .locals 1

    iget-object v0, p0, Lh1/h;->b:Ll1/w;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lh1/h;

    iget-boolean v1, p0, Lh1/h;->c:Z

    iget-boolean v2, p1, Lh1/h;->c:Z

    if-eq v1, v2, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Lh1/h;->a:Ll1/l;

    iget-object v2, p1, Lh1/h;->a:Ll1/l;

    invoke-virtual {v1, v2}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Lh1/h;->b:Ll1/w;

    iget-object v2, p1, Lh1/h;->b:Ll1/w;

    invoke-virtual {v1, v2}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    iget-object v0, p0, Lh1/h;->d:Ljava/util/List;

    iget-object p1, p1, Lh1/h;->d:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_5
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lh1/h;->a:Ll1/l;

    invoke-virtual {v0}, Ll1/l;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh1/h;->b:Ll1/w;

    invoke-virtual {v1}, Ll1/w;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-boolean v1, p0, Lh1/h;->c:Z

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh1/h;->d:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
