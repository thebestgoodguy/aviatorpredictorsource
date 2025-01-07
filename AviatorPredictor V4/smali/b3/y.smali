.class public abstract Lb3/y;
.super Lb3/r0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lb3/y<",
        "TT;>;>",
        "Lb3/r0<",
        "TT;>;"
    }
.end annotation


# direct methods
.method protected constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/r0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic c(JLjava/util/concurrent/TimeUnit;)Lb3/r0;
    .locals 0

    invoke-virtual {p0, p1, p2, p3}, Lb3/y;->f(JLjava/util/concurrent/TimeUnit;)Lb3/y;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic d()Lb3/r0;
    .locals 1

    invoke-virtual {p0}, Lb3/y;->h()Lb3/y;

    move-result-object v0

    return-object v0
.end method

.method protected abstract e()Lb3/r0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/r0<",
            "*>;"
        }
    .end annotation
.end method

.method public f(JLjava/util/concurrent/TimeUnit;)Lb3/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/concurrent/TimeUnit;",
            ")TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lb3/y;->e()Lb3/r0;

    move-result-object v0

    invoke-virtual {v0, p1, p2, p3}, Lb3/r0;->c(JLjava/util/concurrent/TimeUnit;)Lb3/r0;

    invoke-virtual {p0}, Lb3/y;->g()Lb3/y;

    move-result-object p1

    return-object p1
.end method

.method protected final g()Lb3/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    return-object p0
.end method

.method public h()Lb3/y;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-virtual {p0}, Lb3/y;->e()Lb3/r0;

    move-result-object v0

    invoke-virtual {v0}, Lb3/r0;->d()Lb3/r0;

    invoke-virtual {p0}, Lb3/y;->g()Lb3/y;

    move-result-object v0

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lb3/y;->e()Lb3/r0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
