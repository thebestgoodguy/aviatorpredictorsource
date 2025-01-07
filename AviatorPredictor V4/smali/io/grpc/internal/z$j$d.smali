.class Lio/grpc/internal/z$j$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z$j;->d()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/z$j;


# direct methods
.method constructor <init>(Lio/grpc/internal/z$j;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$j$d;->e:Lio/grpc/internal/z$j;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/z$j$d;->e:Lio/grpc/internal/z$j;

    invoke-static {v0}, Lio/grpc/internal/z$j;->e(Lio/grpc/internal/z$j;)Lb3/g$a;

    move-result-object v0

    invoke-virtual {v0}, Lb3/g$a;->d()V

    return-void
.end method
