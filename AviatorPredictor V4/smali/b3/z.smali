.class public abstract Lb3/z;
.super Lb3/z0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<ReqT:",
        "Ljava/lang/Object;",
        "RespT:",
        "Ljava/lang/Object;",
        ">",
        "Lb3/z0<",
        "TReqT;TRespT;>;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lb3/z0;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    invoke-super {p0, p1, p2}, Lb3/z0;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method

.method public bridge synthetic b()V
    .locals 0

    invoke-super {p0}, Lb3/z0;->b()V

    return-void
.end method

.method public bridge synthetic c(I)V
    .locals 0

    invoke-super {p0, p1}, Lb3/z0;->c(I)V

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

    invoke-virtual {p0}, Lb3/z;->f()Lb3/g;

    move-result-object v0

    invoke-virtual {v0, p1}, Lb3/g;->d(Ljava/lang/Object;)V

    return-void
.end method

.method public e(Lb3/g$a;Lb3/u0;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/g$a<",
            "TRespT;>;",
            "Lb3/u0;",
            ")V"
        }
    .end annotation

    invoke-virtual {p0}, Lb3/z;->f()Lb3/g;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lb3/g;->e(Lb3/g$a;Lb3/u0;)V

    return-void
.end method

.method protected abstract f()Lb3/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lb3/g<",
            "TReqT;TRespT;>;"
        }
    .end annotation
.end method

.method public bridge synthetic toString()Ljava/lang/String;
    .locals 1

    invoke-super {p0}, Lb3/z0;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
