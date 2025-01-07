.class Lio/grpc/internal/f1$w$e;
.super Lb3/g;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$w;->h(Lb3/v0;Lb3/c;)Lb3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lb3/g<",
        "TReqT;TRespT;>;"
    }
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$e;->a:Lio/grpc/internal/f1$w;

    invoke-direct {p0}, Lb3/g;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    return-void
.end method

.method public b()V
    .locals 0

    return-void
.end method

.method public c(I)V
    .locals 0

    return-void
.end method

.method public d(Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TReqT;)V"
        }
    .end annotation

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

    sget-object p2, Lio/grpc/internal/f1;->q0:Lb3/f1;

    new-instance v0, Lb3/u0;

    invoke-direct {v0}, Lb3/u0;-><init>()V

    invoke-virtual {p1, p2, v0}, Lb3/g$a;->a(Lb3/f1;Lb3/u0;)V

    return-void
.end method
