.class Lio/grpc/internal/z$c;
.super Lio/grpc/internal/x;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/z;->l()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "c"
.end annotation


# instance fields
.field final synthetic f:Lio/grpc/internal/z$j;

.field final synthetic g:Lio/grpc/internal/z;


# direct methods
.method constructor <init>(Lio/grpc/internal/z;Lio/grpc/internal/z$j;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/z$c;->g:Lio/grpc/internal/z;

    iput-object p2, p0, Lio/grpc/internal/z$c;->f:Lio/grpc/internal/z$j;

    invoke-static {p1}, Lio/grpc/internal/z;->h(Lio/grpc/internal/z;)Lb3/r;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/grpc/internal/x;-><init>(Lb3/r;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/z$c;->f:Lio/grpc/internal/z$j;

    invoke-virtual {v0}, Lio/grpc/internal/z$j;->g()V

    return-void
.end method
