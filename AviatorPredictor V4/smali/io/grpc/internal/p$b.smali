.class Lio/grpc/internal/p$b;
.super Lio/grpc/internal/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/p;->D(Lb3/g$a;Lb3/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic f:Lb3/g$a;

.field final synthetic g:Lio/grpc/internal/p;


# direct methods
.method constructor <init>(Lio/grpc/internal/p;Lb3/g$a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/p$b;->g:Lio/grpc/internal/p;

    iput-object p2, p0, Lio/grpc/internal/p$b;->f:Lb3/g$a;

    invoke-static {p1}, Lio/grpc/internal/p;->k(Lio/grpc/internal/p;)Lb3/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lb3/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/p$b;->g:Lio/grpc/internal/p;

    iget-object v1, p0, Lio/grpc/internal/p$b;->f:Lb3/g$a;

    invoke-static {v0}, Lio/grpc/internal/p;->k(Lio/grpc/internal/p;)Lb3/r;

    move-result-object v2

    invoke-static {v2}, Lb3/s;->a(Lb3/r;)Lb3/f1;

    move-result-object v2

    new-instance v3, Lb3/u0;

    invoke-direct {v3}, Lb3/u0;-><init>()V

    invoke-static {v0, v1, v2, v3}, Lio/grpc/internal/p;->l(Lio/grpc/internal/p;Lb3/g$a;Lb3/f1;Lb3/u0;)V

    return-void
.end method
