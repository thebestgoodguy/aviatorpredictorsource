.class Lio/grpc/internal/y1$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/y1$r;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/y1;->b(Lb3/n;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = "d"
.end annotation


# instance fields
.field final synthetic a:Lb3/n;

.field final synthetic b:Lio/grpc/internal/y1;


# direct methods
.method constructor <init>(Lio/grpc/internal/y1;Lb3/n;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/y1$d;->b:Lio/grpc/internal/y1;

    iput-object p2, p0, Lio/grpc/internal/y1$d;->a:Lb3/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lio/grpc/internal/y1$b0;)V
    .locals 1

    iget-object p1, p1, Lio/grpc/internal/y1$b0;->a:Lio/grpc/internal/q;

    iget-object v0, p0, Lio/grpc/internal/y1$d;->a:Lb3/n;

    invoke-interface {p1, v0}, Lio/grpc/internal/i2;->b(Lb3/n;)V

    return-void
.end method
