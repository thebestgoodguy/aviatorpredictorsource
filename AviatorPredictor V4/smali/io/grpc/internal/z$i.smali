.class final Lio/grpc/internal/z$i;
.super Lio/grpc/internal/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x12
    name = "i"
.end annotation


# instance fields
.field final f:Lb3/g$a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lb3/g$a<",
            "TRespT;>;"
        }
    .end annotation
.end field

.field final g:Lb3/f1;

.field final synthetic h:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Lb3/g$a;Lb3/f1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb3/g$a<",
            "TRespT;>;",
            "Lb3/f1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/z$i;->h:Lio/grpc/internal/z;

    invoke-static {p1}, Lio/grpc/internal/z;->h(Lio/grpc/internal/z;)Lb3/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lb3/r;)V

    iput-object p2, p0, Lio/grpc/internal/z$i;->f:Lb3/g$a;

    iput-object p3, p0, Lio/grpc/internal/z$i;->g:Lb3/f1;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/z$i;->f:Lb3/g$a;

    iget-object v1, p0, Lio/grpc/internal/z$i;->g:Lb3/f1;

    new-instance v2, Lb3/u0;

    invoke-direct {v2}, Lb3/u0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lb3/g$a;->a(Lb3/f1;Lb3/u0;)V

    return-void
.end method
