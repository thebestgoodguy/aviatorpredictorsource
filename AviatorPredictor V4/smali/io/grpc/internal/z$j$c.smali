.class Lio/grpc/internal/z$j$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z$j;->a(Lb3/f1;Lb3/u0;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lb3/f1;

.field final synthetic f:Lb3/u0;

.field final synthetic g:Lio/grpc/internal/z$j;


# direct methods
.method constructor <init>(Lio/grpc/internal/z$j;Lb3/f1;Lb3/u0;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/z$j$c;->g:Lio/grpc/internal/z$j;

    iput-object p2, p0, Lio/grpc/internal/z$j$c;->e:Lb3/f1;

    iput-object p3, p0, Lio/grpc/internal/z$j$c;->f:Lb3/u0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$j$c;->g:Lio/grpc/internal/z$j;

    invoke-static {v0}, Lio/grpc/internal/z$j;->e(Lio/grpc/internal/z$j;)Lb3/g$a;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/z$j$c;->e:Lb3/f1;

    iget-object v2, p0, Lio/grpc/internal/z$j$c;->f:Lb3/u0;

    invoke-virtual {v0, v1, v2}, Lb3/g$a;->a(Lb3/f1;Lb3/u0;)V

    return-void
.end method
