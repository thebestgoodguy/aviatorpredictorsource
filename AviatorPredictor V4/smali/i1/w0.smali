.class public Li1/w0;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/w0$a;
    }
.end annotation


# instance fields
.field private final a:Li1/w0$a;

.field final b:Ll1/r;


# direct methods
.method private constructor <init>(Li1/w0$a;Ll1/r;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/w0;->a:Li1/w0$a;

    iput-object p2, p0, Li1/w0;->b:Ll1/r;

    return-void
.end method

.method public static d(Li1/w0$a;Ll1/r;)Li1/w0;
    .locals 1

    new-instance v0, Li1/w0;

    invoke-direct {v0, p0, p1}, Li1/w0;-><init>(Li1/w0$a;Ll1/r;)V

    return-object v0
.end method


# virtual methods
.method a(Ll1/i;Ll1/i;)I
    .locals 3

    iget-object v0, p0, Li1/w0;->b:Ll1/r;

    sget-object v1, Ll1/r;->f:Ll1/r;

    invoke-virtual {v0, v1}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Li1/w0;->a:Li1/w0$a;

    invoke-virtual {v0}, Li1/w0$a;->d()I

    move-result v0

    invoke-interface {p1}, Ll1/i;->getKey()Ll1/l;

    move-result-object p1

    invoke-interface {p2}, Ll1/i;->getKey()Ll1/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Ll1/l;->g(Ll1/l;)I

    move-result p1

    :goto_0
    mul-int v0, v0, p1

    return v0

    :cond_0
    iget-object v0, p0, Li1/w0;->b:Ll1/r;

    invoke-interface {p1, v0}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object p1

    iget-object v0, p0, Li1/w0;->b:Ll1/r;

    invoke-interface {p2, v0}, Ll1/i;->f(Ll1/r;)Lx1/x;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    if-eqz p2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    new-array v0, v0, [Ljava/lang/Object;

    const-string v2, "Trying to compare documents on fields that don\'t exist."

    invoke-static {v1, v2, v0}, Lp1/b;->d(ZLjava/lang/String;[Ljava/lang/Object;)V

    iget-object v0, p0, Li1/w0;->a:Li1/w0$a;

    invoke-virtual {v0}, Li1/w0$a;->d()I

    move-result v0

    invoke-static {p1, p2}, Ll1/y;->i(Lx1/x;Lx1/x;)I

    move-result p1

    goto :goto_0
.end method

.method public b()Li1/w0$a;
    .locals 1

    iget-object v0, p0, Li1/w0;->a:Li1/w0$a;

    return-object v0
.end method

.method public c()Ll1/r;
    .locals 1

    iget-object v0, p0, Li1/w0;->b:Ll1/r;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    instance-of v1, p1, Li1/w0;

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Li1/w0;

    iget-object v1, p0, Li1/w0;->a:Li1/w0$a;

    iget-object v2, p1, Li1/w0;->a:Li1/w0$a;

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Li1/w0;->b:Ll1/r;

    iget-object p1, p1, Li1/w0;->b:Ll1/r;

    invoke-virtual {v1, p1}, Ll1/e;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v0, 0x1

    :cond_1
    :goto_0
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li1/w0;->a:Li1/w0$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    const/16 v1, 0x383

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li1/w0;->b:Ll1/r;

    invoke-virtual {v0}, Ll1/e;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Li1/w0;->a:Li1/w0$a;

    sget-object v2, Li1/w0$a;->f:Li1/w0$a;

    if-ne v1, v2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    const-string v1, "-"

    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/w0;->b:Ll1/r;

    invoke-virtual {v1}, Ll1/r;->h()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
