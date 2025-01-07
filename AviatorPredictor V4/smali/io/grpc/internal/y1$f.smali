.class Lio/grpc/internal/y1$f;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/y1$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1;->k(Lb3/v;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "f"
.end annotation


# instance fields
.field final synthetic a:Lb3/v;

.field final synthetic b:Lio/grpc/internal/y1;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1;Lb3/v;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/y1$f;->b:Lio/grpc/internal/y1;

    iput-object p2, p0, Lio/grpc/internal/y1$f;->a:Lb3/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/grpc/internal/y1$b0;)V
    .locals 1

    iget-object p1, p1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    iget-object v0, p0, Lio/grpc/internal/y1$f;->a:Lb3/v;

    invoke-interface {p1, v0}, Lio/grpc/internal/q;->k(Lb3/v;)V

    return-void
.end method
