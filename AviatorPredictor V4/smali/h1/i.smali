.class public Lh1/i;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh1/c;


# instance fields
.field private final a:Li1/c1;

.field private final b:Li1/x0$a;


# direct methods
.method public constructor <init>(Li1/c1;Li1/x0$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh1/i;->a:Li1/c1;

    iput-object p2, p0, Lh1/i;->b:Li1/x0$a;

    return-void
.end method


# virtual methods
.method public a()Li1/x0$a;
    .locals 1

    iget-object v0, p0, Lh1/i;->b:Li1/x0$a;

    return-object v0
.end method

.method public b()Li1/c1;
    .locals 1

    iget-object v0, p0, Lh1/i;->a:Li1/c1;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_1

    :cond_1
    check-cast p1, Lh1/i;

    iget-object v2, p0, Lh1/i;->a:Li1/c1;

    iget-object v3, p1, Lh1/i;->a:Li1/c1;

    invoke-virtual {v2, v3}, Li1/c1;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    return v1

    :cond_2
    iget-object v2, p0, Lh1/i;->b:Li1/x0$a;

    iget-object p1, p1, Lh1/i;->b:Li1/x0$a;

    if-ne v2, p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v0, 0x0

    :goto_0
    return v0

    :cond_4
    :goto_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lh1/i;->a:Li1/c1;

    invoke-virtual {v0}, Li1/c1;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lh1/i;->b:Li1/x0$a;

    invoke-virtual {v1}, Ljava/lang/Enum;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
