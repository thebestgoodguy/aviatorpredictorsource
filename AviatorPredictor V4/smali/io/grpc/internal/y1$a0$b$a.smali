.class Lio/grpc/internal/y1$a0$b$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1$a0$b;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/y1$a0$b;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1$a0$b;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$a0$b$a;->e:Lio/grpc/internal/y1$a0$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/y1$a0$b$a;->e:Lio/grpc/internal/y1$a0$b;

    iget-object v0, v0, Lio/grpc/internal/y1$a0$b;->e:Lio/grpc/internal/y1$a0;

    iget-object v1, v0, Lio/grpc/internal/y1$a0;->b:Lio/grpc/internal/y1;

    iget-object v0, v0, Lio/grpc/internal/y1$a0;->a:Lio/grpc/internal/y1$b0;

    iget v0, v0, Lio/grpc/internal/y1$b0;->d:I

    add-int/lit8 v0, v0, 0x1

    const/4 v2, 0x0

    invoke-static {v1, v0, v2}, Lio/grpc/internal/y1;->S(Lio/grpc/internal/y1;IZ)Lio/grpc/internal/y1$b0;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/y1$a0$b$a;->e:Lio/grpc/internal/y1$a0$b;

    iget-object v1, v1, Lio/grpc/internal/y1$a0$b;->e:Lio/grpc/internal/y1$a0;

    iget-object v1, v1, Lio/grpc/internal/y1$a0;->b:Lio/grpc/internal/y1;

    invoke-static {v1, v0}, Lio/grpc/internal/y1;->u(Lio/grpc/internal/y1;Lio/grpc/internal/y1$b0;)V

    return-void
.end method
