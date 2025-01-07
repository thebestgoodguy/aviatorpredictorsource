.class final Lio/grpc/internal/f1$u$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$u;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$u;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$u;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$u$a;->e:Lio/grpc/internal/f1$u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$u$a;->e:Lio/grpc/internal/f1$u;

    iget-object v0, v0, Lio/grpc/internal/f1$u;->d:Lio/grpc/internal/f1;

    invoke-static {v0}, Lio/grpc/internal/f1;->Z(Lio/grpc/internal/f1;)V

    return-void
.end method
