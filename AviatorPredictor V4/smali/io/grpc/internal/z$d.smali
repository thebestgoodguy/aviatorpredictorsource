.class Lio/grpc/internal/z$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z;->j(Lb3/f1;Z)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Lb3/f1;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$d;->f:Lio/grpc/internal/z;

    iput-object p2, p0, Lio/grpc/internal/z$d;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$d;->f:Lio/grpc/internal/z;

    invoke-static {v0}, Lio/grpc/internal/z;->g(Lio/grpc/internal/z;)Lb3/g;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$d;->e:Lb3/f1;

    invoke-virtual {v1}, Lb3/f1;->n()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lio/grpc/internal/z$d;->e:Lb3/f1;

    invoke-virtual {v2}, Lb3/f1;->l()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lb3/g;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
