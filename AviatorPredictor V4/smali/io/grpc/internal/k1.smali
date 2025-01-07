.class public Lio/grpc/internal/k1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/io/Closeable;
.implements Lio/grpc/internal/y;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/grpc/internal/k1$c;,
        Lio/grpc/internal/k1$d;,
        Lio/grpc/internal/k1$e;,
        Lio/grpc/internal/k1$b;
    }
.end annotation


# instance fields
.field private e:Lio/grpc/internal/k1$b;

.field private f:I

.field private final g:Lio/grpc/internal/h2;

.field private final h:Lio/grpc/internal/n2;

.field private i:Lb3/u;

.field private j:Lio/grpc/internal/r0;

.field private k:[B

.field private l:I

.field private m:Lio/grpc/internal/k1$e;

.field private n:I

.field private o:Z

.field private p:Lio/grpc/internal/u;

.field private q:Lio/grpc/internal/u;

.field private r:J

.field private s:Z

.field private t:I

.field private u:I

.field private v:Z

.field private volatile w:Z


# direct methods
.method public constructor <init>(Lio/grpc/internal/k1$b;Lb3/u;ILio/grpc/internal/h2;Lio/grpc/internal/n2;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lio/grpc/internal/k1$e;->e:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    const/4 v0, 0x5

    iput v0, p0, Lio/grpc/internal/k1;->n:I

    new-instance v0, Lio/grpc/internal/u;

    invoke-direct {v0}, Lio/grpc/internal/u;-><init>()V

    iput-object v0, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lio/grpc/internal/k1;->s:Z

    const/4 v1, -0x1

    iput v1, p0, Lio/grpc/internal/k1;->t:I

    iput-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    iput-boolean v0, p0, Lio/grpc/internal/k1;->w:Z

    const-string v0, "sink"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/k1$b;

    iput-object p1, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    const-string p1, "decompressor"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/u;

    iput-object p1, p0, Lio/grpc/internal/k1;->i:Lb3/u;

    iput p3, p0, Lio/grpc/internal/k1;->f:I

    const-string p1, "statsTraceCtx"

    invoke-static {p4, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/h2;

    iput-object p1, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    const-string p1, "transportTracer"

    invoke-static {p5, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/n2;

    iput-object p1, p0, Lio/grpc/internal/k1;->h:Lio/grpc/internal/n2;

    return-void
.end method

.method private C()Z
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    if-nez v1, :cond_0

    new-instance v1, Lio/grpc/internal/u;

    invoke-direct {v1}, Lio/grpc/internal/u;-><init>()V

    iput-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :cond_0
    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    :try_start_1
    iget v3, p0, Lio/grpc/internal/k1;->n:I

    iget-object v4, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->b()I

    move-result v4

    sub-int/2addr v3, v4

    if-lez v3, :cond_a

    iget-object v4, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v4, :cond_6

    :try_start_2
    iget-object v4, p0, Lio/grpc/internal/k1;->k:[B

    if-eqz v4, :cond_1

    iget v5, p0, Lio/grpc/internal/k1;->l:I

    array-length v4, v4

    if-ne v5, v4, :cond_2

    :cond_1
    const/high16 v4, 0x200000

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v4

    new-array v4, v4, [B

    iput-object v4, p0, Lio/grpc/internal/k1;->k:[B

    iput v0, p0, Lio/grpc/internal/k1;->l:I

    :cond_2
    iget-object v4, p0, Lio/grpc/internal/k1;->k:[B

    array-length v4, v4

    iget v5, p0, Lio/grpc/internal/k1;->l:I

    sub-int/2addr v4, v5

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    iget-object v4, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    iget-object v5, p0, Lio/grpc/internal/k1;->k:[B

    iget v6, p0, Lio/grpc/internal/k1;->l:I

    invoke-virtual {v4, v5, v6, v3}, Lio/grpc/internal/r0;->C([BII)I

    move-result v3

    iget-object v4, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    invoke-virtual {v4}, Lio/grpc/internal/r0;->s()I

    move-result v4

    add-int/2addr v1, v4

    iget-object v4, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    invoke-virtual {v4}, Lio/grpc/internal/r0;->t()I

    move-result v4
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/2addr v2, v4

    if-nez v3, :cond_5

    if-lez v1, :cond_4

    iget-object v3, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v1}, Lio/grpc/internal/k1$b;->d(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->f:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_4

    iget-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v3, :cond_3

    iget-object v1, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v1, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v1, v2

    iput v1, p0, Lio/grpc/internal/k1;->u:I

    goto :goto_1

    :cond_3
    iget-object v2, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/grpc/internal/k1;->u:I

    :cond_4
    :goto_1
    return v0

    :cond_5
    :try_start_3
    iget-object v4, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    iget-object v5, p0, Lio/grpc/internal/k1;->k:[B

    iget v6, p0, Lio/grpc/internal/k1;->l:I

    invoke-static {v5, v6, v3}, Lio/grpc/internal/v1;->f([BII)Lio/grpc/internal/u1;

    move-result-object v5

    invoke-virtual {v4, v5}, Lio/grpc/internal/u;->d(Lio/grpc/internal/u1;)V

    iget v4, p0, Lio/grpc/internal/k1;->l:I

    add-int/2addr v4, v3

    iput v4, p0, Lio/grpc/internal/k1;->l:I
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catch Ljava/util/zip/DataFormatException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto/16 :goto_0

    :catch_0
    move-exception v0

    :try_start_4
    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :catch_1
    move-exception v0

    new-instance v3, Ljava/lang/RuntimeException;

    invoke-direct {v3, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v3

    :cond_6
    iget-object v4, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->b()I

    move-result v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    if-nez v4, :cond_9

    if-lez v1, :cond_8

    iget-object v3, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v1}, Lio/grpc/internal/k1$b;->d(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->f:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_8

    iget-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v3, :cond_7

    iget-object v1, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v1, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v1, v2

    iput v1, p0, Lio/grpc/internal/k1;->u:I

    goto :goto_2

    :cond_7
    iget-object v2, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/grpc/internal/k1;->u:I

    :cond_8
    :goto_2
    return v0

    :cond_9
    :try_start_5
    iget-object v4, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    invoke-virtual {v4}, Lio/grpc/internal/u;->b()I

    move-result v4

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    add-int/2addr v1, v3

    iget-object v4, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    iget-object v5, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    invoke-virtual {v5, v3}, Lio/grpc/internal/u;->J(I)Lio/grpc/internal/u1;

    move-result-object v3

    invoke-virtual {v4, v3}, Lio/grpc/internal/u;->d(Lio/grpc/internal/u1;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto/16 :goto_0

    :cond_a
    const/4 v0, 0x1

    if-lez v1, :cond_c

    iget-object v3, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v1}, Lio/grpc/internal/k1$b;->d(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->f:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_c

    iget-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v3, :cond_b

    iget-object v1, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v1, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v1, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v1, v2

    iput v1, p0, Lio/grpc/internal/k1;->u:I

    goto :goto_3

    :cond_b
    iget-object v2, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v1

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v2, v1

    iput v2, p0, Lio/grpc/internal/k1;->u:I

    :cond_c
    :goto_3
    return v0

    :catchall_0
    move-exception v0

    move v7, v1

    move-object v1, v0

    move v0, v7

    goto :goto_4

    :catchall_1
    move-exception v1

    const/4 v2, 0x0

    :goto_4
    if-lez v0, :cond_e

    iget-object v3, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    invoke-interface {v3, v0}, Lio/grpc/internal/k1$b;->d(I)V

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    sget-object v4, Lio/grpc/internal/k1$e;->f:Lio/grpc/internal/k1$e;

    if-ne v3, v4, :cond_e

    iget-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v3, :cond_d

    iget-object v0, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v2

    invoke-virtual {v0, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v0, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v0, v2

    iput v0, p0, Lio/grpc/internal/k1;->u:I

    goto :goto_5

    :cond_d
    iget-object v2, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    int-to-long v3, v0

    invoke-virtual {v2, v3, v4}, Lio/grpc/internal/h2;->g(J)V

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    add-int/2addr v2, v0

    iput v2, p0, Lio/grpc/internal/k1;->u:I

    :cond_e
    :goto_5
    throw v1
.end method

.method private a()V
    .locals 7

    iget-boolean v0, p0, Lio/grpc/internal/k1;->s:Z

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->s:Z

    :goto_0
    const/4 v1, 0x0

    :try_start_0
    iget-boolean v2, p0, Lio/grpc/internal/k1;->w:Z

    if-nez v2, :cond_3

    iget-wide v2, p0, Lio/grpc/internal/k1;->r:J

    const-wide/16 v4, 0x0

    cmp-long v6, v2, v4

    if-lez v6, :cond_3

    invoke-direct {p0}, Lio/grpc/internal/k1;->C()Z

    move-result v2

    if-eqz v2, :cond_3

    sget-object v2, Lio/grpc/internal/k1$a;->a:[I

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v2, v2, v3

    if-eq v2, v0, :cond_2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_1

    invoke-direct {p0}, Lio/grpc/internal/k1;->v()V

    iget-wide v2, p0, Lio/grpc/internal/k1;->r:J

    const-wide/16 v4, 0x1

    sub-long/2addr v2, v4

    iput-wide v2, p0, Lio/grpc/internal/k1;->r:J

    goto :goto_0

    :cond_1
    new-instance v0, Ljava/lang/AssertionError;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Invalid state: "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    throw v0

    :cond_2
    invoke-direct {p0}, Lio/grpc/internal/k1;->y()V

    goto :goto_0

    :cond_3
    iget-boolean v0, p0, Lio/grpc/internal/k1;->w:Z

    if-eqz v0, :cond_4

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v1, p0, Lio/grpc/internal/k1;->s:Z

    return-void

    :cond_4
    :try_start_1
    iget-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    if-eqz v0, :cond_5

    invoke-direct {p0}, Lio/grpc/internal/k1;->t()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_5
    iput-boolean v1, p0, Lio/grpc/internal/k1;->s:Z

    return-void

    :catchall_0
    move-exception v0

    iput-boolean v1, p0, Lio/grpc/internal/k1;->s:Z

    throw v0
.end method

.method private l()Ljava/io/InputStream;
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/k1;->i:Lb3/u;

    sget-object v1, Lb3/l$b;->a:Lb3/l;

    if-eq v0, v1, :cond_0

    :try_start_0
    iget-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    const/4 v2, 0x1

    invoke-static {v1, v2}, Lio/grpc/internal/v1;->c(Lio/grpc/internal/u1;Z)Ljava/io/InputStream;

    move-result-object v1

    invoke-interface {v0, v1}, Lb3/u;->b(Ljava/io/InputStream;)Ljava/io/InputStream;

    move-result-object v0

    new-instance v1, Lio/grpc/internal/k1$d;

    iget v2, p0, Lio/grpc/internal/k1;->f:I

    iget-object v3, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    invoke-direct {v1, v0, v2, v3}, Lio/grpc/internal/k1$d;-><init>(Ljava/io/InputStream;ILio/grpc/internal/h2;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :catch_0
    move-exception v0

    new-instance v1, Ljava/lang/RuntimeException;

    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v1

    :cond_0
    sget-object v0, Lb3/f1;->t:Lb3/f1;

    const-string v1, "Can\'t decode compressed gRPC message as compression not configured"

    invoke-virtual {v0, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1;->d()Lb3/h1;

    move-result-object v0

    throw v0
.end method

.method private n()Ljava/io/InputStream;
    .locals 3

    iget-object v0, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    iget-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    invoke-virtual {v1}, Lio/grpc/internal/u;->b()I

    move-result v1

    int-to-long v1, v1

    invoke-virtual {v0, v1, v2}, Lio/grpc/internal/h2;->f(J)V

    iget-object v0, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lio/grpc/internal/v1;->c(Lio/grpc/internal/u1;Z)Ljava/io/InputStream;

    move-result-object v0

    return-object v0
.end method

.method private s()Z
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->r()Z

    move-result v0

    if-nez v0, :cond_1

    iget-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    return v0
.end method

.method private t()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/r0;->H()Z

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/u;->b()I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method private v()V
    .locals 6

    iget-object v0, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    iget v1, p0, Lio/grpc/internal/k1;->t:I

    iget v2, p0, Lio/grpc/internal/k1;->u:I

    int-to-long v2, v2

    const-wide/16 v4, -0x1

    invoke-virtual/range {v0 .. v5}, Lio/grpc/internal/h2;->e(IJJ)V

    const/4 v0, 0x0

    iput v0, p0, Lio/grpc/internal/k1;->u:I

    iget-boolean v0, p0, Lio/grpc/internal/k1;->o:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lio/grpc/internal/k1;->l()Ljava/io/InputStream;

    move-result-object v0

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->n()Ljava/io/InputStream;

    move-result-object v0

    :goto_0
    const/4 v1, 0x0

    iput-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    iget-object v2, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    new-instance v3, Lio/grpc/internal/k1$c;

    invoke-direct {v3, v0, v1}, Lio/grpc/internal/k1$c;-><init>(Ljava/io/InputStream;Lio/grpc/internal/k1$a;)V

    invoke-interface {v2, v3}, Lio/grpc/internal/k1$b;->a(Lio/grpc/internal/j2$a;)V

    sget-object v0, Lio/grpc/internal/k1$e;->e:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    const/4 v0, 0x5

    iput v0, p0, Lio/grpc/internal/k1;->n:I

    return-void
.end method

.method private y()V
    .locals 5

    iget-object v0, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/u;->N()I

    move-result v0

    and-int/lit16 v1, v0, 0xfe

    if-nez v1, :cond_2

    const/4 v1, 0x1

    and-int/2addr v0, v1

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    iput-boolean v0, p0, Lio/grpc/internal/k1;->o:Z

    iget-object v0, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    invoke-virtual {v0}, Lio/grpc/internal/c;->G()I

    move-result v0

    iput v0, p0, Lio/grpc/internal/k1;->n:I

    if-ltz v0, :cond_1

    iget v3, p0, Lio/grpc/internal/k1;->f:I

    if-gt v0, v3, :cond_1

    iget v0, p0, Lio/grpc/internal/k1;->t:I

    add-int/2addr v0, v1

    iput v0, p0, Lio/grpc/internal/k1;->t:I

    iget-object v1, p0, Lio/grpc/internal/k1;->g:Lio/grpc/internal/h2;

    invoke-virtual {v1, v0}, Lio/grpc/internal/h2;->d(I)V

    iget-object v0, p0, Lio/grpc/internal/k1;->h:Lio/grpc/internal/n2;

    invoke-virtual {v0}, Lio/grpc/internal/n2;->d()V

    sget-object v0, Lio/grpc/internal/k1$e;->f:Lio/grpc/internal/k1$e;

    iput-object v0, p0, Lio/grpc/internal/k1;->m:Lio/grpc/internal/k1$e;

    return-void

    :cond_1
    sget-object v0, Lb3/f1;->o:Lb3/f1;

    const/4 v3, 0x2

    new-array v3, v3, [Ljava/lang/Object;

    iget v4, p0, Lio/grpc/internal/k1;->f:I

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    aput-object v4, v3, v2

    iget v2, p0, Lio/grpc/internal/k1;->n:I

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    aput-object v2, v3, v1

    const-string v1, "gRPC message exceeds maximum size %d: %d"

    invoke-static {v1, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1;->d()Lb3/h1;

    move-result-object v0

    throw v0

    :cond_2
    sget-object v0, Lb3/f1;->t:Lb3/f1;

    const-string v1, "gRPC frame header malformed: reserved bits not zero"

    invoke-virtual {v0, v1}, Lb3/f1;->q(Ljava/lang/String;)Lb3/f1;

    move-result-object v0

    invoke-virtual {v0}, Lb3/f1;->d()Lb3/h1;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public F(Lio/grpc/internal/r0;)V
    .locals 4

    iget-object v0, p0, Lio/grpc/internal/k1;->i:Lb3/u;

    sget-object v1, Lb3/l$b;->a:Lb3/l;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "per-message decompressor already set"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    iget-object v0, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    const-string v0, "full stream decompressor already set"

    invoke-static {v2, v0}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "Can\'t pass a null full stream decompressor"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/r0;

    iput-object p1, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    const/4 p1, 0x0

    iput-object p1, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    return-void
.end method

.method H(Lio/grpc/internal/k1$b;)V
    .locals 0

    iput-object p1, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    return-void
.end method

.method K()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->w:Z

    return-void
.end method

.method public close()V
    .locals 5

    invoke-virtual {p0}, Lio/grpc/internal/k1;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lio/grpc/internal/u;->b()I

    move-result v0

    if-lez v0, :cond_1

    const/4 v0, 0x1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v4, :cond_4

    if-nez v0, :cond_3

    invoke-virtual {v4}, Lio/grpc/internal/r0;->v()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x0

    :cond_3
    :goto_1
    iget-object v0, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    invoke-virtual {v0}, Lio/grpc/internal/r0;->close()V

    move v0, v1

    :cond_4
    iget-object v1, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/grpc/internal/u;->close()V

    :cond_5
    iget-object v1, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/grpc/internal/u;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    iput-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    iput-object v3, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    iput-object v3, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    iget-object v1, p0, Lio/grpc/internal/k1;->e:Lio/grpc/internal/k1$b;

    invoke-interface {v1, v0}, Lio/grpc/internal/k1$b;->c(Z)V

    return-void

    :catchall_0
    move-exception v0

    iput-object v3, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    iput-object v3, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    iput-object v3, p0, Lio/grpc/internal/k1;->p:Lio/grpc/internal/u;

    throw v0
.end method

.method public d(I)V
    .locals 4

    if-lez p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "numMessages must be > 0"

    invoke-static {v0, v1}, Lq0/l;->e(ZLjava/lang/Object;)V

    invoke-virtual {p0}, Lio/grpc/internal/k1;->r()Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    :cond_1
    iget-wide v0, p0, Lio/grpc/internal/k1;->r:J

    int-to-long v2, p1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lio/grpc/internal/k1;->r:J

    invoke-direct {p0}, Lio/grpc/internal/k1;->a()V

    return-void
.end method

.method public e(I)V
    .locals 0

    iput p1, p0, Lio/grpc/internal/k1;->f:I

    return-void
.end method

.method public h()V
    .locals 1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->r()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->t()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/grpc/internal/k1;->close()V

    goto :goto_0

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lio/grpc/internal/k1;->v:Z

    :goto_0
    return-void
.end method

.method public i(Lb3/u;)V
    .locals 2

    iget-object v0, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "Already set full stream decompressor"

    invoke-static {v0, v1}, Lq0/l;->u(ZLjava/lang/Object;)V

    const-string v0, "Can\'t pass an empty decompressor"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lb3/u;

    iput-object p1, p0, Lio/grpc/internal/k1;->i:Lb3/u;

    return-void
.end method

.method public k(Lio/grpc/internal/u1;)V
    .locals 2

    const-string v0, "data"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0}, Lio/grpc/internal/k1;->s()Z

    move-result v1

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-eqz v1, :cond_0

    invoke-virtual {v1, p1}, Lio/grpc/internal/r0;->n(Lio/grpc/internal/u1;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    invoke-virtual {v1, p1}, Lio/grpc/internal/u;->d(Lio/grpc/internal/u1;)V

    :goto_0
    const/4 v0, 0x0

    invoke-direct {p0}, Lio/grpc/internal/k1;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    if-eqz v0, :cond_2

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    :cond_2
    return-void

    :catchall_0
    move-exception v1

    if-eqz v0, :cond_3

    invoke-interface {p1}, Lio/grpc/internal/u1;->close()V

    :cond_3
    throw v1
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Lio/grpc/internal/k1;->q:Lio/grpc/internal/u;

    if-nez v0, :cond_0

    iget-object v0, p0, Lio/grpc/internal/k1;->j:Lio/grpc/internal/r0;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method
