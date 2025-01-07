.class final Lio/grpc/internal/f1$e;
.super Lb3/n0$i;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/grpc/internal/f1;->J0(Ljava/lang/Throwable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "e"
.end annotation


# instance fields
.field private final a:Lb3/n0$e;

.field final synthetic b:Ljava/lang/Throwable;

.field final synthetic c:Lio/grpc/internal/f1;


# direct methods
.method constructor <init>(Lio/grpc/internal/f1;Ljava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/grpc/internal/f1$e;->c:Lio/grpc/internal/f1;

    iput-object p2, p0, Lio/grpc/internal/f1$e;->b:Ljava/lang/Throwable;

    invoke-direct {p0}, Lb3/n0$i;-><init>()V

    sget-object p1, Lb3/f1;->t:Lb3/f1;

    const-string v0, "Panic! This is a bug!"

    invoke-virtual {p1, v0}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object p1

    invoke-virtual {p1, p2}, Lb3/f1;->p(Ljava/lang/Throwable;)Lb3/f1;

    move-result-object p1

    invoke-static {p1}, Lb3/n0$e;->e(Lb3/f1;)Lb3/n0$e;

    move-result-object p1

    iput-object p1, p0, Lio/grpc/internal/f1$e;->a:Lb3/n0$e;

    return-void
.end method


# virtual methods
.method public a(Lb3/n0$f;)Lb3/n0$e;
    .locals 0

    iget-object p1, p0, Lio/grpc/internal/f1$e;->a:Lb3/n0$e;

    return-object p1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    const-class v0, Lio/grpc/internal/f1$e;

    invoke-static {v0}, Lq0/h;->b(Ljava/lang/Class;)Lq0/h$b;

    move-result-object v0

    iget-object v1, p0, Lio/grpc/internal/f1$e;->a:Lb3/n0$e;

    const-string v2, "panicPickResult"

    invoke-virtual {v0, v2, v1}, Lq0/h$b;->d(Ljava/lang/String;Ljava/lang/Object;)Lq0/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lq0/h$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
