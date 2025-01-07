.class final Lh4/h;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/d;


# instance fields
.field public final e:Lh4/c;

.field public final f:Lh4/m;

.field g:Z


# direct methods
.method constructor <init>(Lh4/m;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    iput-object v0, p0, Lh4/h;->e:Lh4/c;

    const-string v0, "sink == null"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lh4/h;->f:Lh4/m;

    return-void
.end method


# virtual methods
.method public E(I)Lh4/d;
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->s0(I)Lh4/c;

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public I(I)Lh4/d;
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->r0(I)Lh4/c;

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public U(Ljava/lang/String;)Lh4/d;
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->u0(Ljava/lang/String;)Lh4/c;

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public Z(I)Lh4/d;
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->p0(I)Lh4/c;

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public a()Lh4/d;
    .locals 5

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0}, Lh4/c;->h()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-lez v4, :cond_0

    iget-object v2, p0, Lh4/h;->f:Lh4/m;

    iget-object v3, p0, Lh4/h;->e:Lh4/c;

    invoke-interface {v2, v3, v0, v1}, Lh4/m;->w(Lh4/c;J)V

    :cond_0
    return-object p0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public close()V
    .locals 7

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lh4/h;->e:Lh4/c;

    iget-wide v2, v1, Lh4/c;->f:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_1

    iget-object v4, p0, Lh4/h;->f:Lh4/m;

    invoke-interface {v4, v1, v2, v3}, Lh4/m;->w(Lh4/c;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    :cond_1
    :goto_0
    :try_start_1
    iget-object v1, p0, Lh4/h;->f:Lh4/m;

    invoke-interface {v1}, Lh4/m;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    if-nez v0, :cond_2

    move-object v0, v1

    :cond_2
    :goto_1
    const/4 v1, 0x1

    iput-boolean v1, p0, Lh4/h;->g:Z

    if-eqz v0, :cond_3

    invoke-static {v0}, Lh4/p;->c(Ljava/lang/Throwable;)V

    :cond_3
    return-void
.end method

.method public flush()V
    .locals 6

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_1

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    iget-wide v1, v0, Lh4/c;->f:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-lez v5, :cond_0

    iget-object v3, p0, Lh4/h;->f:Lh4/m;

    invoke-interface {v3, v0, v1, v2}, Lh4/m;->w(Lh4/c;J)V

    :cond_0
    iget-object v0, p0, Lh4/h;->f:Lh4/m;

    invoke-interface {v0}, Lh4/m;->flush()V

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "closed"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public isOpen()Z
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public j([B)Lh4/d;
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->n0([B)Lh4/c;

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    move-result-object p1

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "buffer("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh4/h;->f:Lh4/m;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(Lh4/c;J)V
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1, p2, p3}, Lh4/c;->w(Lh4/c;J)V

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "closed"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public write(Ljava/nio/ByteBuffer;)I
    .locals 1

    iget-boolean v0, p0, Lh4/h;->g:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lh4/h;->e:Lh4/c;

    invoke-virtual {v0, p1}, Lh4/c;->write(Ljava/nio/ByteBuffer;)I

    move-result p1

    invoke-virtual {p0}, Lh4/h;->a()Lh4/d;

    return p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
