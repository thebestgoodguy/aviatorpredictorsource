.class public Ld4/n;
.super Ld4/a;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<E:",
        "Ljava/lang/Object;",
        ">",
        "Ld4/a<",
        "TE;>;"
    }
.end annotation


# direct methods
.method public constructor <init>(Lu3/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lu3/l<",
            "-TE;",
            "Lk3/s;",
            ">;)V"
        }
    .end annotation

    invoke-direct {p0, p1}, Ld4/a;-><init>(Lu3/l;)V

    return-void
.end method


# virtual methods
.method protected i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    invoke-super {p0, p1}, Ld4/c;->i(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ld4/b;->b:Lkotlinx/coroutines/internal/y;

    if-ne v0, v1, :cond_1

    return-object v1

    :cond_1
    sget-object v2, Ld4/b;->c:Lkotlinx/coroutines/internal/y;

    if-ne v0, v2, :cond_3

    invoke-virtual {p0, p1}, Ld4/c;->k(Ljava/lang/Object;)Ld4/q;

    move-result-object v0

    if-nez v0, :cond_2

    return-object v1

    :cond_2
    instance-of v1, v0, Ld4/j;

    if-eqz v1, :cond_0

    return-object v0

    :cond_3
    instance-of p1, v0, Ld4/j;

    if-eqz p1, :cond_4

    return-object v0

    :cond_4
    const-string p1, "Invalid offerInternal result "

    invoke-static {p1, v0}, Lkotlin/jvm/internal/i;->i(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method protected final r()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method protected final s()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
