.class final Lh4/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lh4/g;->d(Ljava/io/OutputStream;Lh4/o;)Lh4/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lh4/o;

.field final synthetic f:Ljava/io/OutputStream;


# direct methods
.method constructor <init>(Lh4/o;Ljava/io/OutputStream;)V
    .locals 0

    iput-object p1, p0, Lh4/g$a;->e:Lh4/o;

    iput-object p2, p0, Lh4/g$a;->f:Ljava/io/OutputStream;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 1

    iget-object v0, p0, Lh4/g$a;->f:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    return-void
.end method

.method public flush()V
    .locals 1

    iget-object v0, p0, Lh4/g$a;->f:Ljava/io/OutputStream;

    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "sink("

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lh4/g$a;->f:Ljava/io/OutputStream;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public w(Lh4/c;J)V
    .locals 6

    iget-wide v0, p1, Lh4/c;->f:J

    const-wide/16 v2, 0x0

    move-wide v4, p2

    invoke-static/range {v0 .. v5}, Lh4/p;->b(JJJ)V

    :cond_0
    :goto_0
    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget-object v0, p0, Lh4/g$a;->e:Lh4/o;

    invoke-virtual {v0}, Lh4/o;->c()V

    iget-object v0, p1, Lh4/c;->e:Lh4/j;

    iget v1, v0, Lh4/j;->c:I

    iget v2, v0, Lh4/j;->b:I

    sub-int/2addr v1, v2

    int-to-long v1, v1

    invoke-static {p2, p3, v1, v2}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v1

    long-to-int v2, v1

    iget-object v1, p0, Lh4/g$a;->f:Ljava/io/OutputStream;

    iget-object v3, v0, Lh4/j;->a:[B

    iget v4, v0, Lh4/j;->b:I

    invoke-virtual {v1, v3, v4, v2}, Ljava/io/OutputStream;->write([BII)V

    iget v1, v0, Lh4/j;->b:I

    add-int/2addr v1, v2

    iput v1, v0, Lh4/j;->b:I

    int-to-long v2, v2

    sub-long/2addr p2, v2

    iget-wide v4, p1, Lh4/c;->f:J

    sub-long/2addr v4, v2

    iput-wide v4, p1, Lh4/c;->f:J

    iget v2, v0, Lh4/j;->c:I

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Lh4/j;->b()Lh4/j;

    move-result-object v1

    iput-object v1, p1, Lh4/c;->e:Lh4/j;

    invoke-static {v0}, Lh4/k;->a(Lh4/j;)V

    goto :goto_0

    :cond_1
    return-void
.end method
