.class Lio/grpc/internal/z$j$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z$j;->c(Ljava/lang/Object;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Ljava/lang/Object;

.field final synthetic f:Lio/grpc/internal/z$j;


# direct methods
.method constructor <init>(Lio/grpc/internal/z$j;Ljava/lang/Object;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$j$b;->f:Lio/grpc/internal/z$j;

    iput-object p2, p0, Lio/grpc/internal/z$j$b;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/z$j$b;->f:Lio/grpc/internal/z$j;

    invoke-static {v0}, Lio/grpc/internal/z$j;->e(Lio/grpc/internal/z$j;)Lb3/g$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$j$b;->e:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Lb3/g$a;->c(Ljava/lang/Object;)V

    return-void
.end method
