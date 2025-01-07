.class public abstract Lm1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm1/p;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lm1/a$a;,
        Lm1/a$b;
    }
.end annotation


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method constructor <init>(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lm1/a;->a:Ljava/util/List;

    return-void
.end method

.method static e(Lx1/x;)Lx1/a$b;
    .locals 1

    invoke-static {p0}, Ll1/y;->t(Lx1/x;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lx1/x;->f0()Lx1/a;

    move-result-object p0

    invoke-virtual {p0}, Lcom/google/protobuf/a0;->S()Lcom/google/protobuf/a0$a;

    move-result-object p0

    check-cast p0, Lx1/a$b;

    return-object p0

    :cond_0
    invoke-static {}, Lx1/a;->d0()Lx1/a$b;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a(Lx1/x;Lx0/o;)Lx1/x;
    .locals 0

    invoke-virtual {p0, p1}, Lm1/a;->d(Lx1/x;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public b(Lx1/x;Lx1/x;)Lx1/x;
    .locals 0

    invoke-virtual {p0, p1}, Lm1/a;->d(Lx1/x;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public c(Lx1/x;)Lx1/x;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method protected abstract d(Lx1/x;)Lx1/x;
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lm1/a;

    iget-object v0, p0, Lm1/a;->a:Ljava/util/List;

    iget-object p1, p1, Lm1/a;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public f()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lx1/x;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lm1/a;->a:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm1/a;->a:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
