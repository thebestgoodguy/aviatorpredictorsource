.class abstract Lio/grpc/internal/m0;
.super Lb3/w0;
.source ""


# instance fields
.field private final a:Lb3/w0;


# direct methods
.method constructor <init>(Lb3/w0;)V
    .locals 1

    invoke-direct {p0}, Lb3/w0;-><init>()V

    const-string v0, "delegate can not be null"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    return-void
.end method


# virtual methods
.method public b()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    invoke-virtual {v0}, Lb3/w0;->b()V

    return-void
.end method

.method public c()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    invoke-virtual {v0}, Lb3/w0;->c()V

    return-void
.end method

.method public d(Lb3/w0$e;)V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    invoke-virtual {v0, p1}, Lb3/w0;->d(Lb3/w0$e;)V

    return-void
.end method

.method public e(Lb3/w0$f;)V
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    iget-object v0, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    invoke-virtual {v0, p1}, Lb3/w0;->e(Lb3/w0$f;)V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lq0/h;->c(Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/m0;->a:Lb3/w0;

    const-string v2, "delegate"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
