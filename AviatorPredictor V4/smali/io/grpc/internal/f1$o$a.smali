.class Lio/grpc/internal/f1$o$a;
.super Lio/grpc/internal/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$o;->h(Lb3/g$a;Lb3/f1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "a"
.end annotation


# instance fields
.field final synthetic f:Lb3/g$a;

.field final synthetic g:Lb3/f1;

.field final synthetic h:Lio/grpc/internal/f1$o;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$o;Lb3/g$a;Lb3/f1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$o$a;->h:Lio/grpc/internal/f1$o;

    iput-object p2, p0, Lio/grpc/internal/f1$o$a;->f:Lb3/g$a;

    iput-object p3, p0, Lio/grpc/internal/f1$o$a;->g:Lb3/f1;

    invoke-static {p1}, Lio/grpc/internal/f1$o;->g(Lio/grpc/internal/f1$o;)Lb3/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lb3/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/f1$o$a;->f:Lb3/g$a;

    iget-object v1, p0, Lio/grpc/internal/f1$o$a;->g:Lb3/f1;

    new-instance v2, Lb3/u0;

    invoke-direct {v2}, Lb3/u0;-><init>()V

    invoke-virtual {v0, v1, v2}, Lb3/g$a;->a(Lb3/f1;Lb3/u0;)V

    return-void
.end method
