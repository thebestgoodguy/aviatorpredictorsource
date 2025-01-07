.class Ld3/h$a;
.super Lio/grpc/internal/v0;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ld3/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lio/grpc/internal/v0<",
        "Ld3/g;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic b:Ld3/h;


# direct methods
.method constructor <init>(Ld3/h;)V
    .locals 0

    iput-object p1, p0, Ld3/h$a;->b:Ld3/h;

    invoke-direct {p0}, Lio/grpc/internal/v0;-><init>()V

    return-void
.end method


# virtual methods
.method protected b()V
    .locals 2

    iget-object v0, p0, Ld3/h$a;->b:Ld3/h;

    invoke-static {v0}, Ld3/h;->h(Ld3/h;)Lio/grpc/internal/j1$a;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->d(Z)V

    return-void
.end method

.method protected c()V
    .locals 2

    iget-object v0, p0, Ld3/h$a;->b:Ld3/h;

    invoke-static {v0}, Ld3/h;->h(Ld3/h;)Lio/grpc/internal/j1$a;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lio/grpc/internal/j1$a;->d(Z)V

    return-void
.end method
