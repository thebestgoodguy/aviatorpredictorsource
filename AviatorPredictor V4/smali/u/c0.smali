.class public final Lu/c0;
.super Ljava/lang/Object;
.source ""


# instance fields
.field private final a:Le/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/a<",
            "Lu/b<",
            "*>;",
            "Ls/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Le/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Le/a<",
            "Lu/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final c:Lo0/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo0/i<",
            "Ljava/util/Map<",
            "Lu/b<",
            "*>;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation
.end field

.field private d:I

.field private e:Z


# virtual methods
.method public final a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lu/b<",
            "*>;>;"
        }
    .end annotation

    iget-object v0, p0, Lu/c0;->a:Le/a;

    invoke-virtual {v0}, Le/a;->keySet()Ljava/util/Set;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lu/b;Ls/a;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu/b<",
            "*>;",
            "Ls/a;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    iget-object v0, p0, Lu/c0;->a:Le/a;

    invoke-virtual {v0, p1, p2}, Le/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lu/c0;->b:Le/a;

    invoke-virtual {v0, p1, p3}, Le/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget p1, p0, Lu/c0;->d:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lu/c0;->d:I

    invoke-virtual {p2}, Ls/a;->n0()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    iput-boolean p1, p0, Lu/c0;->e:Z

    :cond_0
    iget p1, p0, Lu/c0;->d:I

    if-nez p1, :cond_2

    iget-boolean p1, p0, Lu/c0;->e:Z

    if-eqz p1, :cond_1

    new-instance p1, Lt/c;

    iget-object p2, p0, Lu/c0;->a:Le/a;

    invoke-direct {p1, p2}, Lt/c;-><init>(Le/a;)V

    iget-object p2, p0, Lu/c0;->c:Lo0/i;

    invoke-virtual {p2, p1}, Lo0/i;->b(Ljava/lang/Exception;)V

    return-void

    :cond_1
    iget-object p1, p0, Lu/c0;->c:Lo0/i;

    iget-object p2, p0, Lu/c0;->b:Le/a;

    invoke-virtual {p1, p2}, Lo0/i;->c(Ljava/lang/Object;)V

    :cond_2
    return-void
.end method
