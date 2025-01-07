.class Lio/grpc/internal/u$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lio/grpc/internal/u$f;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lio/grpc/internal/u$f<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Lio/grpc/internal/u1;ILjava/lang/Object;I)I
    .locals 0

    check-cast p3, Ljava/lang/Void;

    invoke-virtual {p0, p1, p2, p3, p4}, Lio/grpc/internal/u$a;->b(Lio/grpc/internal/u1;ILjava/lang/Void;I)I

    move-result p1

    return p1
.end method

.method public b(Lio/grpc/internal/u1;ILjava/lang/Void;I)I
    .locals 0

    invoke-interface {p1}, Lio/grpc/internal/u1;->N()I

    move-result p1

    return p1
.end method
