.class Ld3/a$a;
.super Ld3/a$d;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Ld3/a;->w(Lh4/c;J)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final f:Lj3/b;

.field final synthetic g:Ld3/a;


# direct methods
.method constructor <init>(Ld3/a;)V
    .locals 1

    iput-object p1, p0, Ld3/a$a;->g:Ld3/a;

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Ld3/a$d;-><init>(Ld3/a;Ld3/a$a;)V

    invoke-static {}, Lj3/c;->e()Lj3/b;

    move-result-object p1

    iput-object p1, p0, Ld3/a$a;->f:Lj3/b;

    return-void
.end method


# virtual methods
.method public a()V
    .locals 5

    const-string v0, "WriteRunnable.runWrite"

    invoke-static {v0}, Lj3/c;->f(Ljava/lang/String;)V

    iget-object v0, p0, Ld3/a$a;->f:Lj3/b;

    invoke-static {v0}, Lj3/c;->d(Lj3/b;)V

    new-instance v0, Lh4/c;

    invoke-direct {v0}, Lh4/c;-><init>()V

    :try_start_0
    iget-object v1, p0, Ld3/a$a;->g:Ld3/a;

    invoke-static {v1}, Ld3/a;->a(Ld3/a;)Ljava/lang/Object;

    move-result-object v1

    monitor-enter v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iget-object v2, p0, Ld3/a$a;->g:Ld3/a;

    invoke-static {v2}, Ld3/a;->d(Ld3/a;)Lh4/c;

    move-result-object v2

    iget-object v3, p0, Ld3/a$a;->g:Ld3/a;

    invoke-static {v3}, Ld3/a;->d(Ld3/a;)Lh4/c;

    move-result-object v3

    invoke-virtual {v3}, Lh4/c;->h()J

    move-result-wide v3

    invoke-virtual {v0, v2, v3, v4}, Lh4/c;->w(Lh4/c;J)V

    iget-object v2, p0, Ld3/a$a;->g:Ld3/a;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ld3/a;->e(Ld3/a;Z)Z

    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    iget-object v1, p0, Ld3/a$a;->g:Ld3/a;

    invoke-static {v1}, Ld3/a;->h(Ld3/a;)Lh4/m;

    move-result-object v1

    invoke-virtual {v0}, Lh4/c;->i0()J

    move-result-wide v2

    invoke-interface {v1, v0, v2, v3}, Lh4/m;->w(Lh4/c;J)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-string v0, "WriteRunnable.runWrite"

    invoke-static {v0}, Lj3/c;->h(Ljava/lang/String;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :try_start_4
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :catchall_1
    move-exception v0

    const-string v1, "WriteRunnable.runWrite"

    invoke-static {v1}, Lj3/c;->h(Ljava/lang/String;)V

    throw v0
.end method
