.class Lio/grpc/internal/y1$p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1;->c0(Lio/grpc/internal/y1$b0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/y1;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/y1$p;->e:Lio/grpc/internal/y1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/y1$p;->e:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->r(Lio/grpc/internal/y1;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/y1$p;->e:Lio/grpc/internal/y1;

    invoke-static {v0}, Lio/grpc/internal/y1;->D(Lio/grpc/internal/y1;)Lio/grpc/internal/r;

    move-result-object v0

    invoke-interface {v0}, Lio/grpc/internal/j2;->b()V

    :cond_0
    return-void
.end method
