.class Lio/grpc/internal/x0$i$a$a;
.super Lio/grpc/internal/i0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0$i$a;->i(Lio/grpc/internal/r;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/r;

.field final synthetic b:Lio/grpc/internal/x0$i$a;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0$i$a;Lio/grpc/internal/r;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$i$a$a;->b:Lio/grpc/internal/x0$i$a;

    iput-object p2, p0, Lio/grpc/internal/x0$i$a$a;->a:Lio/grpc/internal/r;

    invoke-direct {p0}, Lio/grpc/internal/i0;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/x0$i$a$a;->b:Lio/grpc/internal/x0$i$a;

    iget-object v0, v0, Lio/grpc/internal/x0$i$a;->b:Lio/grpc/internal/x0$i;

    invoke-static {v0}, Lio/grpc/internal/x0$i;->h(Lio/grpc/internal/x0$i;)Lio/grpc/internal/m;

    move-result-object v0

    invoke-virtual {p1}, Lb3/f1;->o()Z

    move-result v1

    invoke-virtual {v0, v1}, Lio/grpc/internal/m;->a(Z)V

    invoke-super {p0, p1, p2, p3}, Lio/grpc/internal/i0;->d(Lb3/f1;Lio/grpc/internal/r$a;Lb3/u0;)V

    return-void
.end method

.method protected e()Lio/grpc/internal/r;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/x0$i$a$a;->a:Lio/grpc/internal/r;

    return-object v0
.end method
