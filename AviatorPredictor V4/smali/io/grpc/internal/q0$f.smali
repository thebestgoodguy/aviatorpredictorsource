.class Lio/grpc/internal/q0$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/s;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/q0;->j(Lb3/n0$e;Z)Lio/grpc/internal/s;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lb3/k$a;

.field final synthetic b:Lio/grpc/internal/s;


# direct methods
.method constructor <init>(Lb3/k$a;Lio/grpc/internal/s;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/q0$f;->a:Lb3/k$a;

    iput-object p2, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;
    .locals 4
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

    invoke-static {}, Lb3/k$b;->a()Lb3/k$b$a;

    move-result-object v0

    invoke-virtual {v0, p3}, Lb3/k$b$a;->b(Lb3/c;)Lb3/k$b$a;

    move-result-object v0

    invoke-virtual {v0}, Lb3/k$b$a;->a()Lb3/k$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/q0$f;->a:Lb3/k$a;

    invoke-virtual {v1, v0, p2}, Lb3/k$a;->a(Lb3/k$b;Lb3/u0;)Lb3/k;

    move-result-object v0

    array-length v1, p4

    const/4 v2, 0x1

    sub-int/2addr v1, v2

    aget-object v1, p4, v1

    invoke-static {}, Lio/grpc/internal/q0;->a()Lb3/k;

    move-result-object v3

    if-ne v1, v3, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const-string v3, "lb tracer already assigned"

    invoke-static {v1, v3}, Lq0/l;->u(ZLjava/lang/Object;)V

    array-length v1, p4

    sub-int/2addr v1, v2

    aput-object v0, p4, v1

    iget-object v0, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-interface {v0, p1, p2, p3, p4}, Lio/grpc/internal/s;->c(Lb3/v0;Lb3/u0;Lb3/c;[Lb3/k;)Lio/grpc/internal/q;

    move-result-object p1

    return-object p1
.end method

.method public d()Lb3/h0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/q0$f;->b:Lio/grpc/internal/s;

    invoke-interface {v0}, Lb3/l0;->d()Lb3/h0;

    move-result-object v0

    return-object v0
.end method
