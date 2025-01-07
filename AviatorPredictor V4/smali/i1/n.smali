.class public Li1/n;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li1/n$a;
    }
.end annotation


# instance fields
.field private final a:Li1/n$a;

.field private final b:Ll1/i;


# direct methods
.method private constructor <init>(Li1/n$a;Ll1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Li1/n;->a:Li1/n$a;

    iput-object p2, p0, Li1/n;->b:Ll1/i;

    return-void
.end method

.method public static a(Li1/n$a;Ll1/i;)Li1/n;
    .locals 1

    new-instance v0, Li1/n;

    invoke-direct {v0, p0, p1}, Li1/n;-><init>(Li1/n$a;Ll1/i;)V

    return-object v0
.end method


# virtual methods
.method public b()Ll1/i;
    .locals 1

    iget-object v0, p0, Li1/n;->b:Ll1/i;

    return-object v0
.end method

.method public c()Li1/n$a;
    .locals 1

    iget-object v0, p0, Li1/n;->a:Li1/n$a;

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Li1/n;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Li1/n;

    iget-object v0, p0, Li1/n;->a:Li1/n$a;

    iget-object v2, p1, Li1/n;->a:Li1/n$a;

    invoke-virtual {v0, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Li1/n;->b:Ll1/i;

    iget-object p1, p1, Li1/n;->b:Ll1/i;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Li1/n;->a:Li1/n$a;

    invoke-virtual {v0}, Ljava/lang/Enum;->hashCode()I

    move-result v0

    const/16 v1, 0x763

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li1/n;->b:Ll1/i;

    invoke-interface {v0}, Ll1/i;->getKey()Ll1/l;

    move-result-object v0

    invoke-virtual {v0}, Ll1/l;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Li1/n;->b:Ll1/i;

    invoke-interface {v0}, Ll1/i;->k()Ll1/t;

    move-result-object v0

    invoke-virtual {v0}, Ll1/t;->hashCode()I

    move-result v0

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "DocumentViewChange("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/n;->b:Ll1/i;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Li1/n;->a:Li1/n$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
