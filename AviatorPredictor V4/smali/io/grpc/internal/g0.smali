.class Lio/grpc/internal/g0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/s;


# instance fields
.field final a:Lb3/f1;

.field private final b:Lio/grpc/internal/r$a;


# direct methods
.method constructor <init>(Lb3/f1;Lio/grpc/internal/r$a;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    const-string v1, "error must not be OK"

    invoke-static {v0, v1}, Lq0/l;->e(ZLjava/lang/Object;)V

    iput-object p1, p0, Lio/grpc/internal/g0;->a:Lb3/f1;

    iput-object p2, p0, Lio/grpc/internal/g0;->b:Lio/grpc/internal/r$a;

    return-void
.end method


# virtual methods
.method public c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/v0<",
            "**>;",
            "Lb3/u0;",
            "Lb3/c;",
            "[",
            "Lb3/k;",
            ")",
            "Lio/grpc/internal/q;"
        }
    .end annotation

    new-instance p1, Lio/grpc/internal/f0;

    iget-object p2, p0, Lio/grpc/internal/g0;->a:Lb3/f1;

    iget-object p3, p0, Lio/grpc/internal/g0;->b:Lio/grpc/internal/r$a;

    invoke-direct {p1, p2, p3, p4}, Lio/grpc/internal/f0;-><init>(Lb3/f1;Lio/grpc/internal/r$a;[Lb3/k;)V

    return-object p1
.end method

.method public d()Lb3/h0;
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Not a real transport"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
