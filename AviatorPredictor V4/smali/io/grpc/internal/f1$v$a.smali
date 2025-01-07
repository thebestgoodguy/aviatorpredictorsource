.class final Lio/grpc/internal/f1$v$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$v;->b(Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "a"
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lio/grpc/internal/f1$v;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$v;Lb3/f1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$v$a;->f:Lio/grpc/internal/f1$v;

    iput-object p2, p0, Lio/grpc/internal/f1$v$a;->e:Lb3/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/f1$v$a;->f:Lio/grpc/internal/f1$v;

    iget-object v1, p0, Lio/grpc/internal/f1$v$a;->e:Lb3/f1;

    invoke-static {v0, v1}, Lio/grpc/internal/f1$v;->d(Lio/grpc/internal/f1$v;Lb3/f1;)V

    return-void
.end method
