.class public final Lio/grpc/internal/t$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/grpc/internal/t;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Lb3/a;

.field private c:Ljava/lang/String;

.field private d:Lb3/b0;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "unknown-authority"

    iput-object v0, p0, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    sget-object v0, Lb3/a;->b:Lb3/a;

    iput-object v0, p0, Lio/grpc/internal/t$a;->b:Lb3/a;

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    return-object v0
.end method

.method public b()Lb3/a;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/t$a;->b:Lb3/a;

    return-object v0
.end method

.method public c()Lb3/b0;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/t$a;->d:Lb3/b0;

    return-object v0
.end method

.method public d()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/t$a;->c:Ljava/lang/String;

    return-object v0
.end method

.method public e(Ljava/lang/String;)Lio/grpc/internal/t$a;
    .locals 1

    const-string v0, "authority"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    instance-of v0, p1, Lio/grpc/internal/t$a;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, Lio/grpc/internal/t$a;

    iget-object v0, p0, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    iget-object v2, p1, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/t$a;->b:Lb3/a;

    iget-object v2, p1, Lio/grpc/internal/t$a;->b:Lb3/a;

    invoke-virtual {v0, v2}, Lb3/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/t$a;->c:Ljava/lang/String;

    iget-object v2, p1, Lio/grpc/internal/t$a;->c:Ljava/lang/String;

    invoke-static {v0, v2}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/grpc/internal/t$a;->d:Lb3/b0;

    iget-object p1, p1, Lio/grpc/internal/t$a;->d:Lb3/b0;

    invoke-static {v0, p1}, Lq0/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 v1, 0x1

    :cond_1
    return v1
.end method

.method public f(Lb3/a;)Lio/grpc/internal/t$a;
    .locals 1

    const-string v0, "eagAttributes"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lio/grpc/internal/t$a;->b:Lb3/a;

    return-object p0
.end method

.method public g(Lb3/b0;)Lio/grpc/internal/t$a;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/t$a;->d:Lb3/b0;

    return-object p0
.end method

.method public h(Ljava/lang/String;)Lio/grpc/internal/t$a;
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/t$a;->c:Ljava/lang/String;

    return-object p0
.end method

.method public hashCode()I
    .locals 3

    const/4 v0, 0x4

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lio/grpc/internal/t$a;->a:Ljava/lang/String;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/grpc/internal/t$a;->b:Lb3/a;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/grpc/internal/t$a;->c:Ljava/lang/String;

    const/4 v2, 0x2

    aput-object v1, v0, v2

    iget-object v1, p0, Lio/grpc/internal/t$a;->d:Lb3/b0;

    const/4 v2, 0x3

    aput-object v1, v0, v2

    invoke-static {v0}, Lq0/i;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
