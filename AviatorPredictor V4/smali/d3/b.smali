.class final Ld3/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lf3/c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ld3/b$a;
    }
.end annotation


# static fields
.field private static final h:Ljava/util/logging/Logger;


# instance fields
.field private final e:Ld3/b$a;

.field private final f:Lf3/c;

.field private final g:Ld3/i;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Ld3/h;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Ld3/b;->h:Ljava/util/logging/Logger;

    return-void
.end method

.method constructor <init>(Ld3/b$a;Lf3/c;)V
    .locals 3

    new-instance v0, Ld3/i;

    sget-object v1, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    const-class v2, Ld3/h;

    invoke-direct {v0, v1, v2}, Ld3/i;-><init>(Ljava/util/logging/Level;Ljava/lang/Class;)V

    invoke-direct {p0, p1, p2, v0}, Ld3/b;-><init>(Ld3/b$a;Lf3/c;Ld3/i;)V

    return-void
.end method

.method constructor <init>(Ld3/b$a;Lf3/c;Ld3/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "transportExceptionHandler"

    invoke-static {p1, v0}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/b$a;

    iput-object p1, p0, Ld3/b;->e:Ld3/b$a;

    const-string p1, "frameWriter"

    invoke-static {p2, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lf3/c;

    iput-object p1, p0, Ld3/b;->f:Lf3/c;

    const-string p1, "frameLogger"

    invoke-static {p3, p1}, Lq0/l;->o(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ld3/i;

    iput-object p1, p0, Ld3/b;->g:Ld3/i;

    return-void
.end method

.method static a(Ljava/lang/Throwable;)Ljava/util/logging/Level;
    .locals 1

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    const-class v0, Ljava/io/IOException;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    sget-object p0, Ljava/util/logging/Level;->FINE:Ljava/util/logging/Level;

    return-object p0

    :cond_0
    sget-object p0, Ljava/util/logging/Level;->INFO:Ljava/util/logging/Level;

    return-object p0
.end method


# virtual methods
.method public L()I
    .locals 1

    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0}, Lf3/c;->L()I

    move-result v0

    return v0
.end method

.method public O(ZZIILjava/util/List;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZII",
            "Ljava/util/List<",
            "Lf3/d;",
            ">;)V"
        }
    .end annotation

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    move v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move-object v5, p5

    invoke-interface/range {v0 .. v5}, Lf3/c;->O(ZZIILjava/util/List;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public P(Lf3/i;)V
    .locals 2

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-virtual {v0, v1, p1}, Ld3/i;->i(Ld3/i$a;Lf3/i;)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1}, Lf3/c;->P(Lf3/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {v0, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public a0()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0}, Lf3/c;->a0()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {v1, v0}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public c(ILf3/a;)V
    .locals 2

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-virtual {v0, v1, p1, p2}, Ld3/i;->h(Ld3/i$a;ILf3/a;)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1, p2}, Lf3/c;->c(ILf3/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public close()V
    .locals 4

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    sget-object v1, Ld3/b;->h:Ljava/util/logging/Logger;

    invoke-static {v0}, Ld3/b;->a(Ljava/lang/Throwable;)Ljava/util/logging/Level;

    move-result-object v2

    const-string v3, "Failed closing connection"

    invoke-virtual {v1, v2, v3, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public f(IJ)V
    .locals 2

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-virtual {v0, v1, p1, p2, p3}, Ld3/i;->k(Ld3/i$a;IJ)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1, p2, p3}, Lf3/c;->f(IJ)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public flush()V
    .locals 2

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0}, Lf3/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v0

    iget-object v1, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {v1, v0}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public g(ZII)V
    .locals 9

    const-wide v0, 0xffffffffL

    const/16 v2, 0x20

    iget-object v3, p0, Ld3/b;->g:Ld3/i;

    sget-object v4, Ld3/i$a;->f:Ld3/i$a;

    int-to-long v5, p2

    shl-long/2addr v5, v2

    int-to-long v7, p3

    and-long/2addr v0, v7

    or-long/2addr v0, v5

    if-eqz p1, :cond_0

    invoke-virtual {v3, v4, v0, v1}, Ld3/i;->f(Ld3/i$a;J)V

    goto :goto_0

    :cond_0
    invoke-virtual {v3, v4, v0, v1}, Ld3/i;->e(Ld3/i$a;J)V

    :goto_0
    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1, p2, p3}, Lf3/c;->g(ZII)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_1
    return-void
.end method

.method public h0(ZILh4/c;I)V
    .locals 6

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-virtual {p3}, Lh4/c;->a()Lh4/c;

    move-result-object v3

    move v2, p2

    move v4, p4

    move v5, p1

    invoke-virtual/range {v0 .. v5}, Ld3/i;->b(Ld3/i$a;ILh4/c;IZ)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1, p2, p3, p4}, Lf3/c;->h0(ZILh4/c;I)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public p(Lf3/i;)V
    .locals 2

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-virtual {v0, v1}, Ld3/i;->j(Ld3/i$a;)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1}, Lf3/c;->p(Lf3/i;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object v0, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {v0, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public q(ILf3/a;[B)V
    .locals 3

    iget-object v0, p0, Ld3/b;->g:Ld3/i;

    sget-object v1, Ld3/i$a;->f:Ld3/i$a;

    invoke-static {p3}, Lh4/f;->p([B)Lh4/f;

    move-result-object v2

    invoke-virtual {v0, v1, p1, p2, v2}, Ld3/i;->c(Ld3/i$a;ILf3/a;Lh4/f;)V

    :try_start_0
    iget-object v0, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {v0, p1, p2, p3}, Lf3/c;->q(ILf3/a;[B)V

    iget-object p1, p0, Ld3/b;->f:Lf3/c;

    invoke-interface {p1}, Lf3/c;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    iget-object p2, p0, Ld3/b;->e:Ld3/b$a;

    invoke-interface {p2, p1}, Ld3/b$a;->b(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
