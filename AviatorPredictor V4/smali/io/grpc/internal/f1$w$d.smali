.class Lio/grpc/internal/f1$w$d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1$w;->h(Lb3/v0;Lb3/c;)Lb3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lio/grpc/internal/f1$w;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1$w;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/f1$w$d;->e:Lio/grpc/internal/f1$w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/f1$w$d;->e:Lio/grpc/internal/f1$w;

    iget-object v0, v0, Lio/grpc/internal/f1$w;->d:Lio/grpc/internal/f1;

    invoke-virtual {v0}, Lio/grpc/internal/f1;->D0()V

    return-void
.end method
