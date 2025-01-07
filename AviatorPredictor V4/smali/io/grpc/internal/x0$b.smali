.class Lio/grpc/internal/x0$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->S(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$b;->e:Lio/grpc/internal/x0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/x0$b;->e:Lio/grpc/internal/x0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->G(Lio/grpc/internal/x0;Lb3/j1$c;)Lb3/j1$c;

    iget-object v0, p0, Lio/grpc/internal/x0$b;->e:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->y(Lio/grpc/internal/x0;)Lb3/f;

    move-result-object v0

    sget-object v1, Lb3/f$a;->f:Lb3/f$a;

    const-string v2, "CONNECTING after backoff"

    invoke-virtual {v0, v1, v2}, Lb3/f;->a(Lb3/f$a;Ljava/lang/String;)V

    iget-object v0, p0, Lio/grpc/internal/x0$b;->e:Lio/grpc/internal/x0;

    sget-object v1, Lb3/p;->e:Lb3/p;

    invoke-static {v0, v1}, Lio/grpc/internal/x0;->E(Lio/grpc/internal/x0;Lb3/p;)V

    iget-object v0, p0, Lio/grpc/internal/x0$b;->e:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->F(Lio/grpc/internal/x0;)V

    return-void
.end method
