.class final Lio/grpc/internal/q1$c;
.super Lb3/n0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/q1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "c"
.end annotation


# instance fields
.field private final a:Lb3/n0$e;


# direct methods
.method constructor <init>(Lb3/n0$e;)V
    .locals 1

    invoke-direct {p0}, Lb3/n0$i;-><init>()V

    const-string v0, "result"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/n0$e;

    iput-object p1, p0, Lio/grpc/internal/q1$c;->a:Lb3/n0$e;

    return-void
.end method


# virtual methods
.method public a(Lb3/n0$f;)Lb3/n0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/q1$c;->a:Lb3/n0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/q1$c;

    invoke-static {v0}, Lq0/h;->b(Ljava/lang/Class;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/q1$c;->a:Lb3/n0$e;

    const-string v2, "result"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
