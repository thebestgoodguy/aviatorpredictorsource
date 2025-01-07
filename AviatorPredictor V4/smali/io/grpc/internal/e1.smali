.class final Lio/grpc/internal/e1;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static a()Lio/grpc/internal/d1;
    .locals 1

    invoke-static {}, Lio/grpc/internal/w1;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Lio/grpc/internal/w1;

    invoke-direct {v0}, Lio/grpc/internal/w1;-><init>()V

    return-object v0

    :cond_0
    new-instance v0, Lio/grpc/internal/i;

    invoke-direct {v0}, Lio/grpc/internal/i;-><init>()V

    return-object v0
.end method
