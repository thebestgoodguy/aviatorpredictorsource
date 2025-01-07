.class final Lf3/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lh4/n;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf3/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "a"
.end annotation


# instance fields
.field private final e:Lh4/e;

.field f:I

.field g:B

.field h:I

.field i:I

.field j:S


# direct methods
.method public constructor <init>(Lh4/e;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf3/g$a;->e:Lh4/e;

    return-void
.end method

.method private a()V
    .locals 7

    iget v0, p0, Lf3/g$a;->h:I

    iget-object v1, p0, Lf3/g$a;->e:Lh4/e;

    invoke-static {v1}, Lf3/g;->f(Lh4/e;)I

    move-result v1

    iput v1, p0, Lf3/g$a;->i:I

    iput v1, p0, Lf3/g$a;->f:I

    iget-object v1, p0, Lf3/g$a;->e:Lh4/e;

    invoke-interface {v1}, Lh4/e;->g0()B

    move-result v1

    and-int/lit16 v1, v1, 0xff

    int-to-byte v1, v1

    iget-object v2, p0, Lf3/g$a;->e:Lh4/e;

    invoke-interface {v2}, Lh4/e;->g0()B

    move-result v2

    and-int/lit16 v2, v2, 0xff

    int-to-byte v2, v2

    iput-byte v2, p0, Lf3/g$a;->g:B

    invoke-static {}, Lf3/g;->d()Ljava/util/logging/Logger;

    move-result-object v2

    sget-object v3, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    invoke-virtual {v2, v3}, Ljava/util/logging/Logger;->isLoggable(Ljava/util/logging/Level;)Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_0

    invoke-static {}, Lf3/g;->d()Ljava/util/logging/Logger;

    move-result-object v2

    iget v4, p0, Lf3/g$a;->h:I

    iget v5, p0, Lf3/g$a;->f:I

    iget-byte v6, p0, Lf3/g$a;->g:B

    invoke-static {v3, v4, v5, v1, v6}, Lf3/g$b;->b(ZIIBB)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/util/logging/Logger;->fine(Ljava/lang/String;)V

    :cond_0
    iget-object v2, p0, Lf3/g$a;->e:Lh4/e;

    invoke-interface {v2}, Lh4/e;->G()I

    move-result v2

    const v4, 0x7fffffff

    and-int/2addr v2, v4

    iput v2, p0, Lf3/g$a;->h:I

    const/16 v4, 0x9

    const/4 v5, 0x0

    if-ne v1, v4, :cond_2

    if-ne v2, v0, :cond_1

    return-void

    :cond_1
    new-array v0, v5, [Ljava/lang/Object;

    const-string v1, "TYPE_CONTINUATION streamId changed"

    invoke-static {v1, v0}, Lf3/g;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0

    :cond_2
    new-array v0, v3, [Ljava/lang/Object;

    invoke-static {v1}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    move-result-object v1

    aput-object v1, v0, v5

    const-string v1, "%s != TYPE_CONTINUATION"

    invoke-static {v1, v0}, Lf3/g;->e(Ljava/lang/String;[Ljava/lang/Object;)Ljava/io/IOException;

    move-result-object v0

    throw v0
.end method


# virtual methods
.method public close()V
    .locals 0

    return-void
.end method

.method public o(Lh4/c;J)J
    .locals 6

    :goto_0
    iget v0, p0, Lf3/g$a;->i:I

    const-wide/16 v1, -0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lf3/g$a;->e:Lh4/e;

    iget-short v3, p0, Lf3/g$a;->j:S

    int-to-long v3, v3

    invoke-interface {v0, v3, v4}, Lh4/e;->A(J)V

    const/4 v0, 0x0

    iput-short v0, p0, Lf3/g$a;->j:S

    iget-byte v0, p0, Lf3/g$a;->g:B

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    return-wide v1

    :cond_0
    invoke-direct {p0}, Lf3/g$a;->a()V

    goto :goto_0

    :cond_1
    iget-object v3, p0, Lf3/g$a;->e:Lh4/e;

    int-to-long v4, v0

    invoke-static {p2, p3, v4, v5}, Ljava/lang/Math;->min(JJ)J

    move-result-wide p2

    invoke-interface {v3, p1, p2, p3}, Lh4/n;->o(Lh4/c;J)J

    move-result-wide p1

    cmp-long p3, p1, v1

    if-nez p3, :cond_2

    return-wide v1

    :cond_2
    iget p3, p0, Lf3/g$a;->i:I

    long-to-int v0, p1

    sub-int/2addr p3, v0

    iput p3, p0, Lf3/g$a;->i:I

    return-wide p1
.end method
