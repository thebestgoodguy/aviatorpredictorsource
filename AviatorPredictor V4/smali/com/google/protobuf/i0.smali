.class public Lcom/google/protobuf/i0;
.super Ljava/lang/Object;
.source ""


# static fields
.field private static final e:Lcom/google/protobuf/r;


# instance fields
.field private a:Lcom/google/protobuf/j;

.field private b:Lcom/google/protobuf/r;

.field protected volatile c:Lcom/google/protobuf/v0;

.field private volatile d:Lcom/google/protobuf/j;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/protobuf/r;->b()Lcom/google/protobuf/r;

    move-result-object v0

    sput-object v0, Lcom/google/protobuf/i0;->e:Lcom/google/protobuf/r;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Lcom/google/protobuf/v0;)V
    .locals 3

    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    if-eqz v0, :cond_0

    return-void

    :cond_0
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    if-eqz v0, :cond_1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :cond_1
    :try_start_1
    iget-object v0, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    if-eqz v0, :cond_2

    invoke-interface {p1}, Lcom/google/protobuf/v0;->h()Lcom/google/protobuf/f1;

    move-result-object v0

    iget-object v1, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    iget-object v2, p0, Lcom/google/protobuf/i0;->b:Lcom/google/protobuf/r;

    invoke-interface {v0, v1, v2}, Lcom/google/protobuf/f1;->a(Lcom/google/protobuf/j;Lcom/google/protobuf/r;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/protobuf/v0;

    iput-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    iget-object v0, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    :goto_0
    iput-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    goto :goto_1

    :cond_2
    iput-object p1, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;
    :try_end_1
    .catch Lcom/google/protobuf/e0; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catch_0
    :try_start_2
    iput-object p1, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    sget-object p1, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    iput-object p1, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    :goto_1
    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public b()I
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    invoke-virtual {v0}, Lcom/google/protobuf/j;->size()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/google/protobuf/j;->size()I

    move-result v0

    return v0

    :cond_1
    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    invoke-interface {v0}, Lcom/google/protobuf/v0;->b()I

    move-result v0

    return v0

    :cond_2
    const/4 v0, 0x0

    return v0
.end method

.method public c(Lcom/google/protobuf/v0;)Lcom/google/protobuf/v0;
    .locals 0

    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->a(Lcom/google/protobuf/v0;)V

    iget-object p1, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    return-object p1
.end method

.method public d(Lcom/google/protobuf/v0;)Lcom/google/protobuf/v0;
    .locals 2

    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    const/4 v1, 0x0

    iput-object v1, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    iput-object v1, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    iput-object p1, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    return-object v0
.end method

.method public e()Lcom/google/protobuf/j;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    return-object v0

    :cond_0
    iget-object v0, p0, Lcom/google/protobuf/i0;->a:Lcom/google/protobuf/j;

    if-eqz v0, :cond_1

    return-object v0

    :cond_1
    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    monitor-exit p0

    return-object v0

    :cond_2
    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    if-nez v0, :cond_3

    sget-object v0, Lcom/google/protobuf/j;->f:Lcom/google/protobuf/j;

    :goto_0
    iput-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    goto :goto_1

    :cond_3
    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    invoke-interface {v0}, Lcom/google/protobuf/v0;->f()Lcom/google/protobuf/j;

    move-result-object v0

    goto :goto_0

    :goto_1
    iget-object v0, p0, Lcom/google/protobuf/i0;->d:Lcom/google/protobuf/j;

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    instance-of v0, p1, Lcom/google/protobuf/i0;

    if-nez v0, :cond_1

    const/4 p1, 0x0

    return p1

    :cond_1
    check-cast p1, Lcom/google/protobuf/i0;

    iget-object v0, p0, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    iget-object v1, p1, Lcom/google/protobuf/i0;->c:Lcom/google/protobuf/v0;

    if-nez v0, :cond_2

    if-nez v1, :cond_2

    invoke-virtual {p0}, Lcom/google/protobuf/i0;->e()Lcom/google/protobuf/j;

    move-result-object v0

    invoke-virtual {p1}, Lcom/google/protobuf/i0;->e()Lcom/google/protobuf/j;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/google/protobuf/j;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_2
    if-eqz v0, :cond_3

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_3
    if-eqz v0, :cond_4

    invoke-interface {v0}, Lcom/google/protobuf/w0;->d()Lcom/google/protobuf/v0;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/google/protobuf/i0;->c(Lcom/google/protobuf/v0;)Lcom/google/protobuf/v0;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_4
    invoke-interface {v1}, Lcom/google/protobuf/w0;->d()Lcom/google/protobuf/v0;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/protobuf/i0;->c(Lcom/google/protobuf/v0;)Lcom/google/protobuf/v0;

    move-result-object p1

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method
