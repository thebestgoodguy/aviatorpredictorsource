.class public Lb3/h1;
.super Ljava/lang/RuntimeException;
.source ""


# instance fields
.field private final e:Lb3/f1;

.field private final f:Lb3/u0;

.field private final g:Z


# direct methods
.method public constructor <init>(Lb3/f1;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lb3/h1;-><init>(Lb3/f1;Lb3/u0;)V

    return-void
.end method

.method public constructor <init>(Lb3/f1;Lb3/u0;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, p1, p2, v0}, Lb3/h1;-><init>(Lb3/f1;Lb3/u0;Z)V

    return-void
.end method

.method constructor <init>(Lb3/f1;Lb3/u0;Z)V
    .locals 2

    invoke-static {p1}, Lb3/f1;->g(Lb3/f1;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lb3/f1;->l()Ljava/lang/Throwable;

    move-result-object v1

    invoke-direct {p0, v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    iput-object p1, p0, Lb3/h1;->e:Lb3/f1;

    iput-object p2, p0, Lb3/h1;->f:Lb3/u0;

    iput-boolean p3, p0, Lb3/h1;->g:Z

    invoke-virtual {p0}, Lb3/h1;->fillInStackTrace()Ljava/lang/Throwable;

    return-void
.end method


# virtual methods
.method public final a()Lb3/f1;
    .locals 1

    iget-object v0, p0, Lb3/h1;->e:Lb3/f1;

    return-object v0
.end method

.method public declared-synchronized fillInStackTrace()Ljava/lang/Throwable;
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lb3/h1;->g:Z

    if-eqz v0, :cond_0

    invoke-super {p0}, Ljava/lang/RuntimeException;->fillInStackTrace()Ljava/lang/Throwable;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :cond_0
    move-object v0, p0

    :goto_0
    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    monitor-exit p0

    throw v0
.end method
