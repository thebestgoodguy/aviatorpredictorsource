.class Lq2/l$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr2/j$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lq2/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lq2/l;


# direct methods
.method constructor <init>(Lq2/l;)V
    .locals 0

    iput-object p1, p0, Lq2/l$b;->a:Lq2/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lr2/i;Lr2/j$d;)V
    .locals 2

    iget-object v0, p1, Lr2/i;->a:Ljava/lang/String;

    iget-object p1, p1, Lr2/i;->b:Ljava/lang/Object;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    const-string v1, "get"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    const-string v1, "put"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    invoke-interface {p2}, Lr2/j$d;->c()V

    goto :goto_2

    :cond_0
    iget-object v0, p0, Lq2/l$b;->a:Lq2/l;

    check-cast p1, [B

    invoke-static {v0, p1}, Lq2/l;->b(Lq2/l;[B)[B

    const/4 p1, 0x0

    :goto_0
    invoke-interface {p2, p1}, Lr2/j$d;->a(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    iget-object p1, p0, Lq2/l$b;->a:Lq2/l;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Lq2/l;->c(Lq2/l;Z)Z

    iget-object p1, p0, Lq2/l$b;->a:Lq2/l;

    invoke-static {p1}, Lq2/l;->d(Lq2/l;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lq2/l$b;->a:Lq2/l;

    iget-boolean v0, p1, Lq2/l;->a:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-static {p1, p2}, Lq2/l;->f(Lq2/l;Lr2/j$d;)Lr2/j$d;

    goto :goto_2

    :cond_3
    :goto_1
    iget-object p1, p0, Lq2/l$b;->a:Lq2/l;

    invoke-static {p1}, Lq2/l;->a(Lq2/l;)[B

    move-result-object v0

    invoke-static {p1, v0}, Lq2/l;->e(Lq2/l;[B)Ljava/util/Map;

    move-result-object p1

    goto :goto_0

    :goto_2
    return-void
.end method
