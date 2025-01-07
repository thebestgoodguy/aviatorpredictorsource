.class final Li3/a$b;
.super Li3/a$e;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Li3/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private final a:Lb3/f1;


# direct methods
.method constructor <init>(Lb3/f1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Li3/a$e;-><init>(Li3/a$a;)V

    const-string v0, "status"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/f1;

    iput-object p1, p0, Li3/a$b;->a:Lb3/f1;

    return-void
.end method


# virtual methods
.method public a(Lb3/n0$f;)Lb3/n0$e;
    .locals 0

    iget-object p1, p0, Li3/a$b;->a:Lb3/f1;

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {}, Lb3/n0$e;->g()Lb3/n0$e;

    move-result-object p1

    goto :goto_0

    :cond_0
    iget-object p1, p0, Li3/a$b;->a:Lb3/f1;

    invoke-static {p1}, Lb3/n0$e;->f(Lb3/f1;)Lb3/n0$e;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method c(Li3/a$e;)Z
    .locals 2

    instance-of v0, p1, Li3/a$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Li3/a$b;->a:Lb3/f1;

    check-cast p1, Li3/a$b;

    iget-object v1, p1, Li3/a$b;->a:Lb3/f1;

    invoke-static {v0, v1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Li3/a$b;->a:Lb3/f1;

    invoke-virtual {v0}, Lb3/f1;->o()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p1, Li3/a$b;->a:Lb3/f1;

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result p1

    if-eqz p1, :cond_1

    :cond_0
    const/4 p1, 0x1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Li3/a$b;

    invoke-static {v0}, Lq0/h;->b(Ljava/lang/Class;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Li3/a$b;->a:Lb3/f1;

    const-string v2, "status"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
