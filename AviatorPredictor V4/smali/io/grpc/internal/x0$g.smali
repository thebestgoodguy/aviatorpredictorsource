.class Lio/grpc/internal/x0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/x0;->Q(Lio/grpc/internal/v;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/v;

.field final synthetic f:Z

.field final synthetic g:Lio/grpc/internal/x0;


# direct methods
.method constructor <init>(Lio/grpc/internal/x0;Lio/grpc/internal/v;Z)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/x0$g;->g:Lio/grpc/internal/x0;

    iput-object p2, p0, Lio/grpc/internal/x0$g;->e:Lio/grpc/internal/v;

    iput-boolean p3, p0, Lio/grpc/internal/x0$g;->f:Z

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/x0$g;->g:Lio/grpc/internal/x0;

    invoke-static {v0}, Lio/grpc/internal/x0;->x(Lio/grpc/internal/x0;)Lio/grpc/internal/v0;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/x0$g;->e:Lio/grpc/internal/v;

    iget-boolean v2, p0, Lio/grpc/internal/x0$g;->f:Z

    invoke-virtual {v0, v1, v2}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    return-void
.end method
