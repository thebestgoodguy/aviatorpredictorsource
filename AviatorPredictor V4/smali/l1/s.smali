.class public final Ll1/s;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ll1/i;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll1/s$a;,
        Ll1/s$b;
    }
.end annotation


# instance fields
.field private final b:Ll1/l;

.field private c:Ll1/s$b;

.field private d:Ll1/w;

.field private e:Ll1/w;

.field private f:Ll1/t;

.field private g:Ll1/s$a;


# direct methods
.method private constructor <init>(Ll1/l;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s;->b:Ll1/l;

    sget-object p1, Ll1/w;->f:Ll1/w;

    iput-object p1, p0, Ll1/s;->e:Ll1/w;

    return-void
.end method

.method private constructor <init>(Ll1/l;Ll1/s$b;Ll1/w;Ll1/w;Ll1/t;Ll1/s$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll1/s;->b:Ll1/l;

    iput-object p3, p0, Ll1/s;->d:Ll1/w;

    iput-object p4, p0, Ll1/s;->e:Ll1/w;

    iput-object p2, p0, Ll1/s;->c:Ll1/s$b;

    iput-object p6, p0, Ll1/s;->g:Ll1/s$a;

    iput-object p5, p0, Ll1/s;->f:Ll1/t;

    return-void
.end method

.method public static p(Ll1/l;Ll1/w;Ll1/t;)Ll1/s;
    .locals 1

    new-instance v0, Ll1/s;

    invoke-direct {v0, p0}, Ll1/s;-><init>(Ll1/l;)V

    invoke-virtual {v0, p1, p2}, Ll1/s;->l(Ll1/w;Ll1/t;)Ll1/s;

    move-result-object p0

    return-object p0
.end method

.method public static q(Ll1/l;)Ll1/s;
    .locals 8

    new-instance v7, Ll1/s;

    sget-object v2, Ll1/s$b;->e:Ll1/s$b;

    sget-object v4, Ll1/w;->f:Ll1/w;

    new-instance v5, Ll1/t;

    invoke-direct {v5}, Ll1/t;-><init>()V

    sget-object v6, Ll1/s$a;->g:Ll1/s$a;

    move-object v0, v7

    move-object v1, p0

    move-object v3, v4

    invoke-direct/range {v0 .. v6}, Ll1/s;-><init>(Ll1/l;Ll1/s$b;Ll1/w;Ll1/w;Ll1/t;Ll1/s$a;)V

    return-object v7
.end method

.method public static r(Ll1/l;Ll1/w;)Ll1/s;
    .locals 1

    new-instance v0, Ll1/s;

    invoke-direct {v0, p0}, Ll1/s;-><init>(Ll1/l;)V

    invoke-virtual {v0, p1}, Ll1/s;->m(Ll1/w;)Ll1/s;

    move-result-object p0

    return-object p0
.end method

.method public static s(Ll1/l;Ll1/w;)Ll1/s;
    .locals 1

    new-instance v0, Ll1/s;

    invoke-direct {v0, p0}, Ll1/s;-><init>(Ll1/l;)V

    invoke-virtual {v0, p1}, Ll1/s;->n(Ll1/w;)Ll1/s;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public a()Ll1/s;
    .locals 8

    new-instance v7, Ll1/s;

    iget-object v1, p0, Ll1/s;->b:Ll1/l;

    iget-object v2, p0, Ll1/s;->c:Ll1/s$b;

    iget-object v3, p0, Ll1/s;->d:Ll1/w;

    iget-object v4, p0, Ll1/s;->e:Ll1/w;

    iget-object v0, p0, Ll1/s;->f:Ll1/t;

    invoke-virtual {v0}, Ll1/t;->c()Ll1/t;

    move-result-object v5

    iget-object v6, p0, Ll1/s;->g:Ll1/s$a;

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Ll1/s;-><init>(Ll1/l;Ll1/s$b;Ll1/w;Ll1/w;Ll1/t;Ll1/s$a;)V

    return-object v7
.end method

.method public b()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->c:Ll1/s$b;

    sget-object v1, Ll1/s$b;->f:Ll1/s$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public c()Z
    .locals 1

    invoke-virtual {p0}, Ll1/s;->i()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Ll1/s;->g()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method public d()Ll1/w;
    .locals 1

    iget-object v0, p0, Ll1/s;->e:Ll1/w;

    return-object v0
.end method

.method public e()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->c:Ll1/s$b;

    sget-object v1, Ll1/s$b;->g:Ll1/s$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 v0, 0x0

    if-eqz p1, :cond_6

    const-class v1, Ll1/s;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    :cond_1
    check-cast p1, Ll1/s;

    iget-object v1, p0, Ll1/s;->b:Ll1/l;

    iget-object v2, p1, Ll1/s;->b:Ll1/l;

    invoke-virtual {v1, v2}, Ll1/l;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v0

    :cond_2
    iget-object v1, p0, Ll1/s;->d:Ll1/w;

    iget-object v2, p1, Ll1/s;->d:Ll1/w;

    invoke-virtual {v1, v2}, Ll1/w;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v0

    :cond_3
    iget-object v1, p0, Ll1/s;->c:Ll1/s$b;

    iget-object v2, p1, Ll1/s;->c:Ll1/s$b;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v0

    :cond_4
    iget-object v1, p0, Ll1/s;->g:Ll1/s$a;

    iget-object v2, p1, Ll1/s;->g:Ll1/s$a;

    invoke-virtual {v1, v2}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v0

    :cond_5
    iget-object v0, p0, Ll1/s;->f:Ll1/t;

    iget-object p1, p1, Ll1/s;->f:Ll1/t;

    invoke-virtual {v0, p1}, Ll1/t;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_6
    :goto_0
    return v0
.end method

.method public f(Ll1/r;)Lx1/x;
    .locals 1

    invoke-virtual {p0}, Ll1/s;->k()Ll1/t;

    move-result-object v0

    invoke-virtual {v0, p1}, Ll1/t;->h(Ll1/r;)Lx1/x;

    move-result-object p1

    return-object p1
.end method

.method public g()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->g:Ll1/s$a;

    sget-object v1, Ll1/s$a;->f:Ll1/s$a;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public getKey()Ll1/l;
    .locals 1

    iget-object v0, p0, Ll1/s;->b:Ll1/l;

    return-object v0
.end method

.method public h()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->c:Ll1/s$b;

    sget-object v1, Ll1/s$b;->h:Ll1/s$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, Ll1/s;->b:Ll1/l;

    invoke-virtual {v0}, Ll1/l;->hashCode()I

    move-result v0

    return v0
.end method

.method public i()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->g:Ll1/s$a;

    sget-object v1, Ll1/s$a;->e:Ll1/s$a;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    return v0
.end method

.method public j()Ll1/w;
    .locals 1

    iget-object v0, p0, Ll1/s;->d:Ll1/w;

    return-object v0
.end method

.method public k()Ll1/t;
    .locals 1

    iget-object v0, p0, Ll1/s;->f:Ll1/t;

    return-object v0
.end method

.method public l(Ll1/w;Ll1/t;)Ll1/s;
    .locals 0

    iput-object p1, p0, Ll1/s;->d:Ll1/w;

    sget-object p1, Ll1/s$b;->f:Ll1/s$b;

    iput-object p1, p0, Ll1/s;->c:Ll1/s$b;

    iput-object p2, p0, Ll1/s;->f:Ll1/t;

    sget-object p1, Ll1/s$a;->g:Ll1/s$a;

    iput-object p1, p0, Ll1/s;->g:Ll1/s$a;

    return-object p0
.end method

.method public m(Ll1/w;)Ll1/s;
    .locals 0

    iput-object p1, p0, Ll1/s;->d:Ll1/w;

    sget-object p1, Ll1/s$b;->g:Ll1/s$b;

    iput-object p1, p0, Ll1/s;->c:Ll1/s$b;

    new-instance p1, Ll1/t;

    invoke-direct {p1}, Ll1/t;-><init>()V

    iput-object p1, p0, Ll1/s;->f:Ll1/t;

    sget-object p1, Ll1/s$a;->g:Ll1/s$a;

    iput-object p1, p0, Ll1/s;->g:Ll1/s$a;

    return-object p0
.end method

.method public n(Ll1/w;)Ll1/s;
    .locals 0

    iput-object p1, p0, Ll1/s;->d:Ll1/w;

    sget-object p1, Ll1/s$b;->h:Ll1/s$b;

    iput-object p1, p0, Ll1/s;->c:Ll1/s$b;

    new-instance p1, Ll1/t;

    invoke-direct {p1}, Ll1/t;-><init>()V

    iput-object p1, p0, Ll1/s;->f:Ll1/t;

    sget-object p1, Ll1/s$a;->f:Ll1/s$a;

    iput-object p1, p0, Ll1/s;->g:Ll1/s$a;

    return-object p0
.end method

.method public o()Z
    .locals 2

    iget-object v0, p0, Ll1/s;->c:Ll1/s$b;

    sget-object v1, Ll1/s$b;->e:Ll1/s$b;

    invoke-virtual {v0, v1}, Ljava/lang/Enum;->equals(Ljava/lang/Object;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public t()Ll1/s;
    .locals 1

    sget-object v0, Ll1/s$a;->f:Ll1/s$a;

    iput-object v0, p0, Ll1/s;->g:Ll1/s$a;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Document{key="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->b:Ll1/l;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", version="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->d:Ll1/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", readTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->e:Ll1/w;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->c:Ll1/s$b;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", documentState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->g:Ll1/s$a;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Ll1/s;->f:Ll1/t;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public u()Ll1/s;
    .locals 1

    sget-object v0, Ll1/s$a;->e:Ll1/s$a;

    iput-object v0, p0, Ll1/s;->g:Ll1/s$a;

    sget-object v0, Ll1/w;->f:Ll1/w;

    iput-object v0, p0, Ll1/s;->d:Ll1/w;

    return-object p0
.end method

.method public v(Ll1/w;)Ll1/s;
    .locals 0

    iput-object p1, p0, Ll1/s;->e:Ll1/w;

    return-object p0
.end method
