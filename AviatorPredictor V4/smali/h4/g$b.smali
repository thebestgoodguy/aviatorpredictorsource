.class final Lh4/g$b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/g;->f(Ljava/io/InputStream;Lh4/o;)Lh4/n;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lh4/o;

.field final synthetic f:Ljava/io/InputStream;


# direct methods
.method constructor <init>(Lh4/o;Ljava/io/InputStream;)V
    .locals 0

    iput-object p1, p0, Lh4/g$b;->e:Lh4/o;

    iput-object p2, p0, Lh4/g$b;->f:Ljava/io/InputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lh4/g$b;->f:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    return-void
.end method

.method public o(Lh4/c;J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-ltz v2, :cond_4

    if-nez v2, :cond_0

    return-wide v0

    :cond_0
    :try_start_0
    iget-object v0, p0, Lh4/g$b;->e:Lh4/o;

    invoke-virtual {v0}, Lh4/o;->c()V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lh4/c;->l0(I)Lh4/j;

    move-result-object v0

    iget v1, v0, Lh4/j;->c:I

    rsub-int v1, v1, 0x2000

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    long-to-int p3, p2

    iget-object p2, p0, Lh4/g$b;->f:Ljava/io/InputStream;

    iget-object v1, v0, Lh4/j;->a:[B

    iget v2, v0, Lh4/j;->c:I

    invoke-virtual {p2, v1, v2, p3}, Ljava/io/InputStream;->read([BII)I

    move-result p2

    const/4 p3, -0x1

    if-ne p2, p3, :cond_2

    iget p2, v0, Lh4/j;->b:I

    iget p3, v0, Lh4/j;->c:I

    if-ne p2, p3, :cond_1

    invoke-virtual {v0}, Lh4/j;->b()Lh4/j;

    move-result-object p2

    iput-object p2, p1, Lh4/c;->e:Lh4/j;

    invoke-static {v0}, Lh4/k;->a(Lh4/j;)V

    :cond_1
    const-wide/16 p1, -0x1

    return-wide p1

    :cond_2
    iget p3, v0, Lh4/j;->c:I

    add-int/2addr p3, p2

    iput p3, v0, Lh4/j;->c:I

    iget-wide v0, p1, Lh4/c;->f:J

    int-to-long p2, p2

    add-long/2addr v0, p2

    iput-wide v0, p1, Lh4/c;->f:J
    :try_end_0
    .catch Ljava/lang/AssertionError; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p2

    :catch_0
    move-exception p1

    invoke-static {p1}, Lh4/g;->c(Ljava/lang/AssertionError;)Z

    move-result p2

    if-eqz p2, :cond_3

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_3
    throw p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "byteCount < 0: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2, p3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "source("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh4/g$b;->f:Ljava/io/InputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
