.class public final Ln3/f;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Lu3/p;Ljava/lang/Object;Ln3/d;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            "T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/p<",
            "-TR;-",
            "Ln3/d<",
            "-TT;>;+",
            "Ljava/lang/Object;",
            ">;TR;",
            "Ln3/d<",
            "-TT;>;)V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "completion"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1, p2}, Lo3/b;->a(Lu3/p;Ljava/lang/Object;Ln3/d;)Ln3/d;

    move-result-object p0

    invoke-static {p0}, Lo3/b;->b(Ln3/d;)Ln3/d;

    move-result-object p0

    sget-object p1, Lk3/m;->e:Lk3/m$a;

    sget-object p1, Lk3/s;->a:Lk3/s;

    invoke-static {p1}, Lk3/m;->a(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Ln3/d;->resumeWith(Ljava/lang/Object;)V

    return-void
.end method
