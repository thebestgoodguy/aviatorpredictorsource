.class final Lio/grpc/internal/f1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/m$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;-><init>(Lio/grpc/internal/g1;Lio/grpc/internal/t;Lio/grpc/internal/k$a;Lio/grpc/internal/o1;Lq0/p;Ljava/util/List;Lio/grpc/internal/k2;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "c"
.end annotation


# instance fields
.field final synthetic a:Lio/grpc/internal/k2;

.field final synthetic b:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Lio/grpc/internal/k2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$c;->b:Lio/grpc/internal/f1;

    iput-object p2, p0, Lio/grpc/internal/f1$c;->a:Lio/grpc/internal/k2;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lio/grpc/internal/m;
    .locals 2

    new-instance v0, Lio/grpc/internal/m;

    iget-object v1, p0, Lio/grpc/internal/f1$c;->a:Lio/grpc/internal/k2;

    invoke-direct {v0, v1}, Lio/grpc/internal/m;-><init>(Lio/grpc/internal/k2;)V

    return-object v0
.end method
