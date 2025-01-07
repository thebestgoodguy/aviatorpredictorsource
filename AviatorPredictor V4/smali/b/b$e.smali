.class abstract Lb/b$e;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/util/Iterator;
.implements Lb/b$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lb/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x40a
    name = "e"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "Lb/b$f<",
        "TK;TV;>;"
    }
.end annotation


# instance fields
.field e:Lb/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field f:Lb/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Lb/b$c;Lb/b$c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;",
            "Lb/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lb/b$e;->e:Lb/b$c;

    iput-object p1, p0, Lb/b$e;->f:Lb/b$c;

    return-void
.end method

.method private g()Lb/b$c;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/b$e;->f:Lb/b$c;

    iget-object v1, p0, Lb/b$e;->e:Lb/b$c;

    if-eq v0, v1, :cond_1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0, v0}, Lb/b$e;->e(Lb/b$c;)Lb/b$c;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method


# virtual methods
.method public c(Lb/b$c;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;)V"
        }
    .end annotation

    iget-object v0, p0, Lb/b$e;->e:Lb/b$c;

    if-ne v0, p1, :cond_0

    iget-object v0, p0, Lb/b$e;->f:Lb/b$c;

    if-ne p1, v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lb/b$e;->f:Lb/b$c;

    iput-object v0, p0, Lb/b$e;->e:Lb/b$c;

    :cond_0
    iget-object v0, p0, Lb/b$e;->e:Lb/b$c;

    if-ne v0, p1, :cond_1

    invoke-virtual {p0, v0}, Lb/b$e;->d(Lb/b$c;)Lb/b$c;

    move-result-object v0

    iput-object v0, p0, Lb/b$e;->e:Lb/b$c;

    :cond_1
    iget-object v0, p0, Lb/b$e;->f:Lb/b$c;

    if-ne v0, p1, :cond_2

    invoke-direct {p0}, Lb/b$e;->g()Lb/b$c;

    move-result-object p1

    iput-object p1, p0, Lb/b$e;->f:Lb/b$c;

    :cond_2
    return-void
.end method

.method abstract d(Lb/b$c;)Lb/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;)",
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method abstract e(Lb/b$c;)Lb/b$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb/b$c<",
            "TK;TV;>;)",
            "Lb/b$c<",
            "TK;TV;>;"
        }
    .end annotation
.end method

.method public f()Ljava/util/Map$Entry;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map$Entry<",
            "TK;TV;>;"
        }
    .end annotation

    iget-object v0, p0, Lb/b$e;->f:Lb/b$c;

    invoke-direct {p0}, Lb/b$e;->g()Lb/b$c;

    move-result-object v1

    iput-object v1, p0, Lb/b$e;->f:Lb/b$c;

    return-object v0
.end method

.method public hasNext()Z
    .locals 1

    iget-object v0, p0, Lb/b$e;->f:Lb/b$c;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lb/b$e;->f()Ljava/util/Map$Entry;

    move-result-object v0

    return-object v0
.end method
