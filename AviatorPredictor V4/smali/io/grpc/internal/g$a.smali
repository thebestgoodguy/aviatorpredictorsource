.class Lio/grpc/internal/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/g;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:I

.field final synthetic f:Lio/grpc/internal/g;


# direct methods
.method constructor <init>(Lio/grpc/internal/g;I)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/g$a;->f:Lio/grpc/internal/g;

    iput p2, p0, Lio/grpc/internal/g$a;->e:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/g$a;->f:Lio/grpc/internal/g;

    invoke-static {v0}, Lio/grpc/internal/g;->e(Lio/grpc/internal/g;)Lio/grpc/internal/k1$b;

    move-result-object v0

    iget v1, p0, Lio/grpc/internal/g$a;->e:I

    invoke-interface {v0, v1}, Lio/grpc/internal/k1$b;->d(I)V

    return-void
.end method
