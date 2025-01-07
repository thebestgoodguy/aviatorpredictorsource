.class final Lio/grpc/internal/f1$z$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$z;->f()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "b"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$z;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$z;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$z$b;->e:Lio/grpc/internal/f1$z;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$z$b;->e:Lio/grpc/internal/f1$z;

    iget-object v0, v0, Lio/grpc/internal/f1$z;->g:Lio/grpc/internal/x0;

    sget-object v1, Lio/grpc/internal/f1;->r0:Lb3/f1;

    invoke-virtual {v0, v1}, Lio/grpc/internal/x0;->f(Lb3/f1;)V

    return-void
.end method
