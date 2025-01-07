.class Lz3/f;
.super Lz3/e;
.source ""


# direct methods
.method public static a(Ljava/util/Iterator;)Lz3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/util/Iterator<",
            "+TT;>;)",
            "Lz3/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lz3/f$a;

    invoke-direct {v0, p0}, Lz3/f$a;-><init>(Ljava/util/Iterator;)V

    invoke-static {v0}, Lz3/f;->b(Lz3/b;)Lz3/b;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lz3/b;)Lz3/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lz3/b<",
            "+TT;>;)",
            "Lz3/b<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/i;->d(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Lz3/a;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lz3/a;

    invoke-direct {v0, p0}, Lz3/a;-><init>(Lz3/b;)V

    move-object p0, v0

    :goto_0
    return-object p0
.end method
