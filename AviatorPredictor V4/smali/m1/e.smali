.class public final Lm1/e;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Ll1/r;

.field private final b:Lm1/p;


# direct methods
.method public constructor <init>(Ll1/r;Lm1/p;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/e;->a:Ll1/r;

    iput-object p2, p0, Lm1/e;->b:Lm1/p;

    return-void
.end method


# virtual methods
.method public a()Ll1/r;
    .locals 1

    iget-object v0, p0, Lm1/e;->a:Ll1/r;

    return-object v0
.end method

.method public b()Lm1/p;
    .locals 1

    iget-object v0, p0, Lm1/e;->b:Lm1/p;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_3

    const-class v1, Lm1/e;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Lm1/e;

    iget-object v1, p0, Lm1/e;->a:Ll1/r;

    iget-object v2, p1, Lm1/e;->a:Ll1/r;

    invoke-virtual {v1, v2}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v0, p0, Lm1/e;->b:Lm1/p;

    iget-object p1, p1, Lm1/e;->b:Lm1/p;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lm1/e;->a:Ll1/r;

    invoke-virtual {v0}, Ll1/e;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lm1/e;->b:Lm1/p;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
