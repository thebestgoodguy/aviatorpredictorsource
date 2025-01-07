.class final Lio/grpc/internal/f1$h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->N0()Lio/grpc/internal/f1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "h"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$h;->e:Lio/grpc/internal/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$h;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->G(Lio/grpc/internal/f1;)Lb3/f;

    move-result-object v0

    sget-object v1, Lb3/f$a;->f:Lb3/f$a;

    const-string v2, "Entering SHUTDOWN state"

    invoke-virtual {v0, v1, v2}, Lb3/f;->a(Lb3/f$a;Ljava/lang/String;)V

    iget-object v0, p0, Lio/grpc/internal/f1$h;->e:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Y(Lio/grpc/internal/f1;)Lio/grpc/internal/w;

    move-result-object v0

    sget-object v1, Lb3/p;->i:Lb3/p;

    invoke-virtual {v0, v1}, Lio/grpc/internal/w;->b(Lb3/p;)V

    return-void
.end method
