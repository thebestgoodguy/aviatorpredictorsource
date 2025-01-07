.class public abstract Lio/grpc/internal/b;
.super Lb3/r0;
.source ""


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Lb3/r0<",
        "TT;>;>",
        "Lb3/r0<",
        "TT;>;"
    }
.end annotation


# instance fields
.field protected a:I


# direct methods
.method protected constructor <init>()V
    .locals 1

    invoke-direct {p0}, Lb3/r0;-><init>()V

    const/high16 v0, 0x400000

    iput v0, p0, Lio/grpc/internal/b;->a:I

    return-void
.end method


# virtual methods
.method public a()Lb3/q0;
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/b;->e()Lb3/r0;

    move-result-object v0

    invoke-virtual {v0}, Lb3/r0;->a()Lb3/q0;

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

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {p0}, Lio/grpc/internal/b;->e()Lb3/r0;

    move-result-object v1

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
