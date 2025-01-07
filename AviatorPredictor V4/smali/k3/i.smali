.class Lk3/i;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a(Lu3/a;)Lk3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lu3/a<",
            "+TT;>;)",
            "Lk3/g<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "initializer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk3/o;

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-direct {v0, p0, v1, v2, v1}, Lk3/o;-><init>(Lu3/a;Ljava/lang/Object;ILkotlin/jvm/internal/e;)V

    return-object v0
.end method
